package typingsSlinky.libphonenumberJs

import typingsSlinky.libphonenumberJs.typesMod.CountryCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDefaultCallingCode extends js.Object {
  var defaultCallingCode: js.UndefOr[String] = js.native
  var defaultCountry: js.UndefOr[CountryCode] = js.native
}

object AnonDefaultCallingCode {
  @scala.inline
  def apply(): AnonDefaultCallingCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDefaultCallingCode]
  }
  @scala.inline
  implicit class AnonDefaultCallingCodeOps[Self <: AnonDefaultCallingCode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultCallingCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCallingCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultCallingCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCallingCode")(js.undefined)
        ret
    }
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

