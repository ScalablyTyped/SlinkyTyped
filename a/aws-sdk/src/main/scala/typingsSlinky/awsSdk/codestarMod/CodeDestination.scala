package typingsSlinky.awsSdk.codestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeDestination extends js.Object {
  /**
    * Information about the AWS CodeCommit repository to be created in AWS CodeStar. This is where the source code files provided with the project request will be uploaded after project creation.
    */
  var codeCommit: js.UndefOr[CodeCommitCodeDestination] = js.native
  /**
    * Information about the GitHub repository to be created in AWS CodeStar. This is where the source code files provided with the project request will be uploaded after project creation.
    */
  var gitHub: js.UndefOr[GitHubCodeDestination] = js.native
}

object CodeDestination {
  @scala.inline
  def apply(): CodeDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeDestination]
  }
  @scala.inline
  implicit class CodeDestinationOps[Self <: CodeDestination] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCodeCommit(value: CodeCommitCodeDestination): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeCommit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeCommit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeCommit")(js.undefined)
        ret
    }
    @scala.inline
    def withGitHub(value: GitHubCodeDestination): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gitHub")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGitHub: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gitHub")(js.undefined)
        ret
    }
  }
  
}

