package typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateApnsVoipChannelOutputMod

import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.typesApnsvoipchannelresponseMod.UnmarshalledAPNSVoipChannelResponse
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateApnsVoipChannelOutput extends OutputTypesUnion {
  
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  
  /**
    * Apple VoIP Push Notification Service channel definition.
    */
  var APNSVoipChannelResponse: UnmarshalledAPNSVoipChannelResponse = js.native
}
object UpdateApnsVoipChannelOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata, APNSVoipChannelResponse: UnmarshalledAPNSVoipChannelResponse): UpdateApnsVoipChannelOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], APNSVoipChannelResponse = APNSVoipChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApnsVoipChannelOutput]
  }
  
  @scala.inline
  implicit class UpdateApnsVoipChannelOutputOps[Self <: UpdateApnsVoipChannelOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set$metadata(value: ResponseMetadata): Self = this.set("$metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAPNSVoipChannelResponse(value: UnmarshalledAPNSVoipChannelResponse): Self = this.set("APNSVoipChannelResponse", value.asInstanceOf[js.Any])
  }
}
