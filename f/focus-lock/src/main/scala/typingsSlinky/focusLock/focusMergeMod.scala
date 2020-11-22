package typingsSlinky.focusLock

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import typingsSlinky.focusLock.anon.Node
import typingsSlinky.focusLock.tabOrderMod.NodeIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("focus-lock/dist/es5/focusMerge", JSImport.Namespace)
@js.native
object focusMergeMod extends js.Object {
  
  def getFocusMerge(topNode: js.Array[HTMLElement]): js.UndefOr[NodeIndex | Node] = js.native
  def getFocusMerge(topNode: js.Array[HTMLElement], lastNode: HTMLInputElement): js.UndefOr[NodeIndex | Node] = js.native
  def getFocusMerge(topNode: HTMLElement): js.UndefOr[NodeIndex | Node] = js.native
  def getFocusMerge(topNode: HTMLElement, lastNode: HTMLInputElement): js.UndefOr[NodeIndex | Node] = js.native
}
