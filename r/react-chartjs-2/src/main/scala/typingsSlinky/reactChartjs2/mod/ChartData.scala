package typingsSlinky.reactChartjs2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactChartjs2.mod.ChartDataFunction[T]
  - T
*/
trait ChartData[T /* <: typingsSlinky.chartJs.mod.ChartData */] extends js.Object

object ChartData {
  @scala.inline
  implicit def apply[T](value: ChartDataFunction[T]): ChartData[T] = value.asInstanceOf[ChartData[T]]
  @scala.inline
  implicit def apply[T](value: T): ChartData[T] = value.asInstanceOf[ChartData[T]]
}

