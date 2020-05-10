package typingsSlinky.awsSdk.migrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MigrationTaskSummary extends js.Object {
  /**
    * Unique identifier that references the migration task. Do not store personal data in this field. 
    */
  var MigrationTaskName: js.UndefOr[typingsSlinky.awsSdk.migrationhubMod.MigrationTaskName] = js.native
  /**
    * Indication of the percentage completion of the task.
    */
  var ProgressPercent: js.UndefOr[typingsSlinky.awsSdk.migrationhubMod.ProgressPercent] = js.native
  /**
    * An AWS resource used for access control. It should uniquely identify the migration tool as it is used for all updates made by the tool.
    */
  var ProgressUpdateStream: js.UndefOr[typingsSlinky.awsSdk.migrationhubMod.ProgressUpdateStream] = js.native
  /**
    * Status of the task.
    */
  var Status: js.UndefOr[typingsSlinky.awsSdk.migrationhubMod.Status] = js.native
  /**
    * Detail information of what is being done within the overall status state.
    */
  var StatusDetail: js.UndefOr[typingsSlinky.awsSdk.migrationhubMod.StatusDetail] = js.native
  /**
    * The timestamp when the task was gathered.
    */
  var UpdateDateTime: js.UndefOr[js.Date] = js.native
}

object MigrationTaskSummary {
  @scala.inline
  def apply(): MigrationTaskSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MigrationTaskSummary]
  }
  @scala.inline
  implicit class MigrationTaskSummaryOps[Self <: MigrationTaskSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMigrationTaskName(value: MigrationTaskName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MigrationTaskName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMigrationTaskName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MigrationTaskName")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressPercent(value: ProgressPercent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgressPercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressPercent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgressPercent")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressUpdateStream(value: ProgressUpdateStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgressUpdateStream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressUpdateStream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgressUpdateStream")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: Status): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusDetail(value: StatusDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusDetail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusDetail")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateDateTime")(js.undefined)
        ret
    }
  }
  
}

