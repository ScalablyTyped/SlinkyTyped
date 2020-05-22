package typingsSlinky.dateFns.anon

import typingsSlinky.dateFns.dateFnsStrings.ceil
import typingsSlinky.dateFns.dateFnsStrings.day
import typingsSlinky.dateFns.dateFnsStrings.floor
import typingsSlinky.dateFns.dateFnsStrings.hour
import typingsSlinky.dateFns.dateFnsStrings.minute
import typingsSlinky.dateFns.dateFnsStrings.month
import typingsSlinky.dateFns.dateFnsStrings.round
import typingsSlinky.dateFns.dateFnsStrings.second
import typingsSlinky.dateFns.dateFnsStrings.year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoundingMethod extends js.Object {
  var addSuffix: js.UndefOr[Boolean] = js.undefined
  var locale: js.UndefOr[typingsSlinky.dateFns.mod.Locale] = js.undefined
  var roundingMethod: js.UndefOr[floor | ceil | round] = js.undefined
  var unit: js.UndefOr[second | minute | hour | day | month | year] = js.undefined
}

object RoundingMethod {
  @scala.inline
  def apply(
    addSuffix: js.UndefOr[Boolean] = js.undefined,
    locale: typingsSlinky.dateFns.mod.Locale = null,
    roundingMethod: floor | ceil | round = null,
    unit: second | minute | hour | day | month | year = null
  ): RoundingMethod = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addSuffix)) __obj.updateDynamic("addSuffix")(addSuffix.get.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (roundingMethod != null) __obj.updateDynamic("roundingMethod")(roundingMethod.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoundingMethod]
  }
}

