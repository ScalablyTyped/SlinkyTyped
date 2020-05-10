package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppIdentity extends js.Object {
  // Refers to the Unique GUID representing Application Id in the Azure Active Directory.
  var appId: js.UndefOr[String] = js.native
  // Refers to the Application Name displayed in the Azure Portal.
  var displayName: js.UndefOr[String] = js.native
  // Refers to the Unique GUID indicating Service Principal Id in Azure Active Directory for the corresponding App.
  var servicePrincipalId: js.UndefOr[String] = js.native
  // Refers to the Service Principal Name is the Application name in the tenant.
  var servicePrincipalName: js.UndefOr[String] = js.native
}

object AppIdentity {
  @scala.inline
  def apply(): AppIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppIdentity]
  }
  @scala.inline
  implicit class AppIdentityOps[Self <: AppIdentity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appId")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withServicePrincipalId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servicePrincipalId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServicePrincipalId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servicePrincipalId")(js.undefined)
        ret
    }
    @scala.inline
    def withServicePrincipalName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servicePrincipalName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServicePrincipalName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servicePrincipalName")(js.undefined)
        ret
    }
  }
  
}

