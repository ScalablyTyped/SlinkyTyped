package typingsSlinky.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SparklineOptions extends StObject {
  
  var autoBind: js.UndefOr[Boolean] = js.native
  
  var axisDefaults: js.UndefOr[js.Any] = js.native
  
  var axisLabelClick: js.UndefOr[js.Function1[/* e */ SparklineAxisLabelClickEvent, Unit]] = js.native
  
  var categoryAxis: js.UndefOr[SparklineCategoryAxisItem | js.Array[SparklineCategoryAxisItem]] = js.native
  
  var chartArea: js.UndefOr[SparklineChartArea] = js.native
  
  var data: js.UndefOr[js.Any] = js.native
  
  var dataBound: js.UndefOr[js.Function1[/* e */ SparklineEvent, Unit]] = js.native
  
  var dataSource: js.UndefOr[js.Any] = js.native
  
  var drag: js.UndefOr[js.Function1[/* e */ SparklineDragEvent, Unit]] = js.native
  
  var dragEnd: js.UndefOr[js.Function1[/* e */ SparklineDragEndEvent, Unit]] = js.native
  
  var dragStart: js.UndefOr[js.Function1[/* e */ SparklineDragStartEvent, Unit]] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var paneRender: js.UndefOr[js.Function1[/* e */ SparklinePaneRenderEvent, Unit]] = js.native
  
  var plotArea: js.UndefOr[SparklinePlotArea] = js.native
  
  var plotAreaClick: js.UndefOr[js.Function1[/* e */ SparklinePlotAreaClickEvent, Unit]] = js.native
  
  var plotAreaHover: js.UndefOr[js.Function1[/* e */ SparklinePlotAreaHoverEvent, Unit]] = js.native
  
  var plotAreaLeave: js.UndefOr[js.Function1[/* e */ SparklinePlotAreaLeaveEvent, Unit]] = js.native
  
  var pointWidth: js.UndefOr[Double] = js.native
  
  var renderAs: js.UndefOr[String] = js.native
  
  var series: js.UndefOr[js.Array[SparklineSeriesItem]] = js.native
  
  var seriesClick: js.UndefOr[js.Function1[/* e */ SparklineSeriesClickEvent, Unit]] = js.native
  
  var seriesColors: js.UndefOr[js.Any] = js.native
  
  var seriesDefaults: js.UndefOr[SparklineSeriesDefaults] = js.native
  
  var seriesHover: js.UndefOr[js.Function1[/* e */ SparklineSeriesHoverEvent, Unit]] = js.native
  
  var seriesLeave: js.UndefOr[js.Function1[/* e */ SparklineSeriesLeaveEvent, Unit]] = js.native
  
  var seriesOver: js.UndefOr[js.Function1[/* e */ SparklineSeriesOverEvent, Unit]] = js.native
  
  var theme: js.UndefOr[String] = js.native
  
  var tooltip: js.UndefOr[SparklineTooltip] = js.native
  
  var transitions: js.UndefOr[Boolean] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var valueAxis: js.UndefOr[SparklineValueAxisItem | js.Array[SparklineValueAxisItem]] = js.native
  
  var zoom: js.UndefOr[js.Function1[/* e */ SparklineZoomEvent, Unit]] = js.native
  
  var zoomEnd: js.UndefOr[js.Function1[/* e */ SparklineZoomEndEvent, Unit]] = js.native
  
  var zoomStart: js.UndefOr[js.Function1[/* e */ SparklineZoomStartEvent, Unit]] = js.native
}
object SparklineOptions {
  
