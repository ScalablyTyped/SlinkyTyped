package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Recursive extends js.Object {
  var owner: Required
  var recursive: Enum
  var repo: Required
  var tree_sha: Required
}

object Recursive {
  @scala.inline
  def apply(owner: Required, recursive: Enum, repo: Required, tree_sha: Required): Recursive = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], recursive = recursive.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], tree_sha = tree_sha.asInstanceOf[js.Any])
    __obj.asInstanceOf[Recursive]
  }
}

