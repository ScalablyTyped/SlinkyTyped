package typingsSlinky.awsSdkClientS3Node.typesGetBucketReplicationOutputMod

import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Node.typesReplicationConfigurationMod.UnmarshalledReplicationConfiguration
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketReplicationOutput
  extends MetadataBearer
     with OutputTypesUnion {
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
  implicit class GetBucketReplicationOutputOps[Self <: GetBucketReplicationOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReplicationConfiguration(value: UnmarshalledReplicationConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationConfiguration")(js.undefined)
        ret
    }
  }
  
}

