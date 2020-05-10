package typingsSlinky.mendixmodelsdk.transportInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWorkingCopyMetaData extends js.Object {
  var avatarUrl: String = js.native
  var description: String = js.native
  var metaModelVersion: String = js.native
  var name: String = js.native
  var projectId: String = js.native
  var teamServerBaseBranch: js.UndefOr[String] = js.native
  var teamServerBaseRevision: js.UndefOr[Double] = js.native
}

object IWorkingCopyMetaData {
  @scala.inline
  def apply(avatarUrl: String, description: String, metaModelVersion: String, name: String, projectId: String): IWorkingCopyMetaData = {
    val __obj = js.Dynamic.literal(avatarUrl = avatarUrl.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], metaModelVersion = metaModelVersion.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWorkingCopyMetaData]
  }
  @scala.inline
  implicit class IWorkingCopyMetaDataOps[Self <: IWorkingCopyMetaData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvatarUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avatarUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetaModelVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metaModelVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withoutTeamServerBaseBranch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamServerBaseBranch")(js.undefined)
        ret
    }
    @scala.inline
    def withTeamServerBaseRevision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamServerBaseRevision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeamServerBaseRevision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamServerBaseRevision")(js.undefined)
        ret
    }
  }
  
}

