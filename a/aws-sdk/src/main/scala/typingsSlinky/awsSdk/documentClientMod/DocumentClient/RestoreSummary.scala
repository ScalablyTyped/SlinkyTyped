package typingsSlinky.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestoreSummary extends js.Object {
  /**
    * Point in time or source backup time.
    */
  var RestoreDateTime: js.Date = js.native
  /**
    * Indicates if a restore is in progress or not.
    */
  var RestoreInProgress: typingsSlinky.awsSdk.documentClientMod.DocumentClient.RestoreInProgress = js.native
  /**
    * The Amazon Resource Name (ARN) of the backup from which the table was restored.
    */
  var SourceBackupArn: js.UndefOr[BackupArn] = js.native
  /**
    * The ARN of the source table of the backup that is being restored.
    */
  var SourceTableArn: js.UndefOr[TableArn] = js.native
}

object RestoreSummary {
  @scala.inline
  def apply(RestoreDateTime: js.Date, RestoreInProgress: RestoreInProgress): RestoreSummary = {
    val __obj = js.Dynamic.literal(RestoreDateTime = RestoreDateTime.asInstanceOf[js.Any], RestoreInProgress = RestoreInProgress.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreSummary]
  }
  @scala.inline
  implicit class RestoreSummaryOps[Self <: RestoreSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRestoreDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RestoreDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestoreInProgress(value: RestoreInProgress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RestoreInProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceBackupArn(value: BackupArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceBackupArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceBackupArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceBackupArn")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceTableArn(value: TableArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceTableArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceTableArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceTableArn")(js.undefined)
        ret
    }
  }
  
}

