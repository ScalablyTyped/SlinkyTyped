package typingsSlinky.mendixmodelsdk.configurationMod.configuration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICreateWorkingCopyFromTeamServerParameters extends ICreateWorkingCopyParametersBase {
  @JSName("projectId")
  var projectId_ICreateWorkingCopyFromTeamServerParameters: String = js.native
  @JSName("teamServerBaseBranch")
  var teamServerBaseBranch_ICreateWorkingCopyFromTeamServerParameters: String = js.native
  @JSName("teamServerBaseRevision")
  var teamServerBaseRevision_ICreateWorkingCopyFromTeamServerParameters: Double = js.native
}

object ICreateWorkingCopyFromTeamServerParameters {
  @scala.inline
  def apply(name: String, projectId: String, teamServerBaseBranch: String, teamServerBaseRevision: Double): ICreateWorkingCopyFromTeamServerParameters = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], teamServerBaseBranch = teamServerBaseBranch.asInstanceOf[js.Any], teamServerBaseRevision = teamServerBaseRevision.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICreateWorkingCopyFromTeamServerParameters]
  }
  @scala.inline
  implicit class ICreateWorkingCopyFromTeamServerParametersOps[Self <: ICreateWorkingCopyFromTeamServerParameters] (val x: Self) extends AnyVal {
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
    def withTeamServerBaseBranch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamServerBaseBranch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeamServerBaseRevision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamServerBaseRevision")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

