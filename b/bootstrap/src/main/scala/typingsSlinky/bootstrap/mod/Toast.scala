package typingsSlinky.bootstrap.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.bootstrap.toastMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bootstrap", "Toast")
@js.native
class Toast protected () extends default {
  def this(element: Element) = this()
}
/* static members */
@JSImport("bootstrap", "Toast")
@js.native
object Toast extends js.Object {
  
  /**
    * Static method which allows you to get the scrollspy instance associated
    * with a DOM element
    */
  def getInstance(element: Element): typingsSlinky.bootstrap.toastMod.Toast = js.native
  
  @js.native
  object Events extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.bootstrap.toastMod.Toast.Events with String] = js.native
    
    /* "hidden.bs.toast" */ val hidden: typingsSlinky.bootstrap.toastMod.Toast.Events.hidden with String = js.native
    
    /* "hide.bs.toast" */ val hide: typingsSlinky.bootstrap.toastMod.Toast.Events.hide with String = js.native
    
    /* "show.bs.toast" */ val show: typingsSlinky.bootstrap.toastMod.Toast.Events.show with String = js.native
    
    /* "shown.bs.toast" */ val shown: typingsSlinky.bootstrap.toastMod.Toast.Events.shown with String = js.native
  }
}
