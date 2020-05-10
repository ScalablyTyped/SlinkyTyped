package typingsSlinky.awsSdkClientPinpointBrowser.typesSendMessagesOutputMod

import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.typesMessageResponseMod.UnmarshalledMessageResponse
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendMessagesOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * Send message response.
    */
  var MessageResponse: UnmarshalledMessageResponse = js.native
}

object SendMessagesOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, MessageResponse: UnmarshalledMessageResponse): SendMessagesOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], MessageResponse = MessageResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendMessagesOutput]
  }
  @scala.inline
  implicit class SendMessagesOutputOps[Self <: SendMessagesOutput] (val x: Self) extends AnyVal {
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
    def withMessageResponse(value: UnmarshalledMessageResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageResponse")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

