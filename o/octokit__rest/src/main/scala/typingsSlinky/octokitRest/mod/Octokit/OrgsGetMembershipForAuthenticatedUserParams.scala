package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsGetMembershipForAuthenticatedUserParams extends js.Object {
  @JSName("org")
  var org_ : String
}

object OrgsGetMembershipForAuthenticatedUserParams {
  @scala.inline
  def apply(org_ : String): OrgsGetMembershipForAuthenticatedUserParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsGetMembershipForAuthenticatedUserParams]
  }
}

