package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateChannelRequest extends js.Object {
  /**
    * The class for this channel. STANDARD for a channel with two pipelines or SINGLE_PIPELINE for a channel with one pipeline.
    */
  var ChannelClass: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.ChannelClass] = js.native
  var Destinations: js.UndefOr[listOfOutputDestination] = js.native
  var EncoderSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.EncoderSettings] = js.native
  /**
    * List of input attachments for channel.
    */
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
    * Name of channel.
    */
  var Name: js.UndefOr[string] = js.native
  /**
    * Unique request ID to be specified. This is needed to prevent retries from
  creating multiple resources.
    */
  var RequestId: js.UndefOr[string] = js.native
  /**
    * Deprecated field that's only usable by whitelisted customers.
    */
  var Reserved: js.UndefOr[string] = js.native
  /**
    * An optional Amazon Resource Name (ARN) of the role to assume when running the Channel.
    */
  var RoleArn: js.UndefOr[string] = js.native
  /**
    * A collection of key-value pairs.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.Tags] = js.native
}

object CreateChannelRequest {
  @scala.inline
  def apply(): CreateChannelRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateChannelRequest]
  }
  @scala.inline
  implicit class CreateChannelRequestOps[Self <: CreateChannelRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannelClass(value: ChannelClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChannelClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChannelClass")(js.undefined)
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
    def withRequestId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestId")(js.undefined)
        ret
    }
    @scala.inline
    def withReserved(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reserved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReserved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reserved")(js.undefined)
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
    @scala.inline
    def withTags(value: Tags): Self = {
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

