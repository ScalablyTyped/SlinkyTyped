package typingsSlinky.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Poi extends StObject {
  
  var adcode: String = js.native
  
  var address: String = js.native
  
  var adname: String = js.native
  
  var citycode: String = js.native
  
  var cityname: String = js.native
  
  var discount: Boolean = js.native
  
  var distance: Double = js.native
  
  var email: String = js.native
  
  var entr_location: LngLat = js.native
  
  var exit_location: LngLat = js.native
  
  var groupbuy: Boolean = js.native
  
  var id: String = js.native
  
  var location: LngLat = js.native
  
  var name: String = js.native
  
  var pcode: String = js.native
  
  var pname: String = js.native
  
  var postcode: String = js.native
  
  var tel: String = js.native
  
  var `type`: String = js.native
  
  var website: String = js.native
}
object Poi {
  
  @scala.inline
  def apply(
    adcode: String,
    address: String,
    adname: String,
    citycode: String,
    cityname: String,
    discount: Boolean,
    distance: Double,
    email: String,
    entr_location: LngLat,
    exit_location: LngLat,
    groupbuy: Boolean,
    id: String,
    location: LngLat,
    name: String,
    pcode: String,
    pname: String,
    postcode: String,
    tel: String,
    `type`: String,
    website: String
  ): Poi = {
    val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], address = address.asInstanceOf[js.Any], adname = adname.asInstanceOf[js.Any], citycode = citycode.asInstanceOf[js.Any], cityname = cityname.asInstanceOf[js.Any], discount = discount.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], entr_location = entr_location.asInstanceOf[js.Any], exit_location = exit_location.asInstanceOf[js.Any], groupbuy = groupbuy.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pcode = pcode.asInstanceOf[js.Any], pname = pname.asInstanceOf[js.Any], postcode = postcode.asInstanceOf[js.Any], tel = tel.asInstanceOf[js.Any], website = website.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Poi]
  }
  
  @scala.inline
  implicit class PoiMutableBuilder[Self <: Poi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdcode(value: String): Self = StObject.set(x, "adcode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdname(value: String): Self = StObject.set(x, "adname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCitycode(value: String): Self = StObject.set(x, "citycode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCityname(value: String): Self = StObject.set(x, "cityname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscount(value: Boolean): Self = StObject.set(x, "discount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntr_location(value: LngLat): Self = StObject.set(x, "entr_location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExit_location(value: LngLat): Self = StObject.set(x, "exit_location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupbuy(value: Boolean): Self = StObject.set(x, "groupbuy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: LngLat): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPcode(value: String): Self = StObject.set(x, "pcode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPname(value: String): Self = StObject.set(x, "pname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostcode(value: String): Self = StObject.set(x, "postcode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTel(value: String): Self = StObject.set(x, "tel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebsite(value: String): Self = StObject.set(x, "website", value.asInstanceOf[js.Any])
  }
}
