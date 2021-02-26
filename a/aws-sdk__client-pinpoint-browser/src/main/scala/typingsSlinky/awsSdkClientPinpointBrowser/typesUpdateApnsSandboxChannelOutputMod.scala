package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.typesApnssandboxchannelresponseMod.UnmarshalledAPNSSandboxChannelResponse
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUpdateApnsSandboxChannelOutputMod {
  
  @js.native
  trait UpdateApnsSandboxChannelOutput extends OutputTypesUnion {
    
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
  object UpdateApnsSandboxChannelOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata, APNSSandboxChannelResponse: UnmarshalledAPNSSandboxChannelResponse): UpdateApnsSandboxChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], APNSSandboxChannelResponse = APNSSandboxChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateApnsSandboxChannelOutput]
    }
    
    @scala.inline
    implicit class UpdateApnsSandboxChannelOutputMutableBuilder[Self <: UpdateApnsSandboxChannelOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAPNSSandboxChannelResponse(value: UnmarshalledAPNSSandboxChannelResponse): Self = StObject.set(x, "APNSSandboxChannelResponse", value.asInstanceOf[js.Any])
    }
  }
}
