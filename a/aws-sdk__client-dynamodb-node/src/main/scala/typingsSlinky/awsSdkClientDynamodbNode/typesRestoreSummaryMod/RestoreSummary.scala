package typingsSlinky.awsSdkClientDynamodbNode.typesRestoreSummaryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestoreSummary extends js.Object {
  /**
    * <p>Point in time or source backup time.</p>
    */
  var RestoreDateTime: js.Date | String | Double = js.native
  /**
    * <p>Indicates if a restore is in progress or not.</p>
    */
  var RestoreInProgress: Boolean = js.native
  /**
    * <p>ARN of the backup from which the table was restored.</p>
    */
  var SourceBackupArn: js.UndefOr[String] = js.native
  /**
    * <p>ARN of the source table of the backup that is being restored.</p>
    */
  var SourceTableArn: js.UndefOr[String] = js.native
}

object RestoreSummary {
  @scala.inline
  def apply(RestoreDateTime: js.Date | String | Double, RestoreInProgress: Boolean): RestoreSummary = {
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
    def withRestoreDateTimeDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RestoreDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestoreDateTime(value: js.Date | String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RestoreDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestoreInProgress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RestoreInProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceBackupArn(value: String): Self = {
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
    def withSourceTableArn(value: String): Self = {
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

