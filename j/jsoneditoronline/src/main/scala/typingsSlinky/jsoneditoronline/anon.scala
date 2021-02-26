package typingsSlinky.jsoneditoronline

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AddEventListener extends StObject {
    
    def addEventListener(
      element: HTMLElement,
      action: String,
      listener: js.Function1[/* event */ js.UndefOr[Event], Unit],
      useCapture: Boolean
    ): js.Function1[/* event */ js.UndefOr[Event], Unit] = js.native
    
    def preventDefault(event: Event): Unit = js.native
    
    def removeEventListener(
      element: HTMLElement,
      action: String,
      listener: js.Function1[/* event */ js.UndefOr[Event], Unit],
      useCapture: Boolean
    ): Unit = js.native
    
    def stopPropagation(event: Event): Unit = js.native
  }
  object AddEventListener {
    
    @scala.inline
    def apply(
      addEventListener: (HTMLElement, String, js.Function1[/* event */ js.UndefOr[Event], Unit], Boolean) => js.Function1[/* event */ js.UndefOr[Event], Unit],
      preventDefault: Event => Unit,
      removeEventListener: (HTMLElement, String, js.Function1[/* event */ js.UndefOr[Event], Unit], Boolean) => Unit,
      stopPropagation: Event => Unit
    ): AddEventListener = {
      val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction4(addEventListener), preventDefault = js.Any.fromFunction1(preventDefault), removeEventListener = js.Any.fromFunction4(removeEventListener), stopPropagation = js.Any.fromFunction1(stopPropagation))
      __obj.asInstanceOf[AddEventListener]
    }
    
    @scala.inline
    implicit class AddEventListenerMutableBuilder[Self <: AddEventListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddEventListener(
        value: (HTMLElement, String, js.Function1[/* event */ js.UndefOr[Event], Unit], Boolean) => js.Function1[/* event */ js.UndefOr[Event], Unit]
      ): Self = StObject.set(x, "addEventListener", js.Any.fromFunction4(value))
      
      @scala.inline
      def setPreventDefault(value: Event => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveEventListener(value: (HTMLElement, String, js.Function1[/* event */ js.UndefOr[Event], Unit], Boolean) => Unit): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction4(value))
      
      @scala.inline
      def setStopPropagation(value: Event => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction1(value))
    }
  }
}
