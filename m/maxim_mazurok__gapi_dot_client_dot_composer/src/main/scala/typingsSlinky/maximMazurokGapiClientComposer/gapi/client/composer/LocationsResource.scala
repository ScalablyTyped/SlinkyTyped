package typingsSlinky.maximMazurokGapiClientComposer.gapi.client.composer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationsResource extends StObject {
  
  var environments: EnvironmentsResource = js.native
  
  var imageVersions: ImageVersionsResource = js.native
  
  var operations: OperationsResource = js.native
}
object LocationsResource {
  
  @scala.inline
  def apply(
    environments: EnvironmentsResource,
    imageVersions: ImageVersionsResource,
    operations: OperationsResource
  ): LocationsResource = {
    val __obj = js.Dynamic.literal(environments = environments.asInstanceOf[js.Any], imageVersions = imageVersions.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationsResource]
  }
  
  @scala.inline
  implicit class LocationsResourceMutableBuilder[Self <: LocationsResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvironments(value: EnvironmentsResource): Self = StObject.set(x, "environments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageVersions(value: ImageVersionsResource): Self = StObject.set(x, "imageVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperations(value: OperationsResource): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
  }
}
