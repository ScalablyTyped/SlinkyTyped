package typingsSlinky.dateFns

import typingsSlinky.dateFns.dateFnsNumbers.`0`
import typingsSlinky.dateFns.dateFnsNumbers.`1`
import typingsSlinky.dateFns.dateFnsNumbers.`2`
import typingsSlinky.dateFns.dateFnsNumbers.`3`
import typingsSlinky.dateFns.dateFnsNumbers.`4`
import typingsSlinky.dateFns.dateFnsNumbers.`5`
import typingsSlinky.dateFns.dateFnsNumbers.`6`
import typingsSlinky.dateFns.dateFnsNumbers.`7`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUseAdditionalDayOfYearTokensUseAdditionalWeekYearTokens extends js.Object {
  var firstWeekContainsDate: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6` | `7`] = js.undefined
  var locale: js.UndefOr[typingsSlinky.dateFns.mod.Locale] = js.undefined
  var useAdditionalDayOfYearTokens: js.UndefOr[Boolean] = js.undefined
  var useAdditionalWeekYearTokens: js.UndefOr[Boolean] = js.undefined
  var weekStartsOn: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
}

object AnonUseAdditionalDayOfYearTokensUseAdditionalWeekYearTokens {
  @scala.inline
  def apply(
    firstWeekContainsDate: `1` | `2` | `3` | `4` | `5` | `6` | `7` = null,
    locale: typingsSlinky.dateFns.mod.Locale = null,
    useAdditionalDayOfYearTokens: js.UndefOr[Boolean] = js.undefined,
    useAdditionalWeekYearTokens: js.UndefOr[Boolean] = js.undefined,
    weekStartsOn: `0` | `1` | `2` | `3` | `4` | `5` | `6` = null
  ): AnonUseAdditionalDayOfYearTokensUseAdditionalWeekYearTokens = {
    val __obj = js.Dynamic.literal()
    if (firstWeekContainsDate != null) __obj.updateDynamic("firstWeekContainsDate")(firstWeekContainsDate.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (!js.isUndefined(useAdditionalDayOfYearTokens)) __obj.updateDynamic("useAdditionalDayOfYearTokens")(useAdditionalDayOfYearTokens.asInstanceOf[js.Any])
    if (!js.isUndefined(useAdditionalWeekYearTokens)) __obj.updateDynamic("useAdditionalWeekYearTokens")(useAdditionalWeekYearTokens.asInstanceOf[js.Any])
    if (weekStartsOn != null) __obj.updateDynamic("weekStartsOn")(weekStartsOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUseAdditionalDayOfYearTokensUseAdditionalWeekYearTokens]
  }
}

