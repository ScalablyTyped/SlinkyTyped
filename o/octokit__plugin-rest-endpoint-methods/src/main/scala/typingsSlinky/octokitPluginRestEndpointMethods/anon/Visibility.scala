package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Visibility extends js.Object {
  var affiliation: Type
  var direction: Enum
  var page: Type
  var per_page: Type
  var sort: Enum
  var `type`: Enum
  var visibility: Enum
}

object Visibility {
  @scala.inline
  def apply(
    affiliation: Type,
    direction: Enum,
    page: Type,
    per_page: Type,
    sort: Enum,
    `type`: Enum,
    visibility: Enum
  ): Visibility = {
    val __obj = js.Dynamic.literal(affiliation = affiliation.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Visibility]
  }
}

