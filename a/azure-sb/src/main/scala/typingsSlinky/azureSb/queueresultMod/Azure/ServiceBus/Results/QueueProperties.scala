package typingsSlinky.azureSb.queueresultMod.Azure.ServiceBus.Results

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueProperties extends js.Object {
  var DeadLetteringOnMessageExpiration: String = js.native
  var DefaultMessageTimeToLive: String = js.native
  var DuplicateDetectionHistoryTimeWindow: String = js.native
  var EnableBatchedOperations: Boolean = js.native
  var EnablePartitioning: Boolean = js.native
  var LockDuration: String = js.native
  var MaxDeliveryCount: Double = js.native
  var MaxSizeInMegabytes: Double = js.native
  var MessageCount: Double = js.native
  var RequiresDuplicateDetection: Boolean = js.native
  var RequiresSession: Boolean = js.native
  var SizeInBytes: Double = js.native
}

object QueueProperties {
  @scala.inline
  def apply(
    DeadLetteringOnMessageExpiration: String,
    DefaultMessageTimeToLive: String,
    DuplicateDetectionHistoryTimeWindow: String,
    EnableBatchedOperations: Boolean,
    EnablePartitioning: Boolean,
    LockDuration: String,
    MaxDeliveryCount: Double,
    MaxSizeInMegabytes: Double,
    MessageCount: Double,
    RequiresDuplicateDetection: Boolean,
    RequiresSession: Boolean,
    SizeInBytes: Double
  ): QueueProperties = {
    val __obj = js.Dynamic.literal(DeadLetteringOnMessageExpiration = DeadLetteringOnMessageExpiration.asInstanceOf[js.Any], DefaultMessageTimeToLive = DefaultMessageTimeToLive.asInstanceOf[js.Any], DuplicateDetectionHistoryTimeWindow = DuplicateDetectionHistoryTimeWindow.asInstanceOf[js.Any], EnableBatchedOperations = EnableBatchedOperations.asInstanceOf[js.Any], EnablePartitioning = EnablePartitioning.asInstanceOf[js.Any], LockDuration = LockDuration.asInstanceOf[js.Any], MaxDeliveryCount = MaxDeliveryCount.asInstanceOf[js.Any], MaxSizeInMegabytes = MaxSizeInMegabytes.asInstanceOf[js.Any], MessageCount = MessageCount.asInstanceOf[js.Any], RequiresDuplicateDetection = RequiresDuplicateDetection.asInstanceOf[js.Any], RequiresSession = RequiresSession.asInstanceOf[js.Any], SizeInBytes = SizeInBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueProperties]
  }
  @scala.inline
  implicit class QueuePropertiesOps[Self <: QueueProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeadLetteringOnMessageExpiration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeadLetteringOnMessageExpiration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultMessageTimeToLive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultMessageTimeToLive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuplicateDetectionHistoryTimeWindow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DuplicateDetectionHistoryTimeWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableBatchedOperations(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableBatchedOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnablePartitioning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnablePartitioning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLockDuration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LockDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxDeliveryCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxDeliveryCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxSizeInMegabytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxSizeInMegabytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequiresDuplicateDetection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequiresDuplicateDetection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequiresSession(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequiresSession")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSizeInBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SizeInBytes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

