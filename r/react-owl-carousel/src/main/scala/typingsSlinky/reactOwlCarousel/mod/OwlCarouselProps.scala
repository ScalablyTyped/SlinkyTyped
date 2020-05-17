package typingsSlinky.reactOwlCarousel.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticAnimationEvent
import slinky.web.SyntheticClipboardEvent
import slinky.web.SyntheticCompositionEvent
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticPointerEvent
import typingsSlinky.react.anon.Html
import typingsSlinky.react.mod.AnimationEventHandler
import typingsSlinky.react.mod.Booleanish
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ClipboardEventHandler
import typingsSlinky.react.mod.CompositionEventHandler
import typingsSlinky.react.mod.DragEvent
import typingsSlinky.react.mod.DragEventHandler
import typingsSlinky.react.mod.FocusEventHandler
import typingsSlinky.react.mod.FormEventHandler
import typingsSlinky.react.mod.KeyboardEventHandler
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.PointerEventHandler
import typingsSlinky.react.mod.ReactEventHandler
import typingsSlinky.react.mod.TouchEventHandler
import typingsSlinky.react.mod.TransitionEventHandler
import typingsSlinky.react.mod.UIEventHandler
import typingsSlinky.react.mod.WheelEventHandler
import typingsSlinky.reactOwlCarousel.optionsMod.HandlerCallback
import typingsSlinky.reactOwlCarousel.optionsMod.Options
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.`additions text`
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.`inline`
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.additions
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.all
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.ascending
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.assertive
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.both
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.copy
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.date
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.decimal
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.descending
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.dialog
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.email
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.execute
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.grammar
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.grid
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.horizontal
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.inherit
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.link
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.list
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.listbox
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.location
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.menu
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.mixed
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.move
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.no
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.none
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.numeric
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.off
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.on
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.other
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.page
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.polite
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.popup
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.removals
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.search
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.spelling
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.step
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.tel
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.text
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.time
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.tree
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.url
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.vertical
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-owl-carousel.react-owl-carousel/umd/options.Options & react-owl-carousel.react-owl-carousel.ComponentProps */
@js.native
trait OwlCarouselProps extends js.Object {
  var URLhashListener: js.UndefOr[Boolean] = js.native
  val about: js.UndefOr[String] = js.native
  val accept: js.UndefOr[String] = js.native
  val acceptCharset: js.UndefOr[String] = js.native
  val accessKey: js.UndefOr[String] = js.native
  val action: js.UndefOr[String] = js.native
  val allowFullScreen: js.UndefOr[Boolean] = js.native
  val allowTransparency: js.UndefOr[Boolean] = js.native
  val alt: js.UndefOr[String] = js.native
  var animateIn: js.UndefOr[String | Boolean] = js.native
  var animateOut: js.UndefOr[String | Boolean] = js.native
  val `aria-activedescendant`: js.UndefOr[String] = js.native
  val `aria-atomic`: js.UndefOr[Boolean] = js.native
  val `aria-autocomplete`: js.UndefOr[
    none | `inline` | typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.list | both
  ] = js.native
  val `aria-busy`: js.UndefOr[Boolean] = js.native
  val `aria-checked`: js.UndefOr[Boolean | mixed] = js.native
  val `aria-colcount`: js.UndefOr[Double] = js.native
  val `aria-colindex`: js.UndefOr[Double] = js.native
  val `aria-colspan`: js.UndefOr[Double] = js.native
  val `aria-controls`: js.UndefOr[String] = js.native
  val `aria-current`: js.UndefOr[
    Boolean | page | typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.step | location | date | time
  ] = js.native
  val `aria-describedby`: js.UndefOr[String] = js.native
  val `aria-details`: js.UndefOr[String] = js.native
  val `aria-disabled`: js.UndefOr[Boolean] = js.native
  val `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.native
  val `aria-errormessage`: js.UndefOr[String] = js.native
  val `aria-expanded`: js.UndefOr[Boolean] = js.native
  val `aria-flowto`: js.UndefOr[String] = js.native
  val `aria-grabbed`: js.UndefOr[Boolean] = js.native
  val `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.native
  val `aria-hidden`: js.UndefOr[Boolean] = js.native
  val `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.native
  val `aria-keyshortcuts`: js.UndefOr[String] = js.native
  val `aria-label`: js.UndefOr[String] = js.native
  val `aria-labelledby`: js.UndefOr[String] = js.native
  val `aria-level`: js.UndefOr[Double] = js.native
  val `aria-live`: js.UndefOr[off | assertive | polite] = js.native
  val `aria-modal`: js.UndefOr[Boolean] = js.native
  val `aria-multiline`: js.UndefOr[Boolean] = js.native
  val `aria-multiselectable`: js.UndefOr[Boolean] = js.native
  val `aria-orientation`: js.UndefOr[horizontal | vertical] = js.native
  val `aria-owns`: js.UndefOr[String] = js.native
  val `aria-placeholder`: js.UndefOr[String] = js.native
  val `aria-posinset`: js.UndefOr[Double] = js.native
  val `aria-pressed`: js.UndefOr[Boolean | mixed] = js.native
  val `aria-readonly`: js.UndefOr[Boolean] = js.native
  val `aria-relevant`: js.UndefOr[additions | (`additions text`) | all | removals | text] = js.native
  val `aria-required`: js.UndefOr[Boolean] = js.native
  val `aria-roledescription`: js.UndefOr[String] = js.native
  val `aria-rowcount`: js.UndefOr[Double] = js.native
  val `aria-rowindex`: js.UndefOr[Double] = js.native
  val `aria-rowspan`: js.UndefOr[Double] = js.native
  val `aria-selected`: js.UndefOr[Boolean] = js.native
  val `aria-setsize`: js.UndefOr[Double] = js.native
  val `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.native
  val `aria-valuemax`: js.UndefOr[Double] = js.native
  val `aria-valuemin`: js.UndefOr[Double] = js.native
  val `aria-valuenow`: js.UndefOr[Double] = js.native
  val `aria-valuetext`: js.UndefOr[String] = js.native
  val as: js.UndefOr[String] = js.native
  val async: js.UndefOr[Boolean] = js.native
  val autoCapitalize: js.UndefOr[String] = js.native
  val autoComplete: js.UndefOr[String] = js.native
  val autoCorrect: js.UndefOr[String] = js.native
  val autoFocus: js.UndefOr[Boolean] = js.native
  var autoHeightClass: js.UndefOr[String] = js.native
  val autoPlay: js.UndefOr[Boolean] = js.native
  val autoSave: js.UndefOr[String] = js.native
  var autoWidth: js.UndefOr[Boolean] = js.native
  var autoplay: js.UndefOr[Boolean] = js.native
  var autoplayHoverPause: js.UndefOr[Boolean] = js.native
  var autoplaySpeed: js.UndefOr[Double | Boolean] = js.native
  var autoplayTimeout: js.UndefOr[Double] = js.native
  var callbacks: js.UndefOr[Boolean] = js.native
  val capture: js.UndefOr[Boolean | String] = js.native
  val cellPadding: js.UndefOr[Double | String] = js.native
  val cellSpacing: js.UndefOr[Double | String] = js.native
  var center: js.UndefOr[Boolean] = js.native
  val challenge: js.UndefOr[String] = js.native
  val charSet: js.UndefOr[String] = js.native
  val checked: js.UndefOr[Boolean] = js.native
  val children: js.UndefOr[TagMod[Any]] = js.native
  val cite: js.UndefOr[String] = js.native
  val classID: js.UndefOr[String] = js.native
  val className: js.UndefOr[String] = js.native
  val colSpan: js.UndefOr[Double] = js.native
  val color: js.UndefOr[String] = js.native
  val cols: js.UndefOr[Double] = js.native
  val content: js.UndefOr[String] = js.native
  val contentEditable: js.UndefOr[Booleanish | inherit] = js.native
  val contextMenu: js.UndefOr[String] = js.native
  val controls: js.UndefOr[Boolean] = js.native
  var controlsClass: js.UndefOr[String] = js.native
  val coords: js.UndefOr[String] = js.native
  val crossOrigin: js.UndefOr[String] = js.native
  val dangerouslySetInnerHTML: js.UndefOr[Html] = js.native
  val data: js.UndefOr[String] = js.native
  val datatype: js.UndefOr[String] = js.native
  val dateTime: js.UndefOr[String] = js.native
  val default: js.UndefOr[Boolean] = js.native
  val defaultChecked: js.UndefOr[Boolean] = js.native
  val defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.native
  val defer: js.UndefOr[Boolean] = js.native
  val dir: js.UndefOr[String] = js.native
  val disabled: js.UndefOr[Boolean] = js.native
  var dotClass: js.UndefOr[String] = js.native
  var dotData: js.UndefOr[Boolean] = js.native
  var dots: js.UndefOr[Boolean] = js.native
  var dotsClass: js.UndefOr[String] = js.native
  var dotsContainer: js.UndefOr[String | Boolean] = js.native
  var dotsEach: js.UndefOr[Double | Boolean] = js.native
  var dotsSpeed: js.UndefOr[Double | Boolean] = js.native
  val download: js.UndefOr[js.Any] = js.native
  var dragClass: js.UndefOr[String] = js.native
  var dragEndSpeed: js.UndefOr[Double | Boolean] = js.native
  val draggable: js.UndefOr[Booleanish] = js.native
  val encType: js.UndefOr[String] = js.native
  var fallbackEasing: js.UndefOr[String] = js.native
  var fluidSpeed: js.UndefOr[Double | Boolean] = js.native
  val form: js.UndefOr[String] = js.native
  val formAction: js.UndefOr[String] = js.native
  val formEncType: js.UndefOr[String] = js.native
  val formMethod: js.UndefOr[String] = js.native
  val formNoValidate: js.UndefOr[Boolean] = js.native
  val formTarget: js.UndefOr[String] = js.native
  val frameBorder: js.UndefOr[Double | String] = js.native
  var freeDrag: js.UndefOr[Boolean] = js.native
  var grabClass: js.UndefOr[String] = js.native
  val headers: js.UndefOr[String] = js.native
  val height: js.UndefOr[Double | String] = js.native
  val hidden: js.UndefOr[Boolean] = js.native
  val high: js.UndefOr[Double] = js.native
  val href: js.UndefOr[String] = js.native
  val hrefLang: js.UndefOr[String] = js.native
  val htmlFor: js.UndefOr[String] = js.native
  val httpEquiv: js.UndefOr[String] = js.native
  val id: js.UndefOr[String] = js.native
  var info: js.UndefOr[HandlerCallback] = js.native
  val inlist: js.UndefOr[js.Any] = js.native
  val inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.native
  val integrity: js.UndefOr[String] = js.native
  val is: js.UndefOr[String] = js.native
  var itemElement: js.UndefOr[String] = js.native
  val itemID: js.UndefOr[String] = js.native
  val itemProp: js.UndefOr[String] = js.native
  val itemRef: js.UndefOr[String] = js.native
  val itemScope: js.UndefOr[Boolean] = js.native
  val itemType: js.UndefOr[String] = js.native
  var items: js.UndefOr[Double] = js.native
  val keyParams: js.UndefOr[String] = js.native
  val keyType: js.UndefOr[String] = js.native
  val kind: js.UndefOr[String] = js.native
  val label: js.UndefOr[String] = js.native
  val lang: js.UndefOr[String] = js.native
  var lazyContent: js.UndefOr[Boolean] = js.native
  var lazyLoad: js.UndefOr[Boolean] = js.native
  val list: js.UndefOr[String] = js.native
  var loadedClass: js.UndefOr[String] = js.native
  var loadingClass: js.UndefOr[String] = js.native
  var loop: js.UndefOr[Boolean] = js.native
  val low: js.UndefOr[Double] = js.native
  val manifest: js.UndefOr[String] = js.native
  var margin: js.UndefOr[Double] = js.native
  val marginHeight: js.UndefOr[Double] = js.native
  val marginWidth: js.UndefOr[Double] = js.native
  val max: js.UndefOr[Double | String] = js.native
  val maxLength: js.UndefOr[Double] = js.native
  val media: js.UndefOr[String] = js.native
  val mediaGroup: js.UndefOr[String] = js.native
  var merge: js.UndefOr[Boolean] = js.native
  var mergeFit: js.UndefOr[Boolean] = js.native
  val method: js.UndefOr[String] = js.native
  val min: js.UndefOr[Double | String] = js.native
  val minLength: js.UndefOr[Double] = js.native
  var mouseDrag: js.UndefOr[Boolean] = js.native
  val multiple: js.UndefOr[Boolean] = js.native
  val muted: js.UndefOr[Boolean] = js.native
  val name: js.UndefOr[String] = js.native
  var nav: js.UndefOr[Boolean] = js.native
  var navClass: js.UndefOr[js.Array[String]] = js.native
  var navContainer: js.UndefOr[String | Boolean] = js.native
  var navContainerClass: js.UndefOr[String] = js.native
  var navElement: js.UndefOr[String] = js.native
  var navSpeed: js.UndefOr[Double | Boolean] = js.native
  var navText: js.UndefOr[js.Array[String]] = js.native
  var nestedItemSelector: js.UndefOr[String] = js.native
  val noValidate: js.UndefOr[Boolean] = js.native
  val nonce: js.UndefOr[String] = js.native
  val onAbort: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  val onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLDivElement]] = js.native
  val onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLDivElement]] = js.native
  val onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLDivElement]] = js.native
  val onAuxClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  val onBeforeInput: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
  val onBlur: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.native
  val onCanPlay: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  val onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onChange: js.UndefOr[HandlerCallback with FormEventHandler[HTMLDivElement]] = js.native
  var onChanged: js.UndefOr[HandlerCallback] = js.native
  val onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  val onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.native
  val onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.native
  val onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.native
  val onContextMenu: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  val onCopy: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.native
  val onCut: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.native
  val onDoubleClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  var onDrag: js.UndefOr[HandlerCallback with DragEventHandler[HTMLDivElement]] = js.native
  val onDragEnd: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
  val onDragEnter: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
  val onDragExit: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
  val onDragLeave: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
  val onDragOver: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
  val onDragStart: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
  var onDragged: js.UndefOr[HandlerCallback] = js.native
  val onDrop: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
  val onDurationChange: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  val onEmptied: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  val onEncrypted: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  val onEnded: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  val onError: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  val onFocus: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.native
  var onInitialize: js.UndefOr[HandlerCallback] = js.native
  var onInitialized: js.UndefOr[HandlerCallback] = js.native
  val onInput: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
  val onInvalid: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
  val onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
  val onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
  val onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
  val onLoad: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onLoadLazy: js.UndefOr[HandlerCallback] = js.native
  val onLoadStart: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  val onLoadedData: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onLoadedLazy: js.UndefOr[HandlerCallback] = js.native
  val onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  val onMouseDown: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  val onMouseEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  val onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  val onMouseMove: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  val onMouseOut: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  val onMouseOver: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  val onMouseUp: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  val onPaste: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.native
  val onPause: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  val onPlay: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onPlayVideo: js.UndefOr[HandlerCallback] = js.native
  val onPlaying: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  val onPointerCancel: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
  val onPointerDown: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
  val onPointerEnter: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
  val onPointerLeave: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
  val onPointerMove: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
  val onPointerOut: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
  val onPointerOver: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
  val onPointerUp: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
  val onProgress: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  val onRateChange: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onRefresh: js.UndefOr[HandlerCallback] = js.native
  var onRefreshed: js.UndefOr[HandlerCallback] = js.native
  val onReset: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
  var onResize: js.UndefOr[HandlerCallback] = js.native
  var onResized: js.UndefOr[HandlerCallback] = js.native
  val onScroll: js.UndefOr[UIEventHandler[HTMLDivElement]] = js.native
  val onSeeked: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  val onSeeking: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  val onSelect: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  val onStalled: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onStopVideo: js.UndefOr[HandlerCallback] = js.native
  val onSubmit: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
  val onSuspend: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  val onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  val onTouchCancel: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.native
  val onTouchEnd: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.native
  val onTouchMove: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.native
  val onTouchStart: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.native
  val onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLDivElement]] = js.native
  var onTranslate: js.UndefOr[HandlerCallback] = js.native
  var onTranslated: js.UndefOr[HandlerCallback] = js.native
  val onVolumeChange: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  val onWaiting: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  val onWheel: js.UndefOr[WheelEventHandler[HTMLDivElement]] = js.native
  val open: js.UndefOr[Boolean] = js.native
  val optimum: js.UndefOr[Double] = js.native
  val pattern: js.UndefOr[String] = js.native
  val placeholder: js.UndefOr[String] = js.native
  val playsInline: js.UndefOr[Boolean] = js.native
  val poster: js.UndefOr[String] = js.native
  val prefix: js.UndefOr[String] = js.native
  val preload: js.UndefOr[String] = js.native
  val property: js.UndefOr[String] = js.native
  var pullDrag: js.UndefOr[Boolean] = js.native
  val radioGroup: js.UndefOr[String] = js.native
  val readOnly: js.UndefOr[Boolean] = js.native
  var refreshClass: js.UndefOr[String] = js.native
  val rel: js.UndefOr[String] = js.native
  val required: js.UndefOr[Boolean] = js.native
  val resource: js.UndefOr[String] = js.native
  var responsive: js.UndefOr[StringDictionary[Options]] = js.native
  var responsiveBaseElement: js.UndefOr[Element] = js.native
  var responsiveClass: js.UndefOr[String | Boolean] = js.native
  var responsiveRefreshRate: js.UndefOr[Double] = js.native
  val results: js.UndefOr[Double] = js.native
  val reversed: js.UndefOr[Boolean] = js.native
  var rewind: js.UndefOr[Boolean] = js.native
  val role: js.UndefOr[String] = js.native
  val rowSpan: js.UndefOr[Double] = js.native
  val rows: js.UndefOr[Double] = js.native
  var rtlClass: js.UndefOr[String] = js.native
  val sandbox: js.UndefOr[String] = js.native
  val scope: js.UndefOr[String] = js.native
  val scoped: js.UndefOr[Boolean] = js.native
  val scrolling: js.UndefOr[String] = js.native
  val seamless: js.UndefOr[Boolean] = js.native
  val security: js.UndefOr[String] = js.native
  val selected: js.UndefOr[Boolean] = js.native
  val shape: js.UndefOr[String] = js.native
  val size: js.UndefOr[Double] = js.native
  val sizes: js.UndefOr[String] = js.native
  var slideBy: js.UndefOr[Double | String] = js.native
  val slot: js.UndefOr[String] = js.native
  var smartSpeed: js.UndefOr[Double | Boolean] = js.native
  val span: js.UndefOr[Double] = js.native
  val spellCheck: js.UndefOr[Booleanish] = js.native
  val src: js.UndefOr[String] = js.native
  val srcDoc: js.UndefOr[String] = js.native
  val srcLang: js.UndefOr[String] = js.native
  val srcSet: js.UndefOr[String] = js.native
  var stageClass: js.UndefOr[String] = js.native
  var stageElement: js.UndefOr[String] = js.native
  var stageOuterClass: js.UndefOr[String] = js.native
  var stagePadding: js.UndefOr[Double] = js.native
  val start: js.UndefOr[Double] = js.native
  var startPosition: js.UndefOr[Double | String] = js.native
  val step: js.UndefOr[Double | String] = js.native
  val style: js.UndefOr[CSSProperties] = js.native
  val summary: js.UndefOr[String] = js.native
  val suppressContentEditableWarning: js.UndefOr[Boolean] = js.native
  val suppressHydrationWarning: js.UndefOr[Boolean] = js.native
  val tabIndex: js.UndefOr[Double] = js.native
  val target: js.UndefOr[String] = js.native
  val title: js.UndefOr[String] = js.native
  var touchDrag: js.UndefOr[Boolean] = js.native
  val translate: js.UndefOr[yes | no] = js.native
  val `type`: js.UndefOr[String] = js.native
  val typeof: js.UndefOr[String] = js.native
  val unselectable: js.UndefOr[on | off] = js.native
  val useMap: js.UndefOr[String] = js.native
  val value: js.UndefOr[String | js.Array[String] | Double] = js.native
  var video: js.UndefOr[Boolean] = js.native
  var videoHeight: js.UndefOr[Double | Boolean] = js.native
  var videoWidth: js.UndefOr[Double | Boolean] = js.native
  val vocab: js.UndefOr[String] = js.native
  val width: js.UndefOr[Double | String] = js.native
  val wmode: js.UndefOr[String] = js.native
  val wrap: js.UndefOr[String] = js.native
}

