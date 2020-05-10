package typingsSlinky.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShippingAddress extends js.Object {
  var city: String = js.native
  var country_code: String = js.native
  var post_code: String = js.native
  var state: String = js.native
  var street_line1: String = js.native
  var street_line2: String = js.native
}

object ShippingAddress {
  @scala.inline
  def apply(
    city: String,
    country_code: String,
    post_code: String,
    state: String,
    street_line1: String,
    street_line2: String
  ): ShippingAddress = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], country_code = country_code.asInstanceOf[js.Any], post_code = post_code.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], street_line1 = street_line1.asInstanceOf[js.Any], street_line2 = street_line2.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShippingAddress]
  }
  @scala.inline
  implicit class ShippingAddressOps[Self <: ShippingAddress] (val x: Self) extends AnyVal {
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
    def withCountry_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPost_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreet_line1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("street_line1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreet_line2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("street_line2")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

