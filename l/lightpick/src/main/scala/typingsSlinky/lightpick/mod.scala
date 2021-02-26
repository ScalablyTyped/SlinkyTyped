package typingsSlinky.lightpick

import org.scalajs.dom.raw.Attr
import org.scalajs.dom.raw.DOMTokenList
import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventListenerOptions
import org.scalajs.dom.raw.HTMLAnchorElement
import org.scalajs.dom.raw.HTMLAreaElement
import org.scalajs.dom.raw.HTMLAudioElement
import org.scalajs.dom.raw.HTMLBRElement
import org.scalajs.dom.raw.HTMLBaseElement
import org.scalajs.dom.raw.HTMLBodyElement
import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLCollection
import org.scalajs.dom.raw.HTMLDListElement
import org.scalajs.dom.raw.HTMLDataListElement
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLEmbedElement
import org.scalajs.dom.raw.HTMLFieldSetElement
import org.scalajs.dom.raw.HTMLFormElement
import org.scalajs.dom.raw.HTMLHRElement
import org.scalajs.dom.raw.HTMLHeadElement
import org.scalajs.dom.raw.HTMLHeadingElement
import org.scalajs.dom.raw.HTMLHtmlElement
import org.scalajs.dom.raw.HTMLIFrameElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.HTMLLIElement
import org.scalajs.dom.raw.HTMLLabelElement
import org.scalajs.dom.raw.HTMLLegendElement
import org.scalajs.dom.raw.HTMLLinkElement
import org.scalajs.dom.raw.HTMLMapElement
import org.scalajs.dom.raw.HTMLMenuElement
import org.scalajs.dom.raw.HTMLMetaElement
import org.scalajs.dom.raw.HTMLModElement
import org.scalajs.dom.raw.HTMLOListElement
import org.scalajs.dom.raw.HTMLObjectElement
import org.scalajs.dom.raw.HTMLOptGroupElement
import org.scalajs.dom.raw.HTMLOptionElement
import org.scalajs.dom.raw.HTMLParagraphElement
import org.scalajs.dom.raw.HTMLParamElement
import org.scalajs.dom.raw.HTMLPreElement
import org.scalajs.dom.raw.HTMLProgressElement
import org.scalajs.dom.raw.HTMLQuoteElement
import org.scalajs.dom.raw.HTMLScriptElement
import org.scalajs.dom.raw.HTMLSelectElement
import org.scalajs.dom.raw.HTMLSourceElement
import org.scalajs.dom.raw.HTMLSpanElement
import org.scalajs.dom.raw.HTMLStyleElement
import org.scalajs.dom.raw.HTMLTableCaptionElement
import org.scalajs.dom.raw.HTMLTableColElement
import org.scalajs.dom.raw.HTMLTableElement
import org.scalajs.dom.raw.HTMLTableRowElement
import org.scalajs.dom.raw.HTMLTableSectionElement
import org.scalajs.dom.raw.HTMLTextAreaElement
import org.scalajs.dom.raw.HTMLTitleElement
import org.scalajs.dom.raw.HTMLTrackElement
import org.scalajs.dom.raw.HTMLUListElement
import org.scalajs.dom.raw.HTMLVideoElement
import org.scalajs.dom.raw.NamedNodeMap
import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.NodeListOf
import org.scalajs.dom.raw.ParentNode
import org.scalajs.dom.raw.SVGCircleElement
import org.scalajs.dom.raw.SVGClipPathElement
import org.scalajs.dom.raw.SVGDefsElement
import org.scalajs.dom.raw.SVGDescElement
import org.scalajs.dom.raw.SVGElement
import org.scalajs.dom.raw.SVGEllipseElement
import org.scalajs.dom.raw.SVGFEBlendElement
import org.scalajs.dom.raw.SVGFEColorMatrixElement
import org.scalajs.dom.raw.SVGFEComponentTransferElement
import org.scalajs.dom.raw.SVGFECompositeElement
import org.scalajs.dom.raw.SVGFEConvolveMatrixElement
import org.scalajs.dom.raw.SVGFEDiffuseLightingElement
import org.scalajs.dom.raw.SVGFEDisplacementMapElement
import org.scalajs.dom.raw.SVGFEDistantLightElement
import org.scalajs.dom.raw.SVGFEFloodElement
import org.scalajs.dom.raw.SVGFEFuncAElement
import org.scalajs.dom.raw.SVGFEFuncBElement
import org.scalajs.dom.raw.SVGFEFuncGElement
import org.scalajs.dom.raw.SVGFEFuncRElement
import org.scalajs.dom.raw.SVGFEGaussianBlurElement
import org.scalajs.dom.raw.SVGFEImageElement
import org.scalajs.dom.raw.SVGFEMergeElement
import org.scalajs.dom.raw.SVGFEMergeNodeElement
import org.scalajs.dom.raw.SVGFEMorphologyElement
import org.scalajs.dom.raw.SVGFEOffsetElement
import org.scalajs.dom.raw.SVGFEPointLightElement
import org.scalajs.dom.raw.SVGFESpecularLightingElement
import org.scalajs.dom.raw.SVGFESpotLightElement
import org.scalajs.dom.raw.SVGFETileElement
import org.scalajs.dom.raw.SVGFETurbulenceElement
import org.scalajs.dom.raw.SVGFilterElement
import org.scalajs.dom.raw.SVGGElement
import org.scalajs.dom.raw.SVGImageElement
import org.scalajs.dom.raw.SVGLineElement
import org.scalajs.dom.raw.SVGLinearGradientElement
import org.scalajs.dom.raw.SVGMarkerElement
import org.scalajs.dom.raw.SVGMaskElement
import org.scalajs.dom.raw.SVGMetadataElement
import org.scalajs.dom.raw.SVGPathElement
import org.scalajs.dom.raw.SVGPatternElement
import org.scalajs.dom.raw.SVGPolygonElement
import org.scalajs.dom.raw.SVGPolylineElement
import org.scalajs.dom.raw.SVGRadialGradientElement
import org.scalajs.dom.raw.SVGRectElement
import org.scalajs.dom.raw.SVGSVGElement
import org.scalajs.dom.raw.SVGStopElement
import org.scalajs.dom.raw.SVGSwitchElement
import org.scalajs.dom.raw.SVGSymbolElement
import org.scalajs.dom.raw.SVGTSpanElement
import org.scalajs.dom.raw.SVGTextElement
import org.scalajs.dom.raw.SVGTextPathElement
import org.scalajs.dom.raw.SVGUseElement
import org.scalajs.dom.raw.SVGViewElement
import typingsSlinky.lightpick.anon.PartialPluralizeFnLocale
import typingsSlinky.lightpick.lightpickStrings.`object`
import typingsSlinky.lightpick.lightpickStrings.`var`
import typingsSlinky.lightpick.lightpickStrings.a
import typingsSlinky.lightpick.lightpickStrings.abbr
import typingsSlinky.lightpick.lightpickStrings.address
import typingsSlinky.lightpick.lightpickStrings.applet
import typingsSlinky.lightpick.lightpickStrings.area
import typingsSlinky.lightpick.lightpickStrings.article
import typingsSlinky.lightpick.lightpickStrings.aside
import typingsSlinky.lightpick.lightpickStrings.audio
import typingsSlinky.lightpick.lightpickStrings.b
import typingsSlinky.lightpick.lightpickStrings.base
import typingsSlinky.lightpick.lightpickStrings.basefont
import typingsSlinky.lightpick.lightpickStrings.bdi
import typingsSlinky.lightpick.lightpickStrings.bdo
import typingsSlinky.lightpick.lightpickStrings.blockquote
import typingsSlinky.lightpick.lightpickStrings.body
import typingsSlinky.lightpick.lightpickStrings.br
import typingsSlinky.lightpick.lightpickStrings.button
import typingsSlinky.lightpick.lightpickStrings.canvas
import typingsSlinky.lightpick.lightpickStrings.caption
import typingsSlinky.lightpick.lightpickStrings.circle
import typingsSlinky.lightpick.lightpickStrings.cite
import typingsSlinky.lightpick.lightpickStrings.clipPath
import typingsSlinky.lightpick.lightpickStrings.code
import typingsSlinky.lightpick.lightpickStrings.col
import typingsSlinky.lightpick.lightpickStrings.colgroup
import typingsSlinky.lightpick.lightpickStrings.data
import typingsSlinky.lightpick.lightpickStrings.datalist
import typingsSlinky.lightpick.lightpickStrings.dd
import typingsSlinky.lightpick.lightpickStrings.defs
import typingsSlinky.lightpick.lightpickStrings.del
import typingsSlinky.lightpick.lightpickStrings.desc
import typingsSlinky.lightpick.lightpickStrings.details
import typingsSlinky.lightpick.lightpickStrings.dfn
import typingsSlinky.lightpick.lightpickStrings.dialog
import typingsSlinky.lightpick.lightpickStrings.dir
import typingsSlinky.lightpick.lightpickStrings.div
import typingsSlinky.lightpick.lightpickStrings.dl
import typingsSlinky.lightpick.lightpickStrings.dt
import typingsSlinky.lightpick.lightpickStrings.ellipse
import typingsSlinky.lightpick.lightpickStrings.em
import typingsSlinky.lightpick.lightpickStrings.embed
import typingsSlinky.lightpick.lightpickStrings.feBlend
import typingsSlinky.lightpick.lightpickStrings.feColorMatrix
import typingsSlinky.lightpick.lightpickStrings.feComponentTransfer
import typingsSlinky.lightpick.lightpickStrings.feComposite
import typingsSlinky.lightpick.lightpickStrings.feConvolveMatrix
import typingsSlinky.lightpick.lightpickStrings.feDiffuseLighting
import typingsSlinky.lightpick.lightpickStrings.feDisplacementMap
import typingsSlinky.lightpick.lightpickStrings.feDistantLight
import typingsSlinky.lightpick.lightpickStrings.feFlood
import typingsSlinky.lightpick.lightpickStrings.feFuncA
import typingsSlinky.lightpick.lightpickStrings.feFuncB
import typingsSlinky.lightpick.lightpickStrings.feFuncG
import typingsSlinky.lightpick.lightpickStrings.feFuncR
import typingsSlinky.lightpick.lightpickStrings.feGaussianBlur
import typingsSlinky.lightpick.lightpickStrings.feImage
import typingsSlinky.lightpick.lightpickStrings.feMerge
import typingsSlinky.lightpick.lightpickStrings.feMergeNode
import typingsSlinky.lightpick.lightpickStrings.feMorphology
import typingsSlinky.lightpick.lightpickStrings.feOffset
import typingsSlinky.lightpick.lightpickStrings.fePointLight
import typingsSlinky.lightpick.lightpickStrings.feSpecularLighting
import typingsSlinky.lightpick.lightpickStrings.feSpotLight
import typingsSlinky.lightpick.lightpickStrings.feTile
import typingsSlinky.lightpick.lightpickStrings.feTurbulence
import typingsSlinky.lightpick.lightpickStrings.fieldset
import typingsSlinky.lightpick.lightpickStrings.figcaption
import typingsSlinky.lightpick.lightpickStrings.figure
import typingsSlinky.lightpick.lightpickStrings.filter
import typingsSlinky.lightpick.lightpickStrings.font
import typingsSlinky.lightpick.lightpickStrings.footer
import typingsSlinky.lightpick.lightpickStrings.foreignObject
import typingsSlinky.lightpick.lightpickStrings.form
import typingsSlinky.lightpick.lightpickStrings.frame
import typingsSlinky.lightpick.lightpickStrings.frameset
import typingsSlinky.lightpick.lightpickStrings.fullscreenchange
import typingsSlinky.lightpick.lightpickStrings.fullscreenerror
import typingsSlinky.lightpick.lightpickStrings.g
import typingsSlinky.lightpick.lightpickStrings.h1
import typingsSlinky.lightpick.lightpickStrings.h2
import typingsSlinky.lightpick.lightpickStrings.h3
import typingsSlinky.lightpick.lightpickStrings.h4
import typingsSlinky.lightpick.lightpickStrings.h5
import typingsSlinky.lightpick.lightpickStrings.h6
import typingsSlinky.lightpick.lightpickStrings.head
import typingsSlinky.lightpick.lightpickStrings.header
import typingsSlinky.lightpick.lightpickStrings.hgroup
import typingsSlinky.lightpick.lightpickStrings.hr
import typingsSlinky.lightpick.lightpickStrings.html
import typingsSlinky.lightpick.lightpickStrings.httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml
import typingsSlinky.lightpick.lightpickStrings.httpColonSlashSlashwwwDotw3DotorgSlash2000Slashsvg
import typingsSlinky.lightpick.lightpickStrings.i
import typingsSlinky.lightpick.lightpickStrings.iframe
import typingsSlinky.lightpick.lightpickStrings.image
import typingsSlinky.lightpick.lightpickStrings.img
import typingsSlinky.lightpick.lightpickStrings.input
import typingsSlinky.lightpick.lightpickStrings.ins
import typingsSlinky.lightpick.lightpickStrings.kbd
import typingsSlinky.lightpick.lightpickStrings.label
import typingsSlinky.lightpick.lightpickStrings.legend
import typingsSlinky.lightpick.lightpickStrings.li
import typingsSlinky.lightpick.lightpickStrings.line
import typingsSlinky.lightpick.lightpickStrings.linearGradient
import typingsSlinky.lightpick.lightpickStrings.link
import typingsSlinky.lightpick.lightpickStrings.main
import typingsSlinky.lightpick.lightpickStrings.map
import typingsSlinky.lightpick.lightpickStrings.mark
import typingsSlinky.lightpick.lightpickStrings.marker
import typingsSlinky.lightpick.lightpickStrings.marquee
import typingsSlinky.lightpick.lightpickStrings.mask
import typingsSlinky.lightpick.lightpickStrings.menu
import typingsSlinky.lightpick.lightpickStrings.meta
import typingsSlinky.lightpick.lightpickStrings.metadata
import typingsSlinky.lightpick.lightpickStrings.meter
import typingsSlinky.lightpick.lightpickStrings.nav
import typingsSlinky.lightpick.lightpickStrings.noscript
import typingsSlinky.lightpick.lightpickStrings.ol
import typingsSlinky.lightpick.lightpickStrings.optgroup
import typingsSlinky.lightpick.lightpickStrings.option
import typingsSlinky.lightpick.lightpickStrings.output
import typingsSlinky.lightpick.lightpickStrings.p
import typingsSlinky.lightpick.lightpickStrings.param
import typingsSlinky.lightpick.lightpickStrings.path
import typingsSlinky.lightpick.lightpickStrings.pattern
import typingsSlinky.lightpick.lightpickStrings.picture
import typingsSlinky.lightpick.lightpickStrings.polygon
import typingsSlinky.lightpick.lightpickStrings.polyline
import typingsSlinky.lightpick.lightpickStrings.pre
import typingsSlinky.lightpick.lightpickStrings.progress
import typingsSlinky.lightpick.lightpickStrings.q
import typingsSlinky.lightpick.lightpickStrings.radialGradient
import typingsSlinky.lightpick.lightpickStrings.rect
import typingsSlinky.lightpick.lightpickStrings.rp
import typingsSlinky.lightpick.lightpickStrings.rt
import typingsSlinky.lightpick.lightpickStrings.ruby
import typingsSlinky.lightpick.lightpickStrings.s
import typingsSlinky.lightpick.lightpickStrings.samp
import typingsSlinky.lightpick.lightpickStrings.script
import typingsSlinky.lightpick.lightpickStrings.section
import typingsSlinky.lightpick.lightpickStrings.select
import typingsSlinky.lightpick.lightpickStrings.slot
import typingsSlinky.lightpick.lightpickStrings.small
import typingsSlinky.lightpick.lightpickStrings.source
import typingsSlinky.lightpick.lightpickStrings.span
import typingsSlinky.lightpick.lightpickStrings.stop
import typingsSlinky.lightpick.lightpickStrings.strong
import typingsSlinky.lightpick.lightpickStrings.style
import typingsSlinky.lightpick.lightpickStrings.sub
import typingsSlinky.lightpick.lightpickStrings.summary
import typingsSlinky.lightpick.lightpickStrings.sup
import typingsSlinky.lightpick.lightpickStrings.svg
import typingsSlinky.lightpick.lightpickStrings.switch
import typingsSlinky.lightpick.lightpickStrings.symbol
import typingsSlinky.lightpick.lightpickStrings.table
import typingsSlinky.lightpick.lightpickStrings.tbody
import typingsSlinky.lightpick.lightpickStrings.td
import typingsSlinky.lightpick.lightpickStrings.template
import typingsSlinky.lightpick.lightpickStrings.text
import typingsSlinky.lightpick.lightpickStrings.textPath
import typingsSlinky.lightpick.lightpickStrings.textarea
import typingsSlinky.lightpick.lightpickStrings.tfoot
import typingsSlinky.lightpick.lightpickStrings.th
import typingsSlinky.lightpick.lightpickStrings.thead
import typingsSlinky.lightpick.lightpickStrings.time
import typingsSlinky.lightpick.lightpickStrings.title
import typingsSlinky.lightpick.lightpickStrings.tr
import typingsSlinky.lightpick.lightpickStrings.track
import typingsSlinky.lightpick.lightpickStrings.tspan
import typingsSlinky.lightpick.lightpickStrings.u
import typingsSlinky.lightpick.lightpickStrings.ul
import typingsSlinky.lightpick.lightpickStrings.use
import typingsSlinky.lightpick.lightpickStrings.video
import typingsSlinky.lightpick.lightpickStrings.view
import typingsSlinky.lightpick.lightpickStrings.wbr
import typingsSlinky.lightpick.mod.Options.DayOfWeek
import typingsSlinky.lightpick.mod.Options.Dropdowns
import typingsSlinky.lightpick.mod.Options.Dropdowns.Years
import typingsSlinky.lightpick.mod.Options.Field
import typingsSlinky.lightpick.mod.Options.Locale
import typingsSlinky.lightpick.mod.Options.Locale.Buttons
import typingsSlinky.lightpick.mod.Options.Locale.PluralizeFn
import typingsSlinky.lightpick.mod.Options.OnCloseFn
import typingsSlinky.lightpick.mod.Options.OnErrorFn
import typingsSlinky.lightpick.mod.Options.OnMonthsChangeFn
import typingsSlinky.lightpick.mod.Options.OnOpenFn
import typingsSlinky.lightpick.mod.Options.OnSelectFn
import typingsSlinky.lightpick.mod.Options.OnSelectStartEndFn
import typingsSlinky.lightpick.mod.Options.OnYearsChangeFn
import typingsSlinky.lightpick.mod.Options.Orientation
import typingsSlinky.lightpick.mod.Options.WeekdayStyle
import typingsSlinky.moment.mod.Moment
import typingsSlinky.moment.mod.MomentFormatSpecification
import typingsSlinky.moment.mod.MomentInput
import typingsSlinky.std.AddEventListenerOptions
import typingsSlinky.std.Animation
import typingsSlinky.std.ChildNode
import typingsSlinky.std.DOMRect
import typingsSlinky.std.DOMRectList
import typingsSlinky.std.EventListenerOrEventListenerObject
import typingsSlinky.std.FullscreenOptions
import typingsSlinky.std.GetRootNodeOptions
import typingsSlinky.std.HTMLAppletElement
import typingsSlinky.std.HTMLBaseFontElement
import typingsSlinky.std.HTMLCollectionOf
import typingsSlinky.std.HTMLDataElement
import typingsSlinky.std.HTMLDetailsElement
import typingsSlinky.std.HTMLDialogElement
import typingsSlinky.std.HTMLDirectoryElement
import typingsSlinky.std.HTMLFontElement
import typingsSlinky.std.HTMLFrameElement
import typingsSlinky.std.HTMLFrameSetElement
import typingsSlinky.std.HTMLMarqueeElement
import typingsSlinky.std.HTMLMeterElement
import typingsSlinky.std.HTMLOutputElement
import typingsSlinky.std.HTMLPictureElement
import typingsSlinky.std.HTMLSlotElement
import typingsSlinky.std.HTMLTableDataCellElement
import typingsSlinky.std.HTMLTableHeaderCellElement
import typingsSlinky.std.HTMLTemplateElement
import typingsSlinky.std.HTMLTimeElement
import typingsSlinky.std.InsertPosition
import typingsSlinky.std.Keyframe
import typingsSlinky.std.KeyframeAnimationOptions
import typingsSlinky.std.PropertyIndexedKeyframes
import typingsSlinky.std.SVGForeignObjectElement
import typingsSlinky.std.ScrollIntoViewOptions
import typingsSlinky.std.ScrollToOptions
import typingsSlinky.std.ShadowRoot
import typingsSlinky.std.ShadowRootInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lightpick", JSImport.Namespace)
  @js.native
  class ^ protected () extends Lightpick {
    def this(options: Options) = this()
  }
  
  type DisabledDate = InputDate | InputDateRange
  
  type FormatSpecification = MomentFormatSpecification
  
  type InputDate = MomentInput | Null
  
  type InputDateRange = js.Tuple2[InputDate, InputDate]
  
  @js.native
  trait Lightpick extends StObject {
    
    /**
      * Hide the picker and remove all event listeners.
      */
    def destroy(): Unit = js.native
    
    /**
      * The calendar containing HTML element.
      */
    val el: HTMLElement = js.native
    
    /**
      * Return current date as moment object.
      */
    def getDate(): OutputDate = js.native
    
    /**
      * Return current end of date range as moment object.
      */
    def getEndDate(): OutputDate = js.native
    
    /**
      * Return current start of date range as moment object.
      */
    def getStartDate(): OutputDate = js.native
    
    def gotoDate(): Unit = js.native
    def gotoDate(date: InputDate): Unit = js.native
    
    def gotoMonth(month: Double): Unit = js.native
    
    def gotoToday(): Unit = js.native
    
    def gotoYear(year: Double): Unit = js.native
    
    /**
      * Hide the picker.
      */
    def hide(): Unit = js.native
    
    /**
      * Tells whether the picker is currently visible or not.
      * Visibility can be changed with show() / hide() methods.
      */
    val isShowing: Boolean = js.native
    
    def nextMonth(): Unit = js.native
    
    def prevMonth(): Unit = js.native
    
    /**
      * Update picker options.
      */
    def reloadOptions(options: Options): Unit = js.native
    
    def reset(): Unit = js.native
    
    /**
      * Set date when singleDate is true.
      */
    def setDate(): Unit = js.native
    def setDate(date: js.UndefOr[InputDate], preventOnSelect: Boolean): Unit = js.native
    def setDate(date: InputDate): Unit = js.native
    
    /**
      * Set date range.
      */
    def setDateRange(): Unit = js.native
    def setDateRange(start: js.UndefOr[InputDate], end: js.UndefOr[InputDate], preventOnSelect: Boolean): Unit = js.native
    def setDateRange(start: js.UndefOr[InputDate], end: InputDate): Unit = js.native
    def setDateRange(start: InputDate): Unit = js.native
    
    def setDisableDates(dates: js.Array[DisabledDate]): Unit = js.native
    
    def setEndDate(): Unit = js.native
    def setEndDate(date: js.UndefOr[InputDate], preventOnSelect: Boolean): Unit = js.native
    def setEndDate(date: InputDate): Unit = js.native
    
    def setStartDate(): Unit = js.native
    def setStartDate(date: js.UndefOr[InputDate], preventOnSelect: Boolean): Unit = js.native
    def setStartDate(date: InputDate): Unit = js.native
    
    /**
      * Make the picker visible.
      */
    def show(): Unit = js.native
    
    /**
      * Returns the date in a string format.
      */
    def toString(format: FormatSpecification): String = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Close calendar when picked date/range.
      */
    var autoclose: js.UndefOr[Boolean] = js.native
    
    var disableDates: js.UndefOr[js.Array[DisabledDate]] = js.native
    
    /**
      * Disable Saturday and Sunday.
      */
    var disableWeekends: js.UndefOr[Boolean] = js.native
    
    /**
      * If set to `false` then will reset selected range when disabled dates exists in selected range.
      */
    var disabledDatesInRange: js.UndefOr[Boolean] = js.native
    
    /**
      * Dropdown selections for years, months. Can be false for disable both dropdowns.
      */
    var dropdowns: js.UndefOr[Boolean | Dropdowns] = js.native
    
    var endDate: js.UndefOr[InputDate] = js.native
    
    /**
      * Bind the datepicker to a form field.
      */
    var field: Field = js.native
    
    /**
      * ISO day of the week.
      */
    var firstDay: js.UndefOr[DayOfWeek] = js.native
    
    /**
      * Footer calendar, if set to `true` will use default footer (Reset/Apply buttons) or custom string (html).
      */
    var footer: js.UndefOr[Boolean | String] = js.native
    
    /**
      * The default output format.
      */
    var format: js.UndefOr[String] = js.native
    
    /**
      * Close calendar when clicked outside the elements specified in field or parentEl. Recommended use when autoclose is set to false.
      */
    var hideOnBodyClick: js.UndefOr[Boolean] = js.native
    
    /**
      * Show tooltip.
      */
    var hoveringTooltip: js.UndefOr[Boolean] = js.native
    
    /**
      * Show calendar inline. If true and parentEl is not provided then will use parentNode of field.
      */
    var `inline`: js.UndefOr[Boolean] = js.native
    
    /**
      * Language code for names of days, months by Date.prototype.toLocaleString(). 'auto' will try detect user browser language.
      */
    var lang: js.UndefOr[String] = js.native
    
    var locale: js.UndefOr[Locale] = js.native
    
    /**
      * The maximum/latest date that can be selected.
      */
    var maxDate: js.UndefOr[InputDate] = js.native
    
    /**
      * The maximum days of the selected range.
      */
    var maxDays: js.UndefOr[Double] = js.native
    
    /**
      * The minimum/earliest date that can be selected.
      */
    var minDate: js.UndefOr[InputDate] = js.native
    
    /**
      * The minimum days of the selected range.
      */
    var minDays: js.UndefOr[Double] = js.native
    
    /**
      * Number of columns months.
      */
    var numberOfColumns: js.UndefOr[Double] = js.native
    
    /**
      * Number of visible months.
      */
    var numberOfMonths: js.UndefOr[Double] = js.native
    
    /**
      * Triggered when calendar has been closed.
      */
    var onClose: js.UndefOr[OnCloseFn] = js.native
    
    var onError: js.UndefOr[OnErrorFn] = js.native
    
    /**
      * Triggered when the months select is changed.
      */
    var onMonthsChange: js.UndefOr[OnMonthsChangeFn] = js.native
    
    /**
      * Triggered when calendar has been opened.
      */
    var onOpen: js.UndefOr[OnOpenFn] = js.native
    
    /**
      * Triggered when either date / start date or end date has been changed.
      */
    var onSelect: js.UndefOr[OnSelectFn] = js.native
    
    /**
      * Triggered when end date has been changed.
      */
    var onSelectEnd: js.UndefOr[OnSelectStartEndFn] = js.native
    
    /**
      * Triggered when start date has been changed.
      */
    var onSelectStart: js.UndefOr[OnSelectStartEndFn] = js.native
    
    /**
      * Triggered when the years select is changed.
      */
    var onYearsChange: js.UndefOr[OnYearsChangeFn] = js.native
    
    var orientation: js.UndefOr[Orientation] = js.native
    
    /**
      * Selector of the parent element that the date range picker will be added to, if not provided this will be 'body'.
      */
    var parentEl: js.UndefOr[String | Node] = js.native
    
    /**
      * Repick start/end instead of new range. This option working only when exists `secondField`.
      */
    var repick: js.UndefOr[Boolean] = js.native
    
    /**
      * If exists then end of date range will set here.
      */
    var secondField: js.UndefOr[Field] = js.native
    
    /**
      * Select second date before the first selected date.
      */
    var selectBackward: js.UndefOr[Boolean] = js.native
    
    /**
      * Select second date after the first selected date.
      */
    var selectForward: js.UndefOr[Boolean] = js.native
    
    /**
      * Separator between dates when one field.
      */
    var separator: js.UndefOr[String] = js.native
    
    /**
      * Choose a single date instead of a date range.
      */
    var singleDate: js.UndefOr[Boolean] = js.native
    
    var startDate: js.UndefOr[InputDate] = js.native
    
    /**
      * Calc date range in nights. (For hotels when last date doesn't include to range.)
      */
    var tooltipNights: js.UndefOr[Boolean] = js.native
    
    /**
      * Determines the weekday display style.
      * Two weekdays may have the same narrow style for some locales (e.g. Tuesday's narrow style is also T).
      */
    var weekdayStyle: js.UndefOr[WeekdayStyle] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(field: Field): Options = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.lightpick.lightpickNumbers.`1`
      - typingsSlinky.lightpick.lightpickNumbers.`2`
      - typingsSlinky.lightpick.lightpickNumbers.`3`
      - typingsSlinky.lightpick.lightpickNumbers.`4`
      - typingsSlinky.lightpick.lightpickNumbers.`5`
      - typingsSlinky.lightpick.lightpickNumbers.`6`
      - typingsSlinky.lightpick.lightpickNumbers.`7`
    */
    trait DayOfWeek extends StObject
    object DayOfWeek {
      
      @scala.inline
      def `1`: typingsSlinky.lightpick.lightpickNumbers.`1` = 1.asInstanceOf[typingsSlinky.lightpick.lightpickNumbers.`1`]
      
      @scala.inline
      def `2`: typingsSlinky.lightpick.lightpickNumbers.`2` = 2.asInstanceOf[typingsSlinky.lightpick.lightpickNumbers.`2`]
      
      @scala.inline
      def `3`: typingsSlinky.lightpick.lightpickNumbers.`3` = 3.asInstanceOf[typingsSlinky.lightpick.lightpickNumbers.`3`]
      
      @scala.inline
      def `4`: typingsSlinky.lightpick.lightpickNumbers.`4` = 4.asInstanceOf[typingsSlinky.lightpick.lightpickNumbers.`4`]
      
      @scala.inline
      def `5`: typingsSlinky.lightpick.lightpickNumbers.`5` = 5.asInstanceOf[typingsSlinky.lightpick.lightpickNumbers.`5`]
      
      @scala.inline
      def `6`: typingsSlinky.lightpick.lightpickNumbers.`6` = 6.asInstanceOf[typingsSlinky.lightpick.lightpickNumbers.`6`]
      
      @scala.inline
      def `7`: typingsSlinky.lightpick.lightpickNumbers.`7` = 7.asInstanceOf[typingsSlinky.lightpick.lightpickNumbers.`7`]
    }
    
    @js.native
    trait Dropdowns extends StObject {
      
      /**
        * true/false for enable/disable dropdown of months.
        */
      var months: js.UndefOr[Boolean] = js.native
      
      /**
        * Can be false for disable dropdown of years.
        */
      var years: js.UndefOr[Boolean | Years] = js.native
    }
    object Dropdowns {
      
      @scala.inline
      def apply(): Dropdowns = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Dropdowns]
      }
      
      @scala.inline
      implicit class DropdownsMutableBuilder[Self <: Dropdowns] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMonths(value: Boolean): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMonthsUndefined: Self = StObject.set(x, "months", js.undefined)
        
        @scala.inline
        def setYears(value: Boolean | Years): Self = StObject.set(x, "years", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setYearsUndefined: Self = StObject.set(x, "years", js.undefined)
      }
      
      @js.native
      trait Years extends StObject {
        
        var max: js.UndefOr[Double] = js.native
        
        var min: js.UndefOr[Double] = js.native
      }
      object Years {
        
        @scala.inline
        def apply(): Years = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Years]
        }
        
        @scala.inline
        implicit class YearsMutableBuilder[Self <: Years] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
          
          @scala.inline
          def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
        }
      }
    }
    
    /* Inlined std.Element & {  value :string} */
    @js.native
    trait Field extends StObject {
      
      val ATTRIBUTE_NODE: Double = js.native
      
      /**
        * node is a CDATASection node.
        */
      val CDATA_SECTION_NODE: Double = js.native
      
      /**
        * node is a Comment node.
        */
      val COMMENT_NODE: Double = js.native
      
      /**
        * node is a DocumentFragment node.
        */
      val DOCUMENT_FRAGMENT_NODE: Double = js.native
      
      /**
        * node is a document.
        */
      val DOCUMENT_NODE: Double = js.native
      
      /**
        * Set when other is a descendant of node.
        */
      val DOCUMENT_POSITION_CONTAINED_BY: Double = js.native
      
      /**
        * Set when other is an ancestor of node.
        */
      val DOCUMENT_POSITION_CONTAINS: Double = js.native
      
      /**
        * Set when node and other are not in the same tree.
        */
      val DOCUMENT_POSITION_DISCONNECTED: Double = js.native
      
      /**
        * Set when other is following node.
        */
      val DOCUMENT_POSITION_FOLLOWING: Double = js.native
      
      val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Double = js.native
      
      /**
        * Set when other is preceding node.
        */
      val DOCUMENT_POSITION_PRECEDING: Double = js.native
      
      /**
        * node is a doctype.
        */
      val DOCUMENT_TYPE_NODE: Double = js.native
      
      /**
        * node is an element.
        */
      val ELEMENT_NODE: Double = js.native
      
      val ENTITY_NODE: Double = js.native
      
      val ENTITY_REFERENCE_NODE: Double = js.native
      
      val NOTATION_NODE: Double = js.native
      
      /**
        * node is a ProcessingInstruction node.
        */
      val PROCESSING_INSTRUCTION_NODE: Double = js.native
      
      /**
        * node is a Text node.
        */
      val TEXT_NODE: Double = js.native
      
      /**
        * Appends an event listener for events whose type attribute value is type. The callback argument sets the callback that will be invoked when the event is dispatched.
        * 
        * The options argument sets listener-specific options. For compatibility this can be a boolean, in which case the method behaves exactly as if the value was specified as options's capture.
        * 
        * When set to true, options's capture prevents callback from being invoked when the event's eventPhase attribute value is BUBBLING_PHASE. When false (or not present), callback will not be invoked when event's eventPhase attribute value is CAPTURING_PHASE. Either way, callback will be invoked if event's eventPhase attribute value is AT_TARGET.
        * 
        * When set to true, options's passive indicates that the callback will not cancel the event by invoking preventDefault(). This is used to enable performance optimizations described in § 2.8 Observing event listeners.
        * 
        * When set to true, options's once indicates that the callback will only be invoked once after which the event listener will be removed.
        * 
        * The event listener is appended to target's event listener list and is not appended if it has the same type, callback, and capture.
        */
      def addEventListener(`type`: String): Unit = js.native
      def addEventListener(`type`: String, listener: Null, options: Boolean): Unit = js.native
      def addEventListener(`type`: String, listener: Null, options: AddEventListenerOptions): Unit = js.native
      def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
      def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
      def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
      @JSName("addEventListener")
      def addEventListener_fullscreenchange(`type`: fullscreenchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
      @JSName("addEventListener")
      def addEventListener_fullscreenchange(
        `type`: fullscreenchange,
        listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
        options: Boolean
      ): Unit = js.native
      @JSName("addEventListener")
      def addEventListener_fullscreenchange(
        `type`: fullscreenchange,
        listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
        options: AddEventListenerOptions
      ): Unit = js.native
      @JSName("addEventListener")
      def addEventListener_fullscreenerror(`type`: fullscreenerror, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
      @JSName("addEventListener")
      def addEventListener_fullscreenerror(
        `type`: fullscreenerror,
        listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
        options: Boolean
      ): Unit = js.native
      @JSName("addEventListener")
      def addEventListener_fullscreenerror(
        `type`: fullscreenerror,
        listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
        options: AddEventListenerOptions
      ): Unit = js.native
      
      /**
        * Inserts nodes just after node, while replacing strings in nodes with equivalent Text nodes.
        * 
        * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
        */
      def after(nodes: (Node | String)*): Unit = js.native
      
      def animate(): Animation = js.native
      def animate(keyframes: js.Array[Keyframe]): Animation = js.native
      def animate(keyframes: js.Array[Keyframe], options: Double): Animation = js.native
      def animate(keyframes: js.Array[Keyframe], options: KeyframeAnimationOptions): Animation = js.native
      def animate(keyframes: Null, options: Double): Animation = js.native
      def animate(keyframes: Null, options: KeyframeAnimationOptions): Animation = js.native
      def animate(keyframes: PropertyIndexedKeyframes): Animation = js.native
      def animate(keyframes: PropertyIndexedKeyframes, options: Double): Animation = js.native
      def animate(keyframes: PropertyIndexedKeyframes, options: KeyframeAnimationOptions): Animation = js.native
      
      /**
        * Inserts nodes after the last child of node, while replacing strings in nodes with equivalent Text nodes.
        * 
        * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
        */
      def append(nodes: (Node | String)*): Unit = js.native
      
      def appendChild[T /* <: Node */](newChild: T): T = js.native
      
      val assignedSlot: HTMLSlotElement | Null = js.native
      
      /**
        * Creates a shadow root for element and returns it.
        */
      def attachShadow(init: ShadowRootInit): ShadowRoot = js.native
      
      val attributes: NamedNodeMap = js.native
      
      /**
        * Returns node's node document's document base URL.
        */
      val baseURI: String = js.native
      
      /**
        * Inserts nodes just before node, while replacing strings in nodes with equivalent Text nodes.
        * 
        * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
        */
      def before(nodes: (Node | String)*): Unit = js.native
      
      val childElementCount: Double = js.native
      
      /**
        * Returns the children.
        */
      val childNodes: NodeListOf[ChildNode with Node] = js.native
      
      /**
        * Returns the child elements.
        */
      val children: HTMLCollection = js.native
      
      /**
        * Allows for manipulation of element's class content attribute as a set of whitespace-separated tokens through a DOMTokenList object.
        */
      val classList: DOMTokenList = js.native
      
      /**
        * Returns the value of element's class content attribute. Can be set to change it.
        */
      var className: String = js.native
      
      val clientHeight: Double = js.native
      
      val clientLeft: Double = js.native
      
      val clientTop: Double = js.native
      
      val clientWidth: Double = js.native
      
      /**
        * Returns a copy of node. If deep is true, the copy also includes the node's descendants.
        */
      def cloneNode(): Node = js.native
      def cloneNode(deep: Boolean): Node = js.native
      
      def closest[E /* <: Element */](selector: String): E | Null = js.native
      /**
        * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
        */
      @JSName("closest")
      def closest_a(selector: a): HTMLAnchorElement | Null = js.native
      @JSName("closest")
      def closest_abbr(selector: abbr): HTMLElement | Null = js.native
      @JSName("closest")
      def closest_address(selector: address): HTMLElement | Null = js.native
      @JSName("closest")
      def closest_applet(selector: applet): HTMLAppletElement | Null = js.native
      @JSName("closest")
      def closest_area(selector: area): HTMLAreaElement | Null = js.native
      @JSName("closest")
      def closest_article(selector: article): HTMLElement | Null = js.native
      @JSName("closest")
      def closest_aside(selector: aside): HTMLElement | Null = js.native
      @JSName("closest")
      def closest_audio(selector: audio): HTMLAudioElement | Null = js.native
      @JSName("closest")
      def closest_b(selector: b): HTMLElement | Null = js.native
      @JSName("closest")
      def closest_base(selector: base): HTMLBaseElement | Null = js.native
      @JSName("closest")
      def closest_basefont(selector: basefont): HTMLBaseFontElement | Null = js.native
      @JSName("closest")
      def closest_bdi(selector: bdi): HTMLElement | Null = js.native
      @JSName("closest")
      def closest_bdo(selector: bdo): HTMLElement | Null = js.native
      @JSName("closest")
      def closest_blockquote(selector: blockquote): HTMLQuoteElement | Null = js.native
      @JSName("closest")
      def closest_body(selector: body): HTMLBodyElement | Null = js.native
      @JSName("closest")
      def closest_br(selector: br): HTMLBRElement | Null = js.native
      @JSName("closest")
      def closest_button(selector: button): HTMLButtonElement | Null = js.native
      @JSName("closest")
      def closest_canvas(selector: canvas): HTMLCanvasElement | Null = js.native
      @JSName("closest")
      def closest_caption(selector: caption): HTMLTableCaptionElement | Null = js.native
      @JSName("closest")
      def closest_circle(selector: circle): SVGCircleElement | Null = js.native
      @JSName("closest")
      def closest_cite(selector: cite): HTMLElement | Null = js.native
      @JSName("closest")
      def closest_clipPath(selector: clipPath): SVGClipPathElement | Null = js.native
      @JSName("closest")
      def closest_code(selector: code): HTMLElement | Null = js.native
      @JSName("closest")
      def closest_col(selector: col): HTMLTableColElement | Null = js.native
      @JSName("closest")
      def closest_colgroup(selector: colgroup): HTMLTableColElement | Null = js.native
      @JSName("closest")
      def closest_data(selector: data): HTMLDataElement | Null = js.native
      @JSName("closest")
      def closest_datalist(selector: datalist): HTMLDataListElement | Null = js.native
      @JSName("closest")
      def closest_dd(selector: dd): HTMLElement | Null = js.native
      @JSName("closest")
      def closest_defs(selector: defs): SVGDefsElement | Null = js.native
      @JSName("closest")
      def closest_del(selector: del): HTMLModElement | Null = js.native
      @JSName("closest")
      def closest_desc(selector: desc): SVGDescElement | Null = js.native
      @JSName("closest")
      def closest_details(selector: details): HTMLDetailsElement | Null = js.native
      @JSName("closest")
      def closest_dfn(selector: dfn): HTMLElement | Null = js.native
      @JSName("closest")
      def closest_dialog(selector: dialog): HTMLDialogElement | Null = js.native
      @JSName("closest")
      def closest_dir(selector: dir): HTMLDirectoryElement | Null = js.native
      @JSName("closest")
      def closest_div(selector: div): HTMLDivElement | Null = js.native
      @JSName("closest")
      def closest_dl(selector: dl): HTMLDListElement | Null = js.native
      @JSName("closest")
      def closest_dt(selector: dt): HTMLElement | Null = js.native
      @JSName("closest")
      def closest_ellipse(selector: ellipse): SVGEllipseElement | Null = js.native
      @JSName("closest")
      def closest_em(selector: em): HTMLElement | Null = js.native
      @JSName("closest")
      def closest_embed(selector: embed): HTMLEmbedElement | Null = js.native
      @JSName("closest")
      def closest_feBlend(selector: feBlend): SVGFEBlendElement | Null = js.native
      @JSName("closest")
      def closest_feColorMatrix(selector: feColorMatrix): SVGFEColorMatrixElement | Null = js.native
      @JSName("closest")
      def closest_feComponentTransfer(selector: feComponentTransfer): SVGFEComponentTransferElement | Null = js.native
      @JSName("closest")
      def closest_feComposite(selector: feComposite): SVGFECompositeElement | Null = js.native
      @JSName("closest")
      def closest_feConvolveMatrix(selector: feConvolveMatrix): SVGFEConvolveMatrixElement | Null = js.native
      @JSName("closest")
      def closest_feDiffuseLighting(selector: feDiffuseLighting): SVGFEDiffuseLightingElement | Null = js.native
      @JSName("closest")
      def closest_feDisplacementMap(selector: feDisplacementMap): SVGFEDisplacementMapElement | Null = js.native
      @JSName("closest")
      def closest_feDistantLight(selector: feDistantLight): SVGFEDistantLightElement | Null = js.native
      @JSName("closest")
      def closest_feFlood(selector: feFlood): SVGFEFloodElement | Null = js.native
      @JSName("closest")
      def closest_feFuncA(selector: feFuncA): SVGFEFuncAElement | Null = js.native
      @JSName("closest")
      def closest_feFuncB(selector: feFuncB): SVGFEFuncBElement | Null = js.native
      @JSName("closest")
      def closest_feFuncG(selector: feFuncG): SVGFEFuncGElement | Null = js.native
      @JSName("closest")
      def closest_feFuncR(selector: feFuncR): SVGFEFuncRElement | Null = js.native
      @JSName("closest")
      def closest_feGaussianBlur(selector: feGaussianBlur): SVGFEGaussianBlurElement | Null = js.native
      @JSName("closest")
      def closest_feImage(selector: feImage): SVGFEImageElement | Null = js.native
      @JSName("closest")
      def closest_feMerge(selector: feMerge): SVGFEMergeElement | Null = js.native
      @JSName("closest")
      def closest_feMergeNode(selector: feMergeNode): SVGFEMergeNodeElement | Null = js.native
      @JSName("closest")
      def closest_feMorphology(selector: feMorphology): SVGFEMorphologyElement | Null = js.native
      @JSName("closest")
      def closest_feOffset(selector: feOffset): SVGFEOffsetElement | Null = js.native
      @JSName("closest")
      def closest_fePointLight(selector: fePointLight): SVGFEPointLightElement | Null = js.native
      @JSName("closest")
      def closest_feSpecularLighting(selector: feSpecularLighting): SVGFESpecularLightingElement | Null = js.native
      @JSName("closest")
      def closest_feSpotLight(selector: feSpotLight): SVGFESpotLightElement | Null = js.native
      @JSName("closest")
      def closest_feTile(selector: feTile): SVGFETileElement | Null = js.native
      @JSName("closest")
      def closest_feTurbulence(selector: feTurbulence): SVGFETurbulenceElement | Null = js.native
      @JSName("closest")
      def closest_fieldset(selector: fieldset): HTMLFieldSetElement | Null = js.native
      @JSName("closest")
      def closest_figcaption(selector: figcaption): HTMLElement | Null = js.native
      @JSName("closest")
      def closest_figure(selector: figure): HTMLElement | Null = js.native
      @JSName("closest")
      def closest_filter(selector: filter): SVGFilterElement | Null = js.native
      @JSName("closest")
      def closest_font(selector: font): HTMLFontElement | Null = js.native
      @JSName("closest")
      def closest_footer(selector: footer): HTMLElement | Null = js.native
      @JSName("closest")
      def closest_foreignObject(selector: foreignObject): SVGForeignObjectElement | Null = js.native
      @JSName("closest")
      def closest_form(selector: form): HTMLFormElement | Null = js.native
      @JSName("closest")
      def closest_frame(selector: frame): HTMLFrameElement | Null = js.native
      @JSName("closest")
      def closest_frameset(selector: frameset): HTMLFrameSetElement | Null = js.native
      @JSName("closest")
      def closest_g(selector: g): SVGGElement | Null = js.native
      @JSName("closest")
      def closest_h1(selector: h1): HTMLHeadingElement | Null = js.native
      @JSName("closest")
      def closest_h2(selector: h2): HTMLHeadingElement | Null = js.native
      @JSName("closest")
      def closest_h3(selector: h3): HTMLHeadingElement | Null = js.native
      @JSName("closest")
      def closest_h4(selector: h4): HTMLHeadingElement | Null = js.native
      @JSName("closest")
      def closest_h5(selector: h5): HTMLHeadingElement | Null = js.native
      @JSName("closest")
      def closest_h6(selector: h6): HTMLHeadingElement | Null = js.native
      @JSName("closest")
      def closest_head(selector: head): HTMLHeadElement | Null = js.native
      @JSName("closest")
      def closest_header(selector: header): HTMLElement | Null = js.native
      @JSName("closest")
      def closest_hgroup(selector: hgroup): HTMLElement | Null = js.native
      @JSName("closest")
      def closest_hr(selector: hr): HTMLHRElement | Null = js.native
      @JSName("closest")
      def closest_html(selector: html): HTMLHtmlElement | Null = js.native
      @JSName("closest")
      def closest_i(selector: i): HTMLElement | Null = js.native
      @JSName("closest")
      def closest_iframe(selector: iframe): HTMLIFrameElement | Null = js.native
      @JSName("closest")
      def closest_image(selector: image): SVGImageElement | Null = js.native
      @JSName("closest")
      def closest_img(selector: img): HTMLImageElement | Null = js.native
      @JSName("closest")
      def closest_input(selector: input): HTMLInputElement | Null = js.native
      @JSName("closest")
      def closest_ins(selector: ins): HTMLModElement | Null = js.native
      @JSName("closest")
      def closest_kbd(selector: kbd): HTMLElement | Null = js.native
      @JSName("closest")
      def closest_label(selector: label): HTMLLabelElement | Null = js.native
      @JSName("closest")
      def closest_legend(selector: legend): HTMLLegendElement | Null = js.native
      @JSName("closest")
      def closest_li(selector: li): HTMLLIElement | Null = js.native
      @JSName("closest")
      def closest_line(selector: line): SVGLineElement | Null = js.native
      @JSName("closest")
      def closest_linearGradient(selector: linearGradient): SVGLinearGradientElement | Null = js.native
      @JSName("closest")
      def closest_link(selector: link): HTMLLinkElement | Null = js.native
      @JSName("closest")
      def closest_main(selector: main): HTMLElement | Null = js.native
      @JSName("closest")
      def closest_map(selector: map): HTMLMapElement | Null = js.native
      @JSName("closest")
      def closest_mark(selector: mark): HTMLElement | Null = js.native
      @JSName("closest")
      def closest_marker(selector: marker): SVGMarkerElement | Null = js.native
      @JSName("closest")
      def closest_marquee(selector: marquee): HTMLMarqueeElement | Null = js.native
      @JSName("closest")
      def closest_mask(selector: mask): SVGMaskElement | Null = js.native
      @JSName("closest")
      def closest_menu(selector: menu): HTMLMenuElement | Null = js.native
      @JSName("closest")
      def closest_meta(selector: meta): HTMLMetaElement | Null = js.native
      @JSName("closest")
      def closest_metadata(selector: metadata): SVGMetadataElement | Null = js.native
      @JSName("closest")
      def closest_meter(selector: meter): HTMLMeterElement | Null = js.native
      @JSName("closest")
      def closest_nav(selector: nav): HTMLElement | Null = js.native
      @JSName("closest")
      def closest_noscript(selector: noscript): HTMLElement | Null = js.native
      @JSName("closest")
      def closest_object(selector: `object`): HTMLObjectElement | Null = js.native
      @JSName("closest")
      def closest_ol(selector: ol): HTMLOListElement | Null = js.native
      @JSName("closest")
      def closest_optgroup(selector: optgroup): HTMLOptGroupElement | Null = js.native
      @JSName("closest")
      def closest_option(selector: option): HTMLOptionElement | Null = js.native
      @JSName("closest")
      def closest_output(selector: output): HTMLOutputElement | Null = js.native
      @JSName("closest")
      def closest_p(selector: p): HTMLParagraphElement | Null = js.native
      @JSName("closest")
      def closest_param(selector: param): HTMLParamElement | Null = js.native
      @JSName("closest")
      def closest_path(selector: path): SVGPathElement | Null = js.native
      @JSName("closest")
      def closest_pattern(selector: pattern): SVGPatternElement | Null = js.native
      @JSName("closest")
      def closest_picture(selector: picture): HTMLPictureElement | Null = js.native
      @JSName("closest")
      def closest_polygon(selector: polygon): SVGPolygonElement | Null = js.native
      @JSName("closest")
      def closest_polyline(selector: polyline): SVGPolylineElement | Null = js.native
      @JSName("closest")
      def closest_pre(selector: pre): HTMLPreElement | Null = js.native
      @JSName("closest")
      def closest_progress(selector: progress): HTMLProgressElement | Null = js.native
      @JSName("closest")
      def closest_q(selector: q): HTMLQuoteElement | Null = js.native
      @JSName("closest")
      def closest_radialGradient(selector: radialGradient): SVGRadialGradientElement | Null = js.native
      @JSName("closest")
      def closest_rect(selector: rect): SVGRectElement | Null = js.native
      @JSName("closest")
      def closest_rp(selector: rp): HTMLElement | Null = js.native
      @JSName("closest")
      def closest_rt(selector: rt): HTMLElement | Null = js.native
      @JSName("closest")
      def closest_ruby(selector: ruby): HTMLElement | Null = js.native
      @JSName("closest")
      def closest_s(selector: s): HTMLElement | Null = js.native
      @JSName("closest")
      def closest_samp(selector: samp): HTMLElement | Null = js.native
      @JSName("closest")
      def closest_script(selector: script): HTMLScriptElement | Null = js.native
      @JSName("closest")
      def closest_section(selector: section): HTMLElement | Null = js.native
      @JSName("closest")
      def closest_select(selector: select): HTMLSelectElement | Null = js.native
      @JSName("closest")
      def closest_slot(selector: slot): HTMLSlotElement | Null = js.native
      @JSName("closest")
      def closest_small(selector: small): HTMLElement | Null = js.native
      @JSName("closest")
      def closest_source(selector: source): HTMLSourceElement | Null = js.native
      @JSName("closest")
      def closest_span(selector: span): HTMLSpanElement | Null = js.native
      @JSName("closest")
      def closest_stop(selector: stop): SVGStopElement | Null = js.native
      @JSName("closest")
      def closest_strong(selector: strong): HTMLElement | Null = js.native
      @JSName("closest")
      def closest_style(selector: style): HTMLStyleElement | Null = js.native
      @JSName("closest")
      def closest_sub(selector: sub): HTMLElement | Null = js.native
      @JSName("closest")
      def closest_summary(selector: summary): HTMLElement | Null = js.native
      @JSName("closest")
      def closest_sup(selector: sup): HTMLElement | Null = js.native
      @JSName("closest")
      def closest_svg(selector: svg): SVGSVGElement | Null = js.native
      @JSName("closest")
      def closest_switch(selector: switch): SVGSwitchElement | Null = js.native
      @JSName("closest")
      def closest_symbol(selector: symbol): SVGSymbolElement | Null = js.native
      @JSName("closest")
      def closest_table(selector: table): HTMLTableElement | Null = js.native
      @JSName("closest")
      def closest_tbody(selector: tbody): HTMLTableSectionElement | Null = js.native
      @JSName("closest")
      def closest_td(selector: td): HTMLTableDataCellElement | Null = js.native
      @JSName("closest")
      def closest_template(selector: template): HTMLTemplateElement | Null = js.native
      @JSName("closest")
      def closest_text(selector: text): SVGTextElement | Null = js.native
      @JSName("closest")
      def closest_textPath(selector: textPath): SVGTextPathElement | Null = js.native
      @JSName("closest")
      def closest_textarea(selector: textarea): HTMLTextAreaElement | Null = js.native
      @JSName("closest")
      def closest_tfoot(selector: tfoot): HTMLTableSectionElement | Null = js.native
      @JSName("closest")
      def closest_th(selector: th): HTMLTableHeaderCellElement | Null = js.native
      @JSName("closest")
      def closest_thead(selector: thead): HTMLTableSectionElement | Null = js.native
      @JSName("closest")
      def closest_time(selector: time): HTMLTimeElement | Null = js.native
      @JSName("closest")
      def closest_title(selector: title): HTMLTitleElement | Null = js.native
      @JSName("closest")
      def closest_tr(selector: tr): HTMLTableRowElement | Null = js.native
      @JSName("closest")
      def closest_track(selector: track): HTMLTrackElement | Null = js.native
      @JSName("closest")
      def closest_tspan(selector: tspan): SVGTSpanElement | Null = js.native
      @JSName("closest")
      def closest_u(selector: u): HTMLElement | Null = js.native
      @JSName("closest")
      def closest_ul(selector: ul): HTMLUListElement | Null = js.native
      @JSName("closest")
      def closest_use(selector: use): SVGUseElement | Null = js.native
      @JSName("closest")
      def closest_var(selector: `var`): HTMLElement | Null = js.native
      @JSName("closest")
      def closest_video(selector: video): HTMLVideoElement | Null = js.native
      @JSName("closest")
      def closest_view(selector: view): SVGViewElement | Null = js.native
      @JSName("closest")
      def closest_wbr(selector: wbr): HTMLElement | Null = js.native
      
      /**
        * Returns a bitmask indicating the position of other relative to node.
        */
      def compareDocumentPosition(other: Node): Double = js.native
      
      /**
        * Returns true if other is an inclusive descendant of node, and false otherwise.
        */
      def contains(): Boolean = js.native
      def contains(other: Node): Boolean = js.native
      
      /**
        * Dispatches a synthetic event event to target and returns true if either event's cancelable attribute value is false or its preventDefault() method was not invoked, and false otherwise.
        */
      def dispatchEvent(event: Event): Boolean = js.native
      
      /**
        * Returns the first child.
        */
      val firstChild: ChildNode | Null = js.native
      
      /**
        * Returns the first child that is an element, and null otherwise.
        */
      val firstElementChild: Element | Null = js.native
      
      def getAnimations(): js.Array[Animation] = js.native
      
      /**
        * Returns element's first attribute whose qualified name is qualifiedName, and null if there is no such attribute otherwise.
        */
      def getAttribute(qualifiedName: String): String | Null = js.native
      
      /**
        * Returns element's attribute whose namespace is namespace and local name is localName, and null if there is no such attribute otherwise.
        */
      def getAttributeNS(namespace: String, localName: String): String | Null = js.native
      def getAttributeNS(namespace: Null, localName: String): String | Null = js.native
      
      /**
        * Returns the qualified names of all element's attributes. Can contain duplicates.
        */
      def getAttributeNames(): js.Array[String] = js.native
      
      def getAttributeNode(qualifiedName: String): Attr | Null = js.native
      
      def getAttributeNodeNS(namespace: String, localName: String): Attr | Null = js.native
      def getAttributeNodeNS(namespace: Null, localName: String): Attr | Null = js.native
      
      def getBoundingClientRect(): DOMRect = js.native
      
      def getClientRects(): DOMRectList = js.native
      
      /**
        * Returns a HTMLCollection of the elements in the object on which the method was invoked (a document or an element) that have all the classes given by classNames. The classNames argument is interpreted as a space-separated list of classes.
        */
      def getElementsByClassName(classNames: String): HTMLCollectionOf[Element] = js.native
      
      def getElementsByTagName(qualifiedName: String): HTMLCollectionOf[Element] = js.native
      
      def getElementsByTagNameNS(namespaceURI: String, localName: String): HTMLCollectionOf[Element] = js.native
      @JSName("getElementsByTagNameNS")
      def getElementsByTagNameNS_httpwwww3org1999xhtml(namespaceURI: httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml, localName: String): HTMLCollectionOf[HTMLElement] = js.native
      @JSName("getElementsByTagNameNS")
      def getElementsByTagNameNS_httpwwww3org2000svg(namespaceURI: httpColonSlashSlashwwwDotw3DotorgSlash2000Slashsvg, localName: String): HTMLCollectionOf[SVGElement] = js.native
      
      @JSName("getElementsByTagName")
      def getElementsByTagName_a(qualifiedName: a): HTMLCollectionOf[HTMLAnchorElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_abbr(qualifiedName: abbr): HTMLCollectionOf[HTMLElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_address(qualifiedName: address): HTMLCollectionOf[HTMLElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_applet(qualifiedName: applet): HTMLCollectionOf[HTMLAppletElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_area(qualifiedName: area): HTMLCollectionOf[HTMLAreaElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_article(qualifiedName: article): HTMLCollectionOf[HTMLElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_aside(qualifiedName: aside): HTMLCollectionOf[HTMLElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_audio(qualifiedName: audio): HTMLCollectionOf[HTMLAudioElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_b(qualifiedName: b): HTMLCollectionOf[HTMLElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_base(qualifiedName: base): HTMLCollectionOf[HTMLBaseElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_basefont(qualifiedName: basefont): HTMLCollectionOf[HTMLBaseFontElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_bdi(qualifiedName: bdi): HTMLCollectionOf[HTMLElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_bdo(qualifiedName: bdo): HTMLCollectionOf[HTMLElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_blockquote(qualifiedName: blockquote): HTMLCollectionOf[HTMLQuoteElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_body(qualifiedName: body): HTMLCollectionOf[HTMLBodyElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_br(qualifiedName: br): HTMLCollectionOf[HTMLBRElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_button(qualifiedName: button): HTMLCollectionOf[HTMLButtonElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_canvas(qualifiedName: canvas): HTMLCollectionOf[HTMLCanvasElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_caption(qualifiedName: caption): HTMLCollectionOf[HTMLTableCaptionElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_circle(qualifiedName: circle): HTMLCollectionOf[SVGCircleElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_cite(qualifiedName: cite): HTMLCollectionOf[HTMLElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_clipPath(qualifiedName: clipPath): HTMLCollectionOf[SVGClipPathElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_code(qualifiedName: code): HTMLCollectionOf[HTMLElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_col(qualifiedName: col): HTMLCollectionOf[HTMLTableColElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_colgroup(qualifiedName: colgroup): HTMLCollectionOf[HTMLTableColElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_data(qualifiedName: data): HTMLCollectionOf[HTMLDataElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_datalist(qualifiedName: datalist): HTMLCollectionOf[HTMLDataListElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_dd(qualifiedName: dd): HTMLCollectionOf[HTMLElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_defs(qualifiedName: defs): HTMLCollectionOf[SVGDefsElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_del(qualifiedName: del): HTMLCollectionOf[HTMLModElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_desc(qualifiedName: desc): HTMLCollectionOf[SVGDescElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_details(qualifiedName: details): HTMLCollectionOf[HTMLDetailsElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_dfn(qualifiedName: dfn): HTMLCollectionOf[HTMLElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_dialog(qualifiedName: dialog): HTMLCollectionOf[HTMLDialogElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_dir(qualifiedName: dir): HTMLCollectionOf[HTMLDirectoryElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_div(qualifiedName: div): HTMLCollectionOf[HTMLDivElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_dl(qualifiedName: dl): HTMLCollectionOf[HTMLDListElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_dt(qualifiedName: dt): HTMLCollectionOf[HTMLElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_ellipse(qualifiedName: ellipse): HTMLCollectionOf[SVGEllipseElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_em(qualifiedName: em): HTMLCollectionOf[HTMLElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_embed(qualifiedName: embed): HTMLCollectionOf[HTMLEmbedElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_feBlend(qualifiedName: feBlend): HTMLCollectionOf[SVGFEBlendElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_feColorMatrix(qualifiedName: feColorMatrix): HTMLCollectionOf[SVGFEColorMatrixElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_feComponentTransfer(qualifiedName: feComponentTransfer): HTMLCollectionOf[SVGFEComponentTransferElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_feComposite(qualifiedName: feComposite): HTMLCollectionOf[SVGFECompositeElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_feConvolveMatrix(qualifiedName: feConvolveMatrix): HTMLCollectionOf[SVGFEConvolveMatrixElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_feDiffuseLighting(qualifiedName: feDiffuseLighting): HTMLCollectionOf[SVGFEDiffuseLightingElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_feDisplacementMap(qualifiedName: feDisplacementMap): HTMLCollectionOf[SVGFEDisplacementMapElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_feDistantLight(qualifiedName: feDistantLight): HTMLCollectionOf[SVGFEDistantLightElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_feFlood(qualifiedName: feFlood): HTMLCollectionOf[SVGFEFloodElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_feFuncA(qualifiedName: feFuncA): HTMLCollectionOf[SVGFEFuncAElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_feFuncB(qualifiedName: feFuncB): HTMLCollectionOf[SVGFEFuncBElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_feFuncG(qualifiedName: feFuncG): HTMLCollectionOf[SVGFEFuncGElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_feFuncR(qualifiedName: feFuncR): HTMLCollectionOf[SVGFEFuncRElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_feGaussianBlur(qualifiedName: feGaussianBlur): HTMLCollectionOf[SVGFEGaussianBlurElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_feImage(qualifiedName: feImage): HTMLCollectionOf[SVGFEImageElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_feMerge(qualifiedName: feMerge): HTMLCollectionOf[SVGFEMergeElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_feMergeNode(qualifiedName: feMergeNode): HTMLCollectionOf[SVGFEMergeNodeElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_feMorphology(qualifiedName: feMorphology): HTMLCollectionOf[SVGFEMorphologyElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_feOffset(qualifiedName: feOffset): HTMLCollectionOf[SVGFEOffsetElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_fePointLight(qualifiedName: fePointLight): HTMLCollectionOf[SVGFEPointLightElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_feSpecularLighting(qualifiedName: feSpecularLighting): HTMLCollectionOf[SVGFESpecularLightingElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_feSpotLight(qualifiedName: feSpotLight): HTMLCollectionOf[SVGFESpotLightElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_feTile(qualifiedName: feTile): HTMLCollectionOf[SVGFETileElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_feTurbulence(qualifiedName: feTurbulence): HTMLCollectionOf[SVGFETurbulenceElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_fieldset(qualifiedName: fieldset): HTMLCollectionOf[HTMLFieldSetElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_figcaption(qualifiedName: figcaption): HTMLCollectionOf[HTMLElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_figure(qualifiedName: figure): HTMLCollectionOf[HTMLElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_filter(qualifiedName: filter): HTMLCollectionOf[SVGFilterElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_font(qualifiedName: font): HTMLCollectionOf[HTMLFontElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_footer(qualifiedName: footer): HTMLCollectionOf[HTMLElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_foreignObject(qualifiedName: foreignObject): HTMLCollectionOf[SVGForeignObjectElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_form(qualifiedName: form): HTMLCollectionOf[HTMLFormElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_frame(qualifiedName: frame): HTMLCollectionOf[HTMLFrameElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_frameset(qualifiedName: frameset): HTMLCollectionOf[HTMLFrameSetElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_g(qualifiedName: g): HTMLCollectionOf[SVGGElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_h1(qualifiedName: h1): HTMLCollectionOf[HTMLHeadingElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_h2(qualifiedName: h2): HTMLCollectionOf[HTMLHeadingElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_h3(qualifiedName: h3): HTMLCollectionOf[HTMLHeadingElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_h4(qualifiedName: h4): HTMLCollectionOf[HTMLHeadingElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_h5(qualifiedName: h5): HTMLCollectionOf[HTMLHeadingElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_h6(qualifiedName: h6): HTMLCollectionOf[HTMLHeadingElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_head(qualifiedName: head): HTMLCollectionOf[HTMLHeadElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_header(qualifiedName: header): HTMLCollectionOf[HTMLElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_hgroup(qualifiedName: hgroup): HTMLCollectionOf[HTMLElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_hr(qualifiedName: hr): HTMLCollectionOf[HTMLHRElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_html(qualifiedName: html): HTMLCollectionOf[HTMLHtmlElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_i(qualifiedName: i): HTMLCollectionOf[HTMLElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_iframe(qualifiedName: iframe): HTMLCollectionOf[HTMLIFrameElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_image(qualifiedName: image): HTMLCollectionOf[SVGImageElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_img(qualifiedName: img): HTMLCollectionOf[HTMLImageElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_input(qualifiedName: input): HTMLCollectionOf[HTMLInputElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_ins(qualifiedName: ins): HTMLCollectionOf[HTMLModElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_kbd(qualifiedName: kbd): HTMLCollectionOf[HTMLElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_label(qualifiedName: label): HTMLCollectionOf[HTMLLabelElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_legend(qualifiedName: legend): HTMLCollectionOf[HTMLLegendElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_li(qualifiedName: li): HTMLCollectionOf[HTMLLIElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_line(qualifiedName: line): HTMLCollectionOf[SVGLineElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_linearGradient(qualifiedName: linearGradient): HTMLCollectionOf[SVGLinearGradientElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_link(qualifiedName: link): HTMLCollectionOf[HTMLLinkElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_main(qualifiedName: main): HTMLCollectionOf[HTMLElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_map(qualifiedName: map): HTMLCollectionOf[HTMLMapElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_mark(qualifiedName: mark): HTMLCollectionOf[HTMLElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_marker(qualifiedName: marker): HTMLCollectionOf[SVGMarkerElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_marquee(qualifiedName: marquee): HTMLCollectionOf[HTMLMarqueeElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_mask(qualifiedName: mask): HTMLCollectionOf[SVGMaskElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_menu(qualifiedName: menu): HTMLCollectionOf[HTMLMenuElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_meta(qualifiedName: meta): HTMLCollectionOf[HTMLMetaElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_metadata(qualifiedName: metadata): HTMLCollectionOf[SVGMetadataElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_meter(qualifiedName: meter): HTMLCollectionOf[HTMLMeterElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_nav(qualifiedName: nav): HTMLCollectionOf[HTMLElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_noscript(qualifiedName: noscript): HTMLCollectionOf[HTMLElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_object(qualifiedName: `object`): HTMLCollectionOf[HTMLObjectElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_ol(qualifiedName: ol): HTMLCollectionOf[HTMLOListElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_optgroup(qualifiedName: optgroup): HTMLCollectionOf[HTMLOptGroupElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_option(qualifiedName: option): HTMLCollectionOf[HTMLOptionElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_output(qualifiedName: output): HTMLCollectionOf[HTMLOutputElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_p(qualifiedName: p): HTMLCollectionOf[HTMLParagraphElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_param(qualifiedName: param): HTMLCollectionOf[HTMLParamElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_path(qualifiedName: path): HTMLCollectionOf[SVGPathElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_pattern(qualifiedName: pattern): HTMLCollectionOf[SVGPatternElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_picture(qualifiedName: picture): HTMLCollectionOf[HTMLPictureElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_polygon(qualifiedName: polygon): HTMLCollectionOf[SVGPolygonElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_polyline(qualifiedName: polyline): HTMLCollectionOf[SVGPolylineElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_pre(qualifiedName: pre): HTMLCollectionOf[HTMLPreElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_progress(qualifiedName: progress): HTMLCollectionOf[HTMLProgressElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_q(qualifiedName: q): HTMLCollectionOf[HTMLQuoteElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_radialGradient(qualifiedName: radialGradient): HTMLCollectionOf[SVGRadialGradientElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_rect(qualifiedName: rect): HTMLCollectionOf[SVGRectElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_rp(qualifiedName: rp): HTMLCollectionOf[HTMLElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_rt(qualifiedName: rt): HTMLCollectionOf[HTMLElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_ruby(qualifiedName: ruby): HTMLCollectionOf[HTMLElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_s(qualifiedName: s): HTMLCollectionOf[HTMLElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_samp(qualifiedName: samp): HTMLCollectionOf[HTMLElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_script(qualifiedName: script): HTMLCollectionOf[HTMLScriptElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_section(qualifiedName: section): HTMLCollectionOf[HTMLElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_select(qualifiedName: select): HTMLCollectionOf[HTMLSelectElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_slot(qualifiedName: slot): HTMLCollectionOf[HTMLSlotElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_small(qualifiedName: small): HTMLCollectionOf[HTMLElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_source(qualifiedName: source): HTMLCollectionOf[HTMLSourceElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_span(qualifiedName: span): HTMLCollectionOf[HTMLSpanElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_stop(qualifiedName: stop): HTMLCollectionOf[SVGStopElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_strong(qualifiedName: strong): HTMLCollectionOf[HTMLElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_style(qualifiedName: style): HTMLCollectionOf[HTMLStyleElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_sub(qualifiedName: sub): HTMLCollectionOf[HTMLElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_summary(qualifiedName: summary): HTMLCollectionOf[HTMLElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_sup(qualifiedName: sup): HTMLCollectionOf[HTMLElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_svg(qualifiedName: svg): HTMLCollectionOf[SVGSVGElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_switch(qualifiedName: switch): HTMLCollectionOf[SVGSwitchElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_symbol(qualifiedName: symbol): HTMLCollectionOf[SVGSymbolElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_table(qualifiedName: table): HTMLCollectionOf[HTMLTableElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_tbody(qualifiedName: tbody): HTMLCollectionOf[HTMLTableSectionElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_td(qualifiedName: td): HTMLCollectionOf[HTMLTableDataCellElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_template(qualifiedName: template): HTMLCollectionOf[HTMLTemplateElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_text(qualifiedName: text): HTMLCollectionOf[SVGTextElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_textPath(qualifiedName: textPath): HTMLCollectionOf[SVGTextPathElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_textarea(qualifiedName: textarea): HTMLCollectionOf[HTMLTextAreaElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_tfoot(qualifiedName: tfoot): HTMLCollectionOf[HTMLTableSectionElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_th(qualifiedName: th): HTMLCollectionOf[HTMLTableHeaderCellElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_thead(qualifiedName: thead): HTMLCollectionOf[HTMLTableSectionElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_time(qualifiedName: time): HTMLCollectionOf[HTMLTimeElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_title(qualifiedName: title): HTMLCollectionOf[HTMLTitleElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_tr(qualifiedName: tr): HTMLCollectionOf[HTMLTableRowElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_track(qualifiedName: track): HTMLCollectionOf[HTMLTrackElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_tspan(qualifiedName: tspan): HTMLCollectionOf[SVGTSpanElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_u(qualifiedName: u): HTMLCollectionOf[HTMLElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_ul(qualifiedName: ul): HTMLCollectionOf[HTMLUListElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_use(qualifiedName: use): HTMLCollectionOf[SVGUseElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_var(qualifiedName: `var`): HTMLCollectionOf[HTMLElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_video(qualifiedName: video): HTMLCollectionOf[HTMLVideoElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_view(qualifiedName: view): HTMLCollectionOf[SVGViewElement] = js.native
      @JSName("getElementsByTagName")
      def getElementsByTagName_wbr(qualifiedName: wbr): HTMLCollectionOf[HTMLElement] = js.native
      
      /**
        * Returns node's root.
        */
      def getRootNode(): Node = js.native
      def getRootNode(options: GetRootNodeOptions): Node = js.native
      
      /**
        * Returns true if element has an attribute whose qualified name is qualifiedName, and false otherwise.
        */
      def hasAttribute(qualifiedName: String): Boolean = js.native
      
      /**
        * Returns true if element has an attribute whose namespace is namespace and local name is localName.
        */
      def hasAttributeNS(namespace: String, localName: String): Boolean = js.native
      def hasAttributeNS(namespace: Null, localName: String): Boolean = js.native
      
      /**
        * Returns true if element has attributes, and false otherwise.
        */
      def hasAttributes(): Boolean = js.native
      
      /**
        * Returns whether node has children.
        */
      def hasChildNodes(): Boolean = js.native
      
      def hasPointerCapture(pointerId: Double): Boolean = js.native
      
      /**
        * Returns the value of element's id content attribute. Can be set to change it.
        */
      var id: String = js.native
      
      var innerHTML: String = js.native
      
      def insertAdjacentElement(position: InsertPosition, insertedElement: Element): Element | Null = js.native
      
      def insertAdjacentHTML(where: InsertPosition, html: String): Unit = js.native
      
      def insertAdjacentText(where: InsertPosition, text: String): Unit = js.native
      
      def insertBefore[T /* <: Node */](newChild: T): T = js.native
      def insertBefore[T /* <: Node */](newChild: T, refChild: Node): T = js.native
      
      /**
        * Returns true if node is connected and false otherwise.
        */
      val isConnected: Boolean = js.native
      
      def isDefaultNamespace(): Boolean = js.native
      def isDefaultNamespace(namespace: String): Boolean = js.native
      
      /**
        * Returns whether node and otherNode have the same properties.
        */
      def isEqualNode(): Boolean = js.native
      def isEqualNode(otherNode: Node): Boolean = js.native
      
      def isSameNode(): Boolean = js.native
      def isSameNode(otherNode: Node): Boolean = js.native
      
      /**
        * Returns the last child.
        */
      val lastChild: ChildNode | Null = js.native
      
      /**
        * Returns the last child that is an element, and null otherwise.
        */
      val lastElementChild: Element | Null = js.native
      
      /**
        * Returns the local name.
        */
      val localName: String = js.native
      
      def lookupNamespaceURI(): String | Null = js.native
      def lookupNamespaceURI(prefix: String): String | Null = js.native
      
      def lookupPrefix(): String | Null = js.native
      def lookupPrefix(namespace: String): String | Null = js.native
      
      /**
        * Returns true if matching selectors against element's root yields element, and false otherwise.
        */
      def matches(selectors: String): Boolean = js.native
      
      def msGetRegionContent(): js.Any = js.native
      
      /**
        * Returns the namespace.
        */
      val namespaceURI: String | Null = js.native
      
      /**
        * Returns the first following sibling that is an element, and null otherwise.
        */
      val nextElementSibling: Element | Null = js.native
      
      /**
        * Returns the next sibling.
        */
      val nextSibling: ChildNode | Null = js.native
      
      /**
        * Returns a string appropriate for the type of node.
        */
      val nodeName: String = js.native
      
      /**
        * Returns the type of node.
        */
      val nodeType: Double = js.native
      
      var nodeValue: String | Null = js.native
      
      /**
        * Removes empty exclusive Text nodes and concatenates the data of remaining contiguous exclusive Text nodes into the first of their nodes.
        */
      def normalize(): Unit = js.native
      
      var onfullscreenchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
      
      var onfullscreenerror: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
      
      var outerHTML: String = js.native
      
      val ownerDocument: Document = js.native
      
      /**
        * Returns the parent element.
        */
      val parentElement: HTMLElement | Null = js.native
      
      /**
        * Returns the parent.
        */
      val parentNode: (Node with ParentNode) | Null = js.native
      
      /**
        * Returns the namespace prefix.
        */
      val prefix: String | Null = js.native
      
      /**
        * Inserts nodes before the first child of node, while replacing strings in nodes with equivalent Text nodes.
        * 
        * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
        */
      def prepend(nodes: (Node | String)*): Unit = js.native
      
      /**
        * Returns the first preceding sibling that is an element, and null otherwise.
        */
      val previousElementSibling: Element | Null = js.native
      
      /**
        * Returns the previous sibling.
        */
      val previousSibling: ChildNode | Null = js.native
      
      def querySelector[E /* <: Element */](selectors: String): E | Null = js.native
      
      def querySelectorAll[E /* <: Element */](selectors: String): NodeListOf[E with Node] = js.native
      /**
        * Returns all element descendants of node that match selectors.
        */
      @JSName("querySelectorAll")
      def querySelectorAll_a(selectors: a): NodeListOf[HTMLAnchorElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_abbr(selectors: abbr): NodeListOf[HTMLElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_address(selectors: address): NodeListOf[HTMLElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_applet(selectors: applet): NodeListOf[HTMLAppletElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_area(selectors: area): NodeListOf[HTMLAreaElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_article(selectors: article): NodeListOf[HTMLElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_aside(selectors: aside): NodeListOf[HTMLElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_audio(selectors: audio): NodeListOf[HTMLAudioElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_b(selectors: b): NodeListOf[HTMLElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_base(selectors: base): NodeListOf[HTMLBaseElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_basefont(selectors: basefont): NodeListOf[HTMLBaseFontElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_bdi(selectors: bdi): NodeListOf[HTMLElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_bdo(selectors: bdo): NodeListOf[HTMLElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_blockquote(selectors: blockquote): NodeListOf[HTMLQuoteElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_body(selectors: body): NodeListOf[HTMLBodyElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_br(selectors: br): NodeListOf[HTMLBRElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_button(selectors: button): NodeListOf[HTMLButtonElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_canvas(selectors: canvas): NodeListOf[HTMLCanvasElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_caption(selectors: caption): NodeListOf[HTMLTableCaptionElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_circle(selectors: circle): NodeListOf[SVGCircleElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_cite(selectors: cite): NodeListOf[HTMLElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_clipPath(selectors: clipPath): NodeListOf[SVGClipPathElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_code(selectors: code): NodeListOf[HTMLElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_col(selectors: col): NodeListOf[HTMLTableColElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_colgroup(selectors: colgroup): NodeListOf[HTMLTableColElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_data(selectors: data): NodeListOf[HTMLDataElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_datalist(selectors: datalist): NodeListOf[HTMLDataListElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_dd(selectors: dd): NodeListOf[HTMLElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_defs(selectors: defs): NodeListOf[SVGDefsElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_del(selectors: del): NodeListOf[HTMLModElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_desc(selectors: desc): NodeListOf[SVGDescElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_details(selectors: details): NodeListOf[HTMLDetailsElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_dfn(selectors: dfn): NodeListOf[HTMLElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_dialog(selectors: dialog): NodeListOf[HTMLDialogElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_dir(selectors: dir): NodeListOf[HTMLDirectoryElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_div(selectors: div): NodeListOf[HTMLDivElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_dl(selectors: dl): NodeListOf[HTMLDListElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_dt(selectors: dt): NodeListOf[HTMLElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_ellipse(selectors: ellipse): NodeListOf[SVGEllipseElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_em(selectors: em): NodeListOf[HTMLElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_embed(selectors: embed): NodeListOf[HTMLEmbedElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_feBlend(selectors: feBlend): NodeListOf[SVGFEBlendElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_feColorMatrix(selectors: feColorMatrix): NodeListOf[SVGFEColorMatrixElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_feComponentTransfer(selectors: feComponentTransfer): NodeListOf[SVGFEComponentTransferElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_feComposite(selectors: feComposite): NodeListOf[SVGFECompositeElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_feConvolveMatrix(selectors: feConvolveMatrix): NodeListOf[SVGFEConvolveMatrixElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_feDiffuseLighting(selectors: feDiffuseLighting): NodeListOf[SVGFEDiffuseLightingElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_feDisplacementMap(selectors: feDisplacementMap): NodeListOf[SVGFEDisplacementMapElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_feDistantLight(selectors: feDistantLight): NodeListOf[SVGFEDistantLightElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_feFlood(selectors: feFlood): NodeListOf[SVGFEFloodElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_feFuncA(selectors: feFuncA): NodeListOf[SVGFEFuncAElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_feFuncB(selectors: feFuncB): NodeListOf[SVGFEFuncBElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_feFuncG(selectors: feFuncG): NodeListOf[SVGFEFuncGElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_feFuncR(selectors: feFuncR): NodeListOf[SVGFEFuncRElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_feGaussianBlur(selectors: feGaussianBlur): NodeListOf[SVGFEGaussianBlurElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_feImage(selectors: feImage): NodeListOf[SVGFEImageElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_feMerge(selectors: feMerge): NodeListOf[SVGFEMergeElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_feMergeNode(selectors: feMergeNode): NodeListOf[SVGFEMergeNodeElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_feMorphology(selectors: feMorphology): NodeListOf[SVGFEMorphologyElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_feOffset(selectors: feOffset): NodeListOf[SVGFEOffsetElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_fePointLight(selectors: fePointLight): NodeListOf[SVGFEPointLightElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_feSpecularLighting(selectors: feSpecularLighting): NodeListOf[SVGFESpecularLightingElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_feSpotLight(selectors: feSpotLight): NodeListOf[SVGFESpotLightElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_feTile(selectors: feTile): NodeListOf[SVGFETileElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_feTurbulence(selectors: feTurbulence): NodeListOf[SVGFETurbulenceElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_fieldset(selectors: fieldset): NodeListOf[HTMLFieldSetElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_figcaption(selectors: figcaption): NodeListOf[HTMLElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_figure(selectors: figure): NodeListOf[HTMLElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_filter(selectors: filter): NodeListOf[SVGFilterElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_font(selectors: font): NodeListOf[HTMLFontElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_footer(selectors: footer): NodeListOf[HTMLElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_foreignObject(selectors: foreignObject): NodeListOf[SVGForeignObjectElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_form(selectors: form): NodeListOf[HTMLFormElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_frame(selectors: frame): NodeListOf[HTMLFrameElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_frameset(selectors: frameset): NodeListOf[HTMLFrameSetElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_g(selectors: g): NodeListOf[SVGGElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_h1(selectors: h1): NodeListOf[HTMLHeadingElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_h2(selectors: h2): NodeListOf[HTMLHeadingElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_h3(selectors: h3): NodeListOf[HTMLHeadingElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_h4(selectors: h4): NodeListOf[HTMLHeadingElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_h5(selectors: h5): NodeListOf[HTMLHeadingElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_h6(selectors: h6): NodeListOf[HTMLHeadingElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_head(selectors: head): NodeListOf[HTMLHeadElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_header(selectors: header): NodeListOf[HTMLElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_hgroup(selectors: hgroup): NodeListOf[HTMLElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_hr(selectors: hr): NodeListOf[HTMLHRElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_html(selectors: html): NodeListOf[HTMLHtmlElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_i(selectors: i): NodeListOf[HTMLElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_iframe(selectors: iframe): NodeListOf[HTMLIFrameElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_image(selectors: image): NodeListOf[SVGImageElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_img(selectors: img): NodeListOf[HTMLImageElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_input(selectors: input): NodeListOf[HTMLInputElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_ins(selectors: ins): NodeListOf[HTMLModElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_kbd(selectors: kbd): NodeListOf[HTMLElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_label(selectors: label): NodeListOf[HTMLLabelElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_legend(selectors: legend): NodeListOf[HTMLLegendElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_li(selectors: li): NodeListOf[HTMLLIElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_line(selectors: line): NodeListOf[SVGLineElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_linearGradient(selectors: linearGradient): NodeListOf[SVGLinearGradientElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_link(selectors: link): NodeListOf[HTMLLinkElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_main(selectors: main): NodeListOf[HTMLElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_map(selectors: map): NodeListOf[HTMLMapElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_mark(selectors: mark): NodeListOf[HTMLElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_marker(selectors: marker): NodeListOf[SVGMarkerElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_marquee(selectors: marquee): NodeListOf[HTMLMarqueeElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_mask(selectors: mask): NodeListOf[SVGMaskElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_menu(selectors: menu): NodeListOf[HTMLMenuElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_meta(selectors: meta): NodeListOf[HTMLMetaElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_metadata(selectors: metadata): NodeListOf[SVGMetadataElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_meter(selectors: meter): NodeListOf[HTMLMeterElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_nav(selectors: nav): NodeListOf[HTMLElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_noscript(selectors: noscript): NodeListOf[HTMLElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_object(selectors: `object`): NodeListOf[HTMLObjectElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_ol(selectors: ol): NodeListOf[HTMLOListElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_optgroup(selectors: optgroup): NodeListOf[HTMLOptGroupElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_option(selectors: option): NodeListOf[HTMLOptionElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_output(selectors: output): NodeListOf[HTMLOutputElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_p(selectors: p): NodeListOf[HTMLParagraphElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_param(selectors: param): NodeListOf[HTMLParamElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_path(selectors: path): NodeListOf[SVGPathElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_pattern(selectors: pattern): NodeListOf[SVGPatternElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_picture(selectors: picture): NodeListOf[HTMLPictureElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_polygon(selectors: polygon): NodeListOf[SVGPolygonElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_polyline(selectors: polyline): NodeListOf[SVGPolylineElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_pre(selectors: pre): NodeListOf[HTMLPreElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_progress(selectors: progress): NodeListOf[HTMLProgressElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_q(selectors: q): NodeListOf[HTMLQuoteElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_radialGradient(selectors: radialGradient): NodeListOf[SVGRadialGradientElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_rect(selectors: rect): NodeListOf[SVGRectElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_rp(selectors: rp): NodeListOf[HTMLElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_rt(selectors: rt): NodeListOf[HTMLElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_ruby(selectors: ruby): NodeListOf[HTMLElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_s(selectors: s): NodeListOf[HTMLElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_samp(selectors: samp): NodeListOf[HTMLElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_script(selectors: script): NodeListOf[HTMLScriptElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_section(selectors: section): NodeListOf[HTMLElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_select(selectors: select): NodeListOf[HTMLSelectElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_slot(selectors: slot): NodeListOf[HTMLSlotElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_small(selectors: small): NodeListOf[HTMLElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_source(selectors: source): NodeListOf[HTMLSourceElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_span(selectors: span): NodeListOf[HTMLSpanElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_stop(selectors: stop): NodeListOf[SVGStopElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_strong(selectors: strong): NodeListOf[HTMLElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_style(selectors: style): NodeListOf[HTMLStyleElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_sub(selectors: sub): NodeListOf[HTMLElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_summary(selectors: summary): NodeListOf[HTMLElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_sup(selectors: sup): NodeListOf[HTMLElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_svg(selectors: svg): NodeListOf[SVGSVGElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_switch(selectors: switch): NodeListOf[SVGSwitchElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_symbol(selectors: symbol): NodeListOf[SVGSymbolElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_table(selectors: table): NodeListOf[HTMLTableElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_tbody(selectors: tbody): NodeListOf[HTMLTableSectionElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_td(selectors: td): NodeListOf[HTMLTableDataCellElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_template(selectors: template): NodeListOf[HTMLTemplateElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_text(selectors: text): NodeListOf[SVGTextElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_textPath(selectors: textPath): NodeListOf[SVGTextPathElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_textarea(selectors: textarea): NodeListOf[HTMLTextAreaElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_tfoot(selectors: tfoot): NodeListOf[HTMLTableSectionElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_th(selectors: th): NodeListOf[HTMLTableHeaderCellElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_thead(selectors: thead): NodeListOf[HTMLTableSectionElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_time(selectors: time): NodeListOf[HTMLTimeElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_title(selectors: title): NodeListOf[HTMLTitleElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_tr(selectors: tr): NodeListOf[HTMLTableRowElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_track(selectors: track): NodeListOf[HTMLTrackElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_tspan(selectors: tspan): NodeListOf[SVGTSpanElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_u(selectors: u): NodeListOf[HTMLElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_ul(selectors: ul): NodeListOf[HTMLUListElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_use(selectors: use): NodeListOf[SVGUseElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_var(selectors: `var`): NodeListOf[HTMLElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_video(selectors: video): NodeListOf[HTMLVideoElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_view(selectors: view): NodeListOf[SVGViewElement with Node] = js.native
      @JSName("querySelectorAll")
      def querySelectorAll_wbr(selectors: wbr): NodeListOf[HTMLElement with Node] = js.native
      
      /**
        * Returns the first element that is a descendant of node that matches selectors.
        */
      @JSName("querySelector")
      def querySelector_a(selectors: a): HTMLAnchorElement | Null = js.native
      @JSName("querySelector")
      def querySelector_abbr(selectors: abbr): HTMLElement | Null = js.native
      @JSName("querySelector")
      def querySelector_address(selectors: address): HTMLElement | Null = js.native
      @JSName("querySelector")
      def querySelector_applet(selectors: applet): HTMLAppletElement | Null = js.native
      @JSName("querySelector")
      def querySelector_area(selectors: area): HTMLAreaElement | Null = js.native
      @JSName("querySelector")
      def querySelector_article(selectors: article): HTMLElement | Null = js.native
      @JSName("querySelector")
      def querySelector_aside(selectors: aside): HTMLElement | Null = js.native
      @JSName("querySelector")
      def querySelector_audio(selectors: audio): HTMLAudioElement | Null = js.native
      @JSName("querySelector")
      def querySelector_b(selectors: b): HTMLElement | Null = js.native
      @JSName("querySelector")
      def querySelector_base(selectors: base): HTMLBaseElement | Null = js.native
      @JSName("querySelector")
      def querySelector_basefont(selectors: basefont): HTMLBaseFontElement | Null = js.native
      @JSName("querySelector")
      def querySelector_bdi(selectors: bdi): HTMLElement | Null = js.native
      @JSName("querySelector")
      def querySelector_bdo(selectors: bdo): HTMLElement | Null = js.native
      @JSName("querySelector")
      def querySelector_blockquote(selectors: blockquote): HTMLQuoteElement | Null = js.native
      @JSName("querySelector")
      def querySelector_body(selectors: body): HTMLBodyElement | Null = js.native
      @JSName("querySelector")
      def querySelector_br(selectors: br): HTMLBRElement | Null = js.native
      @JSName("querySelector")
      def querySelector_button(selectors: button): HTMLButtonElement | Null = js.native
      @JSName("querySelector")
      def querySelector_canvas(selectors: canvas): HTMLCanvasElement | Null = js.native
      @JSName("querySelector")
      def querySelector_caption(selectors: caption): HTMLTableCaptionElement | Null = js.native
      @JSName("querySelector")
      def querySelector_circle(selectors: circle): SVGCircleElement | Null = js.native
      @JSName("querySelector")
      def querySelector_cite(selectors: cite): HTMLElement | Null = js.native
      @JSName("querySelector")
      def querySelector_clipPath(selectors: clipPath): SVGClipPathElement | Null = js.native
      @JSName("querySelector")
      def querySelector_code(selectors: code): HTMLElement | Null = js.native
      @JSName("querySelector")
      def querySelector_col(selectors: col): HTMLTableColElement | Null = js.native
      @JSName("querySelector")
      def querySelector_colgroup(selectors: colgroup): HTMLTableColElement | Null = js.native
      @JSName("querySelector")
      def querySelector_data(selectors: data): HTMLDataElement | Null = js.native
      @JSName("querySelector")
      def querySelector_datalist(selectors: datalist): HTMLDataListElement | Null = js.native
      @JSName("querySelector")
      def querySelector_dd(selectors: dd): HTMLElement | Null = js.native
      @JSName("querySelector")
      def querySelector_defs(selectors: defs): SVGDefsElement | Null = js.native
      @JSName("querySelector")
      def querySelector_del(selectors: del): HTMLModElement | Null = js.native
      @JSName("querySelector")
      def querySelector_desc(selectors: desc): SVGDescElement | Null = js.native
      @JSName("querySelector")
      def querySelector_details(selectors: details): HTMLDetailsElement | Null = js.native
      @JSName("querySelector")
      def querySelector_dfn(selectors: dfn): HTMLElement | Null = js.native
      @JSName("querySelector")
      def querySelector_dialog(selectors: dialog): HTMLDialogElement | Null = js.native
      @JSName("querySelector")
      def querySelector_dir(selectors: dir): HTMLDirectoryElement | Null = js.native
      @JSName("querySelector")
      def querySelector_div(selectors: div): HTMLDivElement | Null = js.native
      @JSName("querySelector")
      def querySelector_dl(selectors: dl): HTMLDListElement | Null = js.native
      @JSName("querySelector")
      def querySelector_dt(selectors: dt): HTMLElement | Null = js.native
      @JSName("querySelector")
      def querySelector_ellipse(selectors: ellipse): SVGEllipseElement | Null = js.native
      @JSName("querySelector")
      def querySelector_em(selectors: em): HTMLElement | Null = js.native
      @JSName("querySelector")
      def querySelector_embed(selectors: embed): HTMLEmbedElement | Null = js.native
      @JSName("querySelector")
      def querySelector_feBlend(selectors: feBlend): SVGFEBlendElement | Null = js.native
      @JSName("querySelector")
      def querySelector_feColorMatrix(selectors: feColorMatrix): SVGFEColorMatrixElement | Null = js.native
      @JSName("querySelector")
      def querySelector_feComponentTransfer(selectors: feComponentTransfer): SVGFEComponentTransferElement | Null = js.native
      @JSName("querySelector")
      def querySelector_feComposite(selectors: feComposite): SVGFECompositeElement | Null = js.native
      @JSName("querySelector")
      def querySelector_feConvolveMatrix(selectors: feConvolveMatrix): SVGFEConvolveMatrixElement | Null = js.native
      @JSName("querySelector")
      def querySelector_feDiffuseLighting(selectors: feDiffuseLighting): SVGFEDiffuseLightingElement | Null = js.native
      @JSName("querySelector")
      def querySelector_feDisplacementMap(selectors: feDisplacementMap): SVGFEDisplacementMapElement | Null = js.native
      @JSName("querySelector")
      def querySelector_feDistantLight(selectors: feDistantLight): SVGFEDistantLightElement | Null = js.native
      @JSName("querySelector")
      def querySelector_feFlood(selectors: feFlood): SVGFEFloodElement | Null = js.native
      @JSName("querySelector")
      def querySelector_feFuncA(selectors: feFuncA): SVGFEFuncAElement | Null = js.native
      @JSName("querySelector")
      def querySelector_feFuncB(selectors: feFuncB): SVGFEFuncBElement | Null = js.native
      @JSName("querySelector")
      def querySelector_feFuncG(selectors: feFuncG): SVGFEFuncGElement | Null = js.native
      @JSName("querySelector")
      def querySelector_feFuncR(selectors: feFuncR): SVGFEFuncRElement | Null = js.native
      @JSName("querySelector")
      def querySelector_feGaussianBlur(selectors: feGaussianBlur): SVGFEGaussianBlurElement | Null = js.native
      @JSName("querySelector")
      def querySelector_feImage(selectors: feImage): SVGFEImageElement | Null = js.native
      @JSName("querySelector")
      def querySelector_feMerge(selectors: feMerge): SVGFEMergeElement | Null = js.native
      @JSName("querySelector")
      def querySelector_feMergeNode(selectors: feMergeNode): SVGFEMergeNodeElement | Null = js.native
      @JSName("querySelector")
      def querySelector_feMorphology(selectors: feMorphology): SVGFEMorphologyElement | Null = js.native
      @JSName("querySelector")
      def querySelector_feOffset(selectors: feOffset): SVGFEOffsetElement | Null = js.native
      @JSName("querySelector")
      def querySelector_fePointLight(selectors: fePointLight): SVGFEPointLightElement | Null = js.native
      @JSName("querySelector")
      def querySelector_feSpecularLighting(selectors: feSpecularLighting): SVGFESpecularLightingElement | Null = js.native
      @JSName("querySelector")
      def querySelector_feSpotLight(selectors: feSpotLight): SVGFESpotLightElement | Null = js.native
      @JSName("querySelector")
      def querySelector_feTile(selectors: feTile): SVGFETileElement | Null = js.native
      @JSName("querySelector")
      def querySelector_feTurbulence(selectors: feTurbulence): SVGFETurbulenceElement | Null = js.native
      @JSName("querySelector")
      def querySelector_fieldset(selectors: fieldset): HTMLFieldSetElement | Null = js.native
      @JSName("querySelector")
      def querySelector_figcaption(selectors: figcaption): HTMLElement | Null = js.native
      @JSName("querySelector")
      def querySelector_figure(selectors: figure): HTMLElement | Null = js.native
      @JSName("querySelector")
      def querySelector_filter(selectors: filter): SVGFilterElement | Null = js.native
      @JSName("querySelector")
      def querySelector_font(selectors: font): HTMLFontElement | Null = js.native
      @JSName("querySelector")
      def querySelector_footer(selectors: footer): HTMLElement | Null = js.native
      @JSName("querySelector")
      def querySelector_foreignObject(selectors: foreignObject): SVGForeignObjectElement | Null = js.native
      @JSName("querySelector")
      def querySelector_form(selectors: form): HTMLFormElement | Null = js.native
      @JSName("querySelector")
      def querySelector_frame(selectors: frame): HTMLFrameElement | Null = js.native
      @JSName("querySelector")
      def querySelector_frameset(selectors: frameset): HTMLFrameSetElement | Null = js.native
      @JSName("querySelector")
      def querySelector_g(selectors: g): SVGGElement | Null = js.native
      @JSName("querySelector")
      def querySelector_h1(selectors: h1): HTMLHeadingElement | Null = js.native
      @JSName("querySelector")
      def querySelector_h2(selectors: h2): HTMLHeadingElement | Null = js.native
      @JSName("querySelector")
      def querySelector_h3(selectors: h3): HTMLHeadingElement | Null = js.native
      @JSName("querySelector")
      def querySelector_h4(selectors: h4): HTMLHeadingElement | Null = js.native
      @JSName("querySelector")
      def querySelector_h5(selectors: h5): HTMLHeadingElement | Null = js.native
      @JSName("querySelector")
      def querySelector_h6(selectors: h6): HTMLHeadingElement | Null = js.native
      @JSName("querySelector")
      def querySelector_head(selectors: head): HTMLHeadElement | Null = js.native
      @JSName("querySelector")
      def querySelector_header(selectors: header): HTMLElement | Null = js.native
      @JSName("querySelector")
      def querySelector_hgroup(selectors: hgroup): HTMLElement | Null = js.native
      @JSName("querySelector")
      def querySelector_hr(selectors: hr): HTMLHRElement | Null = js.native
      @JSName("querySelector")
      def querySelector_html(selectors: html): HTMLHtmlElement | Null = js.native
      @JSName("querySelector")
      def querySelector_i(selectors: i): HTMLElement | Null = js.native
      @JSName("querySelector")
      def querySelector_iframe(selectors: iframe): HTMLIFrameElement | Null = js.native
      @JSName("querySelector")
      def querySelector_image(selectors: image): SVGImageElement | Null = js.native
      @JSName("querySelector")
      def querySelector_img(selectors: img): HTMLImageElement | Null = js.native
      @JSName("querySelector")
      def querySelector_input(selectors: input): HTMLInputElement | Null = js.native
      @JSName("querySelector")
      def querySelector_ins(selectors: ins): HTMLModElement | Null = js.native
      @JSName("querySelector")
      def querySelector_kbd(selectors: kbd): HTMLElement | Null = js.native
      @JSName("querySelector")
      def querySelector_label(selectors: label): HTMLLabelElement | Null = js.native
      @JSName("querySelector")
      def querySelector_legend(selectors: legend): HTMLLegendElement | Null = js.native
      @JSName("querySelector")
      def querySelector_li(selectors: li): HTMLLIElement | Null = js.native
      @JSName("querySelector")
      def querySelector_line(selectors: line): SVGLineElement | Null = js.native
      @JSName("querySelector")
      def querySelector_linearGradient(selectors: linearGradient): SVGLinearGradientElement | Null = js.native
      @JSName("querySelector")
      def querySelector_link(selectors: link): HTMLLinkElement | Null = js.native
      @JSName("querySelector")
      def querySelector_main(selectors: main): HTMLElement | Null = js.native
      @JSName("querySelector")
      def querySelector_map(selectors: map): HTMLMapElement | Null = js.native
      @JSName("querySelector")
      def querySelector_mark(selectors: mark): HTMLElement | Null = js.native
      @JSName("querySelector")
      def querySelector_marker(selectors: marker): SVGMarkerElement | Null = js.native
      @JSName("querySelector")
      def querySelector_marquee(selectors: marquee): HTMLMarqueeElement | Null = js.native
      @JSName("querySelector")
      def querySelector_mask(selectors: mask): SVGMaskElement | Null = js.native
      @JSName("querySelector")
      def querySelector_menu(selectors: menu): HTMLMenuElement | Null = js.native
      @JSName("querySelector")
      def querySelector_meta(selectors: meta): HTMLMetaElement | Null = js.native
      @JSName("querySelector")
      def querySelector_metadata(selectors: metadata): SVGMetadataElement | Null = js.native
      @JSName("querySelector")
      def querySelector_meter(selectors: meter): HTMLMeterElement | Null = js.native
      @JSName("querySelector")
      def querySelector_nav(selectors: nav): HTMLElement | Null = js.native
      @JSName("querySelector")
      def querySelector_noscript(selectors: noscript): HTMLElement | Null = js.native
      @JSName("querySelector")
      def querySelector_object(selectors: `object`): HTMLObjectElement | Null = js.native
      @JSName("querySelector")
      def querySelector_ol(selectors: ol): HTMLOListElement | Null = js.native
      @JSName("querySelector")
      def querySelector_optgroup(selectors: optgroup): HTMLOptGroupElement | Null = js.native
      @JSName("querySelector")
      def querySelector_option(selectors: option): HTMLOptionElement | Null = js.native
      @JSName("querySelector")
      def querySelector_output(selectors: output): HTMLOutputElement | Null = js.native
      @JSName("querySelector")
      def querySelector_p(selectors: p): HTMLParagraphElement | Null = js.native
      @JSName("querySelector")
      def querySelector_param(selectors: param): HTMLParamElement | Null = js.native
      @JSName("querySelector")
      def querySelector_path(selectors: path): SVGPathElement | Null = js.native
      @JSName("querySelector")
      def querySelector_pattern(selectors: pattern): SVGPatternElement | Null = js.native
      @JSName("querySelector")
      def querySelector_picture(selectors: picture): HTMLPictureElement | Null = js.native
      @JSName("querySelector")
      def querySelector_polygon(selectors: polygon): SVGPolygonElement | Null = js.native
      @JSName("querySelector")
      def querySelector_polyline(selectors: polyline): SVGPolylineElement | Null = js.native
      @JSName("querySelector")
      def querySelector_pre(selectors: pre): HTMLPreElement | Null = js.native
      @JSName("querySelector")
      def querySelector_progress(selectors: progress): HTMLProgressElement | Null = js.native
      @JSName("querySelector")
      def querySelector_q(selectors: q): HTMLQuoteElement | Null = js.native
      @JSName("querySelector")
      def querySelector_radialGradient(selectors: radialGradient): SVGRadialGradientElement | Null = js.native
      @JSName("querySelector")
      def querySelector_rect(selectors: rect): SVGRectElement | Null = js.native
      @JSName("querySelector")
      def querySelector_rp(selectors: rp): HTMLElement | Null = js.native
      @JSName("querySelector")
      def querySelector_rt(selectors: rt): HTMLElement | Null = js.native
      @JSName("querySelector")
      def querySelector_ruby(selectors: ruby): HTMLElement | Null = js.native
      @JSName("querySelector")
      def querySelector_s(selectors: s): HTMLElement | Null = js.native
      @JSName("querySelector")
      def querySelector_samp(selectors: samp): HTMLElement | Null = js.native
      @JSName("querySelector")
      def querySelector_script(selectors: script): HTMLScriptElement | Null = js.native
      @JSName("querySelector")
      def querySelector_section(selectors: section): HTMLElement | Null = js.native
      @JSName("querySelector")
      def querySelector_select(selectors: select): HTMLSelectElement | Null = js.native
      @JSName("querySelector")
      def querySelector_slot(selectors: slot): HTMLSlotElement | Null = js.native
      @JSName("querySelector")
      def querySelector_small(selectors: small): HTMLElement | Null = js.native
      @JSName("querySelector")
      def querySelector_source(selectors: source): HTMLSourceElement | Null = js.native
      @JSName("querySelector")
      def querySelector_span(selectors: span): HTMLSpanElement | Null = js.native
      @JSName("querySelector")
      def querySelector_stop(selectors: stop): SVGStopElement | Null = js.native
      @JSName("querySelector")
      def querySelector_strong(selectors: strong): HTMLElement | Null = js.native
      @JSName("querySelector")
      def querySelector_style(selectors: style): HTMLStyleElement | Null = js.native
      @JSName("querySelector")
      def querySelector_sub(selectors: sub): HTMLElement | Null = js.native
      @JSName("querySelector")
      def querySelector_summary(selectors: summary): HTMLElement | Null = js.native
      @JSName("querySelector")
      def querySelector_sup(selectors: sup): HTMLElement | Null = js.native
      @JSName("querySelector")
      def querySelector_svg(selectors: svg): SVGSVGElement | Null = js.native
      @JSName("querySelector")
      def querySelector_switch(selectors: switch): SVGSwitchElement | Null = js.native
      @JSName("querySelector")
      def querySelector_symbol(selectors: symbol): SVGSymbolElement | Null = js.native
      @JSName("querySelector")
      def querySelector_table(selectors: table): HTMLTableElement | Null = js.native
      @JSName("querySelector")
      def querySelector_tbody(selectors: tbody): HTMLTableSectionElement | Null = js.native
      @JSName("querySelector")
      def querySelector_td(selectors: td): HTMLTableDataCellElement | Null = js.native
      @JSName("querySelector")
      def querySelector_template(selectors: template): HTMLTemplateElement | Null = js.native
      @JSName("querySelector")
      def querySelector_text(selectors: text): SVGTextElement | Null = js.native
      @JSName("querySelector")
      def querySelector_textPath(selectors: textPath): SVGTextPathElement | Null = js.native
      @JSName("querySelector")
      def querySelector_textarea(selectors: textarea): HTMLTextAreaElement | Null = js.native
      @JSName("querySelector")
      def querySelector_tfoot(selectors: tfoot): HTMLTableSectionElement | Null = js.native
      @JSName("querySelector")
      def querySelector_th(selectors: th): HTMLTableHeaderCellElement | Null = js.native
      @JSName("querySelector")
      def querySelector_thead(selectors: thead): HTMLTableSectionElement | Null = js.native
      @JSName("querySelector")
      def querySelector_time(selectors: time): HTMLTimeElement | Null = js.native
      @JSName("querySelector")
      def querySelector_title(selectors: title): HTMLTitleElement | Null = js.native
      @JSName("querySelector")
      def querySelector_tr(selectors: tr): HTMLTableRowElement | Null = js.native
      @JSName("querySelector")
      def querySelector_track(selectors: track): HTMLTrackElement | Null = js.native
      @JSName("querySelector")
      def querySelector_tspan(selectors: tspan): SVGTSpanElement | Null = js.native
      @JSName("querySelector")
      def querySelector_u(selectors: u): HTMLElement | Null = js.native
      @JSName("querySelector")
      def querySelector_ul(selectors: ul): HTMLUListElement | Null = js.native
      @JSName("querySelector")
      def querySelector_use(selectors: use): SVGUseElement | Null = js.native
      @JSName("querySelector")
      def querySelector_var(selectors: `var`): HTMLElement | Null = js.native
      @JSName("querySelector")
      def querySelector_video(selectors: video): HTMLVideoElement | Null = js.native
      @JSName("querySelector")
      def querySelector_view(selectors: view): SVGViewElement | Null = js.native
      @JSName("querySelector")
      def querySelector_wbr(selectors: wbr): HTMLElement | Null = js.native
      
      def releasePointerCapture(pointerId: Double): Unit = js.native
      
      /**
        * Removes node.
        */
      def remove(): Unit = js.native
      
      /**
        * Removes element's first attribute whose qualified name is qualifiedName.
        */
      def removeAttribute(qualifiedName: String): Unit = js.native
      
      /**
        * Removes element's attribute whose namespace is namespace and local name is localName.
        */
      def removeAttributeNS(namespace: String, localName: String): Unit = js.native
      def removeAttributeNS(namespace: Null, localName: String): Unit = js.native
      
      def removeAttributeNode(attr: Attr): Attr = js.native
      
      def removeChild[T /* <: Node */](oldChild: T): T = js.native
      
      /**
        * Removes the event listener in target's event listener list with the same type, callback, and options.
        */
      def removeEventListener(`type`: String): Unit = js.native
      def removeEventListener(`type`: String, callback: Null, options: EventListenerOptions): Unit = js.native
      def removeEventListener(`type`: String, callback: Null, options: Boolean): Unit = js.native
      def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
      def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
      def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
      @JSName("removeEventListener")
      def removeEventListener_fullscreenchange(`type`: fullscreenchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
      @JSName("removeEventListener")
      def removeEventListener_fullscreenchange(
        `type`: fullscreenchange,
        listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
        options: EventListenerOptions
      ): Unit = js.native
      @JSName("removeEventListener")
      def removeEventListener_fullscreenchange(
        `type`: fullscreenchange,
        listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
        options: Boolean
      ): Unit = js.native
      @JSName("removeEventListener")
      def removeEventListener_fullscreenerror(`type`: fullscreenerror, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
      @JSName("removeEventListener")
      def removeEventListener_fullscreenerror(
        `type`: fullscreenerror,
        listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
        options: EventListenerOptions
      ): Unit = js.native
      @JSName("removeEventListener")
      def removeEventListener_fullscreenerror(
        `type`: fullscreenerror,
        listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
        options: Boolean
      ): Unit = js.native
      
      def replaceChild[T /* <: Node */](newChild: Node, oldChild: T): T = js.native
      
      /**
        * Replaces node with nodes, while replacing strings in nodes with equivalent Text nodes.
        * 
        * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
        */
      def replaceWith(nodes: (Node | String)*): Unit = js.native
      
      /**
        * Displays element fullscreen and resolves promise when done.
        * 
        * When supplied, options's navigationUI member indicates whether showing navigation UI while in fullscreen is preferred or not. If set to "show", navigation simplicity is preferred over screen space, and if set to "hide", more screen space is preferred. User agents are always free to honor user preference over the application's. The default value "auto" indicates no application preference.
        */
      def requestFullscreen(): js.Promise[Unit] = js.native
      def requestFullscreen(options: FullscreenOptions): js.Promise[Unit] = js.native
      
      def requestPointerLock(): Unit = js.native
      
      def scroll(): Unit = js.native
      def scroll(options: ScrollToOptions): Unit = js.native
      def scroll(x: Double, y: Double): Unit = js.native
      
      def scrollBy(): Unit = js.native
      def scrollBy(options: ScrollToOptions): Unit = js.native
      def scrollBy(x: Double, y: Double): Unit = js.native
      
      val scrollHeight: Double = js.native
      
      def scrollIntoView(): Unit = js.native
      def scrollIntoView(arg: Boolean): Unit = js.native
      def scrollIntoView(arg: ScrollIntoViewOptions): Unit = js.native
      
      var scrollLeft: Double = js.native
      
      def scrollTo(): Unit = js.native
      def scrollTo(options: ScrollToOptions): Unit = js.native
      def scrollTo(x: Double, y: Double): Unit = js.native
      
      var scrollTop: Double = js.native
      
      val scrollWidth: Double = js.native
      
      /**
        * Sets the value of element's first attribute whose qualified name is qualifiedName to value.
        */
      def setAttribute(qualifiedName: String, value: String): Unit = js.native
      
      /**
        * Sets the value of element's attribute whose namespace is namespace and local name is localName to value.
        */
      def setAttributeNS(namespace: String, qualifiedName: String, value: String): Unit = js.native
      def setAttributeNS(namespace: Null, qualifiedName: String, value: String): Unit = js.native
      
      def setAttributeNode(attr: Attr): Attr | Null = js.native
      
      def setAttributeNodeNS(attr: Attr): Attr | Null = js.native
      
      def setPointerCapture(pointerId: Double): Unit = js.native
      
      /**
        * Returns element's shadow root, if any, and if shadow root's mode is "open", and null otherwise.
        */
      val shadowRoot: ShadowRoot | Null = js.native
      
      /**
        * Returns the value of element's slot content attribute. Can be set to change it.
        */
      var slot: String = js.native
      
      /**
        * Returns the HTML-uppercased qualified name.
        */
      val tagName: String = js.native
      
      var textContent: String | Null = js.native
      
      /**
        * If force is not given, "toggles" qualifiedName, removing it if it is present and adding it if it is not present. If force is true, adds qualifiedName. If force is false, removes qualifiedName.
        * 
        * Returns true if qualifiedName is now present, and false otherwise.
        */
      def toggleAttribute(qualifiedName: String): Boolean = js.native
      def toggleAttribute(qualifiedName: String, force: Boolean): Boolean = js.native
      
      var value: String = js.native
      
      def webkitMatchesSelector(selectors: String): Boolean = js.native
    }
    
    @js.native
    trait Locale extends StObject {
      
      /**
        * Text for buttons.
        */
      var buttons: js.UndefOr[Buttons] = js.native
      
      var pluralize: js.UndefOr[PluralizeFn] = js.native
      
      /**
        * Text for tooltip.
        */
      var tooltip: js.UndefOr[PartialPluralizeFnLocale] = js.native
      
      /**
        * Show tooltip text on disabled dates. (Eg. «Already booked»)
        */
      var tooltipOnDisabled: js.UndefOr[String] = js.native
    }
    object Locale {
      
      @scala.inline
      def apply(): Locale = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Locale]
      }
      
      @js.native
      trait Buttons extends StObject {
        
        @JSName("apply")
        var apply: js.UndefOr[String] = js.native
        
        var close: js.UndefOr[String] = js.native
        
        var next: js.UndefOr[String] = js.native
        
        var prev: js.UndefOr[String] = js.native
        
        var reset: js.UndefOr[String] = js.native
      }
      object Buttons {
        
        @scala.inline
        def apply(): Buttons = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Buttons]
        }
        
        @scala.inline
        implicit class ButtonsMutableBuilder[Self <: Buttons] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setApply(value: String): Self = StObject.set(x, "apply", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setApplyUndefined: Self = StObject.set(x, "apply", js.undefined)
          
          @scala.inline
          def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
          
          @scala.inline
          def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
          
          @scala.inline
          def setPrev(value: String): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPrevUndefined: Self = StObject.set(x, "prev", js.undefined)
          
          @scala.inline
          def setReset(value: String): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
        }
      }
      
      @scala.inline
      implicit class LocaleMutableBuilder[Self <: Locale] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setButtons(value: Buttons): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
        
        @scala.inline
        def setPluralize(value: (/* i */ String | Double, /* locale */ PluralizeFnLocale) => String): Self = StObject.set(x, "pluralize", js.Any.fromFunction2(value))
        
        @scala.inline
        def setPluralizeUndefined: Self = StObject.set(x, "pluralize", js.undefined)
        
        @scala.inline
        def setTooltip(value: PartialPluralizeFnLocale): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTooltipOnDisabled(value: String): Self = StObject.set(x, "tooltipOnDisabled", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTooltipOnDisabledUndefined: Self = StObject.set(x, "tooltipOnDisabled", js.undefined)
        
        @scala.inline
        def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      }
      
      /**
        * Function for calc plural text. More examples for another locales on betsol/numerous.
        *
        * @see https://github.com/betsol/numerous/tree/master/locales
        */
      type PluralizeFn = js.Function2[/* i */ String | Double, /* locale */ PluralizeFnLocale, String]
      
      @js.native
      trait PluralizeFnLocale extends StObject {
        
        var one: String = js.native
        
        var other: String = js.native
      }
      object PluralizeFnLocale {
        
        @scala.inline
        def apply(one: String, other: String): PluralizeFnLocale = {
          val __obj = js.Dynamic.literal(one = one.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any])
          __obj.asInstanceOf[PluralizeFnLocale]
        }
        
        @scala.inline
        implicit class PluralizeFnLocaleMutableBuilder[Self <: PluralizeFnLocale] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setOne(value: String): Self = StObject.set(x, "one", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setOther(value: String): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
        }
      }
    }
    
    /**
      * Callback function for when the picker is hidden.
      */
    type OnCloseFn = js.ThisFunction0[/* this */ Lightpick, Unit]
    
    type OnErrorFn = js.ThisFunction1[/* this */ Lightpick, /* message */ String, Unit]
    
    /**
      * Callback function for when the months select is changed.
      */
    type OnMonthsChangeFn = js.ThisFunction1[/* this */ Lightpick, /* month */ Double, Unit]
    
    /**
      * Callback function for when the picker becomes visible.
      */
    type OnOpenFn = js.ThisFunction0[/* this */ Lightpick, Unit]
    
    /**
      * Callback function for when a date is selected.
      */
    type OnSelectFn = js.ThisFunction2[/* this */ Lightpick, /* startDate */ OutputDate, /* endDate */ OutputDate, Unit]
    
    /**
      * Callback function for when either a start or an end date is selected.
      */
    type OnSelectStartEndFn = js.ThisFunction1[/* this */ Lightpick, /* date */ OutputDate, Unit]
    
    /**
      * Callback function for when the years select is changed.
      */
    type OnYearsChangeFn = js.ThisFunction1[/* this */ Lightpick, /* year */ Double, Unit]
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoclose(value: Boolean): Self = StObject.set(x, "autoclose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutocloseUndefined: Self = StObject.set(x, "autoclose", js.undefined)
      
      @scala.inline
      def setDisableDates(value: js.Array[DisabledDate]): Self = StObject.set(x, "disableDates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableDatesUndefined: Self = StObject.set(x, "disableDates", js.undefined)
      
      @scala.inline
      def setDisableDatesVarargs(value: DisabledDate*): Self = StObject.set(x, "disableDates", js.Array(value :_*))
      
      @scala.inline
      def setDisableWeekends(value: Boolean): Self = StObject.set(x, "disableWeekends", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableWeekendsUndefined: Self = StObject.set(x, "disableWeekends", js.undefined)
      
      @scala.inline
      def setDisabledDatesInRange(value: Boolean): Self = StObject.set(x, "disabledDatesInRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledDatesInRangeUndefined: Self = StObject.set(x, "disabledDatesInRange", js.undefined)
      
      @scala.inline
      def setDropdowns(value: Boolean | Dropdowns): Self = StObject.set(x, "dropdowns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownsUndefined: Self = StObject.set(x, "dropdowns", js.undefined)
      
      @scala.inline
      def setEndDate(value: InputDate): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndDateDate(value: js.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndDateNull: Self = StObject.set(x, "endDate", null)
      
      @scala.inline
      def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      @scala.inline
      def setEndDateVarargs(value: (Double | String)*): Self = StObject.set(x, "endDate", js.Array(value :_*))
      
      @scala.inline
      def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstDay(value: DayOfWeek): Self = StObject.set(x, "firstDay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstDayUndefined: Self = StObject.set(x, "firstDay", js.undefined)
      
      @scala.inline
      def setFooter(value: Boolean | String): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setHideOnBodyClick(value: Boolean): Self = StObject.set(x, "hideOnBodyClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideOnBodyClickUndefined: Self = StObject.set(x, "hideOnBodyClick", js.undefined)
      
      @scala.inline
      def setHoveringTooltip(value: Boolean): Self = StObject.set(x, "hoveringTooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoveringTooltipUndefined: Self = StObject.set(x, "hoveringTooltip", js.undefined)
      
      @scala.inline
      def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      @scala.inline
      def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      @scala.inline
      def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setMaxDate(value: InputDate): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDateDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDateNull: Self = StObject.set(x, "maxDate", null)
      
      @scala.inline
      def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      @scala.inline
      def setMaxDateVarargs(value: (Double | String)*): Self = StObject.set(x, "maxDate", js.Array(value :_*))
      
      @scala.inline
      def setMaxDays(value: Double): Self = StObject.set(x, "maxDays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDaysUndefined: Self = StObject.set(x, "maxDays", js.undefined)
      
      @scala.inline
      def setMinDate(value: InputDate): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDateDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDateNull: Self = StObject.set(x, "minDate", null)
      
      @scala.inline
      def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      @scala.inline
      def setMinDateVarargs(value: (Double | String)*): Self = StObject.set(x, "minDate", js.Array(value :_*))
      
      @scala.inline
      def setMinDays(value: Double): Self = StObject.set(x, "minDays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDaysUndefined: Self = StObject.set(x, "minDays", js.undefined)
      
      @scala.inline
      def setNumberOfColumns(value: Double): Self = StObject.set(x, "numberOfColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberOfColumnsUndefined: Self = StObject.set(x, "numberOfColumns", js.undefined)
      
      @scala.inline
      def setNumberOfMonths(value: Double): Self = StObject.set(x, "numberOfMonths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberOfMonthsUndefined: Self = StObject.set(x, "numberOfMonths", js.undefined)
      
      @scala.inline
      def setOnClose(value: OnCloseFn): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnError(value: OnErrorFn): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnMonthsChange(value: OnMonthsChangeFn): Self = StObject.set(x, "onMonthsChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMonthsChangeUndefined: Self = StObject.set(x, "onMonthsChange", js.undefined)
      
      @scala.inline
      def setOnOpen(value: OnOpenFn): Self = StObject.set(x, "onOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      @scala.inline
      def setOnSelect(value: OnSelectFn): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSelectEnd(value: OnSelectStartEndFn): Self = StObject.set(x, "onSelectEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSelectEndUndefined: Self = StObject.set(x, "onSelectEnd", js.undefined)
      
      @scala.inline
      def setOnSelectStart(value: OnSelectStartEndFn): Self = StObject.set(x, "onSelectStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSelectStartUndefined: Self = StObject.set(x, "onSelectStart", js.undefined)
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setOnYearsChange(value: OnYearsChangeFn): Self = StObject.set(x, "onYearsChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnYearsChangeUndefined: Self = StObject.set(x, "onYearsChange", js.undefined)
      
      @scala.inline
      def setOrientation(value: Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setParentEl(value: String | Node): Self = StObject.set(x, "parentEl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentElNode(value: Node): Self = StObject.set(x, "parentEl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentElUndefined: Self = StObject.set(x, "parentEl", js.undefined)
      
      @scala.inline
      def setRepick(value: Boolean): Self = StObject.set(x, "repick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepickUndefined: Self = StObject.set(x, "repick", js.undefined)
      
      @scala.inline
      def setSecondField(value: Field): Self = StObject.set(x, "secondField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondFieldUndefined: Self = StObject.set(x, "secondField", js.undefined)
      
      @scala.inline
      def setSelectBackward(value: Boolean): Self = StObject.set(x, "selectBackward", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectBackwardUndefined: Self = StObject.set(x, "selectBackward", js.undefined)
      
      @scala.inline
      def setSelectForward(value: Boolean): Self = StObject.set(x, "selectForward", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectForwardUndefined: Self = StObject.set(x, "selectForward", js.undefined)
      
      @scala.inline
      def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      @scala.inline
      def setSingleDate(value: Boolean): Self = StObject.set(x, "singleDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSingleDateUndefined: Self = StObject.set(x, "singleDate", js.undefined)
      
      @scala.inline
      def setStartDate(value: InputDate): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartDateDate(value: js.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartDateNull: Self = StObject.set(x, "startDate", null)
      
      @scala.inline
      def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
      
      @scala.inline
      def setStartDateVarargs(value: (Double | String)*): Self = StObject.set(x, "startDate", js.Array(value :_*))
      
      @scala.inline
      def setTooltipNights(value: Boolean): Self = StObject.set(x, "tooltipNights", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipNightsUndefined: Self = StObject.set(x, "tooltipNights", js.undefined)
      
      @scala.inline
      def setWeekdayStyle(value: WeekdayStyle): Self = StObject.set(x, "weekdayStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekdayStyleUndefined: Self = StObject.set(x, "weekdayStyle", js.undefined)
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.lightpick.lightpickStrings.auto
      - typingsSlinky.lightpick.lightpickStrings.left
      - typingsSlinky.lightpick.lightpickStrings.right
      - typingsSlinky.lightpick.lightpickStrings.top
      - typingsSlinky.lightpick.lightpickStrings.bottom
      - typingsSlinky.lightpick.lightpickStrings.`top left`
      - typingsSlinky.lightpick.lightpickStrings.`top right`
      - typingsSlinky.lightpick.lightpickStrings.`bottom left`
      - typingsSlinky.lightpick.lightpickStrings.`bottom right`
    */
    trait Orientation extends StObject
    object Orientation {
      
      @scala.inline
      def auto: typingsSlinky.lightpick.lightpickStrings.auto = "auto".asInstanceOf[typingsSlinky.lightpick.lightpickStrings.auto]
      
      @scala.inline
      def bottom: typingsSlinky.lightpick.lightpickStrings.bottom = "bottom".asInstanceOf[typingsSlinky.lightpick.lightpickStrings.bottom]
      
      @scala.inline
      def `bottom left`: typingsSlinky.lightpick.lightpickStrings.`bottom left` = ("bottom left").asInstanceOf[typingsSlinky.lightpick.lightpickStrings.`bottom left`]
      
      @scala.inline
      def `bottom right`: typingsSlinky.lightpick.lightpickStrings.`bottom right` = ("bottom right").asInstanceOf[typingsSlinky.lightpick.lightpickStrings.`bottom right`]
      
      @scala.inline
      def left: typingsSlinky.lightpick.lightpickStrings.left = "left".asInstanceOf[typingsSlinky.lightpick.lightpickStrings.left]
      
      @scala.inline
      def right: typingsSlinky.lightpick.lightpickStrings.right = "right".asInstanceOf[typingsSlinky.lightpick.lightpickStrings.right]
      
      @scala.inline
      def top: typingsSlinky.lightpick.lightpickStrings.top = "top".asInstanceOf[typingsSlinky.lightpick.lightpickStrings.top]
      
      @scala.inline
      def `top left`: typingsSlinky.lightpick.lightpickStrings.`top left` = ("top left").asInstanceOf[typingsSlinky.lightpick.lightpickStrings.`top left`]
      
      @scala.inline
      def `top right`: typingsSlinky.lightpick.lightpickStrings.`top right` = ("top right").asInstanceOf[typingsSlinky.lightpick.lightpickStrings.`top right`]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.lightpick.lightpickStrings.long
      - typingsSlinky.lightpick.lightpickStrings.short
      - typingsSlinky.lightpick.lightpickStrings.narrow
    */
    trait WeekdayStyle extends StObject
    object WeekdayStyle {
      
      @scala.inline
      def long: typingsSlinky.lightpick.lightpickStrings.long = "long".asInstanceOf[typingsSlinky.lightpick.lightpickStrings.long]
      
      @scala.inline
      def narrow: typingsSlinky.lightpick.lightpickStrings.narrow = "narrow".asInstanceOf[typingsSlinky.lightpick.lightpickStrings.narrow]
      
      @scala.inline
      def short: typingsSlinky.lightpick.lightpickStrings.short = "short".asInstanceOf[typingsSlinky.lightpick.lightpickStrings.short]
    }
  }
  
  type OutputDate = Moment | Null
}
