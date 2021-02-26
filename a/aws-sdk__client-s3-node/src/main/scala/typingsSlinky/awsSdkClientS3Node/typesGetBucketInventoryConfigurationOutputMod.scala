package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkClientS3Node.typesInventoryConfigurationMod.UnmarshalledInventoryConfiguration
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetBucketInventoryConfigurationOutputMod {
  
  @js.native
  trait GetBucketInventoryConfigurationOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * <p>Specifies the inventory configuration.</p>
      */
    var InventoryConfiguration: js.UndefOr[UnmarshalledInventoryConfiguration] = js.native
  }
  object GetBucketInventoryConfigurationOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): GetBucketInventoryConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBucketInventoryConfigurationOutput]
    }
    
    @scala.inline
    implicit class GetBucketInventoryConfigurationOutputMutableBuilder[Self <: GetBucketInventoryConfigurationOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInventoryConfiguration(value: UnmarshalledInventoryConfiguration): Self = StObject.set(x, "InventoryConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInventoryConfigurationUndefined: Self = StObject.set(x, "InventoryConfiguration", js.undefined)
    }
  }
}
