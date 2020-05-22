package typingsSlinky.dateFns.anon

import typingsSlinky.dateFns.dateFnsNumbers.`0`
import typingsSlinky.dateFns.dateFnsNumbers.`1`
import typingsSlinky.dateFns.dateFnsNumbers.`2`
import typingsSlinky.dateFns.dateFnsNumbers.`3`
import typingsSlinky.dateFns.dateFnsNumbers.`4`
import typingsSlinky.dateFns.dateFnsNumbers.`5`
import typingsSlinky.dateFns.dateFnsNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseAdditionalWeekYearTokens extends js.Object {
  var firstWeekContainsDate: js.UndefOr[Double] = js.undefined
  var locale: js.UndefOr[typingsSlinky.dateFns.Locale] = js.undefined
  var useAdditionalDayOfYearTokens: js.UndefOr[Boolean] = js.undefined
  var useAdditionalWeekYearTokens: js.UndefOr[Boolean] = js.undefined
  var weekStartsOn: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
}

object UseAdditionalWeekYearTokens {
  @scala.inline
  def apply(
    firstWeekContainsDate: js.UndefOr[Double] = js.undefined,
    locale: typingsSlinky.dateFns.Locale = null,
    useAdditionalDayOfYearTokens: js.UndefOr[Boolean] = js.undefined,
    useAdditionalWeekYearTokens: js.UndefOr[Boolean] = js.undefined,
    weekStartsOn: `0` | `1` | `2` | `3` | `4` | `5` | `6` = null
  ): UseAdditionalWeekYearTokens = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(firstWeekContainsDate)) __obj.updateDynamic("firstWeekContainsDate")(firstWeekContainsDate.get.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (!js.isUndefined(useAdditionalDayOfYearTokens)) __obj.updateDynamic("useAdditionalDayOfYearTokens")(useAdditionalDayOfYearTokens.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useAdditionalWeekYearTokens)) __obj.updateDynamic("useAdditionalWeekYearTokens")(useAdditionalWeekYearTokens.get.asInstanceOf[js.Any])
    if (weekStartsOn != null) __obj.updateDynamic("weekStartsOn")(weekStartsOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseAdditionalWeekYearTokens]
  }
}

