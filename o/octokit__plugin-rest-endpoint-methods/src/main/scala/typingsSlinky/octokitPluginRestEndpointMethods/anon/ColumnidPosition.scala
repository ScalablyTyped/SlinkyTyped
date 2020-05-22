package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnidPosition extends js.Object {
  var column_id: Required
  var position: Validation
}

object ColumnidPosition {
  @scala.inline
  def apply(column_id: Required, position: Validation): ColumnidPosition = {
    val __obj = js.Dynamic.literal(column_id = column_id.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnidPosition]
  }
}

