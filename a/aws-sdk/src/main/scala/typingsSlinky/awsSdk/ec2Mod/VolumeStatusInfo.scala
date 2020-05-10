package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VolumeStatusInfo extends js.Object {
  /**
    * The details of the volume status.
    */
  var Details: js.UndefOr[VolumeStatusDetailsList] = js.native
  /**
    * The status of the volume.
    */
  var Status: js.UndefOr[VolumeStatusInfoStatus] = js.native
}

object VolumeStatusInfo {
  @scala.inline
  def apply(): VolumeStatusInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeStatusInfo]
  }
  @scala.inline
  implicit class VolumeStatusInfoOps[Self <: VolumeStatusInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetails(value: VolumeStatusDetailsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Details")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: VolumeStatusInfoStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

