package typingsSlinky.ol

import org.scalajs.dom.raw.PointerEvent
import org.scalajs.dom.raw.UIEvent
import typingsSlinky.ol.pixelMod.Pixel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointerMod {
  
  @JSImport("ol/interaction/Pointer", JSImport.Default)
  @js.native
  class default () extends PointerInteraction {
    def this(opt_options: Options) = this()
  }
  
  @JSImport("ol/interaction/Pointer", "centroid")
  @js.native
  def centroid(pointerEvents: js.Array[PointerEvent]): Pixel = js.native
  
  @js.native
  trait Options extends StObject {
    
    var handleDownEvent: js.UndefOr[
        js.Function1[/* p0 */ typingsSlinky.ol.mapBrowserEventMod.default[UIEvent], Boolean]
      ] = js.native
    
    var handleDragEvent: js.UndefOr[
        js.Function1[/* p0 */ typingsSlinky.ol.mapBrowserEventMod.default[UIEvent], Unit]
      ] = js.native
    
    var handleEvent: js.UndefOr[
        js.Function1[/* p0 */ typingsSlinky.ol.mapBrowserEventMod.default[UIEvent], Boolean]
      ] = js.native
    
    var handleMoveEvent: js.UndefOr[
        js.Function1[/* p0 */ typingsSlinky.ol.mapBrowserEventMod.default[UIEvent], Unit]
      ] = js.native
    
    var handleUpEvent: js.UndefOr[
        js.Function1[/* p0 */ typingsSlinky.ol.mapBrowserEventMod.default[UIEvent], Boolean]
      ] = js.native
    
    var stopDown: js.UndefOr[js.Function1[/* p0 */ Boolean, Boolean]] = js.native
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
      def setHandleDownEvent(value: /* p0 */ typingsSlinky.ol.mapBrowserEventMod.default[UIEvent] => Boolean): Self = StObject.set(x, "handleDownEvent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleDownEventUndefined: Self = StObject.set(x, "handleDownEvent", js.undefined)
      
      @scala.inline
      def setHandleDragEvent(value: /* p0 */ typingsSlinky.ol.mapBrowserEventMod.default[UIEvent] => Unit): Self = StObject.set(x, "handleDragEvent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleDragEventUndefined: Self = StObject.set(x, "handleDragEvent", js.undefined)
      
      @scala.inline
      def setHandleEvent(value: /* p0 */ typingsSlinky.ol.mapBrowserEventMod.default[UIEvent] => Boolean): Self = StObject.set(x, "handleEvent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleEventUndefined: Self = StObject.set(x, "handleEvent", js.undefined)
      
      @scala.inline
      def setHandleMoveEvent(value: /* p0 */ typingsSlinky.ol.mapBrowserEventMod.default[UIEvent] => Unit): Self = StObject.set(x, "handleMoveEvent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleMoveEventUndefined: Self = StObject.set(x, "handleMoveEvent", js.undefined)
      
      @scala.inline
      def setHandleUpEvent(value: /* p0 */ typingsSlinky.ol.mapBrowserEventMod.default[UIEvent] => Boolean): Self = StObject.set(x, "handleUpEvent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleUpEventUndefined: Self = StObject.set(x, "handleUpEvent", js.undefined)
      
      @scala.inline
      def setStopDown(value: /* p0 */ Boolean => Boolean): Self = StObject.set(x, "stopDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStopDownUndefined: Self = StObject.set(x, "stopDown", js.undefined)
    }
  }
  
  @js.native
  trait PointerInteraction
    extends typingsSlinky.ol.interactionInteractionMod.default {
    
    /**
      * Returns the current number of pointers involved in the interaction,
      * e.g. 2 when two fingers are used.
      */
    def getPointerCount(): Double = js.native
    
    /**
      * Handle pointer down events.
      */
    /* protected */ def handleDownEvent(mapBrowserEvent: typingsSlinky.ol.mapBrowserEventMod.default[UIEvent]): Boolean = js.native
    
    /**
      * Handle pointer drag events.
      */
    /* protected */ def handleDragEvent(mapBrowserEvent: typingsSlinky.ol.mapBrowserEventMod.default[UIEvent]): Unit = js.native
    
    /**
      * Handle pointer move events.
      */
    /* protected */ def handleMoveEvent(mapBrowserEvent: typingsSlinky.ol.mapBrowserEventMod.default[UIEvent]): Unit = js.native
    
    /**
      * Handle pointer up events.
      */
    /* protected */ def handleUpEvent(mapBrowserEvent: typingsSlinky.ol.mapBrowserEventMod.default[UIEvent]): Boolean = js.native
    
    var handlingDownUpSequence: Boolean = js.native
    
    /**
      * This function is used to determine if "down" events should be propagated
      * to other interactions or should be stopped.
      */
    def stopDown(handled: Boolean): Boolean = js.native
    
    var targetPointers: js.Array[PointerEvent] = js.native
  }
}
