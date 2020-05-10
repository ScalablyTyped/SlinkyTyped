package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLaunchTemplateRequest extends js.Object {
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
    * A name for the launch template.
    */
  var LaunchTemplateName: typingsSlinky.awsSdk.ec2Mod.LaunchTemplateName = js.native
  /**
    * The tags to apply to the launch template during creation.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.native
  /**
    * A description for the first version of the launch template.
    */
  var VersionDescription: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.VersionDescription] = js.native
}

object CreateLaunchTemplateRequest {
  @scala.inline
  def apply(LaunchTemplateData: RequestLaunchTemplateData, LaunchTemplateName: LaunchTemplateName): CreateLaunchTemplateRequest = {
    val __obj = js.Dynamic.literal(LaunchTemplateData = LaunchTemplateData.asInstanceOf[js.Any], LaunchTemplateName = LaunchTemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLaunchTemplateRequest]
  }
  @scala.inline
  implicit class CreateLaunchTemplateRequestOps[Self <: CreateLaunchTemplateRequest] (val x: Self) extends AnyVal {
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
    def withLaunchTemplateName(value: LaunchTemplateName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchTemplateName")(value.asInstanceOf[js.Any])
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
    def withTagSpecifications(value: TagSpecificationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagSpecifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagSpecifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagSpecifications")(js.undefined)
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

