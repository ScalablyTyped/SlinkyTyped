package typingsSlinky.awsSdkClientKinesisBrowser.typesStreamDescriptionSummaryMod

import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ACTIVE
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.CREATING
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.DELETING
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.KMS
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.NONE
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.UPDATING
import typingsSlinky.awsSdkClientKinesisBrowser.typesEnhancedMetricsMod.UnmarshalledEnhancedMetrics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledStreamDescriptionSummary extends StreamDescriptionSummary {
  /**
    * <p>Represents the current enhanced monitoring settings of the stream.</p>
    */
  @JSName("EnhancedMonitoring")
  var EnhancedMonitoring_UnmarshalledStreamDescriptionSummary: js.Array[UnmarshalledEnhancedMetrics]
  /**
    * <p>The approximate time that the stream was created.</p>
    */
  @JSName("StreamCreationTimestamp")
  var StreamCreationTimestamp_UnmarshalledStreamDescriptionSummary: js.Date
}

object UnmarshalledStreamDescriptionSummary {
  @scala.inline
  def apply(
    EnhancedMonitoring: js.Array[UnmarshalledEnhancedMetrics],
    OpenShardCount: Double,
    RetentionPeriodHours: Double,
    StreamARN: String,
    StreamCreationTimestamp: js.Date,
    StreamName: String,
    StreamStatus: CREATING | DELETING | ACTIVE | UPDATING | String,
    ConsumerCount: Int | Double = null,
    EncryptionType: NONE | KMS | String = null,
    KeyId: String = null
  ): UnmarshalledStreamDescriptionSummary = {
    val __obj = js.Dynamic.literal(EnhancedMonitoring = EnhancedMonitoring.asInstanceOf[js.Any], OpenShardCount = OpenShardCount.asInstanceOf[js.Any], RetentionPeriodHours = RetentionPeriodHours.asInstanceOf[js.Any], StreamARN = StreamARN.asInstanceOf[js.Any], StreamCreationTimestamp = StreamCreationTimestamp.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any], StreamStatus = StreamStatus.asInstanceOf[js.Any])
    if (ConsumerCount != null) __obj.updateDynamic("ConsumerCount")(ConsumerCount.asInstanceOf[js.Any])
    if (EncryptionType != null) __obj.updateDynamic("EncryptionType")(EncryptionType.asInstanceOf[js.Any])
    if (KeyId != null) __obj.updateDynamic("KeyId")(KeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledStreamDescriptionSummary]
  }
}

