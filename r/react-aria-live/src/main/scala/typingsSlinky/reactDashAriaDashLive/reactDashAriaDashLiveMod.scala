package typingsSlinky.reactDashAriaDashLive

import slinky.core.ReactComponentClass
import typingsSlinky.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-aria-live", JSImport.Namespace)
@js.native
object reactDashAriaDashLiveMod extends js.Object {
  @js.native
  class LiveAnnouncer ()
    extends Component[js.Object, js.Object, js.Any] {
    def announceAssertive(message: String): Unit = js.native
    def announceAssertive(message: String, id: String): Unit = js.native
    def announcePolite(message: String): Unit = js.native
    def announcePolite(message: String, id: String): Unit = js.native
  }
  
  val LiveMessage: ReactComponentClass[Anon_Arialive] = js.native
  val LiveMessenger: ReactComponentClass[Anon_Children] = js.native
}

