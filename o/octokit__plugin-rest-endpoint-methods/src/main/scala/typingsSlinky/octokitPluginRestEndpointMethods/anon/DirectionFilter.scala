package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectionFilter extends js.Object {
  var direction: Enum
  var filter: Enum
  var labels: Type
  @JSName("org")
  var org_ : Required
  var page: Type
  var per_page: Type
  var since: Type
  var sort: Enum
  var state: Enum
}

object DirectionFilter {
  @scala.inline
  def apply(
    direction: Enum,
    filter: Enum,
    labels: Type,
    org_ : Required,
    page: Type,
    per_page: Type,
    since: Type,
    sort: Enum,
    state: Enum
  ): DirectionFilter = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionFilter]
  }
}

