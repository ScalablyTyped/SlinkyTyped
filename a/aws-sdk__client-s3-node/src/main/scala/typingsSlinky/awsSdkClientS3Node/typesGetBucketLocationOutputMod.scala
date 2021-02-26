package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.EU
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`ap-northeast-1`
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`ap-south-1`
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`ap-southeast-1`
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`ap-southeast-2`
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`cn-north-1`
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`eu-central-1`
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`eu-west-1`
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`sa-east-1`
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`us-west-1`
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`us-west-2`
import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetBucketLocationOutputMod {
  
  @js.native
  trait GetBucketLocationOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * _BucketLocationConstraint shape
      */
    var LocationConstraint: js.UndefOr[
        EU | `eu-west-1` | `us-west-1` | `us-west-2` | `ap-south-1` | `ap-southeast-1` | `ap-southeast-2` | `ap-northeast-1` | `sa-east-1` | `cn-north-1` | `eu-central-1` | String
      ] = js.native
  }
  object GetBucketLocationOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): GetBucketLocationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBucketLocationOutput]
    }
    
    @scala.inline
    implicit class GetBucketLocationOutputMutableBuilder[Self <: GetBucketLocationOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocationConstraint(
        value: EU | `eu-west-1` | `us-west-1` | `us-west-2` | `ap-south-1` | `ap-southeast-1` | `ap-southeast-2` | `ap-northeast-1` | `sa-east-1` | `cn-north-1` | `eu-central-1` | String
      ): Self = StObject.set(x, "LocationConstraint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationConstraintUndefined: Self = StObject.set(x, "LocationConstraint", js.undefined)
    }
  }
}
