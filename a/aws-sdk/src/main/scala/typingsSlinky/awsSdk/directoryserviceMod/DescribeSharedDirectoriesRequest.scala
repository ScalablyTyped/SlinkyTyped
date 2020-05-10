package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSharedDirectoriesRequest extends js.Object {
  /**
    * The number of shared directories to return in the response object.
    */
  var Limit: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.Limit] = js.native
  /**
    * The DescribeSharedDirectoriesResult.NextToken value from a previous call to DescribeSharedDirectories. Pass null if this is the first call. 
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.NextToken] = js.native
  /**
    * Returns the identifier of the directory in the directory owner account. 
    */
  var OwnerDirectoryId: DirectoryId = js.native
  /**
    * A list of identifiers of all shared directories in your account. 
    */
  var SharedDirectoryIds: js.UndefOr[DirectoryIds] = js.native
}

object DescribeSharedDirectoriesRequest {
  @scala.inline
  def apply(OwnerDirectoryId: DirectoryId): DescribeSharedDirectoriesRequest = {
    val __obj = js.Dynamic.literal(OwnerDirectoryId = OwnerDirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSharedDirectoriesRequest]
  }
  @scala.inline
  implicit class DescribeSharedDirectoriesRequestOps[Self <: DescribeSharedDirectoriesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOwnerDirectoryId(value: DirectoryId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerDirectoryId")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withSharedDirectoryIds(value: DirectoryIds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SharedDirectoryIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharedDirectoryIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SharedDirectoryIds")(js.undefined)
        ret
    }
  }
  
}