  @scala.inline
  def apply(): SparklineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparklineOptions]
  }
  
  @scala.inline
  implicit class SparklineOptionsMutableBuilder[Self <: SparklineOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoBind(value: Boolean): Self = StObject.set(x, "autoBind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoBindUndefined: Self = StObject.set(x, "autoBind", js.undefined)
    
    @scala.inline
    def setAxisDefaults(value: js.Any): Self = StObject.set(x, "axisDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisDefaultsUndefined: Self = StObject.set(x, "axisDefaults", js.undefined)
    
    @scala.inline
    def setAxisLabelClick(value: /* e */ SparklineAxisLabelClickEvent => Unit): Self = StObject.set(x, "axisLabelClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAxisLabelClickUndefined: Self = StObject.set(x, "axisLabelClick", js.undefined)
    
    @scala.inline
    def setCategoryAxis(value: SparklineCategoryAxisItem | js.Array[SparklineCategoryAxisItem]): Self = StObject.set(x, "categoryAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryAxisUndefined: Self = StObject.set(x, "categoryAxis", js.undefined)
    
    @scala.inline
    def setCategoryAxisVarargs(value: SparklineCategoryAxisItem*): Self = StObject.set(x, "categoryAxis", js.Array(value :_*))
    
    @scala.inline
    def setChartArea(value: SparklineChartArea): Self = StObject.set(x, "chartArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartAreaUndefined: Self = StObject.set(x, "chartArea", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataBound(value: /* e */ SparklineEvent => Unit): Self = StObject.set(x, "dataBound", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDataBoundUndefined: Self = StObject.set(x, "dataBound", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDrag(value: /* e */ SparklineDragEvent => Unit): Self = StObject.set(x, "drag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDragEnd(value: /* e */ SparklineDragEndEvent => Unit): Self = StObject.set(x, "dragEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDragEndUndefined: Self = StObject.set(x, "dragEnd", js.undefined)
    
    @scala.inline
    def setDragStart(value: /* e */ SparklineDragStartEvent => Unit): Self = StObject.set(x, "dragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDragStartUndefined: Self = StObject.set(x, "dragStart", js.undefined)
    
    @scala.inline
    def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPaneRender(value: /* e */ SparklinePaneRenderEvent => Unit): Self = StObject.set(x, "paneRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPaneRenderUndefined: Self = StObject.set(x, "paneRender", js.undefined)
    
    @scala.inline
    def setPlotArea(value: SparklinePlotArea): Self = StObject.set(x, "plotArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlotAreaClick(value: /* e */ SparklinePlotAreaClickEvent => Unit): Self = StObject.set(x, "plotAreaClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPlotAreaClickUndefined: Self = StObject.set(x, "plotAreaClick", js.undefined)
    
    @scala.inline
    def setPlotAreaHover(value: /* e */ SparklinePlotAreaHoverEvent => Unit): Self = StObject.set(x, "plotAreaHover", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPlotAreaHoverUndefined: Self = StObject.set(x, "plotAreaHover", js.undefined)
    
    @scala.inline
    def setPlotAreaLeave(value: /* e */ SparklinePlotAreaLeaveEvent => Unit): Self = StObject.set(x, "plotAreaLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPlotAreaLeaveUndefined: Self = StObject.set(x, "plotAreaLeave", js.undefined)
    
    @scala.inline
    def setPlotAreaUndefined: Self = StObject.set(x, "plotArea", js.undefined)
    
    @scala.inline
    def setPointWidth(value: Double): Self = StObject.set(x, "pointWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointWidthUndefined: Self = StObject.set(x, "pointWidth", js.undefined)
    
    @scala.inline
    def setRenderAs(value: String): Self = StObject.set(x, "renderAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderAsUndefined: Self = StObject.set(x, "renderAs", js.undefined)
    
    @scala.inline
    def setSeries(value: js.Array[SparklineSeriesItem]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesClick(value: /* e */ SparklineSeriesClickEvent => Unit): Self = StObject.set(x, "seriesClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSeriesClickUndefined: Self = StObject.set(x, "seriesClick", js.undefined)
    
    @scala.inline
    def setSeriesColors(value: js.Any): Self = StObject.set(x, "seriesColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesColorsUndefined: Self = StObject.set(x, "seriesColors", js.undefined)
    
    @scala.inline
    def setSeriesDefaults(value: SparklineSeriesDefaults): Self = StObject.set(x, "seriesDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesDefaultsUndefined: Self = StObject.set(x, "seriesDefaults", js.undefined)
    
    @scala.inline
    def setSeriesHover(value: /* e */ SparklineSeriesHoverEvent => Unit): Self = StObject.set(x, "seriesHover", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSeriesHoverUndefined: Self = StObject.set(x, "seriesHover", js.undefined)
    
    @scala.inline
    def setSeriesLeave(value: /* e */ SparklineSeriesLeaveEvent => Unit): Self = StObject.set(x, "seriesLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSeriesLeaveUndefined: Self = StObject.set(x, "seriesLeave", js.undefined)
    
    @scala.inline
    def setSeriesOver(value: /* e */ SparklineSeriesOverEvent => Unit): Self = StObject.set(x, "seriesOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSeriesOverUndefined: Self = StObject.set(x, "seriesOver", js.undefined)
    
    @scala.inline
    def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    @scala.inline
    def setSeriesVarargs(value: SparklineSeriesItem*): Self = StObject.set(x, "series", js.Array(value :_*))
    
    @scala.inline
    def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    @scala.inline
    def setTooltip(value: SparklineTooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    @scala.inline
    def setTransitions(value: Boolean): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionsUndefined: Self = StObject.set(x, "transitions", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValueAxis(value: SparklineValueAxisItem | js.Array[SparklineValueAxisItem]): Self = StObject.set(x, "valueAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueAxisUndefined: Self = StObject.set(x, "valueAxis", js.undefined)
    
    @scala.inline
    def setValueAxisVarargs(value: SparklineValueAxisItem*): Self = StObject.set(x, "valueAxis", js.Array(value :_*))
    
    @scala.inline
    def setZoom(value: /* e */ SparklineZoomEvent => Unit): Self = StObject.set(x, "zoom", js.Any.fromFunction1(value))
    
    @scala.inline
    def setZoomEnd(value: /* e */ SparklineZoomEndEvent => Unit): Self = StObject.set(x, "zoomEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setZoomEndUndefined: Self = StObject.set(x, "zoomEnd", js.undefined)
    
    @scala.inline
    def setZoomStart(value: /* e */ SparklineZoomStartEvent => Unit): Self = StObject.set(x, "zoomStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setZoomStartUndefined: Self = StObject.set(x, "zoomStart", js.undefined)
    
    @scala.inline
    def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
