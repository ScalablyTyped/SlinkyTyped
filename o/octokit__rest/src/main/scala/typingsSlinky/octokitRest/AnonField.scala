package typingsSlinky.octokitRest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonField extends js.Object {
  var code: String
  var field: String
  var resource: String
}

object AnonField {
  @scala.inline
  def apply(code: String, field: String, resource: String): AnonField = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonField]
  }
}

