package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Validation extends js.Object {
  var required: Boolean
  var `type`: String
  var validation: String
}

object Validation {
  @scala.inline
  def apply(required: Boolean, `type`: String, validation: String): Validation = {
    val __obj = js.Dynamic.literal(required = required.asInstanceOf[js.Any], validation = validation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Validation]
  }
}

