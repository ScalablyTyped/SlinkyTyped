package typingsSlinky.mangopay2NodejsSdk.anon

import typingsSlinky.mangopay2NodejsSdk.mod.address.AddressType
import typingsSlinky.mangopay2NodejsSdk.mod.client.PlatformCategorization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.client.ClientData> */
@js.native
trait PartialClientData extends js.Object {
  var AdminEmails: js.UndefOr[js.Array[String]] = js.native
  var BillingEmails: js.UndefOr[js.Array[String]] = js.native
  var ClientId: js.UndefOr[String] = js.native
  var CompanyReference: js.UndefOr[String] = js.native
  var CreationDate: js.UndefOr[Double] = js.native
  var FraudEmails: js.UndefOr[js.Array[String]] = js.native
  var HeadquartersAddress: js.UndefOr[AddressType] = js.native
  var Id: js.UndefOr[String] = js.native
  var Logo: js.UndefOr[String] = js.native
  var Name: js.UndefOr[String] = js.native
  var PlatformCategorization: js.UndefOr[typingsSlinky.mangopay2NodejsSdk.mod.client.PlatformCategorization] = js.native
  var PlatformDescription: js.UndefOr[String] = js.native
  var PlatformURL: js.UndefOr[String] = js.native
  var PrimaryButtonColour: js.UndefOr[String] = js.native
  var PrimaryThemeColour: js.UndefOr[String] = js.native
  var RegisteredName: js.UndefOr[String] = js.native
  var Tag: js.UndefOr[String] = js.native
  var TaxNumber: js.UndefOr[String] = js.native
  var TechEmails: js.UndefOr[js.Array[String]] = js.native
}

object PartialClientData {
  @scala.inline
  def apply(): PartialClientData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClientData]
  }
  @scala.inline
  implicit class PartialClientDataOps[Self <: PartialClientData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdminEmails(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdminEmails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdminEmails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdminEmails")(js.undefined)
        ret
    }
    @scala.inline
    def withBillingEmails(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BillingEmails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBillingEmails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BillingEmails")(js.undefined)
        ret
    }
    @scala.inline
    def withClientId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientId")(js.undefined)
        ret
    }
    @scala.inline
    def withCompanyReference(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompanyReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompanyReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompanyReference")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationDate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withFraudEmails(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FraudEmails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFraudEmails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FraudEmails")(js.undefined)
        ret
    }
    @scala.inline
    def withHeadquartersAddress(value: AddressType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HeadquartersAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeadquartersAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HeadquartersAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withLogo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Logo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Logo")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatformCategorization(value: PlatformCategorization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformCategorization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatformCategorization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformCategorization")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatformDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatformDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatformURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatformURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformURL")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryButtonColour(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrimaryButtonColour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryButtonColour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrimaryButtonColour")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryThemeColour(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrimaryThemeColour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryThemeColour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrimaryThemeColour")(js.undefined)
        ret
    }
    @scala.inline
    def withRegisteredName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegisteredName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegisteredName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegisteredName")(js.undefined)
        ret
    }
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tag")(js.undefined)
        ret
    }
    @scala.inline
    def withTaxNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaxNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaxNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaxNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withTechEmails(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TechEmails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTechEmails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TechEmails")(js.undefined)
        ret
    }
  }
  
}

