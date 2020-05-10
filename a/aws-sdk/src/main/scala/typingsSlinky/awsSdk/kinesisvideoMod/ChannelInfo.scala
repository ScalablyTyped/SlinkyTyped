package typingsSlinky.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelInfo extends js.Object {
  /**
    * The ARN of the signaling channel.
    */
  var ChannelARN: js.UndefOr[ResourceARN] = js.native
  /**
    * The name of the signaling channel.
    */
  var ChannelName: js.UndefOr[typingsSlinky.awsSdk.kinesisvideoMod.ChannelName] = js.native
  /**
    * Current status of the signaling channel.
    */
  var ChannelStatus: js.UndefOr[Status] = js.native
  /**
    * The type of the signaling channel.
    */
  var ChannelType: js.UndefOr[typingsSlinky.awsSdk.kinesisvideoMod.ChannelType] = js.native
  /**
    * The time at which the signaling channel was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  /**
    * A structure that contains the configuration for the SINGLE_MASTER channel type.
    */
  var SingleMasterConfiguration: js.UndefOr[typingsSlinky.awsSdk.kinesisvideoMod.SingleMasterConfiguration] = js.native
  /**
    * The current version of the signaling channel.
    */
  var Version: js.UndefOr[typingsSlinky.awsSdk.kinesisvideoMod.Version] = js.native
}

object ChannelInfo {
  @scala.inline
  def apply(): ChannelInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelInfo]
  }
  @scala.inline
  implicit class ChannelInfoOps[Self <: ChannelInfo] (val x: Self) extends AnyVal {
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
    def withoutChannelARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChannelARN")(js.undefined)
        ret
    }
    @scala.inline
    def withChannelName(value: ChannelName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChannelName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChannelName")(js.undefined)
        ret
    }
    @scala.inline
    def withChannelStatus(value: Status): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChannelStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChannelStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withChannelType(value: ChannelType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChannelType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChannelType")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(js.undefined)
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
    @scala.inline
    def withVersion(value: Version): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(js.undefined)
        ret
    }
  }
  
}

