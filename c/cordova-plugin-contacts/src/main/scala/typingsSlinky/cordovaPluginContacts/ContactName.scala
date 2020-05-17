package typingsSlinky.cordovaPluginContacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains different kinds of information about a Contact object's name. */
@js.native
trait ContactName extends js.Object {
  /** The contact's family name. */
  var familyName: js.UndefOr[String] = js.native
  /** The complete name of the contact. */
  var formatted: js.UndefOr[String] = js.native
  /** The contact's given name. */
  var givenName: js.UndefOr[String] = js.native
  /** The contact's prefix (example Mr. or Dr.) */
  var honorificPrefix: js.UndefOr[String] = js.native
  /** The contact's suffix (example Esq.). */
  var honorificSuffix: js.UndefOr[String] = js.native
  /** The contact's middle name. */
  var middleName: js.UndefOr[String] = js.native
}

object ContactName {
  @scala.inline
  def apply(): ContactName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactName]
  }
  @scala.inline
  implicit class ContactNameOps[Self <: ContactName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFamilyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("familyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFamilyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("familyName")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatted(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatted")(js.undefined)
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
    def withHonorificPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("honorificPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHonorificPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("honorificPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withHonorificSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("honorificSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHonorificSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("honorificSuffix")(js.undefined)
        ret
    }
    @scala.inline
    def withMiddleName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMiddleName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middleName")(js.undefined)
        ret
    }
  }
  
}

