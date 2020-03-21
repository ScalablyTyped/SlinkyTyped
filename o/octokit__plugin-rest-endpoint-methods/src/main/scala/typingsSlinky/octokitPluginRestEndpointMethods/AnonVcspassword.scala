package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonVcspassword extends js.Object {
  var owner: AnonRequired
  var repo: AnonRequired
  var vcs_password: AnonType
  var vcs_username: AnonType
}

object AnonVcspassword {
  @scala.inline
  def apply(owner: AnonRequired, repo: AnonRequired, vcs_password: AnonType, vcs_username: AnonType): AnonVcspassword = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], vcs_password = vcs_password.asInstanceOf[js.Any], vcs_username = vcs_username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonVcspassword]
  }
}

