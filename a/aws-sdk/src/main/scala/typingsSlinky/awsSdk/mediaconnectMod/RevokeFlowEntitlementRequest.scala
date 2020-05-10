package typingsSlinky.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevokeFlowEntitlementRequest extends js.Object {
  /**
    * The ARN of the entitlement that you want to revoke.
    */
  var EntitlementArn: string = js.native
  /**
    * The flow that you want to revoke an entitlement from.
    */
  var FlowArn: string = js.native
}

object RevokeFlowEntitlementRequest {
  @scala.inline
  def apply(EntitlementArn: string, FlowArn: string): RevokeFlowEntitlementRequest = {
    val __obj = js.Dynamic.literal(EntitlementArn = EntitlementArn.asInstanceOf[js.Any], FlowArn = FlowArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokeFlowEntitlementRequest]
  }
  @scala.inline
  implicit class RevokeFlowEntitlementRequestOps[Self <: RevokeFlowEntitlementRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntitlementArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntitlementArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlowArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FlowArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

