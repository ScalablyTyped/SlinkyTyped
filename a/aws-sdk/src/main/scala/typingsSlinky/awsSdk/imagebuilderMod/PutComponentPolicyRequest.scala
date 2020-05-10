package typingsSlinky.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutComponentPolicyRequest extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) of the component that this policy should be applied to. 
    */
  var componentArn: ComponentBuildVersionArn = js.native
  /**
    *  The policy to apply. 
    */
  var policy: ResourcePolicyDocument = js.native
}

object PutComponentPolicyRequest {
  @scala.inline
  def apply(componentArn: ComponentBuildVersionArn, policy: ResourcePolicyDocument): PutComponentPolicyRequest = {
    val __obj = js.Dynamic.literal(componentArn = componentArn.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutComponentPolicyRequest]
  }
  @scala.inline
  implicit class PutComponentPolicyRequestOps[Self <: PutComponentPolicyRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponentArn(value: ComponentBuildVersionArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolicy(value: ResourcePolicyDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

