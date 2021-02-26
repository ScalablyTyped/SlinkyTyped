package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotOptions extends StObject {
  
  /**
    * (Highstock) Acceleration bands (ABANDS). This series requires the
    * `linkedTo` option to be set and should be loaded after the
    * `stock/indicators/indicators.js`.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `abands` series are defined in plotOptions.abands.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var abands: js.UndefOr[PlotAbandsOptions] = js.native
  
  /**
    * (Highstock) Accumulation Distribution (AD). This series requires
    * `linkedTo` option to be set.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `ad` series are defined in plotOptions.ad.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var ad: js.UndefOr[PlotAdOptions] = js.native
  
  /**
    * (Highstock) Awesome Oscillator. This series requires the `linkedTo`
    * option to be set and should be loaded after the
    * `stock/indicators/indicators.js`
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `ao` series are defined in plotOptions.ao.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var ao: js.UndefOr[PlotAoOptions] = js.native
  
  /**
    * (Highstock) Absolute Price Oscillator. This series requires the
    * `linkedTo` option to be set and should be loaded after the
    * `stock/indicators/indicators.js` and `stock/indicators/ema.js`.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `apo` series are defined in plotOptions.apo.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var apo: js.UndefOr[PlotApoOptions] = js.native
  
  /**
    * (Highcharts, Highstock) The area series type.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `area` series are defined in plotOptions.area.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var area: js.UndefOr[PlotAreaOptions] = js.native
  
  /**
    * (Highcharts, Highstock) The area range series is a carteseian series with
    * higher and lower values for each point along an X axis, where the area
    * between the values is shaded.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `arearange` series are defined in
    * plotOptions.arearange.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var arearange: js.UndefOr[PlotArearangeOptions] = js.native
  
  /**
    * (Highcharts, Highstock) The area spline series is an area series where
    * the graph between the points is smoothed into a spline.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `areaspline` series are defined in
    * plotOptions.areaspline.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var areaspline: js.UndefOr[PlotAreasplineOptions] = js.native
  
  /**
    * (Highcharts, Highstock) The area spline range is a cartesian series type
    * with higher and lower Y values along an X axis. The area inside the range
    * is colored, and the graph outlining the area is a smoothed spline.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `areasplinerange` series are defined in
    * plotOptions.areasplinerange.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var areasplinerange: js.UndefOr[PlotAreasplinerangeOptions] = js.native
  
  /**
    * (Highstock) Aroon. This series requires the `linkedTo` option to be set
    * and should be loaded after the `stock/indicators/indicators.js`.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `aroon` series are defined in plotOptions.aroon.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var aroon: js.UndefOr[PlotAroonOptions] = js.native
  
  /**
    * (Highstock) Aroon Oscillator. This series requires the `linkedTo` option
    * to be set and should be loaded after the `stock/indicators/indicators.js`
    * and `stock/indicators/aroon.js`.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `aroonoscillator` series are defined in
    * plotOptions.aroonoscillator.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var aroonoscillator: js.UndefOr[PlotAroonoscillatorOptions] = js.native
  
  /**
    * (Highstock) Average true range indicator (ATR). This series requires
    * `linkedTo` option to be set.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `atr` series are defined in plotOptions.atr.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var atr: js.UndefOr[PlotAtrOptions] = js.native
  
  /**
    * (Highcharts) A bar series is a special type of column series where the
    * columns are horizontal.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `bar` series are defined in plotOptions.bar.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var bar: js.UndefOr[PlotBarOptions] = js.native
  
  /**
    * (Highstock) Bollinger bands (BB). This series requires the `linkedTo`
    * option to be set and should be loaded after the
    * `stock/indicators/indicators.js` file.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `bb` series are defined in plotOptions.bb.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var bb: js.UndefOr[PlotBbOptions] = js.native
  
  /**
    * (Highcharts) A bell curve is an areaspline series which represents the
    * probability density function of the normal distribution. It calculates
    * mean and standard deviation of the base series data and plots the curve
    * according to the calculated parameters.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `bellcurve` series are defined in
    * plotOptions.bellcurve.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var bellcurve: js.UndefOr[PlotBellcurveOptions] = js.native
  
  /**
    * (Highcharts) A box plot is a convenient way of depicting groups of data
    * through their five-number summaries: the smallest observation (sample
    * minimum), lower quartile (Q1), median (Q2), upper quartile (Q3), and
    * largest observation (sample maximum).
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `boxplot` series are defined in plotOptions.boxplot.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var boxplot: js.UndefOr[PlotBoxplotOptions] = js.native
  
  /**
    * (Highcharts, Highstock) A bubble series is a three dimensional series
    * type where each point renders an X, Y and Z value. Each points is drawn
    * as a bubble where the position along the X and Y axes mark the X and Y
    * values, and the size of the bubble relates to the Z value.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `bubble` series are defined in plotOptions.bubble.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var bubble: js.UndefOr[PlotBubbleOptions] = js.native
  
  /**
    * (Highcharts) A bullet graph is a variation of a bar graph. The bullet
    * graph features a single measure, compares it to a target, and displays it
    * in the context of qualitative ranges of performance that could be set
    * using plotBands on yAxis.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `bullet` series are defined in plotOptions.bullet.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var bullet: js.UndefOr[PlotBulletOptions] = js.native
  
  /**
    * (Highstock) A candlestick chart is a style of financial chart used to
    * describe price movements over time.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `candlestick` series are defined in
    * plotOptions.candlestick.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var candlestick: js.UndefOr[PlotCandlestickOptions] = js.native
  
  /**
    * (Highstock) Commodity Channel Index (CCI). This series requires
    * `linkedTo` option to be set.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `cci` series are defined in plotOptions.cci.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var cci: js.UndefOr[PlotCciOptions] = js.native
  
  /**
    * (Highstock) Chaikin Oscillator. This series requires the `linkedTo`
    * option to be set and should be loaded after the
    * `stock/indicators/indicators.js` and `stock/indicators/ema.js`.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `chaikin` series are defined in plotOptions.chaikin.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var chaikin: js.UndefOr[PlotChaikinOptions] = js.native
  
  /**
    * (Highstock) Chaikin Money Flow indicator (cmf).
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `cmf` series are defined in plotOptions.cmf.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var cmf: js.UndefOr[PlotCmfOptions] = js.native
  
  /**
    * (Highcharts, Highstock) Column series display one column per value along
    * an X axis.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `column` series are defined in plotOptions.column.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var column: js.UndefOr[PlotColumnOptions] = js.native
  
  /**
    * (Highcharts, Highstock) Column pyramid series display one pyramid per
    * value along an X axis. To display horizontal pyramids, set chart.inverted
    * to `true`.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `columnpyramid` series are defined in
    * plotOptions.columnpyramid.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var columnpyramid: js.UndefOr[PlotColumnpyramidOptions] = js.native
  
  /**
    * (Highcharts, Highstock) The column range is a cartesian series type with
    * higher and lower Y values along an X axis. To display horizontal bars,
    * set chart.inverted to `true`.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `columnrange` series are defined in
    * plotOptions.columnrange.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var columnrange: js.UndefOr[PlotColumnrangeOptions] = js.native
  
  /**
    * (Highcharts) A cylinder graph is a variation of a 3d column graph. The
    * cylinder graph features cylindrical points.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `cylinder` series are defined in plotOptions.cylinder.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var cylinder: js.UndefOr[PlotCylinderOptions] = js.native
  
  /**
    * (Highstock) Double exponential moving average (DEMA) indicator. This
    * series requires `linkedTo` option to be set and should be loaded after
    * the `stock/indicators/indicators.js` and `stock/indicators/ema.js`.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `dema` series are defined in plotOptions.dema.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var dema: js.UndefOr[PlotDemaOptions] = js.native
  
  /**
    * (Highcharts) A dependency wheel chart is a type of flow diagram, where
    * all nodes are laid out in a circle, and the flow between the are drawn as
    * link bands.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `dependencywheel` series are defined in
    * plotOptions.dependencywheel.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var dependencywheel: js.UndefOr[PlotDependencywheelOptions] = js.native
  
  /**
    * (Highstock) Detrended Price Oscillator. This series requires the
    * `linkedTo` option to be set and should be loaded after the
    * `stock/indicators/indicators.js`.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `dpo` series are defined in plotOptions.dpo.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var dpo: js.UndefOr[PlotDpoOptions] = js.native
  
  /**
    * (Highcharts, Highstock) The dumbbell series is a cartesian series with
    * higher and lower values for each point along an X axis, connected with a
    * line between the values. Requires `highcharts-more.js` and
    * `modules/dumbbell.js`.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `dumbbell` series are defined in plotOptions.dumbbell.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var dumbbell: js.UndefOr[PlotDumbbellOptions] = js.native
  
  /**
    * (Highstock) Exponential moving average indicator (EMA). This series
    * requires the `linkedTo` option to be set.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `ema` series are defined in plotOptions.ema.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var ema: js.UndefOr[PlotEmaOptions] = js.native
  
  /**
    * (Highcharts, Highstock) Error bars are a graphical representation of the
    * variability of data and are used on graphs to indicate the error, or
    * uncertainty in a reported measurement.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `errorbar` series are defined in plotOptions.errorbar.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var errorbar: js.UndefOr[PlotErrorbarOptions] = js.native
  
  /**
    * (Highstock) Flags are used to mark events in stock charts. They can be
    * added on the timeline, or attached to a specific series.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `flags` series are defined in plotOptions.flags.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var flags: js.UndefOr[PlotFlagsOptions] = js.native
  
  /**
    * (Highcharts) Funnel charts are a type of chart often used to visualize
    * stages in a sales project, where the top are the initial stages with the
    * most clients. It requires that the modules/funnel.js file is loaded.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `funnel` series are defined in plotOptions.funnel.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var funnel: js.UndefOr[PlotFunnelOptions] = js.native
  
  /**
    * (Highcharts) A funnel3d is a 3d version of funnel series type. Funnel
    * charts are a type of chart often used to visualize stages in a sales
    * project, where the top are the initial stages with the most clients.
    *
    * It requires that the `highcharts-3d.js`, `cylinder.js` and `funnel3d.js`
    * module are loaded.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `funnel3d` series are defined in plotOptions.funnel3d.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var funnel3d: js.UndefOr[PlotFunnel3dOptions] = js.native
  
  /**
    * (Gantt) A `gantt` series. If the type option is not specified, it is
    * inherited from chart.type.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `gantt` series are defined in plotOptions.gantt.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var gantt: js.UndefOr[PlotGanttOptions] = js.native
  
  /**
    * (Highcharts) Gauges are circular plots displaying one or more values with
    * a dial pointing to values along the perimeter.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `gauge` series are defined in plotOptions.gauge.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var gauge: js.UndefOr[PlotGaugeOptions] = js.native
  
  /**
    * (Highcharts, Highmaps) A heatmap is a graphical representation of data
    * where the individual values contained in a matrix are represented as
    * colors.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `heatmap` series are defined in plotOptions.heatmap.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var heatmap: js.UndefOr[PlotHeatmapOptions] = js.native
  
  /**
    * (Highcharts) A histogram is a column series which represents the
    * distribution of the data set in the base series. Histogram splits data
    * into bins and shows their frequencies.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `histogram` series are defined in
    * plotOptions.histogram.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var histogram: js.UndefOr[PlotHistogramOptions] = js.native
  
  /**
    * (Highstock) Ichimoku Kinko Hyo (IKH). This series requires `linkedTo`
    * option to be set.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `ikh` series are defined in plotOptions.ikh.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var ikh: js.UndefOr[PlotIkhOptions] = js.native
  
  /**
    * (Highcharts) An item chart is an infographic chart where a number of
    * items are laid out in either a rectangular or circular pattern. It can be
    * used to visualize counts within a group, or for the circular pattern,
    * typically a parliament.
    *
    * The circular layout has much in common with a pie chart. Many of the item
    * series options, like `center`, `size` and data label positioning, are
    * inherited from the pie series and don't apply for rectangular layouts.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `item` series are defined in plotOptions.item.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var item: js.UndefOr[PlotItemOptions] = js.native
  
  /**
    * (Highstock) Keltner Channels. This series requires the `linkedTo` option
    * to be set and should be loaded after the
    * `stock/indicators/indicators.js`, `stock/indicators/atr.js`, and
    * `stock/ema/.js`.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `keltnerchannels` series are defined in
    * plotOptions.keltnerchannels.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var keltnerchannels: js.UndefOr[PlotKeltnerchannelsOptions] = js.native
  
  /**
    * (Highcharts, Highstock) A line series displays information as a series of
    * data points connected by straight line segments.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `line` series are defined in plotOptions.line.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var line: js.UndefOr[PlotLineOptions] = js.native
  
  /**
    * (Highstock) Linear regression indicator. This series requires `linkedTo`
    * option to be set.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `linearregression` series are defined in
    * plotOptions.linearregression.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var linearregression: js.UndefOr[PlotLinearregressionOptions] = js.native
  
  /**
    * (Highstock) Linear regression angle indicator. This series requires
    * `linkedTo` option to be set.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `linearregressionangle` series are defined in
    * plotOptions.linearregressionangle.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var linearregressionangle: js.UndefOr[PlotLinearregressionangleOptions] = js.native
  
  /**
    * (Highstock) Linear regression intercept indicator. This series requires
    * `linkedTo` option to be set.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `linearregressionintercept` series are defined in
    * plotOptions.linearregressionintercept.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var linearregressionintercept: js.UndefOr[PlotLinearregressioninterceptOptions] = js.native
  
  /**
    * (Highstock) Linear regression slope indicator. This series requires
    * `linkedTo` option to be set.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `linearregressionslope` series are defined in
    * plotOptions.linearregressionslope.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var linearregressionslope: js.UndefOr[PlotLinearregressionslopeOptions] = js.native
  
  /**
    * (Highcharts, Highstock) The lollipop series is a carteseian series with a
    * line anchored from the x axis and a dot at the end to mark the value.
    * Requires `highcharts-more.js`, `modules/dumbbell.js` and
    * `modules/lollipop.js`.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `lollipop` series are defined in plotOptions.lollipop.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var lollipop: js.UndefOr[PlotLollipopOptions] = js.native
  
  /**
    * (Highstock) Moving Average Convergence Divergence (MACD). This series
    * requires `linkedTo` option to be set and should be loaded after the
    * `stock/indicators/indicators.js` and `stock/indicators/ema.js`.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `macd` series are defined in plotOptions.macd.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var macd: js.UndefOr[PlotMacdOptions] = js.native
  
  /**
    * (Highmaps) The map series is used for basic choropleth maps, where each
    * map area has a color based on its value.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `map` series are defined in plotOptions.map.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var map: js.UndefOr[PlotMapOptions] = js.native
  
  /**
    * (Highmaps) A map bubble series is a bubble series laid out on top of a
    * map series, where each bubble is tied to a specific map area.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `mapbubble` series are defined in
    * plotOptions.mapbubble.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var mapbubble: js.UndefOr[PlotMapbubbleOptions] = js.native
  
  /**
    * (Highmaps) A mapline series is a special case of the map series where the
    * value colors are applied to the strokes rather than the fills. It can
    * also be used for freeform drawing, like dividers, in the map.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `mapline` series are defined in plotOptions.mapline.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var mapline: js.UndefOr[PlotMaplineOptions] = js.native
  
  /**
    * (Highmaps) A mappoint series is a special form of scatter series where
    * the points can be laid out in map coordinates on top of a map.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `mappoint` series are defined in plotOptions.mappoint.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var mappoint: js.UndefOr[PlotMappointOptions] = js.native
  
  /**
    * (Highstock) Money Flow Index. This series requires `linkedTo` option to
    * be set and should be loaded after the `stock/indicators/indicators.js`
    * file.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `mfi` series are defined in plotOptions.mfi.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var mfi: js.UndefOr[PlotMfiOptions] = js.native
  
  /**
    * (Highstock) Momentum. This series requires `linkedTo` option to be set.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `momentum` series are defined in plotOptions.momentum.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var momentum: js.UndefOr[PlotMomentumOptions] = js.native
  
  /**
    * (Highstock) Normalized average true range indicator (NATR). This series
    * requires `linkedTo` option to be set and should be loaded after the
    * `stock/indicators/indicators.js` and `stock/indicators/atr.js`.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `natr` series are defined in plotOptions.natr.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var natr: js.UndefOr[PlotNatrOptions] = js.native
  
  /**
    * (Highcharts) A networkgraph is a type of relationship chart, where
    * connnections (links) attracts nodes (points) and other nodes repulse each
    * other.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `networkgraph` series are defined in
    * plotOptions.networkgraph.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var networkgraph: js.UndefOr[PlotNetworkgraphOptions] = js.native
  
  /**
    * (Highstock) An OHLC chart is a style of financial chart used to describe
    * price movements over time. It displays open, high, low and close values
    * per data point.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `ohlc` series are defined in plotOptions.ohlc.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var ohlc: js.UndefOr[PlotOhlcOptions] = js.native
  
  /**
    * (Highcharts) An organization chart is a diagram that shows the structure
    * of an organization and the relationships and relative ranks of its parts
    * and positions.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `organization` series are defined in
    * plotOptions.organization.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var organization: js.UndefOr[PlotOrganizationOptions] = js.native
  
  /**
    * (Highcharts) A packed bubble series is a two dimensional series type,
    * where each point renders a value in X, Y position. Each point is drawn as
    * a bubble where the bubbles don't overlap with each other and the radius
    * of the bubble relates to the value.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `packedbubble` series are defined in
    * plotOptions.packedbubble.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var packedbubble: js.UndefOr[PlotPackedbubbleOptions] = js.native
  
  /**
    * (Highcharts) A pareto diagram is a type of chart that contains both bars
    * and a line graph, where individual values are represented in descending
    * order by bars, and the cumulative total is represented by the line.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `pareto` series are defined in plotOptions.pareto.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var pareto: js.UndefOr[PlotParetoOptions] = js.native
  
  /**
    * (Highstock) Price channel (PC). This series requires the `linkedTo`
    * option to be set and should be loaded after the
    * `stock/indicators/indicators.js`.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `pc` series are defined in plotOptions.pc.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var pc: js.UndefOr[PlotPcOptions] = js.native
  
  /**
    * (Highcharts) A pie chart is a circular graphic which is divided into
    * slices to illustrate numerical proportion.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `pie` series are defined in plotOptions.pie.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var pie: js.UndefOr[PlotPieOptions] = js.native
  
  /**
    * (Highstock) Pivot points indicator. This series requires the `linkedTo`
    * option to be set and should be loaded after
    * `stock/indicators/indicators.js` file.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `pivotpoints` series are defined in
    * plotOptions.pivotpoints.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var pivotpoints: js.UndefOr[PlotPivotpointsOptions] = js.native
  
  /**
    * (Highcharts, Highstock) A polygon series can be used to draw any freeform
    * shape in the cartesian coordinate system. A fill is applied with the
    * `color` option, and stroke is applied through `lineWidth` and `lineColor`
    * options.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `polygon` series are defined in plotOptions.polygon.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var polygon: js.UndefOr[PlotPolygonOptions] = js.native
  
  /**
    * (Highstock) Percentage Price Oscillator. This series requires the
    * `linkedTo` option to be set and should be loaded after the
    * `stock/indicators/indicators.js` and `stock/indicators/ema.js`.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `ppo` series are defined in plotOptions.ppo.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var ppo: js.UndefOr[PlotPpoOptions] = js.native
  
  /**
    * (Highstock) Price envelopes indicator based on SMA calculations. This
    * series requires the `linkedTo` option to be set and should be loaded
    * after the `stock/indicators/indicators.js` file.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `priceenvelopes` series are defined in
    * plotOptions.priceenvelopes.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var priceenvelopes: js.UndefOr[PlotPriceenvelopesOptions] = js.native
  
  /**
    * (Highstock) Parabolic SAR. This series requires `linkedTo` option to be
    * set and should be loaded after `stock/indicators/indicators.js` file.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `psar` series are defined in plotOptions.psar.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var psar: js.UndefOr[PlotPsarOptions] = js.native
  
  /**
    * (Highcharts) A pyramid series is a special type of funnel, without neck
    * and reversed by default.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `pyramid` series are defined in plotOptions.pyramid.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var pyramid: js.UndefOr[PlotPyramidOptions] = js.native
  
  /**
    * (Highcharts) A pyramid3d is a 3d version of pyramid series type. Pyramid
    * charts are a type of chart often used to visualize stages in a sales
    * project, where the top are the initial stages with the most clients.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `pyramid3d` series are defined in
    * plotOptions.pyramid3d.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var pyramid3d: js.UndefOr[PlotPyramid3dOptions] = js.native
  
  /**
    * (Highstock) Rate of change indicator (ROC). The indicator value for each
    * point is defined as:
    *
    * `(C - Cn) / Cn * 100`
    *
    * where: `C` is the close value of the point of the same x in the linked
    * series and `Cn` is the close value of the point `n` periods ago. `n` is
    * set through period.
    *
    * This series requires `linkedTo` option to be set.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `roc` series are defined in plotOptions.roc.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var roc: js.UndefOr[PlotRocOptions] = js.native
  
  /**
    * (Highstock) Relative strength index (RSI) technical indicator. This
    * series requires the `linkedTo` option to be set and should be loaded
    * after the `stock/indicators/indicators.js` file.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `rsi` series are defined in plotOptions.rsi.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var rsi: js.UndefOr[PlotRsiOptions] = js.native
  
  /**
    * (Highcharts) A sankey diagram is a type of flow diagram, in which the
    * width of the link between two nodes is shown proportionally to the flow
    * quantity.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `sankey` series are defined in plotOptions.sankey.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var sankey: js.UndefOr[PlotSankeyOptions] = js.native
  
  /**
    * (Highcharts, Highstock) A scatter plot uses cartesian coordinates to
    * display values for two variables for a set of data.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `scatter` series are defined in plotOptions.scatter.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var scatter: js.UndefOr[PlotScatterOptions] = js.native
  
  /**
    * (Highcharts) A 3D scatter plot uses x, y and z coordinates to display
    * values for three variables for a set of data.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `scatter3d` series are defined in
    * plotOptions.scatter3d.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var scatter3d: js.UndefOr[PlotScatter3dOptions] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) General options for all series
    * types.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `line` series are defined in plotOptions.line.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var series: js.UndefOr[PlotSeriesOptions] = js.native
  
  /**
    * (Highstock) Slow Stochastic oscillator. This series requires the
    * `linkedTo` option to be set and should be loaded after
    * `stock/indicators/indicators.js` and `stock/indicators/stochastic.js`
    * files.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `slowstochastic` series are defined in
    * plotOptions.slowstochastic.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var slowstochastic: js.UndefOr[PlotSlowstochasticOptions] = js.native
  
  /**
    * (Highstock) Simple moving average indicator (SMA). This series requires
    * `linkedTo` option to be set.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `sma` series are defined in plotOptions.sma.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var sma: js.UndefOr[PlotSmaOptions] = js.native
  
  /**
    * (Highcharts) A solid gauge is a circular gauge where the value is
    * indicated by a filled arc, and the color of the arc may variate with the
    * value.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `solidgauge` series are defined in
    * plotOptions.solidgauge.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var solidgauge: js.UndefOr[PlotSolidgaugeOptions] = js.native
  
  /**
    * (Highcharts, Highstock) A spline series is a special type of line series,
    * where the segments between the data points are smoothed.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `spline` series are defined in plotOptions.spline.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var spline: js.UndefOr[PlotSplineOptions] = js.native
  
  /**
    * (Highstock) Stochastic oscillator. This series requires the `linkedTo`
    * option to be set and should be loaded after the
    * `stock/indicators/indicators.js` file.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `stochastic` series are defined in
    * plotOptions.stochastic.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var stochastic: js.UndefOr[PlotStochasticOptions] = js.native
  
  /**
    * (Highcharts, Highstock) A streamgraph is a type of stacked area graph
    * which is displaced around a central axis, resulting in a flowing, organic
    * shape.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `streamgraph` series are defined in
    * plotOptions.streamgraph.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var streamgraph: js.UndefOr[PlotStreamgraphOptions] = js.native
  
  /**
    * (Highcharts) A Sunburst displays hierarchical data, where a level in the
    * hierarchy is represented by a circle. The center represents the root node
    * of the tree. The visualization bears a resemblance to both treemap and
    * pie charts.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `sunburst` series are defined in plotOptions.sunburst.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var sunburst: js.UndefOr[PlotSunburstOptions] = js.native
  
  /**
    * (Highstock) Supertrend indicator. This series requires the `linkedTo`
    * option to be set and should be loaded after the
    * `stock/indicators/indicators.js` and `stock/indicators/sma.js`.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `supertrend` series are defined in
    * plotOptions.supertrend.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var supertrend: js.UndefOr[PlotSupertrendOptions] = js.native
  
  /**
    * (Highstock) Triple exponential moving average (TEMA) indicator. This
    * series requires `linkedTo` option to be set and should be loaded after
    * the `stock/indicators/indicators.js` and `stock/indicators/ema.js`.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `tema` series are defined in plotOptions.tema.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var tema: js.UndefOr[PlotTemaOptions] = js.native
  
  /**
    * (Highcharts, Highmaps) A tilemap series is a type of heatmap where the
    * tile shapes are configurable.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `tilemap` series are defined in plotOptions.tilemap.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var tilemap: js.UndefOr[PlotTilemapOptions] = js.native
  
  /**
    * (Highcharts) The timeline series presents given events along a drawn
    * line.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `timeline` series are defined in plotOptions.timeline.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var timeline: js.UndefOr[PlotTimelineOptions] = js.native
  
  /**
    * (Highcharts) A treemap displays hierarchical data using nested
    * rectangles. The data can be laid out in varying ways depending on
    * options.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `treemap` series are defined in plotOptions.treemap.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var treemap: js.UndefOr[PlotTreemapOptions] = js.native
  
  /**
    * (Highstock) Trendline (linear regression) fits a straight line to the
    * selected data using a method called the Sum Of Least Squares. This series
    * requires the `linkedTo` option to be set.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `trendline` series are defined in
    * plotOptions.trendline.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var trendline: js.UndefOr[PlotTrendlineOptions] = js.native
  
  /**
    * (Highstock) Triple exponential average (TRIX) oscillator. This series
    * requires `linkedTo` option to be set.
    *
    * Requires https://code.highcharts.com/stock/indicators/ema.js and
    * https://code.highcharts.com/stock/indicators/tema.js.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `trix` series are defined in plotOptions.trix.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var trix: js.UndefOr[PlotTrixOptions] = js.native
  
  /**
    * (Highcharts) A variable pie series is a two dimensional series type,
    * where each point renders an Y and Z value. Each point is drawn as a pie
    * slice where the size (arc) of the slice relates to the Y value and the
    * radius of pie slice relates to the Z value.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `variablepie` series are defined in
    * plotOptions.variablepie.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var variablepie: js.UndefOr[PlotVariablepieOptions] = js.native
  
  /**
    * (Highcharts) A variwide chart (related to marimekko chart) is a column
    * chart with a variable width expressing a third dimension.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `variwide` series are defined in plotOptions.variwide.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var variwide: js.UndefOr[PlotVariwideOptions] = js.native
  
  /**
    * (Highstock) Volume By Price indicator.
    *
    * This series requires `linkedTo` option to be set.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `vbp` series are defined in plotOptions.vbp.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var vbp: js.UndefOr[PlotVbpOptions] = js.native
  
  /**
    * (Highcharts, Highstock) A vector plot is a type of cartesian chart where
    * each point has an X and Y position, a length and a direction. Vectors are
    * drawn as arrows.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `vector` series are defined in plotOptions.vector.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var vector: js.UndefOr[PlotVectorOptions] = js.native
  
  /**
    * (Highcharts) A Venn diagram displays all possible logical relations
    * between a collection of different sets. The sets are represented by
    * circles, and the relation between the sets are displayed by the overlap
    * or lack of overlap between them. The venn diagram is a special case of
    * Euler diagrams, which can also be displayed by this series type.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `venn` series are defined in plotOptions.venn.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var venn: js.UndefOr[PlotVennOptions] = js.native
  
  /**
    * (Highstock) Volume Weighted Average Price indicator.
    *
    * This series requires `linkedTo` option to be set.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `vwap` series are defined in plotOptions.vwap.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var vwap: js.UndefOr[PlotVwapOptions] = js.native
  
  /**
    * (Highcharts) A waterfall chart displays sequentially introduced positive
    * or negative values in cumulative columns.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `waterfall` series are defined in
    * plotOptions.waterfall.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var waterfall: js.UndefOr[PlotWaterfallOptions] = js.native
  
  /**
    * (Highstock) Williams %R. This series requires the `linkedTo` option to be
    * set and should be loaded after the `stock/indicators/indicators.js`.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `williamsr` series are defined in
    * plotOptions.williamsr.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var williamsr: js.UndefOr[PlotWilliamsrOptions] = js.native
  
  /**
    * (Highcharts, Highstock) Wind barbs are a convenient way to represent wind
    * speed and direction in one graphical form. Wind direction is given by the
    * stem direction, and wind speed by the number and shape of barbs.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `windbarb` series are defined in plotOptions.windbarb.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var windbarb: js.UndefOr[PlotWindbarbOptions] = js.native
  
  /**
    * (Highstock) Weighted moving average indicator (WMA). This series requires
    * `linkedTo` option to be set.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `wma` series are defined in plotOptions.wma.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var wma: js.UndefOr[PlotWmaOptions] = js.native
  
  /**
    * (Highcharts) A word cloud is a visualization of a set of words, where the
    * size and placement of a word is determined by how it is weighted.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `wordcloud` series are defined in
    * plotOptions.wordcloud.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var wordcloud: js.UndefOr[PlotWordcloudOptions] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) The X-range series displays ranges on the
    * X axis, typically time intervals with a start and end date.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `xrange` series are defined in plotOptions.xrange.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var xrange: js.UndefOr[PlotXrangeOptions] = js.native
  
  /**
    * (Highstock) Zig Zag indicator.
    *
    * This series requires `linkedTo` option to be set.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `zigzag` series are defined in plotOptions.zigzag.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var zigzag: js.UndefOr[PlotZigzagOptions] = js.native
}
object PlotOptions {
  
  @scala.inline
  def apply(): PlotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotOptions]
  }
  
  @scala.inline
  implicit class PlotOptionsMutableBuilder[Self <: PlotOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbands(value: PlotAbandsOptions): Self = StObject.set(x, "abands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbandsUndefined: Self = StObject.set(x, "abands", js.undefined)
    
    @scala.inline
    def setAd(value: PlotAdOptions): Self = StObject.set(x, "ad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdUndefined: Self = StObject.set(x, "ad", js.undefined)
    
    @scala.inline
    def setAo(value: PlotAoOptions): Self = StObject.set(x, "ao", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAoUndefined: Self = StObject.set(x, "ao", js.undefined)
    
    @scala.inline
    def setApo(value: PlotApoOptions): Self = StObject.set(x, "apo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApoUndefined: Self = StObject.set(x, "apo", js.undefined)
    
    @scala.inline
    def setArea(value: PlotAreaOptions): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAreaUndefined: Self = StObject.set(x, "area", js.undefined)
    
    @scala.inline
    def setArearange(value: PlotArearangeOptions): Self = StObject.set(x, "arearange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArearangeUndefined: Self = StObject.set(x, "arearange", js.undefined)
    
    @scala.inline
    def setAreaspline(value: PlotAreasplineOptions): Self = StObject.set(x, "areaspline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAreasplineUndefined: Self = StObject.set(x, "areaspline", js.undefined)
    
    @scala.inline
    def setAreasplinerange(value: PlotAreasplinerangeOptions): Self = StObject.set(x, "areasplinerange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAreasplinerangeUndefined: Self = StObject.set(x, "areasplinerange", js.undefined)
    
    @scala.inline
    def setAroon(value: PlotAroonOptions): Self = StObject.set(x, "aroon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAroonUndefined: Self = StObject.set(x, "aroon", js.undefined)
    
    @scala.inline
    def setAroonoscillator(value: PlotAroonoscillatorOptions): Self = StObject.set(x, "aroonoscillator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAroonoscillatorUndefined: Self = StObject.set(x, "aroonoscillator", js.undefined)
    
    @scala.inline
    def setAtr(value: PlotAtrOptions): Self = StObject.set(x, "atr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAtrUndefined: Self = StObject.set(x, "atr", js.undefined)
    
    @scala.inline
    def setBar(value: PlotBarOptions): Self = StObject.set(x, "bar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarUndefined: Self = StObject.set(x, "bar", js.undefined)
    
    @scala.inline
    def setBb(value: PlotBbOptions): Self = StObject.set(x, "bb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBbUndefined: Self = StObject.set(x, "bb", js.undefined)
    
    @scala.inline
    def setBellcurve(value: PlotBellcurveOptions): Self = StObject.set(x, "bellcurve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBellcurveUndefined: Self = StObject.set(x, "bellcurve", js.undefined)
    
    @scala.inline
    def setBoxplot(value: PlotBoxplotOptions): Self = StObject.set(x, "boxplot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoxplotUndefined: Self = StObject.set(x, "boxplot", js.undefined)
    
    @scala.inline
    def setBubble(value: PlotBubbleOptions): Self = StObject.set(x, "bubble", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBubbleUndefined: Self = StObject.set(x, "bubble", js.undefined)
    
    @scala.inline
    def setBullet(value: PlotBulletOptions): Self = StObject.set(x, "bullet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBulletUndefined: Self = StObject.set(x, "bullet", js.undefined)
    
    @scala.inline
    def setCandlestick(value: PlotCandlestickOptions): Self = StObject.set(x, "candlestick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCandlestickUndefined: Self = StObject.set(x, "candlestick", js.undefined)
    
    @scala.inline
    def setCci(value: PlotCciOptions): Self = StObject.set(x, "cci", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCciUndefined: Self = StObject.set(x, "cci", js.undefined)
    
    @scala.inline
    def setChaikin(value: PlotChaikinOptions): Self = StObject.set(x, "chaikin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChaikinUndefined: Self = StObject.set(x, "chaikin", js.undefined)
    
    @scala.inline
    def setCmf(value: PlotCmfOptions): Self = StObject.set(x, "cmf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCmfUndefined: Self = StObject.set(x, "cmf", js.undefined)
    
    @scala.inline
    def setColumn(value: PlotColumnOptions): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    @scala.inline
    def setColumnpyramid(value: PlotColumnpyramidOptions): Self = StObject.set(x, "columnpyramid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnpyramidUndefined: Self = StObject.set(x, "columnpyramid", js.undefined)
    
    @scala.inline
    def setColumnrange(value: PlotColumnrangeOptions): Self = StObject.set(x, "columnrange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnrangeUndefined: Self = StObject.set(x, "columnrange", js.undefined)
    
    @scala.inline
    def setCylinder(value: PlotCylinderOptions): Self = StObject.set(x, "cylinder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCylinderUndefined: Self = StObject.set(x, "cylinder", js.undefined)
    
    @scala.inline
    def setDema(value: PlotDemaOptions): Self = StObject.set(x, "dema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDemaUndefined: Self = StObject.set(x, "dema", js.undefined)
    
    @scala.inline
    def setDependencywheel(value: PlotDependencywheelOptions): Self = StObject.set(x, "dependencywheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependencywheelUndefined: Self = StObject.set(x, "dependencywheel", js.undefined)
    
    @scala.inline
    def setDpo(value: PlotDpoOptions): Self = StObject.set(x, "dpo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDpoUndefined: Self = StObject.set(x, "dpo", js.undefined)
    
    @scala.inline
    def setDumbbell(value: PlotDumbbellOptions): Self = StObject.set(x, "dumbbell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDumbbellUndefined: Self = StObject.set(x, "dumbbell", js.undefined)
    
    @scala.inline
    def setEma(value: PlotEmaOptions): Self = StObject.set(x, "ema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmaUndefined: Self = StObject.set(x, "ema", js.undefined)
    
    @scala.inline
    def setErrorbar(value: PlotErrorbarOptions): Self = StObject.set(x, "errorbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorbarUndefined: Self = StObject.set(x, "errorbar", js.undefined)
    
    @scala.inline
    def setFlags(value: PlotFlagsOptions): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    @scala.inline
    def setFunnel(value: PlotFunnelOptions): Self = StObject.set(x, "funnel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunnel3d(value: PlotFunnel3dOptions): Self = StObject.set(x, "funnel3d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunnel3dUndefined: Self = StObject.set(x, "funnel3d", js.undefined)
    
    @scala.inline
    def setFunnelUndefined: Self = StObject.set(x, "funnel", js.undefined)
    
    @scala.inline
    def setGantt(value: PlotGanttOptions): Self = StObject.set(x, "gantt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGanttUndefined: Self = StObject.set(x, "gantt", js.undefined)
    
    @scala.inline
    def setGauge(value: PlotGaugeOptions): Self = StObject.set(x, "gauge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGaugeUndefined: Self = StObject.set(x, "gauge", js.undefined)
    
    @scala.inline
    def setHeatmap(value: PlotHeatmapOptions): Self = StObject.set(x, "heatmap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeatmapUndefined: Self = StObject.set(x, "heatmap", js.undefined)
    
    @scala.inline
    def setHistogram(value: PlotHistogramOptions): Self = StObject.set(x, "histogram", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistogramUndefined: Self = StObject.set(x, "histogram", js.undefined)
    
    @scala.inline
    def setIkh(value: PlotIkhOptions): Self = StObject.set(x, "ikh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIkhUndefined: Self = StObject.set(x, "ikh", js.undefined)
    
    @scala.inline
    def setItem(value: PlotItemOptions): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    @scala.inline
    def setKeltnerchannels(value: PlotKeltnerchannelsOptions): Self = StObject.set(x, "keltnerchannels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeltnerchannelsUndefined: Self = StObject.set(x, "keltnerchannels", js.undefined)
    
    @scala.inline
    def setLine(value: PlotLineOptions): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setLinearregression(value: PlotLinearregressionOptions): Self = StObject.set(x, "linearregression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinearregressionUndefined: Self = StObject.set(x, "linearregression", js.undefined)
    
    @scala.inline
    def setLinearregressionangle(value: PlotLinearregressionangleOptions): Self = StObject.set(x, "linearregressionangle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinearregressionangleUndefined: Self = StObject.set(x, "linearregressionangle", js.undefined)
    
    @scala.inline
    def setLinearregressionintercept(value: PlotLinearregressioninterceptOptions): Self = StObject.set(x, "linearregressionintercept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinearregressioninterceptUndefined: Self = StObject.set(x, "linearregressionintercept", js.undefined)
    
    @scala.inline
    def setLinearregressionslope(value: PlotLinearregressionslopeOptions): Self = StObject.set(x, "linearregressionslope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinearregressionslopeUndefined: Self = StObject.set(x, "linearregressionslope", js.undefined)
    
    @scala.inline
    def setLollipop(value: PlotLollipopOptions): Self = StObject.set(x, "lollipop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLollipopUndefined: Self = StObject.set(x, "lollipop", js.undefined)
    
    @scala.inline
    def setMacd(value: PlotMacdOptions): Self = StObject.set(x, "macd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMacdUndefined: Self = StObject.set(x, "macd", js.undefined)
    
    @scala.inline
    def setMap(value: PlotMapOptions): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    @scala.inline
    def setMapbubble(value: PlotMapbubbleOptions): Self = StObject.set(x, "mapbubble", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapbubbleUndefined: Self = StObject.set(x, "mapbubble", js.undefined)
    
    @scala.inline
    def setMapline(value: PlotMaplineOptions): Self = StObject.set(x, "mapline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaplineUndefined: Self = StObject.set(x, "mapline", js.undefined)
    
    @scala.inline
    def setMappoint(value: PlotMappointOptions): Self = StObject.set(x, "mappoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMappointUndefined: Self = StObject.set(x, "mappoint", js.undefined)
    
    @scala.inline
    def setMfi(value: PlotMfiOptions): Self = StObject.set(x, "mfi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMfiUndefined: Self = StObject.set(x, "mfi", js.undefined)
    
    @scala.inline
    def setMomentum(value: PlotMomentumOptions): Self = StObject.set(x, "momentum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMomentumUndefined: Self = StObject.set(x, "momentum", js.undefined)
    
    @scala.inline
    def setNatr(value: PlotNatrOptions): Self = StObject.set(x, "natr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNatrUndefined: Self = StObject.set(x, "natr", js.undefined)
    
    @scala.inline
    def setNetworkgraph(value: PlotNetworkgraphOptions): Self = StObject.set(x, "networkgraph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkgraphUndefined: Self = StObject.set(x, "networkgraph", js.undefined)
    
    @scala.inline
    def setOhlc(value: PlotOhlcOptions): Self = StObject.set(x, "ohlc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOhlcUndefined: Self = StObject.set(x, "ohlc", js.undefined)
    
    @scala.inline
    def setOrganization(value: PlotOrganizationOptions): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    @scala.inline
    def setPackedbubble(value: PlotPackedbubbleOptions): Self = StObject.set(x, "packedbubble", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackedbubbleUndefined: Self = StObject.set(x, "packedbubble", js.undefined)
    
    @scala.inline
    def setPareto(value: PlotParetoOptions): Self = StObject.set(x, "pareto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParetoUndefined: Self = StObject.set(x, "pareto", js.undefined)
    
    @scala.inline
    def setPc(value: PlotPcOptions): Self = StObject.set(x, "pc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPcUndefined: Self = StObject.set(x, "pc", js.undefined)
    
    @scala.inline
    def setPie(value: PlotPieOptions): Self = StObject.set(x, "pie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPieUndefined: Self = StObject.set(x, "pie", js.undefined)
    
    @scala.inline
    def setPivotpoints(value: PlotPivotpointsOptions): Self = StObject.set(x, "pivotpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPivotpointsUndefined: Self = StObject.set(x, "pivotpoints", js.undefined)
    
    @scala.inline
    def setPolygon(value: PlotPolygonOptions): Self = StObject.set(x, "polygon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolygonUndefined: Self = StObject.set(x, "polygon", js.undefined)
    
    @scala.inline
    def setPpo(value: PlotPpoOptions): Self = StObject.set(x, "ppo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPpoUndefined: Self = StObject.set(x, "ppo", js.undefined)
    
    @scala.inline
    def setPriceenvelopes(value: PlotPriceenvelopesOptions): Self = StObject.set(x, "priceenvelopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriceenvelopesUndefined: Self = StObject.set(x, "priceenvelopes", js.undefined)
    
    @scala.inline
    def setPsar(value: PlotPsarOptions): Self = StObject.set(x, "psar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPsarUndefined: Self = StObject.set(x, "psar", js.undefined)
    
    @scala.inline
    def setPyramid(value: PlotPyramidOptions): Self = StObject.set(x, "pyramid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPyramid3d(value: PlotPyramid3dOptions): Self = StObject.set(x, "pyramid3d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPyramid3dUndefined: Self = StObject.set(x, "pyramid3d", js.undefined)
    
    @scala.inline
    def setPyramidUndefined: Self = StObject.set(x, "pyramid", js.undefined)
    
    @scala.inline
    def setRoc(value: PlotRocOptions): Self = StObject.set(x, "roc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRocUndefined: Self = StObject.set(x, "roc", js.undefined)
    
    @scala.inline
    def setRsi(value: PlotRsiOptions): Self = StObject.set(x, "rsi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRsiUndefined: Self = StObject.set(x, "rsi", js.undefined)
    
    @scala.inline
    def setSankey(value: PlotSankeyOptions): Self = StObject.set(x, "sankey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSankeyUndefined: Self = StObject.set(x, "sankey", js.undefined)
    
    @scala.inline
    def setScatter(value: PlotScatterOptions): Self = StObject.set(x, "scatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScatter3d(value: PlotScatter3dOptions): Self = StObject.set(x, "scatter3d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScatter3dUndefined: Self = StObject.set(x, "scatter3d", js.undefined)
    
    @scala.inline
    def setScatterUndefined: Self = StObject.set(x, "scatter", js.undefined)
    
    @scala.inline
    def setSeries(value: PlotSeriesOptions): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    @scala.inline
    def setSlowstochastic(value: PlotSlowstochasticOptions): Self = StObject.set(x, "slowstochastic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlowstochasticUndefined: Self = StObject.set(x, "slowstochastic", js.undefined)
    
    @scala.inline
    def setSma(value: PlotSmaOptions): Self = StObject.set(x, "sma", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmaUndefined: Self = StObject.set(x, "sma", js.undefined)
    
    @scala.inline
    def setSolidgauge(value: PlotSolidgaugeOptions): Self = StObject.set(x, "solidgauge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSolidgaugeUndefined: Self = StObject.set(x, "solidgauge", js.undefined)
    
    @scala.inline
    def setSpline(value: PlotSplineOptions): Self = StObject.set(x, "spline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplineUndefined: Self = StObject.set(x, "spline", js.undefined)
    
    @scala.inline
    def setStochastic(value: PlotStochasticOptions): Self = StObject.set(x, "stochastic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStochasticUndefined: Self = StObject.set(x, "stochastic", js.undefined)
    
    @scala.inline
    def setStreamgraph(value: PlotStreamgraphOptions): Self = StObject.set(x, "streamgraph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamgraphUndefined: Self = StObject.set(x, "streamgraph", js.undefined)
    
    @scala.inline
    def setSunburst(value: PlotSunburstOptions): Self = StObject.set(x, "sunburst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSunburstUndefined: Self = StObject.set(x, "sunburst", js.undefined)
    
    @scala.inline
    def setSupertrend(value: PlotSupertrendOptions): Self = StObject.set(x, "supertrend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupertrendUndefined: Self = StObject.set(x, "supertrend", js.undefined)
    
    @scala.inline
    def setTema(value: PlotTemaOptions): Self = StObject.set(x, "tema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemaUndefined: Self = StObject.set(x, "tema", js.undefined)
    
    @scala.inline
    def setTilemap(value: PlotTilemapOptions): Self = StObject.set(x, "tilemap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTilemapUndefined: Self = StObject.set(x, "tilemap", js.undefined)
    
    @scala.inline
    def setTimeline(value: PlotTimelineOptions): Self = StObject.set(x, "timeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimelineUndefined: Self = StObject.set(x, "timeline", js.undefined)
    
    @scala.inline
    def setTreemap(value: PlotTreemapOptions): Self = StObject.set(x, "treemap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreemapUndefined: Self = StObject.set(x, "treemap", js.undefined)
    
    @scala.inline
    def setTrendline(value: PlotTrendlineOptions): Self = StObject.set(x, "trendline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrendlineUndefined: Self = StObject.set(x, "trendline", js.undefined)
    
    @scala.inline
    def setTrix(value: PlotTrixOptions): Self = StObject.set(x, "trix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrixUndefined: Self = StObject.set(x, "trix", js.undefined)
    
    @scala.inline
    def setVariablepie(value: PlotVariablepieOptions): Self = StObject.set(x, "variablepie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariablepieUndefined: Self = StObject.set(x, "variablepie", js.undefined)
    
    @scala.inline
    def setVariwide(value: PlotVariwideOptions): Self = StObject.set(x, "variwide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariwideUndefined: Self = StObject.set(x, "variwide", js.undefined)
    
    @scala.inline
    def setVbp(value: PlotVbpOptions): Self = StObject.set(x, "vbp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVbpUndefined: Self = StObject.set(x, "vbp", js.undefined)
    
    @scala.inline
    def setVector(value: PlotVectorOptions): Self = StObject.set(x, "vector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVectorUndefined: Self = StObject.set(x, "vector", js.undefined)
    
    @scala.inline
    def setVenn(value: PlotVennOptions): Self = StObject.set(x, "venn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVennUndefined: Self = StObject.set(x, "venn", js.undefined)
    
    @scala.inline
    def setVwap(value: PlotVwapOptions): Self = StObject.set(x, "vwap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVwapUndefined: Self = StObject.set(x, "vwap", js.undefined)
    
    @scala.inline
    def setWaterfall(value: PlotWaterfallOptions): Self = StObject.set(x, "waterfall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaterfallUndefined: Self = StObject.set(x, "waterfall", js.undefined)
    
    @scala.inline
    def setWilliamsr(value: PlotWilliamsrOptions): Self = StObject.set(x, "williamsr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWilliamsrUndefined: Self = StObject.set(x, "williamsr", js.undefined)
    
    @scala.inline
    def setWindbarb(value: PlotWindbarbOptions): Self = StObject.set(x, "windbarb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindbarbUndefined: Self = StObject.set(x, "windbarb", js.undefined)
    
    @scala.inline
    def setWma(value: PlotWmaOptions): Self = StObject.set(x, "wma", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWmaUndefined: Self = StObject.set(x, "wma", js.undefined)
    
    @scala.inline
    def setWordcloud(value: PlotWordcloudOptions): Self = StObject.set(x, "wordcloud", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordcloudUndefined: Self = StObject.set(x, "wordcloud", js.undefined)
    
    @scala.inline
    def setXrange(value: PlotXrangeOptions): Self = StObject.set(x, "xrange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXrangeUndefined: Self = StObject.set(x, "xrange", js.undefined)
    
    @scala.inline
    def setZigzag(value: PlotZigzagOptions): Self = StObject.set(x, "zigzag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZigzagUndefined: Self = StObject.set(x, "zigzag", js.undefined)
  }
}
