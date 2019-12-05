package typingsSlinky.natsDashHemera.natsDashHemeraMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncoderResult extends js.Object {
  var error: js.Error
  var value: String | Buffer
}

object EncoderResult {
  @scala.inline
  def apply(error: js.Error, value: String | Buffer): EncoderResult = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EncoderResult]
  }
}

