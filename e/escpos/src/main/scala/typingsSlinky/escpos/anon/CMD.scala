package typingsSlinky.escpos.anon

import typingsSlinky.escpos.escposNumbers.`12`
import typingsSlinky.escpos.escposNumbers.`24`
import typingsSlinky.escpos.escposStrings.EscapeNumbersignNumbersignQPIX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CMD extends js.Object {
  var CMD: EscapeNumbersignNumbersignQPIX = js.native
  var DEFAULT: `12` = js.native
  var MAX: `24` = js.native
  var MIN: typingsSlinky.escpos.escposNumbers.`1` = js.native
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
  @scala.inline
  implicit class CMDOps[Self <: CMD] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCMD(value: EscapeNumbersignNumbersignQPIX): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CMD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDEFAULT(value: `12`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMAX(value: `24`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MAX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMIN(value: typingsSlinky.escpos.escposNumbers.`1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MIN")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

