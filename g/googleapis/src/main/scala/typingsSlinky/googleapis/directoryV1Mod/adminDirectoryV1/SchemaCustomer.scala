package typingsSlinky.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for Customer Resource object in Directory API.
  */
@js.native
trait SchemaCustomer extends js.Object {
  /**
    * The customer&#39;s secondary contact email address. This email address
    * cannot be on the same domain as the customerDomain
    */
  var alternateEmail: js.UndefOr[String] = js.native
  /**
    * The customer&#39;s creation time (Readonly)
    */
  var customerCreationTime: js.UndefOr[String] = js.native
  /**
    * The customer&#39;s primary domain name string. Do not include the www
    * prefix when creating a new customer.
    */
  var customerDomain: js.UndefOr[String] = js.native
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The unique ID for the customer&#39;s G Suite account. (Readonly)
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies the resource as a customer. Value: admin#directory#customer
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The customer&#39;s ISO 639-2 language code. The default value is en-US
    */
  var language: js.UndefOr[String] = js.native
  /**
    * The customer&#39;s contact phone number in E.164 format.
    */
  var phoneNumber: js.UndefOr[String] = js.native
  /**
    * The customer&#39;s postal address information.
    */
  var postalAddress: js.UndefOr[SchemaCustomerPostalAddress] = js.native
}

object SchemaCustomer {
  @scala.inline
  def apply(): SchemaCustomer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomer]
  }
  @scala.inline
  implicit class SchemaCustomerOps[Self <: SchemaCustomer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlternateEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternateEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlternateEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternateEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomerCreationTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerCreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomerCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerCreationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomerDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomerDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerDomain")(js.undefined)
        ret
    }
    @scala.inline
    def withEtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withPhoneNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhoneNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withPostalAddress(value: SchemaCustomerPostalAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostalAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalAddress")(js.undefined)
        ret
    }
  }
  
}

