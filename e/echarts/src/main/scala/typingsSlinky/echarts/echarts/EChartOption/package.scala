package typingsSlinky.echarts.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object EChartOption {
  type Calendar = typingsSlinky.echarts.echarts.EChartOption.Calendar_
  /**
    * Data zoom component of inside type.
    * Refer to dataZoom for more information.
    * The inside means it's inside the coordinates.
    * Translation: data area can be translated when moving in coordinates.
    * Scaling:
    * PC: when mouse rolls (similar with touch pad) in coordinates.
    * Mobile: when touches and moved with two fingers in coordinates
    * on touch screens.
    *
    * @todo describe
    * @see https://echarts.apache.org/en/option.html#dataZoom-inside
    * @see https://echarts.apache.org/en/option.html#dataZoom-slider
    */
  type DataZoom = typingsSlinky.echarts.echarts.EChartOption.DataZoom.Inside | typingsSlinky.echarts.echarts.EChartOption.DataZoom.Slider
  type Dataset = typingsSlinky.echarts.echarts.EChartOption.Dataset_
  type Legend = typingsSlinky.echarts.echarts.EChartOption.Legend_
  /**
    * @see https://echarts.apache.org/en/tutorial.html#Rich%20Text
    */
  type RichStyle = org.scalablytyped.runtime.StringDictionary[typingsSlinky.echarts.echarts.EChartOption.TextStyle]
  type SeriesBar = typingsSlinky.echarts.echarts.EChartOption.SeriesBar_
  type SeriesBoxplot = typingsSlinky.echarts.echarts.EChartOption.SeriesBoxplot_
  type SeriesCandlestick = typingsSlinky.echarts.echarts.EChartOption.SeriesCandlestick_
  type SeriesCustom = typingsSlinky.echarts.echarts.EChartOption.SeriesCustom_
  type SeriesEffectScatter = typingsSlinky.echarts.echarts.EChartOption.SeriesEffectScatter_
  type SeriesFunnel = typingsSlinky.echarts.echarts.EChartOption.SeriesFunnel_
  type SeriesGauge = typingsSlinky.echarts.echarts.EChartOption.SeriesGauge_
  type SeriesGraph = typingsSlinky.echarts.echarts.EChartOption.SeriesGraph_
  type SeriesHeatmap = typingsSlinky.echarts.echarts.EChartOption.SeriesHeatmap_
  type SeriesLine = typingsSlinky.echarts.echarts.EChartOption.SeriesLine_
  type SeriesLines = typingsSlinky.echarts.echarts.EChartOption.SeriesLines_
  type SeriesMap = typingsSlinky.echarts.echarts.EChartOption.SeriesMap_
  type SeriesParallel = typingsSlinky.echarts.echarts.EChartOption.SeriesParallel_
  type SeriesPictorialBar = typingsSlinky.echarts.echarts.EChartOption.SeriesPictorialBar_
  type SeriesPie = typingsSlinky.echarts.echarts.EChartOption.SeriesPie_
  type SeriesRadar = typingsSlinky.echarts.echarts.EChartOption.SeriesRadar_
  type SeriesSankey = typingsSlinky.echarts.echarts.EChartOption.SeriesSankey_
  type SeriesScatter = typingsSlinky.echarts.echarts.EChartOption.SeriesScatter_
  type SeriesSunburst = typingsSlinky.echarts.echarts.EChartOption.SeriesSunburst_
  type SeriesThemeRiver = typingsSlinky.echarts.echarts.EChartOption.SeriesThemeRiver_
  type SeriesTree = typingsSlinky.echarts.echarts.EChartOption.SeriesTree_
  type SeriesTreemap = typingsSlinky.echarts.echarts.EChartOption.SeriesTreemap_
  type Tooltip = typingsSlinky.echarts.echarts.EChartOption.Tooltip_
}
