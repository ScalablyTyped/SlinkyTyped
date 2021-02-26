package typingsSlinky.railsUjs

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object confirmMod {
  
  @JSImport("@rails/ujs/features/confirm", "confirm")
  @js.native
  def confirm(message: String): Boolean = js.native
  @JSImport("@rails/ujs/features/confirm", "confirm")
  @js.native
  def confirm(message: String, element: Element): Boolean = js.native
  
  @JSImport("@rails/ujs/features/confirm", "handleConfirm")
  @js.native
  def handleConfirm(e: Event): Unit = js.native
}
