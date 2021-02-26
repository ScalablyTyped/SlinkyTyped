package typingsSlinky.reactAriaLive

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.reactAriaLive.anon.Arialive
import typingsSlinky.reactAriaLive.anon.Children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-aria-live", "LiveAnnouncer")
  @js.native
  class LiveAnnouncer protected ()
    extends Component[js.Object, js.Object, js.Any] {
    def this(props: js.Object) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: js.Object, context: js.Any) = this()
    
    def announceAssertive(message: String): Unit = js.native
    def announceAssertive(message: String, id: String): Unit = js.native
    
    def announcePolite(message: String): Unit = js.native
    def announcePolite(message: String, id: String): Unit = js.native
  }
  
  @JSImport("react-aria-live", "LiveMessage")
  @js.native
  val LiveMessage: ReactComponentClass[Arialive] = js.native
  
  @JSImport("react-aria-live", "LiveMessenger")
  @js.native
  val LiveMessenger: ReactComponentClass[Children] = js.native
}
