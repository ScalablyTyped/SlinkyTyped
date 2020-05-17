package typingsSlinky.cordovaPluginContacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The ContactAddress object stores the properties of a single address of a contact.
  * A Contact object may include more than one address in a ContactAddress[] array.
  */
@js.native
trait ContactAddress extends js.Object {
  /** The country name. */
  var country: js.UndefOr[String] = js.native
  /** The full address formatted for display. */
  var formatted: js.UndefOr[String] = js.native
  /** The city or locality. */
  var locality: js.UndefOr[String] = js.native
  /** The zip code or postal code. */
  var postalCode: js.UndefOr[String] = js.native
  /** Set to true if this ContactAddress contains the user's preferred value. */
  var pref: js.UndefOr[Boolean] = js.native
  /** The state or region. */
  var region: js.UndefOr[String] = js.native
  /** The full street address. */
  var streetAddress: js.UndefOr[String] = js.native
  /** A string indicating what type of field this is, home for example. */
  var `type`: js.UndefOr[String] = js.native
}

object ContactAddress {
  @scala.inline
  def apply(): ContactAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactAddress]
  }
  @scala.inline
  implicit class ContactAddressOps[Self <: ContactAddress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(js.undefined)
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
    def withLocality(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locality")(js.undefined)
        ret
    }
    @scala.inline
    def withPostalCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostalCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalCode")(js.undefined)
        ret
    }
    @scala.inline
    def withPref(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPref: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pref")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
        ret
    }
    @scala.inline
    def withStreetAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streetAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreetAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streetAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

