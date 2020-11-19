package typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteGcmChannelOutputMod

import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.typesGcmchannelresponseMod.UnmarshalledGCMChannelResponse
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteGcmChannelOutput extends OutputTypesUnion {
  
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  
  /**
    * Google Cloud Messaging channel definition
    */
  var GCMChannelResponse: UnmarshalledGCMChannelResponse = js.native
}
object DeleteGcmChannelOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata, GCMChannelResponse: UnmarshalledGCMChannelResponse): DeleteGcmChannelOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], GCMChannelResponse = GCMChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGcmChannelOutput]
  }
  
  @scala.inline
  implicit class DeleteGcmChannelOutputOps[Self <: DeleteGcmChannelOutput] (val x: Self) extends AnyVal {
    
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
    def setGCMChannelResponse(value: UnmarshalledGCMChannelResponse): Self = this.set("GCMChannelResponse", value.asInstanceOf[js.Any])
  }
}
