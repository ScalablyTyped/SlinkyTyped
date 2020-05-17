package typingsSlinky.highcharts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AnimationStepCallbackFunction = js.ThisFunction0[/* this */ typingsSlinky.highcharts.mod.SVGElement, scala.Unit]
  type AxisEventCallbackFunction = js.ThisFunction0[/* this */ typingsSlinky.highcharts.mod.Axis, scala.Unit]
  type AxisPointBreakEventCallbackFunction = js.ThisFunction1[
    /* this */ typingsSlinky.highcharts.mod.Axis, 
    /* evt */ typingsSlinky.highcharts.mod.AxisPointBreakEventObject, 
    scala.Unit
  ]
  type AxisSetExtremesEventCallbackFunction = js.ThisFunction1[
    /* this */ typingsSlinky.highcharts.mod.Axis, 
    /* evt */ typingsSlinky.highcharts.mod.AxisSetExtremesEventObject, 
    scala.Unit
  ]
  type AxisTickPositionerCallbackFunction = js.ThisFunction0[/* this */ typingsSlinky.highcharts.mod.Axis, js.Array[scala.Double]]
  type ChartAddSeriesCallbackFunction = js.ThisFunction1[
    /* this */ typingsSlinky.highcharts.mod.Chart_, 
    /* event */ typingsSlinky.highcharts.mod.ChartAddSeriesEventObject, 
    scala.Unit
  ]
  type ChartCallbackFunction = js.Function1[/* chart */ typingsSlinky.highcharts.mod.Chart_, scala.Unit]
  type ChartClickCallbackFunction = js.ThisFunction1[
    /* this */ typingsSlinky.highcharts.mod.Chart_, 
    /* event */ typingsSlinky.highcharts.mod.PointerEventObject, 
    scala.Unit
  ]
  type ChartLoadCallbackFunction = js.ThisFunction1[
    /* this */ typingsSlinky.highcharts.mod.Chart_, 
    /* event */ org.scalajs.dom.raw.Event, 
    scala.Unit
  ]
  type ChartRedrawCallbackFunction = js.ThisFunction1[
    /* this */ typingsSlinky.highcharts.mod.Chart_, 
    /* event */ org.scalajs.dom.raw.Event, 
    scala.Unit
  ]
  type ChartRenderCallbackFunction = js.ThisFunction1[
    /* this */ typingsSlinky.highcharts.mod.Chart_, 
    /* event */ org.scalajs.dom.raw.Event, 
    scala.Unit
  ]
  type ChartSelectionCallbackFunction = js.ThisFunction1[
    /* this */ typingsSlinky.highcharts.mod.Chart_, 
    /* event */ typingsSlinky.highcharts.mod.ChartSelectionContextObject, 
    js.UndefOr[scala.Boolean]
  ]
  type ClipRectElement = typingsSlinky.highcharts.mod.SVGElement
  type ColorString = java.lang.String
  type DataBeforeParseCallbackFunction = js.Function1[/* csv */ java.lang.String, java.lang.String]
  type DataCompleteCallbackFunction = js.Function1[/* chartOptions */ typingsSlinky.highcharts.mod.Options, scala.Unit]
  /**
    * Callback function that returns the correspondig Date object to a match.
    */
  type DataDateFormatCallbackFunction = js.Function1[/* match */ js.Array[scala.Double], scala.Double]
  type DataLabelsFormatterCallbackFunction = js.ThisFunction0[
    /* this */ typingsSlinky.highcharts.mod.DataLabelsFormatterContextObject, 
    js.UndefOr[scala.Double | java.lang.String | scala.Null]
  ]
  type DataParseDateCallbackFunction = js.Function1[/* dateValue */ java.lang.String, scala.Double]
  type DataParsedCallbackFunction = js.Function1[/* columns */ js.Array[js.Array[js.Any]], js.UndefOr[scala.Boolean]]
  type Dictionary[T] = org.scalablytyped.runtime.StringDictionary[T]
  type DrilldownCallbackFunction = js.ThisFunction1[
    /* this */ typingsSlinky.highcharts.mod.Chart_, 
    /* e */ typingsSlinky.highcharts.mod.DrilldownEventObject, 
    scala.Unit
  ]
  type DrillupAllCallbackFunction = js.ThisFunction1[
    /* this */ typingsSlinky.highcharts.mod.Chart_, 
    /* e */ typingsSlinky.highcharts.mod.DrillupAllEventObject, 
    scala.Unit
  ]
  type DrillupCallbackFunction = js.ThisFunction1[
    /* this */ typingsSlinky.highcharts.mod.Chart_, 
    /* e */ typingsSlinky.highcharts.mod.DrillupEventObject, 
    scala.Unit
  ]
  type EventCallbackFunction[T] = js.ThisFunction1[
    /* this */ T, 
    /* eventArguments */ js.UndefOr[org.scalajs.dom.raw.Event | typingsSlinky.highcharts.mod.Dictionary[js.Any]], 
    scala.Boolean | scala.Unit
  ]
  type ExportDataCallbackFunction = js.ThisFunction1[
    /* this */ typingsSlinky.highcharts.mod.Chart_, 
    /* event */ typingsSlinky.highcharts.mod.ExportDataEventObject, 
    scala.Unit
  ]
  type ExportingAfterPrintCallbackFunction = js.Function2[
    /* chart */ typingsSlinky.highcharts.mod.Chart_, 
    /* event */ org.scalajs.dom.raw.Event, 
    scala.Unit
  ]
  type ExportingBeforePrintCallbackFunction = js.Function2[
    /* chart */ typingsSlinky.highcharts.mod.Chart_, 
    /* event */ org.scalajs.dom.raw.Event, 
    scala.Unit
  ]
  type ExportingErrorCallbackFunction = js.Function2[
    /* options */ typingsSlinky.highcharts.mod.ExportingOptions, 
    /* err */ js.Error, 
    scala.Unit
  ]
  type FormatterCallbackFunction[T] = js.ThisFunction0[/* this */ T, java.lang.String]
  type HTMLAttributes = typingsSlinky.highcharts.mod.Dictionary[scala.Boolean | scala.Double | java.lang.String | js.Function]
  type HTMLDOMElement = org.scalajs.dom.raw.HTMLElement
  type ObjectEachCallbackFunction[T] = js.ThisFunction3[
    /* this */ T, 
    /* value */ js.Any, 
    /* key */ java.lang.String, 
    /* obj */ js.Any, 
    scala.Unit
  ]
  type PointClickCallbackFunction = js.ThisFunction1[
    /* this */ typingsSlinky.highcharts.mod.Point, 
    /* event */ typingsSlinky.highcharts.mod.PointClickEventObject, 
    scala.Unit
  ]
  type PointDragCallbackFunction = js.ThisFunction1[
    /* this */ typingsSlinky.highcharts.mod.Point, 
    /* event */ typingsSlinky.highcharts.mod.PointDragEventObject, 
    scala.Unit
  ]
  type PointDragStartCallbackFunction = js.ThisFunction1[
    /* this */ typingsSlinky.highcharts.mod.Point, 
    /* event */ typingsSlinky.highcharts.mod.PointDragStartEventObject, 
    scala.Unit
  ]
  type PointDropCallbackFunction = js.ThisFunction1[
    /* this */ typingsSlinky.highcharts.mod.Point, 
    /* event */ typingsSlinky.highcharts.mod.PointDropEventObject, 
    scala.Unit
  ]
  type PointLegendItemClickCallbackFunction = js.ThisFunction1[
    /* this */ typingsSlinky.highcharts.mod.Point, 
    /* event */ typingsSlinky.highcharts.mod.PointLegendItemClickEventObject, 
    scala.Unit
  ]
  type PointMouseOutCallbackFunction = js.ThisFunction1[
    /* this */ typingsSlinky.highcharts.mod.Point, 
    /* event */ org.scalajs.dom.raw.PointerEvent, 
    scala.Unit
  ]
  type PointMouseOverCallbackFunction = js.ThisFunction1[
    /* this */ typingsSlinky.highcharts.mod.Point, 
    /* event */ org.scalajs.dom.raw.Event, 
    scala.Unit
  ]
  type PointRemoveCallbackFunction = js.ThisFunction1[
    /* this */ typingsSlinky.highcharts.mod.Point, 
    /* event */ org.scalajs.dom.raw.Event, 
    scala.Unit
  ]
  type PointSelectCallbackFunction = js.ThisFunction1[
    /* this */ typingsSlinky.highcharts.mod.Point, 
    /* event */ typingsSlinky.highcharts.mod.PointInteractionEventObject, 
    scala.Unit
  ]
  type PointUnselectCallbackFunction = js.ThisFunction1[
    /* this */ typingsSlinky.highcharts.mod.Point, 
    /* event */ typingsSlinky.highcharts.mod.PointInteractionEventObject, 
    scala.Unit
  ]
  type PointUpdateCallbackFunction = js.ThisFunction1[
    /* this */ typingsSlinky.highcharts.mod.Point, 
    /* event */ typingsSlinky.highcharts.mod.PointUpdateEventObject, 
    scala.Unit
  ]
  type RangeSelectorClickCallbackFunction = js.Function2[
    /* e */ org.scalajs.dom.raw.Event, 
    /* Return */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ]
  type RangeSelectorParseCallbackFunction = js.Function1[/* value */ java.lang.String, scala.Double]
  type ResponsiveCallbackFunction = js.ThisFunction0[/* this */ typingsSlinky.highcharts.mod.Chart_, scala.Boolean]
  type SVGDOMElement = org.scalajs.dom.raw.SVGElement
  type SVGPathArray = js.Array[scala.Double | typingsSlinky.highcharts.mod.SVGPathCommand]
  type ScreenReaderClickCallbackFunction = js.Function1[/* evt */ org.scalajs.dom.raw.MouseEvent, scala.Unit]
  type ScreenReaderFormatterCallbackFunction[T] = js.Function1[/* context */ T, java.lang.String]
  type SeriesAfterAnimateCallbackFunction = js.ThisFunction1[
    /* this */ typingsSlinky.highcharts.mod.Series, 
    /* event */ typingsSlinky.highcharts.mod.SeriesAfterAnimateEventObject, 
    scala.Unit
  ]
  type SeriesCheckboxClickCallbackFunction = js.ThisFunction1[
    /* this */ typingsSlinky.highcharts.mod.Series, 
    /* event */ typingsSlinky.highcharts.mod.SeriesCheckboxClickEventObject, 
    scala.Unit
  ]
  type SeriesClickCallbackFunction = js.ThisFunction1[
    /* this */ typingsSlinky.highcharts.mod.Series, 
    /* event */ typingsSlinky.highcharts.mod.SeriesClickEventObject, 
    scala.Unit
  ]
  type SeriesHideCallbackFunction = js.ThisFunction1[
    /* this */ typingsSlinky.highcharts.mod.Series, 
    /* event */ org.scalajs.dom.raw.Event, 
    scala.Unit
  ]
  type SeriesLegendItemClickCallbackFunction = js.ThisFunction1[
    /* this */ typingsSlinky.highcharts.mod.Series, 
    /* event */ typingsSlinky.highcharts.mod.SeriesLegendItemClickEventObject, 
    scala.Unit
  ]
  type SeriesMouseOutCallbackFunction = js.ThisFunction1[
    /* this */ typingsSlinky.highcharts.mod.Series, 
    /* event */ org.scalajs.dom.raw.PointerEvent, 
    scala.Unit
  ]
  type SeriesMouseOverCallbackFunction = js.ThisFunction1[
    /* this */ typingsSlinky.highcharts.mod.Series, 
    /* event */ org.scalajs.dom.raw.PointerEvent, 
    scala.Unit
  ]
  type SeriesNetworkgraphDataLabelsFormatterCallbackFunction = js.ThisFunction0[
    /* this */ typingsSlinky.highcharts.mod.DataLabelsFormatterContextObject | typingsSlinky.highcharts.mod.SeriesNetworkgraphDataLabelsFormatterContextObject, 
    java.lang.String
  ]
  type SeriesPackedBubbleDataLabelsFormatterCallbackFunction = js.ThisFunction0[
    /* this */ typingsSlinky.highcharts.mod.DataLabelsFormatterContextObject | typingsSlinky.highcharts.mod.SeriesPackedBubbleDataLabelsFormatterContextObject, 
    java.lang.String
  ]
  type SeriesSankeyDataLabelsFormatterCallbackFunction = js.ThisFunction0[
    /* this */ typingsSlinky.highcharts.mod.DataLabelsFormatterContextObject | typingsSlinky.highcharts.mod.SeriesSankeyDataLabelsFormatterContextObject, 
    js.UndefOr[java.lang.String]
  ]
  type SeriesShowCallbackFunction = js.ThisFunction1[
    /* this */ typingsSlinky.highcharts.mod.Series, 
    /* event */ org.scalajs.dom.raw.Event, 
    scala.Unit
  ]
  type TimeFormatCallbackFunction = js.Function1[/* timestamp */ scala.Double, java.lang.String]
  type TimelineDataLabelsFormatterCallbackFunction = js.ThisFunction0[
    /* this */ typingsSlinky.highcharts.mod.DataLabelsFormatterContextObject | typingsSlinky.highcharts.mod.TimelineDataLabelsFormatterContextObject, 
    js.UndefOr[scala.Double | java.lang.String | scala.Null]
  ]
  type TooltipFormatterCallbackFunction = js.ThisFunction1[
    /* this */ typingsSlinky.highcharts.mod.TooltipFormatterContextObject, 
    /* tooltip */ typingsSlinky.highcharts.mod.Tooltip, 
    js.UndefOr[
      typingsSlinky.highcharts.highchartsBooleans.`false` | java.lang.String | (js.Array[js.UndefOr[java.lang.String | scala.Null]]) | scala.Null
    ]
  ]
  type TooltipPositionerCallbackFunction = js.Function3[
    /* labelWidth */ scala.Double, 
    /* labelHeight */ scala.Double, 
    /* point */ typingsSlinky.highcharts.mod.TooltipPositionerPointObject, 
    typingsSlinky.highcharts.mod.PositionObject
  ]
  type WrapProceedFunction = js.Function3[
    /* arg1 */ js.UndefOr[js.Any], 
    /* arg2 */ js.UndefOr[js.Any], 
    /* arg3 */ js.UndefOr[js.Any], 
    js.Any
  ]
  type XAxisCrosshairLabelFormatterCallbackFunction = js.ThisFunction1[
    /* this */ typingsSlinky.highcharts.mod.Axis, 
    /* value */ scala.Double, 
    java.lang.String
  ]
}
