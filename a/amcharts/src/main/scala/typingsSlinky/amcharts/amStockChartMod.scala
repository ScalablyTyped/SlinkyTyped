package typingsSlinky.amcharts

import typingsSlinky.amcharts.anon.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object amStockChartMod {
  
  @JSImport("amcharts/AmStockChart", JSImport.Default)
  @js.native
  class default () extends AmStockChart
  
  @js.native
  trait AmStockChart extends StObject {
    
    /**
      * Adds event listener.
      * @param type - One of
      * "buildStarted", "clickStockEvent", "dataUpdated", "init", "panelRemoved", "rendered", "rollOutStockEvent",
      * "rollOverStockEvent", "zoomed".
      * @param handler - The event handler.
      */
    def addListener(`type`: String, handler: js.Function1[/* e */ Date, Unit]): Unit = js.native
    
    /**
      * Adds panel to the stock chart. Requires stockChart.validateNow() method to be called after this action.
      */
    def addPanel(panel: typingsSlinky.amcharts.stockPanelMod.default): Unit = js.native
    
    /**
      * Adds panel to the stock chart at a specified index.
      * Requires stockChart.validateNow() method to be called after this action.
      */
    def addPanelAt(panel: typingsSlinky.amcharts.stockPanelMod.default, index: Double): Unit = js.native
    
    /**
      * Specifies if animation was already played.
      * Animation is only played once, when chart is rendered for the first time.
      * If you want the animation to be repeated, set this property to false.
      */
    var animationPlayed: Boolean = js.native
    
    /**
      * Balloon object.
      */
    var balloon: typingsSlinky.amcharts.amBalloonMod.default = js.native
    
    /**
      * Settings for category axes.
      */
    var categoryAxesSettings: typingsSlinky.amcharts.categoryAxesSettingsMod.default = js.native
    
    /**
      * Indicates if the chart is created.
      */
    var chartCreated: Boolean = js.native
    
    /**
      * Chart cursor settings.
      */
    var chartCursorSettings: typingsSlinky.amcharts.chartCursorSettingsMod.default = js.native
    
    /**
      * Chart scrollbar settings.
      */
    var chartScrollbarSettings: typingsSlinky.amcharts.chartScrollbarSettingsMod.default = js.native
    
    /**
      * Destroys chart, all timeouts and listeners.
      */
    def clear(): Unit = js.native
    
    /**
      * Array of colors used by data sets if no color was set explicitly on data set itself.
      * [
      * #FF6600, "#FCD202", "#B0DE09", "#0D8ECF", "#2A0CD0", "#CD0D74", "#CC0000",
      * "#00CC00", "#0000CC", "#DDDDDD", "#999999", "#333333", "#990000"
      * ]
      */
    var colors: js.Array[_] = js.native
    
    /**
      * Array of data sets selected for comparing.
      */
    var comparedDataSets: js.Array[_] = js.native
    
    /**
      * DataSetSelector object.
      * You can add it if you have more than one data set and want users to be able to select/compare them.
      */
    var dataSetSelector: typingsSlinky.amcharts.dataSetSelectorMod.default = js.native
    
    /**
      * Array of DataSets.
      */
    var dataSets: js.Array[_] = js.native
    
    /**
      * Current end date of the selected period, get only.
      * To set start/end dates, use stockChart.zoom(startDate, endDate) method.
      */
    var endDate: js.Date = js.native
    
    /**
      * Defines on which day week starts. 0 - Sunday, 1 - Monday..
      * @default 1
      */
    var firstDayOfWeek: Double = js.native
    
    /**
      * If set to true the scope of the data view will be set to the end after data update.
      */
    var glueToTheEnd: Boolean = js.native
    
    /**
      * Hides event bullets.
      */
    def hideStockEvents(): Unit = js.native
    
    /**
      * Legend settings.
      */
    var legendSettings: typingsSlinky.amcharts.legendSettingsMod.default = js.native
    
    /**
      * Data set selected as main.
      */
    var mainDataSet: typingsSlinky.amcharts.dataSetMod.default = js.native
    
    /**
      * Array of StockPanels (charts).
      */
    var panels: js.Array[_] = js.native
    
    /**
      * Settings for stock panels.
      */
    var panelsSettings: typingsSlinky.amcharts.panelSettingsMod.default = js.native
    
    /**
      * Period selector object.
      * You can add it if you want user's to be able to enter date ranges or
      * zoom chart with predefined period buttons.
      */
    var periodSelector: typingsSlinky.amcharts.periodSelectorMod.default = js.native
    
    /**
      * Removes event listener from chart object.
      */
    def removeListener(chart: typingsSlinky.amcharts.amChartMod.default, `type`: String, handler: js.Any): Unit = js.native
    
    /**
      * Removes panel from the stock chart. Requires stockChart.validateNow() method to be called after this action.
      */
    def removePanel(panel: typingsSlinky.amcharts.stockPanelMod.default): Unit = js.native
    
    /**
      * Scrollbar's chart object, get only.
      */
    var scrollbarChart: typingsSlinky.amcharts.amSerialChartMod.default = js.native
    
    /**
      * Shows event bullets.
      */
    def showStockEvents(): Unit = js.native
    
    /**
      * Current start date of the selected period, get only.
      * To set start/end dates, use stockChart.zoom(startDate, endDate) method.
      */
    var startDate: js.Date = js.native
    
    /**
      * Settings for stock events.
      */
    var stockEventsSettings: js.Any = js.native
    
    /**
      * Method which should be called after data was changed.
      */
    def validateData(): Unit = js.native
    
    /**
      * Method which forces the stock chart to rebuild. Should be called after properties are changed.
      */
    def validateNow(): Unit = js.native
    
    /**
      * Settings for value axes.
      */
    var valueAxesSettings: typingsSlinky.amcharts.valueAxesSettingsMod.default = js.native
    
    /**
      * read-only. Indicates current version of a script.
      */
    var version: String = js.native
    
    /**
      * Zooms chart to specified dates. startDate, endDate - Date objects.
      */
    def zoom(startDate: js.Date, endDate: js.Date): Unit = js.native
    
    /**
      * Zooms out the chart.
      */
    def zoomOut(): Unit = js.native
    
    /**
      * Specifies whether the chart should zoom-out when main data set is changed.
      */
    var zoomOutOnDataSetChange: Boolean = js.native
  }
  object AmStockChart {
    
    @scala.inline
    def apply(
      addListener: (String, js.Function1[/* e */ Date, Unit]) => Unit,
      addPanel: typingsSlinky.amcharts.stockPanelMod.default => Unit,
      addPanelAt: (typingsSlinky.amcharts.stockPanelMod.default, Double) => Unit,
      animationPlayed: Boolean,
      balloon: typingsSlinky.amcharts.amBalloonMod.default,
      categoryAxesSettings: typingsSlinky.amcharts.categoryAxesSettingsMod.default,
      chartCreated: Boolean,
      chartCursorSettings: typingsSlinky.amcharts.chartCursorSettingsMod.default,
      chartScrollbarSettings: typingsSlinky.amcharts.chartScrollbarSettingsMod.default,
      clear: () => Unit,
      colors: js.Array[_],
      comparedDataSets: js.Array[_],
      dataSetSelector: typingsSlinky.amcharts.dataSetSelectorMod.default,
      dataSets: js.Array[_],
      endDate: js.Date,
      firstDayOfWeek: Double,
      glueToTheEnd: Boolean,
      hideStockEvents: () => Unit,
      legendSettings: typingsSlinky.amcharts.legendSettingsMod.default,
      mainDataSet: typingsSlinky.amcharts.dataSetMod.default,
      panels: js.Array[_],
      panelsSettings: typingsSlinky.amcharts.panelSettingsMod.default,
      periodSelector: typingsSlinky.amcharts.periodSelectorMod.default,
      removeListener: (typingsSlinky.amcharts.amChartMod.default, String, js.Any) => Unit,
      removePanel: typingsSlinky.amcharts.stockPanelMod.default => Unit,
      scrollbarChart: typingsSlinky.amcharts.amSerialChartMod.default,
      showStockEvents: () => Unit,
      startDate: js.Date,
      stockEventsSettings: js.Any,
      validateData: () => Unit,
      validateNow: () => Unit,
      valueAxesSettings: typingsSlinky.amcharts.valueAxesSettingsMod.default,
      version: String,
      zoom: (js.Date, js.Date) => Unit,
      zoomOut: () => Unit,
      zoomOutOnDataSetChange: Boolean
    ): AmStockChart = {
      val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), addPanel = js.Any.fromFunction1(addPanel), addPanelAt = js.Any.fromFunction2(addPanelAt), animationPlayed = animationPlayed.asInstanceOf[js.Any], balloon = balloon.asInstanceOf[js.Any], categoryAxesSettings = categoryAxesSettings.asInstanceOf[js.Any], chartCreated = chartCreated.asInstanceOf[js.Any], chartCursorSettings = chartCursorSettings.asInstanceOf[js.Any], chartScrollbarSettings = chartScrollbarSettings.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), colors = colors.asInstanceOf[js.Any], comparedDataSets = comparedDataSets.asInstanceOf[js.Any], dataSetSelector = dataSetSelector.asInstanceOf[js.Any], dataSets = dataSets.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], firstDayOfWeek = firstDayOfWeek.asInstanceOf[js.Any], glueToTheEnd = glueToTheEnd.asInstanceOf[js.Any], hideStockEvents = js.Any.fromFunction0(hideStockEvents), legendSettings = legendSettings.asInstanceOf[js.Any], mainDataSet = mainDataSet.asInstanceOf[js.Any], panels = panels.asInstanceOf[js.Any], panelsSettings = panelsSettings.asInstanceOf[js.Any], periodSelector = periodSelector.asInstanceOf[js.Any], removeListener = js.Any.fromFunction3(removeListener), removePanel = js.Any.fromFunction1(removePanel), scrollbarChart = scrollbarChart.asInstanceOf[js.Any], showStockEvents = js.Any.fromFunction0(showStockEvents), startDate = startDate.asInstanceOf[js.Any], stockEventsSettings = stockEventsSettings.asInstanceOf[js.Any], validateData = js.Any.fromFunction0(validateData), validateNow = js.Any.fromFunction0(validateNow), valueAxesSettings = valueAxesSettings.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], zoom = js.Any.fromFunction2(zoom), zoomOut = js.Any.fromFunction0(zoomOut), zoomOutOnDataSetChange = zoomOutOnDataSetChange.asInstanceOf[js.Any])
      __obj.asInstanceOf[AmStockChart]
    }
    
    @scala.inline
    implicit class AmStockChartMutableBuilder[Self <: AmStockChart] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddListener(value: (String, js.Function1[/* e */ Date, Unit]) => Unit): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAddPanel(value: typingsSlinky.amcharts.stockPanelMod.default => Unit): Self = StObject.set(x, "addPanel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddPanelAt(value: (typingsSlinky.amcharts.stockPanelMod.default, Double) => Unit): Self = StObject.set(x, "addPanelAt", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAnimationPlayed(value: Boolean): Self = StObject.set(x, "animationPlayed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBalloon(value: typingsSlinky.amcharts.amBalloonMod.default): Self = StObject.set(x, "balloon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategoryAxesSettings(value: typingsSlinky.amcharts.categoryAxesSettingsMod.default): Self = StObject.set(x, "categoryAxesSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChartCreated(value: Boolean): Self = StObject.set(x, "chartCreated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChartCursorSettings(value: typingsSlinky.amcharts.chartCursorSettingsMod.default): Self = StObject.set(x, "chartCursorSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChartScrollbarSettings(value: typingsSlinky.amcharts.chartScrollbarSettingsMod.default): Self = StObject.set(x, "chartScrollbarSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setColors(value: js.Array[_]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorsVarargs(value: js.Any*): Self = StObject.set(x, "colors", js.Array(value :_*))
      
      @scala.inline
      def setComparedDataSets(value: js.Array[_]): Self = StObject.set(x, "comparedDataSets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComparedDataSetsVarargs(value: js.Any*): Self = StObject.set(x, "comparedDataSets", js.Array(value :_*))
      
      @scala.inline
      def setDataSetSelector(value: typingsSlinky.amcharts.dataSetSelectorMod.default): Self = StObject.set(x, "dataSetSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataSets(value: js.Array[_]): Self = StObject.set(x, "dataSets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataSetsVarargs(value: js.Any*): Self = StObject.set(x, "dataSets", js.Array(value :_*))
      
      @scala.inline
      def setEndDate(value: js.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstDayOfWeek(value: Double): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlueToTheEnd(value: Boolean): Self = StObject.set(x, "glueToTheEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideStockEvents(value: () => Unit): Self = StObject.set(x, "hideStockEvents", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLegendSettings(value: typingsSlinky.amcharts.legendSettingsMod.default): Self = StObject.set(x, "legendSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMainDataSet(value: typingsSlinky.amcharts.dataSetMod.default): Self = StObject.set(x, "mainDataSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanels(value: js.Array[_]): Self = StObject.set(x, "panels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanelsSettings(value: typingsSlinky.amcharts.panelSettingsMod.default): Self = StObject.set(x, "panelsSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanelsVarargs(value: js.Any*): Self = StObject.set(x, "panels", js.Array(value :_*))
      
      @scala.inline
      def setPeriodSelector(value: typingsSlinky.amcharts.periodSelectorMod.default): Self = StObject.set(x, "periodSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveListener(value: (typingsSlinky.amcharts.amChartMod.default, String, js.Any) => Unit): Self = StObject.set(x, "removeListener", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRemovePanel(value: typingsSlinky.amcharts.stockPanelMod.default => Unit): Self = StObject.set(x, "removePanel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setScrollbarChart(value: typingsSlinky.amcharts.amSerialChartMod.default): Self = StObject.set(x, "scrollbarChart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowStockEvents(value: () => Unit): Self = StObject.set(x, "showStockEvents", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStartDate(value: js.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStockEventsSettings(value: js.Any): Self = StObject.set(x, "stockEventsSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateData(value: () => Unit): Self = StObject.set(x, "validateData", js.Any.fromFunction0(value))
      
      @scala.inline
      def setValidateNow(value: () => Unit): Self = StObject.set(x, "validateNow", js.Any.fromFunction0(value))
      
      @scala.inline
      def setValueAxesSettings(value: typingsSlinky.amcharts.valueAxesSettingsMod.default): Self = StObject.set(x, "valueAxesSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoom(value: (js.Date, js.Date) => Unit): Self = StObject.set(x, "zoom", js.Any.fromFunction2(value))
      
      @scala.inline
      def setZoomOut(value: () => Unit): Self = StObject.set(x, "zoomOut", js.Any.fromFunction0(value))
      
      @scala.inline
      def setZoomOutOnDataSetChange(value: Boolean): Self = StObject.set(x, "zoomOutOnDataSetChange", value.asInstanceOf[js.Any])
    }
  }
}
