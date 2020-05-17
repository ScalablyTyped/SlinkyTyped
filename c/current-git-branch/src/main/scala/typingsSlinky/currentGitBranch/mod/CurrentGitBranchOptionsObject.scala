package typingsSlinky.currentGitBranch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurrentGitBranchOptionsObject extends CurrentGitBranchOptions {
  var altPath: js.UndefOr[String] = js.native
  var branchOptions: js.UndefOr[String] = js.native
}

object CurrentGitBranchOptionsObject {
  @scala.inline
  def apply(): CurrentGitBranchOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrentGitBranchOptionsObject]
  }
  @scala.inline
  implicit class CurrentGitBranchOptionsObjectOps[Self <: CurrentGitBranchOptionsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAltPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altPath")(js.undefined)
        ret
    }
    @scala.inline
    def withBranchOptions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branchOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBranchOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branchOptions")(js.undefined)
        ret
    }
  }
  
}

