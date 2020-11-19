package typingsSlinky.reactBootstrap.mod

import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.EventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectCallback
  extends EventHandler[js.Any] {
  
  /**
    * @deprecated
    * This signature is a hack so can still derive from HTMLProps.
    * It does not reflect the underlying event and should not be used.
    */
  def apply(e: SyntheticMouseEvent[js.Object]): Unit = js.native
  def apply(eventKey: js.Any, e: SyntheticEvent[Event, js.Object]): Unit = js.native
}
