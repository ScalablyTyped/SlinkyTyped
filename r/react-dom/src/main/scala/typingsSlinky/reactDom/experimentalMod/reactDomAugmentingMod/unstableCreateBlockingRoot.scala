package typingsSlinky.reactDom.experimentalMod.reactDomAugmentingMod

import org.scalajs.dom.raw.Comment
import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.DocumentFragment
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-dom", "unstable_createBlockingRoot")
@js.native
object unstableCreateBlockingRoot extends js.Object {
  
  /**
    * Replaces `ReactDOM.render` when the `.render` method is called and enables Blocking Mode.
    *
    * Opting into Concurrent Mode introduces semantic changes to how React works.
    * This means that you can’t use Concurrent Mode in just a few components.
    * Because of this, some apps may not be able to migrate directly to Concurrent Mode.
    * Blocking Mode only contains a small subset of Concurrent Mode features and is intended
    * as an intermediary migration step for apps that are unable to migrate directly.
    *
    * @see https://reactjs.org/docs/concurrent-mode-adoption.html#migration-step-blocking-mode
    * @see https://reactjs.org/docs/concurrent-mode-reference.html#createblockingroot
    */
  def apply(container: Element | Document | DocumentFragment | Comment, options: js.UndefOr[RootOptions]): Root = js.native
}
