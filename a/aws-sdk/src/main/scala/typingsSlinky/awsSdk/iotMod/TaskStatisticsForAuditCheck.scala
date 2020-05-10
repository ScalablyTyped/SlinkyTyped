package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskStatisticsForAuditCheck extends js.Object {
  /**
    * The number of findings to which the mitigation action task was canceled when applied.
    */
  var canceledFindingsCount: js.UndefOr[CanceledFindingsCount] = js.native
  /**
    * The number of findings for which at least one of the actions failed when applied.
    */
  var failedFindingsCount: js.UndefOr[FailedFindingsCount] = js.native
  /**
    * The number of findings skipped because of filter conditions provided in the parameters to the command.
    */
  var skippedFindingsCount: js.UndefOr[SkippedFindingsCount] = js.native
  /**
    * The number of findings for which all mitigation actions succeeded when applied.
    */
  var succeededFindingsCount: js.UndefOr[SucceededFindingsCount] = js.native
  /**
    * The total number of findings to which a task is being applied.
    */
  var totalFindingsCount: js.UndefOr[TotalFindingsCount] = js.native
}

object TaskStatisticsForAuditCheck {
  @scala.inline
  def apply(): TaskStatisticsForAuditCheck = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskStatisticsForAuditCheck]
  }
  @scala.inline
  implicit class TaskStatisticsForAuditCheckOps[Self <: TaskStatisticsForAuditCheck] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanceledFindingsCount(value: CanceledFindingsCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canceledFindingsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanceledFindingsCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canceledFindingsCount")(js.undefined)
        ret
    }
    @scala.inline
    def withFailedFindingsCount(value: FailedFindingsCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedFindingsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailedFindingsCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedFindingsCount")(js.undefined)
        ret
    }
    @scala.inline
    def withSkippedFindingsCount(value: SkippedFindingsCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skippedFindingsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkippedFindingsCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skippedFindingsCount")(js.undefined)
        ret
    }
    @scala.inline
    def withSucceededFindingsCount(value: SucceededFindingsCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("succeededFindingsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSucceededFindingsCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("succeededFindingsCount")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalFindingsCount(value: TotalFindingsCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalFindingsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalFindingsCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalFindingsCount")(js.undefined)
        ret
    }
  }
  
}

