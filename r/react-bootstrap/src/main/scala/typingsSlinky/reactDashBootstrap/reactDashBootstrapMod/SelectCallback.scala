package typingsSlinky.reactDashBootstrap.reactDashBootstrapMod

import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import typingsSlinky.react.reactMod.EventHandler
import typingsSlinky.react.reactMod.MouseEvent
import typingsSlinky.react.reactMod.NativeMouseEvent
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
  def apply(eventKey: js.Any, e: SyntheticEvent[Event, js.Object]): Unit = js.native
}

