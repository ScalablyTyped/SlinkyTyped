package typingsSlinky.reactDateRange

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AnyDate = java.lang.String | typingsSlinky.moment.mod.Moment
  type DateFunc = js.Function1[
    /* now */ typingsSlinky.moment.mod.Moment, 
    typingsSlinky.reactDateRange.mod.AnyDate
  ]
  type DateInputType = typingsSlinky.reactDateRange.mod.AnyDate | typingsSlinky.reactDateRange.mod.DateFunc
  type SizeType = scala.Double
}
