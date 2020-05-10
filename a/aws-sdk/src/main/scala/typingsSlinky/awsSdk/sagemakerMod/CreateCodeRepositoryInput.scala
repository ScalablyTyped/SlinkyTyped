package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCodeRepositoryInput extends js.Object {
  /**
    * The name of the Git repository. The name must have 1 to 63 characters. Valid characters are a-z, A-Z, 0-9, and - (hyphen).
    */
  var CodeRepositoryName: EntityName = js.native
  /**
    * Specifies details about the repository, including the URL where the repository is located, the default branch, and credentials to use to access the repository.
    */
  var GitConfig: typingsSlinky.awsSdk.sagemakerMod.GitConfig = js.native
}

object CreateCodeRepositoryInput {
  @scala.inline
  def apply(CodeRepositoryName: EntityName, GitConfig: GitConfig): CreateCodeRepositoryInput = {
    val __obj = js.Dynamic.literal(CodeRepositoryName = CodeRepositoryName.asInstanceOf[js.Any], GitConfig = GitConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCodeRepositoryInput]
  }
  @scala.inline
  implicit class CreateCodeRepositoryInputOps[Self <: CreateCodeRepositoryInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCodeRepositoryName(value: EntityName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CodeRepositoryName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGitConfig(value: GitConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GitConfig")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

