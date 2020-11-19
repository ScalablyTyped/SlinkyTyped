package typingsSlinky.awsSdkClientPinpointBrowser.typesGetAppOutputMod

import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.typesApplicationResponseMod.UnmarshalledApplicationResponse
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAppOutput extends OutputTypesUnion {
  
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  
  /**
    * Application Response.
    */
  var ApplicationResponse: UnmarshalledApplicationResponse = js.native
}
object GetAppOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata, ApplicationResponse: UnmarshalledApplicationResponse): GetAppOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ApplicationResponse = ApplicationResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAppOutput]
  }
  
  @scala.inline
  implicit class GetAppOutputOps[Self <: GetAppOutput] (val x: Self) extends AnyVal {
    
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
    def setApplicationResponse(value: UnmarshalledApplicationResponse): Self = this.set("ApplicationResponse", value.asInstanceOf[js.Any])
  }
}
