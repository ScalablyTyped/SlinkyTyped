package typingsSlinky.libphonenumberJs.mod

import typingsSlinky.libphonenumberJs.typesMod.CountryCode
import typingsSlinky.libphonenumberJs.typesMod.Metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormatNumberOptions extends js.Object {
  var formatExtension: js.UndefOr[FormatExtension] = js.native
  var fromCountry: js.UndefOr[CountryCode] = js.native
  var humanReadable: js.UndefOr[Boolean] = js.native
  var v2: js.UndefOr[Boolean] = js.native
}

object FormatNumberOptions {
  @scala.inline
  def apply(): FormatNumberOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatNumberOptions]
  }
  @scala.inline
  implicit class FormatNumberOptionsOps[Self <: FormatNumberOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormatExtension(value: (/* number */ String, /* extension */ String, /* metadata */ Metadata) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatExtension")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutFormatExtension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatExtension")(js.undefined)
        ret
    }
    @scala.inline
    def withFromCountry(value: CountryCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromCountry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromCountry")(js.undefined)
        ret
    }
    @scala.inline
    def withHumanReadable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("humanReadable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHumanReadable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("humanReadable")(js.undefined)
        ret
    }
    @scala.inline
    def withV2(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutV2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v2")(js.undefined)
        ret
    }
  }
  
}

