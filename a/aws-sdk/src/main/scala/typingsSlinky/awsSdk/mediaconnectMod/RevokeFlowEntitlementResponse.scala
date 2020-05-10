package typingsSlinky.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevokeFlowEntitlementResponse extends js.Object {
  /**
    * The ARN of the entitlement that was revoked.
    */
  var EntitlementArn: js.UndefOr[string] = js.native
  /**
    * The ARN of the flow that the entitlement was revoked from.
    */
  var FlowArn: js.UndefOr[string] = js.native
}

object RevokeFlowEntitlementResponse {
  @scala.inline
  def apply(): RevokeFlowEntitlementResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevokeFlowEntitlementResponse]
  }
  @scala.inline
  implicit class RevokeFlowEntitlementResponseOps[Self <: RevokeFlowEntitlementResponse] (val x: Self) extends AnyVal {
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
    def withoutEntitlementArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntitlementArn")(js.undefined)
        ret
    }
    @scala.inline
    def withFlowArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FlowArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlowArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FlowArn")(js.undefined)
        ret
    }
  }
  
}

