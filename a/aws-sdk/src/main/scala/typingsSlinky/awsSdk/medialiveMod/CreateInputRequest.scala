package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateInputRequest extends js.Object {
  /**
    * Destination settings for PUSH type inputs.
    */
  var Destinations: js.UndefOr[listOfInputDestinationRequest] = js.native
  /**
    * A list of security groups referenced by IDs to attach to the input.
    */
  var InputSecurityGroups: js.UndefOr[listOfString] = js.native
  /**
    * A list of the MediaConnect Flows that you want to use in this input. You can specify as few as one
  Flow and presently, as many as two. The only requirement is when you have more than one is that each Flow is in a
  separate Availability Zone as this ensures your EML input is redundant to AZ issues.
    */
  var MediaConnectFlows: js.UndefOr[listOfMediaConnectFlowRequest] = js.native
  /**
    * Name of the input.
    */
  var Name: js.UndefOr[string] = js.native
  /**
    * Unique identifier of the request to ensure the request is handled
  exactly once in case of retries.
    */
  var RequestId: js.UndefOr[string] = js.native
  /**
    * The Amazon Resource Name (ARN) of the role this input assumes during and after creation.
    */
  var RoleArn: js.UndefOr[string] = js.native
  /**
    * The source URLs for a PULL-type input. Every PULL type input needs
  exactly two source URLs for redundancy.
  Only specify sources for PULL type Inputs. Leave Destinations empty.
    */
  var Sources: js.UndefOr[listOfInputSourceRequest] = js.native
  /**
    * A collection of key-value pairs.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.Tags] = js.native
  var Type: js.UndefOr[InputType] = js.native
  var Vpc: js.UndefOr[InputVpcRequest] = js.native
}

object CreateInputRequest {
  @scala.inline
  def apply(): CreateInputRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateInputRequest]
  }
  @scala.inline
  implicit class CreateInputRequestOps[Self <: CreateInputRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinations(value: listOfInputDestinationRequest): Self = {
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
    def withInputSecurityGroups(value: listOfString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputSecurityGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputSecurityGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputSecurityGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaConnectFlows(value: listOfMediaConnectFlowRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MediaConnectFlows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaConnectFlows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MediaConnectFlows")(js.undefined)
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
    def withSources(value: listOfInputSourceRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sources")(js.undefined)
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
    @scala.inline
    def withType(value: InputType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
    @scala.inline
    def withVpc(value: InputVpcRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Vpc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Vpc")(js.undefined)
        ret
    }
  }
  
}

