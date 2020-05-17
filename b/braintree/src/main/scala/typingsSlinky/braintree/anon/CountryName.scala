package typingsSlinky.braintree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CountryName extends js.Object {
  var company: js.UndefOr[String] = js.native
  var countryName: js.UndefOr[String] = js.native
  var extendedAddress: js.UndefOr[String] = js.native
  var firstName: js.UndefOr[String] = js.native
  var lastName: js.UndefOr[String] = js.native
  var locality: js.UndefOr[String] = js.native
  var postalCode: js.UndefOr[String] = js.native
  var region: js.UndefOr[String] = js.native
  var streetAddress: js.UndefOr[String] = js.native
}

object CountryName {
  @scala.inline
  def apply(): CountryName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CountryName]
  }
  @scala.inline
  implicit class CountryNameOps[Self <: CountryName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompany(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("company")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompany: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("company")(js.undefined)
        ret
    }
    @scala.inline
    def withCountryName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountryName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryName")(js.undefined)
        ret
    }
    @scala.inline
    def withExtendedAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendedAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtendedAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendedAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstName")(js.undefined)
        ret
    }
    @scala.inline
    def withLastName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastName")(js.undefined)
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
  }
  
}

