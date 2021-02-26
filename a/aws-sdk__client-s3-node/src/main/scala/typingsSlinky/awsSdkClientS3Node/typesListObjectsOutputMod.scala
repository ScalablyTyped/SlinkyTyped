package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.url
import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkClientS3Node.typesCommonPrefixMod.UnmarshalledCommonPrefix
import typingsSlinky.awsSdkClientS3Node.typesObjectMod.UnmarshalledObject
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListObjectsOutputMod {
  
  @js.native
  trait ListObjectsOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * _CommonPrefixList shape
      */
    var CommonPrefixes: js.UndefOr[js.Array[UnmarshalledCommonPrefix]] = js.native
    
    /**
      * _ObjectList shape
      */
    var Contents: js.UndefOr[js.Array[UnmarshalledObject]] = js.native
    
    /**
      * _Delimiter shape
      */
    var Delimiter: js.UndefOr[String] = js.native
    
    /**
      * <p>Encoding type used by Amazon S3 to encode object keys in the response.</p>
      */
    var EncodingType: js.UndefOr[url | String] = js.native
    
    /**
      * <p>A flag that indicates whether or not Amazon S3 returned all of the results that satisfied the search criteria.</p>
      */
    var IsTruncated: js.UndefOr[Boolean] = js.native
    
    /**
      * _Marker shape
      */
    var Marker: js.UndefOr[String] = js.native
    
    /**
      * _MaxKeys shape
      */
    var MaxKeys: js.UndefOr[Double] = js.native
    
    /**
      * _BucketName shape
      */
    var Name: js.UndefOr[String] = js.native
    
    /**
      * <p>When response is truncated (the IsTruncated element value in the response is true), you can use the key name in this field as marker in the subsequent request to get next set of objects. Amazon S3 lists objects in alphabetical order Note: This element is returned only if you have delimiter request parameter specified. If response does not include the NextMaker and it is truncated, you can use the value of the last Key in the response as the marker in the subsequent request to get the next set of object keys.</p>
      */
    var NextMarker: js.UndefOr[String] = js.native
    
    /**
      * _Prefix shape
      */
    var Prefix: js.UndefOr[String] = js.native
  }
  object ListObjectsOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): ListObjectsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListObjectsOutput]
    }
    
    @scala.inline
    implicit class ListObjectsOutputMutableBuilder[Self <: ListObjectsOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommonPrefixes(value: js.Array[UnmarshalledCommonPrefix]): Self = StObject.set(x, "CommonPrefixes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommonPrefixesUndefined: Self = StObject.set(x, "CommonPrefixes", js.undefined)
      
      @scala.inline
      def setCommonPrefixesVarargs(value: UnmarshalledCommonPrefix*): Self = StObject.set(x, "CommonPrefixes", js.Array(value :_*))
      
      @scala.inline
      def setContents(value: js.Array[UnmarshalledObject]): Self = StObject.set(x, "Contents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentsUndefined: Self = StObject.set(x, "Contents", js.undefined)
      
      @scala.inline
      def setContentsVarargs(value: UnmarshalledObject*): Self = StObject.set(x, "Contents", js.Array(value :_*))
      
      @scala.inline
      def setDelimiter(value: String): Self = StObject.set(x, "Delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiterUndefined: Self = StObject.set(x, "Delimiter", js.undefined)
      
      @scala.inline
      def setEncodingType(value: url | String): Self = StObject.set(x, "EncodingType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingTypeUndefined: Self = StObject.set(x, "EncodingType", js.undefined)
      
      @scala.inline
      def setIsTruncated(value: Boolean): Self = StObject.set(x, "IsTruncated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsTruncatedUndefined: Self = StObject.set(x, "IsTruncated", js.undefined)
      
      @scala.inline
      def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
      
      @scala.inline
      def setMaxKeys(value: Double): Self = StObject.set(x, "MaxKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxKeysUndefined: Self = StObject.set(x, "MaxKeys", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
      
      @scala.inline
      def setNextMarker(value: String): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
    }
  }
}
