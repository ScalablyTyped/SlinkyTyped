package typingsSlinky.dockerode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFailingStreak extends js.Object {
  var FailingStreak: Double = js.native
  var Log: js.Array[AnonEnd] = js.native
  var Status: String = js.native
}

object AnonFailingStreak {
  @scala.inline
  def apply(FailingStreak: Double, Log: js.Array[AnonEnd], Status: String): AnonFailingStreak = {
    val __obj = js.Dynamic.literal(FailingStreak = FailingStreak.asInstanceOf[js.Any], Log = Log.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFailingStreak]
  }
  @scala.inline
  implicit class AnonFailingStreakOps[Self <: AnonFailingStreak] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailingStreak(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailingStreak")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLog(value: js.Array[AnonEnd]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Log")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

