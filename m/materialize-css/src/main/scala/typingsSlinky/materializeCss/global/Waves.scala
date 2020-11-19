package typingsSlinky.materializeCss.global

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Waves")
@js.native
object Waves extends js.Object {
  
  /**
    * Attach Waves to an input element (or any element which doesn't
    * bubble mouseup/mousedown events).
    *   Intended to be used with dynamically loaded forms/inputs, or
    * where the user doesn't want a delegated click handler.
    */
  def attach(element: Element): Unit = js.native
}
