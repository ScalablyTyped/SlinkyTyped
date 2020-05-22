package typingsSlinky.awsSdkClientS3Node.typesGetBucketReplicationOutputMod

import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkClientS3Node.typesReplicationConfigurationMod.UnmarshalledReplicationConfiguration
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketReplicationOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * <p>Container for replication rules. You can add as many as 1,000 rules. Total replication configuration size can be up to 2 MB.</p>
    */
  var ReplicationConfiguration: js.UndefOr[UnmarshalledReplicationConfiguration] = js.undefined
}

object GetBucketReplicationOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, ReplicationConfiguration: UnmarshalledReplicationConfiguration = null): GetBucketReplicationOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (ReplicationConfiguration != null) __obj.updateDynamic("ReplicationConfiguration")(ReplicationConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketReplicationOutput]
  }
}

