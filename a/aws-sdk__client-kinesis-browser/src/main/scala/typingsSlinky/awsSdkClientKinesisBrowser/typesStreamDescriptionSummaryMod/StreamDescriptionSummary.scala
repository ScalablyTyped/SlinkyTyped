package typingsSlinky.awsSdkClientKinesisBrowser.typesStreamDescriptionSummaryMod

import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ACTIVE
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.CREATING
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.DELETING
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.KMS
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.NONE
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.UPDATING
import typingsSlinky.awsSdkClientKinesisBrowser.typesEnhancedMetricsMod.EnhancedMetrics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamDescriptionSummary extends js.Object {
  /**
    * <p>The number of enhanced fan-out consumers registered with the stream.</p>
    */
  var ConsumerCount: js.UndefOr[Double] = js.native
  /**
    * <p>The encryption type used. This value is one of the following:</p> <ul> <li> <p> <code>KMS</code> </p> </li> <li> <p> <code>NONE</code> </p> </li> </ul>
    */
  var EncryptionType: js.UndefOr[NONE | KMS | String] = js.native
  /**
    * <p>Represents the current enhanced monitoring settings of the stream.</p>
    */
  var EnhancedMonitoring: js.Array[EnhancedMetrics] | js.Iterable[EnhancedMetrics] = js.native
  /**
    * <p>The GUID for the customer-managed AWS KMS key to use for encryption. This value can be a globally unique identifier, a fully specified ARN to either an alias or a key, or an alias name prefixed by "alias/".You can also use a master key owned by Kinesis Data Streams by specifying the alias <code>aws/kinesis</code>.</p> <ul> <li> <p>Key ARN example: <code>arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012</code> </p> </li> <li> <p>Alias ARN example: <code> arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</code> </p> </li> <li> <p>Globally unique key ID example: <code>12345678-1234-1234-1234-123456789012</code> </p> </li> <li> <p>Alias name example: <code>alias/MyAliasName</code> </p> </li> <li> <p>Master key owned by Kinesis Data Streams: <code>alias/aws/kinesis</code> </p> </li> </ul>
    */
  var KeyId: js.UndefOr[String] = js.native
  /**
    * <p>The number of open shards in the stream.</p>
    */
  var OpenShardCount: Double = js.native
  /**
    * <p>The current retention period, in hours.</p>
    */
  var RetentionPeriodHours: Double = js.native
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

object StreamDescriptionSummary {
  @scala.inline
  def apply(
    EnhancedMonitoring: js.Array[EnhancedMetrics] | js.Iterable[EnhancedMetrics],
    OpenShardCount: Double,
    RetentionPeriodHours: Double,
    StreamARN: String,
    StreamCreationTimestamp: js.Date | String | Double,
    StreamName: String,
    StreamStatus: CREATING | DELETING | ACTIVE | UPDATING | String
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
    def withOpenShardCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OpenShardCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetentionPeriodHours(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RetentionPeriodHours")(value.asInstanceOf[js.Any])
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
    def withConsumerCount(value: Double): Self = {
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

