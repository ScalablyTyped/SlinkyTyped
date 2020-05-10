package typingsSlinky.pulumiAws.associationMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociationArgs extends js.Object {
  /**
    * ARN of the license configuration.
    */
  val licenseConfigurationArn: Input[String] = js.native
  /**
    * ARN of the resource associated with the license configuration.
    */
  val resourceArn: Input[String] = js.native
}

object AssociationArgs {
  @scala.inline
  def apply(licenseConfigurationArn: Input[String], resourceArn: Input[String]): AssociationArgs = {
    val __obj = js.Dynamic.literal(licenseConfigurationArn = licenseConfigurationArn.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociationArgs]
  }
  @scala.inline
  implicit class AssociationArgsOps[Self <: AssociationArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLicenseConfigurationArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licenseConfigurationArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

