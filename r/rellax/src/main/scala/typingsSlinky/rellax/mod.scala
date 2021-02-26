package typingsSlinky.rellax

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.NodeListOf
import typingsSlinky.rellax.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("rellax", JSImport.Namespace)
  @js.native
  /**
    * Inits and starts the Parallax animations
    * @param el Single element or string with selector of elements
    * @param options Options
    */
  class ^ () extends RellaxInstance {
    def this(el: String) = this()
    def this(el: Element) = this()
    def this(el: js.UndefOr[scala.Nothing], options: RellaxOptions) = this()
    def this(el: String, options: RellaxOptions) = this()
    def this(el: Element, options: RellaxOptions) = this()
  }
  @JSImport("rellax", JSImport.Namespace)
  @js.native
  val ^ : Rellax = js.native
  
  @js.native
  trait Rellax
    extends /**
    * Inits and starts the Parallax animations
    * @param el Single element or string with selector of elements
    * @param options Options
    */
  Instantiable0[RellaxInstance]
       with Instantiable1[(/* el */ Element) | (/* el */ String), RellaxInstance]
       with Instantiable2[
          js.UndefOr[(/* el */ Element) | (/* el */ String)], 
          /* options */ RellaxOptions, 
          RellaxInstance
        ] {
    
    /**
      * Inits and starts the Parallax animations
      * @param el Single element or string with selector of elements
      * @param options Options
      */
    def apply(): RellaxInstance = js.native
    def apply(el: js.UndefOr[scala.Nothing], options: RellaxOptions): RellaxInstance = js.native
    def apply(el: String): RellaxInstance = js.native
    def apply(el: String, options: RellaxOptions): RellaxInstance = js.native
    def apply(el: Element): RellaxInstance = js.native
    def apply(el: Element, options: RellaxOptions): RellaxInstance = js.native
  }
  
  @js.native
  trait RellaxInstance extends StObject {
    
    /**
      * End Rellax and reset parallax elements to their original positions
      */
    def destroy(): Unit = js.native
    
    /**
      * Rellax elements
      */
    var elms: (NodeListOf[Element with Node]) | js.Array[Element] = js.native
    
    /**
      * Options
      */
    var options: RellaxOptions = js.native
    
    /**
      * Destroy and create again parallax with previous settings
      */
    def refresh(): Unit = js.native
  }
  object RellaxInstance {
    
    @scala.inline
    def apply(
      destroy: () => Unit,
      elms: (NodeListOf[Element with Node]) | js.Array[Element],
      options: RellaxOptions,
      refresh: () => Unit
    ): RellaxInstance = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), elms = elms.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], refresh = js.Any.fromFunction0(refresh))
      __obj.asInstanceOf[RellaxInstance]
    }
    
    @scala.inline
    implicit class RellaxInstanceMutableBuilder[Self <: RellaxInstance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setElms(value: (NodeListOf[Element with Node]) | js.Array[Element]): Self = StObject.set(x, "elms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElmsNodeListOf(value: NodeListOf[Element with Node]): Self = StObject.set(x, "elms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElmsVarargs(value: Element*): Self = StObject.set(x, "elms", js.Array(value :_*))
      
      @scala.inline
      def setOptions(value: RellaxOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefresh(value: () => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait RellaxOptions extends StObject {
    
    /**
      * Each breakpoint value represents the resolution for mobile, tablet, desktop respectively.
      */
    var breakpoints: js.UndefOr[js.Tuple3[Double, Double, Double]] = js.native
    
    /**
      * Will run on every animation event
      * @param positions Object with x and y positions of the rellax element
      */
    var callback: js.UndefOr[js.Function1[/* positions */ X, Unit]] = js.native
    
    /**
      * Enable the ability to center parallax elements in your viewport
      */
    var center: js.UndefOr[Boolean] = js.native
    
    /**
      * Enable horizontal parallax. This feature is intended for panoramic style websites, where users scroll horizontally instead of vertically
      */
    var horizontal: js.UndefOr[Boolean] = js.native
    
    /**
      * Do we want rellax element to be relative to the mentioned wrapper.
      */
    var relativeToWrapper: js.UndefOr[Boolean] = js.native
    
    /**
      * Allow decimal pixel values
      */
    var round: js.UndefOr[Boolean] = js.native
    
    /**
      * A negative value will make it move slower than regular scrolling, and a positive value will make it move faster
      */
    var speed: js.UndefOr[Double] = js.native
    
    /**
      * Enable vertical parallax
      */
    var vertical: js.UndefOr[Boolean] = js.native
    
    /**
      * By default, the position of parallax elements is determined via the scroll position of the body. Passing in the wrapper property will tell Rellax to watch that element instead
      */
    var wrapper: js.UndefOr[String | HTMLElement] = js.native
  }
  object RellaxOptions {
    
    @scala.inline
    def apply(): RellaxOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RellaxOptions]
    }
    
    @scala.inline
    implicit class RellaxOptionsMutableBuilder[Self <: RellaxOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBreakpoints(value: js.Tuple3[Double, Double, Double]): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreakpointsUndefined: Self = StObject.set(x, "breakpoints", js.undefined)
      
      @scala.inline
      def setCallback(value: /* positions */ X => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setCenter(value: Boolean): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      @scala.inline
      def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      @scala.inline
      def setRelativeToWrapper(value: Boolean): Self = StObject.set(x, "relativeToWrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeToWrapperUndefined: Self = StObject.set(x, "relativeToWrapper", js.undefined)
      
      @scala.inline
      def setRound(value: Boolean): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
      
      @scala.inline
      def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      
      @scala.inline
      def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
      
      @scala.inline
      def setWrapper(value: String | HTMLElement): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapperHTMLElement(value: HTMLElement): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
    }
  }
  
  type _To = Rellax
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Rellax = ^
}
