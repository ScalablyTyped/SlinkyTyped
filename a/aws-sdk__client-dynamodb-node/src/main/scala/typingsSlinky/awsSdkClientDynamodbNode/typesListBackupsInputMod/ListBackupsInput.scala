package typingsSlinky.awsSdkClientDynamodbNode.typesListBackupsInputMod

import typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.ALL
import typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.SYSTEM
import typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.USER
import typingsSlinky.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkTypes.abortMod.AbortSignal
import typingsSlinky.awsSdkTypes.httpMod.NodeHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBackupsInput extends InputTypesUnion {
  /**
    * An object that may be queried to determine if the underlying operation has been aborted.
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
    */
  @JSName("$abortSignal")
  var $abortSignal: js.UndefOr[AbortSignal] = js.native
  /**
    * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
    */
  @JSName("$httpOptions")
  var $httpOptions: js.UndefOr[NodeHttpOptions] = js.native
  /**
    * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
    */
  @JSName("$maxRetries")
  var $maxRetries: js.UndefOr[Double] = js.native
  /**
    * <p>The backups from the table specified by <code>BackupType</code> are listed.</p> <p>Where <code>BackupType</code> can be:</p> <ul> <li> <p> <code>USER</code> - On-demand backup created by you.</p> </li> <li> <p> <code>SYSTEM</code> - On-demand backup automatically created by DynamoDB.</p> </li> <li> <p> <code>ALL</code> - All types of on-demand backups (USER and SYSTEM).</p> </li> </ul>
    */
  var BackupType: js.UndefOr[USER | SYSTEM | ALL | String] = js.native
  /**
    * <p> <code>LastEvaluatedBackupArn</code> is the ARN of the backup last evaluated when the current page of results was returned, inclusive of the current page of results. This value may be specified as the <code>ExclusiveStartBackupArn</code> of a new <code>ListBackups</code> operation in order to fetch the next page of results. </p>
    */
  var ExclusiveStartBackupArn: js.UndefOr[String] = js.native
  /**
    * <p>Maximum number of backups to return at once.</p>
    */
  var Limit: js.UndefOr[Double] = js.native
  /**
    * <p>The backups from the table specified by <code>TableName</code> are listed. </p>
    */
  var TableName: js.UndefOr[String] = js.native
  /**
    * <p>Only backups created after this time are listed. <code>TimeRangeLowerBound</code> is inclusive.</p>
    */
  var TimeRangeLowerBound: js.UndefOr[js.Date | String | Double] = js.native
  /**
    * <p>Only backups created before this time are listed. <code>TimeRangeUpperBound</code> is exclusive. </p>
    */
  var TimeRangeUpperBound: js.UndefOr[js.Date | String | Double] = js.native
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
    def with$abortSignal(value: AbortSignal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$abortSignal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$abortSignal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$abortSignal")(js.undefined)
        ret
    }
    @scala.inline
    def with$httpOptions(value: NodeHttpOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$httpOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$httpOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$httpOptions")(js.undefined)
        ret
    }
    @scala.inline
    def with$maxRetries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$maxRetries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$maxRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$maxRetries")(js.undefined)
        ret
    }
    @scala.inline
    def withBackupType(value: USER | SYSTEM | ALL | String): Self = {
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
    def withExclusiveStartBackupArn(value: String): Self = {
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
    def withLimit(value: Double): Self = {
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
    def withTableName(value: String): Self = {
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
    def withTimeRangeLowerBoundDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeRangeLowerBound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeRangeLowerBound(value: js.Date | String | Double): Self = {
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
    def withTimeRangeUpperBoundDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeRangeUpperBound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeRangeUpperBound(value: js.Date | String | Double): Self = {
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

