package typingsSlinky.awsSdkClientPinpointBrowser.typesSendUsersMessagesOutputMod

import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.typesSendUsersMessageResponseMod.UnmarshalledSendUsersMessageResponse
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendUsersMessagesOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * User send message response.
    */
  var SendUsersMessageResponse: UnmarshalledSendUsersMessageResponse = js.native
}

object SendUsersMessagesOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, SendUsersMessageResponse: UnmarshalledSendUsersMessageResponse): SendUsersMessagesOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], SendUsersMessageResponse = SendUsersMessageResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendUsersMessagesOutput]
  }
  @scala.inline
  implicit class SendUsersMessagesOutputOps[Self <: SendUsersMessagesOutput] (val x: Self) extends AnyVal {
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
    def withSendUsersMessageResponse(value: UnmarshalledSendUsersMessageResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SendUsersMessageResponse")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

