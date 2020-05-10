package typingsSlinky.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateSignalingChannelInput extends js.Object {
  /**
    * The ARN of the signaling channel that you want to update.
    */
  var ChannelARN: ResourceARN = js.native
  /**
    * The current version of the signaling channel that you want to update.
    */
  var CurrentVersion: Version = js.native
  /**
    * The structure containing the configuration for the SINGLE_MASTER type of the signaling channel that you want to update. 
    */
  var SingleMasterConfiguration: js.UndefOr[typingsSlinky.awsSdk.kinesisvideoMod.SingleMasterConfiguration] = js.native
}

object UpdateSignalingChannelInput {
  @scala.inline
  def apply(ChannelARN: ResourceARN, CurrentVersion: Version): UpdateSignalingChannelInput = {
    val __obj = js.Dynamic.literal(ChannelARN = ChannelARN.asInstanceOf[js.Any], CurrentVersion = CurrentVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSignalingChannelInput]
  }
  @scala.inline
  implicit class UpdateSignalingChannelInputOps[Self <: UpdateSignalingChannelInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannelARN(value: ResourceARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChannelARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentVersion(value: Version): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSingleMasterConfiguration(value: SingleMasterConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SingleMasterConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleMasterConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SingleMasterConfiguration")(js.undefined)
        ret
    }
  }
  
}

