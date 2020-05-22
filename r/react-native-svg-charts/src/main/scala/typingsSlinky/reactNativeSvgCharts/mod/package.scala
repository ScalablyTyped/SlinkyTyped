package typingsSlinky.reactNativeSvgCharts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AccessorFunction[T, U] = js.Function1[/* props */ typingsSlinky.reactNativeSvgCharts.mod.AccessorFunctionProps[T], U]
  type OffsetFunction = js.Function2[
    /* series */ typingsSlinky.d3Shape.mod.Series[js.Any, js.Any], 
    /* order */ js.Array[scala.Double], 
    scala.Unit
  ]
  type OrderFunction = js.Function1[
    /* series */ typingsSlinky.d3Shape.mod.Series[js.Any, js.Any], 
    js.Array[scala.Double]
  ]
  type ScaleFunction = js.Function0[
    (typingsSlinky.reactNativeSvgCharts.mod.ScaleType[js.Any, js.Any]) | typingsSlinky.d3Scale.mod.ScaleBand_[js.Any]
  ]
  type ScaleType[Range, Output] = (typingsSlinky.d3Scale.mod.ScaleLinear_[Range, Output]) | (typingsSlinky.d3Scale.mod.ScaleLogarithmic[Range, Output]) | (typingsSlinky.d3Scale.mod.ScalePower[Range, Output]) | (typingsSlinky.d3Scale.mod.ScaleTime_[Range, Output])
  type SortFunction[T] = js.Function2[/* a */ T, /* b */ T, scala.Double]
}
