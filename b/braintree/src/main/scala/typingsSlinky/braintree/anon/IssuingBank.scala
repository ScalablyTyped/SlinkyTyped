package typingsSlinky.braintree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IssuingBank extends js.Object {
  var CountryOfIssuance: String = js.native
  var IssuingBank: String = js.native
}

object IssuingBank {
  @scala.inline
  def apply(CountryOfIssuance: String, IssuingBank: String): IssuingBank = {
    val __obj = js.Dynamic.literal(CountryOfIssuance = CountryOfIssuance.asInstanceOf[js.Any], IssuingBank = IssuingBank.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuingBank]
  }
  @scala.inline
  implicit class IssuingBankOps[Self <: IssuingBank] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCountryOfIssuance(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CountryOfIssuance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssuingBank(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IssuingBank")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

