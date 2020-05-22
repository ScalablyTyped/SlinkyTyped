package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerpageReleaseid extends js.Object {
  var owner: Required
  var page: Type
  var per_page: Type
  var release_id: Required
  var repo: Required
}

object PerpageReleaseid {
  @scala.inline
  def apply(owner: Required, page: Type, per_page: Type, release_id: Required, repo: Required): PerpageReleaseid = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], release_id = release_id.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerpageReleaseid]
  }
}

