package typingsSlinky.html5plus

import typingsSlinky.html5plus.html5plusStrings.amap
import typingsSlinky.html5plus.html5plusStrings.baidu
import typingsSlinky.html5plus.html5plusStrings.system
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON对象，监听设备位置信息参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
  */
@js.native
trait PlusGeolocationPositionOptions extends js.Object {
  
  /**
    * 指定获取的定位数据坐标系类型
    * 可取以下坐标系类型：
    *     "wgs84"：表示WGS-84坐标系；
    *     "gcj02"：表示国测局经纬度坐标系；
    *     "bd09"：表示百度墨卡托坐标系；
    *     "bd09ll"：表示百度经纬度坐标系；
    *     provider为"system"时，默认使用"wgs84"坐标系；provider为"baidu"时，默认使用"gcj02"坐标系；provider为"amap"时，默认使用"gcj02"坐标系。
    *     如果设置的坐标系类型provider不支持，则返回错误。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var coordsType: js.UndefOr[String] = js.native
  
  /**
    * 是否高精确度获取位置信息
    * 高精度获取表示需要使用更多的系统资源，默认值为false。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var enableHighAccuracy: js.UndefOr[Boolean] = js.native
  
  /**
    * 是否解析地址信息
    * 解析的地址信息保存到Position对象的address、addresses属性中，true表示解析地址信息，false表示不解析地址信息，返回的Position对象的address、addresses属性值为undefined，默认值为true。
    *     如果解析地址信息失败则返回的Position对象的address、addresses属性值为null。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var geocode: js.UndefOr[Boolean] = js.native
  
  /**
    * 获取位置信息的间隔时间
    * 单位为毫秒（ms），默认值为5000（即5秒）。调用plus.geolocation.watchPosition时为更新位置信息的间隔时间。
    *     注意：在不同定位模块下支持范围值可能不同，如百度定位模块的间隔范围为大于等于1秒，如果设置的值小于最小值则使用最小值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var maximumAge: js.UndefOr[Double] = js.native
  
  /**
    * 优先使用的定位模块
    * 可取以下供应者：
    *     "system"：表示系统定位模块，支持wgs84坐标系；
    *     "baidu"：表示百度定位模块，支持gcj02/bd09/bd09ll坐标系；
    *     "amap"：表示高德定位模板，支持gcj02坐标系。
    *     默认值按以下优先顺序获取（amap&gt;baidu&gt;system），若指定的provider不存在或无效则返回错误回调。
    *     注意：百度/高德定位模块需要配置百度/高德地图相关参数才能正常使用。
    * - system: 优先使用系统定位模块
    * - baidu: 优先使用百度定位模块
    * - amap: 优先使用高德定位模块
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var provider: js.UndefOr[system | baidu | amap] = js.native
  
  /**
    * 获取位置信息的超时时间
    * 单位为毫秒（ms），默认值为不超时。如果在指定的时间内没有获取到位置信息则触发错误回调函数。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var timeout: js.UndefOr[Double] = js.native
}
object PlusGeolocationPositionOptions {
  
  @scala.inline
  def apply(): PlusGeolocationPositionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusGeolocationPositionOptions]
  }
  
  @scala.inline
  implicit class PlusGeolocationPositionOptionsOps[Self <: PlusGeolocationPositionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCoordsType(value: String): Self = this.set("coordsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoordsType: Self = this.set("coordsType", js.undefined)
    
    @scala.inline
    def setEnableHighAccuracy(value: Boolean): Self = this.set("enableHighAccuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableHighAccuracy: Self = this.set("enableHighAccuracy", js.undefined)
    
    @scala.inline
    def setGeocode(value: Boolean): Self = this.set("geocode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeocode: Self = this.set("geocode", js.undefined)
    
    @scala.inline
    def setMaximumAge(value: Double): Self = this.set("maximumAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumAge: Self = this.set("maximumAge", js.undefined)
    
    @scala.inline
    def setProvider(value: system | baidu | amap): Self = this.set("provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvider: Self = this.set("provider", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
