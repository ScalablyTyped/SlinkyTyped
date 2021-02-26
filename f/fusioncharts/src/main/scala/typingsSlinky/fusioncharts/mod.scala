package typingsSlinky.fusioncharts

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.Element
import typingsSlinky.std.JSON
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("fusioncharts", JSImport.Namespace)
  @js.native
  class ^ protected () extends FusionCharts {
    def this(chartObject: js.Object) = this()
    def this(chartObject: ChartObject) = this()
  }
  @JSImport("fusioncharts", JSImport.Namespace)
  @js.native
  val ^ : FusionChartStatic = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.fusioncharts.fusionchartsStrings.json
    - typingsSlinky.fusioncharts.fusionchartsStrings.jsonurl
    - typingsSlinky.fusioncharts.fusionchartsStrings.csv
    - typingsSlinky.fusioncharts.fusionchartsStrings.xml
    - typingsSlinky.fusioncharts.fusionchartsStrings.xmlurl
  */
  trait ChartDataFormats extends StObject
  object ChartDataFormats {
    
    @scala.inline
    def csv: typingsSlinky.fusioncharts.fusionchartsStrings.csv = "csv".asInstanceOf[typingsSlinky.fusioncharts.fusionchartsStrings.csv]
    
    @scala.inline
    def json: typingsSlinky.fusioncharts.fusionchartsStrings.json = "json".asInstanceOf[typingsSlinky.fusioncharts.fusionchartsStrings.json]
    
    @scala.inline
    def jsonurl: typingsSlinky.fusioncharts.fusionchartsStrings.jsonurl = "jsonurl".asInstanceOf[typingsSlinky.fusioncharts.fusionchartsStrings.jsonurl]
    
    @scala.inline
    def xml: typingsSlinky.fusioncharts.fusionchartsStrings.xml = "xml".asInstanceOf[typingsSlinky.fusioncharts.fusionchartsStrings.xml]
    
    @scala.inline
    def xmlurl: typingsSlinky.fusioncharts.fusionchartsStrings.xmlurl = "xmlurl".asInstanceOf[typingsSlinky.fusioncharts.fusionchartsStrings.xmlurl]
  }
  
  @js.native
  trait ChartObject extends StObject {
    
    var baseChartMessageColor: js.UndefOr[String] = js.native
    
    var baseChartMessageFont: js.UndefOr[String] = js.native
    
    var baseChartMessageFontSize: js.UndefOr[String] = js.native
    
    var baseChartMessageImageHAlign: js.UndefOr[ImageHAlign] = js.native
    
    var containerBackgroundColor: js.UndefOr[String] = js.native
    
    var containerBackgroundOpacity: js.UndefOr[Double] = js.native
    
    var containerClassName: js.UndefOr[String] = js.native
    
    var dataEmptyMessage: js.UndefOr[String] = js.native
    
    var dataEmptyMessageImageAlpha: js.UndefOr[Double] = js.native
    
    var dataEmptyMessageImageHAlign: js.UndefOr[ImageHAlign] = js.native
    
    var dataEmptyMessageImageScale: js.UndefOr[Double] = js.native
    
    var dataEmptyMessageImageVAlign: js.UndefOr[ImageVAlign] = js.native
    
    var dataFormat: js.UndefOr[ChartDataFormats] = js.native
    
    var dataInvalidMessage: js.UndefOr[String] = js.native
    
    var dataInvalidMessageImageAlpha: js.UndefOr[Double] = js.native
    
    var dataInvalidMessageImageHAlign: js.UndefOr[ImageHAlign] = js.native
    
    var dataInvalidMessageImageScale: js.UndefOr[Double] = js.native
    
    var dataInvalidMessageImageVAlign: js.UndefOr[ImageVAlign] = js.native
    
    var dataLoadErrorMessage: js.UndefOr[String] = js.native
    
    var dataLoadErrorMessageImageAlpha: js.UndefOr[Double] = js.native
    
    var dataLoadErrorMessageImageScale: js.UndefOr[Double] = js.native
    
    var dataLoadErrorMessageImageVAlign: js.UndefOr[ImageVAlign] = js.native
    
    var dataLoadStartMessage: js.UndefOr[String] = js.native
    
    var dataLoadStartMessageImageAlpha: js.UndefOr[Double] = js.native
    
    var dataLoadStartMessageImageHAlign: js.UndefOr[ImageHAlign] = js.native
    
    var dataLoadStartMessageImageScale: js.UndefOr[Double] = js.native
    
    var dataLoadStartMessageImageVAlign: js.UndefOr[ImageVAlign] = js.native
    
    var dataSource: js.UndefOr[String | js.Object] = js.native
    
    var events: js.UndefOr[js.Object] = js.native
    
    var height: js.UndefOr[Double | String] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var link: js.UndefOr[js.Object] = js.native
    
    var loadMessage: js.UndefOr[String] = js.native
    
    var loadMessageImageAlpha: js.UndefOr[Double] = js.native
    
    var loadMessageImageHAlign: js.UndefOr[ImageHAlign] = js.native
    
    var loadMessageImageScale: js.UndefOr[Double] = js.native
    
    var loadMessageImageVAlign: js.UndefOr[ImageVAlign] = js.native
    
    var renderAt: js.UndefOr[String] = js.native
    
    var renderErrorMessage: js.UndefOr[String] = js.native
    
    var renderErrorMessageImageAlpha: js.UndefOr[Double] = js.native
    
    var renderErrorMessageImageHAlign: js.UndefOr[ImageHAlign] = js.native
    
    var renderErrorMessageImageScale: js.UndefOr[Double] = js.native
    
    var renderErrorMessageImageVAlign: js.UndefOr[ImageVAlign] = js.native
    
    var showChartLoadingMessage: js.UndefOr[Boolean] = js.native
    
    var showDataLoadingMessage: js.UndefOr[Boolean] = js.native
    
    var `type`: js.UndefOr[String] = js.native
    
    var typeNotSupportedMessage: js.UndefOr[String] = js.native
    
    var width: js.UndefOr[Double | String] = js.native
  }
  object ChartObject {
    
    @scala.inline
    def apply(): ChartObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChartObject]
    }
    
    @scala.inline
    implicit class ChartObjectMutableBuilder[Self <: ChartObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseChartMessageColor(value: String): Self = StObject.set(x, "baseChartMessageColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseChartMessageColorUndefined: Self = StObject.set(x, "baseChartMessageColor", js.undefined)
      
      @scala.inline
      def setBaseChartMessageFont(value: String): Self = StObject.set(x, "baseChartMessageFont", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseChartMessageFontSize(value: String): Self = StObject.set(x, "baseChartMessageFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseChartMessageFontSizeUndefined: Self = StObject.set(x, "baseChartMessageFontSize", js.undefined)
      
      @scala.inline
      def setBaseChartMessageFontUndefined: Self = StObject.set(x, "baseChartMessageFont", js.undefined)
      
      @scala.inline
      def setBaseChartMessageImageHAlign(value: ImageHAlign): Self = StObject.set(x, "baseChartMessageImageHAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseChartMessageImageHAlignUndefined: Self = StObject.set(x, "baseChartMessageImageHAlign", js.undefined)
      
      @scala.inline
      def setContainerBackgroundColor(value: String): Self = StObject.set(x, "containerBackgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerBackgroundColorUndefined: Self = StObject.set(x, "containerBackgroundColor", js.undefined)
      
      @scala.inline
      def setContainerBackgroundOpacity(value: Double): Self = StObject.set(x, "containerBackgroundOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerBackgroundOpacityUndefined: Self = StObject.set(x, "containerBackgroundOpacity", js.undefined)
      
      @scala.inline
      def setContainerClassName(value: String): Self = StObject.set(x, "containerClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerClassNameUndefined: Self = StObject.set(x, "containerClassName", js.undefined)
      
      @scala.inline
      def setDataEmptyMessage(value: String): Self = StObject.set(x, "dataEmptyMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataEmptyMessageImageAlpha(value: Double): Self = StObject.set(x, "dataEmptyMessageImageAlpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataEmptyMessageImageAlphaUndefined: Self = StObject.set(x, "dataEmptyMessageImageAlpha", js.undefined)
      
      @scala.inline
      def setDataEmptyMessageImageHAlign(value: ImageHAlign): Self = StObject.set(x, "dataEmptyMessageImageHAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataEmptyMessageImageHAlignUndefined: Self = StObject.set(x, "dataEmptyMessageImageHAlign", js.undefined)
      
      @scala.inline
      def setDataEmptyMessageImageScale(value: Double): Self = StObject.set(x, "dataEmptyMessageImageScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataEmptyMessageImageScaleUndefined: Self = StObject.set(x, "dataEmptyMessageImageScale", js.undefined)
      
      @scala.inline
      def setDataEmptyMessageImageVAlign(value: ImageVAlign): Self = StObject.set(x, "dataEmptyMessageImageVAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataEmptyMessageImageVAlignUndefined: Self = StObject.set(x, "dataEmptyMessageImageVAlign", js.undefined)
      
      @scala.inline
      def setDataEmptyMessageUndefined: Self = StObject.set(x, "dataEmptyMessage", js.undefined)
      
      @scala.inline
      def setDataFormat(value: ChartDataFormats): Self = StObject.set(x, "dataFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataFormatUndefined: Self = StObject.set(x, "dataFormat", js.undefined)
      
      @scala.inline
      def setDataInvalidMessage(value: String): Self = StObject.set(x, "dataInvalidMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataInvalidMessageImageAlpha(value: Double): Self = StObject.set(x, "dataInvalidMessageImageAlpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataInvalidMessageImageAlphaUndefined: Self = StObject.set(x, "dataInvalidMessageImageAlpha", js.undefined)
      
      @scala.inline
      def setDataInvalidMessageImageHAlign(value: ImageHAlign): Self = StObject.set(x, "dataInvalidMessageImageHAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataInvalidMessageImageHAlignUndefined: Self = StObject.set(x, "dataInvalidMessageImageHAlign", js.undefined)
      
      @scala.inline
      def setDataInvalidMessageImageScale(value: Double): Self = StObject.set(x, "dataInvalidMessageImageScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataInvalidMessageImageScaleUndefined: Self = StObject.set(x, "dataInvalidMessageImageScale", js.undefined)
      
      @scala.inline
      def setDataInvalidMessageImageVAlign(value: ImageVAlign): Self = StObject.set(x, "dataInvalidMessageImageVAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataInvalidMessageImageVAlignUndefined: Self = StObject.set(x, "dataInvalidMessageImageVAlign", js.undefined)
      
      @scala.inline
      def setDataInvalidMessageUndefined: Self = StObject.set(x, "dataInvalidMessage", js.undefined)
      
      @scala.inline
      def setDataLoadErrorMessage(value: String): Self = StObject.set(x, "dataLoadErrorMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataLoadErrorMessageImageAlpha(value: Double): Self = StObject.set(x, "dataLoadErrorMessageImageAlpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataLoadErrorMessageImageAlphaUndefined: Self = StObject.set(x, "dataLoadErrorMessageImageAlpha", js.undefined)
      
      @scala.inline
      def setDataLoadErrorMessageImageScale(value: Double): Self = StObject.set(x, "dataLoadErrorMessageImageScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataLoadErrorMessageImageScaleUndefined: Self = StObject.set(x, "dataLoadErrorMessageImageScale", js.undefined)
      
      @scala.inline
      def setDataLoadErrorMessageImageVAlign(value: ImageVAlign): Self = StObject.set(x, "dataLoadErrorMessageImageVAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataLoadErrorMessageImageVAlignUndefined: Self = StObject.set(x, "dataLoadErrorMessageImageVAlign", js.undefined)
      
      @scala.inline
      def setDataLoadErrorMessageUndefined: Self = StObject.set(x, "dataLoadErrorMessage", js.undefined)
      
      @scala.inline
      def setDataLoadStartMessage(value: String): Self = StObject.set(x, "dataLoadStartMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataLoadStartMessageImageAlpha(value: Double): Self = StObject.set(x, "dataLoadStartMessageImageAlpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataLoadStartMessageImageAlphaUndefined: Self = StObject.set(x, "dataLoadStartMessageImageAlpha", js.undefined)
      
      @scala.inline
      def setDataLoadStartMessageImageHAlign(value: ImageHAlign): Self = StObject.set(x, "dataLoadStartMessageImageHAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataLoadStartMessageImageHAlignUndefined: Self = StObject.set(x, "dataLoadStartMessageImageHAlign", js.undefined)
      
      @scala.inline
      def setDataLoadStartMessageImageScale(value: Double): Self = StObject.set(x, "dataLoadStartMessageImageScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataLoadStartMessageImageScaleUndefined: Self = StObject.set(x, "dataLoadStartMessageImageScale", js.undefined)
      
      @scala.inline
      def setDataLoadStartMessageImageVAlign(value: ImageVAlign): Self = StObject.set(x, "dataLoadStartMessageImageVAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataLoadStartMessageImageVAlignUndefined: Self = StObject.set(x, "dataLoadStartMessageImageVAlign", js.undefined)
      
      @scala.inline
      def setDataLoadStartMessageUndefined: Self = StObject.set(x, "dataLoadStartMessage", js.undefined)
      
      @scala.inline
      def setDataSource(value: String | js.Object): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      @scala.inline
      def setEvents(value: js.Object): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      @scala.inline
      def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setLink(value: js.Object): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      @scala.inline
      def setLoadMessage(value: String): Self = StObject.set(x, "loadMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadMessageImageAlpha(value: Double): Self = StObject.set(x, "loadMessageImageAlpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadMessageImageAlphaUndefined: Self = StObject.set(x, "loadMessageImageAlpha", js.undefined)
      
      @scala.inline
      def setLoadMessageImageHAlign(value: ImageHAlign): Self = StObject.set(x, "loadMessageImageHAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadMessageImageHAlignUndefined: Self = StObject.set(x, "loadMessageImageHAlign", js.undefined)
      
      @scala.inline
      def setLoadMessageImageScale(value: Double): Self = StObject.set(x, "loadMessageImageScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadMessageImageScaleUndefined: Self = StObject.set(x, "loadMessageImageScale", js.undefined)
      
      @scala.inline
      def setLoadMessageImageVAlign(value: ImageVAlign): Self = StObject.set(x, "loadMessageImageVAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadMessageImageVAlignUndefined: Self = StObject.set(x, "loadMessageImageVAlign", js.undefined)
      
      @scala.inline
      def setLoadMessageUndefined: Self = StObject.set(x, "loadMessage", js.undefined)
      
      @scala.inline
      def setRenderAt(value: String): Self = StObject.set(x, "renderAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderAtUndefined: Self = StObject.set(x, "renderAt", js.undefined)
      
      @scala.inline
      def setRenderErrorMessage(value: String): Self = StObject.set(x, "renderErrorMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderErrorMessageImageAlpha(value: Double): Self = StObject.set(x, "renderErrorMessageImageAlpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderErrorMessageImageAlphaUndefined: Self = StObject.set(x, "renderErrorMessageImageAlpha", js.undefined)
      
      @scala.inline
      def setRenderErrorMessageImageHAlign(value: ImageHAlign): Self = StObject.set(x, "renderErrorMessageImageHAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderErrorMessageImageHAlignUndefined: Self = StObject.set(x, "renderErrorMessageImageHAlign", js.undefined)
      
      @scala.inline
      def setRenderErrorMessageImageScale(value: Double): Self = StObject.set(x, "renderErrorMessageImageScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderErrorMessageImageScaleUndefined: Self = StObject.set(x, "renderErrorMessageImageScale", js.undefined)
      
      @scala.inline
      def setRenderErrorMessageImageVAlign(value: ImageVAlign): Self = StObject.set(x, "renderErrorMessageImageVAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderErrorMessageImageVAlignUndefined: Self = StObject.set(x, "renderErrorMessageImageVAlign", js.undefined)
      
      @scala.inline
      def setRenderErrorMessageUndefined: Self = StObject.set(x, "renderErrorMessage", js.undefined)
      
      @scala.inline
      def setShowChartLoadingMessage(value: Boolean): Self = StObject.set(x, "showChartLoadingMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowChartLoadingMessageUndefined: Self = StObject.set(x, "showChartLoadingMessage", js.undefined)
      
      @scala.inline
      def setShowDataLoadingMessage(value: Boolean): Self = StObject.set(x, "showDataLoadingMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowDataLoadingMessageUndefined: Self = StObject.set(x, "showDataLoadingMessage", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeNotSupportedMessage(value: String): Self = StObject.set(x, "typeNotSupportedMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeNotSupportedMessageUndefined: Self = StObject.set(x, "typeNotSupportedMessage", js.undefined)
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait Debugger extends StObject {
    
    def enable(state: js.Any): Unit = js.native
    def enable(state: js.Any, outputTo: js.UndefOr[scala.Nothing], outputFormat: js.Any): Unit = js.native
    def enable(state: js.Any, outputTo: js.Function1[/* message */ js.Any, _]): Unit = js.native
    def enable(state: js.Any, outputTo: js.Function1[/* message */ js.Any, _], outputFormat: js.Any): Unit = js.native
    
    def enableFirebugLite(): js.Any = js.native
    
    def outputFormat(format: js.Any): Unit = js.native
    
    def outputTo(callback: js.Function1[/* message */ js.Any, _]): Unit = js.native
  }
  
  @js.native
  trait EventObject extends StObject {
    
    var cancelled: Boolean = js.native
    
    def detachHandler(): Unit = js.native
    
    var detached: Boolean = js.native
    
    var eventId: Double = js.native
    
    def preventDefault(): Unit = js.native
    
    var prevented: Boolean = js.native
    
    var sender: FusionCharts = js.native
    
    def stopPropagation(): Unit = js.native
    
    var `type`: String = js.native
  }
  object EventObject {
    
    @scala.inline
    def apply(
      cancelled: Boolean,
      detachHandler: () => Unit,
      detached: Boolean,
      eventId: Double,
      preventDefault: () => Unit,
      prevented: Boolean,
      sender: FusionCharts,
      stopPropagation: () => Unit,
      `type`: String
    ): EventObject = {
      val __obj = js.Dynamic.literal(cancelled = cancelled.asInstanceOf[js.Any], detachHandler = js.Any.fromFunction0(detachHandler), detached = detached.asInstanceOf[js.Any], eventId = eventId.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), prevented = prevented.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventObject]
    }
    
    @scala.inline
    implicit class EventObjectMutableBuilder[Self <: EventObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancelled(value: Boolean): Self = StObject.set(x, "cancelled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetachHandler(value: () => Unit): Self = StObject.set(x, "detachHandler", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDetached(value: Boolean): Self = StObject.set(x, "detached", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventId(value: Double): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPrevented(value: Boolean): Self = StObject.set(x, "prevented", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSender(value: FusionCharts): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FusionChartStatic
    extends Instantiable1[(/* chartObject */ ChartObject) | (/* chartObject */ js.Object), FusionCharts] {
    
    def apply(chartId: String): FusionCharts = js.native
    
    def addEventListener(
      `type`: String,
      listener: js.Function2[
          /* eventObject */ js.UndefOr[EventObject], 
          /* eventArgs */ js.UndefOr[js.Object], 
          Unit
        ]
    ): Unit = js.native
    def addEventListener(
      `type`: js.Array[String],
      listener: js.Function2[
          /* eventObject */ js.UndefOr[EventObject], 
          /* eventArgs */ js.UndefOr[js.Object], 
          Unit
        ]
    ): Unit = js.native
    
    def batchExport(options: js.Object): Unit = js.native
    
    var debugger: Debugger = js.native
    
    def formatNumber(num: Double): Element = js.native
    def formatNumber(num: Double, `type`: js.UndefOr[scala.Nothing], config: js.Object): Element = js.native
    def formatNumber(num: Double, `type`: String): Element = js.native
    def formatNumber(num: Double, `type`: String, config: js.Object): Element = js.native
    
    def getCurrentRenderer(): String = js.native
    
    def getObjectReference(elementId: String): Element = js.native
    
    def ready(callback: js.Function1[/* fusionChartStatic */ js.UndefOr[this.type], _]): FusionChartStatic = js.native
    def ready(callback: js.Function1[/* fusionChartStatic */ js.UndefOr[this.type], _], context: js.Any): FusionChartStatic = js.native
    
    def removeEventListener(
      `type`: String,
      listener: js.Function2[
          /* eventObject */ js.UndefOr[EventObject], 
          /* eventArgs */ js.UndefOr[js.Object], 
          Unit
        ]
    ): Unit = js.native
    def removeEventListener(
      `type`: js.Array[String],
      listener: js.Function2[
          /* eventObject */ js.UndefOr[EventObject], 
          /* eventArgs */ js.UndefOr[js.Object], 
          Unit
        ]
    ): Unit = js.native
    
    def render(): FusionCharts = js.native
    def render(options: js.UndefOr[scala.Nothing], callback: js.Function0[_]): FusionCharts = js.native
    def render(options: ChartObject): FusionCharts = js.native
    def render(options: ChartObject, callback: js.Function0[_]): FusionCharts = js.native
    
    def setCurrentRenderer(name: String): Unit = js.native
    
    def transcodeData(data: String, source: ChartDataFormats, target: ChartDataFormats, advanced: Boolean): js.Any = js.native
    def transcodeData(data: js.Object, source: ChartDataFormats, target: ChartDataFormats, advanced: Boolean): js.Any = js.native
    
    var version: js.Array[String] = js.native
  }
  
  @js.native
  trait FusionCharts extends StObject {
    
    def addEventListener(
      `type`: String,
      listener: js.Function2[
          /* eventObject */ js.UndefOr[EventObject], 
          /* eventArgs */ js.UndefOr[js.Object], 
          Unit
        ]
    ): Unit = js.native
    def addEventListener(
      `type`: js.Array[String],
      listener: js.Function2[
          /* eventObject */ js.UndefOr[EventObject], 
          /* eventArgs */ js.UndefOr[js.Object], 
          Unit
        ]
    ): Unit = js.native
    
    def addVariable(): Unit = js.native
    
    def centerLabel(labelText: String): Unit = js.native
    def centerLabel(labelText: String, options: js.Object): Unit = js.native
    
    def chartType(): String = js.native
    def chartType(value: js.UndefOr[scala.Nothing], options: js.Any): String = js.native
    def chartType(value: String): String = js.native
    def chartType(value: String, options: js.Any): String = js.native
    
    def clearChart(): Unit = js.native
    
    def clone(overrides: js.UndefOr[scala.Nothing], argsOnly: Boolean): js.Any = js.native
    def clone(overrides: js.Object): js.Any = js.native
    def clone(overrides: js.Object, argsOnly: Boolean): js.Any = js.native
    
    def configure(options: js.Object): Unit = js.native
    
    def configureLink(param: js.Array[_]): Unit = js.native
    def configureLink(param: js.Array[_], level: Double): Unit = js.native
    def configureLink(param: js.Object): Unit = js.native
    def configureLink(param: js.Object, level: Double): Unit = js.native
    
    def dataReady(): Boolean = js.native
    def dataReady(available: Boolean): Boolean = js.native
    
    def dispose(): Unit = js.native
    
    def exportChart(): Unit = js.native
    def exportChart(options: js.Object): Unit = js.native
    
    def feedData(stream: String): Unit = js.native
    
    def getCSVData(): js.Any = js.native
    
    def getChartAttribute(): ChartObject = js.native
    def getChartAttribute(attribute: String): ChartObject = js.native
    def getChartAttribute(attribute: js.Array[String]): ChartObject = js.native
    
    def getChartData(format: ChartDataFormats): js.Any = js.native
    
    def getData(): js.Any = js.native
    
    def getDataAsCSV(): js.Any = js.native
    
    def getDataWithId(): js.Any = js.native
    
    def getJSONData(): JSON = js.native
    
    def getSVGString(): String = js.native
    
    def getSWFHTML(): js.Any = js.native
    
    def getViewEndIndex(): Double = js.native
    
    def getViewStartIndex(): Double = js.native
    
    def getXML(): js.Any = js.native
    
    def getXMLData(): js.Any = js.native
    
    def hasRendered(): Boolean = js.native
    
    def isActive(): Boolean = js.native
    
    def isPlotItemSliced(index: Double): Boolean = js.native
    
    def isUpdateActive(): Boolean = js.native
    
    def lockResize(state: Boolean): Boolean = js.native
    
    def print(): Unit = js.native
    def print(options: js.Object): Unit = js.native
    
    def removeEventListener(
      `type`: String,
      listener: js.Function2[
          /* eventObject */ js.UndefOr[EventObject], 
          /* eventArgs */ js.UndefOr[js.Object], 
          Unit
        ]
    ): Unit = js.native
    def removeEventListener(
      `type`: js.Array[String],
      listener: js.Function2[
          /* eventObject */ js.UndefOr[EventObject], 
          /* eventArgs */ js.UndefOr[js.Object], 
          Unit
        ]
    ): Unit = js.native
    
    def render(): FusionCharts = js.native
    def render(
      containerElement: js.UndefOr[scala.Nothing],
      insertMode: js.UndefOr[scala.Nothing],
      callback: js.Function0[_]
    ): FusionCharts = js.native
    def render(containerElement: js.UndefOr[scala.Nothing], insertMode: String): FusionCharts = js.native
    def render(containerElement: js.UndefOr[scala.Nothing], insertMode: String, callback: js.Function0[_]): FusionCharts = js.native
    def render(containerElement: String): FusionCharts = js.native
    def render(containerElement: String, insertMode: js.UndefOr[scala.Nothing], callback: js.Function0[_]): FusionCharts = js.native
    def render(containerElement: String, insertMode: String): FusionCharts = js.native
    def render(containerElement: String, insertMode: String, callback: js.Function0[_]): FusionCharts = js.native
    def render(containerElement: Element): FusionCharts = js.native
    def render(containerElement: Element, insertMode: js.UndefOr[scala.Nothing], callback: js.Function0[_]): FusionCharts = js.native
    def render(containerElement: Element, insertMode: String): FusionCharts = js.native
    def render(containerElement: Element, insertMode: String, callback: js.Function0[_]): FusionCharts = js.native
    
    def resetChart(): Unit = js.native
    
    def resizeTo(width: String, height: String): js.Any = js.native
    def resizeTo(width: String, height: Double): js.Any = js.native
    def resizeTo(width: Double, height: String): js.Any = js.native
    def resizeTo(width: Double, height: Double): js.Any = js.native
    
    def restartUpdate(): Unit = js.native
    
    def setChartAttribute(attributes: String): Unit = js.native
    def setChartAttribute(attributes: String, value: String): Unit = js.native
    def setChartAttribute(attributes: ChartObject): Unit = js.native
    def setChartAttribute(attributes: ChartObject, value: String): Unit = js.native
    
    def setChartData(data: String, format: ChartDataFormats): Unit = js.native
    def setChartData(data: js.Object, format: ChartDataFormats): Unit = js.native
    
    def setChartDataUrl(url: String, format: ChartDataFormats): Unit = js.native
    
    def setData(value: Double, label: String): Unit = js.native
    
    def setDataURL(url: String): Unit = js.native
    
    def setDataXML(data: String): Unit = js.native
    def setDataXML(data: js.Object): Unit = js.native
    
    def setJSONData(data: String): Unit = js.native
    def setJSONData(data: js.Object): Unit = js.native
    
    def setJSONUrl(url: String): Unit = js.native
    
    def setTransparent(): Unit = js.native
    def setTransparent(transparency: Boolean): Unit = js.native
    
    def setXMLData(data: String): Unit = js.native
    def setXMLData(data: js.Object): Unit = js.native
    
    def setXMLUrl(url: String): Unit = js.native
    
    def setZoomMode(yes: Boolean): Unit = js.native
    
    def showChartMessage(text: String): Unit = js.native
    def showChartMessage(text: String, modal: js.UndefOr[scala.Nothing], cancelable: Boolean): Unit = js.native
    def showChartMessage(text: String, modal: Boolean): Unit = js.native
    def showChartMessage(text: String, modal: Boolean, cancelable: Boolean): Unit = js.native
    
    def slicePlotItem(index: Double, slice: Boolean): Unit = js.native
    
    def startingAngle(): Unit = js.native
    def startingAngle(angle: js.UndefOr[scala.Nothing], relative: Boolean): Unit = js.native
    def startingAngle(angle: Double): Unit = js.native
    def startingAngle(angle: Double, relative: Boolean): Unit = js.native
    
    def stopUpdate(): Unit = js.native
    
    def zoomOut(): Unit = js.native
    
    def zoomTo(startIndex: Double, endIndex: Double): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.fusioncharts.fusionchartsStrings.left
    - typingsSlinky.fusioncharts.fusionchartsStrings.right
    - typingsSlinky.fusioncharts.fusionchartsStrings.middle
  */
  trait ImageHAlign extends StObject
  object ImageHAlign {
    
    @scala.inline
    def left: typingsSlinky.fusioncharts.fusionchartsStrings.left = "left".asInstanceOf[typingsSlinky.fusioncharts.fusionchartsStrings.left]
    
    @scala.inline
    def middle: typingsSlinky.fusioncharts.fusionchartsStrings.middle = "middle".asInstanceOf[typingsSlinky.fusioncharts.fusionchartsStrings.middle]
    
    @scala.inline
    def right: typingsSlinky.fusioncharts.fusionchartsStrings.right = "right".asInstanceOf[typingsSlinky.fusioncharts.fusionchartsStrings.right]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.fusioncharts.fusionchartsStrings.top
    - typingsSlinky.fusioncharts.fusionchartsStrings.bottom
    - typingsSlinky.fusioncharts.fusionchartsStrings.middle
  */
  trait ImageVAlign extends StObject
  object ImageVAlign {
    
    @scala.inline
    def bottom: typingsSlinky.fusioncharts.fusionchartsStrings.bottom = "bottom".asInstanceOf[typingsSlinky.fusioncharts.fusionchartsStrings.bottom]
    
    @scala.inline
    def middle: typingsSlinky.fusioncharts.fusionchartsStrings.middle = "middle".asInstanceOf[typingsSlinky.fusioncharts.fusionchartsStrings.middle]
    
    @scala.inline
    def top: typingsSlinky.fusioncharts.fusionchartsStrings.top = "top".asInstanceOf[typingsSlinky.fusioncharts.fusionchartsStrings.top]
  }
  
  type _To = FusionChartStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: FusionChartStatic = ^
}
