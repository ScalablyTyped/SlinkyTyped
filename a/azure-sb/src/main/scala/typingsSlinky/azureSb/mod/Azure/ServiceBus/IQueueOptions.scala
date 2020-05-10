package typingsSlinky.azureSb.mod.Azure.ServiceBus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IQueueOptions extends CreateOptions {
  var AutoDeleteOnIdle: String = js.native
  var DeadLetteringOnMessageExpiration: Boolean = js.native
  var LockDuration: String = js.native
  var RequiresSession: Boolean = js.native
}

object IQueueOptions {
  @scala.inline
  def apply(
    AutoDeleteOnIdle: String,
    DeadLetteringOnMessageExpiration: Boolean,
    DefaultMessageTimeToLive: String,
    DuplicateDetectionHistoryTimeWindow: String,
    EnablePartitioning: Boolean,
    LockDuration: String,
    MaxSizeInMegabytes: Double,
    RequiresDuplicateDetection: Boolean,
    RequiresSession: Boolean
  ): IQueueOptions = {
    val __obj = js.Dynamic.literal(AutoDeleteOnIdle = AutoDeleteOnIdle.asInstanceOf[js.Any], DeadLetteringOnMessageExpiration = DeadLetteringOnMessageExpiration.asInstanceOf[js.Any], DefaultMessageTimeToLive = DefaultMessageTimeToLive.asInstanceOf[js.Any], DuplicateDetectionHistoryTimeWindow = DuplicateDetectionHistoryTimeWindow.asInstanceOf[js.Any], EnablePartitioning = EnablePartitioning.asInstanceOf[js.Any], LockDuration = LockDuration.asInstanceOf[js.Any], MaxSizeInMegabytes = MaxSizeInMegabytes.asInstanceOf[js.Any], RequiresDuplicateDetection = RequiresDuplicateDetection.asInstanceOf[js.Any], RequiresSession = RequiresSession.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQueueOptions]
  }
  @scala.inline
  implicit class IQueueOptionsOps[Self <: IQueueOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoDeleteOnIdle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoDeleteOnIdle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeadLetteringOnMessageExpiration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeadLetteringOnMessageExpiration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLockDuration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LockDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequiresSession(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequiresSession")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

