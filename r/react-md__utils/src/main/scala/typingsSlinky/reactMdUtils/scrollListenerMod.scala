package typingsSlinky.reactMdUtils

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.std.AddEventListenerOptions
import typingsSlinky.std.EventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollListenerMod {
  
  @JSImport("@react-md/utils/types/events/ScrollListener", "ScrollListener")
  @js.native
  def ScrollListener(props: ScrollListenerProps): Null = js.native
  
  /* Inlined std.Omit<@react-md/utils.@react-md/utils/types/events/useScrollListener.Options<std.HTMLElement>, 'enabled'> */
  @js.native
  trait ScrollListenerProps extends StObject {
    
    var element: js.UndefOr[HTMLElement | Null] = js.native
    
    var onScroll: EventListener = js.native
    
    var options: js.UndefOr[AddEventListenerOptions | Boolean] = js.native
  }
  object ScrollListenerProps {
    
    @scala.inline
    def apply(onScroll: /* evt */ Event => Unit): ScrollListenerProps = {
      val __obj = js.Dynamic.literal(onScroll = js.Any.fromFunction1(onScroll))
      __obj.asInstanceOf[ScrollListenerProps]
    }
    
    @scala.inline
    implicit class ScrollListenerPropsMutableBuilder[Self <: ScrollListenerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementNull: Self = StObject.set(x, "element", null)
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setOnScroll(value: /* evt */ Event => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOptions(value: AddEventListenerOptions | Boolean): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
}
