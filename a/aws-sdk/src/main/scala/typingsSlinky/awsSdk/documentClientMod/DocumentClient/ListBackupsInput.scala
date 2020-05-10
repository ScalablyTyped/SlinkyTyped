package typingsSlinky.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBackupsInput extends js.Object {
  /**
    * The backups from the table specified by BackupType are listed. Where BackupType can be:    USER - On-demand backup created by you.    SYSTEM - On-demand backup automatically created by DynamoDB.    ALL - All types of on-demand backups (USER and SYSTEM).  
    */
  var BackupType: js.UndefOr[BackupTypeFilter] = js.native
  /**
    *  LastEvaluatedBackupArn is the Amazon Resource Name (ARN) of the backup last evaluated when the current page of results was returned, inclusive of the current page of results. This value may be specified as the ExclusiveStartBackupArn of a new ListBackups operation in order to fetch the next page of results. 
    */
  var ExclusiveStartBackupArn: js.UndefOr[BackupArn] = js.native
  /**
    * Maximum number of backups to return at once.
    */
  var Limit: js.UndefOr[BackupsInputLimit] = js.native
  /**
    * The backups from the table specified by TableName are listed. 
    */
  var TableName: js.UndefOr[typingsSlinky.awsSdk.documentClientMod.DocumentClient.TableName] = js.native
  /**
    * Only backups created after this time are listed. TimeRangeLowerBound is inclusive.
    */
  var TimeRangeLowerBound: js.UndefOr[js.Date] = js.native
  /**
    * Only backups created before this time are listed. TimeRangeUpperBound is exclusive. 
    */
  var TimeRangeUpperBound: js.UndefOr[js.Date] = js.native
}

object ListBackupsInput {
  @scala.inline
  def apply(): ListBackupsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBackupsInput]
  }
  @scala.inline
  implicit class ListBackupsInputOps[Self <: ListBackupsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackupType(value: BackupTypeFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackupType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupType")(js.undefined)
        ret
    }
    @scala.inline
    def withExclusiveStartBackupArn(value: BackupArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExclusiveStartBackupArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclusiveStartBackupArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExclusiveStartBackupArn")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: BackupsInputLimit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Limit")(js.undefined)
        ret
    }
    @scala.inline
    def withTableName(value: TableName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableName")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeRangeLowerBound(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeRangeLowerBound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeRangeLowerBound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeRangeLowerBound")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeRangeUpperBound(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeRangeUpperBound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeRangeUpperBound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeRangeUpperBound")(js.undefined)
        ret
    }
  }
  
}

