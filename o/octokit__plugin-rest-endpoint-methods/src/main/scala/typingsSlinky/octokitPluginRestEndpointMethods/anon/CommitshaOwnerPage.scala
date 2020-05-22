package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommitshaOwnerPage extends js.Object {
  var commit_sha: Required
  var owner: Required
  var page: Type
  var per_page: Type
  var ref: Alias
  var repo: Required
}

object CommitshaOwnerPage {
  @scala.inline
  def apply(commit_sha: Required, owner: Required, page: Type, per_page: Type, ref: Alias, repo: Required): CommitshaOwnerPage = {
    val __obj = js.Dynamic.literal(commit_sha = commit_sha.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitshaOwnerPage]
  }
}

