package typingsSlinky.reactDom.experimentalMod.reactDomAugmentingMod

import org.scalajs.dom.raw.Comment
import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.DocumentFragment
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-dom", "unstable_createRoot")
@js.native
object unstableCreateRoot extends js.Object {
  
  /**
    * Replaces `ReactDOM.render` when the `.render` method is called and enables Concurrent Mode.
    *
    * @see https://reactjs.org/docs/concurrent-mode-reference.html#createroot
    */
  def apply(container: Element | Document | DocumentFragment | Comment, options: js.UndefOr[RootOptions]): Root = js.native
}
