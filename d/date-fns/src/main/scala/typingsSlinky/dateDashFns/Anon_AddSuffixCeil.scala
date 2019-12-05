package typingsSlinky.dateDashFns

import typingsSlinky.dateDashFns.dateDashFnsStrings.ceil
import typingsSlinky.dateDashFns.dateDashFnsStrings.day
import typingsSlinky.dateDashFns.dateDashFnsStrings.floor
import typingsSlinky.dateDashFns.dateDashFnsStrings.hour
import typingsSlinky.dateDashFns.dateDashFnsStrings.minute
import typingsSlinky.dateDashFns.dateDashFnsStrings.month
import typingsSlinky.dateDashFns.dateDashFnsStrings.round
import typingsSlinky.dateDashFns.dateDashFnsStrings.second
import typingsSlinky.dateDashFns.dateDashFnsStrings.year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddSuffixCeil extends js.Object {
  var addSuffix: js.UndefOr[Boolean] = js.undefined
  var locale: js.UndefOr[typingsSlinky.dateDashFns.dateDashFnsMod.Locale] = js.undefined
  var roundingMethod: js.UndefOr[floor | ceil | round] = js.undefined
  var unit: js.UndefOr[second | minute | hour | day | month | year] = js.undefined
}

object Anon_AddSuffixCeil {
  @scala.inline
  def apply(
    addSuffix: js.UndefOr[Boolean] = js.undefined,
    locale: typingsSlinky.dateDashFns.dateDashFnsMod.Locale = null,
    roundingMethod: floor | ceil | round = null,
    unit: second | minute | hour | day | month | year = null
  ): Anon_AddSuffixCeil = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addSuffix)) __obj.updateDynamic("addSuffix")(addSuffix.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (roundingMethod != null) __obj.updateDynamic("roundingMethod")(roundingMethod.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AddSuffixCeil]
  }
}

