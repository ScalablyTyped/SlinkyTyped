package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Force extends js.Object {
  var force: Type
  var owner: Required
  var ref: Required
  var repo: Required
  var sha: Required
}

object Force {
  @scala.inline
  def apply(force: Type, owner: Required, ref: Required, repo: Required, sha: Required): Force = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
    __obj.asInstanceOf[Force]
  }
}

