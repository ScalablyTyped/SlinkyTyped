package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskStatistics extends js.Object {
  /**
    * The number of checks that did not run because the audit was canceled.
    */
  var canceledChecks: js.UndefOr[CanceledChecksCount] = js.native
  /**
    * The number of checks that found compliant resources.
    */
  var compliantChecks: js.UndefOr[CompliantChecksCount] = js.native
  /**
    * The number of checks.
    */
  var failedChecks: js.UndefOr[FailedChecksCount] = js.native
  /**
    * The number of checks in progress.
    */
  var inProgressChecks: js.UndefOr[InProgressChecksCount] = js.native
  /**
    * The number of checks that found noncompliant resources.
    */
  var nonCompliantChecks: js.UndefOr[NonCompliantChecksCount] = js.native
  /**
    * The number of checks in this audit.
    */
  var totalChecks: js.UndefOr[TotalChecksCount] = js.native
  /**
    * The number of checks waiting for data collection.
    */
  var waitingForDataCollectionChecks: js.UndefOr[WaitingForDataCollectionChecksCount] = js.native
}

object TaskStatistics {
  @scala.inline
  def apply(): TaskStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskStatistics]
  }
  @scala.inline
  implicit class TaskStatisticsOps[Self <: TaskStatistics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanceledChecks(value: CanceledChecksCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canceledChecks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanceledChecks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canceledChecks")(js.undefined)
        ret
    }
    @scala.inline
    def withCompliantChecks(value: CompliantChecksCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compliantChecks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompliantChecks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compliantChecks")(js.undefined)
        ret
    }
    @scala.inline
    def withFailedChecks(value: FailedChecksCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedChecks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailedChecks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedChecks")(js.undefined)
        ret
    }
    @scala.inline
    def withInProgressChecks(value: InProgressChecksCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inProgressChecks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInProgressChecks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inProgressChecks")(js.undefined)
        ret
    }
    @scala.inline
    def withNonCompliantChecks(value: NonCompliantChecksCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonCompliantChecks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonCompliantChecks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonCompliantChecks")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalChecks(value: TotalChecksCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalChecks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalChecks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalChecks")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitingForDataCollectionChecks(value: WaitingForDataCollectionChecksCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitingForDataCollectionChecks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitingForDataCollectionChecks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitingForDataCollectionChecks")(js.undefined)
        ret
    }
  }
  
}

