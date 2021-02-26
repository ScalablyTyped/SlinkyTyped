package typingsSlinky.awsSdkClientS3Browser

import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.typesReplicationConfigurationMod.UnmarshalledReplicationConfiguration
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetBucketReplicationOutputMod {
  
  @js.native
  trait GetBucketReplicationOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * <p>Container for replication rules. You can add as many as 1,000 rules. Total replication configuration size can be up to 2 MB.</p>
      */
    var ReplicationConfiguration: js.UndefOr[UnmarshalledReplicationConfiguration] = js.native
  }
  object GetBucketReplicationOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): GetBucketReplicationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBucketReplicationOutput]
    }
    
    @scala.inline
    implicit class GetBucketReplicationOutputMutableBuilder[Self <: GetBucketReplicationOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReplicationConfiguration(value: UnmarshalledReplicationConfiguration): Self = StObject.set(x, "ReplicationConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicationConfigurationUndefined: Self = StObject.set(x, "ReplicationConfiguration", js.undefined)
    }
  }
}
