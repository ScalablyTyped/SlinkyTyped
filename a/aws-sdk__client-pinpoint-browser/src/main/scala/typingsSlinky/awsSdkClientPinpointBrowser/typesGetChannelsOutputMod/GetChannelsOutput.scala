package typingsSlinky.awsSdkClientPinpointBrowser.typesGetChannelsOutputMod

import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.typesChannelsResponseMod.UnmarshalledChannelsResponse
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetChannelsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * Get channels definition
    */
  var ChannelsResponse: UnmarshalledChannelsResponse = js.native
}

object GetChannelsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, ChannelsResponse: UnmarshalledChannelsResponse): GetChannelsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ChannelsResponse = ChannelsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetChannelsOutput]
  }
  @scala.inline
  implicit class GetChannelsOutputOps[Self <: GetChannelsOutput] (val x: Self) extends AnyVal {
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
    def withChannelsResponse(value: UnmarshalledChannelsResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChannelsResponse")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

