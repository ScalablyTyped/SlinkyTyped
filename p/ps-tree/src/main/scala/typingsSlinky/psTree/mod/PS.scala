package typingsSlinky.psTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PS extends js.Object {
  var COMMAND: String = js.native
  var PID: String = js.native
  var PPID: String = js.native
  var STAT: String = js.native
}

object PS {
  @scala.inline
  def apply(COMMAND: String, PID: String, PPID: String, STAT: String): PS = {
    val __obj = js.Dynamic.literal(COMMAND = COMMAND.asInstanceOf[js.Any], PID = PID.asInstanceOf[js.Any], PPID = PPID.asInstanceOf[js.Any], STAT = STAT.asInstanceOf[js.Any])
    __obj.asInstanceOf[PS]
  }
  @scala.inline
  implicit class PSOps[Self <: PS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCOMMAND(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("COMMAND")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPPID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PPID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSTAT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("STAT")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

