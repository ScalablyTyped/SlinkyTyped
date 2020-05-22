package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Names extends js.Object {
  var names: Required
  var owner: Required
  var repo: Required
}

object Names {
  @scala.inline
  def apply(names: Required, owner: Required, repo: Required): Names = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Names]
  }
}

