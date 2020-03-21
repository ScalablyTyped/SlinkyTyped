package typingsSlinky.echarts.echarts.EChartOption.BasicComponents.CartesianAxis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.echarts.echartsStrings.value
  - typingsSlinky.echarts.echartsStrings.category
  - typingsSlinky.echarts.echartsStrings.time
  - typingsSlinky.echarts.echartsStrings.log
*/
trait Type extends js.Object

object Type {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def category: typingsSlinky.echarts.echartsStrings.category = this.cast("category")
  @scala.inline
  def log: typingsSlinky.echarts.echartsStrings.log = this.cast("log")
  @scala.inline
  def time: typingsSlinky.echarts.echartsStrings.time = this.cast("time")
  @scala.inline
  def value: typingsSlinky.echarts.echartsStrings.value = this.cast("value")
}

