package typingsSlinky.escpos

import typingsSlinky.escpos.escposNumbers.`12`
import typingsSlinky.escpos.escposNumbers.`1`
import typingsSlinky.escpos.escposNumbers.`24`
import typingsSlinky.escpos.escposStrings.EscapeNumbersignNumbersignQPIX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCMD extends js.Object {
  var CMD: EscapeNumbersignNumbersignQPIX = js.native
  var DEFAULT: `12` = js.native
  var MAX: `24` = js.native
  var MIN: `1` = js.native
}

object AnonCMD {
  @scala.inline
  def apply(CMD: EscapeNumbersignNumbersignQPIX, DEFAULT: `12`, MAX: `24`, MIN: `1`): AnonCMD = {
    val __obj = js.Dynamic.literal(CMD = CMD.asInstanceOf[js.Any], DEFAULT = DEFAULT.asInstanceOf[js.Any], MAX = MAX.asInstanceOf[js.Any], MIN = MIN.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCMD]
  }
  @scala.inline
  implicit class AnonCMDOps[Self <: AnonCMD] (val x: Self) extends AnyVal {
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
    def withMIN(value: `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MIN")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

