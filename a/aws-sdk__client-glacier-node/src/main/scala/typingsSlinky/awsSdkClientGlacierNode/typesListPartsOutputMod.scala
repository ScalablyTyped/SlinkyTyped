package typingsSlinky.awsSdkClientGlacierNode

import typingsSlinky.awsSdkClientGlacierNode.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.typesPartListElementMod.UnmarshalledPartListElement
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListPartsOutputMod {
  
  @js.native
  trait ListPartsOutput extends _OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>The description of the archive that was specified in the Initiate Multipart Upload request.</p>
      */
    var ArchiveDescription: js.UndefOr[String] = js.native
    
    /**
      * <p>The UTC time at which the multipart upload was initiated.</p>
      */
    var CreationDate: js.UndefOr[String] = js.native
    
    /**
      * <p>An opaque string that represents where to continue pagination of the results. You use the marker in a new List Parts request to obtain more jobs in the list. If there are no more parts, this value is <code>null</code>.</p>
      */
    var Marker: js.UndefOr[String] = js.native
    
    /**
      * <p>The ID of the upload to which the parts are associated.</p>
      */
    var MultipartUploadId: js.UndefOr[String] = js.native
    
    /**
      * <p>The part size in bytes. This is the same value that you specified in the Initiate Multipart Upload request.</p>
      */
    var PartSizeInBytes: js.UndefOr[Double] = js.native
    
    /**
      * <p>A list of the part sizes of the multipart upload. Each object in the array contains a <code>RangeBytes</code> and <code>sha256-tree-hash</code> name/value pair.</p>
      */
    var Parts: js.UndefOr[js.Array[UnmarshalledPartListElement]] = js.native
    
    /**
      * <p>The Amazon Resource Name (ARN) of the vault to which the multipart upload was initiated.</p>
      */
    var VaultARN: js.UndefOr[String] = js.native
  }
  object ListPartsOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): ListPartsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListPartsOutput]
    }
    
    @scala.inline
    implicit class ListPartsOutputMutableBuilder[Self <: ListPartsOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArchiveDescription(value: String): Self = StObject.set(x, "ArchiveDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArchiveDescriptionUndefined: Self = StObject.set(x, "ArchiveDescription", js.undefined)
      
      @scala.inline
      def setCreationDate(value: String): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
      
      @scala.inline
      def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
      
      @scala.inline
      def setMultipartUploadId(value: String): Self = StObject.set(x, "MultipartUploadId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipartUploadIdUndefined: Self = StObject.set(x, "MultipartUploadId", js.undefined)
      
      @scala.inline
      def setPartSizeInBytes(value: Double): Self = StObject.set(x, "PartSizeInBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartSizeInBytesUndefined: Self = StObject.set(x, "PartSizeInBytes", js.undefined)
      
      @scala.inline
      def setParts(value: js.Array[UnmarshalledPartListElement]): Self = StObject.set(x, "Parts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartsUndefined: Self = StObject.set(x, "Parts", js.undefined)
      
      @scala.inline
      def setPartsVarargs(value: UnmarshalledPartListElement*): Self = StObject.set(x, "Parts", js.Array(value :_*))
      
      @scala.inline
      def setVaultARN(value: String): Self = StObject.set(x, "VaultARN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVaultARNUndefined: Self = StObject.set(x, "VaultARN", js.undefined)
    }
  }
}
