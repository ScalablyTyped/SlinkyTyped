package typingsSlinky.escpos.anon

import typingsSlinky.escpos.escposNumbers.`16`
import typingsSlinky.escpos.escposStrings.InformationseparatorthreeLeftparenthesiskEndoftextNull1C
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DEFAULT extends js.Object {
  var CMD: InformationseparatorthreeLeftparenthesiskEndoftextNull1C = js.native
  var DEFAULT: typingsSlinky.escpos.escposNumbers.`3` = js.native
  var MAX: `16` = js.native
  var MIN: typingsSlinky.escpos.escposNumbers.`1` = js.native
}

object DEFAULT {
  @scala.inline
  def apply(
    CMD: InformationseparatorthreeLeftparenthesiskEndoftextNull1C,
    DEFAULT: typingsSlinky.escpos.escposNumbers.`3`,
    MAX: `16`,
    MIN: typingsSlinky.escpos.escposNumbers.`1`
  ): DEFAULT = {
    val __obj = js.Dynamic.literal(CMD = CMD.asInstanceOf[js.Any], DEFAULT = DEFAULT.asInstanceOf[js.Any], MAX = MAX.asInstanceOf[js.Any], MIN = MIN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DEFAULT]
  }
  @scala.inline
  implicit class DEFAULTOps[Self <: DEFAULT] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCMD(value: InformationseparatorthreeLeftparenthesiskEndoftextNull1C): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CMD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDEFAULT(value: typingsSlinky.escpos.escposNumbers.`3`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMAX(value: `16`): Self = {
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

