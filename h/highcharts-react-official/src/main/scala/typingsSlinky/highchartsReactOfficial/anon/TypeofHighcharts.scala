package typingsSlinky.highchartsReactOfficial.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.highcharts.mod.AnimationOptionsObject
import typingsSlinky.highcharts.mod.AnnotationControlPointOptionsObject
import typingsSlinky.highcharts.mod.AnnotationControllable
import typingsSlinky.highcharts.mod.AnnotationsOptions
import typingsSlinky.highcharts.mod.Axis
import typingsSlinky.highcharts.mod.AxisOptions
import typingsSlinky.highcharts.mod.CSSObject
import typingsSlinky.highcharts.mod.ChartCallbackFunction
import typingsSlinky.highcharts.mod.Chart_
import typingsSlinky.highcharts.mod.Class
import typingsSlinky.highcharts.mod.ColorAxisOptions
import typingsSlinky.highcharts.mod.ColorType
import typingsSlinky.highcharts.mod.Color_
import typingsSlinky.highcharts.mod.Dictionary
import typingsSlinky.highcharts.mod.EventCallbackFunction
import typingsSlinky.highcharts.mod.EventOptionsObject
import typingsSlinky.highcharts.mod.HTMLAttributes
import typingsSlinky.highcharts.mod.LegendOptions
import typingsSlinky.highcharts.mod.ObjectEachCallbackFunction
import typingsSlinky.highcharts.mod.OffsetObject
import typingsSlinky.highcharts.mod.Options
import typingsSlinky.highcharts.mod.RelativeSize
import typingsSlinky.highcharts.mod.SVGAttributes
import typingsSlinky.highcharts.mod.SVGElement
import typingsSlinky.highcharts.mod.Series
import typingsSlinky.highcharts.mod.SeriesOptionsType
import typingsSlinky.highcharts.mod.TimeFormatCallbackFunction
import typingsSlinky.highcharts.mod.TimeOptions
import typingsSlinky.highcharts.mod.Time_
import typingsSlinky.highcharts.mod.TooltipOptions
import typingsSlinky.highcharts.mod.WrapProceedFunction
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofHighcharts extends js.Object {
  var Annotation: Instantiable2[
    /* chart */ Chart_, 
    /* userOptions */ AnnotationsOptions, 
    typingsSlinky.highcharts.mod.Annotation
  ] = js.native
  var AnnotationControlPoint: Instantiable3[
    /* chart */ Chart_, 
    /* target */ AnnotationControllable, 
    /* options */ AnnotationControlPointOptionsObject, 
    typingsSlinky.highcharts.mod.AnnotationControlPoint
  ] = js.native
  var Axis: Instantiable2[/* chart */ Chart_, /* userOptions */ AxisOptions, typingsSlinky.highcharts.mod.Axis] = js.native
  var Chart: Instantiable1[/* options */ Options, Chart_] = js.native
  var Color: TypeofColor = js.native
  var ColorAxis: Instantiable2[
    /* chart */ Chart_, 
    /* userOptions */ ColorAxisOptions, 
    typingsSlinky.highcharts.mod.ColorAxis
  ] = js.native
  var Legend: Instantiable2[/* chart */ Chart_, /* options */ LegendOptions, typingsSlinky.highcharts.mod.Legend] = js.native
  var PlotLineOrBand: Instantiable1[/* axis */ Axis, typingsSlinky.highcharts.mod.PlotLineOrBand] = js.native
  var Point: Instantiable0[typingsSlinky.highcharts.mod.Point] = js.native
  var Pointer: Instantiable2[/* chart */ Chart_, /* options */ Options, typingsSlinky.highcharts.mod.Pointer] = js.native
  var SVGElement: Instantiable0[typingsSlinky.highcharts.mod.SVGElement] = js.native
  var SVGRenderer: Instantiable3[
    HTMLElement, 
    /* width */ Double, 
    /* height */ Double, 
    typingsSlinky.highcharts.mod.SVGRenderer
  ] = js.native
  var Series: Instantiable2[/* chart */ Chart_, /* options */ js.Object, typingsSlinky.highcharts.mod.Series] = js.native
  var Tick: Instantiable2[/* axis */ Axis, /* pos */ Double, typingsSlinky.highcharts.mod.Tick] = js.native
  var Time: Instantiable1[/* options */ TimeOptions, Time_] = js.native
  var Tooltip: Instantiable2[
    /* chart */ Chart_, 
    /* options */ TooltipOptions, 
    typingsSlinky.highcharts.mod.Tooltip
  ] = js.native
  var charts: js.Array[js.UndefOr[Chart_]] = js.native
  var dateFormats: Dictionary[TimeFormatCallbackFunction] = js.native
  var defaultOptions: Options = js.native
  var time: Time_ = js.native
  def addEvent[T](el: T, `type`: String, fn: js.Function): js.Function = js.native
  def addEvent[T](el: T, `type`: String, fn: js.Function, options: EventOptionsObject): js.Function = js.native
  def addEvent[T](el: T, `type`: String, fn: EventCallbackFunction[T]): js.Function = js.native
  def addEvent[T](el: T, `type`: String, fn: EventCallbackFunction[T], options: EventOptionsObject): js.Function = js.native
  def addEvent[T](el: Class[T], `type`: String, fn: js.Function): js.Function = js.native
  def addEvent[T](el: Class[T], `type`: String, fn: js.Function, options: EventOptionsObject): js.Function = js.native
  def addEvent[T](el: Class[T], `type`: String, fn: EventCallbackFunction[T]): js.Function = js.native
  def addEvent[T](el: Class[T], `type`: String, fn: EventCallbackFunction[T], options: EventOptionsObject): js.Function = js.native
  def animObject(): AnimationOptionsObject = js.native
  def animObject(animation: Boolean): AnimationOptionsObject = js.native
  def animObject(animation: AnimationOptionsObject): AnimationOptionsObject = js.native
  def animate(el: HTMLElement, params: CSSObject): Unit = js.native
  def animate(el: HTMLElement, params: CSSObject, opt: AnimationOptionsObject): Unit = js.native
  def animate(el: HTMLElement, params: SVGAttributes): Unit = js.native
  def animate(el: HTMLElement, params: SVGAttributes, opt: AnimationOptionsObject): Unit = js.native
  def animate(el: SVGElement, params: CSSObject): Unit = js.native
  def animate(el: SVGElement, params: CSSObject, opt: AnimationOptionsObject): Unit = js.native
  def animate(el: SVGElement, params: SVGAttributes): Unit = js.native
  def animate(el: SVGElement, params: SVGAttributes, opt: AnimationOptionsObject): Unit = js.native
  def arrayMax(data: js.Array[_]): Double = js.native
  def arrayMin(data: js.Array[_]): Double = js.native
  def attr(elem: HTMLElement): js.UndefOr[String | Null] = js.native
  def attr(elem: HTMLElement, prop: js.UndefOr[scala.Nothing], value: String): js.UndefOr[String | Null] = js.native
  def attr(elem: HTMLElement, prop: js.UndefOr[scala.Nothing], value: Double): js.UndefOr[String | Null] = js.native
  def attr(elem: HTMLElement, prop: String): js.UndefOr[String | Null] = js.native
  def attr(elem: HTMLElement, prop: String, value: String): js.UndefOr[String | Null] = js.native
  def attr(elem: HTMLElement, prop: String, value: Double): js.UndefOr[String | Null] = js.native
  def attr(elem: HTMLElement, prop: HTMLAttributes): js.UndefOr[String | Null] = js.native
  def attr(elem: HTMLElement, prop: HTMLAttributes, value: String): js.UndefOr[String | Null] = js.native
  def attr(elem: HTMLElement, prop: HTMLAttributes, value: Double): js.UndefOr[String | Null] = js.native
  def attr(elem: HTMLElement, prop: SVGAttributes): js.UndefOr[String | Null] = js.native
  def attr(elem: HTMLElement, prop: SVGAttributes, value: String): js.UndefOr[String | Null] = js.native
  def attr(elem: HTMLElement, prop: SVGAttributes, value: Double): js.UndefOr[String | Null] = js.native
  def attr(elem: org.scalajs.dom.raw.SVGElement): js.UndefOr[String | Null] = js.native
  def attr(elem: org.scalajs.dom.raw.SVGElement, prop: js.UndefOr[scala.Nothing], value: String): js.UndefOr[String | Null] = js.native
  def attr(elem: org.scalajs.dom.raw.SVGElement, prop: js.UndefOr[scala.Nothing], value: Double): js.UndefOr[String | Null] = js.native
  def attr(elem: org.scalajs.dom.raw.SVGElement, prop: String): js.UndefOr[String | Null] = js.native
  def attr(elem: org.scalajs.dom.raw.SVGElement, prop: String, value: String): js.UndefOr[String | Null] = js.native
  def attr(elem: org.scalajs.dom.raw.SVGElement, prop: String, value: Double): js.UndefOr[String | Null] = js.native
  def attr(elem: org.scalajs.dom.raw.SVGElement, prop: HTMLAttributes): js.UndefOr[String | Null] = js.native
  def attr(elem: org.scalajs.dom.raw.SVGElement, prop: HTMLAttributes, value: String): js.UndefOr[String | Null] = js.native
  def attr(elem: org.scalajs.dom.raw.SVGElement, prop: HTMLAttributes, value: Double): js.UndefOr[String | Null] = js.native
  def attr(elem: org.scalajs.dom.raw.SVGElement, prop: SVGAttributes): js.UndefOr[String | Null] = js.native
  def attr(elem: org.scalajs.dom.raw.SVGElement, prop: SVGAttributes, value: String): js.UndefOr[String | Null] = js.native
  def attr(elem: org.scalajs.dom.raw.SVGElement, prop: SVGAttributes, value: Double): js.UndefOr[String | Null] = js.native
  def chart(options: Options): Chart_ = js.native
  def chart(options: Options, callback: ChartCallbackFunction): Chart_ = js.native
  def chart(renderTo: String, options: Options): Chart_ = js.native
  def chart(renderTo: String, options: Options, callback: ChartCallbackFunction): Chart_ = js.native
  def chart(renderTo: HTMLElement, options: Options): Chart_ = js.native
  def chart(renderTo: HTMLElement, options: Options, callback: ChartCallbackFunction): Chart_ = js.native
  def clearTimeout(id: Double): Unit = js.native
  def color(input: ColorType): Color_ = js.native
  def correctFloat(num: Double): Double = js.native
  def correctFloat(num: Double, prec: Double): Double = js.native
  def createElement(tag: String): HTMLElement = js.native
  def createElement(
    tag: String,
    attribs: js.UndefOr[scala.Nothing],
    styles: js.UndefOr[scala.Nothing],
    parent: js.UndefOr[scala.Nothing],
    nopad: Boolean
  ): HTMLElement = js.native
  def createElement(
    tag: String,
    attribs: js.UndefOr[scala.Nothing],
    styles: js.UndefOr[scala.Nothing],
    parent: HTMLElement
  ): HTMLElement = js.native
  def createElement(
    tag: String,
    attribs: js.UndefOr[scala.Nothing],
    styles: js.UndefOr[scala.Nothing],
    parent: HTMLElement,
    nopad: Boolean
  ): HTMLElement = js.native
  def createElement(tag: String, attribs: js.UndefOr[scala.Nothing], styles: CSSObject): HTMLElement = js.native
  def createElement(
    tag: String,
    attribs: js.UndefOr[scala.Nothing],
    styles: CSSObject,
    parent: js.UndefOr[scala.Nothing],
    nopad: Boolean
  ): HTMLElement = js.native
  def createElement(tag: String, attribs: js.UndefOr[scala.Nothing], styles: CSSObject, parent: HTMLElement): HTMLElement = js.native
  def createElement(
    tag: String,
    attribs: js.UndefOr[scala.Nothing],
    styles: CSSObject,
    parent: HTMLElement,
    nopad: Boolean
  ): HTMLElement = js.native
  def createElement(tag: String, attribs: HTMLAttributes): HTMLElement = js.native
  def createElement(
    tag: String,
    attribs: HTMLAttributes,
    styles: js.UndefOr[scala.Nothing],
    parent: js.UndefOr[scala.Nothing],
    nopad: Boolean
  ): HTMLElement = js.native
  def createElement(tag: String, attribs: HTMLAttributes, styles: js.UndefOr[scala.Nothing], parent: HTMLElement): HTMLElement = js.native
  def createElement(
    tag: String,
    attribs: HTMLAttributes,
    styles: js.UndefOr[scala.Nothing],
    parent: HTMLElement,
    nopad: Boolean
  ): HTMLElement = js.native
  def createElement(tag: String, attribs: HTMLAttributes, styles: CSSObject): HTMLElement = js.native
  def createElement(
    tag: String,
    attribs: HTMLAttributes,
    styles: CSSObject,
    parent: js.UndefOr[scala.Nothing],
    nopad: Boolean
  ): HTMLElement = js.native
  def createElement(tag: String, attribs: HTMLAttributes, styles: CSSObject, parent: HTMLElement): HTMLElement = js.native
  def createElement(tag: String, attribs: HTMLAttributes, styles: CSSObject, parent: HTMLElement, nopad: Boolean): HTMLElement = js.native
  def css(el: HTMLElement, styles: CSSObject): Unit = js.native
  def css(el: org.scalajs.dom.raw.SVGElement, styles: CSSObject): Unit = js.native
  def dateFormat(format: String, timestamp: Double): String = js.native
  def dateFormat(format: String, timestamp: Double, capitalize: Boolean): String = js.native
  def defined(obj: js.Any): Boolean = js.native
  def destroyObjectProperties(obj: js.Any): Unit = js.native
  def destroyObjectProperties(obj: js.Any, except: js.Any): Unit = js.native
  def discardElement(element: HTMLElement): Unit = js.native
  def each(arr: js.Array[_], fn: js.Function): Unit = js.native
  def each(arr: js.Array[_], fn: js.Function, ctx: js.Any): Unit = js.native
  def erase(arr: js.Array[_], item: js.Any): Unit = js.native
  def error(code: String): Unit = js.native
  def error(
    code: String,
    stop: js.UndefOr[scala.Nothing],
    chart: js.UndefOr[scala.Nothing],
    params: Dictionary[String]
  ): Unit = js.native
  def error(code: String, stop: js.UndefOr[scala.Nothing], chart: Chart_): Unit = js.native
  def error(code: String, stop: js.UndefOr[scala.Nothing], chart: Chart_, params: Dictionary[String]): Unit = js.native
  def error(code: String, stop: Boolean): Unit = js.native
  def error(code: String, stop: Boolean, chart: js.UndefOr[scala.Nothing], params: Dictionary[String]): Unit = js.native
  def error(code: String, stop: Boolean, chart: Chart_): Unit = js.native
  def error(code: String, stop: Boolean, chart: Chart_, params: Dictionary[String]): Unit = js.native
  def error(code: Double): Unit = js.native
  def error(
    code: Double,
    stop: js.UndefOr[scala.Nothing],
    chart: js.UndefOr[scala.Nothing],
    params: Dictionary[String]
  ): Unit = js.native
  def error(code: Double, stop: js.UndefOr[scala.Nothing], chart: Chart_): Unit = js.native
  def error(code: Double, stop: js.UndefOr[scala.Nothing], chart: Chart_, params: Dictionary[String]): Unit = js.native
  def error(code: Double, stop: Boolean): Unit = js.native
  def error(code: Double, stop: Boolean, chart: js.UndefOr[scala.Nothing], params: Dictionary[String]): Unit = js.native
  def error(code: Double, stop: Boolean, chart: Chart_): Unit = js.native
  def error(code: Double, stop: Boolean, chart: Chart_, params: Dictionary[String]): Unit = js.native
  def extend[T](a: T, b: js.Object): T = js.native
  def extend[T](a: js.UndefOr[scala.Nothing], b: js.Object): T = js.native
  def extendClass[T](parent: Class[T], members: Dictionary[_]): Class[T] = js.native
  def find[T](arr: js.Array[T], callback: js.Function): js.UndefOr[T] = js.native
  def fireEvent[T](el: T, `type`: String): Unit = js.native
  def fireEvent[T](el: T, `type`: String, eventArguments: js.UndefOr[scala.Nothing], defaultFunction: js.Function): Unit = js.native
  def fireEvent[T](
    el: T,
    `type`: String,
    eventArguments: js.UndefOr[scala.Nothing],
    defaultFunction: EventCallbackFunction[T]
  ): Unit = js.native
  def fireEvent[T](el: T, `type`: String, eventArguments: Dictionary[_]): Unit = js.native
  def fireEvent[T](el: T, `type`: String, eventArguments: Dictionary[_], defaultFunction: js.Function): Unit = js.native
  def fireEvent[T](el: T, `type`: String, eventArguments: Dictionary[_], defaultFunction: EventCallbackFunction[T]): Unit = js.native
  def fireEvent[T](el: T, `type`: String, eventArguments: Event): Unit = js.native
  def fireEvent[T](el: T, `type`: String, eventArguments: Event, defaultFunction: js.Function): Unit = js.native
  def fireEvent[T](el: T, `type`: String, eventArguments: Event, defaultFunction: EventCallbackFunction[T]): Unit = js.native
  def format(str: String, ctx: Record[String, _]): String = js.native
  def format(str: String, ctx: Record[String, _], chart: Chart_): String = js.native
  def getMagnitude(num: Double): Double = js.native
  def getOptions(): Options = js.native
  def getStyle(el: HTMLElement, prop: String): Double | String = js.native
  def getStyle(el: HTMLElement, prop: String, toInt: Boolean): Double | String = js.native
  def grep(arr: js.Array[_], callback: js.Function): js.Array[_] = js.native
  def inArray(item: js.Any, arr: js.Array[_]): Double = js.native
  def inArray(item: js.Any, arr: js.Array[_], fromIndex: Double): Double = js.native
  def isArray(obj: js.Any): Boolean = js.native
  def isClass(): Boolean = js.native
  def isClass(obj: js.Object): Boolean = js.native
  def isDOMElement(obj: js.Any): Boolean = js.native
  def isNumber(n: js.Any): Boolean = js.native
  def isObject(obj: js.Any): Boolean = js.native
  def isObject(obj: js.Any, strict: Boolean): Boolean = js.native
  def isString(s: js.Any): Boolean = js.native
  def keys(obj: js.Any): js.Array[String] = js.native
  def map(arr: js.Array[_], fn: js.Function): js.Array[_] = js.native
  def merge[T](a: T, n: js.UndefOr[js.Object]*): T = js.native
  def merge[T](a: js.UndefOr[scala.Nothing], n: js.UndefOr[js.Object]*): T = js.native
  def merge[T](extend: Boolean, a: T, n: js.UndefOr[js.Object]*): T = js.native
  def merge[T](extend: Boolean, a: js.UndefOr[scala.Nothing], n: js.UndefOr[js.Object]*): T = js.native
  def normalizeTickInterval(interval: Double): Double = js.native
  def normalizeTickInterval(
    interval: Double,
    multiples: js.UndefOr[scala.Nothing],
    magnitude: js.UndefOr[scala.Nothing],
    allowDecimals: js.UndefOr[scala.Nothing],
    hasTickAmount: Boolean
  ): Double = js.native
  def normalizeTickInterval(
    interval: Double,
    multiples: js.UndefOr[scala.Nothing],
    magnitude: js.UndefOr[scala.Nothing],
    allowDecimals: Boolean
  ): Double = js.native
  def normalizeTickInterval(
    interval: Double,
    multiples: js.UndefOr[scala.Nothing],
    magnitude: js.UndefOr[scala.Nothing],
    allowDecimals: Boolean,
    hasTickAmount: Boolean
  ): Double = js.native
  def normalizeTickInterval(interval: Double, multiples: js.UndefOr[scala.Nothing], magnitude: Double): Double = js.native
  def normalizeTickInterval(
    interval: Double,
    multiples: js.UndefOr[scala.Nothing],
    magnitude: Double,
    allowDecimals: js.UndefOr[scala.Nothing],
    hasTickAmount: Boolean
  ): Double = js.native
  def normalizeTickInterval(interval: Double, multiples: js.UndefOr[scala.Nothing], magnitude: Double, allowDecimals: Boolean): Double = js.native
  def normalizeTickInterval(
    interval: Double,
    multiples: js.UndefOr[scala.Nothing],
    magnitude: Double,
    allowDecimals: Boolean,
    hasTickAmount: Boolean
  ): Double = js.native
  def normalizeTickInterval(interval: Double, multiples: js.Array[_]): Double = js.native
  def normalizeTickInterval(
    interval: Double,
    multiples: js.Array[_],
    magnitude: js.UndefOr[scala.Nothing],
    allowDecimals: js.UndefOr[scala.Nothing],
    hasTickAmount: Boolean
  ): Double = js.native
  def normalizeTickInterval(
    interval: Double,
    multiples: js.Array[_],
    magnitude: js.UndefOr[scala.Nothing],
    allowDecimals: Boolean
  ): Double = js.native
  def normalizeTickInterval(
    interval: Double,
    multiples: js.Array[_],
    magnitude: js.UndefOr[scala.Nothing],
    allowDecimals: Boolean,
    hasTickAmount: Boolean
  ): Double = js.native
  def normalizeTickInterval(interval: Double, multiples: js.Array[_], magnitude: Double): Double = js.native
  def normalizeTickInterval(
    interval: Double,
    multiples: js.Array[_],
    magnitude: Double,
    allowDecimals: js.UndefOr[scala.Nothing],
    hasTickAmount: Boolean
  ): Double = js.native
  def normalizeTickInterval(interval: Double, multiples: js.Array[_], magnitude: Double, allowDecimals: Boolean): Double = js.native
  def normalizeTickInterval(
    interval: Double,
    multiples: js.Array[_],
    magnitude: Double,
    allowDecimals: Boolean,
    hasTickAmount: Boolean
  ): Double = js.native
  def numberFormat(number: Double, decimals: Double): String = js.native
  def numberFormat(number: Double, decimals: Double, decimalPoint: js.UndefOr[scala.Nothing], thousandsSep: String): String = js.native
  def numberFormat(number: Double, decimals: Double, decimalPoint: String): String = js.native
  def numberFormat(number: Double, decimals: Double, decimalPoint: String, thousandsSep: String): String = js.native
  def objectEach[T](obj: js.Any, fn: ObjectEachCallbackFunction[T]): Unit = js.native
  def objectEach[T](obj: js.Any, fn: ObjectEachCallbackFunction[T], ctx: T): Unit = js.native
  def offset(el: Element): OffsetObject = js.native
  def pad(number: Double): String = js.native
  def pad(number: Double, length: js.UndefOr[scala.Nothing], padder: String): String = js.native
  def pad(number: Double, length: Double): String = js.native
  def pad(number: Double, length: Double, padder: String): String = js.native
  def pick[T](items: (js.UndefOr[T | Null])*): T = js.native
  def reduce(arr: js.Array[_], fn: js.Function, initialValue: js.Any): js.Any = js.native
  def relativeLength(value: RelativeSize, base: Double): Double = js.native
  def relativeLength(value: RelativeSize, base: Double, offset: Double): Double = js.native
  def removeEvent[T](el: T): Unit = js.native
  def removeEvent[T](el: T, `type`: js.UndefOr[scala.Nothing], fn: EventCallbackFunction[T]): Unit = js.native
  def removeEvent[T](el: T, `type`: String): Unit = js.native
  def removeEvent[T](el: T, `type`: String, fn: EventCallbackFunction[T]): Unit = js.native
  def removeEvent[T](el: Class[T]): Unit = js.native
  def removeEvent[T](el: Class[T], `type`: js.UndefOr[scala.Nothing], fn: EventCallbackFunction[T]): Unit = js.native
  def removeEvent[T](el: Class[T], `type`: String): Unit = js.native
  def removeEvent[T](el: Class[T], `type`: String, fn: EventCallbackFunction[T]): Unit = js.native
  def seriesType(`type`: String, parent: String, options: Dictionary[_]): Series = js.native
  def seriesType(
    `type`: String,
    parent: String,
    options: Dictionary[_],
    props: js.UndefOr[scala.Nothing],
    pointProps: Dictionary[_]
  ): Series = js.native
  def seriesType(`type`: String, parent: String, options: Dictionary[_], props: Dictionary[_]): Series = js.native
  def seriesType(
    `type`: String,
    parent: String,
    options: Dictionary[_],
    props: Dictionary[_],
    pointProps: Dictionary[_]
  ): Series = js.native
  def seriesType(`type`: String, parent: String, options: SeriesOptionsType): Series = js.native
  def seriesType(
    `type`: String,
    parent: String,
    options: SeriesOptionsType,
    props: js.UndefOr[scala.Nothing],
    pointProps: Dictionary[_]
  ): Series = js.native
  def seriesType(`type`: String, parent: String, options: SeriesOptionsType, props: Dictionary[_]): Series = js.native
  def seriesType(
    `type`: String,
    parent: String,
    options: SeriesOptionsType,
    props: Dictionary[_],
    pointProps: Dictionary[_]
  ): Series = js.native
  def setAnimation(animation: js.UndefOr[scala.Nothing], chart: Chart_): Unit = js.native
  def setAnimation(animation: Boolean, chart: Chart_): Unit = js.native
  def setAnimation(animation: AnimationOptionsObject, chart: Chart_): Unit = js.native
  def setOptions(options: Options): Options = js.native
  def some(arr: js.Array[_], fn: js.Function, ctx: js.Any): Boolean = js.native
  def splat(obj: js.Any): js.Array[_] = js.native
  def stableSort(arr: js.Array[_], sortFunction: js.Function): Unit = js.native
  def stop(el: SVGElement): Unit = js.native
  def stop(el: SVGElement, prop: String): Unit = js.native
  def syncTimeout(fn: js.Function, delay: Double): Double = js.native
  def syncTimeout(fn: js.Function, delay: Double, context: js.Any): Double = js.native
  def uniqueKey(): String = js.native
  def useSerialIds(): js.UndefOr[Boolean] = js.native
  def useSerialIds(mode: Boolean): js.UndefOr[Boolean] = js.native
  def wrap(obj: js.Any, method: String, func: WrapProceedFunction): Unit = js.native
}

