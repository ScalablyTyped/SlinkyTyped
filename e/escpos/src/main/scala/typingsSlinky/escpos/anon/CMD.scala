package typingsSlinky.escpos.anon

import typingsSlinky.escpos.escposNumbers.`12`
import typingsSlinky.escpos.escposNumbers.`24`
import typingsSlinky.escpos.escposStrings.EscapeNumbersignNumbersignQPIX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CMD extends js.Object {
  var CMD: EscapeNumbersignNumbersignQPIX
  var DEFAULT: `12`
  var MAX: `24`
  var MIN: typingsSlinky.escpos.escposNumbers.`1`
}

object CMD {
  @scala.inline
  def apply(
    CMD: EscapeNumbersignNumbersignQPIX,
    DEFAULT: `12`,
    MAX: `24`,
    MIN: typingsSlinky.escpos.escposNumbers.`1`
  ): CMD = {
    val __obj = js.Dynamic.literal(CMD = CMD.asInstanceOf[js.Any], DEFAULT = DEFAULT.asInstanceOf[js.Any], MAX = MAX.asInstanceOf[js.Any], MIN = MIN.asInstanceOf[js.Any])
    __obj.asInstanceOf[CMD]
  }
}

