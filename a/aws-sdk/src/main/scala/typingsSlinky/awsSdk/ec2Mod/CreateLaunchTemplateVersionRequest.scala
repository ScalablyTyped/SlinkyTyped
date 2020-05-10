package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLaunchTemplateVersionRequest extends js.Object {
  /**
    * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more information, see Ensuring Idempotency. Constraint: Maximum 128 ASCII characters.
    */
  var ClientToken: js.UndefOr[String] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The information for the launch template.
    */
  var LaunchTemplateData: RequestLaunchTemplateData = js.native
  /**
    * The ID of the launch template. You must specify either the launch template ID or launch template name in the request.
    */
  var LaunchTemplateId: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.LaunchTemplateId] = js.native
  /**
    * The name of the launch template. You must specify either the launch template ID or launch template name in the request.
    */
  var LaunchTemplateName: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.LaunchTemplateName] = js.native
  /**
    * The version number of the launch template version on which to base the new version. The new version inherits the same launch parameters as the source version, except for parameters that you specify in LaunchTemplateData. Snapshots applied to the block device mapping are ignored when creating a new version unless they are explicitly included.
    */
  var SourceVersion: js.UndefOr[String] = js.native
  /**
    * A description for the version of the launch template.
    */
  var VersionDescription: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.VersionDescription] = js.native
}

object CreateLaunchTemplateVersionRequest {
  @scala.inline
  def apply(LaunchTemplateData: RequestLaunchTemplateData): CreateLaunchTemplateVersionRequest = {
    val __obj = js.Dynamic.literal(LaunchTemplateData = LaunchTemplateData.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLaunchTemplateVersionRequest]
  }
  @scala.inline
  implicit class CreateLaunchTemplateVersionRequestOps[Self <: CreateLaunchTemplateVersionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLaunchTemplateData(value: RequestLaunchTemplateData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchTemplateData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientToken")(js.undefined)
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
    @scala.inline
    def withSourceVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionDescription(value: VersionDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionDescription")(js.undefined)
        ret
    }
  }
  
}

