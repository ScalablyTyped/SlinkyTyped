package typingsSlinky.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateLicenseSpecification extends js.Object {
  var licenseConfigurationArn: String = js.native
}

object LaunchTemplateLicenseSpecification {
  @scala.inline
  def apply(licenseConfigurationArn: String): LaunchTemplateLicenseSpecification = {
    val __obj = js.Dynamic.literal(licenseConfigurationArn = licenseConfigurationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateLicenseSpecification]
  }
  @scala.inline
  implicit class LaunchTemplateLicenseSpecificationOps[Self <: LaunchTemplateLicenseSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLicenseConfigurationArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licenseConfigurationArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

