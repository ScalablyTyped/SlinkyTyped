package typingsSlinky.awsSdkClientPinpointBrowser.typesSendMessagesOutputMod

import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.typesMessageResponseMod.UnmarshalledMessageResponse
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendMessagesOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * Send message response.
    */
  var MessageResponse: UnmarshalledMessageResponse
}

object SendMessagesOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, MessageResponse: UnmarshalledMessageResponse): SendMessagesOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], MessageResponse = MessageResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendMessagesOutput]
  }
}

