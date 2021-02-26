package typingsSlinky.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteHealthCheckRequest extends StObject {
  
  /**
    * The ID of the health check that you want to delete.
    */
  var HealthCheckId: typingsSlinky.awsSdk.route53Mod.HealthCheckId = js.native
}
object DeleteHealthCheckRequest {
  
  @scala.inline
  def apply(HealthCheckId: HealthCheckId): DeleteHealthCheckRequest = {
    val __obj = js.Dynamic.literal(HealthCheckId = HealthCheckId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteHealthCheckRequest]
  }
  
  @scala.inline
  implicit class DeleteHealthCheckRequestMutableBuilder[Self <: DeleteHealthCheckRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHealthCheckId(value: HealthCheckId): Self = StObject.set(x, "HealthCheckId", value.asInstanceOf[js.Any])
  }
}
