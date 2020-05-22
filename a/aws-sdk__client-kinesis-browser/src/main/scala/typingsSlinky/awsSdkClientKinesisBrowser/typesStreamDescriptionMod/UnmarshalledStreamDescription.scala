package typingsSlinky.awsSdkClientKinesisBrowser.typesStreamDescriptionMod

import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ACTIVE
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.CREATING
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.DELETING
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.KMS
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.NONE
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.UPDATING
import typingsSlinky.awsSdkClientKinesisBrowser.typesEnhancedMetricsMod.UnmarshalledEnhancedMetrics
import typingsSlinky.awsSdkClientKinesisBrowser.typesShardMod.UnmarshalledShard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledStreamDescription extends StreamDescription {
  /**
    * <p>Represents the current enhanced monitoring settings of the stream.</p>
    */
  @JSName("EnhancedMonitoring")
  var EnhancedMonitoring_UnmarshalledStreamDescription: js.Array[UnmarshalledEnhancedMetrics]
  /**
    * <p>The shards that comprise the stream.</p>
    */
  @JSName("Shards")
  var Shards_UnmarshalledStreamDescription: js.Array[UnmarshalledShard]
  /**
    * <p>The approximate time that the stream was created.</p>
    */
  @JSName("StreamCreationTimestamp")
  var StreamCreationTimestamp_UnmarshalledStreamDescription: js.Date
}

object UnmarshalledStreamDescription {
  @scala.inline
  def apply(
    EnhancedMonitoring: js.Array[UnmarshalledEnhancedMetrics],
    HasMoreShards: Boolean,
    RetentionPeriodHours: Double,
    Shards: js.Array[UnmarshalledShard],
    StreamARN: String,
    StreamCreationTimestamp: js.Date,
    StreamName: String,
    StreamStatus: CREATING | DELETING | ACTIVE | UPDATING | String,
    EncryptionType: NONE | KMS | String = null,
    KeyId: String = null
  ): UnmarshalledStreamDescription = {
    val __obj = js.Dynamic.literal(EnhancedMonitoring = EnhancedMonitoring.asInstanceOf[js.Any], HasMoreShards = HasMoreShards.asInstanceOf[js.Any], RetentionPeriodHours = RetentionPeriodHours.asInstanceOf[js.Any], Shards = Shards.asInstanceOf[js.Any], StreamARN = StreamARN.asInstanceOf[js.Any], StreamCreationTimestamp = StreamCreationTimestamp.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any], StreamStatus = StreamStatus.asInstanceOf[js.Any])
    if (EncryptionType != null) __obj.updateDynamic("EncryptionType")(EncryptionType.asInstanceOf[js.Any])
    if (KeyId != null) __obj.updateDynamic("KeyId")(KeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledStreamDescription]
  }
}

