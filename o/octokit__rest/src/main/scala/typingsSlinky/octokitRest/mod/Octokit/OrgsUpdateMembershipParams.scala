package typingsSlinky.octokitRest.mod.Octokit

import typingsSlinky.octokitRest.octokitRestStrings.active
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrgsUpdateMembershipParams extends js.Object {
  var org: String = js.native
  /**
    * The state that the membership should be in. Only `"active"` will be accepted.
    */
  var state: active = js.native
}

object OrgsUpdateMembershipParams {
  @scala.inline
  def apply(org: String, state: active): OrgsUpdateMembershipParams = {
    val __obj = js.Dynamic.literal(org = org.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsUpdateMembershipParams]
  }
  @scala.inline
  implicit class OrgsUpdateMembershipParamsOps[Self <: OrgsUpdateMembershipParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("org")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: active): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

