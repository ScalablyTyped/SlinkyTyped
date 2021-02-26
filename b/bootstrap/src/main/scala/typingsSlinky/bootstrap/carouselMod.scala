package typingsSlinky.bootstrap

import org.scalajs.dom.raw.Element
import typingsSlinky.bootstrap.anon.PartialOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object carouselMod {
  
  @JSImport("bootstrap/js/dist/carousel", JSImport.Default)
  @js.native
  class default protected () extends Carousel {
    def this(element: Element) = this()
    def this(element: Element, options: PartialOptions) = this()
  }
  object default {
    
    @JSImport("bootstrap/js/dist/carousel", "default.Events")
    @js.native
    object Events extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.bootstrap.carouselMod.Carousel.Events with String] = js.native
      
      /* "slid.bs.carousel" */ val slid: typingsSlinky.bootstrap.carouselMod.Carousel.Events.slid with String = js.native
      
      /* "slide.bs.carousel" */ val slide: typingsSlinky.bootstrap.carouselMod.Carousel.Events.slide with String = js.native
    }
    
    /**
      * Static method which allows you to get the carousel instance associated
      * with a DOM element.
      */
    /* static member */
    @JSImport("bootstrap/js/dist/carousel", "default.getInstance")
    @js.native
    def getInstance(element: Element): Carousel = js.native
    @JSImport("bootstrap/js/dist/carousel", "default.getInstance")
    @js.native
    def getInstance(element: Element, options: PartialOptions): Carousel = js.native
  }
  
  @js.native
  trait Carousel extends StObject {
    
    /**
      * Cycles through the carousel items from left to right.
      */
    def cycle(): Unit = js.native
    
    /**
      * Destroys an element's carousel.
      */
    def dispose(): Unit = js.native
    
    /**
      * Cycles to the next item. Returns to the caller before the next item has
      * been shown (e.g., before the slid.bs.carousel event occurs).
      */
    def next(): Unit = js.native
    
    /**
      * Cycles the carousel to a particular frame (0 based, similar to an array).
      * Returns to the caller before the target item has been shown (e.g., before
      * the slid.bs.carousel event occurs).
      */
    def nextWhenVisible(): Unit = js.native
    
    /**
      * Stops the carousel from cycling through items.
      */
    def pause(): Unit = js.native
    
    /**
      * Cycles to the previous item. Returns to the caller before the previous
      * item has been shown (e.g., before the slid.bs.carousel event occurs).
      */
    def prev(): Unit = js.native
  }
  object Carousel {
    
    @scala.inline
    def apply(
      cycle: () => Unit,
      dispose: () => Unit,
      next: () => Unit,
      nextWhenVisible: () => Unit,
      pause: () => Unit,
      prev: () => Unit
    ): Carousel = {
      val __obj = js.Dynamic.literal(cycle = js.Any.fromFunction0(cycle), dispose = js.Any.fromFunction0(dispose), next = js.Any.fromFunction0(next), nextWhenVisible = js.Any.fromFunction0(nextWhenVisible), pause = js.Any.fromFunction0(pause), prev = js.Any.fromFunction0(prev))
      __obj.asInstanceOf[Carousel]
    }
    
    @js.native
    sealed trait Events extends StObject
    @JSImport("bootstrap/js/dist/carousel", "Carousel.Events")
    @js.native
    object Events extends StObject {
      
      /**
        * Fired when the carousel has completed its slide transition.
        */
      @js.native
      sealed trait slid extends Events
      
      /**
        * Fires immediately when the slide instance method is invoked.
        */
      @js.native
      sealed trait slide extends Events
    }
    
    @scala.inline
    implicit class CarouselMutableBuilder[Self <: Carousel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCycle(value: () => Unit): Self = StObject.set(x, "cycle", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNext(value: () => Unit): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNextWhenVisible(value: () => Unit): Self = StObject.set(x, "nextWhenVisible", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPrev(value: () => Unit): Self = StObject.set(x, "prev", js.Any.fromFunction0(value))
    }
    
    @js.native
    trait Options extends StObject {
      
      /**
        * The amount of time to delay between automatically cycling an item. If
        * false, carousel will not automatically cycle.
        *
        * @default 5000
        */
      var interval: Double = js.native
      
      /**
        * Whether the carousel should react to keyboard events.
        *
        * @default true
        */
      var keyboard: Boolean = js.native
      
      /**
        * If set to "hover", pauses the cycling of the carousel on mouseenter and
        * resumes the cycling of the carousel on mouseleave. If set to false,
        * hovering over the carousel won't pause it. On touch-enabled devices, when
        * set to "hover", cycling will pause on touchend (once the user finished
        * interacting with the carousel) for two intervals, before automatically
        * resuming. Note that this is in addition to the above mouse behavior.
        *
        * @default "hover"
        */
      var pause: String | Boolean = js.native
      
      /**
        * Autoplays the carousel after the user manually cycles the first item. If
        * "carousel", autoplays the carousel on load.
        *
        * @default false
        */
      var slide: String | Boolean = js.native
      
      /**
        * Whether the carousel should support left/right swipe interactions on
        * touchscreen devices.
        *
        * @default true
        */
      var touch: Boolean = js.native
      
      /**
        * Whether the carousel should cycle continuously or have hard stops.
        *
        * @default true
        */
      var wrap: Boolean = js.native
    }
    object Options {
      
      @scala.inline
      def apply(
        interval: Double,
        keyboard: Boolean,
        pause: String | Boolean,
        slide: String | Boolean,
        touch: Boolean,
        wrap: Boolean
      ): Options = {
        val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], keyboard = keyboard.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], slide = slide.asInstanceOf[js.Any], touch = touch.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any])
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPause(value: String | Boolean): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSlide(value: String | Boolean): Self = StObject.set(x, "slide", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTouch(value: Boolean): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      }
    }
  }
}
