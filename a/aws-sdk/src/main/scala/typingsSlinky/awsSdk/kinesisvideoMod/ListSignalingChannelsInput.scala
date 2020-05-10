package typingsSlinky.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSignalingChannelsInput extends js.Object {
  /**
    * Optional: Returns only the channels that satisfy a specific condition.
    */
  var ChannelNameCondition: js.UndefOr[typingsSlinky.awsSdk.kinesisvideoMod.ChannelNameCondition] = js.native
  /**
    * The maximum number of channels to return in the response. The default is 500.
    */
  var MaxResults: js.UndefOr[ListStreamsInputLimit] = js.native
  /**
    * If you specify this parameter, when the result of a ListSignalingChannels operation is truncated, the call returns the NextToken in the response. To get another batch of channels, provide this token in your next request.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.kinesisvideoMod.NextToken] = js.native
}

object ListSignalingChannelsInput {
  @scala.inline
  def apply(): ListSignalingChannelsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSignalingChannelsInput]
  }
  @scala.inline
  implicit class ListSignalingChannelsInputOps[Self <: ListSignalingChannelsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannelNameCondition(value: ChannelNameCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChannelNameCondition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelNameCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChannelNameCondition")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: ListStreamsInputLimit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(js.undefined)
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

