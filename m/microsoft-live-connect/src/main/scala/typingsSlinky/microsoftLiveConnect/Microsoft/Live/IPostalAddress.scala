package typingsSlinky.microsoftLiveConnect.Microsoft.Live

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about one postal address.
  */
@js.native
trait IPostalAddress extends js.Object {
  /**
    * The city of the address, or null if one is not specified.
    */
  var city: String = js.native
  /**
    * The postal code of the address, or null if one is not specified.
    */
  var postal_code: String = js.native
  /**
    * The region of the address, or null if one is not specified.
    */
  var region: String = js.native
  /**
    * The state of the address, or null if one is not specified.
    */
  var state: String = js.native
  /**
    * The street address, or null if one is not specified.
    */
  var street: String = js.native
  /**
    * The second line of the street address, or null if one is not
    * specified.
    */
  var street_2: String = js.native
}

object IPostalAddress {
  @scala.inline
  def apply(city: String, postal_code: String, region: String, state: String, street: String, street_2: String): IPostalAddress = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], postal_code = postal_code.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], street = street.asInstanceOf[js.Any], street_2 = street_2.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPostalAddress]
  }
  @scala.inline
  implicit class IPostalAddressOps[Self <: IPostalAddress] (val x: Self) extends AnyVal {
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
    def withPostal_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postal_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("street")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreet_2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("street_2")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

