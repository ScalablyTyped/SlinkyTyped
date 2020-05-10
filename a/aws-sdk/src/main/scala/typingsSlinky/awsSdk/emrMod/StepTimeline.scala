package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StepTimeline extends js.Object {
  /**
    * The date and time when the cluster step was created.
    */
  var CreationDateTime: js.UndefOr[js.Date] = js.native
  /**
    * The date and time when the cluster step execution completed or failed.
    */
  var EndDateTime: js.UndefOr[js.Date] = js.native
  /**
    * The date and time when the cluster step execution started.
    */
  var StartDateTime: js.UndefOr[js.Date] = js.native
}

object StepTimeline {
  @scala.inline
  def apply(): StepTimeline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StepTimeline]
  }
  @scala.inline
  implicit class StepTimelineOps[Self <: StepTimeline] (val x: Self) extends AnyVal {
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
    def withoutCreationDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDateTime")(js.undefined)
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

