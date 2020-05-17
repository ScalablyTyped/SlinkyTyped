package typingsSlinky.pickadate.Pickadate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Date
  - js.Tuple3[scala.Double, scala.Double, scala.Double]
  - scala.Double
  - scala.Boolean
*/
trait MinOrMaxDateOption extends js.Object

object MinOrMaxDateOption {
  @scala.inline
  implicit def apply(value: Boolean): MinOrMaxDateOption = value.asInstanceOf[MinOrMaxDateOption]
  @scala.inline
  implicit def apply(value: js.Date): MinOrMaxDateOption = value.asInstanceOf[MinOrMaxDateOption]
  @scala.inline
  implicit def apply(value: Double): MinOrMaxDateOption = value.asInstanceOf[MinOrMaxDateOption]
  @scala.inline
  implicit def apply(value: js.Tuple3[Double, Double, Double]): MinOrMaxDateOption = value.asInstanceOf[MinOrMaxDateOption]
}

