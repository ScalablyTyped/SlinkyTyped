package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrgContact extends DirectoryObject {
  var addresses: js.UndefOr[js.Array[PhysicalOfficeAddress]] = js.native
  var companyName: js.UndefOr[String] = js.native
  var department: js.UndefOr[String] = js.native
  var directReports: js.UndefOr[js.Array[DirectoryObject]] = js.native
  var displayName: js.UndefOr[String] = js.native
  var givenName: js.UndefOr[String] = js.native
  var jobTitle: js.UndefOr[String] = js.native
  var mail: js.UndefOr[String] = js.native
  var mailNickname: js.UndefOr[String] = js.native
  var manager: js.UndefOr[DirectoryObject] = js.native
  var memberOf: js.UndefOr[js.Array[DirectoryObject]] = js.native
  var onPremisesLastSyncDateTime: js.UndefOr[String] = js.native
  var onPremisesProvisioningErrors: js.UndefOr[js.Array[OnPremisesProvisioningError]] = js.native
  var onPremisesSyncEnabled: js.UndefOr[Boolean] = js.native
  var phones: js.UndefOr[js.Array[Phone]] = js.native
  var proxyAddresses: js.UndefOr[js.Array[String]] = js.native
  var surname: js.UndefOr[String] = js.native
  var transitiveMemberOf: js.UndefOr[js.Array[DirectoryObject]] = js.native
}

object OrgContact {
  @scala.inline
  def apply(): OrgContact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrgContact]
  }
  @scala.inline
  implicit class OrgContactOps[Self <: OrgContact] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddresses(value: js.Array[PhysicalOfficeAddress]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addresses")(js.undefined)
        ret
    }
    @scala.inline
    def withCompanyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("companyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompanyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("companyName")(js.undefined)
        ret
    }
    @scala.inline
    def withDepartment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("department")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepartment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("department")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectReports(value: js.Array[DirectoryObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directReports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectReports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directReports")(js.undefined)
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
    def withGivenName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("givenName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGivenName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("givenName")(js.undefined)
        ret
    }
    @scala.inline
    def withJobTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withMail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mail")(js.undefined)
        ret
    }
    @scala.inline
    def withMailNickname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mailNickname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMailNickname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mailNickname")(js.undefined)
        ret
    }
    @scala.inline
    def withManager(value: DirectoryObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManager: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manager")(js.undefined)
        ret
    }
    @scala.inline
    def withMemberOf(value: js.Array[DirectoryObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memberOf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemberOf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memberOf")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPremisesLastSyncDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPremisesLastSyncDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPremisesLastSyncDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPremisesLastSyncDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPremisesProvisioningErrors(value: js.Array[OnPremisesProvisioningError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPremisesProvisioningErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPremisesProvisioningErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPremisesProvisioningErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPremisesSyncEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPremisesSyncEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPremisesSyncEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPremisesSyncEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withPhones(value: js.Array[Phone]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhones: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phones")(js.undefined)
        ret
    }
    @scala.inline
    def withProxyAddresses(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyAddresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxyAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyAddresses")(js.undefined)
        ret
    }
    @scala.inline
    def withSurname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("surname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSurname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("surname")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitiveMemberOf(value: js.Array[DirectoryObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitiveMemberOf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitiveMemberOf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitiveMemberOf")(js.undefined)
        ret
    }
  }
  
}

