package typingsSlinky.blueprintjsDatetime.shortcutsMod

import typingsSlinky.blueprintjsDatetime.blueprintjsDatetimeBooleans.`true`
import typingsSlinky.blueprintjsDatetime.timePickerMod.TimePrecision
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShortcutsProps extends js.Object {
  var allowSingleDayRange: Boolean
  var maxDate: js.Date
  var minDate: js.Date
  var selectedShortcutIndex: js.UndefOr[Double] = js.undefined
  var shortcuts: js.Array[IDateRangeShortcut] | `true`
  var timePrecision: TimePrecision
  /**
    * The DatePicker component reuses this component for a single date.
    * This changes the default shortcut labels and affects which shortcuts are used.
    * @default false
    */
  var useSingleDateShortcuts: js.UndefOr[Boolean] = js.undefined
  def onShortcutClick(shortcut: IDateRangeShortcut, index: Double): Unit
}

object IShortcutsProps {
  @scala.inline
  def apply(
    allowSingleDayRange: Boolean,
    maxDate: js.Date,
    minDate: js.Date,
    onShortcutClick: (IDateRangeShortcut, Double) => Unit,
    shortcuts: js.Array[IDateRangeShortcut] | `true`,
    timePrecision: TimePrecision,
    selectedShortcutIndex: js.UndefOr[Double] = js.undefined,
    useSingleDateShortcuts: js.UndefOr[Boolean] = js.undefined
  ): IShortcutsProps = {
    val __obj = js.Dynamic.literal(allowSingleDayRange = allowSingleDayRange.asInstanceOf[js.Any], maxDate = maxDate.asInstanceOf[js.Any], minDate = minDate.asInstanceOf[js.Any], onShortcutClick = js.Any.fromFunction2(onShortcutClick), shortcuts = shortcuts.asInstanceOf[js.Any], timePrecision = timePrecision.asInstanceOf[js.Any])
    if (!js.isUndefined(selectedShortcutIndex)) __obj.updateDynamic("selectedShortcutIndex")(selectedShortcutIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useSingleDateShortcuts)) __obj.updateDynamic("useSingleDateShortcuts")(useSingleDateShortcuts.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShortcutsProps]
  }
}

