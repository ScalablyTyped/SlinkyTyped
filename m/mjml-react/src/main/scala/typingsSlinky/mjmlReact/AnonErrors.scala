package typingsSlinky.mjmlReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrors extends js.Object {
  var errors: js.Array[js.Error]
  var html: String
}

object AnonErrors {
  @scala.inline
  def apply(errors: js.Array[js.Error], html: String): AnonErrors = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonErrors]
  }
}

