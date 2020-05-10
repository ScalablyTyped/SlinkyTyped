package typingsSlinky.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，设备位置信息数据
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
  */
@js.native
trait PlusGeolocationPosition extends js.Object {
  /**
    * 获取到地理位置对应的地址信息
    * 获取地址信息需要连接到服务器进行解析，所以会消耗更多的资源，如果不需要获取地址信息可通过设置PositionOptions参数的geocode属性值为false避免获取地址信息。
    * 	如果没有获取到地址信息则返回undefined。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var address: js.UndefOr[PlusGeolocationAddress] = js.native
  /**
    * 获取完整地址描述信息
    * 如果没有获取到地址信息则返回undefined。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var addresses: js.UndefOr[String] = js.native
  /**
    * 地理坐标信息，包括经纬度、海拔、速度等信息
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var coords: js.UndefOr[PlusGeolocationCoordinates] = js.native
  /**
    * 获取到地理坐标信息的坐标系类型
    * 可取以下坐标系类型：
    * 	"gps"：表示WGS-84坐标系；
    * 	"gcj02"：表示国测局经纬度坐标系；
    * 	"bd09"：表示百度墨卡托坐标系；
    * 	"bd09ll"：表示百度经纬度坐标系。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var coordsType: js.UndefOr[String] = js.native
  /**
    * 获取到地理坐标的时间戳信息
    * 时间戳值为从1970年1月1日至今的毫秒数。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var timestamp: js.UndefOr[Double] = js.native
}

object PlusGeolocationPosition {
  @scala.inline
  def apply(): PlusGeolocationPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusGeolocationPosition]
  }
  @scala.inline
  implicit class PlusGeolocationPositionOps[Self <: PlusGeolocationPosition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: PlusGeolocationAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(js.undefined)
        ret
    }
    @scala.inline
    def withAddresses(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addresses")(js.undefined)
        ret
    }
    @scala.inline
    def withCoords(value: PlusGeolocationCoordinates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coords")(js.undefined)
        ret
    }
    @scala.inline
    def withCoordsType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordsType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoordsType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordsType")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(js.undefined)
        ret
    }
  }
  
}

