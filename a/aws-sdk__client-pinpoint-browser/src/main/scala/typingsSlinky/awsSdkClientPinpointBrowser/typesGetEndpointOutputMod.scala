package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.typesEndpointResponseMod.UnmarshalledEndpointResponse
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetEndpointOutputMod {
  
  @js.native
  trait GetEndpointOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * Endpoint response
      */
    var EndpointResponse: UnmarshalledEndpointResponse = js.native
  }
  object GetEndpointOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata, EndpointResponse: UnmarshalledEndpointResponse): GetEndpointOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], EndpointResponse = EndpointResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetEndpointOutput]
    }
    
    @scala.inline
    implicit class GetEndpointOutputMutableBuilder[Self <: GetEndpointOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointResponse(value: UnmarshalledEndpointResponse): Self = StObject.set(x, "EndpointResponse", value.asInstanceOf[js.Any])
    }
  }
}
