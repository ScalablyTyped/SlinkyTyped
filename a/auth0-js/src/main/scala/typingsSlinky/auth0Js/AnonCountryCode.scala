package typingsSlinky.auth0Js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCountryCode extends js.Object {
  var countryCode: String = js.native
}

object AnonCountryCode {
  @scala.inline
  def apply(countryCode: String): AnonCountryCode = {
    val __obj = js.Dynamic.literal(countryCode = countryCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCountryCode]
  }
  @scala.inline
  implicit class AnonCountryCodeOps[Self <: AnonCountryCode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCountryCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryCode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

