package typingsSlinky.instagramPrivateApi.locationFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationFeedResponseLocation extends StObject {
  
  var address: String = js.native
  
  var city: String = js.native
  
  var external_source: String = js.native
  
  var facebook_places_id: String = js.native
  
  var lat: String = js.native
  
  var lng: String = js.native
  
  var name: String = js.native
  
  var pk: Double = js.native
  
  var short_name: String = js.native
}
object LocationFeedResponseLocation {
  
  @scala.inline
  def apply(
    address: String,
    city: String,
    external_source: String,
    facebook_places_id: String,
    lat: String,
    lng: String,
    name: String,
    pk: Double,
    short_name: String
  ): LocationFeedResponseLocation = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], external_source = external_source.asInstanceOf[js.Any], facebook_places_id = facebook_places_id.asInstanceOf[js.Any], lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], short_name = short_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationFeedResponseLocation]
  }
  
  @scala.inline
  implicit class LocationFeedResponseLocationMutableBuilder[Self <: LocationFeedResponseLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternal_source(value: String): Self = StObject.set(x, "external_source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacebook_places_id(value: String): Self = StObject.set(x, "facebook_places_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLat(value: String): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLng(value: String): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPk(value: Double): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShort_name(value: String): Self = StObject.set(x, "short_name", value.asInstanceOf[js.Any])
  }
}
