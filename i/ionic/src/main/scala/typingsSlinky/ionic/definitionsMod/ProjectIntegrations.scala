package typingsSlinky.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectIntegrations extends js.Object {
  var capacitor: js.UndefOr[ProjectIntegration] = js.native
  var cordova: js.UndefOr[ProjectIntegration] = js.native
  var enterprise: js.UndefOr[EnterpriseProjectIntegration] = js.native
}

object ProjectIntegrations {
  @scala.inline
  def apply(): ProjectIntegrations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectIntegrations]
  }
  @scala.inline
  implicit class ProjectIntegrationsOps[Self <: ProjectIntegrations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapacitor(value: ProjectIntegration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacitor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapacitor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacitor")(js.undefined)
        ret
    }
    @scala.inline
    def withCordova(value: ProjectIntegration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cordova")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCordova: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cordova")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterprise(value: EnterpriseProjectIntegration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterprise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterprise: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterprise")(js.undefined)
        ret
    }
  }
  
}

