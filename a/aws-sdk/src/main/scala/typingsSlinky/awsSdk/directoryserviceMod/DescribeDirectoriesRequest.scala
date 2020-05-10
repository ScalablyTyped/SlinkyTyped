package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDirectoriesRequest extends js.Object {
  /**
    * A list of identifiers of the directories for which to obtain the information. If this member is null, all directories that belong to the current account are returned. An empty list results in an InvalidParameterException being thrown.
    */
  var DirectoryIds: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.DirectoryIds] = js.native
  /**
    * The maximum number of items to return. If this value is zero, the maximum number of items is specified by the limitations of the operation.
    */
  var Limit: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.Limit] = js.native
  /**
    * The DescribeDirectoriesResult.NextToken value from a previous call to DescribeDirectories. Pass null if this is the first call.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.NextToken] = js.native
}

object DescribeDirectoriesRequest {
  @scala.inline
  def apply(): DescribeDirectoriesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDirectoriesRequest]
  }
  @scala.inline
  implicit class DescribeDirectoriesRequestOps[Self <: DescribeDirectoriesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectoryIds(value: DirectoryIds): Self = {
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
  }
  
}

