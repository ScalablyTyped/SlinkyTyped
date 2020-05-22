package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tfvcproject extends js.Object {
  var owner: Required
  var repo: Required
  var tfvc_project: Type
  var vcs: Enum
  var vcs_password: Type
  var vcs_url: Required
  var vcs_username: Type
}

object Tfvcproject {
  @scala.inline
  def apply(
    owner: Required,
    repo: Required,
    tfvc_project: Type,
    vcs: Enum,
    vcs_password: Type,
    vcs_url: Required,
    vcs_username: Type
  ): Tfvcproject = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], tfvc_project = tfvc_project.asInstanceOf[js.Any], vcs = vcs.asInstanceOf[js.Any], vcs_password = vcs_password.asInstanceOf[js.Any], vcs_url = vcs_url.asInstanceOf[js.Any], vcs_username = vcs_username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tfvcproject]
  }
}

