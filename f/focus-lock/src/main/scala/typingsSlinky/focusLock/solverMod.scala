package typingsSlinky.focusLock

import org.scalajs.dom.raw.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("focus-lock/dist/es5/solver", JSImport.Namespace)
@js.native
object solverMod extends js.Object {
  
  val NEW_FOCUS: /* "NEW_FOCUS" */ String = js.native
  
  def newFocus(
    innerNodes: js.Array[HTMLInputElement],
    outerNodes: js.Array[HTMLInputElement],
    activeElement: HTMLInputElement
  ): js.UndefOr[Double | typingsSlinky.focusLock.focusLockStrings.NEW_FOCUS] = js.native
  def newFocus(
    innerNodes: js.Array[HTMLInputElement],
    outerNodes: js.Array[HTMLInputElement],
    activeElement: HTMLInputElement,
    lastNode: HTMLInputElement
  ): js.UndefOr[Double | typingsSlinky.focusLock.focusLockStrings.NEW_FOCUS] = js.native
}
