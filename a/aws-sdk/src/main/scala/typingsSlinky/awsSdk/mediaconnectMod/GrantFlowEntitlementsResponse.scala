package typingsSlinky.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GrantFlowEntitlementsResponse extends js.Object {
  /**
    * The entitlements that were just granted.
    */
  var Entitlements: js.UndefOr[listOfEntitlement] = js.native
  /**
    * The ARN of the flow that these entitlements were granted to.
    */
  var FlowArn: js.UndefOr[string] = js.native
}

object GrantFlowEntitlementsResponse {
  @scala.inline
  def apply(): GrantFlowEntitlementsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrantFlowEntitlementsResponse]
  }
  @scala.inline
  implicit class GrantFlowEntitlementsResponseOps[Self <: GrantFlowEntitlementsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntitlements(value: listOfEntitlement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Entitlements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntitlements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Entitlements")(js.undefined)
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

