package typingsSlinky.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON对象，地址信息
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
  */
@js.native
trait PlusGeolocationAddress extends StObject {
  
  /**
    * 城市名称
    * 如“北京市”，如果无法获取此信息则返回undefined。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var city: js.UndefOr[String] = js.native
  
  /**
    * 城市代码
    * 如“010”，如果无法获取此信息则返回undefined。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var cityCode: js.UndefOr[String] = js.native
  
  /**
    * 国家
    * 如“中国”，如果无法获取此信息则返回undefined。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var country: js.UndefOr[String] = js.native
  
  /**
    * 区（县）名称
    * 如“朝阳区”，如果无法获取此信息则返回undefined。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var district: js.UndefOr[String] = js.native
  
  /**
    * POI信息
    * 如“电子城．国际电子总部”，如果无法获取此信息则返回undefined。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var poiName: js.UndefOr[String] = js.native
  
  /**
    * 邮政编码
    * 如“100016”，如果无法获取此信息则返回undefined。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var postalCode: js.UndefOr[String] = js.native
  
  /**
    * 省份名称
    * 如“北京市”，如果无法获取此信息则返回undefined。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var province: js.UndefOr[String] = js.native
  
  /**
    * 街道信息
    * 如“酒仙桥路”，如果无法获取此信息则返回undefined。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var street: js.UndefOr[String] = js.native
  
  /**
    * 获取街道门牌号信息
    * 如“3号”，如果无法获取此信息则返回undefined。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var streetNum: js.UndefOr[String] = js.native
}
object PlusGeolocationAddress {
  
  @scala.inline
  def apply(): PlusGeolocationAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusGeolocationAddress]
  }
  
  @scala.inline
  implicit class PlusGeolocationAddressMutableBuilder[Self <: PlusGeolocationAddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCityCode(value: String): Self = StObject.set(x, "cityCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCityCodeUndefined: Self = StObject.set(x, "cityCode", js.undefined)
    
    @scala.inline
    def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    @scala.inline
    def setDistrict(value: String): Self = StObject.set(x, "district", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistrictUndefined: Self = StObject.set(x, "district", js.undefined)
    
    @scala.inline
    def setPoiName(value: String): Self = StObject.set(x, "poiName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoiNameUndefined: Self = StObject.set(x, "poiName", js.undefined)
    
    @scala.inline
    def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
    
    @scala.inline
    def setProvince(value: String): Self = StObject.set(x, "province", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvinceUndefined: Self = StObject.set(x, "province", js.undefined)
    
    @scala.inline
    def setStreet(value: String): Self = StObject.set(x, "street", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreetNum(value: String): Self = StObject.set(x, "streetNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreetNumUndefined: Self = StObject.set(x, "streetNum", js.undefined)
    
    @scala.inline
    def setStreetUndefined: Self = StObject.set(x, "street", js.undefined)
  }
}
