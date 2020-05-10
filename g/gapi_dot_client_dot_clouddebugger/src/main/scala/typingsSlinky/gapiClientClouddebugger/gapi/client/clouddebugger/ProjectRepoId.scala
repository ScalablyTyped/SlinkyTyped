package typingsSlinky.gapiClientClouddebugger.gapi.client.clouddebugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectRepoId extends js.Object {
  /** The ID of the project. */
  var projectId: js.UndefOr[String] = js.native
  /** The name of the repo. Leave empty for the default repo. */
  var repoName: js.UndefOr[String] = js.native
}

object ProjectRepoId {
  @scala.inline
  def apply(): ProjectRepoId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectRepoId]
  }
  @scala.inline
  implicit class ProjectRepoIdOps[Self <: ProjectRepoId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(js.undefined)
        ret
    }
    @scala.inline
    def withRepoName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repoName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepoName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repoName")(js.undefined)
        ret
    }
  }
  
}

