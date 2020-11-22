package typingsSlinky.bootstrap.tabMod

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bootstrap/js/dist/tab", JSImport.Default)
@js.native
class default protected () extends Tab {
  def this(element: Element) = this()
}
/* static members */
@JSImport("bootstrap/js/dist/tab", JSImport.Default)
@js.native
object default extends js.Object {
  
  /**
    * Static method which allows you to get the tab instance associated with a
    * DOM element
    */
  def getInstance(element: Element): Tab = js.native
  
  @js.native
  object Events extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.bootstrap.tabMod.Tab.Events with String] = js.native
    
    /* "hidden.bs.tab" */ val hidden: typingsSlinky.bootstrap.tabMod.Tab.Events.hidden with String = js.native
    
    /* "hide.bs.tab" */ val hide: typingsSlinky.bootstrap.tabMod.Tab.Events.hide with String = js.native
    
    /* "show.bs.tab" */ val show: typingsSlinky.bootstrap.tabMod.Tab.Events.show with String = js.native
    
    /* "shown.bs.tab" */ val shown: typingsSlinky.bootstrap.tabMod.Tab.Events.shown with String = js.native
  }
}
