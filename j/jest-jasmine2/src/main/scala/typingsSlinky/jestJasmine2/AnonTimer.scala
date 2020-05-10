package typingsSlinky.jestJasmine2

import typingsSlinky.jestJasmine2.timerMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTimer extends js.Object {
  var timer: js.UndefOr[default] = js.native
}

object AnonTimer {
  @scala.inline
  def apply(): AnonTimer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonTimer]
  }
  @scala.inline
  implicit class AnonTimerOps[Self <: AnonTimer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTimer(value: default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timer")(js.undefined)
        ret
    }
  }
  
}

