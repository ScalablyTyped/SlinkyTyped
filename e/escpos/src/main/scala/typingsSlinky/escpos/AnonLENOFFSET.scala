package typingsSlinky.escpos

import typingsSlinky.escpos.escposNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLENOFFSET extends js.Object {
  var LEN_OFFSET: `3` = js.native
  var LEVEL: AnonOPTIONS = js.native
  var PIXEL_SIZE: AnonCMD = js.native
  var PRINTBUF: AnonCMDP2 = js.native
  var SAVEBUF: AnonCMDP1 = js.native
  var VERSION: AnonDEFAULT = js.native
}

object AnonLENOFFSET {
  @scala.inline
  def apply(
    LEN_OFFSET: `3`,
    LEVEL: AnonOPTIONS,
    PIXEL_SIZE: AnonCMD,
    PRINTBUF: AnonCMDP2,
    SAVEBUF: AnonCMDP1,
    VERSION: AnonDEFAULT
  ): AnonLENOFFSET = {
    val __obj = js.Dynamic.literal(LEN_OFFSET = LEN_OFFSET.asInstanceOf[js.Any], LEVEL = LEVEL.asInstanceOf[js.Any], PIXEL_SIZE = PIXEL_SIZE.asInstanceOf[js.Any], PRINTBUF = PRINTBUF.asInstanceOf[js.Any], SAVEBUF = SAVEBUF.asInstanceOf[js.Any], VERSION = VERSION.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLENOFFSET]
  }
  @scala.inline
  implicit class AnonLENOFFSETOps[Self <: AnonLENOFFSET] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLEN_OFFSET(value: `3`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LEN_OFFSET")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLEVEL(value: AnonOPTIONS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LEVEL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPIXEL_SIZE(value: AnonCMD): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PIXEL_SIZE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPRINTBUF(value: AnonCMDP2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PRINTBUF")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSAVEBUF(value: AnonCMDP1): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SAVEBUF")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVERSION(value: AnonDEFAULT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

