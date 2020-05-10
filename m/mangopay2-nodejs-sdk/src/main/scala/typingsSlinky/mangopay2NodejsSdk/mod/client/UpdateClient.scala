package typingsSlinky.mangopay2NodejsSdk.mod.client

import typingsSlinky.mangopay2NodejsSdk.mod.address.AddressType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateClient extends js.Object {
  /**
    * A list of email addresses to use when contacting you for admin/commercial issues/communications
    */
  var AdminEmails: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of email addresses to use when contacting you for billing issues/communications
    */
  var BillingEmails: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of email addresses to use when contacting you for fraud/compliance issues/communications
    */
  var FraudEmails: js.UndefOr[js.Array[String]] = js.native
  /**
    * The address of the company’s headquarters
    */
  var HeadquartersAddress: js.UndefOr[AddressType] = js.native
  /**
    * A description of what your platform does
    */
  var PlatformDescription: js.UndefOr[String] = js.native
  /**
    * The type of platform
    */
  var PlatformType: js.UndefOr[typingsSlinky.mangopay2NodejsSdk.mod.client.PlatformType] = js.native
  /**
    * The URL for your website
    */
  var PlatformURL: js.UndefOr[String] = js.native
  /**
    * The primary branding colour to use for buttons for your merchant
    */
  var PrimaryButtonColour: js.UndefOr[String] = js.native
  /**
    * The primary branding colour to use for your merchant
    */
  var PrimaryThemeColour: js.UndefOr[String] = js.native
  /**
    * The tax (or VAT) number for your company
    */
  var TaxNumber: js.UndefOr[String] = js.native
  /**
    * A list of email addresses to use when contacting you for technical issues/communications
    */
  var TechEmails: js.UndefOr[js.Array[String]] = js.native
}

object UpdateClient {
  @scala.inline
  def apply(): UpdateClient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateClient]
  }
  @scala.inline
  implicit class UpdateClientOps[Self <: UpdateClient] (val x: Self) extends AnyVal {
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
    def withPlatformType(value: PlatformType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatformType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformType")(js.undefined)
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

