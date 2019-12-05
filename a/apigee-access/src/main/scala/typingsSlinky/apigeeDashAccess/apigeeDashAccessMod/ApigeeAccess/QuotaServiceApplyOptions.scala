package typingsSlinky.apigeeDashAccess.apigeeDashAccessMod.ApigeeAccess

import typingsSlinky.apigeeDashAccess.apigeeDashAccessStrings.day
import typingsSlinky.apigeeDashAccess.apigeeDashAccessStrings.hour
import typingsSlinky.apigeeDashAccess.apigeeDashAccessStrings.minute
import typingsSlinky.apigeeDashAccess.apigeeDashAccessStrings.month
import typingsSlinky.apigeeDashAccess.apigeeDashAccessStrings.week
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuotaServiceApplyOptions extends js.Object {
  var allow: Double
  var identifier: String
  var interval: js.UndefOr[Double] = js.undefined
  var timeUnit: minute | hour | day | week | month
  var weight: js.UndefOr[Double] = js.undefined
}

object QuotaServiceApplyOptions {
  @scala.inline
  def apply(
    allow: Double,
    identifier: String,
    timeUnit: minute | hour | day | week | month,
    interval: Int | Double = null,
    weight: Int | Double = null
  ): QuotaServiceApplyOptions = {
    val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], timeUnit = timeUnit.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuotaServiceApplyOptions]
  }
}

