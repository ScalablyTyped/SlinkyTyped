package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceStatusEvent extends js.Object {
  /**
    * The event code.
    */
  var Code: js.UndefOr[EventCode] = js.native
  /**
    * A description of the event. After a scheduled event is completed, it can still be described for up to a week. If the event has been completed, this description starts with the following text: [Completed].
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The ID of the event.
    */
  var InstanceEventId: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.InstanceEventId] = js.native
  /**
    * The latest scheduled end time for the event.
    */
  var NotAfter: js.UndefOr[js.Date] = js.native
  /**
    * The earliest scheduled start time for the event.
    */
  var NotBefore: js.UndefOr[js.Date] = js.native
  /**
    * The deadline for starting the event.
    */
  var NotBeforeDeadline: js.UndefOr[js.Date] = js.native
}

object InstanceStatusEvent {
  @scala.inline
  def apply(): InstanceStatusEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceStatusEvent]
  }
  @scala.inline
  implicit class InstanceStatusEventOps[Self <: InstanceStatusEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: EventCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Code")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceEventId(value: InstanceEventId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceEventId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceEventId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceEventId")(js.undefined)
        ret
    }
    @scala.inline
    def withNotAfter(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withNotBefore(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withNotBeforeDeadline(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotBeforeDeadline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotBeforeDeadline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotBeforeDeadline")(js.undefined)
        ret
    }
  }
  
}

