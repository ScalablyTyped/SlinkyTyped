package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Commitsha extends js.Object {
  var commit_sha: Required
  var owner: Required
  var repo: Required
}

object Commitsha {
  @scala.inline
  def apply(commit_sha: Required, owner: Required, repo: Required): Commitsha = {
    val __obj = js.Dynamic.literal(commit_sha = commit_sha.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commitsha]
  }
}

