package typingsSlinky.numeral.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Format extends js.Object {
  var format: js.RegExp
  var unformat: js.RegExp
}

object Format {
  @scala.inline
  def apply(format: js.RegExp, unformat: js.RegExp): Format = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], unformat = unformat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format]
  }
}

