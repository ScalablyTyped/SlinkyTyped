package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PagePerpageRepo extends js.Object {
  var commit_sha: Required
  var owner: Required
  var page: Type
  var per_page: Type
  var repo: Required
}

object PagePerpageRepo {
  @scala.inline
  def apply(commit_sha: Required, owner: Required, page: Type, per_page: Type, repo: Required): PagePerpageRepo = {
    val __obj = js.Dynamic.literal(commit_sha = commit_sha.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[PagePerpageRepo]
  }
}

