package typingsSlinky.reactNativeSvgCharts.mod

import typingsSlinky.d3Scale.mod.ScaleLinear_
import typingsSlinky.d3Scale.mod.ScaleLogarithmic
import typingsSlinky.d3Scale.mod.ScalePower
import typingsSlinky.d3Scale.mod.ScaleTime_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.d3Scale.mod.ScaleLinear_[Range, Output]
  - typingsSlinky.d3Scale.mod.ScaleLogarithmic[Range, Output]
  - typingsSlinky.d3Scale.mod.ScalePower[Range, Output]
  - typingsSlinky.d3Scale.mod.ScaleTime_[Range, Output]
*/
trait ScaleType[Range, Output] extends js.Object

object ScaleType {
  @scala.inline
  implicit def apply[Range, Output](value: ScaleLinear_[Range, Output]): ScaleType[Range, Output] = value.asInstanceOf[ScaleType[Range, Output]]
  @scala.inline
  implicit def apply[Range, Output](value: ScaleLogarithmic[Range, Output]): ScaleType[Range, Output] = value.asInstanceOf[ScaleType[Range, Output]]
  @scala.inline
  implicit def apply[Range, Output](value: ScalePower[Range, Output]): ScaleType[Range, Output] = value.asInstanceOf[ScaleType[Range, Output]]
  @scala.inline
  implicit def apply[Range, Output](value: ScaleTime_[Range, Output]): ScaleType[Range, Output] = value.asInstanceOf[ScaleType[Range, Output]]
}

