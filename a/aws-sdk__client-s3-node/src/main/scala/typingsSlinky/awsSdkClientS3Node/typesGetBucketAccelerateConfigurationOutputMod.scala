package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Enabled
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Suspended
import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetBucketAccelerateConfigurationOutputMod {
  
  @js.native
  trait GetBucketAccelerateConfigurationOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * <p>The accelerate configuration of the bucket.</p>
      */
    var Status: js.UndefOr[Enabled | Suspended | String] = js.native
  }
  object GetBucketAccelerateConfigurationOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): GetBucketAccelerateConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBucketAccelerateConfigurationOutput]
    }
    
    @scala.inline
    implicit class GetBucketAccelerateConfigurationOutputMutableBuilder[Self <: GetBucketAccelerateConfigurationOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStatus(value: Enabled | Suspended | String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    }
  }
}
