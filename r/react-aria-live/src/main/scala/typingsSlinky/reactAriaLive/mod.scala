package typingsSlinky.reactAriaLive

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.reactAriaLive.anon.Arialive
import typingsSlinky.reactAriaLive.anon.Children
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-aria-live", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val LiveMessage: ReactComponentClass[Arialive] = js.native
  
  val LiveMessenger: ReactComponentClass[Children] = js.native
  
  @js.native
  class LiveAnnouncer ()
    extends Component[js.Object, js.Object, js.Any] {
    
    def announceAssertive(message: String): Unit = js.native
    def announceAssertive(message: String, id: String): Unit = js.native
    
    def announcePolite(message: String): Unit = js.native
    def announcePolite(message: String, id: String): Unit = js.native
  }
}
