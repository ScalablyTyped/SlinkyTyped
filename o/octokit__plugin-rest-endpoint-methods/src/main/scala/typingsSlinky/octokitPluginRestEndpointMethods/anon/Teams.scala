package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Teams extends js.Object {
  var branch: Required
  var owner: Required
  var repo: Required
  var teams: MapTo
}

object Teams {
  @scala.inline
  def apply(branch: Required, owner: Required, repo: Required, teams: MapTo): Teams = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], teams = teams.asInstanceOf[js.Any])
    __obj.asInstanceOf[Teams]
  }
}

