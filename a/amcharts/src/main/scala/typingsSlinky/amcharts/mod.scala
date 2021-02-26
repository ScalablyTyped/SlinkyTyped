package typingsSlinky.amcharts

import typingsSlinky.amcharts.amAngularGaugeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object AmCharts {
    
    @JSImport("amcharts", "AmCharts")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("amcharts", "AmCharts.AmAngularGauge")
    @js.native
    class AmAngularGauge () extends default
    
    @JSImport("amcharts", "AmCharts.AmBalloon")
    @js.native
    class AmBalloon ()
      extends typingsSlinky.amcharts.amBalloonMod.default
    
    @JSImport("amcharts", "AmCharts.AmChart")
    @js.native
    /**
      * used when constructing a chart with a theme
      */
    class AmChart ()
      extends typingsSlinky.amcharts.amChartMod.default {
      def this(theme: js.Any) = this()
    }
    
    @JSImport("amcharts", "AmCharts.AmCoordinateChart")
    @js.native
    class AmCoordinateChart ()
      extends typingsSlinky.amcharts.amCoordinateChartMod.default
    
    // class AmFunnelChart extends _AmFunnelChart { }
    // class AmGanttChart extends _AmGanttChart { }
    @JSImport("amcharts", "AmCharts.AmGraph")
    @js.native
    class AmGraph ()
      extends typingsSlinky.amcharts.amGraphMod.default
    
    @JSImport("amcharts", "AmCharts.AmLegend")
    @js.native
    class AmLegend ()
      extends typingsSlinky.amcharts.amLegendMod.default
    
    @JSImport("amcharts", "AmCharts.AmPieChart")
    @js.native
    class AmPieChart ()
      extends typingsSlinky.amcharts.amPieChartMod.default
    
    @JSImport("amcharts", "AmCharts.AmRadarChart")
    @js.native
    class AmRadarChart ()
      extends typingsSlinky.amcharts.amRadarChartMod.default
    
    @JSImport("amcharts", "AmCharts.AmRectangularChart")
    @js.native
    class AmRectangularChart ()
      extends typingsSlinky.amcharts.amRectangularChartMod.default
    
    @JSImport("amcharts", "AmCharts.AmSerialChart")
    @js.native
    class AmSerialChart ()
      extends typingsSlinky.amcharts.amSerialChartMod.default
    
    // class AmSlicedChart extends _AmSlicedChart { }
    @JSImport("amcharts", "AmCharts.AmXYChart")
    @js.native
    class AmXYChart ()
      extends typingsSlinky.amcharts.amXYChartMod.default
    
    @JSImport("amcharts", "AmCharts.AxisBase")
    @js.native
    class AxisBase ()
      extends typingsSlinky.amcharts.axisBaseMod.default
    
    @JSImport("amcharts", "AmCharts.CategoryAxis")
    @js.native
    class CategoryAxis ()
      extends typingsSlinky.amcharts.categoryAxisMod.default
    
    @JSImport("amcharts", "AmCharts.ChartCursor")
    @js.native
    class ChartCursor ()
      extends typingsSlinky.amcharts.chartCursorMod.default
    
    @JSImport("amcharts", "AmCharts.ChartScrollbar")
    @js.native
    class ChartScrollbar ()
      extends typingsSlinky.amcharts.chartScrollbarMod.default
    
    @JSImport("amcharts", "AmCharts.GaugeArrow")
    @js.native
    class GaugeArrow ()
      extends typingsSlinky.amcharts.gaugeArrowMod.default
    
    @JSImport("amcharts", "AmCharts.GaugeAxis")
    @js.native
    class GaugeAxis ()
      extends typingsSlinky.amcharts.gaugeAxisMod.default
    
    @JSImport("amcharts", "AmCharts.GaugeBand")
    @js.native
    class GaugeBand ()
      extends typingsSlinky.amcharts.gaugeBandMod.default
    
    @JSImport("amcharts", "AmCharts.GraphDataItem")
    @js.native
    class GraphDataItem ()
      extends typingsSlinky.amcharts.graphDataItemMod.default
    
    @JSImport("amcharts", "AmCharts.Guide")
    @js.native
    class Guide ()
      extends typingsSlinky.amcharts.guideMod.default
    
    // class Image extends _Image { }
    @JSImport("amcharts", "AmCharts.Label")
    @js.native
    class Label ()
      extends typingsSlinky.amcharts.labelMod.default
    
    @JSImport("amcharts", "AmCharts.SerialDataItem")
    @js.native
    class SerialDataItem ()
      extends typingsSlinky.amcharts.serialDataItemMod.default
    
    @JSImport("amcharts", "AmCharts.Slice")
    @js.native
    class Slice ()
      extends typingsSlinky.amcharts.sliceMod.default
    
    @JSImport("amcharts", "AmCharts.Title")
    @js.native
    class Title ()
      extends typingsSlinky.amcharts.titleMod.default
    
    @JSImport("amcharts", "AmCharts.TrendLine")
    @js.native
    class TrendLine ()
      extends typingsSlinky.amcharts.trendLineMod.default
    
    @JSImport("amcharts", "AmCharts.ValueAxis")
    @js.native
    class ValueAxis ()
      extends typingsSlinky.amcharts.valueAxisMod.default
    
    /**
      * Set a method to be called before initializing the chart.
      * When the method is called, the chart instance is passed as an attribute.
      * You can use this feature to preprocess chart data or do some other things you need
      * before initializing the chart.
      * @param handler - The method to be called.
      * @param types - Which chart types should call this method. Defaults to all
      * if none is passed.
      */
    @JSImport("amcharts", "AmCharts.addInitHandler")
    @js.native
    def addInitHandler(handler: js.Function0[js.Object]): js.Any = js.native
    @JSImport("amcharts", "AmCharts.addInitHandler")
    @js.native
    def addInitHandler(handler: js.Function0[js.Object], types: js.Array[String]): js.Any = js.native
    
    /**
      * Set it to true if you have base href set for your page.
      * This will fix rendering problems in Firefox caused by base href.
      */
    @JSImport("amcharts", "AmCharts.baseHref")
    @js.native
    def baseHref: Boolean = js.native
    @scala.inline
    def baseHref_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("baseHref")(x.asInstanceOf[js.Any])
    
    /**
      * Clears all the charts on page, removes listeners and intervals.
      */
    @JSImport("amcharts", "AmCharts.clear")
    @js.native
    def clear(): Unit = js.native
    
    /**
      * Array of day names, used when formatting dates (if categoryAxis.parseDates is set to true)
      * ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday']
      */
    @JSImport("amcharts", "AmCharts.dayNames")
    @js.native
    def dayNames: js.Array[String] = js.native
    @scala.inline
    def dayNames_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dayNames")(x.asInstanceOf[js.Any])
    
    /**
      * Create chart by params.
      */
    @JSImport("amcharts", "AmCharts.makeChart")
    @js.native
    def makeChart(selector: String, params: js.Any): AmChart = js.native
    @JSImport("amcharts", "AmCharts.makeChart")
    @js.native
    def makeChart(selector: String, params: js.Any, delay: Double): AmChart = js.native
    
    /**
      * Array of month names, used when formatting dates (if categoryAxis.parseDates is set to true)
      * [
      * 'January', 'February', 'March', 'April', 'May', 'June', 'July', 'August',
      * 'September', 'October', 'November','December'
      * ]
      */
    @JSImport("amcharts", "AmCharts.monthNames")
    @js.native
    def monthNames: js.Array[String] = js.native
    @scala.inline
    def monthNames_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("monthNames")(x.asInstanceOf[js.Any])
    
    /**
      * Array of short versions of day names, used when formatting dates (if categoryAxis.parseDates is set to true)
      * ['Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat']
      */
    @JSImport("amcharts", "AmCharts.shortDayNames")
    @js.native
    def shortDayNames: js.Array[String] = js.native
    @scala.inline
    def shortDayNames_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shortDayNames")(x.asInstanceOf[js.Any])
    
    /**
      * Array of short versions of month names, used when formatting dates (if categoryAxis.parseDates is set to true)
      * ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']
      */
    @JSImport("amcharts", "AmCharts.shortMonthNames")
    @js.native
    def shortMonthNames: js.Array[String] = js.native
    @scala.inline
    def shortMonthNames_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shortMonthNames")(x.asInstanceOf[js.Any])
    
    /**
      * Set global used AmCharts theme.
      */
    @JSImport("amcharts", "AmCharts.theme")
    @js.native
    def theme: js.Any = js.native
    @scala.inline
    def theme_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("theme")(x.asInstanceOf[js.Any])
    
    /**
      * Object with existing themes.
      */
    @JSImport("amcharts", "AmCharts.themes")
    @js.native
    def themes: js.Any = js.native
    @scala.inline
    def themes_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("themes")(x.asInstanceOf[js.Any])
    
    /**
      * Set it to true if you want UTC time to be used instead of local time.
      */
    @JSImport("amcharts", "AmCharts.useUTC")
    @js.native
    def useUTC: Boolean = js.native
    @scala.inline
    def useUTC_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useUTC")(x.asInstanceOf[js.Any])
  }
}
