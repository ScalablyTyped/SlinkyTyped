package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRecursive extends js.Object {
  var owner: AnonRequired
  var recursive: AnonEnum
  var repo: AnonRequired
  var tree_sha: AnonRequired
}

object AnonRecursive {
  @scala.inline
  def apply(owner: AnonRequired, recursive: AnonEnum, repo: AnonRequired, tree_sha: AnonRequired): AnonRecursive = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], recursive = recursive.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], tree_sha = tree_sha.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRecursive]
  }
}

