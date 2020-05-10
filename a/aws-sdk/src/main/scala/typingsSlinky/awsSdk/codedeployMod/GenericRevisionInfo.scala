package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenericRevisionInfo extends js.Object {
  /**
    * The deployment groups for which this is the current target revision.
    */
  var deploymentGroups: js.UndefOr[DeploymentGroupsList] = js.native
  /**
    * A comment about the revision.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * When the revision was first used by AWS CodeDeploy.
    */
  var firstUsedTime: js.UndefOr[js.Date] = js.native
  /**
    * When the revision was last used by AWS CodeDeploy.
    */
  var lastUsedTime: js.UndefOr[js.Date] = js.native
  /**
    * When the revision was registered with AWS CodeDeploy.
    */
  var registerTime: js.UndefOr[js.Date] = js.native
}

object GenericRevisionInfo {
  @scala.inline
  def apply(): GenericRevisionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenericRevisionInfo]
  }
  @scala.inline
  implicit class GenericRevisionInfoOps[Self <: GenericRevisionInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeploymentGroups(value: DeploymentGroupsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Description): Self = {
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
    def withFirstUsedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstUsedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstUsedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstUsedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUsedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUsedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUsedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUsedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withRegisterTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegisterTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerTime")(js.undefined)
        ret
    }
  }
  
}

