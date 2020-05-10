package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceGroupTimeline extends js.Object {
  /**
    * The creation date and time of the instance group.
    */
  var CreationDateTime: js.UndefOr[js.Date] = js.native
  /**
    * The date and time when the instance group terminated.
    */
  var EndDateTime: js.UndefOr[js.Date] = js.native
  /**
    * The date and time when the instance group became ready to perform tasks.
    */
  var ReadyDateTime: js.UndefOr[js.Date] = js.native
}

object InstanceGroupTimeline {
  @scala.inline
  def apply(): InstanceGroupTimeline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceGroupTimeline]
  }
  @scala.inline
  implicit class InstanceGroupTimelineOps[Self <: InstanceGroupTimeline] (val x: Self) extends AnyVal {
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
  }
  
}

