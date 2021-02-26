package typingsSlinky.awsSdkClientKmsBrowser

import typingsSlinky.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKmsBrowser.typesAliasListEntryMod.UnmarshalledAliasListEntry
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListAliasesOutputMod {
  
  @js.native
  trait ListAliasesOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>A list of aliases.</p>
      */
    var Aliases: js.UndefOr[js.Array[UnmarshalledAliasListEntry]] = js.native
    
    /**
      * <p>When <code>Truncated</code> is true, this element is present and contains the value to use for the <code>Marker</code> parameter in a subsequent request.</p>
      */
    var NextMarker: js.UndefOr[String] = js.native
    
    /**
      * <p>A flag that indicates whether there are more items in the list. When this value is true, the list in this response is truncated. To get more items, pass the value of the <code>NextMarker</code> element in this response to the <code>Marker</code> parameter in a subsequent request.</p>
      */
    var Truncated: js.UndefOr[Boolean] = js.native
  }
  object ListAliasesOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): ListAliasesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListAliasesOutput]
    }
    
    @scala.inline
    implicit class ListAliasesOutputMutableBuilder[Self <: ListAliasesOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliases(value: js.Array[UnmarshalledAliasListEntry]): Self = StObject.set(x, "Aliases", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasesUndefined: Self = StObject.set(x, "Aliases", js.undefined)
      
      @scala.inline
      def setAliasesVarargs(value: UnmarshalledAliasListEntry*): Self = StObject.set(x, "Aliases", js.Array(value :_*))
      
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
