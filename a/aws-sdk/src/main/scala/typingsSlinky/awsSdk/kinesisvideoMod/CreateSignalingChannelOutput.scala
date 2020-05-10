package typingsSlinky.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSignalingChannelOutput extends js.Object {
  /**
    * The ARN of the created channel.
    */
  var ChannelARN: js.UndefOr[ResourceARN] = js.native
}

object CreateSignalingChannelOutput {
  @scala.inline
  def apply(): CreateSignalingChannelOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSignalingChannelOutput]
  }
  @scala.inline
  implicit class CreateSignalingChannelOutputOps[Self <: CreateSignalingChannelOutput] (val x: Self) extends AnyVal {
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
  }
  
}

