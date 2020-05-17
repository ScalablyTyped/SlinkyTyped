package typingsSlinky.pickadate.Pickadate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Date
  - js.Tuple2[scala.Double, scala.Double]
  - scala.Double
  - scala.Boolean
*/
trait MinOrMaxTimeOption extends js.Object

object MinOrMaxTimeOption {
  @scala.inline
  implicit def apply(value: Boolean): MinOrMaxTimeOption = value.asInstanceOf[MinOrMaxTimeOption]
  @scala.inline
  implicit def apply(value: js.Date): MinOrMaxTimeOption = value.asInstanceOf[MinOrMaxTimeOption]
  @scala.inline
  implicit def apply(value: Double): MinOrMaxTimeOption = value.asInstanceOf[MinOrMaxTimeOption]
  @scala.inline
  implicit def apply(value: js.Tuple2[Double, Double]): MinOrMaxTimeOption = value.asInstanceOf[MinOrMaxTimeOption]
}

