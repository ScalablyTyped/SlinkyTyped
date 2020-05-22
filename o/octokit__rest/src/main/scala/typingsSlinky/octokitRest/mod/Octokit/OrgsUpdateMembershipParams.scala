package typingsSlinky.octokitRest.mod.Octokit

import typingsSlinky.octokitRest.octokitRestStrings.active
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsUpdateMembershipParams extends js.Object {
  @JSName("org")
  var org_ : String
  /**
    * The state that the membership should be in. Only `"active"` will be accepted.
    */
  var state: active
}

object OrgsUpdateMembershipParams {
  @scala.inline
  def apply(org_ : String, state: active): OrgsUpdateMembershipParams = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsUpdateMembershipParams]
  }
}

