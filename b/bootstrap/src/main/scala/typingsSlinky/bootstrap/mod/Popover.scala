package typingsSlinky.bootstrap.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.bootstrap.anon.PartialOptionsAnimation
import typingsSlinky.bootstrap.popoverMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bootstrap", "Popover")
@js.native
class Popover protected () extends default {
  def this(element: Element) = this()
  def this(element: Element, options: PartialOptionsAnimation) = this()
}
/* static members */
@JSImport("bootstrap", "Popover")
@js.native
object Popover extends js.Object {
  
  /**
    * Static method which allows you to get the popover instance associated
    * with a DOM element
    */
  def getInstance(element: Element): typingsSlinky.bootstrap.popoverMod.Popover = js.native
  def getInstance(element: Element, options: PartialOptionsAnimation): typingsSlinky.bootstrap.popoverMod.Popover = js.native
  
  @js.native
  object Events extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.bootstrap.popoverMod.Popover.Events with String] = js.native
    
    /* "hidden.bs.popover" */ val hidden: typingsSlinky.bootstrap.popoverMod.Popover.Events.hidden with String = js.native
    
    /* "hide.bs.popover" */ val hide: typingsSlinky.bootstrap.popoverMod.Popover.Events.hide with String = js.native
    
    /* "inserted.bs.popover" */ val inserted: typingsSlinky.bootstrap.popoverMod.Popover.Events.inserted with String = js.native
    
    /* "show.bs.popover" */ val show: typingsSlinky.bootstrap.popoverMod.Popover.Events.show with String = js.native
    
    /* "shown.bs.popover" */ val shown: typingsSlinky.bootstrap.popoverMod.Popover.Events.shown with String = js.native
  }
}
