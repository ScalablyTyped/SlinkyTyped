package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBranchOutput extends js.Object {
  /**
    * Information about the branch deleted by the operation, including the branch name and the commit ID that was the tip of the branch.
    */
  var deletedBranch: js.UndefOr[BranchInfo] = js.native
}

object DeleteBranchOutput {
  @scala.inline
  def apply(): DeleteBranchOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteBranchOutput]
  }
  @scala.inline
  implicit class DeleteBranchOutputOps[Self <: DeleteBranchOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeletedBranch(value: BranchInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletedBranch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletedBranch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletedBranch")(js.undefined)
        ret
    }
  }
  
}

