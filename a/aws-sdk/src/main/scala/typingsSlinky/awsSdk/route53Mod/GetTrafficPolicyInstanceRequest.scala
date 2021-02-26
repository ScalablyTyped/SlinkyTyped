package typingsSlinky.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTrafficPolicyInstanceRequest extends StObject {
  
  /**
    * The ID of the traffic policy instance that you want to get information about.
    */
  var Id: TrafficPolicyInstanceId = js.native
}
object GetTrafficPolicyInstanceRequest {
  
  @scala.inline
  def apply(Id: TrafficPolicyInstanceId): GetTrafficPolicyInstanceRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTrafficPolicyInstanceRequest]
  }
  
  @scala.inline
  implicit class GetTrafficPolicyInstanceRequestMutableBuilder[Self <: GetTrafficPolicyInstanceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: TrafficPolicyInstanceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
