package typingsSlinky.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSignalingChannelInput extends js.Object {
  /**
    * The ARN of the signaling channel that you want to delete.
    */
  var ChannelARN: ResourceARN = js.native
  /**
    * The current version of the signaling channel that you want to delete. You can obtain the current version by invoking the DescribeSignalingChannel or ListSignalingChannels APIs.
    */
  var CurrentVersion: js.UndefOr[Version] = js.native
}

object DeleteSignalingChannelInput {
  @scala.inline
  def apply(ChannelARN: ResourceARN): DeleteSignalingChannelInput = {
    val __obj = js.Dynamic.literal(ChannelARN = ChannelARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSignalingChannelInput]
  }
  @scala.inline
  implicit class DeleteSignalingChannelInputOps[Self <: DeleteSignalingChannelInput] (val x: Self) extends AnyVal {
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
    def withoutCurrentVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentVersion")(js.undefined)
        ret
    }
  }
  
}

