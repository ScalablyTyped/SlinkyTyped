package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDeleteBucketAnalyticsConfigurationOutputMod {
  
  @js.native
  trait DeleteBucketAnalyticsConfigurationOutput
    extends MetadataBearer
       with _OutputTypesUnion
  object DeleteBucketAnalyticsConfigurationOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): DeleteBucketAnalyticsConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteBucketAnalyticsConfigurationOutput]
    }
  }
}
