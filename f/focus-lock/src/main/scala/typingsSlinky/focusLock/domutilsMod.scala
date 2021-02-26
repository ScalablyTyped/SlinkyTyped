package typingsSlinky.focusLock

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import typingsSlinky.focusLock.tabOrderMod.NodeIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domutilsMod {
  
  @JSImport("focus-lock/dist/es5/utils/DOMutils", "filterFocusable")
  @js.native
  def filterFocusable(nodes: js.Array[HTMLInputElement]): js.Array[HTMLInputElement] = js.native
  
  @JSImport("focus-lock/dist/es5/utils/DOMutils", "getAllTabbableNodes")
  @js.native
  def getAllTabbableNodes(topNodes: js.Array[HTMLElement]): js.Array[NodeIndex] = js.native
  
  @JSImport("focus-lock/dist/es5/utils/DOMutils", "getTabbableNodes")
  @js.native
  def getTabbableNodes(topNodes: js.Array[HTMLElement]): js.Array[NodeIndex] = js.native
  @JSImport("focus-lock/dist/es5/utils/DOMutils", "getTabbableNodes")
  @js.native
  def getTabbableNodes(topNodes: js.Array[HTMLElement], withGuards: Boolean): js.Array[NodeIndex] = js.native
  
  @JSImport("focus-lock/dist/es5/utils/DOMutils", "parentAutofocusables")
  @js.native
  def parentAutofocusables(topNode: HTMLElement): js.Array[HTMLInputElement] = js.native
}
