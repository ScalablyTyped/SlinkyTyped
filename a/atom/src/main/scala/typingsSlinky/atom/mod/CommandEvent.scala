package typingsSlinky.atom.mod

import org.scalajs.dom.raw.EventTarget
import typingsSlinky.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandEvent[CurrentTarget /* <: EventTarget */]
  extends CustomEvent[js.Any] {
  
  def abortKeyBinding(): Unit = js.native
  
  @JSName("currentTarget")
  var currentTarget_CommandEvent: CurrentTarget = js.native
  
  var keyBindingAborted: Boolean = js.native
  
  var propagationStopped: Boolean = js.native
}
