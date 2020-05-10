package typingsSlinky.mangopay2NodejsSdk.mod.client

import typingsSlinky.mangopay2NodejsSdk.mod.address.AddressType
import typingsSlinky.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientData extends EntityBaseData {
  /**
    * A list of email addresses to use when contacting you for admin/commercial issues/communications
    */
  var AdminEmails: js.Array[String] = js.native
  /**
    * A list of email addresses to use when contacting you for billing issues/communications
    */
  var BillingEmails: js.Array[String] = js.native
  /**
    * An ID for the client (i.e. url friendly, lowercase etc - sort of namespace identifier)
    */
  var ClientId: String = js.native
  /**
    * Your unique MANGOPAY reference which you should use when contacting us
    */
  var CompanyReference: String = js.native
  /**
    * A list of email addresses to use when contacting you for fraud/compliance issues/communications
    */
  var FraudEmails: js.Array[String] = js.native
  /**
    * The address of the company’s headquarters
    */
  var HeadquartersAddress: AddressType = js.native
  /**
    * The URL of the logo of your client
    */
  var Logo: String = js.native
  /**
    * The pretty name for the client
    */
  var Name: String = js.native
  /**
    * The Categorization of your platform, in terms of Business Type and Sector
    */
  var PlatformCategorization: typingsSlinky.mangopay2NodejsSdk.mod.client.PlatformCategorization = js.native
  /**
    * A description of what your platform does
    */
  var PlatformDescription: String = js.native
  /**
    * The URL for your website
    */
  var PlatformURL: String = js.native
  /**
    * The primary branding colour to use for buttons for your merchant
    */
  var PrimaryButtonColour: String = js.native
  /**
    * The primary branding colour to use for your merchant
    */
  var PrimaryThemeColour: String = js.native
  /**
    * The registered name of your company
    */
  var RegisteredName: String = js.native
  /**
    * The tax (or VAT) number for your company
    */
  var TaxNumber: String = js.native
  /**
    * A list of email addresses to use when contacting you for technical issues/communications
    */
  var TechEmails: js.Array[String] = js.native
}

object ClientData {
  @scala.inline
  def apply(
    AdminEmails: js.Array[String],
    BillingEmails: js.Array[String],
    ClientId: String,
    CompanyReference: String,
    CreationDate: Double,
    FraudEmails: js.Array[String],
    HeadquartersAddress: AddressType,
    Id: String,
    Logo: String,
    Name: String,
    PlatformCategorization: PlatformCategorization,
    PlatformDescription: String,
    PlatformURL: String,
    PrimaryButtonColour: String,
    PrimaryThemeColour: String,
    RegisteredName: String,
    Tag: String,
    TaxNumber: String,
    TechEmails: js.Array[String]
  ): ClientData = {
    val __obj = js.Dynamic.literal(AdminEmails = AdminEmails.asInstanceOf[js.Any], BillingEmails = BillingEmails.asInstanceOf[js.Any], ClientId = ClientId.asInstanceOf[js.Any], CompanyReference = CompanyReference.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], FraudEmails = FraudEmails.asInstanceOf[js.Any], HeadquartersAddress = HeadquartersAddress.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Logo = Logo.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PlatformCategorization = PlatformCategorization.asInstanceOf[js.Any], PlatformDescription = PlatformDescription.asInstanceOf[js.Any], PlatformURL = PlatformURL.asInstanceOf[js.Any], PrimaryButtonColour = PrimaryButtonColour.asInstanceOf[js.Any], PrimaryThemeColour = PrimaryThemeColour.asInstanceOf[js.Any], RegisteredName = RegisteredName.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], TaxNumber = TaxNumber.asInstanceOf[js.Any], TechEmails = TechEmails.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientData]
  }
  @scala.inline
  implicit class ClientDataOps[Self <: ClientData] (val x: Self) extends AnyVal {
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
    def withBillingEmails(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BillingEmails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompanyReference(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompanyReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFraudEmails(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FraudEmails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeadquartersAddress(value: AddressType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HeadquartersAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Logo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatformCategorization(value: PlatformCategorization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformCategorization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatformDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatformURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryButtonColour(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrimaryButtonColour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryThemeColour(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrimaryThemeColour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegisteredName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegisteredName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaxNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaxNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTechEmails(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TechEmails")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

