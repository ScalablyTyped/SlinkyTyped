package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Users extends js.Object {
  var branch: Required
  var owner: Required
  var repo: Required
  var users: MapTo
}

object Users {
  @scala.inline
  def apply(branch: Required, owner: Required, repo: Required, users: MapTo): Users = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[Users]
  }
}

