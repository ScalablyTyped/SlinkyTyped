package typingsSlinky.focusLock

import org.scalajs.dom.raw.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object solverMod {
  
  @JSImport("focus-lock/dist/es5/solver", "NEW_FOCUS")
  @js.native
  val NEW_FOCUS: /* "NEW_FOCUS" */ String = js.native
  
  @JSImport("focus-lock/dist/es5/solver", "newFocus")
  @js.native
  def newFocus(
    innerNodes: js.Array[HTMLInputElement],
    outerNodes: js.Array[HTMLInputElement],
    activeElement: HTMLInputElement
  ): js.UndefOr[Double | typingsSlinky.focusLock.focusLockStrings.NEW_FOCUS] = js.native
  @JSImport("focus-lock/dist/es5/solver", "newFocus")
  @js.native
  def newFocus(
    innerNodes: js.Array[HTMLInputElement],
    outerNodes: js.Array[HTMLInputElement],
    activeElement: HTMLInputElement,
    lastNode: HTMLInputElement
  ): js.UndefOr[Double | typingsSlinky.focusLock.focusLockStrings.NEW_FOCUS] = js.native
}
