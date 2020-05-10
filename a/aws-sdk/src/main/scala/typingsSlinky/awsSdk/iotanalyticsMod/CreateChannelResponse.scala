package typingsSlinky.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateChannelResponse extends js.Object {
  /**
    * The ARN of the channel.
    */
  var channelArn: js.UndefOr[ChannelArn] = js.native
  /**
    * The name of the channel.
    */
  var channelName: js.UndefOr[ChannelName] = js.native
  /**
    * How long, in days, message data is kept for the channel.
    */
  var retentionPeriod: js.UndefOr[RetentionPeriod] = js.native
}

object CreateChannelResponse {
  @scala.inline
  def apply(): CreateChannelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateChannelResponse]
  }
  @scala.inline
  implicit class CreateChannelResponseOps[Self <: CreateChannelResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannelArn(value: ChannelArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelArn")(js.undefined)
        ret
    }
    @scala.inline
    def withChannelName(value: ChannelName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelName")(js.undefined)
        ret
    }
    @scala.inline
    def withRetentionPeriod(value: RetentionPeriod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retentionPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetentionPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retentionPeriod")(js.undefined)
        ret
    }
  }
  
}

