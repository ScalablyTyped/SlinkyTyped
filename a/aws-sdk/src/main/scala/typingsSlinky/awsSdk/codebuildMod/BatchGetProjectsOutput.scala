package typingsSlinky.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetProjectsOutput extends js.Object {
  /**
    * Information about the requested build projects.
    */
  var projects: js.UndefOr[Projects] = js.native
  /**
    * The names of build projects for which information could not be found.
    */
  var projectsNotFound: js.UndefOr[ProjectNames] = js.native
}

object BatchGetProjectsOutput {
  @scala.inline
  def apply(): BatchGetProjectsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetProjectsOutput]
  }
  @scala.inline
  implicit class BatchGetProjectsOutputOps[Self <: BatchGetProjectsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProjects(value: Projects): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projects")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectsNotFound(value: ProjectNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectsNotFound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectsNotFound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectsNotFound")(js.undefined)
        ret
    }
  }
  
}

