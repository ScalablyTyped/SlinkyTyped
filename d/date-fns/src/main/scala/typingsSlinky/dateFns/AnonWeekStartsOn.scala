package typingsSlinky.dateFns

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

trait AnonWeekStartsOn extends js.Object {
  var locale: js.UndefOr[Locale] = js.undefined
  var weekStartsOn: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
}

object AnonWeekStartsOn {
  @scala.inline
  def apply(locale: Locale = null, weekStartsOn: `0` | `1` | `2` | `3` | `4` | `5` | `6` = null): AnonWeekStartsOn = {
    val __obj = js.Dynamic.literal()
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (weekStartsOn != null) __obj.updateDynamic("weekStartsOn")(weekStartsOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWeekStartsOn]
  }
}

