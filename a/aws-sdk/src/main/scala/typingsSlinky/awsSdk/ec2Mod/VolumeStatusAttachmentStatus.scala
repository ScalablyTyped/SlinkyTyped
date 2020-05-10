package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VolumeStatusAttachmentStatus extends js.Object {
  /**
    * The ID of the attached instance.
    */
  var InstanceId: js.UndefOr[String] = js.native
  /**
    * The maximum IOPS supported by the attached instance.
    */
  var IoPerformance: js.UndefOr[String] = js.native
}

object VolumeStatusAttachmentStatus {
  @scala.inline
  def apply(): VolumeStatusAttachmentStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeStatusAttachmentStatus]
  }
  @scala.inline
  implicit class VolumeStatusAttachmentStatusOps[Self <: VolumeStatusAttachmentStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(js.undefined)
        ret
    }
    @scala.inline
    def withIoPerformance(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IoPerformance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIoPerformance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IoPerformance")(js.undefined)
        ret
    }
  }
  
}

