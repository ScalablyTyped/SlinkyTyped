package typingsSlinky.dockerode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDead extends js.Object {
  var Dead: Boolean = js.native
  var Error: String = js.native
  var ExitCode: Double = js.native
  var FinishedAt: String = js.native
  var Health: js.UndefOr[AnonFailingStreak] = js.native
  var OOMKilled: Boolean = js.native
  var Paused: Boolean = js.native
  var Pid: Double = js.native
  var Restarting: Boolean = js.native
  var Running: Boolean = js.native
  var StartedAt: String = js.native
  var Status: String = js.native
}

object AnonDead {
  @scala.inline
  def apply(
    Dead: Boolean,
    Error: String,
    ExitCode: Double,
    FinishedAt: String,
    OOMKilled: Boolean,
    Paused: Boolean,
    Pid: Double,
    Restarting: Boolean,
    Running: Boolean,
    StartedAt: String,
    Status: String
  ): AnonDead = {
    val __obj = js.Dynamic.literal(Dead = Dead.asInstanceOf[js.Any], Error = Error.asInstanceOf[js.Any], ExitCode = ExitCode.asInstanceOf[js.Any], FinishedAt = FinishedAt.asInstanceOf[js.Any], OOMKilled = OOMKilled.asInstanceOf[js.Any], Paused = Paused.asInstanceOf[js.Any], Pid = Pid.asInstanceOf[js.Any], Restarting = Restarting.asInstanceOf[js.Any], Running = Running.asInstanceOf[js.Any], StartedAt = StartedAt.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDead]
  }
  @scala.inline
  implicit class AnonDeadOps[Self <: AnonDead] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDead(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Dead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExitCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExitCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFinishedAt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FinishedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOOMKilled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OOMKilled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Paused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestarting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Restarting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRunning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Running")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartedAt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHealth(value: AnonFailingStreak): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Health")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Health")(js.undefined)
        ret
    }
  }
  
}

