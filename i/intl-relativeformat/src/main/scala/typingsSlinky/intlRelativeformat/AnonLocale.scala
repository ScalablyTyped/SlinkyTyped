package typingsSlinky.intlRelativeformat

import typingsSlinky.intlRelativeformat.typesMod.STYLE
import typingsSlinky.intlRelativeformat.typesMod.SUPPORTED_FIELD
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLocale extends js.Object {
  var locale: String = js.native
  var style: STYLE = js.native
  var units: js.UndefOr[SUPPORTED_FIELD] = js.native
}

object AnonLocale {
  @scala.inline
  def apply(locale: String, style: STYLE): AnonLocale = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLocale]
  }
  @scala.inline
  implicit class AnonLocaleOps[Self <: AnonLocale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: STYLE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnits(value: SUPPORTED_FIELD): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("units")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("units")(js.undefined)
        ret
    }
  }
  
}

