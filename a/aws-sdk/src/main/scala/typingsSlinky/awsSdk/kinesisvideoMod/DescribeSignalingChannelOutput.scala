package typingsSlinky.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSignalingChannelOutput extends js.Object {
  /**
    * A structure that encapsulates the specified signaling channel's metadata and properties.
    */
  var ChannelInfo: js.UndefOr[typingsSlinky.awsSdk.kinesisvideoMod.ChannelInfo] = js.native
}

object DescribeSignalingChannelOutput {
  @scala.inline
  def apply(): DescribeSignalingChannelOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSignalingChannelOutput]
  }
  @scala.inline
  implicit class DescribeSignalingChannelOutputOps[Self <: DescribeSignalingChannelOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannelInfo(value: ChannelInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChannelInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChannelInfo")(js.undefined)
        ret
    }
  }
  
}

