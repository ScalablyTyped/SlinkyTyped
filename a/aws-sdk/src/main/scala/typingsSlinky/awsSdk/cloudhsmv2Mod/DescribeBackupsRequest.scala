package typingsSlinky.awsSdk.cloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeBackupsRequest extends js.Object {
  /**
    * One or more filters to limit the items returned in the response. Use the backupIds filter to return only the specified backups. Specify backups by their backup identifier (ID). Use the sourceBackupIds filter to return only the backups created from a source backup. The sourceBackupID of a source backup is returned by the CopyBackupToRegion operation. Use the clusterIds filter to return only the backups for the specified clusters. Specify clusters by their cluster identifier (ID). Use the states filter to return only backups that match the specified state.
    */
  var Filters: js.UndefOr[typingsSlinky.awsSdk.cloudhsmv2Mod.Filters] = js.native
  /**
    * The maximum number of backups to return in the response. When there are more backups than the number you specify, the response contains a NextToken value.
    */
  var MaxResults: js.UndefOr[MaxSize] = js.native
  /**
    * The NextToken value that you received in the previous response. Use this value to get more backups.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.cloudhsmv2Mod.NextToken] = js.native
  /**
    * Designates whether or not to sort the return backups by ascending chronological order of generation.
    */
  var SortAscending: js.UndefOr[Boolean] = js.native
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
    def withFilters(value: Filters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filters")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: MaxSize): Self = {
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
    def withSortAscending(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SortAscending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortAscending: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SortAscending")(js.undefined)
        ret
    }
  }
  
}

