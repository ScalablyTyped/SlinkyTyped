package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Archivedstate extends js.Object {
  var archived_state: Enum
  var column_id: Required
  var page: Type
  var per_page: Type
}

object Archivedstate {
  @scala.inline
  def apply(archived_state: Enum, column_id: Required, page: Type, per_page: Type): Archivedstate = {
    val __obj = js.Dynamic.literal(archived_state = archived_state.asInstanceOf[js.Any], column_id = column_id.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[Archivedstate]
  }
}

