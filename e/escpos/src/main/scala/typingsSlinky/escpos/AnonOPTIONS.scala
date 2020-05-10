package typingsSlinky.escpos

import typingsSlinky.escpos.escposStrings.InformationseparatorthreeLeftparenthesiskEndoftextNull1E
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOPTIONS extends js.Object {
  var CMD: InformationseparatorthreeLeftparenthesiskEndoftextNull1E = js.native
  var OPTIONS: AnonH = js.native
}

object AnonOPTIONS {
  @scala.inline
  def apply(CMD: InformationseparatorthreeLeftparenthesiskEndoftextNull1E, OPTIONS: AnonH): AnonOPTIONS = {
    val __obj = js.Dynamic.literal(CMD = CMD.asInstanceOf[js.Any], OPTIONS = OPTIONS.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOPTIONS]
  }
  @scala.inline
  implicit class AnonOPTIONSOps[Self <: AnonOPTIONS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCMD(value: InformationseparatorthreeLeftparenthesiskEndoftextNull1E): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CMD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOPTIONS(value: AnonH): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OPTIONS")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

