package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectionPagePerpage extends js.Object {
  var direction: Enum
  var page: Type
  var per_page: Type
  var team_id: Required
}

object DirectionPagePerpage {
  @scala.inline
  def apply(direction: Enum, page: Type, per_page: Type, team_id: Required): DirectionPagePerpage = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionPagePerpage]
  }
}

