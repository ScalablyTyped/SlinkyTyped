package typingsSlinky.gapiClientDataproc.gapi.client.dataproc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobStatus extends js.Object {
  /** Output-only. Optional job state details, such as an error description if the state is <code>ERROR</code>. */
  var details: js.UndefOr[String] = js.native
  /** Output-only. A state message specifying the overall job state. */
  var state: js.UndefOr[String] = js.native
  /** Output-only. The time when this state was entered. */
  var stateStartTime: js.UndefOr[String] = js.native
  /** Output-only. Additional state information, which includes status reported by the agent. */
  var substate: js.UndefOr[String] = js.native
}

object JobStatus {
  @scala.inline
  def apply(): JobStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobStatus]
  }
  @scala.inline
  implicit class JobStatusOps[Self <: JobStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetails(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withStateStartTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateStartTime")(js.undefined)
        ret
    }
    @scala.inline
    def withSubstate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("substate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubstate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("substate")(js.undefined)
        ret
    }
  }
  
}

