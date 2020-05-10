package typingsSlinky.pulumiAws.inputMod.codebuild

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectSecondarySourceGitSubmodulesConfig extends js.Object {
  /**
    * If set to true, fetches Git submodules for the AWS CodeBuild build project.
    */
  var fetchSubmodules: Input[Boolean] = js.native
}

object ProjectSecondarySourceGitSubmodulesConfig {
  @scala.inline
  def apply(fetchSubmodules: Input[Boolean]): ProjectSecondarySourceGitSubmodulesConfig = {
    val __obj = js.Dynamic.literal(fetchSubmodules = fetchSubmodules.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectSecondarySourceGitSubmodulesConfig]
  }
  @scala.inline
  implicit class ProjectSecondarySourceGitSubmodulesConfigOps[Self <: ProjectSecondarySourceGitSubmodulesConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFetchSubmodules(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchSubmodules")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

