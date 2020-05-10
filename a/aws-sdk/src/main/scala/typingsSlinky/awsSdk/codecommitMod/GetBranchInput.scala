package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBranchInput extends js.Object {
  /**
    * The name of the branch for which you want to retrieve information.
    */
  var branchName: js.UndefOr[BranchName] = js.native
  /**
    * The name of the repository that contains the branch for which you want to retrieve information.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.native
}

object GetBranchInput {
  @scala.inline
  def apply(): GetBranchInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBranchInput]
  }
  @scala.inline
  implicit class GetBranchInputOps[Self <: GetBranchInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBranchName(value: BranchName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branchName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBranchName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branchName")(js.undefined)
        ret
    }
    @scala.inline
    def withRepositoryName(value: RepositoryName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepositoryName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryName")(js.undefined)
        ret
    }
  }
  
}

