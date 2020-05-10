package typingsSlinky.pulumiAws.inputMod.ec2

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FleetLaunchTemplateConfigLaunchTemplateSpecification extends js.Object {
  /**
    * ID of the launch template.
    */
  var launchTemplateId: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the launch template.
    */
  var launchTemplateName: js.UndefOr[Input[String]] = js.native
  /**
    * Version number of the launch template.
    */
  var version: Input[String] = js.native
}

object FleetLaunchTemplateConfigLaunchTemplateSpecification {
  @scala.inline
  def apply(version: Input[String]): FleetLaunchTemplateConfigLaunchTemplateSpecification = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetLaunchTemplateConfigLaunchTemplateSpecification]
  }
  @scala.inline
  implicit class FleetLaunchTemplateConfigLaunchTemplateSpecificationOps[Self <: FleetLaunchTemplateConfigLaunchTemplateSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVersion(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLaunchTemplateId(value: Input[String]): Self = {
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
    def withLaunchTemplateName(value: Input[String]): Self = {
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
  }
  
}

