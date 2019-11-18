package typingsSlinky.d3.d3Mod

import org.scalajs.dom.raw.EventTarget
import typingsSlinky.d3DashDispatch.d3DashDispatchMod.Dispatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "dispatch")
@js.native
object dispatch extends js.Object {
  def apply[T /* <: EventTarget */](types: String*): Dispatch[T] = js.native
}

