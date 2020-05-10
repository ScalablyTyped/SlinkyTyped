package typingsSlinky.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeWorkspaceDirectoriesRequest extends js.Object {
  /**
    * The identifiers of the directories. If the value is null, all directories are retrieved.
    */
  var DirectoryIds: js.UndefOr[DirectoryIdList] = js.native
  /**
    * The maximum number of directories to return.
    */
  var Limit: js.UndefOr[typingsSlinky.awsSdk.workspacesMod.Limit] = js.native
  /**
    * If you received a NextToken from a previous call that was paginated, provide this token to receive the next set of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object DescribeWorkspaceDirectoriesRequest {
  @scala.inline
  def apply(): DescribeWorkspaceDirectoriesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeWorkspaceDirectoriesRequest]
  }
  @scala.inline
  implicit class DescribeWorkspaceDirectoriesRequestOps[Self <: DescribeWorkspaceDirectoriesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectoryIds(value: DirectoryIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectoryIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryIds")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: Limit): Self = {
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
    def withNextToken(value: PaginationToken): Self = {
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
  }
  
}

