package typingsSlinky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dateFns {
  type CurriedFn1[A, R] = js.Function1[/* a */ A, R]
  type DurationAliased = typingsSlinky.dateFns.Duration
  type IntervalAliased = typingsSlinky.dateFns.Interval
  type LocaleAliased = typingsSlinky.dateFns.Locale
}
