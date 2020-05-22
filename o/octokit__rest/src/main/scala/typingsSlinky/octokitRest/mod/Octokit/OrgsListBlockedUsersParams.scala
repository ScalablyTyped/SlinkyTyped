package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsListBlockedUsersParams extends js.Object {
  @JSName("org")
  var org_ : String
}

object OrgsListBlockedUsersParams {
  @scala.inline
  def apply(org_ : String): OrgsListBlockedUsersParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsListBlockedUsersParams]
  }
}

