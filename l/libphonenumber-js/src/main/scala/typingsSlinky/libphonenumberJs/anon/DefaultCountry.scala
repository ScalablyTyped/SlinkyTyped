package typingsSlinky.libphonenumberJs.anon

import typingsSlinky.libphonenumberJs.libphonenumberJsBooleans.`true`
import typingsSlinky.libphonenumberJs.typesMod.CountryCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultCountry extends js.Object {
  var defaultCountry: js.UndefOr[CountryCode] = js.native
  var v2: `true` = js.native
}

object DefaultCountry {
  @scala.inline
  def apply(v2: `true`): DefaultCountry = {
    val __obj = js.Dynamic.literal(v2 = v2.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultCountry]
  }
  @scala.inline
  implicit class DefaultCountryOps[Self <: DefaultCountry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withV2(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v2")(value.asInstanceOf[js.Any])
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

