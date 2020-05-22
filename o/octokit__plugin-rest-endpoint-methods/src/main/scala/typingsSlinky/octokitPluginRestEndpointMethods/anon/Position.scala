package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends js.Object {
  var card_id: Required
  var column_id: Type
  var position: Validation
}

object Position {
  @scala.inline
  def apply(card_id: Required, column_id: Type, position: Validation): Position = {
    val __obj = js.Dynamic.literal(card_id = card_id.asInstanceOf[js.Any], column_id = column_id.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
}

