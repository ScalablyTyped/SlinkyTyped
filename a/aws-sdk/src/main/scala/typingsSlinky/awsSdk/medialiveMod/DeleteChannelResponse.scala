package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteChannelResponse extends js.Object {
  /**
    * The unique arn of the channel.
    */
  var Arn: js.UndefOr[string] = js.native
  /**
    * The class for this channel. STANDARD for a channel with two pipelines or SINGLE_PIPELINE for a channel with one pipeline.
    */
  var ChannelClass: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.ChannelClass] = js.native
  /**
    * A list of destinations of the channel. For UDP outputs, there is one
  destination per output. For other types (HLS, for example), there is
  one destination per packager.
    */
  var Destinations: js.UndefOr[listOfOutputDestination] = js.native
  /**
    * The endpoints where outgoing connections initiate from
    */
  var EgressEndpoints: js.UndefOr[listOfChannelEgressEndpoint] = js.native
  var EncoderSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.EncoderSettings] = js.native
  /**
    * The unique id of the channel.
    */
  var Id: js.UndefOr[string] = js.native
  /**
    * List of input attachments for channel.
    */
  var InputAttachments: js.UndefOr[listOfInputAttachment] = js.native
  var InputSpecification: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.InputSpecification] = js.native
  /**
    * The log level being written to CloudWatch Logs.
    */
  var LogLevel: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.LogLevel] = js.native
  /**
    * The name of the channel. (user-mutable)
    */
  var Name: js.UndefOr[string] = js.native
  /**
    * Runtime details for the pipelines of a running channel.
    */
  var PipelineDetails: js.UndefOr[listOfPipelineDetail] = js.native
  /**
    * The number of currently healthy pipelines.
    */
  var PipelinesRunningCount: js.UndefOr[integer] = js.native
  /**
    * The Amazon Resource Name (ARN) of the role assumed when running the Channel.
    */
  var RoleArn: js.UndefOr[string] = js.native
  var State: js.UndefOr[ChannelState] = js.native
  /**
    * A collection of key-value pairs.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.Tags] = js.native
}

object DeleteChannelResponse {
  @scala.inline
  def apply(): DeleteChannelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteChannelResponse]
  }
  @scala.inline
  implicit class DeleteChannelResponseOps[Self <: DeleteChannelResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(js.undefined)
        ret
    }
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
    def withEgressEndpoints(value: listOfChannelEgressEndpoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EgressEndpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEgressEndpoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EgressEndpoints")(js.undefined)
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
    def withId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
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
    def withPipelineDetails(value: listOfPipelineDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PipelineDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPipelineDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PipelineDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withPipelinesRunningCount(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PipelinesRunningCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPipelinesRunningCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PipelinesRunningCount")(js.undefined)
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
    def withState(value: ChannelState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
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

