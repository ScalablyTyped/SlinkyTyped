package typingsSlinky.awsSdk.opsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeBackupsRequest extends js.Object {
  /**
    * Describes a single backup. 
    */
  var BackupId: js.UndefOr[typingsSlinky.awsSdk.opsworkscmMod.BackupId] = js.native
  /**
    * This is not currently implemented for DescribeBackups requests.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.opsworkscmMod.MaxResults] = js.native
  /**
    * This is not currently implemented for DescribeBackups requests.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.opsworkscmMod.NextToken] = js.native
  /**
    * Returns backups for the server with the specified ServerName. 
    */
  var ServerName: js.UndefOr[typingsSlinky.awsSdk.opsworkscmMod.ServerName] = js.native
}

object DescribeBackupsRequest {
  @scala.inline
  def apply(): DescribeBackupsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBackupsRequest]
  }
  @scala.inline
  implicit class DescribeBackupsRequestOps[Self <: DescribeBackupsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackupId(value: BackupId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupId")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: MaxResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withServerName(value: ServerName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerName")(js.undefined)
        ret
    }
  }
  
}

