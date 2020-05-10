package typingsSlinky.onfleetNodeOnfleet.destinationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @prop { string } [apartment] - The suite or apartment number, or any additional relevant information.
  * @prop { string } city - The name of the municipality.
  * @prop { string } country - The name of the country.
  * @prop { string } [name] - A name associated with this address, for example, "Transamerica Pyramid".
  * @prop { string } number - The number component of this address, it may also contain letters.
  * @prop { string } [postalCode] - The postal or zip code.
  * @prop { string } [state] - The name of the state, province or jurisdiction.
  * @prop { string } street - The name of the street.
  * @prop { string } [unparsed] - A complete address specified in a single, unparsed string where the various elements are separated by commas.
  * * If present, all other address properties will be ignored (with the exception of name and apartment).
  * * In some countries, you may skip most address details (like city or state) if you provide a valid postalCode:
  *  for example, 325 Front Street W., M5V 3B5, CA will be geocoded correctly.
  */
@js.native
trait DestinationAddress extends js.Object {
  var apartment: js.UndefOr[String] = js.native
  var city: String = js.native
  var country: String = js.native
  var name: js.UndefOr[String] = js.native
  var number: String = js.native
  var postalCode: js.UndefOr[String] = js.native
  var state: js.UndefOr[String] = js.native
  var street: String = js.native
  var unparsed: js.UndefOr[String] = js.native
}

object DestinationAddress {
  @scala.inline
  def apply(city: String, country: String, number: String, street: String): DestinationAddress = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], street = street.asInstanceOf[js.Any])
    __obj.asInstanceOf[DestinationAddress]
  }
  @scala.inline
  implicit class DestinationAddressOps[Self <: DestinationAddress] (val x: Self) extends AnyVal {
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
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("street")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApartment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apartment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApartment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apartment")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
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
    def withUnparsed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unparsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnparsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unparsed")(js.undefined)
        ret
    }
  }
  
}

