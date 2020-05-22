package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Contexts extends js.Object {
  var branch: Required
  var contexts: MapTo
  var owner: Required
  var repo: Required
}

object Contexts {
  @scala.inline
  def apply(branch: Required, contexts: MapTo, owner: Required, repo: Required): Contexts = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], contexts = contexts.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contexts]
  }
}

