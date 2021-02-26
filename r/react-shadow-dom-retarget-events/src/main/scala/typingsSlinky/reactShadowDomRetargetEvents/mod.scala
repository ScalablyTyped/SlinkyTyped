package typingsSlinky.reactShadowDomRetargetEvents

import typingsSlinky.std.ShadowRoot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Fixes events for react components rendered in a `shadow dom`.
    *
    * When you render a react component inside `shadow dom` events will not be dispatched to react. I.e. when a user clicks in your react component nothing happens. This happens (or does not happen)
    * with any events.
    *
    * A bug is filed at [#10422](https://github.com/facebook/react/issues/10422).
    */
  @JSImport("react-shadow-dom-retarget-events", JSImport.Namespace)
  @js.native
  def apply(shadowRoot: ShadowRoot): Unit = js.native
}
