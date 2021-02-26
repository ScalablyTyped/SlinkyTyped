package typingsSlinky.reactMdUtils

import org.scalajs.dom.raw.Event
import typingsSlinky.std.AddEventListenerOptions
import typingsSlinky.std.EventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useResizeListenerMod {
  
  @JSImport("@react-md/utils/types/sizing/useResizeListener", "useResizeListener")
  @js.native
  def useResizeListener(hasOnResizeOptionsImmediateEnabled: ResizeListenerOptions): Unit = js.native
  
  @js.native
  trait ResizeListenerOptions extends StObject {
    
    /**
      * Boolean if the resize observer should be enabled. You can swap this boolean
      * to `true` or `false` to add/remove the event listeners. The event listeners
      * will *always* be removed when the parent component is unmounted though.
      */
    var enabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Boolean if the resize event handler should be called immediately once the
      * component is mounted. The default behavior will be to only call the
      * `onResize` event immediately client side and can never be invoked server
      * side since it resize on the `window` to dispatch a `UIEvent`.
      */
    var immediate: js.UndefOr[Boolean] = js.native
    
    /**
      * A function to call when the app is resized.
      */
    var onResize: EventListener = js.native
    
    /**
      * Any event listener options to use when attaching the event.
      */
    var options: js.UndefOr[Boolean | AddEventListenerOptions] = js.native
  }
  object ResizeListenerOptions {
    
    @scala.inline
    def apply(onResize: /* evt */ Event => Unit): ResizeListenerOptions = {
      val __obj = js.Dynamic.literal(onResize = js.Any.fromFunction1(onResize))
      __obj.asInstanceOf[ResizeListenerOptions]
    }
    
    @scala.inline
    implicit class ResizeListenerOptionsMutableBuilder[Self <: ResizeListenerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setImmediate(value: Boolean): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImmediateUndefined: Self = StObject.set(x, "immediate", js.undefined)
      
      @scala.inline
      def setOnResize(value: /* evt */ Event => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOptions(value: Boolean | AddEventListenerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
}
