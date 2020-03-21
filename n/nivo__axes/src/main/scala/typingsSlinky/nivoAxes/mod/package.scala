package typingsSlinky.nivoAxes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Axis = js.Any
  type TickFormatter = js.Function1[
    /* value */ scala.Double | java.lang.String | js.Date, 
    java.lang.String | scala.Double
  ]
}
