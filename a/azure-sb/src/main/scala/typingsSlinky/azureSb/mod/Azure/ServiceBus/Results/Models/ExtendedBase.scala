package typingsSlinky.azureSb.mod.Azure.ServiceBus.Results.Models

import typingsSlinky.azureSb.anon.Author
import typingsSlinky.azureSb.mod.Azure.ServiceBus.DateString
import typingsSlinky.azureSb.mod.Azure.ServiceBus.Duration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtendedBase extends Base {
  var AuthorizationRules: String = js.native
  var AutoDeleteOnIdle: String = js.native
  var DefaultMessageTimeToLive: String = js.native
  var DuplicateDetectionHistoryTimeWindow: Duration = js.native
  var EnableBatchedOperations: String = js.native
  var EnableExpress: String = js.native
  var EnablePartitioning: String = js.native
  var EntityAvailabilityStatus: String = js.native
  var IsAnonymousAccessible: String = js.native
  var MaxSizeInMegabytes: String = js.native
  var RequiresDuplicateDetection: String = js.native
  var SizeInBytes: String = js.native
  var Status: EntityStatus = js.native
  var UpdatedAt: DateString = js.native
}

object ExtendedBase {
  @scala.inline
  def apply(
    AuthorizationRules: String,
    AutoDeleteOnIdle: String,
    CreatedAt: DateString,
    DefaultMessageTimeToLive: String,
    DuplicateDetectionHistoryTimeWindow: Duration,
    EnableBatchedOperations: String,
    EnableExpress: String,
    EnablePartitioning: String,
    EntityAvailabilityStatus: String,
    IsAnonymousAccessible: String,
    MaxSizeInMegabytes: String,
    RequiresDuplicateDetection: String,
    SizeInBytes: String,
    Status: EntityStatus,
    UpdatedAt: DateString,
    _underscore: Author
  ): ExtendedBase = {
    val __obj = js.Dynamic.literal(AuthorizationRules = AuthorizationRules.asInstanceOf[js.Any], AutoDeleteOnIdle = AutoDeleteOnIdle.asInstanceOf[js.Any], CreatedAt = CreatedAt.asInstanceOf[js.Any], DefaultMessageTimeToLive = DefaultMessageTimeToLive.asInstanceOf[js.Any], DuplicateDetectionHistoryTimeWindow = DuplicateDetectionHistoryTimeWindow.asInstanceOf[js.Any], EnableBatchedOperations = EnableBatchedOperations.asInstanceOf[js.Any], EnableExpress = EnableExpress.asInstanceOf[js.Any], EnablePartitioning = EnablePartitioning.asInstanceOf[js.Any], EntityAvailabilityStatus = EntityAvailabilityStatus.asInstanceOf[js.Any], IsAnonymousAccessible = IsAnonymousAccessible.asInstanceOf[js.Any], MaxSizeInMegabytes = MaxSizeInMegabytes.asInstanceOf[js.Any], RequiresDuplicateDetection = RequiresDuplicateDetection.asInstanceOf[js.Any], SizeInBytes = SizeInBytes.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], UpdatedAt = UpdatedAt.asInstanceOf[js.Any])
    __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedBase]
  }
  @scala.inline
  implicit class ExtendedBaseOps[Self <: ExtendedBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorizationRules(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthorizationRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoDeleteOnIdle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoDeleteOnIdle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultMessageTimeToLive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultMessageTimeToLive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuplicateDetectionHistoryTimeWindow(value: Duration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DuplicateDetectionHistoryTimeWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableBatchedOperations(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableBatchedOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableExpress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableExpress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnablePartitioning(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnablePartitioning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntityAvailabilityStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntityAvailabilityStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsAnonymousAccessible(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsAnonymousAccessible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxSizeInMegabytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxSizeInMegabytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequiresDuplicateDetection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequiresDuplicateDetection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSizeInBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SizeInBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: EntityStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdatedAt(value: DateString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdatedAt")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

