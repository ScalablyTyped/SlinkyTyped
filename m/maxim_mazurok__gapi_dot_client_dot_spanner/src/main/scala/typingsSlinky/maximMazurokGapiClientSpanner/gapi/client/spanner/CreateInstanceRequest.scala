package typingsSlinky.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateInstanceRequest extends StObject {
  
  /** Required. The instance to create. The name may be omitted, but if specified must be `/instances/`. */
  var instance: js.UndefOr[Instance] = js.native
  
  /** Required. The ID of the instance to create. Valid identifiers are of the form `a-z*[a-z0-9]` and must be between 2 and 64 characters in length. */
  var instanceId: js.UndefOr[String] = js.native
}
object CreateInstanceRequest {
  
  @scala.inline
  def apply(): CreateInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateInstanceRequest]
  }
  
  @scala.inline
  implicit class CreateInstanceRequestMutableBuilder[Self <: CreateInstanceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstance(value: Instance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
    
    @scala.inline
    def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
  }
}
