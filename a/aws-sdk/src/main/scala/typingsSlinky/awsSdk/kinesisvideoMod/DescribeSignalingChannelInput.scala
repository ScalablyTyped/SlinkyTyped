package typingsSlinky.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSignalingChannelInput extends js.Object {
  /**
    * The ARN of the signaling channel that you want to describe.
    */
  var ChannelARN: js.UndefOr[ResourceARN] = js.native
  /**
    * The name of the signaling channel that you want to describe.
    */
  var ChannelName: js.UndefOr[typingsSlinky.awsSdk.kinesisvideoMod.ChannelName] = js.native
}

object DescribeSignalingChannelInput {
  @scala.inline
  def apply(): DescribeSignalingChannelInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSignalingChannelInput]
  }
  @scala.inline
  implicit class DescribeSignalingChannelInputOps[Self <: DescribeSignalingChannelInput] (val x: Self) extends AnyVal {
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
  }
  
}

