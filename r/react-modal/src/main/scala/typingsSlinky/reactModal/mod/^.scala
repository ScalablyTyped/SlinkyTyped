package typingsSlinky.reactModal.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-modal", JSImport.Namespace)
@js.native
class ^ () extends ReactModal
@JSImport("react-modal", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /* Override base styles for all instances of this component. */
  var defaultStyles: Styles = js.native
  
  /**
    * Call this to properly hide your application from assistive screenreaders
    * and other assistive technologies while the modal is open.
    */
  def setAppElement(appElement: String): Unit = js.native
  def setAppElement(appElement: HTMLElement): Unit = js.native
}
