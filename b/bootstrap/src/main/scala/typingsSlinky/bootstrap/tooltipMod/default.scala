package typingsSlinky.bootstrap.tooltipMod

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bootstrap/js/dist/tooltip", JSImport.Default)
@js.native
class default protected () extends Tooltip {
  def this(element: Element) = this()
}
/* static members */
@JSImport("bootstrap/js/dist/tooltip", JSImport.Default)
@js.native
object default extends js.Object {
  
  /**
    * Static method which allows you to get the scrollspy instance associated
    * with a DOM element
    */
  def getInstance(element: Element): Tooltip = js.native
  
  @js.native
  object Events extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.bootstrap.tooltipMod.Tooltip.Events with String] = js.native
    
    /* "hidden.bs.tooltip" */ val hidden: typingsSlinky.bootstrap.tooltipMod.Tooltip.Events.hidden with String = js.native
    
    /* "hide.bs.tooltip" */ val hide: typingsSlinky.bootstrap.tooltipMod.Tooltip.Events.hide with String = js.native
    
    /* "inserted.bs.tooltip" */ val inserted: typingsSlinky.bootstrap.tooltipMod.Tooltip.Events.inserted with String = js.native
    
    /* "show.bs.tooltip" */ val show: typingsSlinky.bootstrap.tooltipMod.Tooltip.Events.show with String = js.native
    
    /* "shown.bs.tooltip" */ val shown: typingsSlinky.bootstrap.tooltipMod.Tooltip.Events.shown with String = js.native
  }
}
