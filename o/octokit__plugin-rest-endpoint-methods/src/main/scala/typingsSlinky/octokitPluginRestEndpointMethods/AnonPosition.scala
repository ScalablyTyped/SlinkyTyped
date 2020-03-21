package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPosition extends js.Object {
  var card_id: AnonRequired
  var column_id: AnonType
  var position: AnonValidation
}

object AnonPosition {
  @scala.inline
  def apply(card_id: AnonRequired, column_id: AnonType, position: AnonValidation): AnonPosition = {
    val __obj = js.Dynamic.literal(card_id = card_id.asInstanceOf[js.Any], column_id = column_id.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPosition]
  }
}

