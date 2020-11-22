package typingsSlinky.bootstrap.modalMod

import org.scalajs.dom.raw.Element
import typingsSlinky.bootstrap.anon.PartialOptionsBackdrop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bootstrap/js/dist/modal", JSImport.Default)
@js.native
class default protected () extends Modal {
  def this(element: Element) = this()
  def this(element: Element, options: PartialOptionsBackdrop) = this()
}
/* static members */
@JSImport("bootstrap/js/dist/modal", JSImport.Default)
@js.native
object default extends js.Object {
  
  /**
    * Static method which allows you to get the modal instance associated with
    * a DOM element
    */
  def getInstance(element: Element): Modal = js.native
  def getInstance(element: Element, options: PartialOptionsBackdrop): Modal = js.native
  
  @js.native
  object Events extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.bootstrap.modalMod.Modal.Events with String] = js.native
    
    /* "hidden.bs.modal" */ val hidden: typingsSlinky.bootstrap.modalMod.Modal.Events.hidden with String = js.native
    
    /* "hide.bs.modal" */ val hide: typingsSlinky.bootstrap.modalMod.Modal.Events.hide with String = js.native
    
    /* "hidePrevented.bs.modal" */ val hidePrevented: typingsSlinky.bootstrap.modalMod.Modal.Events.hidePrevented with String = js.native
    
    /* "show.bs.modal" */ val show: typingsSlinky.bootstrap.modalMod.Modal.Events.show with String = js.native
    
    /* "shown.bs.modal" */ val shown: typingsSlinky.bootstrap.modalMod.Modal.Events.shown with String = js.native
  }
}
