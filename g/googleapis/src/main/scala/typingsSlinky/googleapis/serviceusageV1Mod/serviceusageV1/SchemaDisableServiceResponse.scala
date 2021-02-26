package typingsSlinky.googleapis.serviceusageV1Mod.serviceusageV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for the `DisableService` method. This response message is
  * assigned to the `response` field of the returned Operation when that
  * operation is done.
  */
@js.native
trait SchemaDisableServiceResponse extends StObject {
  
  /**
    * The new state of the service after disabling.
    */
  var service: js.UndefOr[SchemaGoogleApiServiceusageV1Service] = js.native
}
object SchemaDisableServiceResponse {
  
  @scala.inline
  def apply(): SchemaDisableServiceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDisableServiceResponse]
  }
  
  @scala.inline
  implicit class SchemaDisableServiceResponseMutableBuilder[Self <: SchemaDisableServiceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setService(value: SchemaGoogleApiServiceusageV1Service): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
