package typingsSlinky.reactEasyChart

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import typingsSlinky.reactEasyChart.anon.Bottom
import typingsSlinky.reactEasyChart.anon.Color
import typingsSlinky.reactEasyChart.anon.ColorString
import typingsSlinky.reactEasyChart.anon.Stroke
import typingsSlinky.reactEasyChart.anon.X
import typingsSlinky.reactEasyChart.anon.Y
import typingsSlinky.reactEasyChart.reactEasyChartStrings.`basis-closed`
import typingsSlinky.reactEasyChart.reactEasyChartStrings.`basis-open`
import typingsSlinky.reactEasyChart.reactEasyChartStrings.`cardinal-closed`
import typingsSlinky.reactEasyChart.reactEasyChartStrings.`cardinal-open`
import typingsSlinky.reactEasyChart.reactEasyChartStrings.`linear-closed`
import typingsSlinky.reactEasyChart.reactEasyChartStrings.`step-after`
import typingsSlinky.reactEasyChart.reactEasyChartStrings.`step-before`
import typingsSlinky.reactEasyChart.reactEasyChartStrings.basis
import typingsSlinky.reactEasyChart.reactEasyChartStrings.bundle
import typingsSlinky.reactEasyChart.reactEasyChartStrings.cardinal
import typingsSlinky.reactEasyChart.reactEasyChartStrings.linear
import typingsSlinky.reactEasyChart.reactEasyChartStrings.monotone
import typingsSlinky.reactEasyChart.reactEasyChartStrings.step
import typingsSlinky.reactEasyChart.reactEasyChartStrings.text
import typingsSlinky.reactEasyChart.reactEasyChartStrings.time
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-easy-chart", "AreaChart")
  @js.native
  class AreaChart protected ()
    extends Component[AreaChartProps, js.Object, js.Any] {
    def this(props: AreaChartProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: AreaChartProps, context: js.Any) = this()
  }
  
  @JSImport("react-easy-chart", "BarChart")
  @js.native
  class BarChart protected ()
    extends Component[BarChartProps, js.Object, js.Any] {
    def this(props: BarChartProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: BarChartProps, context: js.Any) = this()
  }
  
  @JSImport("react-easy-chart", "Legend")
  @js.native
  class Legend protected ()
    extends Component[LegendProps, js.Object, js.Any] {
    def this(props: LegendProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: LegendProps, context: js.Any) = this()
  }
  
  @JSImport("react-easy-chart", "LineChart")
  @js.native
  class LineChart protected ()
    extends Component[LineChartProps, js.Object, js.Any] {
    def this(props: LineChartProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: LineChartProps, context: js.Any) = this()
  }
  
  @JSImport("react-easy-chart", "PieChart")
  @js.native
  class PieChart protected ()
    extends Component[PieChartProps, js.Object, js.Any] {
    def this(props: PieChartProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PieChartProps, context: js.Any) = this()
  }
  
  @JSImport("react-easy-chart", "ScatterplotChart")
  @js.native
  class ScatterplotChart protected ()
    extends Component[ScatterplotChartProps, js.Object, js.Any] {
    def this(props: ScatterplotChartProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ScatterplotChartProps, context: js.Any) = this()
  }
  
  @js.native
  trait AreaChartProps extends LineChartProps {
    
    /** Make the gradient area a solid fill rather than a gradient */
    var noAreaGradient: js.UndefOr[Boolean] = js.native
  }
  object AreaChartProps {
    
    @scala.inline
    def apply(data: js.Array[js.Array[LineData]]): AreaChartProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[AreaChartProps]
    }
    
    @scala.inline
    implicit class AreaChartPropsMutableBuilder[Self <: AreaChartProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNoAreaGradient(value: Boolean): Self = StObject.set(x, "noAreaGradient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoAreaGradientUndefined: Self = StObject.set(x, "noAreaGradient", js.undefined)
    }
  }
  
  @js.native
  trait BarChartProps extends StObject {
    
    /** Whether to show axis labels */
    var axes: js.UndefOr[Boolean] = js.native
    
    /** Labels for each of the axis */
    var axisLabels: js.UndefOr[X] = js.native
    
    /** The width of an individual bar in pixels */
    var barWidth: js.UndefOr[Double] = js.native
    
    var clickHandler: js.UndefOr[js.Function2[/* data */ BarData, /* mouseEvent */ MouseEvent, _]] = js.native
    
    /** Whether to automatically color the bars */
    var colorBars: js.UndefOr[Boolean] = js.native
    
    var data: js.Array[BarData] = js.native
    
    /** A d3 time formatting pattern to be applied to format the x axis values */
    var datePattern: js.UndefOr[String] = js.native
    
    /** Whether to show horizontal grid lines on the chart */
    var grid: js.UndefOr[Boolean] = js.native
    
    /** Height of the chart in pixels */
    var height: js.UndefOr[Double] = js.native
    
    /** Interpolation method if you add a line to this chart (via lineData) */
    var interpolate: js.UndefOr[String] = js.native
    
    var lineData: js.UndefOr[js.Array[LineData]] = js.native
    
    /** css margins */
    var margin: js.UndefOr[Bottom] = js.native
    
    var mouseMoveHandler: js.UndefOr[js.Function2[/* data */ BarData, /* mouseEvent */ MouseEvent, _]] = js.native
    
    var mouseOutHandler: js.UndefOr[js.Function2[/* data */ BarData, /* mouseEvent */ MouseEvent, _]] = js.native
    
    var mouseOverHandler: js.UndefOr[js.Function2[/* data */ BarData, /* mouseEvent */ MouseEvent, _]] = js.native
    
    /** The d3 time format to be used for the x axis (when xType is 'time') */
    var tickTimeDisplayFormat: js.UndefOr[String] = js.native
    
    /** Width of the chart in pixels */
    var width: js.UndefOr[Double] = js.native
    
    /** The range that the x axis should show (otherwise automatically calculated) */
    var xDomainRange: js.UndefOr[js.Array[js.Date | Double | String]] = js.native
    
    /** The amount of ticks to be shown on the x axis */
    var xTickNumber: js.UndefOr[Double] = js.native
    
    /** What data type the x axis is */
    var xType: js.UndefOr[time | text | linear] = js.native
    
    /** What data type the second y axis is */
    var y2Type: js.UndefOr[time | text | linear] = js.native
    
    /** Whether to show the axis on the right (default false: left) */
    var yAxisOrientRight: js.UndefOr[Boolean] = js.native
    
    /** The range that the y axis should show (otherwise automatically calculated) */
    var yDomainRange: js.UndefOr[js.Array[Double]] = js.native
    
    /** The amount of ticks to be shown on the y axis */
    var yTickNumber: js.UndefOr[Double] = js.native
  }
  object BarChartProps {
    
    @scala.inline
    def apply(data: js.Array[BarData]): BarChartProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[BarChartProps]
    }
    
    @scala.inline
    implicit class BarChartPropsMutableBuilder[Self <: BarChartProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxes(value: Boolean): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxesUndefined: Self = StObject.set(x, "axes", js.undefined)
      
      @scala.inline
      def setAxisLabels(value: X): Self = StObject.set(x, "axisLabels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisLabelsUndefined: Self = StObject.set(x, "axisLabels", js.undefined)
      
      @scala.inline
      def setBarWidth(value: Double): Self = StObject.set(x, "barWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBarWidthUndefined: Self = StObject.set(x, "barWidth", js.undefined)
      
      @scala.inline
      def setClickHandler(value: (/* data */ BarData, /* mouseEvent */ MouseEvent) => _): Self = StObject.set(x, "clickHandler", js.Any.fromFunction2(value))
      
      @scala.inline
      def setClickHandlerUndefined: Self = StObject.set(x, "clickHandler", js.undefined)
      
      @scala.inline
      def setColorBars(value: Boolean): Self = StObject.set(x, "colorBars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorBarsUndefined: Self = StObject.set(x, "colorBars", js.undefined)
      
      @scala.inline
      def setData(value: js.Array[BarData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: BarData*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setDatePattern(value: String): Self = StObject.set(x, "datePattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatePatternUndefined: Self = StObject.set(x, "datePattern", js.undefined)
      
      @scala.inline
      def setGrid(value: Boolean): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setInterpolate(value: String): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterpolateUndefined: Self = StObject.set(x, "interpolate", js.undefined)
      
      @scala.inline
      def setLineData(value: js.Array[LineData]): Self = StObject.set(x, "lineData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineDataUndefined: Self = StObject.set(x, "lineData", js.undefined)
      
      @scala.inline
      def setLineDataVarargs(value: LineData*): Self = StObject.set(x, "lineData", js.Array(value :_*))
      
      @scala.inline
      def setMargin(value: Bottom): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setMouseMoveHandler(value: (/* data */ BarData, /* mouseEvent */ MouseEvent) => _): Self = StObject.set(x, "mouseMoveHandler", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMouseMoveHandlerUndefined: Self = StObject.set(x, "mouseMoveHandler", js.undefined)
      
      @scala.inline
      def setMouseOutHandler(value: (/* data */ BarData, /* mouseEvent */ MouseEvent) => _): Self = StObject.set(x, "mouseOutHandler", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMouseOutHandlerUndefined: Self = StObject.set(x, "mouseOutHandler", js.undefined)
      
      @scala.inline
      def setMouseOverHandler(value: (/* data */ BarData, /* mouseEvent */ MouseEvent) => _): Self = StObject.set(x, "mouseOverHandler", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMouseOverHandlerUndefined: Self = StObject.set(x, "mouseOverHandler", js.undefined)
      
      @scala.inline
      def setTickTimeDisplayFormat(value: String): Self = StObject.set(x, "tickTimeDisplayFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickTimeDisplayFormatUndefined: Self = StObject.set(x, "tickTimeDisplayFormat", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setXDomainRange(value: js.Array[js.Date | Double | String]): Self = StObject.set(x, "xDomainRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXDomainRangeUndefined: Self = StObject.set(x, "xDomainRange", js.undefined)
      
      @scala.inline
      def setXDomainRangeVarargs(value: (js.Date | Double | String)*): Self = StObject.set(x, "xDomainRange", js.Array(value :_*))
      
      @scala.inline
      def setXTickNumber(value: Double): Self = StObject.set(x, "xTickNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXTickNumberUndefined: Self = StObject.set(x, "xTickNumber", js.undefined)
      
      @scala.inline
      def setXType(value: time | text | linear): Self = StObject.set(x, "xType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXTypeUndefined: Self = StObject.set(x, "xType", js.undefined)
      
      @scala.inline
      def setY2Type(value: time | text | linear): Self = StObject.set(x, "y2Type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY2TypeUndefined: Self = StObject.set(x, "y2Type", js.undefined)
      
      @scala.inline
      def setYAxisOrientRight(value: Boolean): Self = StObject.set(x, "yAxisOrientRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYAxisOrientRightUndefined: Self = StObject.set(x, "yAxisOrientRight", js.undefined)
      
      @scala.inline
      def setYDomainRange(value: js.Array[Double]): Self = StObject.set(x, "yDomainRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYDomainRangeUndefined: Self = StObject.set(x, "yDomainRange", js.undefined)
      
      @scala.inline
      def setYDomainRangeVarargs(value: Double*): Self = StObject.set(x, "yDomainRange", js.Array(value :_*))
      
      @scala.inline
      def setYTickNumber(value: Double): Self = StObject.set(x, "yTickNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYTickNumberUndefined: Self = StObject.set(x, "yTickNumber", js.undefined)
    }
  }
  
  @js.native
  trait BarData extends StObject {
    
    var color: js.UndefOr[String] = js.native
    
    var x: Double | js.Date | String = js.native
    
    var y: Double = js.native
  }
  object BarData {
    
    @scala.inline
    def apply(x: Double | js.Date | String, y: Double): BarData = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[BarData]
    }
    
    @scala.inline
    implicit class BarDataMutableBuilder[Self <: BarData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setX(value: Double | js.Date | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXDate(value: js.Date): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LegendProps extends StObject {
    
    /** Override the color of the items */
    var config: js.UndefOr[js.Array[ColorString]] = js.native
    
    var data: js.Array[_] = js.native
    
    var dataId: String = js.native
    
    /** change list items to inline-block (default block) */
    var horizontal: js.UndefOr[Boolean] = js.native
    
    /** Override the css styles of individual components, see http://rma-consulting.github.io/react-easy-chart/legend/index.html */
    var styles: js.UndefOr[StringDictionary[CSSProperties]] = js.native
  }
  object LegendProps {
    
    @scala.inline
    def apply(data: js.Array[_], dataId: String): LegendProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataId = dataId.asInstanceOf[js.Any])
      __obj.asInstanceOf[LegendProps]
    }
    
    @scala.inline
    implicit class LegendPropsMutableBuilder[Self <: LegendProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: js.Array[ColorString]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setConfigVarargs(value: ColorString*): Self = StObject.set(x, "config", js.Array(value :_*))
      
      @scala.inline
      def setData(value: js.Array[_]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataId(value: String): Self = StObject.set(x, "dataId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      @scala.inline
      def setStyles(value: StringDictionary[CSSProperties]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  @js.native
  trait LineChartProps extends StObject {
    
    /** Whether to show axis labels */
    var axes: js.UndefOr[Boolean] = js.native
    
    /** Labels for each of the axis */
    var axisLabels: js.UndefOr[Y] = js.native
    
    var clickHandler: js.UndefOr[js.Function2[/* data */ LineData, /* mouseEvent */ MouseEvent, _]] = js.native
    
    var data: js.Array[js.Array[LineData]] = js.native
    
    /** Whether to show circles on the data points */
    var dataPoints: js.UndefOr[Boolean] = js.native
    
    /** Whether to show horizontal grid lines on the chart */
    var grid: js.UndefOr[Boolean] = js.native
    
    /** Height of the chart in pixels */
    var height: js.UndefOr[Double] = js.native
    
    /** Smoothing option for the lines */
    var interpolate: js.UndefOr[
        linear | `linear-closed` | step | `step-before` | `step-after` | basis | `basis-open` | `basis-closed` | bundle | cardinal | `cardinal-open` | `cardinal-closed` | monotone
      ] = js.native
    
    var lineColors: js.UndefOr[js.Array[String]] = js.native
    
    /** css margins */
    var margin: js.UndefOr[Bottom] = js.native
    
    var mouseMoveHandler: js.UndefOr[js.Function2[/* data */ LineData, /* mouseEvent */ MouseEvent, _]] = js.native
    
    var mouseOutHandler: js.UndefOr[js.Function2[/* data */ LineData, /* mouseEvent */ MouseEvent, _]] = js.native
    
    var mouseOverHandler: js.UndefOr[js.Function2[/* data */ LineData, /* mouseEvent */ MouseEvent, _]] = js.native
    
    /** The d3 time format to be used for the x axis (when xType is 'time') */
    var tickTimeDisplayFormat: js.UndefOr[String] = js.native
    
    /** Whether to show vertical grid lines on the chart */
    var verticalGrid: js.UndefOr[Boolean] = js.native
    
    /** Width of the chart in pixels */
    var width: js.UndefOr[Double] = js.native
    
    /** The range that the x axis should show (otherwise automatically calculated) */
    var xDomainRange: js.UndefOr[js.Array[js.Date | Double | String]] = js.native
    
    /** The amount of ticks to be shown on the x axis */
    var xTicks: js.UndefOr[Double] = js.native
    
    /** What data type the x axis is */
    var xType: js.UndefOr[time | text | linear] = js.native
    
    /** Whether to show the axis on the right (default false: left) */
    var yAxisOrientRight: js.UndefOr[Boolean] = js.native
    
    /** The range that the y axis should show (otherwise automatically calculated) */
    var yDomainRange: js.UndefOr[js.Array[Double | String]] = js.native
    
    /** The amount of ticks to be shown on the y axis */
    var yTicks: js.UndefOr[Double] = js.native
    
    /** What data type the x axis is */
    var yType: js.UndefOr[time | text | linear] = js.native
  }
  object LineChartProps {
    
    @scala.inline
    def apply(data: js.Array[js.Array[LineData]]): LineChartProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[LineChartProps]
    }
    
    @scala.inline
    implicit class LineChartPropsMutableBuilder[Self <: LineChartProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxes(value: Boolean): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxesUndefined: Self = StObject.set(x, "axes", js.undefined)
      
      @scala.inline
      def setAxisLabels(value: Y): Self = StObject.set(x, "axisLabels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisLabelsUndefined: Self = StObject.set(x, "axisLabels", js.undefined)
      
      @scala.inline
      def setClickHandler(value: (/* data */ LineData, /* mouseEvent */ MouseEvent) => _): Self = StObject.set(x, "clickHandler", js.Any.fromFunction2(value))
      
      @scala.inline
      def setClickHandlerUndefined: Self = StObject.set(x, "clickHandler", js.undefined)
      
      @scala.inline
      def setData(value: js.Array[js.Array[LineData]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataPoints(value: Boolean): Self = StObject.set(x, "dataPoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataPointsUndefined: Self = StObject.set(x, "dataPoints", js.undefined)
      
      @scala.inline
      def setDataVarargs(value: js.Array[LineData]*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setGrid(value: Boolean): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setInterpolate(
        value: linear | `linear-closed` | step | `step-before` | `step-after` | basis | `basis-open` | `basis-closed` | bundle | cardinal | `cardinal-open` | `cardinal-closed` | monotone
      ): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterpolateUndefined: Self = StObject.set(x, "interpolate", js.undefined)
      
      @scala.inline
      def setLineColors(value: js.Array[String]): Self = StObject.set(x, "lineColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineColorsUndefined: Self = StObject.set(x, "lineColors", js.undefined)
      
      @scala.inline
      def setLineColorsVarargs(value: String*): Self = StObject.set(x, "lineColors", js.Array(value :_*))
      
      @scala.inline
      def setMargin(value: Bottom): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setMouseMoveHandler(value: (/* data */ LineData, /* mouseEvent */ MouseEvent) => _): Self = StObject.set(x, "mouseMoveHandler", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMouseMoveHandlerUndefined: Self = StObject.set(x, "mouseMoveHandler", js.undefined)
      
      @scala.inline
      def setMouseOutHandler(value: (/* data */ LineData, /* mouseEvent */ MouseEvent) => _): Self = StObject.set(x, "mouseOutHandler", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMouseOutHandlerUndefined: Self = StObject.set(x, "mouseOutHandler", js.undefined)
      
      @scala.inline
      def setMouseOverHandler(value: (/* data */ LineData, /* mouseEvent */ MouseEvent) => _): Self = StObject.set(x, "mouseOverHandler", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMouseOverHandlerUndefined: Self = StObject.set(x, "mouseOverHandler", js.undefined)
      
      @scala.inline
      def setTickTimeDisplayFormat(value: String): Self = StObject.set(x, "tickTimeDisplayFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickTimeDisplayFormatUndefined: Self = StObject.set(x, "tickTimeDisplayFormat", js.undefined)
      
      @scala.inline
      def setVerticalGrid(value: Boolean): Self = StObject.set(x, "verticalGrid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalGridUndefined: Self = StObject.set(x, "verticalGrid", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setXDomainRange(value: js.Array[js.Date | Double | String]): Self = StObject.set(x, "xDomainRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXDomainRangeUndefined: Self = StObject.set(x, "xDomainRange", js.undefined)
      
      @scala.inline
      def setXDomainRangeVarargs(value: (js.Date | Double | String)*): Self = StObject.set(x, "xDomainRange", js.Array(value :_*))
      
      @scala.inline
      def setXTicks(value: Double): Self = StObject.set(x, "xTicks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXTicksUndefined: Self = StObject.set(x, "xTicks", js.undefined)
      
      @scala.inline
      def setXType(value: time | text | linear): Self = StObject.set(x, "xType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXTypeUndefined: Self = StObject.set(x, "xType", js.undefined)
      
      @scala.inline
      def setYAxisOrientRight(value: Boolean): Self = StObject.set(x, "yAxisOrientRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYAxisOrientRightUndefined: Self = StObject.set(x, "yAxisOrientRight", js.undefined)
      
      @scala.inline
      def setYDomainRange(value: js.Array[Double | String]): Self = StObject.set(x, "yDomainRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYDomainRangeUndefined: Self = StObject.set(x, "yDomainRange", js.undefined)
      
      @scala.inline
      def setYDomainRangeVarargs(value: (Double | String)*): Self = StObject.set(x, "yDomainRange", js.Array(value :_*))
      
      @scala.inline
      def setYTicks(value: Double): Self = StObject.set(x, "yTicks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYTicksUndefined: Self = StObject.set(x, "yTicks", js.undefined)
      
      @scala.inline
      def setYType(value: time | text | linear): Self = StObject.set(x, "yType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYTypeUndefined: Self = StObject.set(x, "yType", js.undefined)
    }
  }
  
  @js.native
  trait LineData extends StObject {
    
    var x: Double | js.Date | String = js.native
    
    var y: Double | js.Date | String = js.native
  }
  object LineData {
    
    @scala.inline
    def apply(x: Double | js.Date | String, y: Double | js.Date | String): LineData = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[LineData]
    }
    
    @scala.inline
    implicit class LineDataMutableBuilder[Self <: LineData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double | js.Date | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXDate(value: js.Date): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double | js.Date | String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYDate(value: js.Date): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PieChartProps extends StObject {
    
    var clickHandler: js.UndefOr[js.Function2[/* data */ PieData, /* mouseEvent */ MouseEvent, _]] = js.native
    
    var data: js.Array[Color] = js.native
    
    /** Size in pixels of the inner hole (diameter) */
    var innerHoleSize: js.UndefOr[Double] = js.native
    
    /** Whether to add labels the to pie segments */
    var labels: js.UndefOr[Boolean] = js.native
    
    var mouseMoveHandler: js.UndefOr[js.Function2[/* data */ PieData, /* mouseEvent */ MouseEvent, _]] = js.native
    
    var mouseOutHandler: js.UndefOr[js.Function2[/* data */ PieData, /* mouseEvent */ MouseEvent, _]] = js.native
    
    var mouseOverHandler: js.UndefOr[js.Function2[/* data */ PieData, /* mouseEvent */ MouseEvent, _]] = js.native
    
    /** Padding around the chart in pixels */
    var padding: js.UndefOr[Double] = js.native
    
    /** Size in pixels in each dimension */
    var size: js.UndefOr[Double] = js.native
    
    var styles: js.UndefOr[StringDictionary[CSSProperties]] = js.native
  }
  object PieChartProps {
    
    @scala.inline
    def apply(data: js.Array[Color]): PieChartProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[PieChartProps]
    }
    
    @scala.inline
    implicit class PieChartPropsMutableBuilder[Self <: PieChartProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClickHandler(value: (/* data */ PieData, /* mouseEvent */ MouseEvent) => _): Self = StObject.set(x, "clickHandler", js.Any.fromFunction2(value))
      
      @scala.inline
      def setClickHandlerUndefined: Self = StObject.set(x, "clickHandler", js.undefined)
      
      @scala.inline
      def setData(value: js.Array[Color]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: Color*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setInnerHoleSize(value: Double): Self = StObject.set(x, "innerHoleSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerHoleSizeUndefined: Self = StObject.set(x, "innerHoleSize", js.undefined)
      
      @scala.inline
      def setLabels(value: Boolean): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      @scala.inline
      def setMouseMoveHandler(value: (/* data */ PieData, /* mouseEvent */ MouseEvent) => _): Self = StObject.set(x, "mouseMoveHandler", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMouseMoveHandlerUndefined: Self = StObject.set(x, "mouseMoveHandler", js.undefined)
      
      @scala.inline
      def setMouseOutHandler(value: (/* data */ PieData, /* mouseEvent */ MouseEvent) => _): Self = StObject.set(x, "mouseOutHandler", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMouseOutHandlerUndefined: Self = StObject.set(x, "mouseOutHandler", js.undefined)
      
      @scala.inline
      def setMouseOverHandler(value: (/* data */ PieData, /* mouseEvent */ MouseEvent) => _): Self = StObject.set(x, "mouseOverHandler", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMouseOverHandlerUndefined: Self = StObject.set(x, "mouseOverHandler", js.undefined)
      
      @scala.inline
      def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStyles(value: StringDictionary[CSSProperties]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  @js.native
  trait PieData extends StObject {
    
    var color: js.UndefOr[String] = js.native
    
    var key: String = js.native
    
    var value: Double = js.native
  }
  object PieData {
    
    @scala.inline
    def apply(key: String, value: Double): PieData = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PieData]
    }
    
    @scala.inline
    implicit class PieDataMutableBuilder[Self <: PieData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ScatterplotChartProps extends StObject {
    
    /** Whether to show axis labels */
    var axes: js.UndefOr[Boolean] = js.native
    
    /** Labels for each of the axis */
    var axisLabels: js.UndefOr[Y] = js.native
    
    var clickHandler: js.UndefOr[js.Function2[/* data */ ScatterplotData, /* mouseEvent */ MouseEvent, _]] = js.native
    
    /** Allows styling of individual types of points */
    var config: js.UndefOr[js.Array[Stroke]] = js.native
    
    var data: js.Array[ScatterplotData] = js.native
    
    /** Radius of the dots on the chart */
    var dotRadius: js.UndefOr[Double] = js.native
    
    /** Whether to show horizontal grid lines on the chart */
    var grid: js.UndefOr[Boolean] = js.native
    
    /** Height of the chart in pixels */
    var height: js.UndefOr[Double] = js.native
    
    /** css margins */
    var margin: js.UndefOr[Bottom] = js.native
    
    var mouseMoveHandler: js.UndefOr[js.Function2[/* data */ ScatterplotData, /* mouseEvent */ MouseEvent, _]] = js.native
    
    var mouseOutHandler: js.UndefOr[js.Function2[/* data */ ScatterplotData, /* mouseEvent */ MouseEvent, _]] = js.native
    
    var mouseOverHandler: js.UndefOr[js.Function2[/* data */ ScatterplotData, /* mouseEvent */ MouseEvent, _]] = js.native
    
    /** Whether to show vertical grid lines on the chart */
    var verticalGrid: js.UndefOr[Boolean] = js.native
    
    /** Width of the chart in pixels */
    var width: js.UndefOr[Double] = js.native
    
    /** The range that the x axis should show (otherwise automatically calculated) */
    var xDomainRange: js.UndefOr[js.Array[js.Date | Double | String]] = js.native
    
    /** What data type the x axis is */
    var xType: js.UndefOr[time | text | linear] = js.native
    
    /** Whether to show the axis on the right (default false: left) */
    var yAxisOrientRight: js.UndefOr[Boolean] = js.native
    
    /** The range that the y axis should show (otherwise automatically calculated) */
    var yDomainRange: js.UndefOr[js.Array[js.Date | Double | String]] = js.native
    
    /** What data type the x axis is */
    var yType: js.UndefOr[time | text | linear] = js.native
  }
  object ScatterplotChartProps {
    
    @scala.inline
    def apply(data: js.Array[ScatterplotData]): ScatterplotChartProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScatterplotChartProps]
    }
    
    @scala.inline
    implicit class ScatterplotChartPropsMutableBuilder[Self <: ScatterplotChartProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxes(value: Boolean): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxesUndefined: Self = StObject.set(x, "axes", js.undefined)
      
      @scala.inline
      def setAxisLabels(value: Y): Self = StObject.set(x, "axisLabels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisLabelsUndefined: Self = StObject.set(x, "axisLabels", js.undefined)
      
      @scala.inline
      def setClickHandler(value: (/* data */ ScatterplotData, /* mouseEvent */ MouseEvent) => _): Self = StObject.set(x, "clickHandler", js.Any.fromFunction2(value))
      
      @scala.inline
      def setClickHandlerUndefined: Self = StObject.set(x, "clickHandler", js.undefined)
      
      @scala.inline
      def setConfig(value: js.Array[Stroke]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setConfigVarargs(value: Stroke*): Self = StObject.set(x, "config", js.Array(value :_*))
      
      @scala.inline
      def setData(value: js.Array[ScatterplotData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: ScatterplotData*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setDotRadius(value: Double): Self = StObject.set(x, "dotRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotRadiusUndefined: Self = StObject.set(x, "dotRadius", js.undefined)
      
      @scala.inline
      def setGrid(value: Boolean): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setMargin(value: Bottom): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setMouseMoveHandler(value: (/* data */ ScatterplotData, /* mouseEvent */ MouseEvent) => _): Self = StObject.set(x, "mouseMoveHandler", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMouseMoveHandlerUndefined: Self = StObject.set(x, "mouseMoveHandler", js.undefined)
      
      @scala.inline
      def setMouseOutHandler(value: (/* data */ ScatterplotData, /* mouseEvent */ MouseEvent) => _): Self = StObject.set(x, "mouseOutHandler", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMouseOutHandlerUndefined: Self = StObject.set(x, "mouseOutHandler", js.undefined)
      
      @scala.inline
      def setMouseOverHandler(value: (/* data */ ScatterplotData, /* mouseEvent */ MouseEvent) => _): Self = StObject.set(x, "mouseOverHandler", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMouseOverHandlerUndefined: Self = StObject.set(x, "mouseOverHandler", js.undefined)
      
      @scala.inline
      def setVerticalGrid(value: Boolean): Self = StObject.set(x, "verticalGrid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalGridUndefined: Self = StObject.set(x, "verticalGrid", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setXDomainRange(value: js.Array[js.Date | Double | String]): Self = StObject.set(x, "xDomainRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXDomainRangeUndefined: Self = StObject.set(x, "xDomainRange", js.undefined)
      
      @scala.inline
      def setXDomainRangeVarargs(value: (js.Date | Double | String)*): Self = StObject.set(x, "xDomainRange", js.Array(value :_*))
      
      @scala.inline
      def setXType(value: time | text | linear): Self = StObject.set(x, "xType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXTypeUndefined: Self = StObject.set(x, "xType", js.undefined)
      
      @scala.inline
      def setYAxisOrientRight(value: Boolean): Self = StObject.set(x, "yAxisOrientRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYAxisOrientRightUndefined: Self = StObject.set(x, "yAxisOrientRight", js.undefined)
      
      @scala.inline
      def setYDomainRange(value: js.Array[js.Date | Double | String]): Self = StObject.set(x, "yDomainRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYDomainRangeUndefined: Self = StObject.set(x, "yDomainRange", js.undefined)
      
      @scala.inline
      def setYDomainRangeVarargs(value: (js.Date | Double | String)*): Self = StObject.set(x, "yDomainRange", js.Array(value :_*))
      
      @scala.inline
      def setYType(value: time | text | linear): Self = StObject.set(x, "yType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYTypeUndefined: Self = StObject.set(x, "yType", js.undefined)
    }
  }
  
  @js.native
  trait ScatterplotData extends StObject {
    
    var `type`: String | Double = js.native
    
    var x: Double | js.Date | String = js.native
    
    var y: Double | js.Date | String = js.native
    
    var z: js.UndefOr[Double] = js.native
  }
  object ScatterplotData {
    
    @scala.inline
    def apply(`type`: String | Double, x: Double | js.Date | String, y: Double | js.Date | String): ScatterplotData = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScatterplotData]
    }
    
    @scala.inline
    implicit class ScatterplotDataMutableBuilder[Self <: ScatterplotData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: String | Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double | js.Date | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXDate(value: js.Date): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double | js.Date | String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYDate(value: js.Date): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZUndefined: Self = StObject.set(x, "z", js.undefined)
    }
  }
}
