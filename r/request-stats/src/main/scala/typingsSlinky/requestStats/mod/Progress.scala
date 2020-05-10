package typingsSlinky.requestStats.mod

import typingsSlinky.requestStats.AnonBytesDelta
import typingsSlinky.requestStats.AnonSpeed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Progress extends js.Object {
  /**
    * `false` if the request is still in progress
    */
  var completed: Boolean = js.native
  var req: AnonBytesDelta = js.native
  var res: AnonSpeed = js.native
  /**
    * The total time the reuqest have been in progress
    */
  var time: Double = js.native
  /**
    * The time since previous call to `.progress()`
    */
  var timeDelta: Double = js.native
}

object Progress {
  @scala.inline
  def apply(completed: Boolean, req: AnonBytesDelta, res: AnonSpeed, time: Double, timeDelta: Double): Progress = {
    val __obj = js.Dynamic.literal(completed = completed.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], timeDelta = timeDelta.asInstanceOf[js.Any])
    __obj.asInstanceOf[Progress]
  }
  @scala.inline
  implicit class ProgressOps[Self <: Progress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompleted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReq(value: AnonBytesDelta): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("req")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRes(value: AnonSpeed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("res")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeDelta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeDelta")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

