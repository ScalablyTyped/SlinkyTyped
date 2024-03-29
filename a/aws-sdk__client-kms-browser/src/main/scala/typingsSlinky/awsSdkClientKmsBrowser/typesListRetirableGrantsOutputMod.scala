package typingsSlinky.awsSdkClientKmsBrowser

import typingsSlinky.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKmsBrowser.typesGrantListEntryMod.UnmarshalledGrantListEntry
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListRetirableGrantsOutputMod {
  
  @js.native
  trait ListRetirableGrantsOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>A list of grants.</p>
      */
    var Grants: js.UndefOr[js.Array[UnmarshalledGrantListEntry]] = js.native
    
    /**
      * <p>When <code>Truncated</code> is true, this element is present and contains the value to use for the <code>Marker</code> parameter in a subsequent request.</p>
      */
    var NextMarker: js.UndefOr[String] = js.native
    
    /**
      * <p>A flag that indicates whether there are more items in the list. When this value is true, the list in this response is truncated. To get more items, pass the value of the <code>NextMarker</code> element in this response to the <code>Marker</code> parameter in a subsequent request.</p>
      */
    var Truncated: js.UndefOr[Boolean] = js.native
  }
  object ListRetirableGrantsOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): ListRetirableGrantsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListRetirableGrantsOutput]
    }
    
    @scala.inline
    implicit class ListRetirableGrantsOutputMutableBuilder[Self <: ListRetirableGrantsOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrants(value: js.Array[UnmarshalledGrantListEntry]): Self = StObject.set(x, "Grants", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrantsUndefined: Self = StObject.set(x, "Grants", js.undefined)
      
      @scala.inline
      def setGrantsVarargs(value: UnmarshalledGrantListEntry*): Self = StObject.set(x, "Grants", js.Array(value :_*))
      
      @scala.inline
      def setNextMarker(value: String): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
      
      @scala.inline
      def setTruncated(value: Boolean): Self = StObject.set(x, "Truncated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTruncatedUndefined: Self = StObject.set(x, "Truncated", js.undefined)
    }
  }
}
