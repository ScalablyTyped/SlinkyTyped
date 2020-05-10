package typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteApnsSandboxChannelOutputMod

import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.typesApnssandboxchannelresponseMod.UnmarshalledAPNSSandboxChannelResponse
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteApnsSandboxChannelOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * Apple Development Push Notification Service channel definition.
    */
  var APNSSandboxChannelResponse: UnmarshalledAPNSSandboxChannelResponse = js.native
}

object DeleteApnsSandboxChannelOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, APNSSandboxChannelResponse: UnmarshalledAPNSSandboxChannelResponse): DeleteApnsSandboxChannelOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], APNSSandboxChannelResponse = APNSSandboxChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApnsSandboxChannelOutput]
  }
  @scala.inline
  implicit class DeleteApnsSandboxChannelOutputOps[Self <: DeleteApnsSandboxChannelOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$metadata(value: ResponseMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAPNSSandboxChannelResponse(value: UnmarshalledAPNSSandboxChannelResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("APNSSandboxChannelResponse")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

