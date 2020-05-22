package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectionPage extends js.Object {
  var direction: Enum
  var page: Type
  var per_page: Type
  var sort: Enum
  var `type`: Enum
  var username: Required
}

object DirectionPage {
  @scala.inline
  def apply(direction: Enum, page: Type, per_page: Type, sort: Enum, `type`: Enum, username: Required): DirectionPage = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionPage]
  }
}

