package typingsSlinky.libphonenumberJs

import typingsSlinky.libphonenumberJs.typesMod.CountryCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDefaultCountryCountryCode extends js.Object {
  var defaultCountry: js.UndefOr[CountryCode] = js.native
}

object AnonDefaultCountryCountryCode {
  @scala.inline
  def apply(): AnonDefaultCountryCountryCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDefaultCountryCountryCode]
  }
  @scala.inline
  implicit class AnonDefaultCountryCountryCodeOps[Self <: AnonDefaultCountryCountryCode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultCountry(value: CountryCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCountry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCountry")(js.undefined)
        ret
    }
  }
  
}

