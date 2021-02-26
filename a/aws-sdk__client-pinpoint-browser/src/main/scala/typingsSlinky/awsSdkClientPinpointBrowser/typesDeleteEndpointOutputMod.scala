package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.typesEndpointResponseMod.UnmarshalledEndpointResponse
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDeleteEndpointOutputMod {
  
  @js.native
  trait DeleteEndpointOutput extends OutputTypesUnion {
    
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
  object DeleteEndpointOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata, EndpointResponse: UnmarshalledEndpointResponse): DeleteEndpointOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], EndpointResponse = EndpointResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteEndpointOutput]
    }
    
    @scala.inline
    implicit class DeleteEndpointOutputMutableBuilder[Self <: DeleteEndpointOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointResponse(value: UnmarshalledEndpointResponse): Self = StObject.set(x, "EndpointResponse", value.asInstanceOf[js.Any])
    }
  }
}
