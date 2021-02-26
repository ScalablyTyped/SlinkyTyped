package typingsSlinky.reactOwlCarousel

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.web.SyntheticAnimationEvent
import slinky.web.SyntheticClipboardEvent
import slinky.web.SyntheticCompositionEvent
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticPointerEvent
import slinky.web.SyntheticTouchEvent
import slinky.web.SyntheticTransitionEvent
import slinky.web.SyntheticUIEvent
import slinky.web.SyntheticWheelEvent
import typingsSlinky.jquery.JQuery
import typingsSlinky.react.anon.Html
import typingsSlinky.react.mod.AnimationEventHandler
import typingsSlinky.react.mod.Booleanish
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ClipboardEventHandler
import typingsSlinky.react.mod.Component
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
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.`additions removals`
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.`additions text`
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.`inline`
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.`removals additions`
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.`removals text`
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.`text additions`
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.`text removals`
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-owl-carousel", JSImport.Default)
  @js.native
  class default protected () extends ReactOwlCarousel {
    def this(props: OwlCarouselProps) = this()
  }
  
  /* Inlined std.Readonly<react.react.AllHTMLAttributes<std.HTMLDivElement> & {  children :react.react.ReactNode}> */
  @js.native
  trait ComponentProps extends StObject {
    
    val default: js.UndefOr[Boolean] = js.native
    
    val about: js.UndefOr[String] = js.native
    
    val accept: js.UndefOr[String] = js.native
    
    val acceptCharset: js.UndefOr[String] = js.native
    
    val accessKey: js.UndefOr[String] = js.native
    
    val action: js.UndefOr[String] = js.native
    
    val allowFullScreen: js.UndefOr[Boolean] = js.native
    
    val allowTransparency: js.UndefOr[Boolean] = js.native
    
    val alt: js.UndefOr[String] = js.native
    
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
    
    val `aria-relevant`: js.UndefOr[
        additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ] = js.native
    
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
    
    val autoPlay: js.UndefOr[Boolean] = js.native
    
    val autoSave: js.UndefOr[String] = js.native
    
    val capture: js.UndefOr[Boolean | String] = js.native
    
    val cellPadding: js.UndefOr[Double | String] = js.native
    
    val cellSpacing: js.UndefOr[Double | String] = js.native
    
    val challenge: js.UndefOr[String] = js.native
    
    val charSet: js.UndefOr[String] = js.native
    
    val checked: js.UndefOr[Boolean] = js.native
    
    val children: js.UndefOr[ReactElement] = js.native
    
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
    
    val coords: js.UndefOr[String] = js.native
    
    val crossOrigin: js.UndefOr[String] = js.native
    
    val dangerouslySetInnerHTML: js.UndefOr[Html] = js.native
    
    val data: js.UndefOr[String] = js.native
    
    val datatype: js.UndefOr[String] = js.native
    
    val dateTime: js.UndefOr[String] = js.native
    
    val defaultChecked: js.UndefOr[Boolean] = js.native
    
    val defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.native
    
    val defer: js.UndefOr[Boolean] = js.native
    
    val dir: js.UndefOr[String] = js.native
    
    val disabled: js.UndefOr[Boolean] = js.native
    
    val download: js.UndefOr[js.Any] = js.native
    
    val draggable: js.UndefOr[Booleanish] = js.native
    
    val encType: js.UndefOr[String] = js.native
    
    val form: js.UndefOr[String] = js.native
    
    val formAction: js.UndefOr[String] = js.native
    
    val formEncType: js.UndefOr[String] = js.native
    
    val formMethod: js.UndefOr[String] = js.native
    
    val formNoValidate: js.UndefOr[Boolean] = js.native
    
    val formTarget: js.UndefOr[String] = js.native
    
    val frameBorder: js.UndefOr[Double | String] = js.native
    
    val headers: js.UndefOr[String] = js.native
    
    val height: js.UndefOr[Double | String] = js.native
    
    val hidden: js.UndefOr[Boolean] = js.native
    
    val high: js.UndefOr[Double] = js.native
    
    val href: js.UndefOr[String] = js.native
    
    val hrefLang: js.UndefOr[String] = js.native
    
    val htmlFor: js.UndefOr[String] = js.native
    
    val httpEquiv: js.UndefOr[String] = js.native
    
    val id: js.UndefOr[String] = js.native
    
    val inlist: js.UndefOr[js.Any] = js.native
    
    val inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.native
    
    val integrity: js.UndefOr[String] = js.native
    
    val is: js.UndefOr[String] = js.native
    
    val itemID: js.UndefOr[String] = js.native
    
    val itemProp: js.UndefOr[String] = js.native
    
    val itemRef: js.UndefOr[String] = js.native
    
    val itemScope: js.UndefOr[Boolean] = js.native
    
    val itemType: js.UndefOr[String] = js.native
    
    val keyParams: js.UndefOr[String] = js.native
    
    val keyType: js.UndefOr[String] = js.native
    
    val kind: js.UndefOr[String] = js.native
    
    val label: js.UndefOr[String] = js.native
    
    val lang: js.UndefOr[String] = js.native
    
    val list: js.UndefOr[String] = js.native
    
    val loop: js.UndefOr[Boolean] = js.native
    
    val low: js.UndefOr[Double] = js.native
    
    val manifest: js.UndefOr[String] = js.native
    
    val marginHeight: js.UndefOr[Double] = js.native
    
    val marginWidth: js.UndefOr[Double] = js.native
    
    val max: js.UndefOr[Double | String] = js.native
    
    val maxLength: js.UndefOr[Double] = js.native
    
    val media: js.UndefOr[String] = js.native
    
    val mediaGroup: js.UndefOr[String] = js.native
    
    val method: js.UndefOr[String] = js.native
    
    val min: js.UndefOr[Double | String] = js.native
    
    val minLength: js.UndefOr[Double] = js.native
    
    val multiple: js.UndefOr[Boolean] = js.native
    
    val muted: js.UndefOr[Boolean] = js.native
    
    val name: js.UndefOr[String] = js.native
    
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
    
    val onChange: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
    
    val onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    val onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.native
    
    val onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.native
    
    val onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.native
    
    val onContextMenu: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    val onCopy: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.native
    
    val onCut: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.native
    
    val onDoubleClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    val onDrag: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
    
    val onDragEnd: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
    
    val onDragEnter: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
    
    val onDragExit: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
    
    val onDragLeave: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
    
    val onDragOver: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
    
    val onDragStart: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
    
    val onDrop: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
    
    val onDurationChange: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    val onEmptied: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    val onEncrypted: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    val onEnded: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    val onError: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    val onFocus: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.native
    
    val onInput: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
    
    val onInvalid: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
    
    val onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
    
    val onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
    
    val onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
    
    val onLoad: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    val onLoadStart: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    val onLoadedData: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
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
    
    val onReset: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
    
    val onScroll: js.UndefOr[UIEventHandler[HTMLDivElement]] = js.native
    
    val onSeeked: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    val onSeeking: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    val onSelect: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    val onStalled: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    val onSubmit: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
    
    val onSuspend: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    val onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    val onTouchCancel: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.native
    
    val onTouchEnd: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.native
    
    val onTouchMove: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.native
    
    val onTouchStart: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.native
    
    val onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLDivElement]] = js.native
    
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
    
    val radioGroup: js.UndefOr[String] = js.native
    
    val readOnly: js.UndefOr[Boolean] = js.native
    
    val rel: js.UndefOr[String] = js.native
    
    val required: js.UndefOr[Boolean] = js.native
    
    val resource: js.UndefOr[String] = js.native
    
    val results: js.UndefOr[Double] = js.native
    
    val reversed: js.UndefOr[Boolean] = js.native
    
    val role: js.UndefOr[String] = js.native
    
    val rowSpan: js.UndefOr[Double] = js.native
    
    val rows: js.UndefOr[Double] = js.native
    
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
    
    val slot: js.UndefOr[String] = js.native
    
    val span: js.UndefOr[Double] = js.native
    
    val spellCheck: js.UndefOr[Booleanish] = js.native
    
    val src: js.UndefOr[String] = js.native
    
    val srcDoc: js.UndefOr[String] = js.native
    
    val srcLang: js.UndefOr[String] = js.native
    
    val srcSet: js.UndefOr[String] = js.native
    
    val start: js.UndefOr[Double] = js.native
    
    val step: js.UndefOr[Double | String] = js.native
    
    val style: js.UndefOr[CSSProperties] = js.native
    
    val summary: js.UndefOr[String] = js.native
    
    val suppressContentEditableWarning: js.UndefOr[Boolean] = js.native
    
    val suppressHydrationWarning: js.UndefOr[Boolean] = js.native
    
    val tabIndex: js.UndefOr[Double] = js.native
    
    val target: js.UndefOr[String] = js.native
    
    val title: js.UndefOr[String] = js.native
    
    val translate: js.UndefOr[yes | no] = js.native
    
    val `type`: js.UndefOr[String] = js.native
    
    val typeof: js.UndefOr[String] = js.native
    
    val unselectable: js.UndefOr[on | off] = js.native
    
    val useMap: js.UndefOr[String] = js.native
    
    val value: js.UndefOr[String | js.Array[String] | Double] = js.native
    
    val vocab: js.UndefOr[String] = js.native
    
    val width: js.UndefOr[Double | String] = js.native
    
    val wmode: js.UndefOr[String] = js.native
    
    val wrap: js.UndefOr[String] = js.native
  }
  object ComponentProps {
    
    @scala.inline
    def apply(): ComponentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComponentProps]
    }
    
    @scala.inline
    implicit class ComponentPropsMutableBuilder[Self <: ComponentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
      
      @scala.inline
      def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptCharset(value: String): Self = StObject.set(x, "acceptCharset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptCharsetUndefined: Self = StObject.set(x, "acceptCharset", js.undefined)
      
      @scala.inline
      def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      @scala.inline
      def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setAllowFullScreen(value: Boolean): Self = StObject.set(x, "allowFullScreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowFullScreenUndefined: Self = StObject.set(x, "allowFullScreen", js.undefined)
      
      @scala.inline
      def setAllowTransparency(value: Boolean): Self = StObject.set(x, "allowTransparency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowTransparencyUndefined: Self = StObject.set(x, "allowTransparency", js.undefined)
      
      @scala.inline
      def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      @scala.inline
      def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      @scala.inline
      def `setAria-atomic`(value: Boolean): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
      
      @scala.inline
      def `setAria-autocomplete`(value: none | `inline` | list | both): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
      
      @scala.inline
      def `setAria-busy`(value: Boolean): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
      
      @scala.inline
      def `setAria-checked`(value: Boolean | mixed): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
      
      @scala.inline
      def `setAria-colcount`(value: Double): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
      
      @scala.inline
      def `setAria-colindex`(value: Double): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
      
      @scala.inline
      def `setAria-colspan`(value: Double): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
      
      @scala.inline
      def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      @scala.inline
      def `setAria-current`(value: Boolean | page | step | location | date | time): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
      
      @scala.inline
      def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      @scala.inline
      def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
      
      @scala.inline
      def `setAria-disabled`(value: Boolean): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
      
      @scala.inline
      def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
      
      @scala.inline
      def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      @scala.inline
      def `setAria-expanded`(value: Boolean): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
      
      @scala.inline
      def `setAria-flowto`(value: String): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
      
      @scala.inline
      def `setAria-grabbed`(value: Boolean): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
      
      @scala.inline
      def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      @scala.inline
      def `setAria-hidden`(value: Boolean): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
      
      @scala.inline
      def `setAria-invalid`(value: Boolean | grammar | spelling): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
      
      @scala.inline
      def `setAria-keyshortcuts`(value: String): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
      
      @scala.inline
      def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      @scala.inline
      def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      @scala.inline
      def `setAria-level`(value: Double): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
      
      @scala.inline
      def `setAria-live`(value: off | assertive | polite): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
      
      @scala.inline
      def `setAria-modal`(value: Boolean): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
      
      @scala.inline
      def `setAria-multiline`(value: Boolean): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
      
      @scala.inline
      def `setAria-multiselectable`(value: Boolean): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
      
      @scala.inline
      def `setAria-orientation`(value: horizontal | vertical): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
      
      @scala.inline
      def `setAria-owns`(value: String): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
      
      @scala.inline
      def `setAria-placeholder`(value: String): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
      
      @scala.inline
      def `setAria-posinset`(value: Double): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
      
      @scala.inline
      def `setAria-pressed`(value: Boolean | mixed): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
      
      @scala.inline
      def `setAria-readonly`(value: Boolean): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
      
      @scala.inline
      def `setAria-relevant`(
        value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
      
      @scala.inline
      def `setAria-required`(value: Boolean): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
      
      @scala.inline
      def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
      
      @scala.inline
      def `setAria-rowcount`(value: Double): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
      
      @scala.inline
      def `setAria-rowindex`(value: Double): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
      
      @scala.inline
      def `setAria-rowspan`(value: Double): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
      
      @scala.inline
      def `setAria-selected`(value: Boolean): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
      
      @scala.inline
      def `setAria-setsize`(value: Double): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
      
      @scala.inline
      def `setAria-sort`(value: none | ascending | descending | other): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
      
      @scala.inline
      def `setAria-valuemax`(value: Double): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
      
      @scala.inline
      def `setAria-valuemin`(value: Double): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
      
      @scala.inline
      def `setAria-valuenow`(value: Double): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
      
      @scala.inline
      def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
      
      @scala.inline
      def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      @scala.inline
      def setAutoCapitalize(value: String): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
      
      @scala.inline
      def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      @scala.inline
      def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setAutoPlay(value: Boolean): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoPlayUndefined: Self = StObject.set(x, "autoPlay", js.undefined)
      
      @scala.inline
      def setAutoSave(value: String): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
      
      @scala.inline
      def setCapture(value: Boolean | String): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      @scala.inline
      def setCellPadding(value: Double | String): Self = StObject.set(x, "cellPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellPaddingUndefined: Self = StObject.set(x, "cellPadding", js.undefined)
      
      @scala.inline
      def setCellSpacing(value: Double | String): Self = StObject.set(x, "cellSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellSpacingUndefined: Self = StObject.set(x, "cellSpacing", js.undefined)
      
      @scala.inline
      def setChallenge(value: String): Self = StObject.set(x, "challenge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChallengeUndefined: Self = StObject.set(x, "challenge", js.undefined)
      
      @scala.inline
      def setCharSet(value: String): Self = StObject.set(x, "charSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharSetUndefined: Self = StObject.set(x, "charSet", js.undefined)
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setCite(value: String): Self = StObject.set(x, "cite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCiteUndefined: Self = StObject.set(x, "cite", js.undefined)
      
      @scala.inline
      def setClassID(value: String): Self = StObject.set(x, "classID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassIDUndefined: Self = StObject.set(x, "classID", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentEditable(value: Booleanish | inherit): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      @scala.inline
      def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      @scala.inline
      def setCoords(value: String): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoordsUndefined: Self = StObject.set(x, "coords", js.undefined)
      
      @scala.inline
      def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      @scala.inline
      def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
      
      @scala.inline
      def setDateTime(value: String): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateTimeUndefined: Self = StObject.set(x, "dateTime", js.undefined)
      
      @scala.inline
      def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      @scala.inline
      def setDefer(value: Boolean): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
      
      @scala.inline
      def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDownload(value: js.Any): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
      
      @scala.inline
      def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      @scala.inline
      def setEncType(value: String): Self = StObject.set(x, "encType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncTypeUndefined: Self = StObject.set(x, "encType", js.undefined)
      
      @scala.inline
      def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormAction(value: String): Self = StObject.set(x, "formAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormActionUndefined: Self = StObject.set(x, "formAction", js.undefined)
      
      @scala.inline
      def setFormEncType(value: String): Self = StObject.set(x, "formEncType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormEncTypeUndefined: Self = StObject.set(x, "formEncType", js.undefined)
      
      @scala.inline
      def setFormMethod(value: String): Self = StObject.set(x, "formMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormMethodUndefined: Self = StObject.set(x, "formMethod", js.undefined)
      
      @scala.inline
      def setFormNoValidate(value: Boolean): Self = StObject.set(x, "formNoValidate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormNoValidateUndefined: Self = StObject.set(x, "formNoValidate", js.undefined)
      
      @scala.inline
      def setFormTarget(value: String): Self = StObject.set(x, "formTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormTargetUndefined: Self = StObject.set(x, "formTarget", js.undefined)
      
      @scala.inline
      def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      @scala.inline
      def setFrameBorder(value: Double | String): Self = StObject.set(x, "frameBorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameBorderUndefined: Self = StObject.set(x, "frameBorder", js.undefined)
      
      @scala.inline
      def setHeaders(value: String): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefLang(value: String): Self = StObject.set(x, "hrefLang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefLangUndefined: Self = StObject.set(x, "hrefLang", js.undefined)
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setHtmlFor(value: String): Self = StObject.set(x, "htmlFor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlForUndefined: Self = StObject.set(x, "htmlFor", js.undefined)
      
      @scala.inline
      def setHttpEquiv(value: String): Self = StObject.set(x, "httpEquiv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpEquivUndefined: Self = StObject.set(x, "httpEquiv", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInlist(value: js.Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
      
      @scala.inline
      def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      @scala.inline
      def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
      
      @scala.inline
      def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
      
      @scala.inline
      def setItemID(value: String): Self = StObject.set(x, "itemID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemIDUndefined: Self = StObject.set(x, "itemID", js.undefined)
      
      @scala.inline
      def setItemProp(value: String): Self = StObject.set(x, "itemProp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemPropUndefined: Self = StObject.set(x, "itemProp", js.undefined)
      
      @scala.inline
      def setItemRef(value: String): Self = StObject.set(x, "itemRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemRefUndefined: Self = StObject.set(x, "itemRef", js.undefined)
      
      @scala.inline
      def setItemScope(value: Boolean): Self = StObject.set(x, "itemScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemScopeUndefined: Self = StObject.set(x, "itemScope", js.undefined)
      
      @scala.inline
      def setItemType(value: String): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
      
      @scala.inline
      def setKeyParams(value: String): Self = StObject.set(x, "keyParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyParamsUndefined: Self = StObject.set(x, "keyParams", js.undefined)
      
      @scala.inline
      def setKeyType(value: String): Self = StObject.set(x, "keyType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyTypeUndefined: Self = StObject.set(x, "keyType", js.undefined)
      
      @scala.inline
      def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      @scala.inline
      def setList(value: String): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      @scala.inline
      def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      @scala.inline
      def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
      
      @scala.inline
      def setManifest(value: String): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
      
      @scala.inline
      def setMarginHeight(value: Double): Self = StObject.set(x, "marginHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginHeightUndefined: Self = StObject.set(x, "marginHeight", js.undefined)
      
      @scala.inline
      def setMarginWidth(value: Double): Self = StObject.set(x, "marginWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginWidthUndefined: Self = StObject.set(x, "marginWidth", js.undefined)
      
      @scala.inline
      def setMax(value: Double | String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaGroup(value: String): Self = StObject.set(x, "mediaGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaGroupUndefined: Self = StObject.set(x, "mediaGroup", js.undefined)
      
      @scala.inline
      def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setMin(value: Double | String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      @scala.inline
      def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNoValidate(value: Boolean): Self = StObject.set(x, "noValidate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoValidateUndefined: Self = StObject.set(x, "noValidate", js.undefined)
      
      @scala.inline
      def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      @scala.inline
      def setOnAbort(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      @scala.inline
      def setOnAnimationEnd(value: SyntheticAnimationEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      @scala.inline
      def setOnAnimationIteration(value: SyntheticAnimationEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
      
      @scala.inline
      def setOnAnimationStart(value: SyntheticAnimationEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
      
      @scala.inline
      def setOnAuxClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
      
      @scala.inline
      def setOnBeforeInput(value: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
      
      @scala.inline
      def setOnBlur(value: SyntheticFocusEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnCanPlay(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCanPlayThrough(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
      
      @scala.inline
      def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
      
      @scala.inline
      def setOnChange(value: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnCompositionEnd(value: SyntheticCompositionEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
      
      @scala.inline
      def setOnCompositionStart(value: SyntheticCompositionEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
      
      @scala.inline
      def setOnCompositionUpdate(value: SyntheticCompositionEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
      
      @scala.inline
      def setOnContextMenu(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      @scala.inline
      def setOnCopy(value: SyntheticClipboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      @scala.inline
      def setOnCut(value: SyntheticClipboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onCut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
      
      @scala.inline
      def setOnDoubleClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      @scala.inline
      def setOnDrag(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEnd(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      @scala.inline
      def setOnDragEnter(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      @scala.inline
      def setOnDragExit(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
      
      @scala.inline
      def setOnDragLeave(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      @scala.inline
      def setOnDragOver(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      @scala.inline
      def setOnDragStart(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      @scala.inline
      def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      @scala.inline
      def setOnDrop(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      @scala.inline
      def setOnDurationChange(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
      
      @scala.inline
      def setOnEmptied(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
      
      @scala.inline
      def setOnEncrypted(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
      
      @scala.inline
      def setOnEnded(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
      
      @scala.inline
      def setOnError(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnFocus(value: SyntheticFocusEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnInput(value: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      @scala.inline
      def setOnInvalid(value: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: SyntheticKeyboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnKeyPress(value: SyntheticKeyboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      @scala.inline
      def setOnKeyUp(value: SyntheticKeyboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      @scala.inline
      def setOnLoad(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadStart(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
      
      @scala.inline
      def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      @scala.inline
      def setOnLoadedData(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
      
      @scala.inline
      def setOnLoadedMetadata(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
      
      @scala.inline
      def setOnMouseDown(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOnMouseMove(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      @scala.inline
      def setOnMouseOut(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
      
      @scala.inline
      def setOnMouseOver(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      @scala.inline
      def setOnMouseUp(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      @scala.inline
      def setOnPaste(value: SyntheticClipboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      @scala.inline
      def setOnPause(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      @scala.inline
      def setOnPlay(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      @scala.inline
      def setOnPlaying(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
      
      @scala.inline
      def setOnPointerCancel(value: SyntheticPointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
      
      @scala.inline
      def setOnPointerDown(value: SyntheticPointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
      
      @scala.inline
      def setOnPointerEnter(value: SyntheticPointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
      
      @scala.inline
      def setOnPointerLeave(value: SyntheticPointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
      
      @scala.inline
      def setOnPointerMove(value: SyntheticPointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
      
      @scala.inline
      def setOnPointerOut(value: SyntheticPointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
      
      @scala.inline
      def setOnPointerOver(value: SyntheticPointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
      
      @scala.inline
      def setOnPointerUp(value: SyntheticPointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
      
      @scala.inline
      def setOnProgress(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      @scala.inline
      def setOnRateChange(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
      
      @scala.inline
      def setOnReset(value: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      @scala.inline
      def setOnScroll(value: SyntheticUIEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      @scala.inline
      def setOnSeeked(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
      
      @scala.inline
      def setOnSeeking(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
      
      @scala.inline
      def setOnSelect(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setOnStalled(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onStalled", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
      
      @scala.inline
      def setOnSubmit(value: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      @scala.inline
      def setOnSuspend(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
      
      @scala.inline
      def setOnTimeUpdate(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
      
      @scala.inline
      def setOnTouchCancel(value: SyntheticTouchEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      @scala.inline
      def setOnTouchEnd(value: SyntheticTouchEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      @scala.inline
      def setOnTouchMove(value: SyntheticTouchEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      @scala.inline
      def setOnTouchStart(value: SyntheticTouchEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      @scala.inline
      def setOnTransitionEnd(value: SyntheticTransitionEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      @scala.inline
      def setOnVolumeChange(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
      
      @scala.inline
      def setOnWaiting(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
      
      @scala.inline
      def setOnWheel(value: SyntheticWheelEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setOptimum(value: Double): Self = StObject.set(x, "optimum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptimumUndefined: Self = StObject.set(x, "optimum", js.undefined)
      
      @scala.inline
      def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPlaysInline(value: Boolean): Self = StObject.set(x, "playsInline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaysInlineUndefined: Self = StObject.set(x, "playsInline", js.undefined)
      
      @scala.inline
      def setPoster(value: String): Self = StObject.set(x, "poster", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosterUndefined: Self = StObject.set(x, "poster", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setPreload(value: String): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
      
      @scala.inline
      def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      @scala.inline
      def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      @scala.inline
      def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      @scala.inline
      def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
      
      @scala.inline
      def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      @scala.inline
      def setSandbox(value: String): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setScoped(value: Boolean): Self = StObject.set(x, "scoped", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopedUndefined: Self = StObject.set(x, "scoped", js.undefined)
      
      @scala.inline
      def setScrolling(value: String): Self = StObject.set(x, "scrolling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollingUndefined: Self = StObject.set(x, "scrolling", js.undefined)
      
      @scala.inline
      def setSeamless(value: Boolean): Self = StObject.set(x, "seamless", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeamlessUndefined: Self = StObject.set(x, "seamless", js.undefined)
      
      @scala.inline
      def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      @scala.inline
      def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSizes(value: String): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
      
      @scala.inline
      def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
      
      @scala.inline
      def setSpan(value: Double): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
      
      @scala.inline
      def setSpellCheck(value: Booleanish): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcDoc(value: String): Self = StObject.set(x, "srcDoc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcDocUndefined: Self = StObject.set(x, "srcDoc", js.undefined)
      
      @scala.inline
      def setSrcLang(value: String): Self = StObject.set(x, "srcLang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcLangUndefined: Self = StObject.set(x, "srcLang", js.undefined)
      
      @scala.inline
      def setSrcSet(value: String): Self = StObject.set(x, "srcSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcSetUndefined: Self = StObject.set(x, "srcSet", js.undefined)
      
      @scala.inline
      def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setStep(value: Double | String): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
      
      @scala.inline
      def setSuppressContentEditableWarning(value: Boolean): Self = StObject.set(x, "suppressContentEditableWarning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressContentEditableWarningUndefined: Self = StObject.set(x, "suppressContentEditableWarning", js.undefined)
      
      @scala.inline
      def setSuppressHydrationWarning(value: Boolean): Self = StObject.set(x, "suppressHydrationWarning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressHydrationWarningUndefined: Self = StObject.set(x, "suppressHydrationWarning", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTranslate(value: yes | no): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
      
      @scala.inline
      def setUnselectable(value: on | off): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
      
      @scala.inline
      def setUseMap(value: String): Self = StObject.set(x, "useMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseMapUndefined: Self = StObject.set(x, "useMap", js.undefined)
      
      @scala.inline
      def setValue(value: String | js.Array[String] | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
      
      @scala.inline
      def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
      
      @scala.inline
      def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setWmode(value: String): Self = StObject.set(x, "wmode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWmodeUndefined: Self = StObject.set(x, "wmode", js.undefined)
      
      @scala.inline
      def setWrap(value: String): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  /* Inlined react-owl-carousel.react-owl-carousel/umd/options.Options & react-owl-carousel.react-owl-carousel.ComponentProps */
  @js.native
  trait OwlCarouselProps extends StObject {
    
    val default: js.UndefOr[Boolean] = js.native
    
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
    
    val `aria-relevant`: js.UndefOr[
        additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ] = js.native
    
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
    
    val children: js.UndefOr[ReactElement] = js.native
    
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
    
    var onChange: js.UndefOr[HandlerCallback] with js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
    
    var onChanged: js.UndefOr[HandlerCallback] = js.native
    
    val onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    val onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.native
    
    val onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.native
    
    val onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.native
    
    val onContextMenu: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    val onCopy: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.native
    
    val onCut: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.native
    
    val onDoubleClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onDrag: js.UndefOr[HandlerCallback] with js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
    
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
    def apply(
      onChange: js.UndefOr[HandlerCallback] with js.UndefOr[FormEventHandler[HTMLDivElement]],
      onDrag: js.UndefOr[HandlerCallback] with js.UndefOr[DragEventHandler[HTMLDivElement]]
    ): OwlCarouselProps = {
      val __obj = js.Dynamic.literal(onChange = onChange.asInstanceOf[js.Any], onDrag = onDrag.asInstanceOf[js.Any])
      __obj.asInstanceOf[OwlCarouselProps]
    }
    
    @scala.inline
    implicit class OwlCarouselPropsMutableBuilder[Self <: OwlCarouselProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
      
      @scala.inline
      def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptCharset(value: String): Self = StObject.set(x, "acceptCharset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptCharsetUndefined: Self = StObject.set(x, "acceptCharset", js.undefined)
      
      @scala.inline
      def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      @scala.inline
      def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setAllowFullScreen(value: Boolean): Self = StObject.set(x, "allowFullScreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowFullScreenUndefined: Self = StObject.set(x, "allowFullScreen", js.undefined)
      
      @scala.inline
      def setAllowTransparency(value: Boolean): Self = StObject.set(x, "allowTransparency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowTransparencyUndefined: Self = StObject.set(x, "allowTransparency", js.undefined)
      
      @scala.inline
      def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      @scala.inline
      def setAnimateIn(value: String | Boolean): Self = StObject.set(x, "animateIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimateInUndefined: Self = StObject.set(x, "animateIn", js.undefined)
      
      @scala.inline
      def setAnimateOut(value: String | Boolean): Self = StObject.set(x, "animateOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimateOutUndefined: Self = StObject.set(x, "animateOut", js.undefined)
      
      @scala.inline
      def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      @scala.inline
      def `setAria-atomic`(value: Boolean): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
      
      @scala.inline
      def `setAria-autocomplete`(value: none | `inline` | list | both): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
      
      @scala.inline
      def `setAria-busy`(value: Boolean): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
      
      @scala.inline
      def `setAria-checked`(value: Boolean | mixed): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
      
      @scala.inline
      def `setAria-colcount`(value: Double): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
      
      @scala.inline
      def `setAria-colindex`(value: Double): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
      
      @scala.inline
      def `setAria-colspan`(value: Double): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
      
      @scala.inline
      def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      @scala.inline
      def `setAria-current`(value: Boolean | page | step | location | date | time): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
      
      @scala.inline
      def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      @scala.inline
      def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
      
      @scala.inline
      def `setAria-disabled`(value: Boolean): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
      
      @scala.inline
      def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
      
      @scala.inline
      def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      @scala.inline
      def `setAria-expanded`(value: Boolean): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
      
      @scala.inline
      def `setAria-flowto`(value: String): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
      
      @scala.inline
      def `setAria-grabbed`(value: Boolean): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
      
      @scala.inline
      def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      @scala.inline
      def `setAria-hidden`(value: Boolean): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
      
      @scala.inline
      def `setAria-invalid`(value: Boolean | grammar | spelling): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
      
      @scala.inline
      def `setAria-keyshortcuts`(value: String): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
      
      @scala.inline
      def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      @scala.inline
      def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      @scala.inline
      def `setAria-level`(value: Double): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
      
      @scala.inline
      def `setAria-live`(value: off | assertive | polite): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
      
      @scala.inline
      def `setAria-modal`(value: Boolean): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
      
      @scala.inline
      def `setAria-multiline`(value: Boolean): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
      
      @scala.inline
      def `setAria-multiselectable`(value: Boolean): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
      
      @scala.inline
      def `setAria-orientation`(value: horizontal | vertical): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
      
      @scala.inline
      def `setAria-owns`(value: String): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
      
      @scala.inline
      def `setAria-placeholder`(value: String): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
      
      @scala.inline
      def `setAria-posinset`(value: Double): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
      
      @scala.inline
      def `setAria-pressed`(value: Boolean | mixed): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
      
      @scala.inline
      def `setAria-readonly`(value: Boolean): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
      
      @scala.inline
      def `setAria-relevant`(
        value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
      
      @scala.inline
      def `setAria-required`(value: Boolean): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
      
      @scala.inline
      def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
      
      @scala.inline
      def `setAria-rowcount`(value: Double): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
      
      @scala.inline
      def `setAria-rowindex`(value: Double): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
      
      @scala.inline
      def `setAria-rowspan`(value: Double): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
      
      @scala.inline
      def `setAria-selected`(value: Boolean): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
      
      @scala.inline
      def `setAria-setsize`(value: Double): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
      
      @scala.inline
      def `setAria-sort`(value: none | ascending | descending | other): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
      
      @scala.inline
      def `setAria-valuemax`(value: Double): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
      
      @scala.inline
      def `setAria-valuemin`(value: Double): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
      
      @scala.inline
      def `setAria-valuenow`(value: Double): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
      
      @scala.inline
      def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
      
      @scala.inline
      def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      @scala.inline
      def setAutoCapitalize(value: String): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
      
      @scala.inline
      def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      @scala.inline
      def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setAutoHeightClass(value: String): Self = StObject.set(x, "autoHeightClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoHeightClassUndefined: Self = StObject.set(x, "autoHeightClass", js.undefined)
      
      @scala.inline
      def setAutoPlay(value: Boolean): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoPlayUndefined: Self = StObject.set(x, "autoPlay", js.undefined)
      
      @scala.inline
      def setAutoSave(value: String): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
      
      @scala.inline
      def setAutoWidth(value: Boolean): Self = StObject.set(x, "autoWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoWidthUndefined: Self = StObject.set(x, "autoWidth", js.undefined)
      
      @scala.inline
      def setAutoplayHoverPause(value: Boolean): Self = StObject.set(x, "autoplayHoverPause", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplayHoverPauseUndefined: Self = StObject.set(x, "autoplayHoverPause", js.undefined)
      
      @scala.inline
      def setAutoplaySpeed(value: Double | Boolean): Self = StObject.set(x, "autoplaySpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplaySpeedUndefined: Self = StObject.set(x, "autoplaySpeed", js.undefined)
      
      @scala.inline
      def setAutoplayTimeout(value: Double): Self = StObject.set(x, "autoplayTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplayTimeoutUndefined: Self = StObject.set(x, "autoplayTimeout", js.undefined)
      
      @scala.inline
      def setCallbacks(value: Boolean): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbacksUndefined: Self = StObject.set(x, "callbacks", js.undefined)
      
      @scala.inline
      def setCapture(value: Boolean | String): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      @scala.inline
      def setCellPadding(value: Double | String): Self = StObject.set(x, "cellPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellPaddingUndefined: Self = StObject.set(x, "cellPadding", js.undefined)
      
      @scala.inline
      def setCellSpacing(value: Double | String): Self = StObject.set(x, "cellSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellSpacingUndefined: Self = StObject.set(x, "cellSpacing", js.undefined)
      
      @scala.inline
      def setCenter(value: Boolean): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      @scala.inline
      def setChallenge(value: String): Self = StObject.set(x, "challenge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChallengeUndefined: Self = StObject.set(x, "challenge", js.undefined)
      
      @scala.inline
      def setCharSet(value: String): Self = StObject.set(x, "charSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharSetUndefined: Self = StObject.set(x, "charSet", js.undefined)
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setCite(value: String): Self = StObject.set(x, "cite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCiteUndefined: Self = StObject.set(x, "cite", js.undefined)
      
      @scala.inline
      def setClassID(value: String): Self = StObject.set(x, "classID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassIDUndefined: Self = StObject.set(x, "classID", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentEditable(value: Booleanish | inherit): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      @scala.inline
      def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlsClass(value: String): Self = StObject.set(x, "controlsClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlsClassUndefined: Self = StObject.set(x, "controlsClass", js.undefined)
      
      @scala.inline
      def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      @scala.inline
      def setCoords(value: String): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoordsUndefined: Self = StObject.set(x, "coords", js.undefined)
      
      @scala.inline
      def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      @scala.inline
      def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
      
      @scala.inline
      def setDateTime(value: String): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateTimeUndefined: Self = StObject.set(x, "dateTime", js.undefined)
      
      @scala.inline
      def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      @scala.inline
      def setDefer(value: Boolean): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
      
      @scala.inline
      def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDotClass(value: String): Self = StObject.set(x, "dotClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotClassUndefined: Self = StObject.set(x, "dotClass", js.undefined)
      
      @scala.inline
      def setDotData(value: Boolean): Self = StObject.set(x, "dotData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotDataUndefined: Self = StObject.set(x, "dotData", js.undefined)
      
      @scala.inline
      def setDots(value: Boolean): Self = StObject.set(x, "dots", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotsClass(value: String): Self = StObject.set(x, "dotsClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotsClassUndefined: Self = StObject.set(x, "dotsClass", js.undefined)
      
      @scala.inline
      def setDotsContainer(value: String | Boolean): Self = StObject.set(x, "dotsContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotsContainerUndefined: Self = StObject.set(x, "dotsContainer", js.undefined)
      
      @scala.inline
      def setDotsEach(value: Double | Boolean): Self = StObject.set(x, "dotsEach", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotsEachUndefined: Self = StObject.set(x, "dotsEach", js.undefined)
      
      @scala.inline
      def setDotsSpeed(value: Double | Boolean): Self = StObject.set(x, "dotsSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotsSpeedUndefined: Self = StObject.set(x, "dotsSpeed", js.undefined)
      
      @scala.inline
      def setDotsUndefined: Self = StObject.set(x, "dots", js.undefined)
      
      @scala.inline
      def setDownload(value: js.Any): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
      
      @scala.inline
      def setDragClass(value: String): Self = StObject.set(x, "dragClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragClassUndefined: Self = StObject.set(x, "dragClass", js.undefined)
      
      @scala.inline
      def setDragEndSpeed(value: Double | Boolean): Self = StObject.set(x, "dragEndSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragEndSpeedUndefined: Self = StObject.set(x, "dragEndSpeed", js.undefined)
      
      @scala.inline
      def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      @scala.inline
      def setEncType(value: String): Self = StObject.set(x, "encType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncTypeUndefined: Self = StObject.set(x, "encType", js.undefined)
      
      @scala.inline
      def setFallbackEasing(value: String): Self = StObject.set(x, "fallbackEasing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackEasingUndefined: Self = StObject.set(x, "fallbackEasing", js.undefined)
      
      @scala.inline
      def setFluidSpeed(value: Double | Boolean): Self = StObject.set(x, "fluidSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFluidSpeedUndefined: Self = StObject.set(x, "fluidSpeed", js.undefined)
      
      @scala.inline
      def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormAction(value: String): Self = StObject.set(x, "formAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormActionUndefined: Self = StObject.set(x, "formAction", js.undefined)
      
      @scala.inline
      def setFormEncType(value: String): Self = StObject.set(x, "formEncType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormEncTypeUndefined: Self = StObject.set(x, "formEncType", js.undefined)
      
      @scala.inline
      def setFormMethod(value: String): Self = StObject.set(x, "formMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormMethodUndefined: Self = StObject.set(x, "formMethod", js.undefined)
      
      @scala.inline
      def setFormNoValidate(value: Boolean): Self = StObject.set(x, "formNoValidate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormNoValidateUndefined: Self = StObject.set(x, "formNoValidate", js.undefined)
      
      @scala.inline
      def setFormTarget(value: String): Self = StObject.set(x, "formTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormTargetUndefined: Self = StObject.set(x, "formTarget", js.undefined)
      
      @scala.inline
      def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      @scala.inline
      def setFrameBorder(value: Double | String): Self = StObject.set(x, "frameBorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameBorderUndefined: Self = StObject.set(x, "frameBorder", js.undefined)
      
      @scala.inline
      def setFreeDrag(value: Boolean): Self = StObject.set(x, "freeDrag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFreeDragUndefined: Self = StObject.set(x, "freeDrag", js.undefined)
      
      @scala.inline
      def setGrabClass(value: String): Self = StObject.set(x, "grabClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrabClassUndefined: Self = StObject.set(x, "grabClass", js.undefined)
      
      @scala.inline
      def setHeaders(value: String): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefLang(value: String): Self = StObject.set(x, "hrefLang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefLangUndefined: Self = StObject.set(x, "hrefLang", js.undefined)
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setHtmlFor(value: String): Self = StObject.set(x, "htmlFor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlForUndefined: Self = StObject.set(x, "htmlFor", js.undefined)
      
      @scala.inline
      def setHttpEquiv(value: String): Self = StObject.set(x, "httpEquiv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpEquivUndefined: Self = StObject.set(x, "httpEquiv", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInfo(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      @scala.inline
      def setInlist(value: js.Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
      
      @scala.inline
      def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      @scala.inline
      def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
      
      @scala.inline
      def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
      
      @scala.inline
      def setItemElement(value: String): Self = StObject.set(x, "itemElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemElementUndefined: Self = StObject.set(x, "itemElement", js.undefined)
      
      @scala.inline
      def setItemID(value: String): Self = StObject.set(x, "itemID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemIDUndefined: Self = StObject.set(x, "itemID", js.undefined)
      
      @scala.inline
      def setItemProp(value: String): Self = StObject.set(x, "itemProp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemPropUndefined: Self = StObject.set(x, "itemProp", js.undefined)
      
      @scala.inline
      def setItemRef(value: String): Self = StObject.set(x, "itemRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemRefUndefined: Self = StObject.set(x, "itemRef", js.undefined)
      
      @scala.inline
      def setItemScope(value: Boolean): Self = StObject.set(x, "itemScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemScopeUndefined: Self = StObject.set(x, "itemScope", js.undefined)
      
      @scala.inline
      def setItemType(value: String): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
      
      @scala.inline
      def setItems(value: Double): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setKeyParams(value: String): Self = StObject.set(x, "keyParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyParamsUndefined: Self = StObject.set(x, "keyParams", js.undefined)
      
      @scala.inline
      def setKeyType(value: String): Self = StObject.set(x, "keyType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyTypeUndefined: Self = StObject.set(x, "keyType", js.undefined)
      
      @scala.inline
      def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      @scala.inline
      def setLazyContent(value: Boolean): Self = StObject.set(x, "lazyContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLazyContentUndefined: Self = StObject.set(x, "lazyContent", js.undefined)
      
      @scala.inline
      def setLazyLoad(value: Boolean): Self = StObject.set(x, "lazyLoad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLazyLoadUndefined: Self = StObject.set(x, "lazyLoad", js.undefined)
      
      @scala.inline
      def setList(value: String): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      @scala.inline
      def setLoadedClass(value: String): Self = StObject.set(x, "loadedClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadedClassUndefined: Self = StObject.set(x, "loadedClass", js.undefined)
      
      @scala.inline
      def setLoadingClass(value: String): Self = StObject.set(x, "loadingClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingClassUndefined: Self = StObject.set(x, "loadingClass", js.undefined)
      
      @scala.inline
      def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      @scala.inline
      def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
      
      @scala.inline
      def setManifest(value: String): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
      
      @scala.inline
      def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginHeight(value: Double): Self = StObject.set(x, "marginHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginHeightUndefined: Self = StObject.set(x, "marginHeight", js.undefined)
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setMarginWidth(value: Double): Self = StObject.set(x, "marginWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginWidthUndefined: Self = StObject.set(x, "marginWidth", js.undefined)
      
      @scala.inline
      def setMax(value: Double | String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaGroup(value: String): Self = StObject.set(x, "mediaGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaGroupUndefined: Self = StObject.set(x, "mediaGroup", js.undefined)
      
      @scala.inline
      def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
      
      @scala.inline
      def setMerge(value: Boolean): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMergeFit(value: Boolean): Self = StObject.set(x, "mergeFit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMergeFitUndefined: Self = StObject.set(x, "mergeFit", js.undefined)
      
      @scala.inline
      def setMergeUndefined: Self = StObject.set(x, "merge", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setMin(value: Double | String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setMouseDrag(value: Boolean): Self = StObject.set(x, "mouseDrag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseDragUndefined: Self = StObject.set(x, "mouseDrag", js.undefined)
      
      @scala.inline
      def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      @scala.inline
      def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNav(value: Boolean): Self = StObject.set(x, "nav", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavClass(value: js.Array[String]): Self = StObject.set(x, "navClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavClassUndefined: Self = StObject.set(x, "navClass", js.undefined)
      
      @scala.inline
      def setNavClassVarargs(value: String*): Self = StObject.set(x, "navClass", js.Array(value :_*))
      
      @scala.inline
      def setNavContainer(value: String | Boolean): Self = StObject.set(x, "navContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavContainerClass(value: String): Self = StObject.set(x, "navContainerClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavContainerClassUndefined: Self = StObject.set(x, "navContainerClass", js.undefined)
      
      @scala.inline
      def setNavContainerUndefined: Self = StObject.set(x, "navContainer", js.undefined)
      
      @scala.inline
      def setNavElement(value: String): Self = StObject.set(x, "navElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavElementUndefined: Self = StObject.set(x, "navElement", js.undefined)
      
      @scala.inline
      def setNavSpeed(value: Double | Boolean): Self = StObject.set(x, "navSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavSpeedUndefined: Self = StObject.set(x, "navSpeed", js.undefined)
      
      @scala.inline
      def setNavText(value: js.Array[String]): Self = StObject.set(x, "navText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavTextUndefined: Self = StObject.set(x, "navText", js.undefined)
      
      @scala.inline
      def setNavTextVarargs(value: String*): Self = StObject.set(x, "navText", js.Array(value :_*))
      
      @scala.inline
      def setNavUndefined: Self = StObject.set(x, "nav", js.undefined)
      
      @scala.inline
      def setNestedItemSelector(value: String): Self = StObject.set(x, "nestedItemSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNestedItemSelectorUndefined: Self = StObject.set(x, "nestedItemSelector", js.undefined)
      
      @scala.inline
      def setNoValidate(value: Boolean): Self = StObject.set(x, "noValidate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoValidateUndefined: Self = StObject.set(x, "noValidate", js.undefined)
      
      @scala.inline
      def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      @scala.inline
      def setOnAbort(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      @scala.inline
      def setOnAnimationEnd(value: SyntheticAnimationEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      @scala.inline
      def setOnAnimationIteration(value: SyntheticAnimationEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
      
      @scala.inline
      def setOnAnimationStart(value: SyntheticAnimationEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
      
      @scala.inline
      def setOnAuxClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
      
      @scala.inline
      def setOnBeforeInput(value: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
      
      @scala.inline
      def setOnBlur(value: SyntheticFocusEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnCanPlay(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCanPlayThrough(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
      
      @scala.inline
      def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
      
      @scala.inline
      def setOnChange(value: js.UndefOr[HandlerCallback] with js.UndefOr[FormEventHandler[HTMLDivElement]]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnChanged(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onChanged", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangedUndefined: Self = StObject.set(x, "onChanged", js.undefined)
      
      @scala.inline
      def setOnClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnCompositionEnd(value: SyntheticCompositionEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
      
      @scala.inline
      def setOnCompositionStart(value: SyntheticCompositionEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
      
      @scala.inline
      def setOnCompositionUpdate(value: SyntheticCompositionEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
      
      @scala.inline
      def setOnContextMenu(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      @scala.inline
      def setOnCopy(value: SyntheticClipboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      @scala.inline
      def setOnCut(value: SyntheticClipboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onCut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
      
      @scala.inline
      def setOnDoubleClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      @scala.inline
      def setOnDrag(value: js.UndefOr[HandlerCallback] with js.UndefOr[DragEventHandler[HTMLDivElement]]): Self = StObject.set(x, "onDrag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDragEnd(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      @scala.inline
      def setOnDragEnter(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      @scala.inline
      def setOnDragExit(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
      
      @scala.inline
      def setOnDragLeave(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      @scala.inline
      def setOnDragOver(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      @scala.inline
      def setOnDragStart(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      @scala.inline
      def setOnDragged(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onDragged", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDraggedUndefined: Self = StObject.set(x, "onDragged", js.undefined)
      
      @scala.inline
      def setOnDrop(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      @scala.inline
      def setOnDurationChange(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
      
      @scala.inline
      def setOnEmptied(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
      
      @scala.inline
      def setOnEncrypted(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
      
      @scala.inline
      def setOnEnded(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
      
      @scala.inline
      def setOnError(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnFocus(value: SyntheticFocusEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnInitialize(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onInitialize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInitializeUndefined: Self = StObject.set(x, "onInitialize", js.undefined)
      
      @scala.inline
      def setOnInitialized(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onInitialized", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInitializedUndefined: Self = StObject.set(x, "onInitialized", js.undefined)
      
      @scala.inline
      def setOnInput(value: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      @scala.inline
      def setOnInvalid(value: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: SyntheticKeyboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnKeyPress(value: SyntheticKeyboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      @scala.inline
      def setOnKeyUp(value: SyntheticKeyboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      @scala.inline
      def setOnLoad(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadLazy(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onLoadLazy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadLazyUndefined: Self = StObject.set(x, "onLoadLazy", js.undefined)
      
      @scala.inline
      def setOnLoadStart(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
      
      @scala.inline
      def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      @scala.inline
      def setOnLoadedData(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
      
      @scala.inline
      def setOnLoadedLazy(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onLoadedLazy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadedLazyUndefined: Self = StObject.set(x, "onLoadedLazy", js.undefined)
      
      @scala.inline
      def setOnLoadedMetadata(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
      
      @scala.inline
      def setOnMouseDown(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOnMouseMove(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      @scala.inline
      def setOnMouseOut(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
      
      @scala.inline
      def setOnMouseOver(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      @scala.inline
      def setOnMouseUp(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      @scala.inline
      def setOnPaste(value: SyntheticClipboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      @scala.inline
      def setOnPause(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      @scala.inline
      def setOnPlay(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      @scala.inline
      def setOnPlayVideo(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onPlayVideo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPlayVideoUndefined: Self = StObject.set(x, "onPlayVideo", js.undefined)
      
      @scala.inline
      def setOnPlaying(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
      
      @scala.inline
      def setOnPointerCancel(value: SyntheticPointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
      
      @scala.inline
      def setOnPointerDown(value: SyntheticPointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
      
      @scala.inline
      def setOnPointerEnter(value: SyntheticPointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
      
      @scala.inline
      def setOnPointerLeave(value: SyntheticPointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
      
      @scala.inline
      def setOnPointerMove(value: SyntheticPointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
      
      @scala.inline
      def setOnPointerOut(value: SyntheticPointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
      
      @scala.inline
      def setOnPointerOver(value: SyntheticPointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
      
      @scala.inline
      def setOnPointerUp(value: SyntheticPointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
      
      @scala.inline
      def setOnProgress(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      @scala.inline
      def setOnRateChange(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
      
      @scala.inline
      def setOnRefresh(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onRefresh", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRefreshUndefined: Self = StObject.set(x, "onRefresh", js.undefined)
      
      @scala.inline
      def setOnRefreshed(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onRefreshed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRefreshedUndefined: Self = StObject.set(x, "onRefreshed", js.undefined)
      
      @scala.inline
      def setOnReset(value: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      @scala.inline
      def setOnResize(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      @scala.inline
      def setOnResized(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onResized", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResizedUndefined: Self = StObject.set(x, "onResized", js.undefined)
      
      @scala.inline
      def setOnScroll(value: SyntheticUIEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      @scala.inline
      def setOnSeeked(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
      
      @scala.inline
      def setOnSeeking(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
      
      @scala.inline
      def setOnSelect(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setOnStalled(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onStalled", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
      
      @scala.inline
      def setOnStopVideo(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onStopVideo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStopVideoUndefined: Self = StObject.set(x, "onStopVideo", js.undefined)
      
      @scala.inline
      def setOnSubmit(value: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      @scala.inline
      def setOnSuspend(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
      
      @scala.inline
      def setOnTimeUpdate(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
      
      @scala.inline
      def setOnTouchCancel(value: SyntheticTouchEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      @scala.inline
      def setOnTouchEnd(value: SyntheticTouchEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      @scala.inline
      def setOnTouchMove(value: SyntheticTouchEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      @scala.inline
      def setOnTouchStart(value: SyntheticTouchEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      @scala.inline
      def setOnTransitionEnd(value: SyntheticTransitionEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      @scala.inline
      def setOnTranslate(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onTranslate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTranslateUndefined: Self = StObject.set(x, "onTranslate", js.undefined)
      
      @scala.inline
      def setOnTranslated(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onTranslated", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTranslatedUndefined: Self = StObject.set(x, "onTranslated", js.undefined)
      
      @scala.inline
      def setOnVolumeChange(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
      
      @scala.inline
      def setOnWaiting(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
      
      @scala.inline
      def setOnWheel(value: SyntheticWheelEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setOptimum(value: Double): Self = StObject.set(x, "optimum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptimumUndefined: Self = StObject.set(x, "optimum", js.undefined)
      
      @scala.inline
      def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPlaysInline(value: Boolean): Self = StObject.set(x, "playsInline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaysInlineUndefined: Self = StObject.set(x, "playsInline", js.undefined)
      
      @scala.inline
      def setPoster(value: String): Self = StObject.set(x, "poster", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosterUndefined: Self = StObject.set(x, "poster", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setPreload(value: String): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
      
      @scala.inline
      def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      @scala.inline
      def setPullDrag(value: Boolean): Self = StObject.set(x, "pullDrag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPullDragUndefined: Self = StObject.set(x, "pullDrag", js.undefined)
      
      @scala.inline
      def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setRefreshClass(value: String): Self = StObject.set(x, "refreshClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshClassUndefined: Self = StObject.set(x, "refreshClass", js.undefined)
      
      @scala.inline
      def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      @scala.inline
      def setResponsive(value: StringDictionary[Options]): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsiveBaseElement(value: Element): Self = StObject.set(x, "responsiveBaseElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsiveBaseElementUndefined: Self = StObject.set(x, "responsiveBaseElement", js.undefined)
      
      @scala.inline
      def setResponsiveClass(value: String | Boolean): Self = StObject.set(x, "responsiveClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsiveClassUndefined: Self = StObject.set(x, "responsiveClass", js.undefined)
      
      @scala.inline
      def setResponsiveRefreshRate(value: Double): Self = StObject.set(x, "responsiveRefreshRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsiveRefreshRateUndefined: Self = StObject.set(x, "responsiveRefreshRate", js.undefined)
      
      @scala.inline
      def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
      
      @scala.inline
      def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      @scala.inline
      def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
      
      @scala.inline
      def setRewind(value: Boolean): Self = StObject.set(x, "rewind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRewindUndefined: Self = StObject.set(x, "rewind", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
      
      @scala.inline
      def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      @scala.inline
      def setRtlClass(value: String): Self = StObject.set(x, "rtlClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtlClassUndefined: Self = StObject.set(x, "rtlClass", js.undefined)
      
      @scala.inline
      def setSandbox(value: String): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setScoped(value: Boolean): Self = StObject.set(x, "scoped", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopedUndefined: Self = StObject.set(x, "scoped", js.undefined)
      
      @scala.inline
      def setScrolling(value: String): Self = StObject.set(x, "scrolling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollingUndefined: Self = StObject.set(x, "scrolling", js.undefined)
      
      @scala.inline
      def setSeamless(value: Boolean): Self = StObject.set(x, "seamless", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeamlessUndefined: Self = StObject.set(x, "seamless", js.undefined)
      
      @scala.inline
      def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      @scala.inline
      def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSizes(value: String): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
      
      @scala.inline
      def setSlideBy(value: Double | String): Self = StObject.set(x, "slideBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlideByUndefined: Self = StObject.set(x, "slideBy", js.undefined)
      
      @scala.inline
      def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
      
      @scala.inline
      def setSmartSpeed(value: Double | Boolean): Self = StObject.set(x, "smartSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmartSpeedUndefined: Self = StObject.set(x, "smartSpeed", js.undefined)
      
      @scala.inline
      def setSpan(value: Double): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
      
      @scala.inline
      def setSpellCheck(value: Booleanish): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcDoc(value: String): Self = StObject.set(x, "srcDoc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcDocUndefined: Self = StObject.set(x, "srcDoc", js.undefined)
      
      @scala.inline
      def setSrcLang(value: String): Self = StObject.set(x, "srcLang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcLangUndefined: Self = StObject.set(x, "srcLang", js.undefined)
      
      @scala.inline
      def setSrcSet(value: String): Self = StObject.set(x, "srcSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcSetUndefined: Self = StObject.set(x, "srcSet", js.undefined)
      
      @scala.inline
      def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      @scala.inline
      def setStageClass(value: String): Self = StObject.set(x, "stageClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStageClassUndefined: Self = StObject.set(x, "stageClass", js.undefined)
      
      @scala.inline
      def setStageElement(value: String): Self = StObject.set(x, "stageElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStageElementUndefined: Self = StObject.set(x, "stageElement", js.undefined)
      
      @scala.inline
      def setStageOuterClass(value: String): Self = StObject.set(x, "stageOuterClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStageOuterClassUndefined: Self = StObject.set(x, "stageOuterClass", js.undefined)
      
      @scala.inline
      def setStagePadding(value: Double): Self = StObject.set(x, "stagePadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStagePaddingUndefined: Self = StObject.set(x, "stagePadding", js.undefined)
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartPosition(value: Double | String): Self = StObject.set(x, "startPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartPositionUndefined: Self = StObject.set(x, "startPosition", js.undefined)
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setStep(value: Double | String): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
      
      @scala.inline
      def setSuppressContentEditableWarning(value: Boolean): Self = StObject.set(x, "suppressContentEditableWarning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressContentEditableWarningUndefined: Self = StObject.set(x, "suppressContentEditableWarning", js.undefined)
      
      @scala.inline
      def setSuppressHydrationWarning(value: Boolean): Self = StObject.set(x, "suppressHydrationWarning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressHydrationWarningUndefined: Self = StObject.set(x, "suppressHydrationWarning", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTouchDrag(value: Boolean): Self = StObject.set(x, "touchDrag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchDragUndefined: Self = StObject.set(x, "touchDrag", js.undefined)
      
      @scala.inline
      def setTranslate(value: yes | no): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
      
      @scala.inline
      def setURLhashListener(value: Boolean): Self = StObject.set(x, "URLhashListener", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setURLhashListenerUndefined: Self = StObject.set(x, "URLhashListener", js.undefined)
      
      @scala.inline
      def setUnselectable(value: on | off): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
      
      @scala.inline
      def setUseMap(value: String): Self = StObject.set(x, "useMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseMapUndefined: Self = StObject.set(x, "useMap", js.undefined)
      
      @scala.inline
      def setValue(value: String | js.Array[String] | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
      
      @scala.inline
      def setVideo(value: Boolean): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideoHeight(value: Double | Boolean): Self = StObject.set(x, "videoHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideoHeightUndefined: Self = StObject.set(x, "videoHeight", js.undefined)
      
      @scala.inline
      def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
      
      @scala.inline
      def setVideoWidth(value: Double | Boolean): Self = StObject.set(x, "videoWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideoWidthUndefined: Self = StObject.set(x, "videoWidth", js.undefined)
      
      @scala.inline
      def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
      
      @scala.inline
      def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setWmode(value: String): Self = StObject.set(x, "wmode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWmodeUndefined: Self = StObject.set(x, "wmode", js.undefined)
      
      @scala.inline
      def setWrap(value: String): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  @js.native
  trait ReactOwlCarousel
    extends Component[OwlCarouselProps, js.Object, js.Any] {
    
    @JSName("$ele")
    var $ele: js.UndefOr[JQuery[HTMLElement]] = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MReactOwlCarousel(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MReactOwlCarousel(): Unit = js.native
    
    @JSName("componentWillReceiveProps")
    def componentWillReceiveProps_MReactOwlCarousel(): Unit = js.native
    
    var container: js.Any = js.native
    
    var containerRef: js.Any = js.native
    
    def create(): Unit = js.native
    def create(options: Options): Unit = js.native
    
    def destory(): Unit = js.native
    
    def next(speed: js.Array[Double]): Unit = js.native
    def next(speed: Double): Unit = js.native
    
    var options: js.Any = js.native
    
    def play(timeout: Double, speed: Double): Unit = js.native
    
    def prev(speed: js.Array[Double]): Unit = js.native
    def prev(speed: Double): Unit = js.native
    
    var propsWithoutOptions: js.Any = js.native
    
    def stop(): Unit = js.native
    
    def to(position: Double, speed: Double): Unit = js.native
  }
}
