package typingsSlinky.highcharts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AccessibilityAnnouncementFormatter = js.Function3[
    /* updatedSeries */ js.Array[typingsSlinky.highcharts.mod.Series], 
    /* addedSeries */ js.UndefOr[typingsSlinky.highcharts.mod.Series], 
    /* addedPoint */ js.UndefOr[typingsSlinky.highcharts.mod.Point], 
    typingsSlinky.highcharts.highchartsBooleans.`false` | java.lang.String
  ]
  
  type AnimationStepCallbackFunction = js.ThisFunction0[/* this */ typingsSlinky.highcharts.mod.SVGElement, scala.Unit]
  
  type AnnotationControlPointPositionerFunction = js.ThisFunction1[
    /* this */ typingsSlinky.highcharts.mod.AnnotationControlPoint, 
    /* target */ typingsSlinky.highcharts.mod.AnnotationControllable, 
    typingsSlinky.highcharts.mod.PositionObject
  ]
  
  type AxisEventCallbackFunction = js.ThisFunction0[/* this */ typingsSlinky.highcharts.mod.Axis, scala.Unit]
  
  type AxisLabelsFormatterCallbackFunction = js.ThisFunction1[
    /* this */ typingsSlinky.highcharts.mod.AxisLabelsFormatterContextObject[scala.Double], 
    /* that */ typingsSlinky.highcharts.mod.AxisLabelsFormatterContextObject[java.lang.String], 
    java.lang.String
  ]
  
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
  
  type AxisTickPositionerCallbackFunction = js.ThisFunction0[
    /* this */ typingsSlinky.highcharts.mod.Axis, 
    typingsSlinky.highcharts.mod.AxisTickPositionsArray
  ]
  
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
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.highcharts.mod.ColorString
    - typingsSlinky.highcharts.mod.GradientColorObject
    - typingsSlinky.highcharts.mod.PatternObject
  */
  type ColorType = typingsSlinky.highcharts.mod._ColorType | typingsSlinky.highcharts.mod.ColorString
  
  type DataBeforeParseCallbackFunction = js.Function1[/* csv */ java.lang.String, java.lang.String]
  
  type DataCompleteCallbackFunction = js.Function1[/* chartOptions */ typingsSlinky.highcharts.mod.Options, scala.Unit]
  
  /**
    * Callback function that returns the correspondig Date object to a match.
    */
  type DataDateFormatCallbackFunction = js.Function1[/* match */ js.Array[scala.Double], scala.Double]
  
  type DataLabelsFormatterCallbackFunction = js.ThisFunction1[
    /* this */ typingsSlinky.highcharts.mod.PointLabelObject, 
    /* options */ typingsSlinky.highcharts.mod.DataLabelsOptions, 
    js.UndefOr[scala.Double | java.lang.String | scala.Null]
  ]
  
  type DataParseDateCallbackFunction = js.Function1[/* dateValue */ java.lang.String, scala.Double]
  
  type DataParsedCallbackFunction = js.Function1[/* columns */ js.Array[js.Array[js.Any]], js.UndefOr[scala.Boolean]]
  
  type DataValueType = scala.Double | java.lang.String | scala.Null
  
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
  
  type MarkerClusterDrillCallbackFunction = js.ThisFunction1[
    /* this */ typingsSlinky.highcharts.mod.Point, 
    /* event */ typingsSlinky.highcharts.mod.PointClickEventObject, 
    scala.Unit
  ]
  
  type NumberFormatterCallbackFunction = js.Function4[
    /* number */ scala.Double, 
    /* decimals */ scala.Double, 
    /* decimalPoint */ js.UndefOr[java.lang.String], 
    /* thousandsSep */ js.UndefOr[java.lang.String], 
    java.lang.String
  ]
  
  type ObjectEachCallbackFunction[T] = js.ThisFunction3[
    /* this */ T, 
    /* value */ js.Any, 
    /* key */ java.lang.String, 
    /* obj */ js.Any, 
    scala.Unit
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.highcharts.highchartsStrings.straight
    - typingsSlinky.highcharts.highchartsStrings.fastAvoid
    - typingsSlinky.highcharts.highchartsStrings.simpleConnect
    - java.lang.String
  */
  type PathfinderTypeValue = typingsSlinky.highcharts.mod._PathfinderTypeValue | java.lang.String
  
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
  
  type PointOptionsType = scala.Double | java.lang.String | typingsSlinky.highcharts.mod.PointOptionsObject | (js.Array[scala.Double | java.lang.String | scala.Null]) | scala.Null
  
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
  
  type RelativeSize = scala.Double | java.lang.String
  
  type ResponsiveCallbackFunction = js.ThisFunction0[/* this */ typingsSlinky.highcharts.mod.Chart_, scala.Boolean]
  
  type SVGDOMElement = org.scalajs.dom.raw.SVGElement
  
  type SVGPathArray = js.Array[
    js.Array[typingsSlinky.highcharts.mod.SVGPathCommand] | (js.Tuple2[typingsSlinky.highcharts.mod.SVGPathCommand, scala.Double]) | (js.Tuple3[typingsSlinky.highcharts.mod.SVGPathCommand, scala.Double, scala.Double]) | (js.Tuple5[
      typingsSlinky.highcharts.mod.SVGPathCommand, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double
    ]) | (js.Tuple7[
      typingsSlinky.highcharts.mod.SVGPathCommand, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double
    ]) | (js.Tuple8[
      typingsSlinky.highcharts.mod.SVGPathCommand, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double
    ])
  ]
  
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
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.highcharts.highchartsStrings.butt
    - typingsSlinky.highcharts.highchartsStrings.round
    - typingsSlinky.highcharts.highchartsStrings.square
    - java.lang.String
  */
  type SeriesLinecapValue = typingsSlinky.highcharts.mod._SeriesLinecapValue | java.lang.String
  
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
    /* this */ typingsSlinky.highcharts.mod.PointLabelObject | typingsSlinky.highcharts.mod.SeriesNetworkgraphDataLabelsFormatterContextObject, 
    java.lang.String
  ]
  
  type SeriesPackedBubbleDataLabelsFormatterCallbackFunction = js.ThisFunction0[
    /* this */ typingsSlinky.highcharts.mod.SeriesPackedBubbleDataLabelsFormatterContextObject, 
    java.lang.String
  ]
  
  type SeriesSankeyDataLabelsFormatterCallbackFunction = js.ThisFunction0[
    /* this */ typingsSlinky.highcharts.mod.PointLabelObject | typingsSlinky.highcharts.mod.SeriesSankeyDataLabelsFormatterContextObject, 
    js.UndefOr[java.lang.String]
  ]
  
  type SeriesShowCallbackFunction = js.ThisFunction1[
    /* this */ typingsSlinky.highcharts.mod.Series, 
    /* event */ org.scalajs.dom.raw.Event, 
    scala.Unit
  ]
  
  type TimeFormatCallbackFunction = js.Function1[/* timestamp */ scala.Double, java.lang.String]
  
  type TimelineDataLabelsFormatterCallbackFunction = js.ThisFunction0[
    /* this */ typingsSlinky.highcharts.mod.PointLabelObject | typingsSlinky.highcharts.mod.TimelineDataLabelsFormatterContextObject, 
    js.UndefOr[scala.Double | java.lang.String | scala.Null]
  ]
  
  type TimezoneOffsetCallbackFunction = js.Function1[/* timestamp */ scala.Double, scala.Double]
  
  type TooltipFormatterCallbackFunction = js.ThisFunction1[
    /* this */ typingsSlinky.highcharts.mod.TooltipFormatterContextObject, 
    /* tooltip */ typingsSlinky.highcharts.mod.Tooltip, 
    js.UndefOr[
      typingsSlinky.highcharts.highchartsBooleans.`false` | java.lang.String | (js.Array[js.UndefOr[java.lang.String | scala.Null]]) | scala.Null
    ]
  ]
  
  type TooltipPositionerCallbackFunction = js.ThisFunction3[
    /* this */ typingsSlinky.highcharts.mod.Tooltip, 
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
  
  @scala.inline
  def addEvent[T](el: T, `type`: java.lang.String, fn: js.Function): js.Function = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addEvent")(el.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  @scala.inline
  def addEvent[T](
    el: T,
    `type`: java.lang.String,
    fn: js.Function,
    options: typingsSlinky.highcharts.mod.EventOptionsObject
  ): js.Function = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addEvent")(el.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  @scala.inline
  def addEvent[T](el: T, `type`: java.lang.String, fn: typingsSlinky.highcharts.mod.EventCallbackFunction[T]): js.Function = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addEvent")(el.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  @scala.inline
  def addEvent[T](
    el: T,
    `type`: java.lang.String,
    fn: typingsSlinky.highcharts.mod.EventCallbackFunction[T],
    options: typingsSlinky.highcharts.mod.EventOptionsObject
  ): js.Function = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addEvent")(el.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  @scala.inline
  def addEvent[T](el: typingsSlinky.highcharts.mod.Class[T], `type`: java.lang.String, fn: js.Function): js.Function = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addEvent")(el.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  @scala.inline
  def addEvent[T](
    el: typingsSlinky.highcharts.mod.Class[T],
    `type`: java.lang.String,
    fn: js.Function,
    options: typingsSlinky.highcharts.mod.EventOptionsObject
  ): js.Function = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addEvent")(el.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  @scala.inline
  def addEvent[T](
    el: typingsSlinky.highcharts.mod.Class[T],
    `type`: java.lang.String,
    fn: typingsSlinky.highcharts.mod.EventCallbackFunction[T]
  ): js.Function = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addEvent")(el.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  @scala.inline
  def addEvent[T](
    el: typingsSlinky.highcharts.mod.Class[T],
    `type`: java.lang.String,
    fn: typingsSlinky.highcharts.mod.EventCallbackFunction[T],
    options: typingsSlinky.highcharts.mod.EventOptionsObject
  ): js.Function = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addEvent")(el.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  
  @scala.inline
  def animObject(): typingsSlinky.highcharts.mod.AnimationOptionsObject = typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("animObject")().asInstanceOf[typingsSlinky.highcharts.mod.AnimationOptionsObject]
  @scala.inline
  def animObject(animation: scala.Boolean): typingsSlinky.highcharts.mod.AnimationOptionsObject = typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("animObject")(animation.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.highcharts.mod.AnimationOptionsObject]
  @scala.inline
  def animObject(animation: typingsSlinky.highcharts.mod.AnimationOptionsObject): typingsSlinky.highcharts.mod.AnimationOptionsObject = typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("animObject")(animation.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.highcharts.mod.AnimationOptionsObject]
  
  @scala.inline
  def animate(el: org.scalajs.dom.raw.HTMLElement, params: typingsSlinky.highcharts.mod.CSSObject): scala.Unit = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("animate")(el.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def animate(
    el: org.scalajs.dom.raw.HTMLElement,
    params: typingsSlinky.highcharts.mod.CSSObject,
    opt: typingsSlinky.highcharts.anon.PartialAnimationOptionsOb
  ): scala.Unit = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("animate")(el.asInstanceOf[js.Any], params.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def animate(el: org.scalajs.dom.raw.HTMLElement, params: typingsSlinky.highcharts.mod.SVGAttributes): scala.Unit = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("animate")(el.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def animate(
    el: org.scalajs.dom.raw.HTMLElement,
    params: typingsSlinky.highcharts.mod.SVGAttributes,
    opt: typingsSlinky.highcharts.anon.PartialAnimationOptionsOb
  ): scala.Unit = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("animate")(el.asInstanceOf[js.Any], params.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def animate(el: typingsSlinky.highcharts.mod.SVGElement, params: typingsSlinky.highcharts.mod.CSSObject): scala.Unit = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("animate")(el.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def animate(
    el: typingsSlinky.highcharts.mod.SVGElement,
    params: typingsSlinky.highcharts.mod.CSSObject,
    opt: typingsSlinky.highcharts.anon.PartialAnimationOptionsOb
  ): scala.Unit = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("animate")(el.asInstanceOf[js.Any], params.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def animate(el: typingsSlinky.highcharts.mod.SVGElement, params: typingsSlinky.highcharts.mod.SVGAttributes): scala.Unit = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("animate")(el.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def animate(
    el: typingsSlinky.highcharts.mod.SVGElement,
    params: typingsSlinky.highcharts.mod.SVGAttributes,
    opt: typingsSlinky.highcharts.anon.PartialAnimationOptionsOb
  ): scala.Unit = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("animate")(el.asInstanceOf[js.Any], params.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def arrayMax(data: js.Array[_]): scala.Double = typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("arrayMax")(data.asInstanceOf[js.Any]).asInstanceOf[scala.Double]
  
  @scala.inline
  def arrayMin(data: js.Array[_]): scala.Double = typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("arrayMin")(data.asInstanceOf[js.Any]).asInstanceOf[scala.Double]
  
  @scala.inline
  def attr(elem: org.scalajs.dom.raw.HTMLElement): js.UndefOr[java.lang.String | scala.Null] = typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("attr")(elem.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[java.lang.String | scala.Null]]
  @scala.inline
  def attr(elem: org.scalajs.dom.raw.HTMLElement, prop: js.UndefOr[scala.Nothing], value: java.lang.String): js.UndefOr[java.lang.String | scala.Null] = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("attr")(elem.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[java.lang.String | scala.Null]]
  @scala.inline
  def attr(elem: org.scalajs.dom.raw.HTMLElement, prop: js.UndefOr[scala.Nothing], value: scala.Double): js.UndefOr[java.lang.String | scala.Null] = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("attr")(elem.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[java.lang.String | scala.Null]]
  @scala.inline
  def attr(elem: org.scalajs.dom.raw.HTMLElement, prop: java.lang.String): js.UndefOr[java.lang.String | scala.Null] = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("attr")(elem.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[java.lang.String | scala.Null]]
  @scala.inline
  def attr(elem: org.scalajs.dom.raw.HTMLElement, prop: java.lang.String, value: java.lang.String): js.UndefOr[java.lang.String | scala.Null] = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("attr")(elem.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[java.lang.String | scala.Null]]
  @scala.inline
  def attr(elem: org.scalajs.dom.raw.HTMLElement, prop: java.lang.String, value: scala.Double): js.UndefOr[java.lang.String | scala.Null] = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("attr")(elem.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[java.lang.String | scala.Null]]
  @scala.inline
  def attr(elem: org.scalajs.dom.raw.HTMLElement, prop: typingsSlinky.highcharts.mod.HTMLAttributes): js.UndefOr[java.lang.String | scala.Null] = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("attr")(elem.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[java.lang.String | scala.Null]]
  @scala.inline
  def attr(
    elem: org.scalajs.dom.raw.HTMLElement,
    prop: typingsSlinky.highcharts.mod.HTMLAttributes,
    value: java.lang.String
  ): js.UndefOr[java.lang.String | scala.Null] = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("attr")(elem.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[java.lang.String | scala.Null]]
  @scala.inline
  def attr(
    elem: org.scalajs.dom.raw.HTMLElement,
    prop: typingsSlinky.highcharts.mod.HTMLAttributes,
    value: scala.Double
  ): js.UndefOr[java.lang.String | scala.Null] = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("attr")(elem.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[java.lang.String | scala.Null]]
  @scala.inline
  def attr(elem: org.scalajs.dom.raw.HTMLElement, prop: typingsSlinky.highcharts.mod.SVGAttributes): js.UndefOr[java.lang.String | scala.Null] = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("attr")(elem.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[java.lang.String | scala.Null]]
  @scala.inline
  def attr(
    elem: org.scalajs.dom.raw.HTMLElement,
    prop: typingsSlinky.highcharts.mod.SVGAttributes,
    value: java.lang.String
  ): js.UndefOr[java.lang.String | scala.Null] = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("attr")(elem.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[java.lang.String | scala.Null]]
  @scala.inline
  def attr(
    elem: org.scalajs.dom.raw.HTMLElement,
    prop: typingsSlinky.highcharts.mod.SVGAttributes,
    value: scala.Double
  ): js.UndefOr[java.lang.String | scala.Null] = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("attr")(elem.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[java.lang.String | scala.Null]]
  @scala.inline
  def attr(elem: org.scalajs.dom.raw.SVGElement): js.UndefOr[java.lang.String | scala.Null] = typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("attr")(elem.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[java.lang.String | scala.Null]]
  @scala.inline
  def attr(elem: org.scalajs.dom.raw.SVGElement, prop: js.UndefOr[scala.Nothing], value: java.lang.String): js.UndefOr[java.lang.String | scala.Null] = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("attr")(elem.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[java.lang.String | scala.Null]]
  @scala.inline
  def attr(elem: org.scalajs.dom.raw.SVGElement, prop: js.UndefOr[scala.Nothing], value: scala.Double): js.UndefOr[java.lang.String | scala.Null] = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("attr")(elem.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[java.lang.String | scala.Null]]
  @scala.inline
  def attr(elem: org.scalajs.dom.raw.SVGElement, prop: java.lang.String): js.UndefOr[java.lang.String | scala.Null] = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("attr")(elem.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[java.lang.String | scala.Null]]
  @scala.inline
  def attr(elem: org.scalajs.dom.raw.SVGElement, prop: java.lang.String, value: java.lang.String): js.UndefOr[java.lang.String | scala.Null] = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("attr")(elem.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[java.lang.String | scala.Null]]
  @scala.inline
  def attr(elem: org.scalajs.dom.raw.SVGElement, prop: java.lang.String, value: scala.Double): js.UndefOr[java.lang.String | scala.Null] = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("attr")(elem.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[java.lang.String | scala.Null]]
  @scala.inline
  def attr(elem: org.scalajs.dom.raw.SVGElement, prop: typingsSlinky.highcharts.mod.HTMLAttributes): js.UndefOr[java.lang.String | scala.Null] = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("attr")(elem.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[java.lang.String | scala.Null]]
  @scala.inline
  def attr(
    elem: org.scalajs.dom.raw.SVGElement,
    prop: typingsSlinky.highcharts.mod.HTMLAttributes,
    value: java.lang.String
  ): js.UndefOr[java.lang.String | scala.Null] = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("attr")(elem.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[java.lang.String | scala.Null]]
  @scala.inline
  def attr(
    elem: org.scalajs.dom.raw.SVGElement,
    prop: typingsSlinky.highcharts.mod.HTMLAttributes,
    value: scala.Double
  ): js.UndefOr[java.lang.String | scala.Null] = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("attr")(elem.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[java.lang.String | scala.Null]]
  @scala.inline
  def attr(elem: org.scalajs.dom.raw.SVGElement, prop: typingsSlinky.highcharts.mod.SVGAttributes): js.UndefOr[java.lang.String | scala.Null] = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("attr")(elem.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[java.lang.String | scala.Null]]
  @scala.inline
  def attr(
    elem: org.scalajs.dom.raw.SVGElement,
    prop: typingsSlinky.highcharts.mod.SVGAttributes,
    value: java.lang.String
  ): js.UndefOr[java.lang.String | scala.Null] = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("attr")(elem.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[java.lang.String | scala.Null]]
  @scala.inline
  def attr(
    elem: org.scalajs.dom.raw.SVGElement,
    prop: typingsSlinky.highcharts.mod.SVGAttributes,
    value: scala.Double
  ): js.UndefOr[java.lang.String | scala.Null] = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("attr")(elem.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[java.lang.String | scala.Null]]
  
  @scala.inline
  def chart(options: typingsSlinky.highcharts.mod.Options): typingsSlinky.highcharts.mod.Chart_ = typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("chart")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.highcharts.mod.Chart_]
  @scala.inline
  def chart(
    options: typingsSlinky.highcharts.mod.Options,
    callback: typingsSlinky.highcharts.mod.ChartCallbackFunction
  ): typingsSlinky.highcharts.mod.Chart_ = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("chart")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.highcharts.mod.Chart_]
  @scala.inline
  def chart(renderTo: java.lang.String, options: typingsSlinky.highcharts.mod.Options): typingsSlinky.highcharts.mod.Chart_ = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("chart")(renderTo.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.highcharts.mod.Chart_]
  @scala.inline
  def chart(
    renderTo: java.lang.String,
    options: typingsSlinky.highcharts.mod.Options,
    callback: typingsSlinky.highcharts.mod.ChartCallbackFunction
  ): typingsSlinky.highcharts.mod.Chart_ = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("chart")(renderTo.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.highcharts.mod.Chart_]
  @scala.inline
  def chart(renderTo: org.scalajs.dom.raw.HTMLElement, options: typingsSlinky.highcharts.mod.Options): typingsSlinky.highcharts.mod.Chart_ = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("chart")(renderTo.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.highcharts.mod.Chart_]
  @scala.inline
  def chart(
    renderTo: org.scalajs.dom.raw.HTMLElement,
    options: typingsSlinky.highcharts.mod.Options,
    callback: typingsSlinky.highcharts.mod.ChartCallbackFunction
  ): typingsSlinky.highcharts.mod.Chart_ = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("chart")(renderTo.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.highcharts.mod.Chart_]
  
  @scala.inline
  def charts: js.Array[js.UndefOr[typingsSlinky.highcharts.mod.Chart_]] = typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].selectDynamic("charts").asInstanceOf[js.Array[js.UndefOr[typingsSlinky.highcharts.mod.Chart_]]]
  @scala.inline
  def charts_=(x: js.Array[js.UndefOr[typingsSlinky.highcharts.mod.Chart_]]): scala.Unit = typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].updateDynamic("charts")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def clearTimeout(id: scala.Double): scala.Unit = typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("clearTimeout")(id.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def color(input: typingsSlinky.highcharts.mod.ColorType): typingsSlinky.highcharts.mod.Color_ = typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("color")(input.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.highcharts.mod.Color_]
  
  @scala.inline
  def correctFloat(num: scala.Double): scala.Double = typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("correctFloat")(num.asInstanceOf[js.Any]).asInstanceOf[scala.Double]
  @scala.inline
  def correctFloat(num: scala.Double, prec: scala.Double): scala.Double = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("correctFloat")(num.asInstanceOf[js.Any], prec.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  
  @scala.inline
  def createElement(tag: java.lang.String): org.scalajs.dom.raw.HTMLElement = typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(tag.asInstanceOf[js.Any]).asInstanceOf[org.scalajs.dom.raw.HTMLElement]
  @scala.inline
  def createElement(
    tag: java.lang.String,
    attribs: js.UndefOr[scala.Nothing],
    styles: js.UndefOr[scala.Nothing],
    parent: js.UndefOr[scala.Nothing],
    nopad: scala.Boolean
  ): org.scalajs.dom.raw.HTMLElement = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(tag.asInstanceOf[js.Any], attribs.asInstanceOf[js.Any], styles.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], nopad.asInstanceOf[js.Any])).asInstanceOf[org.scalajs.dom.raw.HTMLElement]
  @scala.inline
  def createElement(
    tag: java.lang.String,
    attribs: js.UndefOr[scala.Nothing],
    styles: js.UndefOr[scala.Nothing],
    parent: org.scalajs.dom.raw.HTMLElement
  ): org.scalajs.dom.raw.HTMLElement = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(tag.asInstanceOf[js.Any], attribs.asInstanceOf[js.Any], styles.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[org.scalajs.dom.raw.HTMLElement]
  @scala.inline
  def createElement(
    tag: java.lang.String,
    attribs: js.UndefOr[scala.Nothing],
    styles: js.UndefOr[scala.Nothing],
    parent: org.scalajs.dom.raw.HTMLElement,
    nopad: scala.Boolean
  ): org.scalajs.dom.raw.HTMLElement = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(tag.asInstanceOf[js.Any], attribs.asInstanceOf[js.Any], styles.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], nopad.asInstanceOf[js.Any])).asInstanceOf[org.scalajs.dom.raw.HTMLElement]
  @scala.inline
  def createElement(
    tag: java.lang.String,
    attribs: js.UndefOr[scala.Nothing],
    styles: typingsSlinky.highcharts.mod.CSSObject
  ): org.scalajs.dom.raw.HTMLElement = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(tag.asInstanceOf[js.Any], attribs.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[org.scalajs.dom.raw.HTMLElement]
  @scala.inline
  def createElement(
    tag: java.lang.String,
    attribs: js.UndefOr[scala.Nothing],
    styles: typingsSlinky.highcharts.mod.CSSObject,
    parent: js.UndefOr[scala.Nothing],
    nopad: scala.Boolean
  ): org.scalajs.dom.raw.HTMLElement = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(tag.asInstanceOf[js.Any], attribs.asInstanceOf[js.Any], styles.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], nopad.asInstanceOf[js.Any])).asInstanceOf[org.scalajs.dom.raw.HTMLElement]
  @scala.inline
  def createElement(
    tag: java.lang.String,
    attribs: js.UndefOr[scala.Nothing],
    styles: typingsSlinky.highcharts.mod.CSSObject,
    parent: org.scalajs.dom.raw.HTMLElement
  ): org.scalajs.dom.raw.HTMLElement = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(tag.asInstanceOf[js.Any], attribs.asInstanceOf[js.Any], styles.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[org.scalajs.dom.raw.HTMLElement]
  @scala.inline
  def createElement(
    tag: java.lang.String,
    attribs: js.UndefOr[scala.Nothing],
    styles: typingsSlinky.highcharts.mod.CSSObject,
    parent: org.scalajs.dom.raw.HTMLElement,
    nopad: scala.Boolean
  ): org.scalajs.dom.raw.HTMLElement = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(tag.asInstanceOf[js.Any], attribs.asInstanceOf[js.Any], styles.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], nopad.asInstanceOf[js.Any])).asInstanceOf[org.scalajs.dom.raw.HTMLElement]
  @scala.inline
  def createElement(tag: java.lang.String, attribs: typingsSlinky.highcharts.mod.HTMLAttributes): org.scalajs.dom.raw.HTMLElement = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(tag.asInstanceOf[js.Any], attribs.asInstanceOf[js.Any])).asInstanceOf[org.scalajs.dom.raw.HTMLElement]
  @scala.inline
  def createElement(
    tag: java.lang.String,
    attribs: typingsSlinky.highcharts.mod.HTMLAttributes,
    styles: js.UndefOr[scala.Nothing],
    parent: js.UndefOr[scala.Nothing],
    nopad: scala.Boolean
  ): org.scalajs.dom.raw.HTMLElement = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(tag.asInstanceOf[js.Any], attribs.asInstanceOf[js.Any], styles.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], nopad.asInstanceOf[js.Any])).asInstanceOf[org.scalajs.dom.raw.HTMLElement]
  @scala.inline
  def createElement(
    tag: java.lang.String,
    attribs: typingsSlinky.highcharts.mod.HTMLAttributes,
    styles: js.UndefOr[scala.Nothing],
    parent: org.scalajs.dom.raw.HTMLElement
  ): org.scalajs.dom.raw.HTMLElement = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(tag.asInstanceOf[js.Any], attribs.asInstanceOf[js.Any], styles.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[org.scalajs.dom.raw.HTMLElement]
  @scala.inline
  def createElement(
    tag: java.lang.String,
    attribs: typingsSlinky.highcharts.mod.HTMLAttributes,
    styles: js.UndefOr[scala.Nothing],
    parent: org.scalajs.dom.raw.HTMLElement,
    nopad: scala.Boolean
  ): org.scalajs.dom.raw.HTMLElement = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(tag.asInstanceOf[js.Any], attribs.asInstanceOf[js.Any], styles.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], nopad.asInstanceOf[js.Any])).asInstanceOf[org.scalajs.dom.raw.HTMLElement]
  @scala.inline
  def createElement(
    tag: java.lang.String,
    attribs: typingsSlinky.highcharts.mod.HTMLAttributes,
    styles: typingsSlinky.highcharts.mod.CSSObject
  ): org.scalajs.dom.raw.HTMLElement = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(tag.asInstanceOf[js.Any], attribs.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[org.scalajs.dom.raw.HTMLElement]
  @scala.inline
  def createElement(
    tag: java.lang.String,
    attribs: typingsSlinky.highcharts.mod.HTMLAttributes,
    styles: typingsSlinky.highcharts.mod.CSSObject,
    parent: js.UndefOr[scala.Nothing],
    nopad: scala.Boolean
  ): org.scalajs.dom.raw.HTMLElement = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(tag.asInstanceOf[js.Any], attribs.asInstanceOf[js.Any], styles.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], nopad.asInstanceOf[js.Any])).asInstanceOf[org.scalajs.dom.raw.HTMLElement]
  @scala.inline
  def createElement(
    tag: java.lang.String,
    attribs: typingsSlinky.highcharts.mod.HTMLAttributes,
    styles: typingsSlinky.highcharts.mod.CSSObject,
    parent: org.scalajs.dom.raw.HTMLElement
  ): org.scalajs.dom.raw.HTMLElement = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(tag.asInstanceOf[js.Any], attribs.asInstanceOf[js.Any], styles.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[org.scalajs.dom.raw.HTMLElement]
  @scala.inline
  def createElement(
    tag: java.lang.String,
    attribs: typingsSlinky.highcharts.mod.HTMLAttributes,
    styles: typingsSlinky.highcharts.mod.CSSObject,
    parent: org.scalajs.dom.raw.HTMLElement,
    nopad: scala.Boolean
  ): org.scalajs.dom.raw.HTMLElement = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(tag.asInstanceOf[js.Any], attribs.asInstanceOf[js.Any], styles.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], nopad.asInstanceOf[js.Any])).asInstanceOf[org.scalajs.dom.raw.HTMLElement]
  
  @scala.inline
  def css(el: org.scalajs.dom.raw.HTMLElement, styles: typingsSlinky.highcharts.mod.CSSObject): scala.Unit = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("css")(el.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def css(el: org.scalajs.dom.raw.SVGElement, styles: typingsSlinky.highcharts.mod.CSSObject): scala.Unit = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("css")(el.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def dateFormat(format: java.lang.String, timestamp: scala.Double): java.lang.String = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("dateFormat")(format.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def dateFormat(format: java.lang.String, timestamp: scala.Double, capitalize: scala.Boolean): java.lang.String = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("dateFormat")(format.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any], capitalize.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def dateFormats: typingsSlinky.highcharts.mod.Dictionary[typingsSlinky.highcharts.mod.TimeFormatCallbackFunction] = typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].selectDynamic("dateFormats").asInstanceOf[typingsSlinky.highcharts.mod.Dictionary[typingsSlinky.highcharts.mod.TimeFormatCallbackFunction]]
  @scala.inline
  def dateFormats_=(
    x: typingsSlinky.highcharts.mod.Dictionary[typingsSlinky.highcharts.mod.TimeFormatCallbackFunction]
  ): scala.Unit = typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].updateDynamic("dateFormats")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def defaultOptions: typingsSlinky.highcharts.mod.Options = typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].selectDynamic("defaultOptions").asInstanceOf[typingsSlinky.highcharts.mod.Options]
  @scala.inline
  def defaultOptions_=(x: typingsSlinky.highcharts.mod.Options): scala.Unit = typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def defined(obj: js.Any): scala.Boolean = typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("defined")(obj.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def destroyObjectProperties(obj: js.Any): scala.Unit = typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("destroyObjectProperties")(obj.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def destroyObjectProperties(obj: js.Any, except: js.Any): scala.Unit = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("destroyObjectProperties")(obj.asInstanceOf[js.Any], except.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def discardElement(element: org.scalajs.dom.raw.HTMLElement): scala.Unit = typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("discardElement")(element.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def each(arr: js.Array[_], fn: js.Function): scala.Unit = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("each")(arr.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def each(arr: js.Array[_], fn: js.Function, ctx: js.Any): scala.Unit = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("each")(arr.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def erase(arr: js.Array[_], item: js.Any): scala.Unit = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("erase")(arr.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def error(code: java.lang.String): scala.Unit = typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("error")(code.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def error(
    code: java.lang.String,
    stop: js.UndefOr[scala.Nothing],
    chart: js.UndefOr[scala.Nothing],
    params: typingsSlinky.highcharts.mod.Dictionary[java.lang.String]
  ): scala.Unit = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("error")(code.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], chart.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def error(
    code: java.lang.String,
    stop: js.UndefOr[scala.Nothing],
    chart: typingsSlinky.highcharts.mod.Chart_
  ): scala.Unit = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("error")(code.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], chart.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def error(
    code: java.lang.String,
    stop: js.UndefOr[scala.Nothing],
    chart: typingsSlinky.highcharts.mod.Chart_,
    params: typingsSlinky.highcharts.mod.Dictionary[java.lang.String]
  ): scala.Unit = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("error")(code.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], chart.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def error(code: java.lang.String, stop: scala.Boolean): scala.Unit = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("error")(code.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def error(
    code: java.lang.String,
    stop: scala.Boolean,
    chart: js.UndefOr[scala.Nothing],
    params: typingsSlinky.highcharts.mod.Dictionary[java.lang.String]
  ): scala.Unit = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("error")(code.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], chart.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def error(code: java.lang.String, stop: scala.Boolean, chart: typingsSlinky.highcharts.mod.Chart_): scala.Unit = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("error")(code.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], chart.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def error(
    code: java.lang.String,
    stop: scala.Boolean,
    chart: typingsSlinky.highcharts.mod.Chart_,
    params: typingsSlinky.highcharts.mod.Dictionary[java.lang.String]
  ): scala.Unit = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("error")(code.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], chart.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def error(code: scala.Double): scala.Unit = typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("error")(code.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def error(
    code: scala.Double,
    stop: js.UndefOr[scala.Nothing],
    chart: js.UndefOr[scala.Nothing],
    params: typingsSlinky.highcharts.mod.Dictionary[java.lang.String]
  ): scala.Unit = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("error")(code.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], chart.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def error(code: scala.Double, stop: js.UndefOr[scala.Nothing], chart: typingsSlinky.highcharts.mod.Chart_): scala.Unit = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("error")(code.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], chart.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def error(
    code: scala.Double,
    stop: js.UndefOr[scala.Nothing],
    chart: typingsSlinky.highcharts.mod.Chart_,
    params: typingsSlinky.highcharts.mod.Dictionary[java.lang.String]
  ): scala.Unit = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("error")(code.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], chart.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def error(code: scala.Double, stop: scala.Boolean): scala.Unit = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("error")(code.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def error(
    code: scala.Double,
    stop: scala.Boolean,
    chart: js.UndefOr[scala.Nothing],
    params: typingsSlinky.highcharts.mod.Dictionary[java.lang.String]
  ): scala.Unit = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("error")(code.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], chart.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def error(code: scala.Double, stop: scala.Boolean, chart: typingsSlinky.highcharts.mod.Chart_): scala.Unit = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("error")(code.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], chart.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def error(
    code: scala.Double,
    stop: scala.Boolean,
    chart: typingsSlinky.highcharts.mod.Chart_,
    params: typingsSlinky.highcharts.mod.Dictionary[java.lang.String]
  ): scala.Unit = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("error")(code.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], chart.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def extend[T](a: T, b: js.Object): T = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("extend")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def extend[T](a: js.UndefOr[scala.Nothing], b: js.Object): T = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("extend")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def extendClass[T](parent: typingsSlinky.highcharts.mod.Class[T], members: typingsSlinky.highcharts.mod.Dictionary[_]): typingsSlinky.highcharts.mod.Class[T] = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("extendClass")(parent.asInstanceOf[js.Any], members.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.highcharts.mod.Class[T]]
  
  @scala.inline
  def find[T](arr: js.Array[T], callback: js.Function): js.UndefOr[T] = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("find")(arr.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  @scala.inline
  def fireEvent[T](el: T, `type`: java.lang.String): scala.Unit = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("fireEvent")(el.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def fireEvent[T](
    el: T,
    `type`: java.lang.String,
    eventArguments: js.UndefOr[scala.Nothing],
    defaultFunction: js.Function
  ): scala.Unit = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("fireEvent")(el.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], eventArguments.asInstanceOf[js.Any], defaultFunction.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def fireEvent[T](
    el: T,
    `type`: java.lang.String,
    eventArguments: js.UndefOr[scala.Nothing],
    defaultFunction: typingsSlinky.highcharts.mod.EventCallbackFunction[T]
  ): scala.Unit = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("fireEvent")(el.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], eventArguments.asInstanceOf[js.Any], defaultFunction.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def fireEvent[T](el: T, `type`: java.lang.String, eventArguments: org.scalajs.dom.raw.Event): scala.Unit = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("fireEvent")(el.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], eventArguments.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def fireEvent[T](
    el: T,
    `type`: java.lang.String,
    eventArguments: org.scalajs.dom.raw.Event,
    defaultFunction: js.Function
  ): scala.Unit = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("fireEvent")(el.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], eventArguments.asInstanceOf[js.Any], defaultFunction.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def fireEvent[T](
    el: T,
    `type`: java.lang.String,
    eventArguments: org.scalajs.dom.raw.Event,
    defaultFunction: typingsSlinky.highcharts.mod.EventCallbackFunction[T]
  ): scala.Unit = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("fireEvent")(el.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], eventArguments.asInstanceOf[js.Any], defaultFunction.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def fireEvent[T](el: T, `type`: java.lang.String, eventArguments: typingsSlinky.highcharts.mod.Dictionary[_]): scala.Unit = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("fireEvent")(el.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], eventArguments.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def fireEvent[T](
    el: T,
    `type`: java.lang.String,
    eventArguments: typingsSlinky.highcharts.mod.Dictionary[_],
    defaultFunction: js.Function
  ): scala.Unit = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("fireEvent")(el.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], eventArguments.asInstanceOf[js.Any], defaultFunction.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def fireEvent[T](
    el: T,
    `type`: java.lang.String,
    eventArguments: typingsSlinky.highcharts.mod.Dictionary[_],
    defaultFunction: typingsSlinky.highcharts.mod.EventCallbackFunction[T]
  ): scala.Unit = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("fireEvent")(el.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], eventArguments.asInstanceOf[js.Any], defaultFunction.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def format(str: java.lang.String, ctx: typingsSlinky.std.Record[java.lang.String, _]): java.lang.String = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("format")(str.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def format(
    str: java.lang.String,
    ctx: typingsSlinky.std.Record[java.lang.String, _],
    chart: typingsSlinky.highcharts.mod.Chart_
  ): java.lang.String = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("format")(str.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], chart.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def getDeferredAnimation(chart: typingsSlinky.highcharts.mod.Chart_, animation: scala.Boolean): scala.Double = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getDeferredAnimation")(chart.asInstanceOf[js.Any], animation.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def getDeferredAnimation(
    chart: typingsSlinky.highcharts.mod.Chart_,
    animation: scala.Boolean,
    series: typingsSlinky.highcharts.mod.Series
  ): scala.Double = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getDeferredAnimation")(chart.asInstanceOf[js.Any], animation.asInstanceOf[js.Any], series.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def getDeferredAnimation(
    chart: typingsSlinky.highcharts.mod.Chart_,
    animation: typingsSlinky.highcharts.mod.AnimationOptionsObject
  ): scala.Double = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getDeferredAnimation")(chart.asInstanceOf[js.Any], animation.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def getDeferredAnimation(
    chart: typingsSlinky.highcharts.mod.Chart_,
    animation: typingsSlinky.highcharts.mod.AnimationOptionsObject,
    series: typingsSlinky.highcharts.mod.Series
  ): scala.Double = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getDeferredAnimation")(chart.asInstanceOf[js.Any], animation.asInstanceOf[js.Any], series.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  
  @scala.inline
  def getMagnitude(num: scala.Double): scala.Double = typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getMagnitude")(num.asInstanceOf[js.Any]).asInstanceOf[scala.Double]
  
  @scala.inline
  def getOptions(): typingsSlinky.highcharts.mod.Options = typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getOptions")().asInstanceOf[typingsSlinky.highcharts.mod.Options]
  
  @scala.inline
  def getStyle(el: org.scalajs.dom.raw.HTMLElement, prop: java.lang.String): scala.Double | java.lang.String = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getStyle")(el.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[scala.Double | java.lang.String]
  @scala.inline
  def getStyle(el: org.scalajs.dom.raw.HTMLElement, prop: java.lang.String, toInt: scala.Boolean): scala.Double | java.lang.String = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getStyle")(el.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], toInt.asInstanceOf[js.Any])).asInstanceOf[scala.Double | java.lang.String]
  
  @scala.inline
  def grep(arr: js.Array[_], callback: js.Function): js.Array[_] = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("grep")(arr.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[_]]
  
  @scala.inline
  def inArray(item: js.Any, arr: js.Array[_]): scala.Double = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("inArray")(item.asInstanceOf[js.Any], arr.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def inArray(item: js.Any, arr: js.Array[_], fromIndex: scala.Double): scala.Double = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("inArray")(item.asInstanceOf[js.Any], arr.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  
  @scala.inline
  def isArray(obj: js.Any): scala.Boolean = typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(obj.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isClass(): scala.Boolean = typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isClass")().asInstanceOf[scala.Boolean]
  @scala.inline
  def isClass(obj: js.Object): scala.Boolean = typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isClass")(obj.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isDOMElement(obj: js.Any): scala.Boolean = typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isDOMElement")(obj.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isNumber(n: js.Any): scala.Boolean = typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(n.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isObject(obj: js.Any): scala.Boolean = typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(obj.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  @scala.inline
  def isObject(obj: js.Any, strict: scala.Boolean): scala.Boolean = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(obj.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isString(s: js.Any): scala.Boolean = typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isString")(s.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def keys(obj: js.Any): js.Array[java.lang.String] = typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("keys")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]
  
  @scala.inline
  def map(arr: js.Array[_], fn: js.Function): js.Array[_] = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("map")(arr.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Array[_]]
  
  @scala.inline
  def merge[T](a: T, n: js.UndefOr[js.Object]*): T = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("merge")(a.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def merge[T](a: js.UndefOr[scala.Nothing], n: js.UndefOr[js.Object]*): T = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("merge")(a.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def merge[T](extend: scala.Boolean, a: T, n: js.UndefOr[js.Object]*): T = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("merge")(extend.asInstanceOf[js.Any], a.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def merge[T](extend: scala.Boolean, a: js.UndefOr[scala.Nothing], n: js.UndefOr[js.Object]*): T = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("merge")(extend.asInstanceOf[js.Any], a.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def normalizeTickInterval(interval: scala.Double): scala.Double = typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("normalizeTickInterval")(interval.asInstanceOf[js.Any]).asInstanceOf[scala.Double]
  @scala.inline
  def normalizeTickInterval(
    interval: scala.Double,
    multiples: js.UndefOr[scala.Nothing],
    magnitude: js.UndefOr[scala.Nothing],
    allowDecimals: js.UndefOr[scala.Nothing],
    hasTickAmount: scala.Boolean
  ): scala.Double = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("normalizeTickInterval")(interval.asInstanceOf[js.Any], multiples.asInstanceOf[js.Any], magnitude.asInstanceOf[js.Any], allowDecimals.asInstanceOf[js.Any], hasTickAmount.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def normalizeTickInterval(
    interval: scala.Double,
    multiples: js.UndefOr[scala.Nothing],
    magnitude: js.UndefOr[scala.Nothing],
    allowDecimals: scala.Boolean
  ): scala.Double = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("normalizeTickInterval")(interval.asInstanceOf[js.Any], multiples.asInstanceOf[js.Any], magnitude.asInstanceOf[js.Any], allowDecimals.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def normalizeTickInterval(
    interval: scala.Double,
    multiples: js.UndefOr[scala.Nothing],
    magnitude: js.UndefOr[scala.Nothing],
    allowDecimals: scala.Boolean,
    hasTickAmount: scala.Boolean
  ): scala.Double = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("normalizeTickInterval")(interval.asInstanceOf[js.Any], multiples.asInstanceOf[js.Any], magnitude.asInstanceOf[js.Any], allowDecimals.asInstanceOf[js.Any], hasTickAmount.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def normalizeTickInterval(interval: scala.Double, multiples: js.UndefOr[scala.Nothing], magnitude: scala.Double): scala.Double = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("normalizeTickInterval")(interval.asInstanceOf[js.Any], multiples.asInstanceOf[js.Any], magnitude.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def normalizeTickInterval(
    interval: scala.Double,
    multiples: js.UndefOr[scala.Nothing],
    magnitude: scala.Double,
    allowDecimals: js.UndefOr[scala.Nothing],
    hasTickAmount: scala.Boolean
  ): scala.Double = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("normalizeTickInterval")(interval.asInstanceOf[js.Any], multiples.asInstanceOf[js.Any], magnitude.asInstanceOf[js.Any], allowDecimals.asInstanceOf[js.Any], hasTickAmount.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def normalizeTickInterval(
    interval: scala.Double,
    multiples: js.UndefOr[scala.Nothing],
    magnitude: scala.Double,
    allowDecimals: scala.Boolean
  ): scala.Double = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("normalizeTickInterval")(interval.asInstanceOf[js.Any], multiples.asInstanceOf[js.Any], magnitude.asInstanceOf[js.Any], allowDecimals.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def normalizeTickInterval(
    interval: scala.Double,
    multiples: js.UndefOr[scala.Nothing],
    magnitude: scala.Double,
    allowDecimals: scala.Boolean,
    hasTickAmount: scala.Boolean
  ): scala.Double = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("normalizeTickInterval")(interval.asInstanceOf[js.Any], multiples.asInstanceOf[js.Any], magnitude.asInstanceOf[js.Any], allowDecimals.asInstanceOf[js.Any], hasTickAmount.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def normalizeTickInterval(interval: scala.Double, multiples: js.Array[_]): scala.Double = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("normalizeTickInterval")(interval.asInstanceOf[js.Any], multiples.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def normalizeTickInterval(
    interval: scala.Double,
    multiples: js.Array[_],
    magnitude: js.UndefOr[scala.Nothing],
    allowDecimals: js.UndefOr[scala.Nothing],
    hasTickAmount: scala.Boolean
  ): scala.Double = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("normalizeTickInterval")(interval.asInstanceOf[js.Any], multiples.asInstanceOf[js.Any], magnitude.asInstanceOf[js.Any], allowDecimals.asInstanceOf[js.Any], hasTickAmount.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def normalizeTickInterval(
    interval: scala.Double,
    multiples: js.Array[_],
    magnitude: js.UndefOr[scala.Nothing],
    allowDecimals: scala.Boolean
  ): scala.Double = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("normalizeTickInterval")(interval.asInstanceOf[js.Any], multiples.asInstanceOf[js.Any], magnitude.asInstanceOf[js.Any], allowDecimals.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def normalizeTickInterval(
    interval: scala.Double,
    multiples: js.Array[_],
    magnitude: js.UndefOr[scala.Nothing],
    allowDecimals: scala.Boolean,
    hasTickAmount: scala.Boolean
  ): scala.Double = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("normalizeTickInterval")(interval.asInstanceOf[js.Any], multiples.asInstanceOf[js.Any], magnitude.asInstanceOf[js.Any], allowDecimals.asInstanceOf[js.Any], hasTickAmount.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def normalizeTickInterval(interval: scala.Double, multiples: js.Array[_], magnitude: scala.Double): scala.Double = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("normalizeTickInterval")(interval.asInstanceOf[js.Any], multiples.asInstanceOf[js.Any], magnitude.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def normalizeTickInterval(
    interval: scala.Double,
    multiples: js.Array[_],
    magnitude: scala.Double,
    allowDecimals: js.UndefOr[scala.Nothing],
    hasTickAmount: scala.Boolean
  ): scala.Double = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("normalizeTickInterval")(interval.asInstanceOf[js.Any], multiples.asInstanceOf[js.Any], magnitude.asInstanceOf[js.Any], allowDecimals.asInstanceOf[js.Any], hasTickAmount.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def normalizeTickInterval(
    interval: scala.Double,
    multiples: js.Array[_],
    magnitude: scala.Double,
    allowDecimals: scala.Boolean
  ): scala.Double = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("normalizeTickInterval")(interval.asInstanceOf[js.Any], multiples.asInstanceOf[js.Any], magnitude.asInstanceOf[js.Any], allowDecimals.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def normalizeTickInterval(
    interval: scala.Double,
    multiples: js.Array[_],
    magnitude: scala.Double,
    allowDecimals: scala.Boolean,
    hasTickAmount: scala.Boolean
  ): scala.Double = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("normalizeTickInterval")(interval.asInstanceOf[js.Any], multiples.asInstanceOf[js.Any], magnitude.asInstanceOf[js.Any], allowDecimals.asInstanceOf[js.Any], hasTickAmount.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  
  @scala.inline
  def numberFormat(number: scala.Double, decimals: scala.Double): java.lang.String = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("numberFormat")(number.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def numberFormat(
    number: scala.Double,
    decimals: scala.Double,
    decimalPoint: js.UndefOr[scala.Nothing],
    thousandsSep: java.lang.String
  ): java.lang.String = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("numberFormat")(number.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any], decimalPoint.asInstanceOf[js.Any], thousandsSep.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def numberFormat(number: scala.Double, decimals: scala.Double, decimalPoint: java.lang.String): java.lang.String = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("numberFormat")(number.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any], decimalPoint.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def numberFormat(
    number: scala.Double,
    decimals: scala.Double,
    decimalPoint: java.lang.String,
    thousandsSep: java.lang.String
  ): java.lang.String = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("numberFormat")(number.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any], decimalPoint.asInstanceOf[js.Any], thousandsSep.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def objectEach[T](obj: js.Any, fn: typingsSlinky.highcharts.mod.ObjectEachCallbackFunction[T]): scala.Unit = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("objectEach")(obj.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def objectEach[T](obj: js.Any, fn: typingsSlinky.highcharts.mod.ObjectEachCallbackFunction[T], ctx: T): scala.Unit = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("objectEach")(obj.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def offset(el: org.scalajs.dom.raw.Element): typingsSlinky.highcharts.mod.OffsetObject = typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("offset")(el.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.highcharts.mod.OffsetObject]
  
  @scala.inline
  def pad(number: scala.Double): java.lang.String = typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pad")(number.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def pad(number: scala.Double, length: js.UndefOr[scala.Nothing], padder: java.lang.String): java.lang.String = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pad")(number.asInstanceOf[js.Any], length.asInstanceOf[js.Any], padder.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def pad(number: scala.Double, length: scala.Double): java.lang.String = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pad")(number.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def pad(number: scala.Double, length: scala.Double, padder: java.lang.String): java.lang.String = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pad")(number.asInstanceOf[js.Any], length.asInstanceOf[js.Any], padder.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def pick[T](items: (js.UndefOr[T | scala.Null])*): T = typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pick")(items.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def reduce(arr: js.Array[_], fn: js.Function, initialValue: js.Any): js.Any = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(arr.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def relativeLength(value: typingsSlinky.highcharts.mod.RelativeSize, base: scala.Double): scala.Double = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("relativeLength")(value.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def relativeLength(value: typingsSlinky.highcharts.mod.RelativeSize, base: scala.Double, offset: scala.Double): scala.Double = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("relativeLength")(value.asInstanceOf[js.Any], base.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  
  @scala.inline
  def removeEvent[T](el: T): scala.Unit = typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("removeEvent")(el.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def removeEvent[T](
    el: T,
    `type`: js.UndefOr[scala.Nothing],
    fn: typingsSlinky.highcharts.mod.EventCallbackFunction[T]
  ): scala.Unit = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("removeEvent")(el.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def removeEvent[T](el: T, `type`: java.lang.String): scala.Unit = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("removeEvent")(el.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def removeEvent[T](el: T, `type`: java.lang.String, fn: typingsSlinky.highcharts.mod.EventCallbackFunction[T]): scala.Unit = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("removeEvent")(el.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def removeEvent[T](el: typingsSlinky.highcharts.mod.Class[T]): scala.Unit = typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("removeEvent")(el.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def removeEvent[T](
    el: typingsSlinky.highcharts.mod.Class[T],
    `type`: js.UndefOr[scala.Nothing],
    fn: typingsSlinky.highcharts.mod.EventCallbackFunction[T]
  ): scala.Unit = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("removeEvent")(el.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def removeEvent[T](el: typingsSlinky.highcharts.mod.Class[T], `type`: java.lang.String): scala.Unit = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("removeEvent")(el.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def removeEvent[T](
    el: typingsSlinky.highcharts.mod.Class[T],
    `type`: java.lang.String,
    fn: typingsSlinky.highcharts.mod.EventCallbackFunction[T]
  ): scala.Unit = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("removeEvent")(el.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def seriesType(
    `type`: java.lang.String,
    parent: java.lang.String,
    options: typingsSlinky.highcharts.mod.Dictionary[_]
  ): typingsSlinky.highcharts.mod.Series = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("seriesType")(`type`.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.highcharts.mod.Series]
  @scala.inline
  def seriesType(
    `type`: java.lang.String,
    parent: java.lang.String,
    options: typingsSlinky.highcharts.mod.Dictionary[_],
    props: js.UndefOr[scala.Nothing],
    pointProps: typingsSlinky.highcharts.mod.Dictionary[_]
  ): typingsSlinky.highcharts.mod.Series = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("seriesType")(`type`.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], options.asInstanceOf[js.Any], props.asInstanceOf[js.Any], pointProps.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.highcharts.mod.Series]
  @scala.inline
  def seriesType(
    `type`: java.lang.String,
    parent: java.lang.String,
    options: typingsSlinky.highcharts.mod.Dictionary[_],
    props: typingsSlinky.highcharts.mod.Dictionary[_]
  ): typingsSlinky.highcharts.mod.Series = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("seriesType")(`type`.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], options.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.highcharts.mod.Series]
  @scala.inline
  def seriesType(
    `type`: java.lang.String,
    parent: java.lang.String,
    options: typingsSlinky.highcharts.mod.Dictionary[_],
    props: typingsSlinky.highcharts.mod.Dictionary[_],
    pointProps: typingsSlinky.highcharts.mod.Dictionary[_]
  ): typingsSlinky.highcharts.mod.Series = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("seriesType")(`type`.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], options.asInstanceOf[js.Any], props.asInstanceOf[js.Any], pointProps.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.highcharts.mod.Series]
  @scala.inline
  def seriesType(
    `type`: java.lang.String,
    parent: java.lang.String,
    options: typingsSlinky.highcharts.mod.SeriesOptionsType
  ): typingsSlinky.highcharts.mod.Series = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("seriesType")(`type`.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.highcharts.mod.Series]
  @scala.inline
  def seriesType(
    `type`: java.lang.String,
    parent: java.lang.String,
    options: typingsSlinky.highcharts.mod.SeriesOptionsType,
    props: js.UndefOr[scala.Nothing],
    pointProps: typingsSlinky.highcharts.mod.Dictionary[_]
  ): typingsSlinky.highcharts.mod.Series = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("seriesType")(`type`.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], options.asInstanceOf[js.Any], props.asInstanceOf[js.Any], pointProps.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.highcharts.mod.Series]
  @scala.inline
  def seriesType(
    `type`: java.lang.String,
    parent: java.lang.String,
    options: typingsSlinky.highcharts.mod.SeriesOptionsType,
    props: typingsSlinky.highcharts.mod.Dictionary[_]
  ): typingsSlinky.highcharts.mod.Series = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("seriesType")(`type`.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], options.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.highcharts.mod.Series]
  @scala.inline
  def seriesType(
    `type`: java.lang.String,
    parent: java.lang.String,
    options: typingsSlinky.highcharts.mod.SeriesOptionsType,
    props: typingsSlinky.highcharts.mod.Dictionary[_],
    pointProps: typingsSlinky.highcharts.mod.Dictionary[_]
  ): typingsSlinky.highcharts.mod.Series = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("seriesType")(`type`.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], options.asInstanceOf[js.Any], props.asInstanceOf[js.Any], pointProps.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.highcharts.mod.Series]
  
  @scala.inline
  def setAnimation(animation: js.UndefOr[scala.Nothing], chart: typingsSlinky.highcharts.mod.Chart_): scala.Unit = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setAnimation")(animation.asInstanceOf[js.Any], chart.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def setAnimation(animation: scala.Boolean, chart: typingsSlinky.highcharts.mod.Chart_): scala.Unit = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setAnimation")(animation.asInstanceOf[js.Any], chart.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def setAnimation(
    animation: typingsSlinky.highcharts.anon.PartialAnimationOptionsOb,
    chart: typingsSlinky.highcharts.mod.Chart_
  ): scala.Unit = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setAnimation")(animation.asInstanceOf[js.Any], chart.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setOptions(options: typingsSlinky.highcharts.mod.Options): typingsSlinky.highcharts.mod.Options = typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setOptions")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.highcharts.mod.Options]
  
  @scala.inline
  def some(arr: js.Array[_], fn: js.Function, ctx: js.Any): scala.Boolean = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("some")(arr.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def splat(obj: js.Any): js.Array[_] = typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("splat")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[_]]
  
  @scala.inline
  def stableSort(arr: js.Array[_], sortFunction: js.Function): scala.Unit = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("stableSort")(arr.asInstanceOf[js.Any], sortFunction.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def stop(el: typingsSlinky.highcharts.mod.SVGElement): scala.Unit = typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("stop")(el.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def stop(el: typingsSlinky.highcharts.mod.SVGElement, prop: java.lang.String): scala.Unit = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("stop")(el.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def syncTimeout(fn: js.Function, delay: scala.Double): scala.Double = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("syncTimeout")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def syncTimeout(fn: js.Function, delay: scala.Double, context: js.Any): scala.Double = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("syncTimeout")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  
  @scala.inline
  def theme: typingsSlinky.highcharts.mod.Options = typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].selectDynamic("theme").asInstanceOf[typingsSlinky.highcharts.mod.Options]
  @scala.inline
  def theme_=(x: typingsSlinky.highcharts.mod.Options): scala.Unit = typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].updateDynamic("theme")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def time: typingsSlinky.highcharts.mod.Time_ = typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].selectDynamic("time").asInstanceOf[typingsSlinky.highcharts.mod.Time_]
  @scala.inline
  def time_=(x: typingsSlinky.highcharts.mod.Time_): scala.Unit = typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].updateDynamic("time")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def uniqueKey(): java.lang.String = typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("uniqueKey")().asInstanceOf[java.lang.String]
  
  @scala.inline
  def useSerialIds(): js.UndefOr[scala.Boolean] = typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useSerialIds")().asInstanceOf[js.UndefOr[scala.Boolean]]
  @scala.inline
  def useSerialIds(mode: scala.Boolean): js.UndefOr[scala.Boolean] = typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useSerialIds")(mode.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[scala.Boolean]]
  
  @scala.inline
  def wrap(obj: js.Any, method: java.lang.String, func: typingsSlinky.highcharts.mod.WrapProceedFunction): scala.Unit = (typingsSlinky.highcharts.mod.^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(obj.asInstanceOf[js.Any], method.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
}
