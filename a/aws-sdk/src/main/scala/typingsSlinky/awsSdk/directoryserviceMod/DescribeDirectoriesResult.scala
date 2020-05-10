package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDirectoriesResult extends js.Object {
  /**
    * The list of DirectoryDescription objects that were retrieved. It is possible that this list contains less than the number of items specified in the Limit member of the request. This occurs if there are less than the requested number of items left to retrieve, or if the limitations of the operation have been exceeded.
    */
  var DirectoryDescriptions: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.DirectoryDescriptions] = js.native
  /**
    * If not null, more results are available. Pass this value for the NextToken parameter in a subsequent call to DescribeDirectories to retrieve the next set of items.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.NextToken] = js.native
}

object DescribeDirectoriesResult {
  @scala.inline
  def apply(): DescribeDirectoriesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDirectoriesResult]
  }
  @scala.inline
  implicit class DescribeDirectoriesResultOps[Self <: DescribeDirectoriesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectoryDescriptions(value: DirectoryDescriptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryDescriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectoryDescriptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryDescriptions")(js.undefined)
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

