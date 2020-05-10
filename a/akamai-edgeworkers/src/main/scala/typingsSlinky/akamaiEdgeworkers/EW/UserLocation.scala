package typingsSlinky.akamaiEdgeworkers.EW

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Notes:
  * * If the IP address is in the reserved IP space (as designated by the
  *   Internet Assigned Numbers Authority), every property will have the
  *   value of ‘reserved’.
  * * If user location properties can not be supplied for any reason,
  *   undefined is returned for that property
  */
@js.native
trait UserLocation extends js.Object {
  /**
    * The city value is the city (within a 50-mile radius) that the IP
    * address maps to.
    */
  val city: js.UndefOr[String] = js.native
  /**
    * The continent value is a two-letter code for the continent that
    * the IP address maps to.
    */
  val continent: js.UndefOr[String] = js.native
  /**
    * The country value is an ISO-3166, two-letter code for the country
    * where the IP address maps to.
    */
  val country: js.UndefOr[String] = js.native
  /**
    * The region value is an ISO-3166, two-letter code for the state,
    * province, or region where the IP address maps to.
    */
  val region: js.UndefOr[String] = js.native
  /**
    * The zipCode value is the zipcode that the IP address maps to
    * (multiple values possible).
    *
    * Contiguous zip codes will be represented as a range of the form
    * "FirstZipInRange LastZipInRange", and multiple ranges may be
    * present (each range separated by the plus (+) character).
    *
    * For example, the following strings are all valid zipCode values:
    *
    * * 10001
    * * 10001+10003
    * * 10001-10003+10005
    * * 10001-10003+10005-10008
    *
    * For country = US and country = PR, zip refers to the 5 digit
    * zipcode.
    *
    * For country = CA, zip refers to the forward sortation area (FSA).
    * For more information on FSA, go to http://www.canadapost.ca and
    * search for FSA.
    *
    * See the EdgeScape Users Guide for more details.
    */
  val zipCode: js.UndefOr[String] = js.native
}

object UserLocation {
  @scala.inline
  def apply(): UserLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserLocation]
  }
  @scala.inline
  implicit class UserLocationOps[Self <: UserLocation] (val x: Self) extends AnyVal {
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
    def withContinent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContinent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continent")(js.undefined)
        ret
    }
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
    def withZipCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zipCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZipCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zipCode")(js.undefined)
        ret
    }
  }
  
}

