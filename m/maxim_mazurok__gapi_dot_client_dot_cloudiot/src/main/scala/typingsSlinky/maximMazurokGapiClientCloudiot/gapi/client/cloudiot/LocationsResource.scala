package typingsSlinky.maximMazurokGapiClientCloudiot.gapi.client.cloudiot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationsResource extends StObject {
  
  var registries: RegistriesResource = js.native
}
object LocationsResource {
  
  @scala.inline
  def apply(registries: RegistriesResource): LocationsResource = {
    val __obj = js.Dynamic.literal(registries = registries.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationsResource]
  }
  
  @scala.inline
  implicit class LocationsResourceMutableBuilder[Self <: LocationsResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegistries(value: RegistriesResource): Self = StObject.set(x, "registries", value.asInstanceOf[js.Any])
  }
}
