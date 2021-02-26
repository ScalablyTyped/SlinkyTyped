package typingsSlinky.googleapis.servicemanagementV1Mod.servicemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for DisableService method.
  */
@js.native
trait SchemaDisableServiceRequest extends StObject {
  
  /**
    * The identity of consumer resource which service disablement will be
    * applied to.  The Google Service Management implementation accepts the
    * following forms: - &quot;project:&lt;project_id&gt;&quot;  Note: this is
    * made compatible with google.api.servicecontrol.v1.Operation.consumer_id.
    */
  var consumerId: js.UndefOr[String] = js.native
}
object SchemaDisableServiceRequest {
  
  @scala.inline
  def apply(): SchemaDisableServiceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDisableServiceRequest]
  }
  
  @scala.inline
  implicit class SchemaDisableServiceRequestMutableBuilder[Self <: SchemaDisableServiceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConsumerId(value: String): Self = StObject.set(x, "consumerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumerIdUndefined: Self = StObject.set(x, "consumerId", js.undefined)
  }
}
