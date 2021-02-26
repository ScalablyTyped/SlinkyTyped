package typingsSlinky.awsSdkClientKinesisBrowser

import typingsSlinky.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.typesStreamDescriptionSummaryMod.UnmarshalledStreamDescriptionSummary
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDescribeStreamSummaryOutputMod {
  
  @js.native
  trait DescribeStreamSummaryOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>A <a>StreamDescriptionSummary</a> containing information about the stream.</p>
      */
    var StreamDescriptionSummary: UnmarshalledStreamDescriptionSummary = js.native
  }
  object DescribeStreamSummaryOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata, StreamDescriptionSummary: UnmarshalledStreamDescriptionSummary): DescribeStreamSummaryOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], StreamDescriptionSummary = StreamDescriptionSummary.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescribeStreamSummaryOutput]
    }
    
    @scala.inline
    implicit class DescribeStreamSummaryOutputMutableBuilder[Self <: DescribeStreamSummaryOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamDescriptionSummary(value: UnmarshalledStreamDescriptionSummary): Self = StObject.set(x, "StreamDescriptionSummary", value.asInstanceOf[js.Any])
    }
  }
}
