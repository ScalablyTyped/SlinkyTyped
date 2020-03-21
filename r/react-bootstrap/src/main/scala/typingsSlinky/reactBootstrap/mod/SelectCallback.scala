package typingsSlinky.reactBootstrap.mod

import slinky.core.SyntheticEvent
import typingsSlinky.react.mod.EventHandler
import typingsSlinky.react.mod.MouseEvent
import typingsSlinky.react.mod.NativeMouseEvent
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectCallback
  extends EventHandler[js.Any] {
  /**
    * @deprecated
    * This signature is a hack so can still derive from HTMLProps.
    * It does not reflect the underlying event and should not be used.
    */
  def apply(e: MouseEvent[js.Object, NativeMouseEvent]): Unit = js.native
  def apply(eventKey: js.Any, e: SyntheticEvent[Event_, js.Object]): Unit = js.native
}

