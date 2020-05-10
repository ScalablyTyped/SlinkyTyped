package typingsSlinky.officeJs.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the details about a contact (similar to what's on a physical contact or business card) extracted from the item's body. Read mode only.
  *
  * The list of contacts extracted from the body of an email message or appointment is returned in the `contacts` property of the
  * {@link Office.Entities | Entities} object returned by the `getEntities` or `getEntitiesByType` method of the current item.
  *
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `Restricted`
  * 
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Read
  */
@js.native
trait Contact extends js.Object {
  /**
    * An array of strings containing the mailing and street addresses associated with the contact. Nullable.
    */
  var addresses: js.Array[String] = js.native
  /**
    * A string containing the name of the business associated with the contact. Nullable.
    */
  var businessName: String = js.native
  /**
    * An array of strings containing the SMTP email addresses associated with the contact. Nullable.
    */
  var emailAddresses: js.Array[String] = js.native
  /**
    * A string containing the name of the person associated with the contact. Nullable.
    */
  var personName: String = js.native
  /**
    * An array containing a `PhoneNumber` object for each phone number associated with the contact. Nullable.
    */
  var phoneNumbers: js.Array[PhoneNumber] = js.native
  /**
    * An array of strings containing the Internet URLs associated with the contact. Nullable.
    */
  var urls: js.Array[String] = js.native
}

object Contact {
  @scala.inline
  def apply(
    addresses: js.Array[String],
    businessName: String,
    emailAddresses: js.Array[String],
    personName: String,
    phoneNumbers: js.Array[PhoneNumber],
    urls: js.Array[String]
  ): Contact = {
    val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], businessName = businessName.asInstanceOf[js.Any], emailAddresses = emailAddresses.asInstanceOf[js.Any], personName = personName.asInstanceOf[js.Any], phoneNumbers = phoneNumbers.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contact]
  }
  @scala.inline
  implicit class ContactOps[Self <: Contact] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddresses(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBusinessName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("businessName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmailAddresses(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailAddresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPersonName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhoneNumbers(value: js.Array[PhoneNumber]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneNumbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrls(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urls")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

