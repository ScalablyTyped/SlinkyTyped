package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Before extends js.Object {
  var all: Type
  var before: Type
  var owner: Required
  var page: Type
  var participating: Type
  var per_page: Type
  var repo: Required
  var since: Type
}

object Before {
  @scala.inline
  def apply(
    all: Type,
    before: Type,
    owner: Required,
    page: Type,
    participating: Type,
    per_page: Type,
    repo: Required,
    since: Type
  ): Before = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], participating = participating.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any])
    __obj.asInstanceOf[Before]
  }
}

