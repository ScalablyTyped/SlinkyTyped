package typingsSlinky.reactAriaLive

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-aria-live", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class LiveAnnouncer ()
    extends Component[js.Object, js.Object, js.Any] {
    def announceAssertive(message: String): Unit = js.native
    def announceAssertive(message: String, id: String): Unit = js.native
    def announcePolite(message: String): Unit = js.native
    def announcePolite(message: String, id: String): Unit = js.native
  }
  
  val LiveMessage: ReactComponentClass[AnonArialive] = js.native
  val LiveMessenger: ReactComponentClass[AnonChildren] = js.native
}

