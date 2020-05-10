package typingsSlinky.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSignalingChannelInput extends js.Object {
  /**
    * A name for the signaling channel that you are creating. It must be unique for each account and region.
    */
  var ChannelName: typingsSlinky.awsSdk.kinesisvideoMod.ChannelName = js.native
  /**
    * A type of the signaling channel that you are creating. Currently, SINGLE_MASTER is the only supported channel type. 
    */
  var ChannelType: js.UndefOr[typingsSlinky.awsSdk.kinesisvideoMod.ChannelType] = js.native
  /**
    * A structure containing the configuration for the SINGLE_MASTER channel type. 
    */
  var SingleMasterConfiguration: js.UndefOr[typingsSlinky.awsSdk.kinesisvideoMod.SingleMasterConfiguration] = js.native
  /**
    * A set of tags (key/value pairs) that you want to associate with this channel.
    */
  var Tags: js.UndefOr[TagOnCreateList] = js.native
}

object CreateSignalingChannelInput {
  @scala.inline
  def apply(ChannelName: ChannelName): CreateSignalingChannelInput = {
    val __obj = js.Dynamic.literal(ChannelName = ChannelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSignalingChannelInput]
  }
  @scala.inline
  implicit class CreateSignalingChannelInputOps[Self <: CreateSignalingChannelInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannelName(value: ChannelName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChannelName")(value.asInstanceOf[js.Any])
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
    def withTags(value: TagOnCreateList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

