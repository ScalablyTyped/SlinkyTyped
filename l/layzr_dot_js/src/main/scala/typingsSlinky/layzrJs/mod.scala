package typingsSlinky.layzrJs

import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @param options Options
    */
  @JSImport("layzr.js", JSImport.Namespace)
  @js.native
  def apply(): LayzrInstance = js.native
  @JSImport("layzr.js", JSImport.Namespace)
  @js.native
  def apply(options: LayzrOptions): LayzrInstance = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.layzrJs.layzrJsStrings.srcColonbefore
    - typingsSlinky.layzrJs.layzrJsStrings.srcColonafter
  */
  trait LayzrEvents extends StObject
  object LayzrEvents {
    
    @scala.inline
    def srcColonafter: typingsSlinky.layzrJs.layzrJsStrings.srcColonafter = "src:after".asInstanceOf[typingsSlinky.layzrJs.layzrJsStrings.srcColonafter]
    
    @scala.inline
    def srcColonbefore: typingsSlinky.layzrJs.layzrJsStrings.srcColonbefore = "src:before".asInstanceOf[typingsSlinky.layzrJs.layzrJsStrings.srcColonbefore]
  }
  
  @js.native
  trait LayzrInstance extends StObject {
    
    /**
      * Manually check if elements are in the viewport. This method is called while the window is scrolled or resized.
      */
    def check(): LayzrInstance = js.native
    
    /**
      * Emit an event, firing all of its handlers.
      * @param name Event name
      * @param args Arguments that will be passed to each handler
      */
    def emit(name: LayzrEvents, args: js.Any*): LayzrInstance = js.native
    
    /**
      * Add or remove the scroll and resize event handlers.
      * @param flag
      */
    def handlers(flag: Boolean): LayzrInstance = js.native
    
    /**
      * Remove a specific handler from an event.
      * @param name Event name
      * @param handler Event handler
      */
    def off(name: LayzrEvents): LayzrInstance = js.native
    def off(name: LayzrEvents, handler: js.Function0[js.Object]): LayzrInstance = js.native
    
    /**
      * This event is emitted immediately before/after an image source is set. The image node is passed to the event handler.
      * @param name Event name
      * @param handler Event handler
      */
    def on(name: LayzrEvents, handler: js.Function1[/* element */ HTMLElement, Unit]): LayzrInstance = js.native
    
    /**
      * This event is emitted immediately before/after an image source is set. The image node is passed to the event handler. Fires once.
      * @param name Event name
      * @param handler Event handler
      */
    def once(name: LayzrEvents, handler: js.Function1[/* element */ HTMLElement, Unit]): LayzrInstance = js.native
    
    /**
      * Update the elements Layzr is checking.
      */
    def update(): LayzrInstance = js.native
  }
  
  @js.native
  trait LayzrOptions extends StObject {
    
    /**
      * Customize the attribute the normal resolution source is taken from.
      */
    var normal: js.UndefOr[String] = js.native
    
    /**
      * Customize the attribute the retina/high resolution source is taken from.
      */
    var retina: js.UndefOr[String] = js.native
    
    /**
      * Customize the attribute the source set is taken from.
      */
    var srcset: js.UndefOr[String] = js.native
    
    /**
      * Adjust when images load, relative to the viewport. Positive values make images load sooner, negative values make images load later.
      *
      * Threshold is a percentage of the viewport height, identical to the CSS vh unit.
      */
    var threshold: js.UndefOr[Double] = js.native
  }
  object LayzrOptions {
    
    @scala.inline
    def apply(): LayzrOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayzrOptions]
    }
    
    @scala.inline
    implicit class LayzrOptionsMutableBuilder[Self <: LayzrOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNormal(value: String): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalUndefined: Self = StObject.set(x, "normal", js.undefined)
      
      @scala.inline
      def setRetina(value: String): Self = StObject.set(x, "retina", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetinaUndefined: Self = StObject.set(x, "retina", js.undefined)
      
      @scala.inline
      def setSrcset(value: String): Self = StObject.set(x, "srcset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcsetUndefined: Self = StObject.set(x, "srcset", js.undefined)
      
      @scala.inline
      def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    }
  }
}
