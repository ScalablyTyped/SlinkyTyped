package typingsSlinky.luxon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToRelativeCalendarOptions extends js.Object {
  /** The DateTime to use as the basis to which this time is compared. Defaults to now. */
  var base: js.UndefOr[DateTime] = js.native
  var locale: js.UndefOr[String] = js.native
  /** The Intl system may choose not to honor this. */
  var numberingSystem: js.UndefOr[NumberingSystem] = js.native
  /** If omitted, the method will pick the unit. */
  var unit: js.UndefOr[ToRelativeUnit] = js.native
}

object ToRelativeCalendarOptions {
  @scala.inline
  def apply(): ToRelativeCalendarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToRelativeCalendarOptions]
  }
  @scala.inline
  implicit class ToRelativeCalendarOptionsOps[Self <: ToRelativeCalendarOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBase(value: DateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberingSystem(value: NumberingSystem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberingSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberingSystem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberingSystem")(js.undefined)
        ret
    }
    @scala.inline
    def withUnit(value: ToRelativeUnit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(js.undefined)
        ret
    }
  }
  
}

