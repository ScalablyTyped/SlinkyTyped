package typingsSlinky.awsSdkClientKinesisBrowser.typesStreamDescriptionMod

import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ACTIVE
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.CREATING
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.DELETING
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.KMS
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.NONE
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.UPDATING
import typingsSlinky.awsSdkClientKinesisBrowser.typesEnhancedMetricsMod.EnhancedMetrics
import typingsSlinky.awsSdkClientKinesisBrowser.typesShardMod.Shard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamDescription extends js.Object {
  /**
    * <p>The server-side encryption type used on the stream. This parameter can be one of the following values:</p> <ul> <li> <p> <code>NONE</code>: Do not encrypt the records in the stream.</p> </li> <li> <p> <code>KMS</code>: Use server-side encryption on the records in the stream using a customer-managed AWS KMS key.</p> </li> </ul>
    */
  var EncryptionType: js.UndefOr[NONE | KMS | String] = js.native
  /**
    * <p>Represents the current enhanced monitoring settings of the stream.</p>
    */
  var EnhancedMonitoring: js.Array[EnhancedMetrics] | js.Iterable[EnhancedMetrics] = js.native
  /**
    * <p>If set to <code>true</code>, more shards in the stream are available to describe.</p>
    */
  var HasMoreShards: Boolean = js.native
  /**
    * <p>The GUID for the customer-managed AWS KMS key to use for encryption. This value can be a globally unique identifier, a fully specified ARN to either an alias or a key, or an alias name prefixed by "alias/".You can also use a master key owned by Kinesis Data Streams by specifying the alias <code>aws/kinesis</code>.</p> <ul> <li> <p>Key ARN example: <code>arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012</code> </p> </li> <li> <p>Alias ARN example: <code>arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</code> </p> </li> <li> <p>Globally unique key ID example: <code>12345678-1234-1234-1234-123456789012</code> </p> </li> <li> <p>Alias name example: <code>alias/MyAliasName</code> </p> </li> <li> <p>Master key owned by Kinesis Data Streams: <code>alias/aws/kinesis</code> </p> </li> </ul>
    */
  var KeyId: js.UndefOr[String] = js.native
  /**
    * <p>The current retention period, in hours.</p>
    */
  var RetentionPeriodHours: Double = js.native
  /**
    * <p>The shards that comprise the stream.</p>
    */
  var Shards: js.Array[Shard] | js.Iterable[Shard] = js.native
  /**
    * <p>The Amazon Resource Name (ARN) for the stream being described.</p>
    */
  var StreamARN: String = js.native
  /**
    * <p>The approximate time that the stream was created.</p>
    */
  var StreamCreationTimestamp: js.Date | String | Double = js.native
  /**
    * <p>The name of the stream being described.</p>
    */
  var StreamName: String = js.native
  /**
    * <p>The current status of the stream being described. The stream status is one of the following states:</p> <ul> <li> <p> <code>CREATING</code> - The stream is being created. Kinesis Data Streams immediately returns and sets <code>StreamStatus</code> to <code>CREATING</code>.</p> </li> <li> <p> <code>DELETING</code> - The stream is being deleted. The specified stream is in the <code>DELETING</code> state until Kinesis Data Streams completes the deletion.</p> </li> <li> <p> <code>ACTIVE</code> - The stream exists and is ready for read and write operations or deletion. You should perform read and write operations only on an <code>ACTIVE</code> stream.</p> </li> <li> <p> <code>UPDATING</code> - Shards in the stream are being merged or split. Read and write operations continue to work while the stream is in the <code>UPDATING</code> state.</p> </li> </ul>
    */
  var StreamStatus: CREATING | DELETING | ACTIVE | UPDATING | String = js.native
}

object StreamDescription {
  @scala.inline
  def apply(
    EnhancedMonitoring: js.Array[EnhancedMetrics] | js.Iterable[EnhancedMetrics],
    HasMoreShards: Boolean,
    RetentionPeriodHours: Double,
    Shards: js.Array[Shard] | js.Iterable[Shard],
    StreamARN: String,
    StreamCreationTimestamp: js.Date | String | Double,
    StreamName: String,
    StreamStatus: CREATING | DELETING | ACTIVE | UPDATING | String
  ): StreamDescription = {
    val __obj = js.Dynamic.literal(EnhancedMonitoring = EnhancedMonitoring.asInstanceOf[js.Any], HasMoreShards = HasMoreShards.asInstanceOf[js.Any], RetentionPeriodHours = RetentionPeriodHours.asInstanceOf[js.Any], Shards = Shards.asInstanceOf[js.Any], StreamARN = StreamARN.asInstanceOf[js.Any], StreamCreationTimestamp = StreamCreationTimestamp.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any], StreamStatus = StreamStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamDescription]
  }
  @scala.inline
  implicit class StreamDescriptionOps[Self <: StreamDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnhancedMonitoringIterable(value: js.Iterable[EnhancedMetrics]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnhancedMonitoring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnhancedMonitoring(value: js.Array[EnhancedMetrics] | js.Iterable[EnhancedMetrics]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnhancedMonitoring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasMoreShards(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasMoreShards")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetentionPeriodHours(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RetentionPeriodHours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShardsIterable(value: js.Iterable[Shard]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Shards")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShards(value: js.Array[Shard] | js.Iterable[Shard]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Shards")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreamARN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreamCreationTimestampDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamCreationTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreamCreationTimestamp(value: js.Date | String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamCreationTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreamName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreamStatus(value: CREATING | DELETING | ACTIVE | UPDATING | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncryptionType(value: NONE | KMS | String): Self = {
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
    def withKeyId(value: String): Self = {
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

