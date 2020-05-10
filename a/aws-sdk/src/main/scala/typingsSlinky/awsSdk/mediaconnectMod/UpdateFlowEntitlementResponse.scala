package typingsSlinky.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFlowEntitlementResponse extends js.Object {
  var Entitlement: js.UndefOr[typingsSlinky.awsSdk.mediaconnectMod.Entitlement] = js.native
  /**
    * The ARN of the flow that this entitlement was granted on.
    */
  var FlowArn: js.UndefOr[string] = js.native
}

object UpdateFlowEntitlementResponse {
  @scala.inline
  def apply(): UpdateFlowEntitlementResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFlowEntitlementResponse]
  }
  @scala.inline
  implicit class UpdateFlowEntitlementResponseOps[Self <: UpdateFlowEntitlementResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntitlement(value: Entitlement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Entitlement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntitlement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Entitlement")(js.undefined)
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

