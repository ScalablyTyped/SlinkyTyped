package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.typesEmailChannelResponseMod.UnmarshalledEmailChannelResponse
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUpdateEmailChannelOutputMod {
  
  @js.native
  trait UpdateEmailChannelOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * Email Channel Response.
      */
    var EmailChannelResponse: UnmarshalledEmailChannelResponse = js.native
  }
  object UpdateEmailChannelOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata, EmailChannelResponse: UnmarshalledEmailChannelResponse): UpdateEmailChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], EmailChannelResponse = EmailChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateEmailChannelOutput]
    }
    
    @scala.inline
    implicit class UpdateEmailChannelOutputMutableBuilder[Self <: UpdateEmailChannelOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailChannelResponse(value: UnmarshalledEmailChannelResponse): Self = StObject.set(x, "EmailChannelResponse", value.asInstanceOf[js.Any])
    }
  }
}
