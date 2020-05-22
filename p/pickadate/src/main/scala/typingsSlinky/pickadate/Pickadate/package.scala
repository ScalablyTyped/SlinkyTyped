package typingsSlinky.pickadate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Pickadate {
  type MinOrMaxDateOption = js.Date | (js.Tuple3[scala.Double, scala.Double, scala.Double]) | scala.Double | scala.Boolean
  type MinOrMaxTimeOption = js.Date | (js.Tuple2[scala.Double, scala.Double]) | scala.Double | scala.Boolean
}
