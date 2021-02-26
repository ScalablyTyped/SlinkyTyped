package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkClientS3Node.typesServerSideEncryptionConfigurationMod.UnmarshalledServerSideEncryptionConfiguration
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetBucketEncryptionOutputMod {
  
  @js.native
  trait GetBucketEncryptionOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * <p>Container for server-side encryption configuration rules. Currently S3 supports one rule only.</p>
      */
    var ServerSideEncryptionConfiguration: js.UndefOr[UnmarshalledServerSideEncryptionConfiguration] = js.native
  }
  object GetBucketEncryptionOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): GetBucketEncryptionOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBucketEncryptionOutput]
    }
    
    @scala.inline
    implicit class GetBucketEncryptionOutputMutableBuilder[Self <: GetBucketEncryptionOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setServerSideEncryptionConfiguration(value: UnmarshalledServerSideEncryptionConfiguration): Self = StObject.set(x, "ServerSideEncryptionConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerSideEncryptionConfigurationUndefined: Self = StObject.set(x, "ServerSideEncryptionConfiguration", js.undefined)
    }
  }
}
