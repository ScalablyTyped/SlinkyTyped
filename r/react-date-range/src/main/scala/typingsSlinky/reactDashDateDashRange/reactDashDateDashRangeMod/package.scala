package typingsSlinky.reactDashDateDashRange

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashDateDashRangeMod {
  import typingsSlinky.moment.momentMod.Moment

  type AnyDate = String | Moment
  type DateFunc = js.Function1[/* now */ Moment, AnyDate]
  type DateInputType = AnyDate | DateFunc
  type SizeType = Double
}
