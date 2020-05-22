package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Head extends js.Object {
  var base: Type
  var direction: Enum
  var head: Type
  var owner: Required
  var page: Type
  var per_page: Type
  var repo: Required
  var sort: Enum
  var state: Enum
}

object Head {
  @scala.inline
  def apply(
    base: Type,
    direction: Enum,
    head: Type,
    owner: Required,
    page: Type,
    per_page: Type,
    repo: Required,
    sort: Enum,
    state: Enum
  ): Head = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Head]
  }
}

