package typingsSlinky.awsSdk.codegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Repository extends js.Object {
  /**
    * Information about an AWS CodeCommit repository.
    */
  var CodeCommit: js.UndefOr[CodeCommitRepository] = js.native
}

object Repository {
  @scala.inline
  def apply(): Repository = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Repository]
  }
  @scala.inline
  implicit class RepositoryOps[Self <: Repository] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCodeCommit(value: CodeCommitRepository): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CodeCommit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeCommit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CodeCommit")(js.undefined)
        ret
    }
  }
  
}

