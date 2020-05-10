package typingsSlinky.gapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetNetworkPolicyRequest extends js.Object {
  /** Configuration options for the NetworkPolicy feature. */
  var networkPolicy: js.UndefOr[NetworkPolicy] = js.native
}

object SetNetworkPolicyRequest {
  @scala.inline
  def apply(): SetNetworkPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetNetworkPolicyRequest]
  }
  @scala.inline
  implicit class SetNetworkPolicyRequestOps[Self <: SetNetworkPolicyRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNetworkPolicy(value: NetworkPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkPolicy")(js.undefined)
        ret
    }
  }
  
}

