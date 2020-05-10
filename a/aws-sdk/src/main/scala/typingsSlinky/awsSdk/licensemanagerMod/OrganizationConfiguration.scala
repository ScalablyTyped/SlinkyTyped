package typingsSlinky.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrganizationConfiguration extends js.Object {
  /**
    * Enables AWS Organization integration.
    */
  var EnableIntegration: Boolean = js.native
}

object OrganizationConfiguration {
  @scala.inline
  def apply(EnableIntegration: Boolean): OrganizationConfiguration = {
    val __obj = js.Dynamic.literal(EnableIntegration = EnableIntegration.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationConfiguration]
  }
  @scala.inline
  implicit class OrganizationConfigurationOps[Self <: OrganizationConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnableIntegration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableIntegration")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

