package typingsSlinky.reactDashChartjsDash2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashChartjsDash2Mod {
  import org.scalajs.dom.raw.HTMLElement

  type ChartData[T /* <: typingsSlinky.chartDotJs.chartDotJsMod.ChartData */] = ChartDataFunction[T] | T
  type ChartDataFunction[T /* <: typingsSlinky.chartDotJs.chartDotJsMod.ChartData */] = js.Function1[/* element */ HTMLElement, T]
}
