package typingsSlinky.awsSdkClientS3Browser

import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.typesBucketMod.UnmarshalledBucket
import typingsSlinky.awsSdkClientS3Browser.typesOwnerMod.UnmarshalledOwner
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListBucketsOutputMod {
  
  @js.native
  trait ListBucketsOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * _Buckets shape
      */
    var Buckets: js.UndefOr[js.Array[UnmarshalledBucket]] = js.native
    
    /**
      * _Owner shape
      */
    var Owner: js.UndefOr[UnmarshalledOwner] = js.native
  }
  object ListBucketsOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): ListBucketsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListBucketsOutput]
    }
    
    @scala.inline
    implicit class ListBucketsOutputMutableBuilder[Self <: ListBucketsOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuckets(value: js.Array[UnmarshalledBucket]): Self = StObject.set(x, "Buckets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBucketsUndefined: Self = StObject.set(x, "Buckets", js.undefined)
      
      @scala.inline
      def setBucketsVarargs(value: UnmarshalledBucket*): Self = StObject.set(x, "Buckets", js.Array(value :_*))
      
      @scala.inline
      def setOwner(value: UnmarshalledOwner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    }
  }
}
