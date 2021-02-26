package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.typesSegmentResponseMod.UnmarshalledSegmentResponse
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDeleteSegmentOutputMod {
  
  @js.native
  trait DeleteSegmentOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * Segment definition.
      */
    var SegmentResponse: UnmarshalledSegmentResponse = js.native
  }
  object DeleteSegmentOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata, SegmentResponse: UnmarshalledSegmentResponse): DeleteSegmentOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], SegmentResponse = SegmentResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteSegmentOutput]
    }
    
    @scala.inline
    implicit class DeleteSegmentOutputMutableBuilder[Self <: DeleteSegmentOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmentResponse(value: UnmarshalledSegmentResponse): Self = StObject.set(x, "SegmentResponse", value.asInstanceOf[js.Any])
    }
  }
}
