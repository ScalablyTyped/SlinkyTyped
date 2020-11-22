package typingsSlinky.chartist.mod

import typingsSlinky.chartist.anon.Y
import typingsSlinky.chartist.chartistStrings.bar
import typingsSlinky.chartist.chartistStrings.grid
import typingsSlinky.chartist.chartistStrings.label
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.chartist.mod.IChartDrawLabelData
  - typingsSlinky.chartist.mod.IChartDrawGridData
  - typingsSlinky.chartist.mod.IChartDrawBarData
*/
trait ChartDrawData extends js.Object
object ChartDrawData {
  
  @scala.inline
  def IChartDrawLabelData(
    axis: IChartAxis,
    element: IChartistSvg,
    group: IChartistSvg,
    height: Double,
    index: Double,
    text: Double,
    `type`: label,
    width: Double,
    x: Double,
    y: Double
  ): ChartDrawData = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartDrawData]
  }
  
  @scala.inline
  def IChartDrawGridData(
    axis: IChartAxis,
    element: IChartistSvg,
    group: IChartistSvg,
    index: Double,
    `type`: grid,
    x1: Double,
    x2: Double,
    y1: Double,
    y2: Double
  ): ChartDrawData = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartDrawData]
  }
  
  @scala.inline
  def IChartDrawBarData(
    axisX: IChartAxis,
    axisY: IChartAxis,
    chartRect: IChartRect,
    element: IChartistSvg,
    group: IChartistSvg,
    index: Double,
    meta: js.Any,
    series: js.Array[Double],
    seriesIndex: Double,
    `type`: bar,
    value: Y,
    x1: Double,
    x2: Double,
    y1: Double,
    y2: Double
  ): ChartDrawData = {
    val __obj = js.Dynamic.literal(axisX = axisX.asInstanceOf[js.Any], axisY = axisY.asInstanceOf[js.Any], chartRect = chartRect.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], seriesIndex = seriesIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartDrawData]
  }
}
