package typingsSlinky.expo.anon

import typingsSlinky.expo.expoStrings.day
import typingsSlinky.expo.expoStrings.hour
import typingsSlinky.expo.expoStrings.minute
import typingsSlinky.expo.expoStrings.month
import typingsSlinky.expo.expoStrings.week
import typingsSlinky.expo.expoStrings.year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntervalMs extends js.Object {
  var intervalMs: js.UndefOr[Double] = js.undefined
  var repeat: js.UndefOr[minute | hour | day | week | month | year] = js.undefined
  var time: js.UndefOr[Double | js.Date] = js.undefined
}

object IntervalMs {
  @scala.inline
  def apply(
    intervalMs: js.UndefOr[Double] = js.undefined,
    repeat: minute | hour | day | week | month | year = null,
    time: Double | js.Date = null
  ): IntervalMs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(intervalMs)) __obj.updateDynamic("intervalMs")(intervalMs.get.asInstanceOf[js.Any])
    if (repeat != null) __obj.updateDynamic("repeat")(repeat.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntervalMs]
  }
}

