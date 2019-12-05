package typingsSlinky.atom.atomMod

import org.scalajs.dom.raw.EventTarget
import typingsSlinky.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandEvent[CurrentTarget /* <: EventTarget */]
  extends CustomEvent[js.Any] {
  @JSName("currentTarget")
  var currentTarget_CommandEvent: CurrentTarget = js.native
  var keyBindingAborted: Boolean = js.native
  var propagationStopped: Boolean = js.native
  def abortKeyBinding(): Unit = js.native
}

