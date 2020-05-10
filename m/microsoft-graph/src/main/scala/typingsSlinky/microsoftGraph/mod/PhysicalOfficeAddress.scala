package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhysicalOfficeAddress extends js.Object {
  // The city.
  var city: js.UndefOr[String] = js.native
  // The country or region. It's a free-format string value, for example, 'United States'.
  var countryOrRegion: js.UndefOr[String] = js.native
  // Office location such as building and office number for an organizational contact.
  var officeLocation: js.UndefOr[String] = js.native
  // The postal code.
  var postalCode: js.UndefOr[String] = js.native
  // The state.
  var state: js.UndefOr[String] = js.native
  // The street.
  var street: js.UndefOr[String] = js.native
}

object PhysicalOfficeAddress {
  @scala.inline
  def apply(): PhysicalOfficeAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhysicalOfficeAddress]
  }
  @scala.inline
  implicit class PhysicalOfficeAddressOps[Self <: PhysicalOfficeAddress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city")(js.undefined)
        ret
    }
    @scala.inline
    def withCountryOrRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryOrRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountryOrRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryOrRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withOfficeLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("officeLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOfficeLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("officeLocation")(js.undefined)
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
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withStreet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("street")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("street")(js.undefined)
        ret
    }
  }
  
}

