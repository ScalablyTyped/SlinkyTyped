package typingsSlinky.nodeCleanup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCtrlC extends js.Object {
  var ctrl_C: String = js.native
  var uncaughtException: String = js.native
}

object AnonCtrlC {
  @scala.inline
  def apply(ctrl_C: String, uncaughtException: String): AnonCtrlC = {
    val __obj = js.Dynamic.literal(ctrl_C = ctrl_C.asInstanceOf[js.Any], uncaughtException = uncaughtException.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCtrlC]
  }
  @scala.inline
  implicit class AnonCtrlCOps[Self <: AnonCtrlC] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCtrl_C(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctrl_C")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUncaughtException(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uncaughtException")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

