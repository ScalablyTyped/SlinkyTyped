package typingsSlinky.dc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Accessor[T, V] = js.Function2[/* datum */ T, /* index */ js.UndefOr[scala.Double], V]
  type UnitFunction = js.Function3[
    /* start */ scala.Double | js.Date, 
    /* end */ scala.Double | js.Date, 
    /* domain */ js.UndefOr[scala.Double | js.Array[java.lang.String]], 
    scala.Double | (js.Array[scala.Double | js.Date | java.lang.String])
  ]
}
