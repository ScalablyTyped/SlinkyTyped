package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteLaunchTemplateVersionsRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the launch template. You must specify either the launch template ID or launch template name in the request.
    */
  var LaunchTemplateId: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.LaunchTemplateId] = js.native
  /**
    * The name of the launch template. You must specify either the launch template ID or launch template name in the request.
    */
  var LaunchTemplateName: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.LaunchTemplateName] = js.native
  /**
    * The version numbers of one or more launch template versions to delete.
    */
  var Versions: VersionStringList = js.native
}

object DeleteLaunchTemplateVersionsRequest {
  @scala.inline
  def apply(Versions: VersionStringList): DeleteLaunchTemplateVersionsRequest = {
    val __obj = js.Dynamic.literal(Versions = Versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLaunchTemplateVersionsRequest]
  }
  @scala.inline
  implicit class DeleteLaunchTemplateVersionsRequestOps[Self <: DeleteLaunchTemplateVersionsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVersions(value: VersionStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Versions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDryRun(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDryRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunchTemplateId(value: LaunchTemplateId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchTemplateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchTemplateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchTemplateId")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunchTemplateName(value: LaunchTemplateName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchTemplateName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchTemplateName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchTemplateName")(js.undefined)
        ret
    }
  }
  
}

