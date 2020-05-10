package typingsSlinky.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeChannelResponse extends js.Object {
  /**
    * An object that contains information about the channel.
    */
  var channel: js.UndefOr[Channel] = js.native
  /**
    * Statistics about the channel. Included if the 'includeStatistics' parameter is set to true in the request.
    */
  var statistics: js.UndefOr[ChannelStatistics] = js.native
}

object DescribeChannelResponse {
  @scala.inline
  def apply(): DescribeChannelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeChannelResponse]
  }
  @scala.inline
  implicit class DescribeChannelResponseOps[Self <: DescribeChannelResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannel(value: Channel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(js.undefined)
        ret
    }
    @scala.inline
    def withStatistics(value: ChannelStatistics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statistics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatistics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statistics")(js.undefined)
        ret
    }
  }
  
}

