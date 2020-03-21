package typingsSlinky.async

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrorFilter extends js.Object {
  var errorFilter: js.UndefOr[js.Function1[/* error */ js.Error, Boolean]] = js.undefined
  var interval: js.UndefOr[Double | (js.Function1[/* retryCount */ Double, Double])] = js.undefined
  var times: js.UndefOr[Double] = js.undefined
}

object AnonErrorFilter {
  @scala.inline
  def apply(
    errorFilter: /* error */ js.Error => Boolean = null,
    interval: Double | (js.Function1[/* retryCount */ Double, Double]) = null,
    times: Int | Double = null
  ): AnonErrorFilter = {
    val __obj = js.Dynamic.literal()
    if (errorFilter != null) __obj.updateDynamic("errorFilter")(js.Any.fromFunction1(errorFilter))
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (times != null) __obj.updateDynamic("times")(times.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonErrorFilter]
  }
}

