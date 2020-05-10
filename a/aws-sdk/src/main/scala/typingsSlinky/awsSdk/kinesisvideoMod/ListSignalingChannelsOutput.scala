package typingsSlinky.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSignalingChannelsOutput extends js.Object {
  /**
    * An array of ChannelInfo objects.
    */
  var ChannelInfoList: js.UndefOr[typingsSlinky.awsSdk.kinesisvideoMod.ChannelInfoList] = js.native
  /**
    * If the response is truncated, the call returns this element with a token. To get the next batch of streams, use this token in your next request.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.kinesisvideoMod.NextToken] = js.native
}

object ListSignalingChannelsOutput {
  @scala.inline
  def apply(): ListSignalingChannelsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSignalingChannelsOutput]
  }
  @scala.inline
  implicit class ListSignalingChannelsOutputOps[Self <: ListSignalingChannelsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannelInfoList(value: ChannelInfoList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChannelInfoList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelInfoList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChannelInfoList")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

