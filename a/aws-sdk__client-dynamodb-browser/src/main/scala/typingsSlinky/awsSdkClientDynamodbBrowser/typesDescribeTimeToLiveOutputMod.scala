package typingsSlinky.awsSdkClientDynamodbBrowser

import typingsSlinky.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.typesTimeToLiveDescriptionMod.UnmarshalledTimeToLiveDescription
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDescribeTimeToLiveOutputMod {
  
  @js.native
  trait DescribeTimeToLiveOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p/>
      */
    var TimeToLiveDescription: js.UndefOr[UnmarshalledTimeToLiveDescription] = js.native
  }
  object DescribeTimeToLiveOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): DescribeTimeToLiveOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescribeTimeToLiveOutput]
    }
    
    @scala.inline
    implicit class DescribeTimeToLiveOutputMutableBuilder[Self <: DescribeTimeToLiveOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeToLiveDescription(value: UnmarshalledTimeToLiveDescription): Self = StObject.set(x, "TimeToLiveDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeToLiveDescriptionUndefined: Self = StObject.set(x, "TimeToLiveDescription", js.undefined)
    }
  }
}
