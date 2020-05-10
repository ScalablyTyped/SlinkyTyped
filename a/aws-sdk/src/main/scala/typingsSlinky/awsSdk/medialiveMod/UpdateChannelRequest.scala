package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateChannelRequest extends js.Object {
  /**
    * channel ID
    */
  var ChannelId: string = js.native
  /**
    * A list of output destinations for this channel.
    */
  var Destinations: js.UndefOr[listOfOutputDestination] = js.native
  /**
    * The encoder settings for this channel.
    */
  var EncoderSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.EncoderSettings] = js.native
  var InputAttachments: js.UndefOr[listOfInputAttachment] = js.native
  /**
    * Specification of input for this channel (max. bitrate, resolution, codec, etc.)
    */
  var InputSpecification: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.InputSpecification] = js.native
  /**
    * The log level to write to CloudWatch Logs.
    */
  var LogLevel: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.LogLevel] = js.native
  /**
    * The name of the channel.
    */
  var Name: js.UndefOr[string] = js.native
  /**
    * An optional Amazon Resource Name (ARN) of the role to assume when running the Channel. If you do not specify this on an update call but the role was previously set that role will be removed.
    */
  var RoleArn: js.UndefOr[string] = js.native
}

object UpdateChannelRequest {
  @scala.inline
  def apply(ChannelId: string): UpdateChannelRequest = {
    val __obj = js.Dynamic.literal(ChannelId = ChannelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateChannelRequest]
  }
  @scala.inline
  implicit class UpdateChannelRequestOps[Self <: UpdateChannelRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannelId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChannelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestinations(value: listOfOutputDestination): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Destinations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Destinations")(js.undefined)
        ret
    }
    @scala.inline
    def withEncoderSettings(value: EncoderSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncoderSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncoderSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncoderSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withInputAttachments(value: listOfInputAttachment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputAttachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputAttachments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputAttachments")(js.undefined)
        ret
    }
    @scala.inline
    def withInputSpecification(value: InputSpecification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputSpecification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputSpecification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputSpecification")(js.undefined)
        ret
    }
    @scala.inline
    def withLogLevel(value: LogLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(js.undefined)
        ret
    }
  }
  
}

