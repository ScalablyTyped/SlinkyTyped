package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SinceSort extends js.Object {
  var direction: Enum
  var owner: Required
  var page: Type
  var per_page: Type
  var repo: Required
  var since: Type
  var sort: Enum
}

object SinceSort {
  @scala.inline
  def apply(
    direction: Enum,
    owner: Required,
    page: Type,
    per_page: Type,
    repo: Required,
    since: Type,
    sort: Enum
  ): SinceSort = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[SinceSort]
  }
}

