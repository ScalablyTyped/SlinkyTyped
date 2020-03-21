package typingsSlinky.d3Array

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Primitive = scala.Double | java.lang.String | scala.Boolean | js.Date
  type ThresholdCountGenerator[Value /* <: js.UndefOr[scala.Double] */] = js.Function3[
    /* values */ typingsSlinky.std.ArrayLike[Value], 
    /* min */ scala.Double, 
    /* max */ scala.Double, 
    scala.Double
  ]
  type ThresholdDateArrayGenerator[Value /* <: js.UndefOr[js.Date] */] = js.Function3[
    /* values */ typingsSlinky.std.ArrayLike[Value], 
    /* min */ js.Date, 
    /* max */ js.Date, 
    js.Array[Value]
  ]
  type ThresholdNumberArrayGenerator[Value /* <: js.UndefOr[scala.Double] */] = js.Function3[
    /* values */ typingsSlinky.std.ArrayLike[Value], 
    /* min */ scala.Double, 
    /* max */ scala.Double, 
    js.Array[Value]
  ]
}
