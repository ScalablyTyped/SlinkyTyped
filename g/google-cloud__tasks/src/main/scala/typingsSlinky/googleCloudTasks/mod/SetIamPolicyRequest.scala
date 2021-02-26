package typingsSlinky.googleCloudTasks.mod

import typingsSlinky.googleCloudTasks.anon.PartialPolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetIamPolicyRequest extends StObject {
  
  var policy: PartialPolicy = js.native
}
object SetIamPolicyRequest {
  
  @scala.inline
  def apply(policy: PartialPolicy): SetIamPolicyRequest = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetIamPolicyRequest]
  }
  
  @scala.inline
  implicit class SetIamPolicyRequestMutableBuilder[Self <: SetIamPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicy(value: PartialPolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
  }
}
