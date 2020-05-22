package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepoUsername extends js.Object {
  var owner: Required
  var repo: Required
  var username: Required
}

object RepoUsername {
  @scala.inline
  def apply(owner: Required, repo: Required, username: Required): RepoUsername = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepoUsername]
  }
}

