package typingsSlinky.aos

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.Element
import typingsSlinky.aos.aosStrings.mobile
import typingsSlinky.aos.aosStrings.phone
import typingsSlinky.aos.aosStrings.tablet
import typingsSlinky.std.AddEventListenerOptions
import typingsSlinky.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("aos", JSImport.Namespace)
  @js.native
  val ^ : Aos = js.native
  
  @js.native
  trait Aos extends StObject {
    
    /**
      * Initializing AOS
      * - Create options merging defaults with user defined options
      * - Set attributes on <body> as global setting - css relies on it
      * - Attach preparing elements to options.startEvent,
      *   window resize and orientation change
      * - Attach function that handle scroll and everything connected to it
      *   to window scroll event and fire once document is ready to set initial state
      *  @param options options
      */
    def init(): Unit = js.native
    def init(options: AosOptions): Unit = js.native
    
    /**
      * Refresh AOS
      */
    def refresh(): Unit = js.native
    
    /**
      * Hard refresh
      * create array with new elements and trigger refresh
      */
    def refreshHard(): Unit = js.native
  }
  
  @js.native
  trait AosEvent extends Event {
    
    var detail: Element = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.aos.aosStrings.aosColonin
    - typingsSlinky.aos.aosStrings.aosColonout
  */
  trait AosEventType extends StObject
  object AosEventType {
    
    @scala.inline
    def aosColonin: typingsSlinky.aos.aosStrings.aosColonin = "aos:in".asInstanceOf[typingsSlinky.aos.aosStrings.aosColonin]
    
    @scala.inline
    def aosColonout: typingsSlinky.aos.aosStrings.aosColonout = "aos:out".asInstanceOf[typingsSlinky.aos.aosStrings.aosColonout]
  }
  
  @js.native
  trait AosOptions extends StObject {
    
    // #endregion
    // #region Settings that can be overridden on per-element basis, by `data-aos-*` attributes
    /**
      * Defines which position of the element regarding to window should trigger the animation
      */
    var anchorPlacement: js.UndefOr[anchorPlacementOptions] = js.native
    
    // #region Global settings
    /**
      * Class applied on animation
      */
    var animatedClassName: js.UndefOr[String] = js.native
    
    /**
      * The delay on debounce used while resizing window
      */
    var debounceDelay: js.UndefOr[Double] = js.native
    
    /**
      * Values from 0 to 3000, with step 50ms
      */
    var delay: js.UndefOr[Double] = js.native
    
    /**
      * Accepts following values: 'phone', 'tablet', 'mobile', boolean, expression or function
      */
    var disable: js.UndefOr[phone | tablet | mobile | Boolean | js.Function0[Boolean]] = js.native
    
    /**
      * Disables automatic mutations' detections
      */
    var disableMutationObserver: js.UndefOr[Boolean] = js.native
    
    /**
      * Values from 0 to 3000, with step 50ms
      */
    var duration: js.UndefOr[Double] = js.native
    
    /**
      * Default easing for AOS animations
      */
    var easing: js.UndefOr[easingOptions] = js.native
    
    /**
      * Class applied after initialization
      */
    var initClassName: js.UndefOr[String] = js.native
    
    /**
      * Whether elements should animate out while scrolling past them
      */
    var mirror: js.UndefOr[Boolean] = js.native
    
    /**
      * Offset (in px) from the original trigger point
      */
    var offset: js.UndefOr[Double] = js.native
    
    /**
      * Whether animation should happen only once - while scrolling down
      */
    var once: js.UndefOr[Boolean] = js.native
    
    /**
      * Name of the event dispatched on the document, that AOS should initialize on
      */
    var startEvent: js.UndefOr[String] = js.native
    
    /**
      * The delay on throttle used while scrolling the page
      */
    var throttleDelay: js.UndefOr[Double] = js.native
    
    /**
      * If true, will add content of `data-aos` as classes on scroll
      */
    var useClassNames: js.UndefOr[Boolean] = js.native
  }
  object AosOptions {
    
    @scala.inline
    def apply(): AosOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AosOptions]
    }
    
    @scala.inline
    implicit class AosOptionsMutableBuilder[Self <: AosOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnchorPlacement(value: anchorPlacementOptions): Self = StObject.set(x, "anchorPlacement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorPlacementUndefined: Self = StObject.set(x, "anchorPlacement", js.undefined)
      
      @scala.inline
      def setAnimatedClassName(value: String): Self = StObject.set(x, "animatedClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimatedClassNameUndefined: Self = StObject.set(x, "animatedClassName", js.undefined)
      
      @scala.inline
      def setDebounceDelay(value: Double): Self = StObject.set(x, "debounceDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebounceDelayUndefined: Self = StObject.set(x, "debounceDelay", js.undefined)
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setDisable(value: phone | tablet | mobile | Boolean | js.Function0[Boolean]): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableFunction0(value: () => Boolean): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDisableMutationObserver(value: Boolean): Self = StObject.set(x, "disableMutationObserver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableMutationObserverUndefined: Self = StObject.set(x, "disableMutationObserver", js.undefined)
      
      @scala.inline
      def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEasing(value: easingOptions): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      @scala.inline
      def setInitClassName(value: String): Self = StObject.set(x, "initClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitClassNameUndefined: Self = StObject.set(x, "initClassName", js.undefined)
      
      @scala.inline
      def setMirror(value: Boolean): Self = StObject.set(x, "mirror", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMirrorUndefined: Self = StObject.set(x, "mirror", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
      
      @scala.inline
      def setStartEvent(value: String): Self = StObject.set(x, "startEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartEventUndefined: Self = StObject.set(x, "startEvent", js.undefined)
      
      @scala.inline
      def setThrottleDelay(value: Double): Self = StObject.set(x, "throttleDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrottleDelayUndefined: Self = StObject.set(x, "throttleDelay", js.undefined)
      
      @scala.inline
      def setUseClassNames(value: Boolean): Self = StObject.set(x, "useClassNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseClassNamesUndefined: Self = StObject.set(x, "useClassNames", js.undefined)
    }
  }
  
  type _To = Aos
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Aos = ^
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.aos.aosStrings.`top-bottom`
    - typingsSlinky.aos.aosStrings.`top-center`
    - typingsSlinky.aos.aosStrings.`top-top`
    - typingsSlinky.aos.aosStrings.`center-bottom`
    - typingsSlinky.aos.aosStrings.`center-center`
    - typingsSlinky.aos.aosStrings.`center-top`
    - typingsSlinky.aos.aosStrings.`bottom-bottom`
    - typingsSlinky.aos.aosStrings.`bottom-center`
    - typingsSlinky.aos.aosStrings.`bottom-top`
  */
  trait anchorPlacementOptions extends StObject
  object anchorPlacementOptions {
    
    @scala.inline
    def `bottom-bottom`: typingsSlinky.aos.aosStrings.`bottom-bottom` = "bottom-bottom".asInstanceOf[typingsSlinky.aos.aosStrings.`bottom-bottom`]
    
    @scala.inline
    def `bottom-center`: typingsSlinky.aos.aosStrings.`bottom-center` = "bottom-center".asInstanceOf[typingsSlinky.aos.aosStrings.`bottom-center`]
    
    @scala.inline
    def `bottom-top`: typingsSlinky.aos.aosStrings.`bottom-top` = "bottom-top".asInstanceOf[typingsSlinky.aos.aosStrings.`bottom-top`]
    
    @scala.inline
    def `center-bottom`: typingsSlinky.aos.aosStrings.`center-bottom` = "center-bottom".asInstanceOf[typingsSlinky.aos.aosStrings.`center-bottom`]
    
    @scala.inline
    def `center-center`: typingsSlinky.aos.aosStrings.`center-center` = "center-center".asInstanceOf[typingsSlinky.aos.aosStrings.`center-center`]
    
    @scala.inline
    def `center-top`: typingsSlinky.aos.aosStrings.`center-top` = "center-top".asInstanceOf[typingsSlinky.aos.aosStrings.`center-top`]
    
    @scala.inline
    def `top-bottom`: typingsSlinky.aos.aosStrings.`top-bottom` = "top-bottom".asInstanceOf[typingsSlinky.aos.aosStrings.`top-bottom`]
    
    @scala.inline
    def `top-center`: typingsSlinky.aos.aosStrings.`top-center` = "top-center".asInstanceOf[typingsSlinky.aos.aosStrings.`top-center`]
    
    @scala.inline
    def `top-top`: typingsSlinky.aos.aosStrings.`top-top` = "top-top".asInstanceOf[typingsSlinky.aos.aosStrings.`top-top`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.aos.aosStrings.linear
    - typingsSlinky.aos.aosStrings.ease
    - typingsSlinky.aos.aosStrings.`ease-in`
    - typingsSlinky.aos.aosStrings.`ease-out`
    - typingsSlinky.aos.aosStrings.`ease-in-out`
    - typingsSlinky.aos.aosStrings.`ease-in-back`
    - typingsSlinky.aos.aosStrings.`ease-out-back`
    - typingsSlinky.aos.aosStrings.`ease-in-out-back`
    - typingsSlinky.aos.aosStrings.`ease-in-sine`
    - typingsSlinky.aos.aosStrings.`ease-out-sine`
    - typingsSlinky.aos.aosStrings.`ease-in-out-sine`
    - typingsSlinky.aos.aosStrings.`ease-in-quad`
    - typingsSlinky.aos.aosStrings.`ease-out-quad`
    - typingsSlinky.aos.aosStrings.`ease-in-out-quad`
    - typingsSlinky.aos.aosStrings.`ease-in-cubic`
    - typingsSlinky.aos.aosStrings.`ease-out-cubic`
    - typingsSlinky.aos.aosStrings.`ease-in-out-cubic`
    - typingsSlinky.aos.aosStrings.`ease-in-quart`
    - typingsSlinky.aos.aosStrings.`ease-out-quart`
    - typingsSlinky.aos.aosStrings.`ease-in-out-quart`
  */
  trait easingOptions extends StObject
  object easingOptions {
    
    @scala.inline
    def ease: typingsSlinky.aos.aosStrings.ease = "ease".asInstanceOf[typingsSlinky.aos.aosStrings.ease]
    
    @scala.inline
    def `ease-in`: typingsSlinky.aos.aosStrings.`ease-in` = "ease-in".asInstanceOf[typingsSlinky.aos.aosStrings.`ease-in`]
    
    @scala.inline
    def `ease-in-back`: typingsSlinky.aos.aosStrings.`ease-in-back` = "ease-in-back".asInstanceOf[typingsSlinky.aos.aosStrings.`ease-in-back`]
    
    @scala.inline
    def `ease-in-cubic`: typingsSlinky.aos.aosStrings.`ease-in-cubic` = "ease-in-cubic".asInstanceOf[typingsSlinky.aos.aosStrings.`ease-in-cubic`]
    
    @scala.inline
    def `ease-in-out`: typingsSlinky.aos.aosStrings.`ease-in-out` = "ease-in-out".asInstanceOf[typingsSlinky.aos.aosStrings.`ease-in-out`]
    
    @scala.inline
    def `ease-in-out-back`: typingsSlinky.aos.aosStrings.`ease-in-out-back` = "ease-in-out-back".asInstanceOf[typingsSlinky.aos.aosStrings.`ease-in-out-back`]
    
    @scala.inline
    def `ease-in-out-cubic`: typingsSlinky.aos.aosStrings.`ease-in-out-cubic` = "ease-in-out-cubic".asInstanceOf[typingsSlinky.aos.aosStrings.`ease-in-out-cubic`]
    
    @scala.inline
    def `ease-in-out-quad`: typingsSlinky.aos.aosStrings.`ease-in-out-quad` = "ease-in-out-quad".asInstanceOf[typingsSlinky.aos.aosStrings.`ease-in-out-quad`]
    
    @scala.inline
    def `ease-in-out-quart`: typingsSlinky.aos.aosStrings.`ease-in-out-quart` = "ease-in-out-quart".asInstanceOf[typingsSlinky.aos.aosStrings.`ease-in-out-quart`]
    
    @scala.inline
    def `ease-in-out-sine`: typingsSlinky.aos.aosStrings.`ease-in-out-sine` = "ease-in-out-sine".asInstanceOf[typingsSlinky.aos.aosStrings.`ease-in-out-sine`]
    
    @scala.inline
    def `ease-in-quad`: typingsSlinky.aos.aosStrings.`ease-in-quad` = "ease-in-quad".asInstanceOf[typingsSlinky.aos.aosStrings.`ease-in-quad`]
    
    @scala.inline
    def `ease-in-quart`: typingsSlinky.aos.aosStrings.`ease-in-quart` = "ease-in-quart".asInstanceOf[typingsSlinky.aos.aosStrings.`ease-in-quart`]
    
    @scala.inline
    def `ease-in-sine`: typingsSlinky.aos.aosStrings.`ease-in-sine` = "ease-in-sine".asInstanceOf[typingsSlinky.aos.aosStrings.`ease-in-sine`]
    
    @scala.inline
    def `ease-out`: typingsSlinky.aos.aosStrings.`ease-out` = "ease-out".asInstanceOf[typingsSlinky.aos.aosStrings.`ease-out`]
    
    @scala.inline
    def `ease-out-back`: typingsSlinky.aos.aosStrings.`ease-out-back` = "ease-out-back".asInstanceOf[typingsSlinky.aos.aosStrings.`ease-out-back`]
    
    @scala.inline
    def `ease-out-cubic`: typingsSlinky.aos.aosStrings.`ease-out-cubic` = "ease-out-cubic".asInstanceOf[typingsSlinky.aos.aosStrings.`ease-out-cubic`]
    
    @scala.inline
    def `ease-out-quad`: typingsSlinky.aos.aosStrings.`ease-out-quad` = "ease-out-quad".asInstanceOf[typingsSlinky.aos.aosStrings.`ease-out-quad`]
    
    @scala.inline
    def `ease-out-quart`: typingsSlinky.aos.aosStrings.`ease-out-quart` = "ease-out-quart".asInstanceOf[typingsSlinky.aos.aosStrings.`ease-out-quart`]
    
    @scala.inline
    def `ease-out-sine`: typingsSlinky.aos.aosStrings.`ease-out-sine` = "ease-out-sine".asInstanceOf[typingsSlinky.aos.aosStrings.`ease-out-sine`]
    
    @scala.inline
    def linear: typingsSlinky.aos.aosStrings.linear = "linear".asInstanceOf[typingsSlinky.aos.aosStrings.linear]
  }
  
  object global {
    
    @js.native
    trait Document extends StObject {
      
      def addEventListener(`type`: AosEventType, listener: js.Function1[/* event */ AosEvent, Unit]): Unit = js.native
      def addEventListener(`type`: AosEventType, listener: js.Function1[/* event */ AosEvent, Unit], options: Boolean): Unit = js.native
      def addEventListener(
        `type`: AosEventType,
        listener: js.Function1[/* event */ AosEvent, Unit],
        options: AddEventListenerOptions
      ): Unit = js.native
    }
  }
}
