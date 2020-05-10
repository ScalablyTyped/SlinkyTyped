package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyInstanceEventStartTimeRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the event whose date and time you are modifying.
    */
  var InstanceEventId: String = js.native
  /**
    * The ID of the instance with the scheduled event.
    */
  var InstanceId: typingsSlinky.awsSdk.ec2Mod.InstanceId = js.native
  /**
    * The new date and time when the event will take place.
    */
  var NotBefore: js.Date = js.native
}

object ModifyInstanceEventStartTimeRequest {
  @scala.inline
  def apply(InstanceEventId: String, InstanceId: InstanceId, NotBefore: js.Date): ModifyInstanceEventStartTimeRequest = {
    val __obj = js.Dynamic.literal(InstanceEventId = InstanceEventId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], NotBefore = NotBefore.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyInstanceEventStartTimeRequest]
  }
  @scala.inline
  implicit class ModifyInstanceEventStartTimeRequestOps[Self <: ModifyInstanceEventStartTimeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceEventId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceEventId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceId(value: InstanceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotBefore(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDryRun(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDryRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(js.undefined)
        ret
    }
  }
  
}

