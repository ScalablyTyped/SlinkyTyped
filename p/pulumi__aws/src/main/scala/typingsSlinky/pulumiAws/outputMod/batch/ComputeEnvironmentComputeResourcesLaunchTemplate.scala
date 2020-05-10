package typingsSlinky.pulumiAws.outputMod.batch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComputeEnvironmentComputeResourcesLaunchTemplate extends js.Object {
  /**
    * ID of the launch template. You must specify either the launch template ID or launch template name in the request, but not both.
    */
  var launchTemplateId: js.UndefOr[String] = js.native
  /**
    * Name of the launch template.
    */
  var launchTemplateName: js.UndefOr[String] = js.native
  /**
    * The version number of the launch template. Default: The default version of the launch template.
    */
  var version: js.UndefOr[String] = js.native
}

object ComputeEnvironmentComputeResourcesLaunchTemplate {
  @scala.inline
  def apply(): ComputeEnvironmentComputeResourcesLaunchTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComputeEnvironmentComputeResourcesLaunchTemplate]
  }
  @scala.inline
  implicit class ComputeEnvironmentComputeResourcesLaunchTemplateOps[Self <: ComputeEnvironmentComputeResourcesLaunchTemplate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLaunchTemplateId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchTemplateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchTemplateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchTemplateId")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunchTemplateName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchTemplateName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchTemplateName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchTemplateName")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

