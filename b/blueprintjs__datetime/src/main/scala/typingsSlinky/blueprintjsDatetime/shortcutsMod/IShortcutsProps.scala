package typingsSlinky.blueprintjsDatetime.shortcutsMod

import typingsSlinky.blueprintjsDatetime.blueprintjsDatetimeBooleans.`true`
import typingsSlinky.blueprintjsDatetime.timePickerMod.TimePrecision
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShortcutsProps extends js.Object {
  var allowSingleDayRange: Boolean = js.native
  var maxDate: js.Date = js.native
  var minDate: js.Date = js.native
  var selectedShortcutIndex: js.UndefOr[Double] = js.native
  var shortcuts: js.Array[IDateRangeShortcut] | `true` = js.native
  var timePrecision: TimePrecision = js.native
  /**
    * The DatePicker component reuses this component for a single date.
    * This changes the default shortcut labels and affects which shortcuts are used.
    * @default false
    */
  var useSingleDateShortcuts: js.UndefOr[Boolean] = js.native
  def onShortcutClick(shortcut: IDateRangeShortcut, index: Double): Unit = js.native
}

object IShortcutsProps {
  @scala.inline
  def apply(
    allowSingleDayRange: Boolean,
    maxDate: js.Date,
    minDate: js.Date,
    onShortcutClick: (IDateRangeShortcut, Double) => Unit,
    shortcuts: js.Array[IDateRangeShortcut] | `true`,
    timePrecision: TimePrecision
  ): IShortcutsProps = {
    val __obj = js.Dynamic.literal(allowSingleDayRange = allowSingleDayRange.asInstanceOf[js.Any], maxDate = maxDate.asInstanceOf[js.Any], minDate = minDate.asInstanceOf[js.Any], onShortcutClick = js.Any.fromFunction2(onShortcutClick), shortcuts = shortcuts.asInstanceOf[js.Any], timePrecision = timePrecision.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShortcutsProps]
  }
  @scala.inline
  implicit class IShortcutsPropsOps[Self <: IShortcutsProps] (val x: Self) extends AnyVal {
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
    def withMaxDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnShortcutClick(value: (IDateRangeShortcut, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShortcutClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withShortcuts(value: js.Array[IDateRangeShortcut] | `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortcuts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimePrecision(value: TimePrecision): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timePrecision")(value.asInstanceOf[js.Any])
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

