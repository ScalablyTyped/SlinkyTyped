package typingsSlinky.escpos.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LENOFFSET extends js.Object {
  var LEN_OFFSET: typingsSlinky.escpos.escposNumbers.`3` = js.native
  var LEVEL: OPTIONS = js.native
  var PIXEL_SIZE: CMD = js.native
  var PRINTBUF: CMDP2 = js.native
  var SAVEBUF: CMDP1 = js.native
  var VERSION: DEFAULT = js.native
}

object LENOFFSET {
  @scala.inline
  def apply(
    LEN_OFFSET: typingsSlinky.escpos.escposNumbers.`3`,
    LEVEL: OPTIONS,
    PIXEL_SIZE: CMD,
    PRINTBUF: CMDP2,
    SAVEBUF: CMDP1,
    VERSION: DEFAULT
  ): LENOFFSET = {
    val __obj = js.Dynamic.literal(LEN_OFFSET = LEN_OFFSET.asInstanceOf[js.Any], LEVEL = LEVEL.asInstanceOf[js.Any], PIXEL_SIZE = PIXEL_SIZE.asInstanceOf[js.Any], PRINTBUF = PRINTBUF.asInstanceOf[js.Any], SAVEBUF = SAVEBUF.asInstanceOf[js.Any], VERSION = VERSION.asInstanceOf[js.Any])
    __obj.asInstanceOf[LENOFFSET]
  }
  @scala.inline
  implicit class LENOFFSETOps[Self <: LENOFFSET] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLEN_OFFSET(value: typingsSlinky.escpos.escposNumbers.`3`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LEN_OFFSET")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLEVEL(value: OPTIONS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LEVEL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPIXEL_SIZE(value: CMD): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PIXEL_SIZE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPRINTBUF(value: CMDP2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PRINTBUF")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSAVEBUF(value: CMDP1): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SAVEBUF")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVERSION(value: DEFAULT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

