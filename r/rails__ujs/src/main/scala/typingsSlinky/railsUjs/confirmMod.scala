package typingsSlinky.railsUjs

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@rails/ujs/features/confirm", JSImport.Namespace)
@js.native
object confirmMod extends js.Object {
  
  def confirm(message: String): Boolean = js.native
  def confirm(message: String, element: Element): Boolean = js.native
  
  def handleConfirm(e: Event): Unit = js.native
}
