package typingsSlinky.flexslider

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.flexslider.flexsliderStrings.fade
import typingsSlinky.flexslider.flexsliderStrings.horizontal
import typingsSlinky.flexslider.flexsliderStrings.linear
import typingsSlinky.flexslider.flexsliderStrings.next
import typingsSlinky.flexslider.flexsliderStrings.prev
import typingsSlinky.flexslider.flexsliderStrings.slide
import typingsSlinky.flexslider.flexsliderStrings.swing
import typingsSlinky.flexslider.flexsliderStrings.thumbnails
import typingsSlinky.flexslider.flexsliderStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FlexSlider {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.flexslider.flexsliderStrings.play
    - typingsSlinky.flexslider.flexsliderStrings.pause
    - typingsSlinky.flexslider.flexsliderStrings.stop
    - typingsSlinky.flexslider.flexsliderStrings.next
    - typingsSlinky.flexslider.flexsliderStrings.prev
    - typingsSlinky.flexslider.flexsliderStrings.previous
  */
  trait HelperActions extends StObject
  object HelperActions {
    
    @scala.inline
    def next: typingsSlinky.flexslider.flexsliderStrings.next = "next".asInstanceOf[typingsSlinky.flexslider.flexsliderStrings.next]
    
    @scala.inline
    def pause: typingsSlinky.flexslider.flexsliderStrings.pause = "pause".asInstanceOf[typingsSlinky.flexslider.flexsliderStrings.pause]
    
    @scala.inline
    def play: typingsSlinky.flexslider.flexsliderStrings.play = "play".asInstanceOf[typingsSlinky.flexslider.flexsliderStrings.play]
    
    @scala.inline
    def prev: typingsSlinky.flexslider.flexsliderStrings.prev = "prev".asInstanceOf[typingsSlinky.flexslider.flexsliderStrings.prev]
    
    @scala.inline
    def previous: typingsSlinky.flexslider.flexsliderStrings.previous = "previous".asInstanceOf[typingsSlinky.flexslider.flexsliderStrings.previous]
    
    @scala.inline
    def stop: typingsSlinky.flexslider.flexsliderStrings.stop = "stop".asInstanceOf[typingsSlinky.flexslider.flexsliderStrings.stop]
  }
  
  @js.native
  trait Methods extends StObject {
    
    /**
      * Fires after a slide is added
      */
    var added: js.UndefOr[js.Function1[/* slider */ SliderObject, Unit]] = js.native
    
    /**
      * Fires after each slider animation completes
      */
    var after: js.UndefOr[js.Function1[/* slider */ SliderObject, Unit]] = js.native
    
    /**
      * Fires asynchronously with each slider animation
      */
    var before: js.UndefOr[js.Function1[/* slider */ SliderObject, Unit]] = js.native
    
    /**
      * Fires when the slider reaches the last slide (asynchronous)
      */
    var end: js.UndefOr[js.Function1[/* slider */ SliderObject, Unit]] = js.native
    
    /**
      * Fires after the slider is initially setup
      */
    var init: js.UndefOr[js.Function1[/* slider */ SliderObject, Unit]] = js.native
    
    /**
      * Fires after a slide is removed
      */
    var removed: js.UndefOr[js.Function1[/* slider */ SliderObject, Unit]] = js.native
    
    /**
      * Fires when the slider loads the first slide
      */
    var start: js.UndefOr[js.Function1[/* slider */ SliderObject, Unit]] = js.native
  }
  object Methods {
    
    @scala.inline
    def apply(): Methods = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Methods]
    }
    
    @scala.inline
    implicit class MethodsMutableBuilder[Self <: Methods] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdded(value: /* slider */ SliderObject => Unit): Self = StObject.set(x, "added", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddedUndefined: Self = StObject.set(x, "added", js.undefined)
      
      @scala.inline
      def setAfter(value: /* slider */ SliderObject => Unit): Self = StObject.set(x, "after", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      @scala.inline
      def setBefore(value: /* slider */ SliderObject => Unit): Self = StObject.set(x, "before", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      @scala.inline
      def setEnd(value: /* slider */ SliderObject => Unit): Self = StObject.set(x, "end", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setInit(value: /* slider */ SliderObject => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      @scala.inline
      def setRemoved(value: /* slider */ SliderObject => Unit): Self = StObject.set(x, "removed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemovedUndefined: Self = StObject.set(x, "removed", js.undefined)
      
      @scala.inline
      def setStart(value: /* slider */ SliderObject => Unit): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Whether or not to allow a slider comprised of a single slide
      * @default true
      */
    var allowOneSlide: js.UndefOr[Boolean] = js.native
    
    /**
      * Select your animation type, "fade" or "slide"
      * @default fade
      */
    var animation: js.UndefOr[fade | slide] = js.native
    
    /**
      * Should the animation loop? If false, directionNav will received "disable"
      * classes at either end
      * @default true
      */
    var animationLoop: js.UndefOr[Boolean] = js.native
    
    /**
      * Set the speed of animations, in milliseconds
      * @default 600
      * @since v1.9
      */
    var animationSpeed: js.UndefOr[Double] = js.native
    
    /**
      * Internal property exposed for turning the slider into a
      * thumbnail navigation for another slider
      */
    var asNavFor: js.UndefOr[String] = js.native
    
    // Primary Controls
    /**
      * Create navigation for paging control of each slide? Note: Leave true for
      * manualControls usage
      * @default true
      */
    var controlNav: js.UndefOr[thumbnails | Boolean] = js.native
    
    // Special properties
    /**
      * Declare which container the navigation elements should be appended too.
      * Default container is the FlexSlider element. Example use would be
      * $(".flexslider-container"). Property is ignored if given element is not
      * found.
      */
    var controlsContainer: js.UndefOr[JQuery] = js.native
    
    /**
      * Custom prev / next button. Must be two jQuery elements. In order to make
      * the events work they have to have the classes "prev" and "next" (plus
      * namespace)
      */
    var customDirectionNav: js.UndefOr[JQuery] = js.native
    
    /**
      * Select the sliding direction, "horizontal" or "vertical"
      * @default horizontal
      * @since v1.9
      */
    var direction: js.UndefOr[horizontal | vertical] = js.native
    
    /**
      * Create navigation for previous/next navigation? (true/false)
      * @default true
      */
    var directionNav: js.UndefOr[Boolean] = js.native
    
    /**
      * Determines the easing method used in jQuery transitions. jQuery easing
      * plugin is supported!
      * @default swing
      */
    var easing: js.UndefOr[swing | linear | String] = js.native
    
    /**
      * Fade in the first slide when animation type is "fade"
      * @default true
      */
    var fadeFirstSlide: js.UndefOr[Boolean] = js.native
    
    /**
      * Set an initialization delay, in milliseconds
      * @default 0
      */
    var initDelay: js.UndefOr[Double] = js.native
    
    // Browser Specific
    /**
      * Set to true when Firefox is the browser used.
      * @default false
      */
    var isFirefox: js.UndefOr[Boolean] = js.native
    
    /**
      * Margin between carousel items.
      * @default 0
      */
    var itemMargin: js.UndefOr[Double] = js.native
    
    // Carousel Options
    /**
      * Box-model width of individual carousel items, including
      * horizontal borders and padding.
      * @default 0
      */
    var itemWidth: js.UndefOr[Double] = js.native
    
    // Secondary Navigation
    /**
      * Allow slider navigating via keyboard left/right keys
      * @default true
      * @since v1.9
      */
    var keyboard: js.UndefOr[Boolean] = js.native
    
    /**
      * Declare custom control navigation. Examples would be $(".flex-control-nav
      * li") or "#tabs-nav li img", etc. The number of elements in your
      * controlNav should match the number of slides/tabs.
      */
    var manualControls: js.UndefOr[JQuery] = js.native
    
    /**
      * Maxmimum number of carousel items that should be visible.
      * Items will resize fluidly when above this limit.
      * @default 0
      */
    var maxItems: js.UndefOr[Double] = js.native
    
    /**
      * Minimum number of carousel items that should be visible.
      * Items will resize fluidly when below this.
      * @default 1
      */
    var minItems: js.UndefOr[Double] = js.native
    
    /**
      * Requires jquery.mousewheel.js
      * (https://github.com/brandonaaron/jquery-mousewheel) - Allows slider
      * navigating via mousewheel
      * @default false
      */
    var mousewheel: js.UndefOr[Boolean] = js.native
    
    /**
      * Number of carousel items that should move on animation. If
      * 0, slider will move all visible items.
      * @default 0
      */
    var move: js.UndefOr[Double] = js.native
    
    /**
      * Allow keyboard navigation to affect multiple sliders. Default behavior
      * cuts out keyboard navigation with more than one slider present.
      * @default false
      */
    var multipleKeyboard: js.UndefOr[Boolean] = js.native
    
    /**
      * Prefix string attached to the class of every element generated by the
      * plugin
      */
    var namespace: js.UndefOr[String] = js.native
    
    /**
      * Set the text for the "next" directionNav item
      * @default Next
      */
    var nextText: js.UndefOr[String] = js.native
    
    /**
      * Pause the slideshow when tab is invisible, resume when visible. Provides
      * better UX, lower CPU usage.
      * @default true
      */
    var pauseInvisible: js.UndefOr[Boolean] = js.native
    
    // Usability features
    /**
      * Pause the slideshow when interacting with control elements, highly
      * recommended.
      * @default true
      */
    var pauseOnAction: js.UndefOr[Boolean] = js.native
    
    /**
      * Pause the slideshow when hovering over slider, then resume when no longer
      * hovering
      * @default false
      */
    var pauseOnHover: js.UndefOr[Boolean] = js.native
    
    /**
      * Create pause/play dynamic element
      * @default false
      */
    var pausePlay: js.UndefOr[Boolean] = js.native
    
    /**
      * Set the text for the "pause" pausePlay item
      * @default Pause
      */
    var pauseText: js.UndefOr[String] = js.native
    
    /**
      * Set the text for the "play" pausePlay item
      * @default Play
      */
    var playText: js.UndefOr[String] = js.native
    
    /**
      * Set the text for the "previous" directionNav item
      * @default Previous
      */
    var prevText: js.UndefOr[String] = js.native
    
    /**
      * Randomize slide order
      * @default false
      */
    var randomize: js.UndefOr[Boolean] = js.native
    
    /**
      * Reverse the animation direction
      * @default false
      */
    var reverse: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether or not to enable RTL mode
      * @default false
      */
    var rtl: js.UndefOr[Boolean] = js.native
    
    /**
      * Must match a simple pattern. '{container} > {slide}' -- Ignore pattern at
      * your own peril
      */
    var selector: js.UndefOr[String] = js.native
    
    /**
      * Animate slider automatically
      * @default true
      */
    var slideshow: js.UndefOr[Boolean] = js.native
    
    /**
      * Set the speed of the slideshow cycling, in milliseconds
      * @default 7000
      */
    var slideshowSpeed: js.UndefOr[Double] = js.native
    
    /**
      * Allow height of the slider to animate smoothly in horizontal mode
      * @default false
      */
    var smoothHeight: js.UndefOr[Boolean] = js.native
    
    /**
      * The slide that the slider should start on. Array notation (0 = first
      * slide)
      * @default 0
      * @since v1.9
      */
    var startAt: js.UndefOr[Double] = js.native
    
    /**
      * Mirror the actions performed on this slider with another
      * slider. Use with care.
      */
    var sync: js.UndefOr[String] = js.native
    
    /**
      * Whether or not to put captions on thumbnails when using the "thumbnails"
      * controlNav.
      * @default false
      */
    var thumbCaptions: js.UndefOr[Boolean] = js.native
    
    /**
      * Allow touch swipe navigation of the slider on touch-enabled devices
      * @default true
      */
    var touch: js.UndefOr[Boolean] = js.native
    
    /**
      * Slider will use CSS3 transitions if available
      * @default true
      */
    var useCSS: js.UndefOr[Boolean] = js.native
    
    /**
      * If using video in the slider, will prevent CSS3 3D Transforms to avoid
      * graphical glitches
      * @default false
      */
    var video: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowOneSlide(value: Boolean): Self = StObject.set(x, "allowOneSlide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowOneSlideUndefined: Self = StObject.set(x, "allowOneSlide", js.undefined)
      
      @scala.inline
      def setAnimation(value: fade | slide): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationLoop(value: Boolean): Self = StObject.set(x, "animationLoop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationLoopUndefined: Self = StObject.set(x, "animationLoop", js.undefined)
      
      @scala.inline
      def setAnimationSpeed(value: Double): Self = StObject.set(x, "animationSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationSpeedUndefined: Self = StObject.set(x, "animationSpeed", js.undefined)
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setAsNavFor(value: String): Self = StObject.set(x, "asNavFor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsNavForUndefined: Self = StObject.set(x, "asNavFor", js.undefined)
      
      @scala.inline
      def setControlNav(value: thumbnails | Boolean): Self = StObject.set(x, "controlNav", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlNavUndefined: Self = StObject.set(x, "controlNav", js.undefined)
      
      @scala.inline
      def setControlsContainer(value: JQuery): Self = StObject.set(x, "controlsContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlsContainerUndefined: Self = StObject.set(x, "controlsContainer", js.undefined)
      
      @scala.inline
      def setCustomDirectionNav(value: JQuery): Self = StObject.set(x, "customDirectionNav", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomDirectionNavUndefined: Self = StObject.set(x, "customDirectionNav", js.undefined)
      
      @scala.inline
      def setDirection(value: horizontal | vertical): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionNav(value: Boolean): Self = StObject.set(x, "directionNav", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionNavUndefined: Self = StObject.set(x, "directionNav", js.undefined)
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setEasing(value: swing | linear | String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      @scala.inline
      def setFadeFirstSlide(value: Boolean): Self = StObject.set(x, "fadeFirstSlide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFadeFirstSlideUndefined: Self = StObject.set(x, "fadeFirstSlide", js.undefined)
      
      @scala.inline
      def setInitDelay(value: Double): Self = StObject.set(x, "initDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitDelayUndefined: Self = StObject.set(x, "initDelay", js.undefined)
      
      @scala.inline
      def setIsFirefox(value: Boolean): Self = StObject.set(x, "isFirefox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFirefoxUndefined: Self = StObject.set(x, "isFirefox", js.undefined)
      
      @scala.inline
      def setItemMargin(value: Double): Self = StObject.set(x, "itemMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemMarginUndefined: Self = StObject.set(x, "itemMargin", js.undefined)
      
      @scala.inline
      def setItemWidth(value: Double): Self = StObject.set(x, "itemWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemWidthUndefined: Self = StObject.set(x, "itemWidth", js.undefined)
      
      @scala.inline
      def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
      
      @scala.inline
      def setManualControls(value: JQuery): Self = StObject.set(x, "manualControls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManualControlsUndefined: Self = StObject.set(x, "manualControls", js.undefined)
      
      @scala.inline
      def setMaxItems(value: Double): Self = StObject.set(x, "maxItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxItemsUndefined: Self = StObject.set(x, "maxItems", js.undefined)
      
      @scala.inline
      def setMinItems(value: Double): Self = StObject.set(x, "minItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinItemsUndefined: Self = StObject.set(x, "minItems", js.undefined)
      
      @scala.inline
      def setMousewheel(value: Boolean): Self = StObject.set(x, "mousewheel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMousewheelUndefined: Self = StObject.set(x, "mousewheel", js.undefined)
      
      @scala.inline
      def setMove(value: Double): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoveUndefined: Self = StObject.set(x, "move", js.undefined)
      
      @scala.inline
      def setMultipleKeyboard(value: Boolean): Self = StObject.set(x, "multipleKeyboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleKeyboardUndefined: Self = StObject.set(x, "multipleKeyboard", js.undefined)
      
      @scala.inline
      def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      @scala.inline
      def setNextText(value: String): Self = StObject.set(x, "nextText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTextUndefined: Self = StObject.set(x, "nextText", js.undefined)
      
      @scala.inline
      def setPauseInvisible(value: Boolean): Self = StObject.set(x, "pauseInvisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPauseInvisibleUndefined: Self = StObject.set(x, "pauseInvisible", js.undefined)
      
      @scala.inline
      def setPauseOnAction(value: Boolean): Self = StObject.set(x, "pauseOnAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPauseOnActionUndefined: Self = StObject.set(x, "pauseOnAction", js.undefined)
      
      @scala.inline
      def setPauseOnHover(value: Boolean): Self = StObject.set(x, "pauseOnHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPauseOnHoverUndefined: Self = StObject.set(x, "pauseOnHover", js.undefined)
      
      @scala.inline
      def setPausePlay(value: Boolean): Self = StObject.set(x, "pausePlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPausePlayUndefined: Self = StObject.set(x, "pausePlay", js.undefined)
      
      @scala.inline
      def setPauseText(value: String): Self = StObject.set(x, "pauseText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPauseTextUndefined: Self = StObject.set(x, "pauseText", js.undefined)
      
      @scala.inline
      def setPlayText(value: String): Self = StObject.set(x, "playText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlayTextUndefined: Self = StObject.set(x, "playText", js.undefined)
      
      @scala.inline
      def setPrevText(value: String): Self = StObject.set(x, "prevText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevTextUndefined: Self = StObject.set(x, "prevText", js.undefined)
      
      @scala.inline
      def setRandomize(value: Boolean): Self = StObject.set(x, "randomize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRandomizeUndefined: Self = StObject.set(x, "randomize", js.undefined)
      
      @scala.inline
      def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      @scala.inline
      def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      @scala.inline
      def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
      
      @scala.inline
      def setSlideshow(value: Boolean): Self = StObject.set(x, "slideshow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlideshowSpeed(value: Double): Self = StObject.set(x, "slideshowSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlideshowSpeedUndefined: Self = StObject.set(x, "slideshowSpeed", js.undefined)
      
      @scala.inline
      def setSlideshowUndefined: Self = StObject.set(x, "slideshow", js.undefined)
      
      @scala.inline
      def setSmoothHeight(value: Boolean): Self = StObject.set(x, "smoothHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmoothHeightUndefined: Self = StObject.set(x, "smoothHeight", js.undefined)
      
      @scala.inline
      def setStartAt(value: Double): Self = StObject.set(x, "startAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartAtUndefined: Self = StObject.set(x, "startAt", js.undefined)
      
      @scala.inline
      def setSync(value: String): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
      
      @scala.inline
      def setThumbCaptions(value: Boolean): Self = StObject.set(x, "thumbCaptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbCaptionsUndefined: Self = StObject.set(x, "thumbCaptions", js.undefined)
      
      @scala.inline
      def setTouch(value: Boolean): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchUndefined: Self = StObject.set(x, "touch", js.undefined)
      
      @scala.inline
      def setUseCSS(value: Boolean): Self = StObject.set(x, "useCSS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseCSSUndefined: Self = StObject.set(x, "useCSS", js.undefined)
      
      @scala.inline
      def setVideo(value: Boolean): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
    }
  }
  
  @js.native
  trait SliderObject extends /* index */ NumberDictionary[JQuery] {
    
    /**
      * is slider animating?
      */
    var animating: Boolean = js.native
    
    /**
      * Useful in .before(), the slide currently animating to
      */
    var animatingTo: Double = js.native
    
    /**
      * is the slider at either end?
      */
    var atEnd: Boolean = js.native
    
    /**
      * returns boolean if slider can advance
      */
    def canAdvance(target: js.Any): Boolean = js.native
    def canAdvance(target: js.Any, fromNav: Boolean): Boolean = js.native
    
    /**
      * The ul.slides within the slider
      */
    var container: JQuery = js.native
    
    /**
      * The slider controlNav
      */
    var controlNav: JQuery = js.native
    
    /**
      * The controlsContainer element of the slider
      */
    var controlsContainer: JQuery = js.native
    
    /**
      * The total number of slides in the slider
      */
    var count: Double = js.native
    
    /**
      * The slide currently being shown
      */
    var currentSlide: Double = js.native
    
    /**
      * The slider directionNav
      */
    var directionNav: JQuery = js.native
    
    /**
      * Move slider
      */
    def flexAnimate(target: js.Any): js.Any = js.native
    def flexAnimate(
      target: js.Any,
      pause: js.UndefOr[scala.Nothing],
      `override`: js.UndefOr[scala.Nothing],
      withSync: js.UndefOr[scala.Nothing],
      fromNav: Boolean
    ): js.Any = js.native
    def flexAnimate(
      target: js.Any,
      pause: js.UndefOr[scala.Nothing],
      `override`: js.UndefOr[scala.Nothing],
      withSync: Boolean
    ): js.Any = js.native
    def flexAnimate(
      target: js.Any,
      pause: js.UndefOr[scala.Nothing],
      `override`: js.UndefOr[scala.Nothing],
      withSync: Boolean,
      fromNav: Boolean
    ): js.Any = js.native
    def flexAnimate(target: js.Any, pause: js.UndefOr[scala.Nothing], `override`: Boolean): js.Any = js.native
    def flexAnimate(
      target: js.Any,
      pause: js.UndefOr[scala.Nothing],
      `override`: Boolean,
      withSync: js.UndefOr[scala.Nothing],
      fromNav: Boolean
    ): js.Any = js.native
    def flexAnimate(target: js.Any, pause: js.UndefOr[scala.Nothing], `override`: Boolean, withSync: Boolean): js.Any = js.native
    def flexAnimate(
      target: js.Any,
      pause: js.UndefOr[scala.Nothing],
      `override`: Boolean,
      withSync: Boolean,
      fromNav: Boolean
    ): js.Any = js.native
    def flexAnimate(target: js.Any, pause: Boolean): js.Any = js.native
    def flexAnimate(
      target: js.Any,
      pause: Boolean,
      `override`: js.UndefOr[scala.Nothing],
      withSync: js.UndefOr[scala.Nothing],
      fromNav: Boolean
    ): js.Any = js.native
    def flexAnimate(target: js.Any, pause: Boolean, `override`: js.UndefOr[scala.Nothing], withSync: Boolean): js.Any = js.native
    def flexAnimate(
      target: js.Any,
      pause: Boolean,
      `override`: js.UndefOr[scala.Nothing],
      withSync: Boolean,
      fromNav: Boolean
    ): js.Any = js.native
    def flexAnimate(target: js.Any, pause: Boolean, `override`: Boolean): js.Any = js.native
    def flexAnimate(
      target: js.Any,
      pause: Boolean,
      `override`: Boolean,
      withSync: js.UndefOr[scala.Nothing],
      fromNav: Boolean
    ): js.Any = js.native
    def flexAnimate(target: js.Any, pause: Boolean, `override`: Boolean, withSync: Boolean): js.Any = js.native
    def flexAnimate(target: js.Any, pause: Boolean, `override`: Boolean, withSync: Boolean, fromNav: Boolean): js.Any = js.native
    
    /**
      * get target given a direction
      */
    @JSName("getTarget")
    def getTarget_next(dir: next): js.Any = js.native
    @JSName("getTarget")
    def getTarget_prev(dir: prev): js.Any = js.native
    
    var length: Double = js.native
    
    /**
      * The manualControls element of the slider
      */
    var manualControls: JQuery = js.native
    
    /**
      * force slider to stay paused during pauseOnHover event
      */
    var manualPause: Boolean = js.native
    
    /**
      * Pause slider slideshow interval
      */
    def pause(): js.Any = js.native
    
    /**
      * Play slider slideshow interval
      */
    def play(): Unit = js.native
    
    /**
      * Resume slider slideshow interval
      */
    def resume(): js.Any = js.native
    
    /**
      * The slides of the slider
      */
    var slides: JQuery = js.native
  }
}
