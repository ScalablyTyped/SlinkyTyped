package typingsSlinky.cwise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Arg = typingsSlinky.ndarray.mod.ndarray[scala.Double] | (js.Function2[/* row */ scala.Double, /* col */ scala.Double, scala.Double]) | js.Array[scala.Double] | js.Any
  type Return = js.Function2[
    /* a */ typingsSlinky.ndarray.mod.ndarray[scala.Double], 
    /* repeated */ typingsSlinky.cwise.mod.Arg, 
    scala.Unit
  ]
}
