package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommitshaOwner extends js.Object {
  var commit_sha: Alias
  var owner: Required
  var ref: Required
  var repo: Required
  var sha: Alias
}

object CommitshaOwner {
  @scala.inline
  def apply(commit_sha: Alias, owner: Required, ref: Required, repo: Required, sha: Alias): CommitshaOwner = {
    val __obj = js.Dynamic.literal(commit_sha = commit_sha.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitshaOwner]
  }
}

