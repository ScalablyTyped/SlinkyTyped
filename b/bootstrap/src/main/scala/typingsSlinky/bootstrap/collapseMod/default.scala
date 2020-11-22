package typingsSlinky.bootstrap.collapseMod

import org.scalajs.dom.raw.Element
import typingsSlinky.bootstrap.anon.PartialOptionsParent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bootstrap/js/dist/collapse", JSImport.Default)
@js.native
class default protected () extends Collapse {
  def this(element: Element) = this()
  def this(element: Element, options: PartialOptionsParent) = this()
}
/* static members */
@JSImport("bootstrap/js/dist/collapse", JSImport.Default)
@js.native
object default extends js.Object {
  
  /**
    * Static method which allows you to get the collapse instance associated
    * with a DOM element.
    */
  def getInstance(element: Element): Collapse = js.native
  def getInstance(element: Element, options: PartialOptionsParent): Collapse = js.native
  
  @js.native
  object Events extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.bootstrap.collapseMod.Collapse.Events with String] = js.native
    
    /* "hidden.bs.collapse" */ val hidden: typingsSlinky.bootstrap.collapseMod.Collapse.Events.hidden with String = js.native
    
    /* "hide.bs.collapse" */ val hide: typingsSlinky.bootstrap.collapseMod.Collapse.Events.hide with String = js.native
    
    /* "show.bs.collapse" */ val show: typingsSlinky.bootstrap.collapseMod.Collapse.Events.show with String = js.native
    
    /* "shown.bs.collapse" */ val shown: typingsSlinky.bootstrap.collapseMod.Collapse.Events.shown with String = js.native
  }
}
