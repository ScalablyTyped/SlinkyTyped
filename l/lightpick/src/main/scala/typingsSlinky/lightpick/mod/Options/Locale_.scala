package typingsSlinky.lightpick.mod.Options

import typingsSlinky.lightpick.anon.PartialPluralizeFnLocale
import typingsSlinky.lightpick.mod.Options.Locale.Buttons
import typingsSlinky.lightpick.mod.Options.Locale.PluralizeFn
import typingsSlinky.lightpick.mod.Options.Locale.PluralizeFnLocale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Locale_ extends js.Object {
  /**
    * Text for buttons.
    */
  var buttons: js.UndefOr[Buttons] = js.native
  var pluralize: js.UndefOr[PluralizeFn] = js.native
  /**
    * Text for tooltip.
    */
  var tooltip: js.UndefOr[PartialPluralizeFnLocale] = js.native
  /**
    * Show tooltip text on disabled dates. (Eg. «Already booked»)
    */
  var tooltipOnDisabled: js.UndefOr[String] = js.native
}

object Locale_ {
  @scala.inline
  def apply(): Locale_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Locale_]
  }
  @scala.inline
  implicit class Locale_Ops[Self <: Locale_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButtons(value: Buttons): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(js.undefined)
        ret
    }
    @scala.inline
    def withPluralize(value: (/* i */ String | Double, /* locale */ PluralizeFnLocale) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluralize")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPluralize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluralize")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: PartialPluralizeFnLocale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipOnDisabled(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipOnDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipOnDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipOnDisabled")(js.undefined)
        ret
    }
  }
  
}

