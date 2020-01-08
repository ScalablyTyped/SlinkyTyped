package typingsSlinky.fundamentalDashReact.libCalendarCalendarMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarBaseProps extends js.Object {
  /* Blocks dates that are in between the blocked dates. */
  var blockedDates: js.UndefOr[js.Array[js.Date]] = js.undefined
  var customStyles: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* Disables dates of a calendar that come after the specified date. */
  var disableAfterDate: js.UndefOr[js.Date] = js.undefined
  /* Disables dates of a calendar that come before the specified date. */
  var disableBeforeDate: js.UndefOr[js.Date] = js.undefined
  /* Set to **true** to disable dates after today's date. */
  var disableFutureDates: js.UndefOr[Boolean] = js.undefined
  /* Set to **true** to disable dates before today's date. */
  var disablePastDates: js.UndefOr[Boolean] = js.undefined
  var disableStyles: js.UndefOr[Boolean] = js.undefined
  /* Disables dates that match a weekday. */
  var disableWeekday: js.UndefOr[js.Array[String]] = js.undefined
  /* Set to **true** to disables dates that match a weekend. */
  var disableWeekends: js.UndefOr[Boolean] = js.undefined
  /* Disables dates that are in between the disabled dates. */
  var disabledDates: js.UndefOr[js.Array[js.Date]] = js.undefined
}

object CalendarBaseProps {
  @scala.inline
  def apply(
    blockedDates: js.Array[js.Date] = null,
    customStyles: StringDictionary[js.Any] = null,
    disableAfterDate: js.Date = null,
    disableBeforeDate: js.Date = null,
    disableFutureDates: js.UndefOr[Boolean] = js.undefined,
    disablePastDates: js.UndefOr[Boolean] = js.undefined,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    disableWeekday: js.Array[String] = null,
    disableWeekends: js.UndefOr[Boolean] = js.undefined,
    disabledDates: js.Array[js.Date] = null
  ): CalendarBaseProps = {
    val __obj = js.Dynamic.literal()
    if (blockedDates != null) __obj.updateDynamic("blockedDates")(blockedDates.asInstanceOf[js.Any])
    if (customStyles != null) __obj.updateDynamic("customStyles")(customStyles.asInstanceOf[js.Any])
    if (disableAfterDate != null) __obj.updateDynamic("disableAfterDate")(disableAfterDate.asInstanceOf[js.Any])
    if (disableBeforeDate != null) __obj.updateDynamic("disableBeforeDate")(disableBeforeDate.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFutureDates)) __obj.updateDynamic("disableFutureDates")(disableFutureDates.asInstanceOf[js.Any])
    if (!js.isUndefined(disablePastDates)) __obj.updateDynamic("disablePastDates")(disablePastDates.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (disableWeekday != null) __obj.updateDynamic("disableWeekday")(disableWeekday.asInstanceOf[js.Any])
    if (!js.isUndefined(disableWeekends)) __obj.updateDynamic("disableWeekends")(disableWeekends.asInstanceOf[js.Any])
    if (disabledDates != null) __obj.updateDynamic("disabledDates")(disabledDates.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarBaseProps]
  }
}

