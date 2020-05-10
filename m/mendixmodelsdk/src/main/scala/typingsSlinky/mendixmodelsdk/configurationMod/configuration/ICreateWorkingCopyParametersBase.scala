package typingsSlinky.mendixmodelsdk.configurationMod.configuration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICreateWorkingCopyParametersBase extends js.Object {
  var avatarUrl: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  /**
    * Indicates whether this WC is created for the purpose of collaboration between the Desktop modeler and Webmodeler.
    * By setting this, BiDi won't be available anymore for this project and thus requires a modeler with version 7.23.3 or higher.
    */
  var isCollaboration: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the working copy should be long-lived.
    * This parameter can only be set to true when the Mendix project id is set and the Model SDK is used from a trusted backend
    *  - this excludes regular SDK users for the moment.
    */
  var longLived: js.UndefOr[Boolean] = js.native
  /**
    * Force the working copy state to be marked to contain changes.
    *  - this excludes regular SDK users for the moment.
    */
  var markAsChanged: js.UndefOr[Boolean] = js.native
  var name: String = js.native
  /**
    * Mendix project id. Needed for deployment and team server commits
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Indicates whether the new working copy should be the default working copy associated with the provided projectId.
    * This means that this working copy will be opened in the Web Modeler for the given project.
    * This parameter can only be set to true when the Mendix project id is set and the Model SDK is used from a trusted backend
    *  - this excludes regular SDK users for the moment.
    */
  var setAsDefault: js.UndefOr[Boolean] = js.native
  /**
    * If this WC is created from a TeamServer checkout, the BaseRevision / BaseBranch can be used by the Desktop Modeler during merge.
    */
  var teamServerBaseBranch: js.UndefOr[String] = js.native
  /**
    * If this WC is created from a TeamServer checkout, the BaseRevision / BaseBranch can be used by the Desktop Modeler during merge.
    * @type {number}
    */
  var teamServerBaseRevision: js.UndefOr[Double] = js.native
}

object ICreateWorkingCopyParametersBase {
  @scala.inline
  def apply(name: String): ICreateWorkingCopyParametersBase = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICreateWorkingCopyParametersBase]
  }
  @scala.inline
  implicit class ICreateWorkingCopyParametersBaseOps[Self <: ICreateWorkingCopyParametersBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAvatarUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avatarUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvatarUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avatarUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCollaboration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCollaboration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCollaboration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCollaboration")(js.undefined)
        ret
    }
    @scala.inline
    def withLongLived(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longLived")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongLived: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longLived")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkAsChanged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markAsChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkAsChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markAsChanged")(js.undefined)
        ret
    }
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
    def withSetAsDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAsDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetAsDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAsDefault")(js.undefined)
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

