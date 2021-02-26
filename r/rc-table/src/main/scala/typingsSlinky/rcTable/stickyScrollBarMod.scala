package typingsSlinky.rcTable

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Window
import slinky.core.facade.ReactRef
import typingsSlinky.rcTable.anon.`0`
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stickyScrollBarMod extends Shortcut {
  
  @JSImport("rc-table/lib/stickyScrollBar", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[StickyScrollBarProps with RefAttributes[_]] = js.native
  
  @js.native
  trait StickyScrollBarProps extends StObject {
    
    var container: HTMLElement | Window = js.native
    
    var offsetScroll: Double = js.native
    
    def onScroll(params: `0`): Unit = js.native
    
    var scrollBodyRef: ReactRef[HTMLDivElement] = js.native
  }
  object StickyScrollBarProps {
    
    @scala.inline
    def apply(
      container: HTMLElement | Window,
      offsetScroll: Double,
      onScroll: `0` => Unit,
      scrollBodyRef: ReactRef[HTMLDivElement]
    ): StickyScrollBarProps = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], offsetScroll = offsetScroll.asInstanceOf[js.Any], onScroll = js.Any.fromFunction1(onScroll), scrollBodyRef = scrollBodyRef.asInstanceOf[js.Any])
      __obj.asInstanceOf[StickyScrollBarProps]
    }
    
    @scala.inline
    implicit class StickyScrollBarPropsMutableBuilder[Self <: StickyScrollBarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainer(value: HTMLElement | Window): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerHTMLElement(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerWindow(value: Window): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetScroll(value: Double): Self = StObject.set(x, "offsetScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnScroll(value: `0` => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setScrollBodyRef(value: ReactRef[HTMLDivElement]): Self = StObject.set(x, "scrollBodyRef", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ForwardRefExoticComponent[StickyScrollBarProps with RefAttributes[_]]
  
  /* This means you don't have to write `default`, but can instead just say `stickyScrollBarMod.foo` */
  override def _to: ForwardRefExoticComponent[StickyScrollBarProps with RefAttributes[_]] = default
}
