package typingsSlinky.awsSdkClientS3Browser

import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.typesTagMod.UnmarshalledTag
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetBucketTaggingOutputMod {
  
  @js.native
  trait GetBucketTaggingOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * _TagSet shape
      */
    var TagSet: js.Array[UnmarshalledTag] = js.native
  }
  object GetBucketTaggingOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata, TagSet: js.Array[UnmarshalledTag]): GetBucketTaggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], TagSet = TagSet.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBucketTaggingOutput]
    }
    
    @scala.inline
    implicit class GetBucketTaggingOutputMutableBuilder[Self <: GetBucketTaggingOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTagSet(value: js.Array[UnmarshalledTag]): Self = StObject.set(x, "TagSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagSetVarargs(value: UnmarshalledTag*): Self = StObject.set(x, "TagSet", js.Array(value :_*))
    }
  }
}
