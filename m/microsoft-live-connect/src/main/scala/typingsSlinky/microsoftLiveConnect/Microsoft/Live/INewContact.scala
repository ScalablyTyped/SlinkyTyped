package typingsSlinky.microsoftLiveConnect.Microsoft.Live

import typingsSlinky.microsoftLiveConnect.anon.Business
import typingsSlinky.microsoftLiveConnect.anon.Employer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a new contact.
  */
@js.native
trait INewContact extends js.Object {
  /**
    * The contact's email addresses.
    */
  var emails: js.UndefOr[Business] = js.native
  /**
    * The contact's first name.
    */
  var first_name: js.UndefOr[String] = js.native
  /**
    * The contact's last name.
    */
  var last_name: js.UndefOr[String] = js.native
  /**
    * An array that contains the contact's work info.
    */
  var work: js.UndefOr[js.Array[Employer]] = js.native
}

object INewContact {
  @scala.inline
  def apply(): INewContact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INewContact]
  }
  @scala.inline
  implicit class INewContactOps[Self <: INewContact] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmails(value: Business): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emails")(js.undefined)
        ret
    }
    @scala.inline
    def withFirst_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirst_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first_name")(js.undefined)
        ret
    }
    @scala.inline
    def withLast_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLast_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_name")(js.undefined)
        ret
    }
    @scala.inline
    def withWork(value: js.Array[Employer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("work")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("work")(js.undefined)
        ret
    }
  }
  
}

