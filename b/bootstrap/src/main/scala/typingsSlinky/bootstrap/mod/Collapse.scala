package typingsSlinky.bootstrap.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.bootstrap.anon.PartialOptionsParent
import typingsSlinky.bootstrap.collapseMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bootstrap", "Collapse")
@js.native
class Collapse protected () extends default {
  def this(element: Element) = this()
  def this(element: Element, options: PartialOptionsParent) = this()
}
/* static members */
@JSImport("bootstrap", "Collapse")
@js.native
object Collapse extends js.Object {
  
  /**
    * Static method which allows you to get the collapse instance associated
    * with a DOM element.
    */
  def getInstance(element: Element): typingsSlinky.bootstrap.collapseMod.Collapse = js.native
  def getInstance(element: Element, options: PartialOptionsParent): typingsSlinky.bootstrap.collapseMod.Collapse = js.native
  
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
