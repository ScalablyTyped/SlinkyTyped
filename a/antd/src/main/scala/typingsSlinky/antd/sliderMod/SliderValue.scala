package typingsSlinky.antd.sliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - js.Tuple2[scala.Double, scala.Double]
*/
trait SliderValue extends js.Object

object SliderValue {
  @scala.inline
  implicit def apply(value: Double): SliderValue = value.asInstanceOf[SliderValue]
  @scala.inline
  implicit def apply(value: js.Tuple2[Double, Double]): SliderValue = value.asInstanceOf[SliderValue]
}

