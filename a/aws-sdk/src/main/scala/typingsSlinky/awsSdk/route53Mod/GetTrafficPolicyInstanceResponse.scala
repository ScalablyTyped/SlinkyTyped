package typingsSlinky.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTrafficPolicyInstanceResponse extends StObject {
  
  /**
    * A complex type that contains settings for the traffic policy instance.
    */
  var TrafficPolicyInstance: typingsSlinky.awsSdk.route53Mod.TrafficPolicyInstance = js.native
}
object GetTrafficPolicyInstanceResponse {
  
  @scala.inline
  def apply(TrafficPolicyInstance: TrafficPolicyInstance): GetTrafficPolicyInstanceResponse = {
    val __obj = js.Dynamic.literal(TrafficPolicyInstance = TrafficPolicyInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTrafficPolicyInstanceResponse]
  }
  
  @scala.inline
  implicit class GetTrafficPolicyInstanceResponseMutableBuilder[Self <: GetTrafficPolicyInstanceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrafficPolicyInstance(value: TrafficPolicyInstance): Self = StObject.set(x, "TrafficPolicyInstance", value.asInstanceOf[js.Any])
  }
}