object OwlCarouselProps {
  @scala.inline
  def apply(): OwlCarouselProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OwlCarouselProps]
  }
  @scala.inline
  implicit class OwlCarouselPropsOps[Self <: OwlCarouselProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withURLhashListener(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("URLhashListener")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutURLhashListener: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("URLhashListener")(js.undefined)
        ret
    }
    @scala.inline
    def withAbout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("about")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("about")(js.undefined)
        ret
    }
    @scala.inline
    def withAccept(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccept: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept")(js.undefined)
        ret
    }
    @scala.inline
    def withAcceptCharset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptCharset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptCharset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptCharset")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessKey")(js.undefined)
        ret
    }
    @scala.inline
    def withAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowFullScreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFullScreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowFullScreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFullScreen")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowTransparency(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowTransparency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowTransparency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowTransparency")(js.undefined)
        ret
    }
    @scala.inline
    def withAlt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alt")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimateIn(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimateIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateIn")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimateOut(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimateOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateOut")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-activedescendant`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-activedescendant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-activedescendant`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-activedescendant")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-atomic`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-atomic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-atomic`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-atomic")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-autocomplete`(value: none | `inline` | list | both): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-autocomplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-autocomplete`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-autocomplete")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-busy`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-busy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-busy`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-busy")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-checked`(value: Boolean | mixed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-checked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-checked`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-checked")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-colcount`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-colcount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-colcount`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-colcount")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-colindex`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-colindex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-colindex`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-colindex")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-colspan`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-colspan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-colspan`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-colspan")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-controls`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-controls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-controls`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-controls")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-current`(value: Boolean | page | step | location | date | time): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-current")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-current`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-current")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-describedby`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-describedby")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-describedby`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-describedby")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-details`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-details`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-details")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-disabled`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-disabled`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-disabled")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-dropeffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-dropeffect`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-dropeffect")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-errormessage`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-errormessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-errormessage`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-errormessage")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-expanded`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-expanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-expanded`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-expanded")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-flowto`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-flowto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-flowto`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-flowto")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-grabbed`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-grabbed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-grabbed`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-grabbed")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-haspopup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-haspopup`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-haspopup")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-hidden`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-hidden`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-hidden")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-invalid`(value: Boolean | grammar | spelling): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-invalid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-invalid`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-invalid")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-keyshortcuts`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-keyshortcuts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-keyshortcuts`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-keyshortcuts")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-label`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-label`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-label")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-labelledby`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-labelledby")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-labelledby`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-labelledby")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-level`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-level`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-level")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-live`(value: off | assertive | polite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-live")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-live`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-live")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-modal`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-modal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-modal`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-modal")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-multiline`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-multiline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-multiline`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-multiline")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-multiselectable`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-multiselectable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-multiselectable`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-multiselectable")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-orientation`(value: horizontal | vertical): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-orientation`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-orientation")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-owns`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-owns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-owns`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-owns")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-placeholder`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-placeholder`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-posinset`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-posinset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-posinset`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-posinset")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-pressed`(value: Boolean | mixed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-pressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-pressed`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-pressed")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-readonly`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-readonly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-readonly`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-readonly")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-relevant`(value: additions | (`additions text`) | all | removals | text): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-relevant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-relevant`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-relevant")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-required`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-required`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-required")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-roledescription`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-roledescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-roledescription`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-roledescription")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-rowcount`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-rowcount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-rowcount`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-rowcount")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-rowindex`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-rowindex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-rowindex`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-rowindex")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-rowspan`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-rowspan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-rowspan`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-rowspan")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-selected`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-selected`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-selected")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-setsize`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-setsize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-setsize`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-setsize")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-sort`(value: none | ascending | descending | other): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-sort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-sort`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-sort")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-valuemax`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-valuemax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-valuemax`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-valuemax")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-valuemin`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-valuemin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-valuemin`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-valuemin")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-valuenow`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-valuenow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-valuenow`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-valuenow")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-valuetext`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-valuetext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-valuetext`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-valuetext")(js.undefined)
        ret
    }
    @scala.inline
    def withAs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(js.undefined)
        ret
    }
    @scala.inline
    def withAsync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoCapitalize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCapitalize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCapitalize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCapitalize")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoComplete(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoCorrect(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCorrect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCorrect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCorrect")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoHeightClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHeightClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoHeightClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHeightClass")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoPlay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoPlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPlay")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoSave(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoSave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSave")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoplayHoverPause(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplayHoverPause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoplayHoverPause: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplayHoverPause")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoplaySpeed(value: Double | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplaySpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoplaySpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplaySpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoplayTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplayTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoplayTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplayTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withCallbacks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbacks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallbacks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbacks")(js.undefined)
        ret
    }
    @scala.inline
    def withCapture(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capture")(js.undefined)
        ret
    }
    @scala.inline
    def withCellPadding(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withCellSpacing(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellSpacing")(js.undefined)
        ret
    }
    @scala.inline
    def withCenter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(js.undefined)
        ret
    }
    @scala.inline
    def withChallenge(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("challenge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChallenge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("challenge")(js.undefined)
        ret
    }
    @scala.inline
    def withCharSet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCharSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charSet")(js.undefined)
        ret
    }
    @scala.inline
    def withChecked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(js.undefined)
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withCite(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cite")(js.undefined)
        ret
    }
    @scala.inline
    def withClassID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classID")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withColSpan(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColSpan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colSpan")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withCols(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cols")(js.undefined)
        ret
    }
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withContentEditable(value: Booleanish | inherit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentEditable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentEditable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentEditable")(js.undefined)
        ret
    }
    @scala.inline
    def withContextMenu(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withControls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(js.undefined)
        ret
    }
    @scala.inline
    def withControlsClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlsClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControlsClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlsClass")(js.undefined)
        ret
    }
    @scala.inline
    def withCoords(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coords")(js.undefined)
        ret
    }
    @scala.inline
    def withCrossOrigin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrossOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossOrigin")(js.undefined)
        ret
    }
    @scala.inline
    def withDangerouslySetInnerHTML(value: Html): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dangerouslySetInnerHTML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDangerouslySetInnerHTML: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dangerouslySetInnerHTML")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDatatype(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datatype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatatype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datatype")(js.undefined)
        ret
    }
    @scala.inline
    def withDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultChecked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultChecked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultChecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultChecked")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValue(value: String | Double | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDefer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defer")(js.undefined)
        ret
    }
    @scala.inline
    def withDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDotClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotClass")(js.undefined)
        ret
    }
    @scala.inline
    def withDotData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotData")(js.undefined)
        ret
    }
    @scala.inline
    def withDots(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dots")(js.undefined)
        ret
    }
    @scala.inline
    def withDotsClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotsClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotsClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotsClass")(js.undefined)
        ret
    }
    @scala.inline
    def withDotsContainer(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotsContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotsContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotsContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withDotsEach(value: Double | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotsEach")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotsEach: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotsEach")(js.undefined)
        ret
    }
    @scala.inline
    def withDotsSpeed(value: Double | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotsSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotsSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotsSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withDownload(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("download")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("download")(js.undefined)
        ret
    }
    @scala.inline
    def withDragClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragClass")(js.undefined)
        ret
    }
    @scala.inline
    def withDragEndSpeed(value: Double | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragEndSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragEndSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragEndSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggable(value: Booleanish): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(js.undefined)
        ret
    }
    @scala.inline
    def withEncType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encType")(js.undefined)
        ret
    }
    @scala.inline
    def withFallbackEasing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackEasing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallbackEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackEasing")(js.undefined)
        ret
    }
    @scala.inline
    def withFluidSpeed(value: Double | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fluidSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFluidSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fluidSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withForm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("form")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("form")(js.undefined)
        ret
    }
    @scala.inline
    def withFormAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formAction")(js.undefined)
        ret
    }
    @scala.inline
    def withFormEncType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formEncType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormEncType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formEncType")(js.undefined)
        ret
    }
    @scala.inline
    def withFormMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withFormNoValidate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formNoValidate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormNoValidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formNoValidate")(js.undefined)
        ret
    }
    @scala.inline
    def withFormTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withFrameBorder(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameBorder")(js.undefined)
        ret
    }
    @scala.inline
    def withFreeDrag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeDrag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFreeDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withGrabClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grabClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrabClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grabClass")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(js.undefined)
        ret
    }
    @scala.inline
    def withHigh(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("high")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHigh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("high")(js.undefined)
        ret
    }
    @scala.inline
    def withHref(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHref: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(js.undefined)
        ret
    }
    @scala.inline
    def withHrefLang(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hrefLang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHrefLang: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hrefLang")(js.undefined)
        ret
    }
    @scala.inline
    def withHtmlFor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlFor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlFor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlFor")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpEquiv(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpEquiv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpEquiv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpEquiv")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withInfo(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(js.undefined)
        ret
    }
    @scala.inline
    def withInlist(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInlist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlist")(js.undefined)
        ret
    }
    @scala.inline
    def withInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputMode")(js.undefined)
        ret
    }
    @scala.inline
    def withIntegrity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integrity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntegrity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integrity")(js.undefined)
        ret
    }
    @scala.inline
    def withIs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is")(js.undefined)
        ret
    }
    @scala.inline
    def withItemElement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemElement")(js.undefined)
        ret
    }
    @scala.inline
    def withItemID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemID")(js.undefined)
        ret
    }
    @scala.inline
    def withItemProp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemProp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemProp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemProp")(js.undefined)
        ret
    }
    @scala.inline
    def withItemRef(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemRef")(js.undefined)
        ret
    }
    @scala.inline
    def withItemScope(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemScope")(js.undefined)
        ret
    }
    @scala.inline
    def withItemType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemType")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyParams(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyParams")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyType")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withLang(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLang: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(js.undefined)
        ret
    }
    @scala.inline
    def withLazyContent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLazyContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyContent")(js.undefined)
        ret
    }
    @scala.inline
    def withLazyLoad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLazyLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withList(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadedClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadedClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadedClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadedClass")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingClass")(js.undefined)
        ret
    }
    @scala.inline
    def withLoop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(js.undefined)
        ret
    }
    @scala.inline
    def withLow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("low")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("low")(js.undefined)
        ret
    }
    @scala.inline
    def withManifest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManifest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifest")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMedia(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedia: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withMerge(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMerge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merge")(js.undefined)
        ret
    }
    @scala.inline
    def withMergeFit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeFit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMergeFit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeFit")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withMinLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseDrag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseDrag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMouseDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(js.undefined)
        ret
    }
    @scala.inline
    def withMuted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("muted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMuted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("muted")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNav(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nav")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNav: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nav")(js.undefined)
        ret
    }
    @scala.inline
    def withNavClass(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navClass")(js.undefined)
        ret
    }
    @scala.inline
    def withNavContainer(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withNavContainerClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navContainerClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavContainerClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navContainerClass")(js.undefined)
        ret
    }
    @scala.inline
    def withNavElement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navElement")(js.undefined)
        ret
    }
    @scala.inline
    def withNavSpeed(value: Double | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withNavText(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navText")(js.undefined)
        ret
    }
    @scala.inline
    def withNestedItemSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestedItemSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNestedItemSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestedItemSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withNoValidate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noValidate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoValidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noValidate")(js.undefined)
        ret
    }
    @scala.inline
    def withNonce(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonce")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAbort(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAbort")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAbort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAbort")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAnimationEnd(value: SyntheticAnimationEvent[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAnimationEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAnimationIteration(value: SyntheticAnimationEvent[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationIteration")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAnimationIteration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationIteration")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAnimationStart(value: SyntheticAnimationEvent[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAnimationStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAuxClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAuxClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAuxClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAuxClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeInput(value: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeInput")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBeforeInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeInput")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBlur(value: SyntheticFocusEvent[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCanPlay(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanPlay")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCanPlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanPlay")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCanPlayThrough(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanPlayThrough")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCanPlayThrough: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanPlayThrough")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: HandlerCallback with FormEventHandler[HTMLDivElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChanged(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCompositionEnd(value: SyntheticCompositionEvent[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompositionEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCompositionEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompositionEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCompositionStart(value: SyntheticCompositionEvent[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompositionStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCompositionStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompositionStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCompositionUpdate(value: SyntheticCompositionEvent[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompositionUpdate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCompositionUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompositionUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnContextMenu(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContextMenu")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnContextMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContextMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCopy(value: SyntheticClipboardEvent[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCopy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCopy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCopy")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCut(value: SyntheticClipboardEvent[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCut")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDoubleClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDoubleClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDoubleClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDoubleClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDrag(value: HandlerCallback with DragEventHandler[HTMLDivElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragEnd(value: DragEvent[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragEnter(value: DragEvent[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragExit(value: DragEvent[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragExit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragExit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragExit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragLeave(value: DragEvent[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragOver(value: DragEvent[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragOver")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragOver")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragStart(value: DragEvent[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragged(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDrop(value: DragEvent[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDurationChange(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDurationChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDurationChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDurationChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEmptied(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEmptied")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEmptied: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEmptied")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEncrypted(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEncrypted")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEncrypted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEncrypted")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEnded(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEnded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnded")(js.undefined)
        ret
    }
    @scala.inline
    def withOnError(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocus(value: SyntheticFocusEvent[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInitialize(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInitialize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnInitialize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInitialize")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInitialized(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInitialized")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnInitialized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInitialized")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInput(value: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInput")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInput")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInvalid(value: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInvalid")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnInvalid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInvalid")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyDown(value: SyntheticKeyboardEvent[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyPress(value: SyntheticKeyboardEvent[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyPress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyPress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyUp(value: SyntheticKeyboardEvent[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyUp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyUp")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoad(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadLazy(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadLazy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoadLazy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadLazy")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadStart(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoadStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadedData(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadedData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoadedData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadedData")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadedLazy(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadedLazy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoadedLazy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadedLazy")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadedMetadata(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadedMetadata")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoadedMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadedMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseDown(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseEnter(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseLeave(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseMove(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseOut(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseOut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseOut")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseOver(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseOver")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseOver")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseUp(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseUp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseUp")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPaste(value: SyntheticClipboardEvent[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPaste")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPaste: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPaste")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPause(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPause")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPause: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPause")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPlay(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlay")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlay")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPlayVideo(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlayVideo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPlayVideo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlayVideo")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPlaying(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlaying")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPlaying: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlaying")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerCancel(value: SyntheticPointerEvent[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerCancel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerCancel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerDown(value: SyntheticPointerEvent[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerEnter(value: SyntheticPointerEvent[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerLeave(value: SyntheticPointerEvent[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerMove(value: SyntheticPointerEvent[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerOut(value: SyntheticPointerEvent[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerOut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerOut")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerOver(value: SyntheticPointerEvent[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerOver")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerOver")(js.undefined)
        ret
    }
  }
  
}

