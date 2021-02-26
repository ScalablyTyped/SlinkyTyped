package typingsSlinky.leafletGeosearch.mod

import typingsSlinky.leafletGeosearch.anon.Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleProviderResultRaw extends StObject {
  
  var address_components: js.Array[GoogleProviderResultAddressComponent] = js.native
  
  var formatted_address: String = js.native
  
  var geometry: Location = js.native
  
  var place_id: String = js.native
  
  var types: js.Array[String] = js.native
}
object GoogleProviderResultRaw {
  
  @scala.inline
  def apply(
    address_components: js.Array[GoogleProviderResultAddressComponent],
    formatted_address: String,
    geometry: Location,
    place_id: String,
    types: js.Array[String]
  ): GoogleProviderResultRaw = {
    val __obj = js.Dynamic.literal(address_components = address_components.asInstanceOf[js.Any], formatted_address = formatted_address.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], place_id = place_id.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleProviderResultRaw]
  }
  
  @scala.inline
  implicit class GoogleProviderResultRawMutableBuilder[Self <: GoogleProviderResultRaw] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress_components(value: js.Array[GoogleProviderResultAddressComponent]): Self = StObject.set(x, "address_components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress_componentsVarargs(value: GoogleProviderResultAddressComponent*): Self = StObject.set(x, "address_components", js.Array(value :_*))
    
    @scala.inline
    def setFormatted_address(value: String): Self = StObject.set(x, "formatted_address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometry(value: Location): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlace_id(value: String): Self = StObject.set(x, "place_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
