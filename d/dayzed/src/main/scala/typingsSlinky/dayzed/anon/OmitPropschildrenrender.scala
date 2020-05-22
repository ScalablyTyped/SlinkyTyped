package typingsSlinky.dayzed.anon

import typingsSlinky.dayzed.dayzedNumbers.`0`
import typingsSlinky.dayzed.dayzedNumbers.`1`
import typingsSlinky.dayzed.dayzedNumbers.`2`
import typingsSlinky.dayzed.dayzedNumbers.`3`
import typingsSlinky.dayzed.dayzedNumbers.`4`
import typingsSlinky.dayzed.dayzedNumbers.`5`
import typingsSlinky.dayzed.dayzedNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<dayzed.dayzed.Props, 'children' | 'render'> */
trait OmitPropschildrenrender extends js.Object {
  var date: js.UndefOr[js.Date] = js.undefined
  var firstDayOfWeek: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
  var maxDate: js.UndefOr[js.Date] = js.undefined
  var minDate: js.UndefOr[js.Date] = js.undefined
  var monthsToDisplay: js.UndefOr[Double] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var onDateSelected: js.Function1[/* selectedDate */ typingsSlinky.dayzed.mod.DateObj, Unit]
  var onOffsetChanged: js.UndefOr[js.Function1[/* offset */ Double, Unit]] = js.undefined
  var selected: js.UndefOr[js.Date | js.Array[js.Date]] = js.undefined
  var showOutsideDays: js.UndefOr[Boolean] = js.undefined
}

object OmitPropschildrenrender {
  @scala.inline
  def apply(
    onDateSelected: /* selectedDate */ typingsSlinky.dayzed.mod.DateObj => Unit,
    date: js.Date = null,
    firstDayOfWeek: `0` | `1` | `2` | `3` | `4` | `5` | `6` = null,
    maxDate: js.Date = null,
    minDate: js.Date = null,
    monthsToDisplay: js.UndefOr[Double] = js.undefined,
    offset: js.UndefOr[Double] = js.undefined,
    onOffsetChanged: /* offset */ Double => Unit = null,
    selected: js.Date | js.Array[js.Date] = null,
    showOutsideDays: js.UndefOr[Boolean] = js.undefined
  ): OmitPropschildrenrender = {
    val __obj = js.Dynamic.literal(onDateSelected = js.Any.fromFunction1(onDateSelected))
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (!js.isUndefined(monthsToDisplay)) __obj.updateDynamic("monthsToDisplay")(monthsToDisplay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (onOffsetChanged != null) __obj.updateDynamic("onOffsetChanged")(js.Any.fromFunction1(onOffsetChanged))
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (!js.isUndefined(showOutsideDays)) __obj.updateDynamic("showOutsideDays")(showOutsideDays.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitPropschildrenrender]
  }
}

