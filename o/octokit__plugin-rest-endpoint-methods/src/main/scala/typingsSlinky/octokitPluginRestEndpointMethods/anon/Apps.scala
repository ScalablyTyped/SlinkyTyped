package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Apps extends js.Object {
  var apps: MapTo
  var branch: Required
  var owner: Required
  var repo: Required
}

object Apps {
  @scala.inline
  def apply(apps: MapTo, branch: Required, owner: Required, repo: Required): Apps = {
    val __obj = js.Dynamic.literal(apps = apps.asInstanceOf[js.Any], branch = branch.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Apps]
  }
}

