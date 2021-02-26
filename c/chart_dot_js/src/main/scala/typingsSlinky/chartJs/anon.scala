package typingsSlinky.chartJs

import org.scalajs.dom.raw.CanvasGradient
import org.scalajs.dom.raw.CanvasPattern
import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.chartJs.mod.ChartAnimationOptions
import typingsSlinky.chartJs.mod.ChartColor
import typingsSlinky.chartJs.mod.ChartDataSets
import typingsSlinky.chartJs.mod.ChartElementsOptions
import typingsSlinky.chartJs.mod.ChartHoverOptions
import typingsSlinky.chartJs.mod.ChartLayoutOptions
import typingsSlinky.chartJs.mod.ChartLegendOptions
import typingsSlinky.chartJs.mod.ChartPluginsOptions
import typingsSlinky.chartJs.mod.ChartScales
import typingsSlinky.chartJs.mod.ChartSize
import typingsSlinky.chartJs.mod.ChartTitleOptions
import typingsSlinky.chartJs.mod.ChartTooltipOptions
import typingsSlinky.chartJs.mod.LinearScale
import typingsSlinky.chartJs.mod.LogarithmicScale
import typingsSlinky.chartJs.mod.RadialLinearScale
import typingsSlinky.chartJs.mod.TimeScale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Chart extends StObject {
    
    var chart: js.UndefOr[typingsSlinky.chartJs.mod.Chart] = js.native
    
    var dataIndex: js.UndefOr[Double] = js.native
    
    var dataset: js.UndefOr[ChartDataSets] = js.native
    
    var datasetIndex: js.UndefOr[Double] = js.native
  }
  object Chart {
    
    @scala.inline
    def apply(): Chart = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Chart]
    }
    
    @scala.inline
    implicit class ChartMutableBuilder[Self <: Chart] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChart(value: typingsSlinky.chartJs.mod.Chart): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChartUndefined: Self = StObject.set(x, "chart", js.undefined)
      
      @scala.inline
      def setDataIndex(value: Double): Self = StObject.set(x, "dataIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataIndexUndefined: Self = StObject.set(x, "dataIndex", js.undefined)
      
      @scala.inline
      def setDataset(value: ChartDataSets): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatasetIndex(value: Double): Self = StObject.set(x, "datasetIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatasetIndexUndefined: Self = StObject.set(x, "datasetIndex", js.undefined)
      
      @scala.inline
      def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
    }
  }
  
  /* Inlined chart.js.chart.js.ChartOptions & chart.js.chart.js.ChartFontOptions & {  tooltips :chart.js.chart.js.ChartTooltipOptions} */
  @js.native
  trait ChartOptionsChartFontOpti extends StObject {
    
    var animation: js.UndefOr[ChartAnimationOptions] = js.native
    
    var aspectRatio: js.UndefOr[Double] = js.native
    
    var circumference: js.UndefOr[Double] = js.native
    
    var cutoutPercentage: js.UndefOr[Double] = js.native
    
    var defaultColor: js.UndefOr[ChartColor] = js.native
    
    var defaultFontColor: js.UndefOr[ChartColor] = js.native
    
    var defaultFontFamily: js.UndefOr[String] = js.native
    
    var defaultFontSize: js.UndefOr[Double] = js.native
    
    var defaultFontStyle: js.UndefOr[String] = js.native
    
    var devicePixelRatio: js.UndefOr[Double] = js.native
    
    var elements: js.UndefOr[ChartElementsOptions] = js.native
    
    var events: js.UndefOr[js.Array[String]] = js.native
    
    var hover: js.UndefOr[ChartHoverOptions] = js.native
    
    var layout: js.UndefOr[ChartLayoutOptions] = js.native
    
    var legend: js.UndefOr[ChartLegendOptions] = js.native
    
    var legendCallback: js.UndefOr[js.Function1[/* chart */ typingsSlinky.chartJs.mod.Chart, String]] = js.native
    
    var maintainAspectRatio: js.UndefOr[Boolean] = js.native
    
    var onClick: js.UndefOr[
        js.Function2[
          /* event */ js.UndefOr[MouseEvent], 
          /* activeElements */ js.UndefOr[js.Array[js.Object]], 
          _
        ]
      ] = js.native
    
    var onHover: js.UndefOr[
        js.ThisFunction2[
          /* this */ typingsSlinky.chartJs.mod.Chart, 
          /* event */ MouseEvent, 
          /* activeElements */ js.Array[js.Object], 
          _
        ]
      ] = js.native
    
    var onResize: js.UndefOr[
        js.ThisFunction1[/* this */ typingsSlinky.chartJs.mod.Chart, /* newSize */ ChartSize, Unit]
      ] = js.native
    
    var plugins: js.UndefOr[ChartPluginsOptions] = js.native
    
    var responsive: js.UndefOr[Boolean] = js.native
    
    var responsiveAnimationDuration: js.UndefOr[Double] = js.native
    
    var rotation: js.UndefOr[Double] = js.native
    
    var scale: js.UndefOr[RadialLinearScale] = js.native
    
    var scales: js.UndefOr[ChartScales | LinearScale | LogarithmicScale | TimeScale] = js.native
    
    var showLines: js.UndefOr[Boolean] = js.native
    
    var spanGaps: js.UndefOr[Boolean] = js.native
    
    var title: js.UndefOr[ChartTitleOptions] = js.native
    
    var tooltips: js.UndefOr[ChartTooltipOptions] with ChartTooltipOptions = js.native
  }
  object ChartOptionsChartFontOpti {
    
    @scala.inline
    def apply(tooltips: js.UndefOr[ChartTooltipOptions] with ChartTooltipOptions): ChartOptionsChartFontOpti = {
      val __obj = js.Dynamic.literal(tooltips = tooltips.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChartOptionsChartFontOpti]
    }
    
    @scala.inline
    implicit class ChartOptionsChartFontOptiMutableBuilder[Self <: ChartOptionsChartFontOpti] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimation(value: ChartAnimationOptions): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setAspectRatio(value: Double): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
      
      @scala.inline
      def setCircumference(value: Double): Self = StObject.set(x, "circumference", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCircumferenceUndefined: Self = StObject.set(x, "circumference", js.undefined)
      
      @scala.inline
      def setCutoutPercentage(value: Double): Self = StObject.set(x, "cutoutPercentage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCutoutPercentageUndefined: Self = StObject.set(x, "cutoutPercentage", js.undefined)
      
      @scala.inline
      def setDefaultColor(value: ChartColor): Self = StObject.set(x, "defaultColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultColorCanvasGradient(value: CanvasGradient): Self = StObject.set(x, "defaultColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultColorCanvasPattern(value: CanvasPattern): Self = StObject.set(x, "defaultColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultColorUndefined: Self = StObject.set(x, "defaultColor", js.undefined)
      
      @scala.inline
      def setDefaultColorVarargs(value: String*): Self = StObject.set(x, "defaultColor", js.Array(value :_*))
      
      @scala.inline
      def setDefaultFontColor(value: ChartColor): Self = StObject.set(x, "defaultFontColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultFontColorCanvasGradient(value: CanvasGradient): Self = StObject.set(x, "defaultFontColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultFontColorCanvasPattern(value: CanvasPattern): Self = StObject.set(x, "defaultFontColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultFontColorUndefined: Self = StObject.set(x, "defaultFontColor", js.undefined)
      
      @scala.inline
      def setDefaultFontColorVarargs(value: String*): Self = StObject.set(x, "defaultFontColor", js.Array(value :_*))
      
      @scala.inline
      def setDefaultFontFamily(value: String): Self = StObject.set(x, "defaultFontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultFontFamilyUndefined: Self = StObject.set(x, "defaultFontFamily", js.undefined)
      
      @scala.inline
      def setDefaultFontSize(value: Double): Self = StObject.set(x, "defaultFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultFontSizeUndefined: Self = StObject.set(x, "defaultFontSize", js.undefined)
      
      @scala.inline
      def setDefaultFontStyle(value: String): Self = StObject.set(x, "defaultFontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultFontStyleUndefined: Self = StObject.set(x, "defaultFontStyle", js.undefined)
      
      @scala.inline
      def setDevicePixelRatio(value: Double): Self = StObject.set(x, "devicePixelRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevicePixelRatioUndefined: Self = StObject.set(x, "devicePixelRatio", js.undefined)
      
      @scala.inline
      def setElements(value: ChartElementsOptions): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
      
      @scala.inline
      def setEvents(value: js.Array[String]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      @scala.inline
      def setEventsVarargs(value: String*): Self = StObject.set(x, "events", js.Array(value :_*))
      
      @scala.inline
      def setHover(value: ChartHoverOptions): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
      
      @scala.inline
      def setLayout(value: ChartLayoutOptions): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      @scala.inline
      def setLegend(value: ChartLegendOptions): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegendCallback(value: /* chart */ typingsSlinky.chartJs.mod.Chart => String): Self = StObject.set(x, "legendCallback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLegendCallbackUndefined: Self = StObject.set(x, "legendCallback", js.undefined)
      
      @scala.inline
      def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
      
      @scala.inline
      def setMaintainAspectRatio(value: Boolean): Self = StObject.set(x, "maintainAspectRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaintainAspectRatioUndefined: Self = StObject.set(x, "maintainAspectRatio", js.undefined)
      
      @scala.inline
      def setOnClick(
        value: (/* event */ js.UndefOr[MouseEvent], /* activeElements */ js.UndefOr[js.Array[js.Object]]) => _
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnHover(
        value: js.ThisFunction2[
              /* this */ typingsSlinky.chartJs.mod.Chart, 
              /* event */ MouseEvent, 
              /* activeElements */ js.Array[js.Object], 
              _
            ]
      ): Self = StObject.set(x, "onHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnHoverUndefined: Self = StObject.set(x, "onHover", js.undefined)
      
      @scala.inline
      def setOnResize(value: js.ThisFunction1[/* this */ typingsSlinky.chartJs.mod.Chart, /* newSize */ ChartSize, Unit]): Self = StObject.set(x, "onResize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      @scala.inline
      def setPlugins(value: ChartPluginsOptions): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      @scala.inline
      def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsiveAnimationDuration(value: Double): Self = StObject.set(x, "responsiveAnimationDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsiveAnimationDurationUndefined: Self = StObject.set(x, "responsiveAnimationDuration", js.undefined)
      
      @scala.inline
      def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
      
      @scala.inline
      def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      @scala.inline
      def setScale(value: RadialLinearScale): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      @scala.inline
      def setScales(value: ChartScales | LinearScale | LogarithmicScale | TimeScale): Self = StObject.set(x, "scales", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScalesUndefined: Self = StObject.set(x, "scales", js.undefined)
      
      @scala.inline
      def setShowLines(value: Boolean): Self = StObject.set(x, "showLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowLinesUndefined: Self = StObject.set(x, "showLines", js.undefined)
      
      @scala.inline
      def setSpanGaps(value: Boolean): Self = StObject.set(x, "spanGaps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpanGapsUndefined: Self = StObject.set(x, "spanGaps", js.undefined)
      
      @scala.inline
      def setTitle(value: ChartTitleOptions): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTooltips(value: js.UndefOr[ChartTooltipOptions] with ChartTooltipOptions): Self = StObject.set(x, "tooltips", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ key in chart.js.chart.js.PositionType ]:? number} */
  @js.native
  trait keyinPositionTypenumber extends StObject {
    
    var bottom: js.UndefOr[Double] = js.native
    
    var chartArea: js.UndefOr[Double] = js.native
    
    var left: js.UndefOr[Double] = js.native
    
    var right: js.UndefOr[Double] = js.native
    
    var top: js.UndefOr[Double] = js.native
  }
  object keyinPositionTypenumber {
    
    @scala.inline
    def apply(): keyinPositionTypenumber = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[keyinPositionTypenumber]
    }
    
    @scala.inline
    implicit class keyinPositionTypenumberMutableBuilder[Self <: keyinPositionTypenumber] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setChartArea(value: Double): Self = StObject.set(x, "chartArea", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChartAreaUndefined: Self = StObject.set(x, "chartArea", js.undefined)
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
}
