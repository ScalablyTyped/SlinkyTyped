package typingsSlinky.natsDashHemera.natsDashHemeraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecoderResult extends js.Object {
  var error: js.Error
  var value: js.Object
}

object DecoderResult {
  @scala.inline
  def apply(error: js.Error, value: js.Object): DecoderResult = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DecoderResult]
  }
}

