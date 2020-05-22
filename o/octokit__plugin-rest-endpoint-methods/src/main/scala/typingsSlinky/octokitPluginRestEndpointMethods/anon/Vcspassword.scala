package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vcspassword extends js.Object {
  var owner: Required
  var repo: Required
  var vcs_password: Type
  var vcs_username: Type
}

object Vcspassword {
  @scala.inline
  def apply(owner: Required, repo: Required, vcs_password: Type, vcs_username: Type): Vcspassword = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], vcs_password = vcs_password.asInstanceOf[js.Any], vcs_username = vcs_username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vcspassword]
  }
}

