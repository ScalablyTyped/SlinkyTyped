package typingsSlinky.reactDashNativeDashSvgDashCharts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNativeDashSvgDashChartsMod {
  import typingsSlinky.d3DashScale.d3DashScaleMod.ScaleBand
  import typingsSlinky.d3DashScale.d3DashScaleMod.ScaleLinear
  import typingsSlinky.d3DashScale.d3DashScaleMod.ScaleLogarithmic
  import typingsSlinky.d3DashScale.d3DashScaleMod.ScalePower
  import typingsSlinky.d3DashScale.d3DashScaleMod.ScaleTime
  import typingsSlinky.d3DashShape.d3DashShapeMod.Series

  type AccessorFunction[T, U] = js.Function1[/* props */ AccessorFunctionProps[T], U]
  type OffsetFunction = js.Function2[/* series */ Series[js.Any, js.Any], /* order */ js.Array[Double], Unit]
  type OrderFunction = js.Function1[/* series */ Series[js.Any, js.Any], js.Array[Double]]
  type ScaleFunction = js.Function0[(ScaleType[js.Any, js.Any]) | ScaleBand[js.Any]]
  type ScaleType[Range, Output] = (ScaleLinear[Range, Output]) | (ScaleLogarithmic[Range, Output]) | (ScalePower[Range, Output]) | (ScaleTime[Range, Output])
  type SortFunction[T] = js.Function2[/* a */ T, /* b */ T, Double]
}
