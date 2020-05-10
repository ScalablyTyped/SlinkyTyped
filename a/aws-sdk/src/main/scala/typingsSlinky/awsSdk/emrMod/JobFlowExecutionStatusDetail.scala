package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobFlowExecutionStatusDetail extends js.Object {
  /**
    * The creation date and time of the job flow.
    */
  var CreationDateTime: js.Date = js.native
  /**
    * The completion date and time of the job flow.
    */
  var EndDateTime: js.UndefOr[js.Date] = js.native
  /**
    * Description of the job flow last changed state.
    */
  var LastStateChangeReason: js.UndefOr[XmlString] = js.native
  /**
    * The date and time when the job flow was ready to start running bootstrap actions.
    */
  var ReadyDateTime: js.UndefOr[js.Date] = js.native
  /**
    * The start date and time of the job flow.
    */
  var StartDateTime: js.UndefOr[js.Date] = js.native
  /**
    * The state of the job flow.
    */
  var State: JobFlowExecutionState = js.native
}

object JobFlowExecutionStatusDetail {
  @scala.inline
  def apply(CreationDateTime: js.Date, State: JobFlowExecutionState): JobFlowExecutionStatusDetail = {
    val __obj = js.Dynamic.literal(CreationDateTime = CreationDateTime.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobFlowExecutionStatusDetail]
  }
  @scala.inline
  implicit class JobFlowExecutionStatusDetailOps[Self <: JobFlowExecutionStatusDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: JobFlowExecutionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLastStateChangeReason(value: XmlString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastStateChangeReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastStateChangeReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastStateChangeReason")(js.undefined)
        ret
    }
    @scala.inline
    def withReadyDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReadyDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadyDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReadyDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withStartDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartDateTime")(js.undefined)
        ret
    }
  }
  
}

