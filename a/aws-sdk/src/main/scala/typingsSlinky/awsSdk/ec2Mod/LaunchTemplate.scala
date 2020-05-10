package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplate extends js.Object {
  /**
    * The time launch template was created.
    */
  var CreateTime: js.UndefOr[js.Date] = js.native
  /**
    * The principal that created the launch template. 
    */
  var CreatedBy: js.UndefOr[String] = js.native
  /**
    * The version number of the default version of the launch template.
    */
  var DefaultVersionNumber: js.UndefOr[Long] = js.native
  /**
    * The version number of the latest version of the launch template.
    */
  var LatestVersionNumber: js.UndefOr[Long] = js.native
  /**
    * The ID of the launch template.
    */
  var LaunchTemplateId: js.UndefOr[String] = js.native
  /**
    * The name of the launch template.
    */
  var LaunchTemplateName: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.LaunchTemplateName] = js.native
  /**
    * The tags for the launch template.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object LaunchTemplate {
  @scala.inline
  def apply(): LaunchTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplate]
  }
  @scala.inline
  implicit class LaunchTemplateOps[Self <: LaunchTemplate] (val x: Self) extends AnyVal {
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
    def withDefaultVersionNumber(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultVersionNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultVersionNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultVersionNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withLatestVersionNumber(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LatestVersionNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatestVersionNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LatestVersionNumber")(js.undefined)
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
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

