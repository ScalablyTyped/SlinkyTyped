package typingsSlinky.braintreeWeb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostalCode extends js.Object {
  var postalCode: js.UndefOr[String] = js.native
}

object PostalCode {
  @scala.inline
  def apply(): PostalCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostalCode]
  }
  @scala.inline
  implicit class PostalCodeOps[Self <: PostalCode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

