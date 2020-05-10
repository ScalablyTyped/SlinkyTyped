package typingsSlinky.ionic.definitionsMod

import typingsSlinky.ionic.ionicStrings.repo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepoStarterTemplate
  extends BaseStarterTemplate
     with StarterTemplate {
  var repo: String = js.native
  var `type`: repo = js.native
}

object RepoStarterTemplate {
  @scala.inline
  def apply(name: String, projectType: ProjectType, repo: String, `type`: repo): RepoStarterTemplate = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], projectType = projectType.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepoStarterTemplate]
  }
  @scala.inline
  implicit class RepoStarterTemplateOps[Self <: RepoStarterTemplate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRepo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: repo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

