package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValidation extends js.Object {
  var required: Boolean
  var `type`: String
  var validation: String
}

object AnonValidation {
  @scala.inline
  def apply(required: Boolean, `type`: String, validation: String): AnonValidation = {
    val __obj = js.Dynamic.literal(required = required.asInstanceOf[js.Any], validation = validation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonValidation]
  }
}

