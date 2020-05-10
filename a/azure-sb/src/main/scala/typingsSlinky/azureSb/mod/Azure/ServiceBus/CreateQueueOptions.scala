package typingsSlinky.azureSb.mod.Azure.ServiceBus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<azure-sb.azure-sb.Azure.ServiceBus.IQueueOptions> */
@js.native
trait CreateQueueOptions extends js.Object {
  var AutoDeleteOnIdle: js.UndefOr[String] = js.native
  var DeadLetteringOnMessageExpiration: js.UndefOr[Boolean] = js.native
  var DefaultMessageTimeToLive: js.UndefOr[String] = js.native
  var DuplicateDetectionHistoryTimeWindow: js.UndefOr[String] = js.native
  var EnablePartitioning: js.UndefOr[Boolean] = js.native
  var LockDuration: js.UndefOr[String] = js.native
  var MaxSizeInMegabytes: js.UndefOr[Double] = js.native
  var RequiresDuplicateDetection: js.UndefOr[Boolean] = js.native
  var RequiresSession: js.UndefOr[Boolean] = js.native
}

object CreateQueueOptions {
  @scala.inline
  def apply(): CreateQueueOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateQueueOptions]
  }
  @scala.inline
  implicit class CreateQueueOptionsOps[Self <: CreateQueueOptions] (val x: Self) extends AnyVal {
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
    def withoutAutoDeleteOnIdle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoDeleteOnIdle")(js.undefined)
        ret
    }
    @scala.inline
    def withDeadLetteringOnMessageExpiration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeadLetteringOnMessageExpiration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeadLetteringOnMessageExpiration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeadLetteringOnMessageExpiration")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultMessageTimeToLive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultMessageTimeToLive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultMessageTimeToLive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultMessageTimeToLive")(js.undefined)
        ret
    }
    @scala.inline
    def withDuplicateDetectionHistoryTimeWindow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DuplicateDetectionHistoryTimeWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuplicateDetectionHistoryTimeWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DuplicateDetectionHistoryTimeWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withEnablePartitioning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnablePartitioning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablePartitioning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnablePartitioning")(js.undefined)
        ret
    }
    @scala.inline
    def withLockDuration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LockDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LockDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSizeInMegabytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxSizeInMegabytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSizeInMegabytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxSizeInMegabytes")(js.undefined)
        ret
    }
    @scala.inline
    def withRequiresDuplicateDetection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequiresDuplicateDetection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequiresDuplicateDetection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequiresDuplicateDetection")(js.undefined)
        ret
    }
    @scala.inline
    def withRequiresSession(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequiresSession")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequiresSession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequiresSession")(js.undefined)
        ret
    }
  }
  
}

