package typingsSlinky.instagramPrivateApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEmailaddresses extends js.Object {
  var email_addresses: js.Array[String] = js.native
  var first_name: String = js.native
  var last_name: String = js.native
  var phone_numbers: js.Array[String] = js.native
}

object AnonEmailaddresses {
  @scala.inline
  def apply(
    email_addresses: js.Array[String],
    first_name: String,
    last_name: String,
    phone_numbers: js.Array[String]
  ): AnonEmailaddresses = {
    val __obj = js.Dynamic.literal(email_addresses = email_addresses.asInstanceOf[js.Any], first_name = first_name.asInstanceOf[js.Any], last_name = last_name.asInstanceOf[js.Any], phone_numbers = phone_numbers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEmailaddresses]
  }
  @scala.inline
  implicit class AnonEmailaddressesOps[Self <: AnonEmailaddresses] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmail_addresses(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email_addresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirst_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLast_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhone_numbers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone_numbers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

