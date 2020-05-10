package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StepExecutionStatusDetail extends js.Object {
  /**
    * The creation date and time of the step.
    */
  var CreationDateTime: js.Date = js.native
  /**
    * The completion date and time of the step.
    */
  var EndDateTime: js.UndefOr[js.Date] = js.native
  /**
    * A description of the step's current state.
    */
  var LastStateChangeReason: js.UndefOr[XmlString] = js.native
  /**
    * The start date and time of the step.
    */
  var StartDateTime: js.UndefOr[js.Date] = js.native
  /**
    * The state of the step.
    */
  var State: StepExecutionState = js.native
}

object StepExecutionStatusDetail {
  @scala.inline
  def apply(CreationDateTime: js.Date, State: StepExecutionState): StepExecutionStatusDetail = {
    val __obj = js.Dynamic.literal(CreationDateTime = CreationDateTime.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepExecutionStatusDetail]
  }
  @scala.inline
  implicit class StepExecutionStatusDetailOps[Self <: StepExecutionStatusDetail] (val x: Self) extends AnyVal {
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
    def withState(value: StepExecutionState): Self = {
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

