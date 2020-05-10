package typingsSlinky.faker.Faker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FullAddress extends js.Object {
  var city: String = js.native
  var county: String = js.native
  var geo: Geo = js.native
  var state: String = js.native
  var streetA: String = js.native
  var streetB: String = js.native
  var streetC: String = js.native
  var streetD: String = js.native
  var zipcode: String = js.native
}

object FullAddress {
  @scala.inline
  def apply(
    city: String,
    county: String,
    geo: Geo,
    state: String,
    streetA: String,
    streetB: String,
    streetC: String,
    streetD: String,
    zipcode: String
  ): FullAddress = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], county = county.asInstanceOf[js.Any], geo = geo.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], streetA = streetA.asInstanceOf[js.Any], streetB = streetB.asInstanceOf[js.Any], streetC = streetC.asInstanceOf[js.Any], streetD = streetD.asInstanceOf[js.Any], zipcode = zipcode.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullAddress]
  }
  @scala.inline
  implicit class FullAddressOps[Self <: FullAddress] (val x: Self) extends AnyVal {
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
    def withCounty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("county")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGeo(value: Geo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreetA(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streetA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreetB(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streetB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreetC(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streetC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreetD(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streetD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZipcode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zipcode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

