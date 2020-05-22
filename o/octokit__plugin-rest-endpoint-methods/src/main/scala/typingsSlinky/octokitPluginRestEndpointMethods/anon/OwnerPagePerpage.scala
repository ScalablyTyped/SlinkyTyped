package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OwnerPagePerpage extends js.Object {
  var owner: Required
  var page: Type
  var per_page: Type
  var repo: Required
  var sort: Enum
}

object OwnerPagePerpage {
  @scala.inline
  def apply(owner: Required, page: Type, per_page: Type, repo: Required, sort: Enum): OwnerPagePerpage = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[OwnerPagePerpage]
  }
}

