package typingsSlinky.dateDashFns

import typingsSlinky.dateDashFns.dateDashFnsNumbers.`0`
import typingsSlinky.dateDashFns.dateDashFnsNumbers.`1`
import typingsSlinky.dateDashFns.dateDashFnsNumbers.`2`
import typingsSlinky.dateDashFns.dateDashFnsNumbers.`3`
import typingsSlinky.dateDashFns.dateDashFnsNumbers.`4`
import typingsSlinky.dateDashFns.dateDashFnsNumbers.`5`
import typingsSlinky.dateDashFns.dateDashFnsNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_012 extends js.Object {
  var locale: js.UndefOr[Locale] = js.undefined
  var weekStartsOn: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
}

object Anon_012 {
  @scala.inline
  def apply(locale: Locale = null, weekStartsOn: `0` | `1` | `2` | `3` | `4` | `5` | `6` = null): Anon_012 = {
    val __obj = js.Dynamic.literal()
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (weekStartsOn != null) __obj.updateDynamic("weekStartsOn")(weekStartsOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_012]
  }
}

