package typingsSlinky.reactLazyLoadImageComponent

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLSpanElement
import slinky.core.ReactComponentClass
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
import typingsSlinky.react.mod.HTMLAttributeReferrerPolicy
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.KeyboardEventHandler
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.PointerEventHandler
import typingsSlinky.react.mod.ReactEventHandler
import typingsSlinky.react.mod.TouchEventHandler
import typingsSlinky.react.mod.TransitionEventHandler
import typingsSlinky.react.mod.UIEventHandler
import typingsSlinky.react.mod.WheelEventHandler
import typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings._empty
import typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.`additions removals`
import typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.`additions text`
import typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.`inline`
import typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.`lazy`
import typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.`removals additions`
import typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.`removals text`
import typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.`text additions`
import typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.`text removals`
import typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.`use-credentials`
import typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.additions
import typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.all
import typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.anonymous
import typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.ascending
import typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.assertive
import typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.async
import typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.auto
import typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.both
import typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.copy
import typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.date
import typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.decimal
import typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.descending
import typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.dialog
import typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.eager
import typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.email
import typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.execute
import typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.grammar
import typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.grid
import typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.horizontal
import typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.inherit
import typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.link
import typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.list
import typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.listbox
import typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.location
import typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.menu
import typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.mixed
import typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.move
import typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.no
import typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.none
import typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.numeric
import typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.off
import typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.on
import typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.other
import typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.page
import typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.polite
import typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.popup
import typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.removals
import typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.scrollPosition
import typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.search
import typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.spelling
import typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.step
import typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.sync
import typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.tel
import typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.text
import typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.time
import typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.tree
import typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.url
import typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.vertical
import typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.yes
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-lazy-load-image-component", "LazyLoadComponent")
  @js.native
  val LazyLoadComponent: ReactComponentClass[LazyLoadComponentProps] = js.native
  
  @JSImport("react-lazy-load-image-component", "LazyLoadImage")
  @js.native
  val LazyLoadImage: ReactComponentClass[LazyLoadImageProps] = js.native
  
  @JSImport("react-lazy-load-image-component", "trackWindowScroll")
  @js.native
  def trackWindowScroll[P /* <: LazyComponentProps */](BaseComponent: ReactComponentClass[P]): ReactComponentClass[Omit[P, scrollPosition]] = js.native
  
  @js.native
  trait CommonProps extends StObject {
    
    /** Function called after the image has been completely loaded. */
    var afterLoad: js.UndefOr[js.Function0[_]] = js.native
    
    /** Function called right before the placeholder is replaced with the image element. */
    var beforeLoad: js.UndefOr[js.Function0[_]] = js.native
    
    /* Method from lodash to use to delay the scroll/resize events. */
    var delayMethod: js.UndefOr[DelayMethod] = js.native
    
    /** Time in ms sent to the delayMethod. */
    var delayTime: js.UndefOr[Double] = js.native
    
    /** React element to use as a placeholder. Default is <span>. */
    var placeholder: js.UndefOr[ReactElement | Null] = js.native
    
    /** See trackWindowScroll(). */
    var scrollPosition: js.UndefOr[ScrollPosition] = js.native
    
    /** Threshold in pixels. So the image starts loading before it appears in the viewport. */
    var threshold: js.UndefOr[Double] = js.native
    
    /** Whether to use browser's IntersectionObserver when available. */
    var useIntersectionObserver: js.UndefOr[Boolean] = js.native
    
    /** Whether the image must be visible from the beginning. */
    var visibleByDefault: js.UndefOr[Boolean] = js.native
  }
  object CommonProps {
    
    @scala.inline
    def apply(): CommonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonProps]
    }
    
    @scala.inline
    implicit class CommonPropsMutableBuilder[Self <: CommonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterLoad(value: () => _): Self = StObject.set(x, "afterLoad", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAfterLoadUndefined: Self = StObject.set(x, "afterLoad", js.undefined)
      
      @scala.inline
      def setBeforeLoad(value: () => _): Self = StObject.set(x, "beforeLoad", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBeforeLoadUndefined: Self = StObject.set(x, "beforeLoad", js.undefined)
      
      @scala.inline
      def setDelayMethod(value: DelayMethod): Self = StObject.set(x, "delayMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayMethodUndefined: Self = StObject.set(x, "delayMethod", js.undefined)
      
      @scala.inline
      def setDelayTime(value: Double): Self = StObject.set(x, "delayTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayTimeUndefined: Self = StObject.set(x, "delayTime", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: ReactElement): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderNull: Self = StObject.set(x, "placeholder", null)
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setScrollPosition(value: ScrollPosition): Self = StObject.set(x, "scrollPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollPositionUndefined: Self = StObject.set(x, "scrollPosition", js.undefined)
      
      @scala.inline
      def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
      
      @scala.inline
      def setUseIntersectionObserver(value: Boolean): Self = StObject.set(x, "useIntersectionObserver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseIntersectionObserverUndefined: Self = StObject.set(x, "useIntersectionObserver", js.undefined)
      
      @scala.inline
      def setVisibleByDefault(value: Boolean): Self = StObject.set(x, "visibleByDefault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleByDefaultUndefined: Self = StObject.set(x, "visibleByDefault", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.debounce
    - typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.throttle
  */
  trait DelayMethod extends StObject
  object DelayMethod {
    
    @scala.inline
    def debounce: typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.debounce = "debounce".asInstanceOf[typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.debounce]
    
    @scala.inline
    def throttle: typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.throttle = "throttle".asInstanceOf[typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.throttle]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.blur
    - typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.`black-and-white`
    - typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.opacity
  */
  trait Effect extends StObject
  object Effect {
    
    @scala.inline
    def `black-and-white`: typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.`black-and-white` = "black-and-white".asInstanceOf[typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.`black-and-white`]
    
    @scala.inline
    def blur: typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.blur = "blur".asInstanceOf[typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.blur]
    
    @scala.inline
    def opacity: typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.opacity = "opacity".asInstanceOf[typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.opacity]
  }
  
  @js.native
  trait LazyComponentProps extends StObject {
    
    var scrollPosition: ScrollPosition = js.native
  }
  object LazyComponentProps {
    
    @scala.inline
    def apply(scrollPosition: ScrollPosition): LazyComponentProps = {
      val __obj = js.Dynamic.literal(scrollPosition = scrollPosition.asInstanceOf[js.Any])
      __obj.asInstanceOf[LazyComponentProps]
    }
    
    @scala.inline
    implicit class LazyComponentPropsMutableBuilder[Self <: LazyComponentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScrollPosition(value: ScrollPosition): Self = StObject.set(x, "scrollPosition", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LazyLoadComponentProps extends CommonProps {
    
    var children: ReactElement = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object LazyLoadComponentProps {
    
    @scala.inline
    def apply(): LazyLoadComponentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LazyLoadComponentProps]
    }
    
    @scala.inline
    implicit class LazyLoadComponentPropsMutableBuilder[Self <: LazyLoadComponentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* Inlined parent react-lazy-load-image-component.react-lazy-load-image-component.CommonProps */
  /* Inlined parent std.Omit<react.react.ImgHTMLAttributes<std.HTMLImageElement>, 'placeholder' | 'onload'> */
  @js.native
  trait LazyLoadImageProps extends StObject {
    
    var about: js.UndefOr[String] = js.native
    
    var accessKey: js.UndefOr[String] = js.native
    
    /** Function called after the image has been completely loaded. */
    var afterLoad: js.UndefOr[js.Function0[_]] = js.native
    
    var alt: js.UndefOr[String] = js.native
    
    var `aria-activedescendant`: js.UndefOr[String] = js.native
    
    var `aria-atomic`: js.UndefOr[Boolean] = js.native
    
    var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.native
    
    var `aria-busy`: js.UndefOr[Boolean] = js.native
    
    var `aria-checked`: js.UndefOr[Boolean | mixed] = js.native
    
    var `aria-colcount`: js.UndefOr[Double] = js.native
    
    var `aria-colindex`: js.UndefOr[Double] = js.native
    
    var `aria-colspan`: js.UndefOr[Double] = js.native
    
    var `aria-controls`: js.UndefOr[String] = js.native
    
    var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.native
    
    var `aria-describedby`: js.UndefOr[String] = js.native
    
    var `aria-details`: js.UndefOr[String] = js.native
    
    var `aria-disabled`: js.UndefOr[Boolean] = js.native
    
    var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.native
    
    var `aria-errormessage`: js.UndefOr[String] = js.native
    
    var `aria-expanded`: js.UndefOr[Boolean] = js.native
    
    var `aria-flowto`: js.UndefOr[String] = js.native
    
    var `aria-grabbed`: js.UndefOr[Boolean] = js.native
    
    var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.native
    
    var `aria-hidden`: js.UndefOr[Boolean] = js.native
    
    var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.native
    
    var `aria-keyshortcuts`: js.UndefOr[String] = js.native
    
    var `aria-label`: js.UndefOr[String] = js.native
    
    var `aria-labelledby`: js.UndefOr[String] = js.native
    
    var `aria-level`: js.UndefOr[Double] = js.native
    
    var `aria-live`: js.UndefOr[off | assertive | polite] = js.native
    
    var `aria-modal`: js.UndefOr[Boolean] = js.native
    
    var `aria-multiline`: js.UndefOr[Boolean] = js.native
    
    var `aria-multiselectable`: js.UndefOr[Boolean] = js.native
    
    var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.native
    
    var `aria-owns`: js.UndefOr[String] = js.native
    
    var `aria-placeholder`: js.UndefOr[String] = js.native
    
    var `aria-posinset`: js.UndefOr[Double] = js.native
    
    var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.native
    
    var `aria-readonly`: js.UndefOr[Boolean] = js.native
    
    var `aria-relevant`: js.UndefOr[
        additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ] = js.native
    
    var `aria-required`: js.UndefOr[Boolean] = js.native
    
    var `aria-roledescription`: js.UndefOr[String] = js.native
    
    var `aria-rowcount`: js.UndefOr[Double] = js.native
    
    var `aria-rowindex`: js.UndefOr[Double] = js.native
    
    var `aria-rowspan`: js.UndefOr[Double] = js.native
    
    var `aria-selected`: js.UndefOr[Boolean] = js.native
    
    var `aria-setsize`: js.UndefOr[Double] = js.native
    
    var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.native
    
    var `aria-valuemax`: js.UndefOr[Double] = js.native
    
    var `aria-valuemin`: js.UndefOr[Double] = js.native
    
    var `aria-valuenow`: js.UndefOr[Double] = js.native
    
    var `aria-valuetext`: js.UndefOr[String] = js.native
    
    var autoCapitalize: js.UndefOr[String] = js.native
    
    var autoCorrect: js.UndefOr[String] = js.native
    
    var autoSave: js.UndefOr[String] = js.native
    
    /** Function called right before the placeholder is replaced with the image element. */
    var beforeLoad: js.UndefOr[js.Function0[_]] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var color: js.UndefOr[String] = js.native
    
    var contentEditable: js.UndefOr[Booleanish | inherit] = js.native
    
    var contextMenu: js.UndefOr[String] = js.native
    
    var crossOrigin: js.UndefOr[anonymous | `use-credentials` | _empty] = js.native
    
    var dangerouslySetInnerHTML: js.UndefOr[Html] = js.native
    
    var datatype: js.UndefOr[String] = js.native
    
    var decoding: js.UndefOr[async | auto | sync] = js.native
    
    var defaultChecked: js.UndefOr[Boolean] = js.native
    
    var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.native
    
    /* Method from lodash to use to delay the scroll/resize events. */
    var delayMethod: js.UndefOr[DelayMethod] = js.native
    
    /** Time in ms sent to the delayMethod. */
    var delayTime: js.UndefOr[Double] = js.native
    
    var dir: js.UndefOr[String] = js.native
    
    var draggable: js.UndefOr[Booleanish] = js.native
    
    /** Name of the effect to use. Requires importing CSS, see README.md. */
    var effect: js.UndefOr[Effect] = js.native
    
    var height: js.UndefOr[Double | String] = js.native
    
    var hidden: js.UndefOr[Boolean] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var inlist: js.UndefOr[js.Any] = js.native
    
    var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.native
    
    var is: js.UndefOr[String] = js.native
    
    var itemID: js.UndefOr[String] = js.native
    
    var itemProp: js.UndefOr[String] = js.native
    
    var itemRef: js.UndefOr[String] = js.native
    
    var itemScope: js.UndefOr[Boolean] = js.native
    
    var itemType: js.UndefOr[String] = js.native
    
    var lang: js.UndefOr[String] = js.native
    
    var loading: js.UndefOr[eager | `lazy`] = js.native
    
    var onAbort: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.native
    
    var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLImageElement]] = js.native
    
    var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLImageElement]] = js.native
    
    var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLImageElement]] = js.native
    
    var onAuxClick: js.UndefOr[MouseEventHandler[HTMLImageElement]] = js.native
    
    var onBeforeInput: js.UndefOr[FormEventHandler[HTMLImageElement]] = js.native
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLImageElement]] = js.native
    
    var onCanPlay: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.native
    
    var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.native
    
    var onChange: js.UndefOr[FormEventHandler[HTMLImageElement]] = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLImageElement]] = js.native
    
    var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLImageElement]] = js.native
    
    var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLImageElement]] = js.native
    
    var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLImageElement]] = js.native
    
    var onContextMenu: js.UndefOr[MouseEventHandler[HTMLImageElement]] = js.native
    
    var onCopy: js.UndefOr[ClipboardEventHandler[HTMLImageElement]] = js.native
    
    var onCut: js.UndefOr[ClipboardEventHandler[HTMLImageElement]] = js.native
    
    var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLImageElement]] = js.native
    
    var onDrag: js.UndefOr[DragEventHandler[HTMLImageElement]] = js.native
    
    var onDragEnd: js.UndefOr[DragEventHandler[HTMLImageElement]] = js.native
    
    var onDragEnter: js.UndefOr[DragEventHandler[HTMLImageElement]] = js.native
    
    var onDragExit: js.UndefOr[DragEventHandler[HTMLImageElement]] = js.native
    
    var onDragLeave: js.UndefOr[DragEventHandler[HTMLImageElement]] = js.native
    
    var onDragOver: js.UndefOr[DragEventHandler[HTMLImageElement]] = js.native
    
    var onDragStart: js.UndefOr[DragEventHandler[HTMLImageElement]] = js.native
    
    var onDrop: js.UndefOr[DragEventHandler[HTMLImageElement]] = js.native
    
    var onDurationChange: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.native
    
    var onEmptied: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.native
    
    var onEncrypted: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.native
    
    var onEnded: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.native
    
    var onError: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.native
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLImageElement]] = js.native
    
    var onInput: js.UndefOr[FormEventHandler[HTMLImageElement]] = js.native
    
    var onInvalid: js.UndefOr[FormEventHandler[HTMLImageElement]] = js.native
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLImageElement]] = js.native
    
    var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLImageElement]] = js.native
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLImageElement]] = js.native
    
    var onLoad: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.native
    
    var onLoadStart: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.native
    
    var onLoadedData: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.native
    
    var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.native
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLImageElement]] = js.native
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLImageElement]] = js.native
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLImageElement]] = js.native
    
    var onMouseMove: js.UndefOr[MouseEventHandler[HTMLImageElement]] = js.native
    
    var onMouseOut: js.UndefOr[MouseEventHandler[HTMLImageElement]] = js.native
    
    var onMouseOver: js.UndefOr[MouseEventHandler[HTMLImageElement]] = js.native
    
    var onMouseUp: js.UndefOr[MouseEventHandler[HTMLImageElement]] = js.native
    
    var onPaste: js.UndefOr[ClipboardEventHandler[HTMLImageElement]] = js.native
    
    var onPause: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.native
    
    var onPlay: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.native
    
    var onPlaying: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.native
    
    var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLImageElement]] = js.native
    
    var onPointerDown: js.UndefOr[PointerEventHandler[HTMLImageElement]] = js.native
    
    var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLImageElement]] = js.native
    
    var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLImageElement]] = js.native
    
    var onPointerMove: js.UndefOr[PointerEventHandler[HTMLImageElement]] = js.native
    
    var onPointerOut: js.UndefOr[PointerEventHandler[HTMLImageElement]] = js.native
    
    var onPointerOver: js.UndefOr[PointerEventHandler[HTMLImageElement]] = js.native
    
    var onPointerUp: js.UndefOr[PointerEventHandler[HTMLImageElement]] = js.native
    
    var onProgress: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.native
    
    var onRateChange: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.native
    
    var onReset: js.UndefOr[FormEventHandler[HTMLImageElement]] = js.native
    
    var onScroll: js.UndefOr[UIEventHandler[HTMLImageElement]] = js.native
    
    var onSeeked: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.native
    
    var onSeeking: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.native
    
    var onSelect: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.native
    
    var onStalled: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.native
    
    var onSubmit: js.UndefOr[FormEventHandler[HTMLImageElement]] = js.native
    
    var onSuspend: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.native
    
    var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.native
    
    var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLImageElement]] = js.native
    
    var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLImageElement]] = js.native
    
    var onTouchMove: js.UndefOr[TouchEventHandler[HTMLImageElement]] = js.native
    
    var onTouchStart: js.UndefOr[TouchEventHandler[HTMLImageElement]] = js.native
    
    var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLImageElement]] = js.native
    
    var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.native
    
    var onWaiting: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.native
    
    var onWheel: js.UndefOr[WheelEventHandler[HTMLImageElement]] = js.native
    
    /** React element to use as a placeholder. Default is <span>. */
    var placeholder: js.UndefOr[ReactElement | Null] = js.native
    
    /** Image src to display while the image is not visible or loaded. */
    var placeholderSrc: js.UndefOr[String] = js.native
    
    var prefix: js.UndefOr[String] = js.native
    
    var property: js.UndefOr[String] = js.native
    
    var radioGroup: js.UndefOr[String] = js.native
    
    var referrerPolicy: js.UndefOr[HTMLAttributeReferrerPolicy] = js.native
    
    var resource: js.UndefOr[String] = js.native
    
    var results: js.UndefOr[Double] = js.native
    
    var role: js.UndefOr[String] = js.native
    
    /** See trackWindowScroll(). */
    var scrollPosition: js.UndefOr[ScrollPosition] = js.native
    
    var security: js.UndefOr[String] = js.native
    
    var sizes: js.UndefOr[String] = js.native
    
    var slot: js.UndefOr[String] = js.native
    
    var spellCheck: js.UndefOr[Booleanish] = js.native
    
    var src: js.UndefOr[String] = js.native
    
    var srcSet: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var suppressContentEditableWarning: js.UndefOr[Boolean] = js.native
    
    var suppressHydrationWarning: js.UndefOr[Boolean] = js.native
    
    var tabIndex: js.UndefOr[Double] = js.native
    
    /** Threshold in pixels. So the image starts loading before it appears in the viewport. */
    var threshold: js.UndefOr[Double] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var translate: js.UndefOr[yes | no] = js.native
    
    var typeof: js.UndefOr[String] = js.native
    
    var unselectable: js.UndefOr[on | off] = js.native
    
    /** Whether to use browser's IntersectionObserver when available. */
    var useIntersectionObserver: js.UndefOr[Boolean] = js.native
    
    var useMap: js.UndefOr[String] = js.native
    
    /** Whether the image must be visible from the beginning. */
    var visibleByDefault: js.UndefOr[Boolean] = js.native
    
    var vocab: js.UndefOr[String] = js.native
    
    var width: js.UndefOr[Double | String] = js.native
    
    /** In some occasions (for example, when using a placeholderSrc) a wrapper span tag is rendered. This prop allows setting a class to that element. */
    var wrapperClassName: js.UndefOr[String] = js.native
    
    /** Props that should be passed to the wrapper span when it is rendered (for example, when using placeholderSrc or effect) */
    var wrapperProps: js.UndefOr[HTMLAttributes[HTMLSpanElement]] = js.native
  }
  object LazyLoadImageProps {
    
    @scala.inline
    def apply(): LazyLoadImageProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LazyLoadImageProps]
    }
    
    @scala.inline
    implicit class LazyLoadImagePropsMutableBuilder[Self <: LazyLoadImageProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
      
      @scala.inline
      def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      @scala.inline
      def setAfterLoad(value: () => _): Self = StObject.set(x, "afterLoad", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAfterLoadUndefined: Self = StObject.set(x, "afterLoad", js.undefined)
      
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
      def setAutoCapitalize(value: String): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
      
      @scala.inline
      def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
      
      @scala.inline
      def setAutoSave(value: String): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
      
      @scala.inline
      def setBeforeLoad(value: () => _): Self = StObject.set(x, "beforeLoad", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBeforeLoadUndefined: Self = StObject.set(x, "beforeLoad", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setContentEditable(value: Booleanish | inherit): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
      
      @scala.inline
      def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      @scala.inline
      def setCrossOrigin(value: anonymous | `use-credentials` | _empty): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      @scala.inline
      def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
      
      @scala.inline
      def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
      
      @scala.inline
      def setDecoding(value: async | auto | sync): Self = StObject.set(x, "decoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecodingUndefined: Self = StObject.set(x, "decoding", js.undefined)
      
      @scala.inline
      def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      @scala.inline
      def setDelayMethod(value: DelayMethod): Self = StObject.set(x, "delayMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayMethodUndefined: Self = StObject.set(x, "delayMethod", js.undefined)
      
      @scala.inline
      def setDelayTime(value: Double): Self = StObject.set(x, "delayTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayTimeUndefined: Self = StObject.set(x, "delayTime", js.undefined)
      
      @scala.inline
      def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      @scala.inline
      def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      @scala.inline
      def setEffect(value: Effect): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
      
      @scala.inline
      def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
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
      def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      @scala.inline
      def setLoading(value: eager | `lazy`): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setOnAbort(value: SyntheticEvent[Event, HTMLImageElement] => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      @scala.inline
      def setOnAnimationEnd(value: SyntheticAnimationEvent[HTMLImageElement] => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      @scala.inline
      def setOnAnimationIteration(value: SyntheticAnimationEvent[HTMLImageElement] => Unit): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
      
      @scala.inline
      def setOnAnimationStart(value: SyntheticAnimationEvent[HTMLImageElement] => Unit): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
      
      @scala.inline
      def setOnAuxClick(value: SyntheticMouseEvent[HTMLImageElement] => Unit): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
      
      @scala.inline
      def setOnBeforeInput(value: SyntheticEvent[EventTarget with HTMLImageElement, Event] => Unit): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
      
      @scala.inline
      def setOnBlur(value: SyntheticFocusEvent[HTMLImageElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnCanPlay(value: SyntheticEvent[Event, HTMLImageElement] => Unit): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCanPlayThrough(value: SyntheticEvent[Event, HTMLImageElement] => Unit): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
      
      @scala.inline
      def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
      
      @scala.inline
      def setOnChange(value: SyntheticEvent[EventTarget with HTMLImageElement, Event] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClick(value: SyntheticMouseEvent[HTMLImageElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnCompositionEnd(value: SyntheticCompositionEvent[HTMLImageElement] => Unit): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
      
      @scala.inline
      def setOnCompositionStart(value: SyntheticCompositionEvent[HTMLImageElement] => Unit): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
      
      @scala.inline
      def setOnCompositionUpdate(value: SyntheticCompositionEvent[HTMLImageElement] => Unit): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
      
      @scala.inline
      def setOnContextMenu(value: SyntheticMouseEvent[HTMLImageElement] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      @scala.inline
      def setOnCopy(value: SyntheticClipboardEvent[HTMLImageElement] => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      @scala.inline
      def setOnCut(value: SyntheticClipboardEvent[HTMLImageElement] => Unit): Self = StObject.set(x, "onCut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
      
      @scala.inline
      def setOnDoubleClick(value: SyntheticMouseEvent[HTMLImageElement] => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      @scala.inline
      def setOnDrag(value: DragEvent[HTMLImageElement] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEnd(value: DragEvent[HTMLImageElement] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      @scala.inline
      def setOnDragEnter(value: DragEvent[HTMLImageElement] => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      @scala.inline
      def setOnDragExit(value: DragEvent[HTMLImageElement] => Unit): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
      
      @scala.inline
      def setOnDragLeave(value: DragEvent[HTMLImageElement] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      @scala.inline
      def setOnDragOver(value: DragEvent[HTMLImageElement] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      @scala.inline
      def setOnDragStart(value: DragEvent[HTMLImageElement] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      @scala.inline
      def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      @scala.inline
      def setOnDrop(value: DragEvent[HTMLImageElement] => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      @scala.inline
      def setOnDurationChange(value: SyntheticEvent[Event, HTMLImageElement] => Unit): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
      
      @scala.inline
      def setOnEmptied(value: SyntheticEvent[Event, HTMLImageElement] => Unit): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
      
      @scala.inline
      def setOnEncrypted(value: SyntheticEvent[Event, HTMLImageElement] => Unit): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
      
      @scala.inline
      def setOnEnded(value: SyntheticEvent[Event, HTMLImageElement] => Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
      
      @scala.inline
      def setOnError(value: SyntheticEvent[Event, HTMLImageElement] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnFocus(value: SyntheticFocusEvent[HTMLImageElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnInput(value: SyntheticEvent[EventTarget with HTMLImageElement, Event] => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      @scala.inline
      def setOnInvalid(value: SyntheticEvent[EventTarget with HTMLImageElement, Event] => Unit): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: SyntheticKeyboardEvent[HTMLImageElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnKeyPress(value: SyntheticKeyboardEvent[HTMLImageElement] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      @scala.inline
      def setOnKeyUp(value: SyntheticKeyboardEvent[HTMLImageElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      @scala.inline
      def setOnLoad(value: SyntheticEvent[Event, HTMLImageElement] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadStart(value: SyntheticEvent[Event, HTMLImageElement] => Unit): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
      
      @scala.inline
      def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      @scala.inline
      def setOnLoadedData(value: SyntheticEvent[Event, HTMLImageElement] => Unit): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
      
      @scala.inline
      def setOnLoadedMetadata(value: SyntheticEvent[Event, HTMLImageElement] => Unit): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
      
      @scala.inline
      def setOnMouseDown(value: SyntheticMouseEvent[HTMLImageElement] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: SyntheticMouseEvent[HTMLImageElement] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: SyntheticMouseEvent[HTMLImageElement] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOnMouseMove(value: SyntheticMouseEvent[HTMLImageElement] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      @scala.inline
      def setOnMouseOut(value: SyntheticMouseEvent[HTMLImageElement] => Unit): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
      
      @scala.inline
      def setOnMouseOver(value: SyntheticMouseEvent[HTMLImageElement] => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      @scala.inline
      def setOnMouseUp(value: SyntheticMouseEvent[HTMLImageElement] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      @scala.inline
      def setOnPaste(value: SyntheticClipboardEvent[HTMLImageElement] => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      @scala.inline
      def setOnPause(value: SyntheticEvent[Event, HTMLImageElement] => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      @scala.inline
      def setOnPlay(value: SyntheticEvent[Event, HTMLImageElement] => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      @scala.inline
      def setOnPlaying(value: SyntheticEvent[Event, HTMLImageElement] => Unit): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
      
      @scala.inline
      def setOnPointerCancel(value: SyntheticPointerEvent[HTMLImageElement] => Unit): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
      
      @scala.inline
      def setOnPointerDown(value: SyntheticPointerEvent[HTMLImageElement] => Unit): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
      
      @scala.inline
      def setOnPointerEnter(value: SyntheticPointerEvent[HTMLImageElement] => Unit): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
      
      @scala.inline
      def setOnPointerLeave(value: SyntheticPointerEvent[HTMLImageElement] => Unit): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
      
      @scala.inline
      def setOnPointerMove(value: SyntheticPointerEvent[HTMLImageElement] => Unit): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
      
      @scala.inline
      def setOnPointerOut(value: SyntheticPointerEvent[HTMLImageElement] => Unit): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
      
      @scala.inline
      def setOnPointerOver(value: SyntheticPointerEvent[HTMLImageElement] => Unit): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
      
      @scala.inline
      def setOnPointerUp(value: SyntheticPointerEvent[HTMLImageElement] => Unit): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
      
      @scala.inline
      def setOnProgress(value: SyntheticEvent[Event, HTMLImageElement] => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      @scala.inline
      def setOnRateChange(value: SyntheticEvent[Event, HTMLImageElement] => Unit): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
      
      @scala.inline
      def setOnReset(value: SyntheticEvent[EventTarget with HTMLImageElement, Event] => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      @scala.inline
      def setOnScroll(value: SyntheticUIEvent[HTMLImageElement] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      @scala.inline
      def setOnSeeked(value: SyntheticEvent[Event, HTMLImageElement] => Unit): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
      
      @scala.inline
      def setOnSeeking(value: SyntheticEvent[Event, HTMLImageElement] => Unit): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
      
      @scala.inline
      def setOnSelect(value: SyntheticEvent[Event, HTMLImageElement] => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setOnStalled(value: SyntheticEvent[Event, HTMLImageElement] => Unit): Self = StObject.set(x, "onStalled", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
      
      @scala.inline
      def setOnSubmit(value: SyntheticEvent[EventTarget with HTMLImageElement, Event] => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      @scala.inline
      def setOnSuspend(value: SyntheticEvent[Event, HTMLImageElement] => Unit): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
      
      @scala.inline
      def setOnTimeUpdate(value: SyntheticEvent[Event, HTMLImageElement] => Unit): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
      
      @scala.inline
      def setOnTouchCancel(value: SyntheticTouchEvent[HTMLImageElement] => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      @scala.inline
      def setOnTouchEnd(value: SyntheticTouchEvent[HTMLImageElement] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      @scala.inline
      def setOnTouchMove(value: SyntheticTouchEvent[HTMLImageElement] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      @scala.inline
      def setOnTouchStart(value: SyntheticTouchEvent[HTMLImageElement] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      @scala.inline
      def setOnTransitionEnd(value: SyntheticTransitionEvent[HTMLImageElement] => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      @scala.inline
      def setOnVolumeChange(value: SyntheticEvent[Event, HTMLImageElement] => Unit): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
      
      @scala.inline
      def setOnWaiting(value: SyntheticEvent[Event, HTMLImageElement] => Unit): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
      
      @scala.inline
      def setOnWheel(value: SyntheticWheelEvent[HTMLImageElement] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: ReactElement): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderNull: Self = StObject.set(x, "placeholder", null)
      
      @scala.inline
      def setPlaceholderSrc(value: String): Self = StObject.set(x, "placeholderSrc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderSrcUndefined: Self = StObject.set(x, "placeholderSrc", js.undefined)
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      @scala.inline
      def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
      
      @scala.inline
      def setReferrerPolicy(value: HTMLAttributeReferrerPolicy): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferrerPolicyUndefined: Self = StObject.set(x, "referrerPolicy", js.undefined)
      
      @scala.inline
      def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      @scala.inline
      def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setScrollPosition(value: ScrollPosition): Self = StObject.set(x, "scrollPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollPositionUndefined: Self = StObject.set(x, "scrollPosition", js.undefined)
      
      @scala.inline
      def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
      
      @scala.inline
      def setSizes(value: String): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
      
      @scala.inline
      def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
      
      @scala.inline
      def setSpellCheck(value: Booleanish): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcSet(value: String): Self = StObject.set(x, "srcSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcSetUndefined: Self = StObject.set(x, "srcSet", js.undefined)
      
      @scala.inline
      def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
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
      def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTranslate(value: yes | no): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      @scala.inline
      def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
      
      @scala.inline
      def setUnselectable(value: on | off): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
      
      @scala.inline
      def setUseIntersectionObserver(value: Boolean): Self = StObject.set(x, "useIntersectionObserver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseIntersectionObserverUndefined: Self = StObject.set(x, "useIntersectionObserver", js.undefined)
      
      @scala.inline
      def setUseMap(value: String): Self = StObject.set(x, "useMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseMapUndefined: Self = StObject.set(x, "useMap", js.undefined)
      
      @scala.inline
      def setVisibleByDefault(value: Boolean): Self = StObject.set(x, "visibleByDefault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleByDefaultUndefined: Self = StObject.set(x, "visibleByDefault", js.undefined)
      
      @scala.inline
      def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
      
      @scala.inline
      def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setWrapperClassName(value: String): Self = StObject.set(x, "wrapperClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapperClassNameUndefined: Self = StObject.set(x, "wrapperClassName", js.undefined)
      
      @scala.inline
      def setWrapperProps(value: HTMLAttributes[HTMLSpanElement]): Self = StObject.set(x, "wrapperProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapperPropsUndefined: Self = StObject.set(x, "wrapperProps", js.undefined)
    }
  }
  
  @js.native
  trait ScrollPosition extends StObject {
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object ScrollPosition {
    
    @scala.inline
    def apply(x: Double, y: Double): ScrollPosition = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollPosition]
    }
    
    @scala.inline
    implicit class ScrollPositionMutableBuilder[Self <: ScrollPosition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
