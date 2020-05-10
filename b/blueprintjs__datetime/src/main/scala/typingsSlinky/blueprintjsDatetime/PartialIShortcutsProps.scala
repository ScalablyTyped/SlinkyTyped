package typingsSlinky.blueprintjsDatetime

import typingsSlinky.blueprintjsDatetime.blueprintjsDatetimeBooleans.`true`
import typingsSlinky.blueprintjsDatetime.shortcutsMod.IDateRangeShortcut
import typingsSlinky.blueprintjsDatetime.timePickerMod.TimePrecision
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@blueprintjs/datetime.@blueprintjs/datetime/lib/esm/shortcuts.IShortcutsProps> */
@js.native
trait PartialIShortcutsProps extends js.Object {
  var allowSingleDayRange: js.UndefOr[Boolean] = js.native
  var maxDate: js.UndefOr[js.Date] = js.native
  var minDate: js.UndefOr[js.Date] = js.native
  var onShortcutClick: js.UndefOr[js.Function2[/* shortcut */ IDateRangeShortcut, /* index */ Double, Unit]] = js.native
  var selectedShortcutIndex: js.UndefOr[Double] = js.native
  var shortcuts: js.UndefOr[js.Array[IDateRangeShortcut] | `true`] = js.native
  var timePrecision: js.UndefOr[TimePrecision] = js.native
  var useSingleDateShortcuts: js.UndefOr[Boolean] = js.native
}

object PartialIShortcutsProps {
  @scala.inline
  def apply(): PartialIShortcutsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIShortcutsProps]
  }
  @scala.inline
  implicit class PartialIShortcutsPropsOps[Self <: PartialIShortcutsProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowSingleDayRange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSingleDayRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSingleDayRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSingleDayRange")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDate")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShortcutClick(value: (/* shortcut */ IDateRangeShortcut, /* index */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShortcutClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnShortcutClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShortcutClick")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedShortcutIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedShortcutIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedShortcutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedShortcutIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withShortcuts(value: js.Array[IDateRangeShortcut] | `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortcuts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortcuts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortcuts")(js.undefined)
        ret
    }
    @scala.inline
    def withTimePrecision(value: TimePrecision): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timePrecision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimePrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timePrecision")(js.undefined)
        ret
    }
    @scala.inline
    def withUseSingleDateShortcuts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSingleDateShortcuts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseSingleDateShortcuts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSingleDateShortcuts")(js.undefined)
        ret
    }
  }
  
}

