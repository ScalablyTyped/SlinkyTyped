package typingsSlinky.bootstrap.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.bootstrap.alertMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bootstrap", "Alert")
@js.native
class Alert protected () extends default {
  def this(element: Element) = this()
}
/* static members */
@JSImport("bootstrap", "Alert")
@js.native
object Alert extends js.Object {
  
  /**
    * Static method which allows you to get the alert instance associated to a
    * DOM element, you can use it like this: getInstance(alert)
    */
  def getInstance(element: Element): typingsSlinky.bootstrap.alertMod.Alert = js.native
  
  @js.native
  object Events extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.bootstrap.alertMod.Alert.Events with String] = js.native
    
    /* "close.bs.alert" */ val close: typingsSlinky.bootstrap.alertMod.Alert.Events.close with String = js.native
    
    /* "closed.bs.alert" */ val closed: typingsSlinky.bootstrap.alertMod.Alert.Events.closed with String = js.native
  }
}
