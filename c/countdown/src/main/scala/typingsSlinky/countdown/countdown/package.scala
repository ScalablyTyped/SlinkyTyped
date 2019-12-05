package typingsSlinky.countdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object countdown {
  type DateFunction = js.Function1[/* timespan */ Timespan, Unit]
  type DateTime = js.UndefOr[Double | js.Date | DateFunction | Null]
}
