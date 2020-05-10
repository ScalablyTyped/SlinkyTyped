package typingsSlinky.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamDescriptionSummary extends js.Object {
  /**
    * The number of enhanced fan-out consumers registered with the stream.
    */
  var ConsumerCount: js.UndefOr[ConsumerCountObject] = js.native
  /**
    * The encryption type used. This value is one of the following:    KMS     NONE   
    */
  var EncryptionType: js.UndefOr[typingsSlinky.awsSdk.kinesisMod.EncryptionType] = js.native
  /**
    * Represents the current enhanced monitoring settings of the stream.
    */
  var EnhancedMonitoring: EnhancedMonitoringList = js.native
  /**
    * The GUID for the customer-managed AWS KMS key to use for encryption. This value can be a globally unique identifier, a fully specified ARN to either an alias or a key, or an alias name prefixed by "alias/".You can also use a master key owned by Kinesis Data Streams by specifying the alias aws/kinesis.   Key ARN example: arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012    Alias ARN example:  arn:aws:kms:us-east-1:123456789012:alias/MyAliasName    Globally unique key ID example: 12345678-1234-1234-1234-123456789012    Alias name example: alias/MyAliasName    Master key owned by Kinesis Data Streams: alias/aws/kinesis   
    */
  var KeyId: js.UndefOr[typingsSlinky.awsSdk.kinesisMod.KeyId] = js.native
  /**
    * The number of open shards in the stream.
    */
  var OpenShardCount: ShardCountObject = js.native
  /**
    * The current retention period, in hours.
    */
  var RetentionPeriodHours: PositiveIntegerObject = js.native
  /**
    * The Amazon Resource Name (ARN) for the stream being described.
    */
  var StreamARN: typingsSlinky.awsSdk.kinesisMod.StreamARN = js.native
  /**
    * The approximate time that the stream was created.
    */
  var StreamCreationTimestamp: js.Date = js.native
  /**
    * The name of the stream being described.
    */
  var StreamName: typingsSlinky.awsSdk.kinesisMod.StreamName = js.native
  /**
    * The current status of the stream being described. The stream status is one of the following states:    CREATING - The stream is being created. Kinesis Data Streams immediately returns and sets StreamStatus to CREATING.    DELETING - The stream is being deleted. The specified stream is in the DELETING state until Kinesis Data Streams completes the deletion.    ACTIVE - The stream exists and is ready for read and write operations or deletion. You should perform read and write operations only on an ACTIVE stream.    UPDATING - Shards in the stream are being merged or split. Read and write operations continue to work while the stream is in the UPDATING state.  
    */
  var StreamStatus: typingsSlinky.awsSdk.kinesisMod.StreamStatus = js.native
}

object StreamDescriptionSummary {
  @scala.inline
  def apply(
    EnhancedMonitoring: EnhancedMonitoringList,
    OpenShardCount: ShardCountObject,
    RetentionPeriodHours: PositiveIntegerObject,
    StreamARN: StreamARN,
    StreamCreationTimestamp: js.Date,
    StreamName: StreamName,
    StreamStatus: StreamStatus
  ): StreamDescriptionSummary = {
    val __obj = js.Dynamic.literal(EnhancedMonitoring = EnhancedMonitoring.asInstanceOf[js.Any], OpenShardCount = OpenShardCount.asInstanceOf[js.Any], RetentionPeriodHours = RetentionPeriodHours.asInstanceOf[js.Any], StreamARN = StreamARN.asInstanceOf[js.Any], StreamCreationTimestamp = StreamCreationTimestamp.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any], StreamStatus = StreamStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamDescriptionSummary]
  }
  @scala.inline
  implicit class StreamDescriptionSummaryOps[Self <: StreamDescriptionSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnhancedMonitoring(value: EnhancedMonitoringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnhancedMonitoring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenShardCount(value: ShardCountObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OpenShardCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetentionPeriodHours(value: PositiveIntegerObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RetentionPeriodHours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreamARN(value: StreamARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreamCreationTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamCreationTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreamName(value: StreamName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreamStatus(value: StreamStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConsumerCount(value: ConsumerCountObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConsumerCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsumerCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConsumerCount")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryptionType(value: EncryptionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionType")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyId(value: KeyId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyId")(js.undefined)
        ret
    }
  }
  
}

