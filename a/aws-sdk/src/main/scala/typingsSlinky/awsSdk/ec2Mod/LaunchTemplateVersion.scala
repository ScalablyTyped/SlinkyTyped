package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateVersion extends js.Object {
  /**
    * The time the version was created.
    */
  var CreateTime: js.UndefOr[js.Date] = js.native
  /**
    * The principal that created the version.
    */
  var CreatedBy: js.UndefOr[String] = js.native
  /**
    * Indicates whether the version is the default version.
    */
  var DefaultVersion: js.UndefOr[Boolean] = js.native
  /**
    * Information about the launch template.
    */
  var LaunchTemplateData: js.UndefOr[ResponseLaunchTemplateData] = js.native
  /**
    * The ID of the launch template.
    */
  var LaunchTemplateId: js.UndefOr[String] = js.native
  /**
    * The name of the launch template.
    */
  var LaunchTemplateName: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.LaunchTemplateName] = js.native
  /**
    * The description for the version.
    */
  var VersionDescription: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.VersionDescription] = js.native
  /**
    * The version number.
    */
  var VersionNumber: js.UndefOr[Long] = js.native
}

object LaunchTemplateVersion {
  @scala.inline
  def apply(): LaunchTemplateVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateVersion]
  }
  @scala.inline
  implicit class LaunchTemplateVersionOps[Self <: LaunchTemplateVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedBy")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultVersion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunchTemplateData(value: ResponseLaunchTemplateData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchTemplateData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchTemplateData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchTemplateData")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunchTemplateId(value: String): Self = {
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
    @scala.inline
    def withVersionNumber(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionNumber")(js.undefined)
        ret
    }
  }
  
}

