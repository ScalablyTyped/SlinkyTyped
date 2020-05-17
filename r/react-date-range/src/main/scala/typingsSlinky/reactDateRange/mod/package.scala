package typingsSlinky.reactDateRange

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DateFunc = js.Function1[
    /* now */ typingsSlinky.moment.mod.Moment, 
    typingsSlinky.reactDateRange.mod.AnyDate
  ]
  type SizeType = scala.Double
}
