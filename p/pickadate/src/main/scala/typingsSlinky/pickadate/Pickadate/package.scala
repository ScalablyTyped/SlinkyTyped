package typingsSlinky.pickadate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Pickadate {
  type MinOrMaxDateOption = js.Date | (js.Tuple3[Double, Double, Double]) | Double | Boolean
  type MinOrMaxTimeOption = js.Date | (js.Tuple2[Double, Double]) | Double | Boolean
}
