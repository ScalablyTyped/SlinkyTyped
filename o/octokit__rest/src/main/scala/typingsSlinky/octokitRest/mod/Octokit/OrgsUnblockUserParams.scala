package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsUnblockUserParams extends js.Object {
  @JSName("org")
  var org_ : String
  var username: String
}

object OrgsUnblockUserParams {
  @scala.inline
  def apply(org_ : String, username: String): OrgsUnblockUserParams = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsUnblockUserParams]
  }
}

