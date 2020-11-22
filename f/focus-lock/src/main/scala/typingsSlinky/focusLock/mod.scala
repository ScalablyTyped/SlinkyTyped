package typingsSlinky.focusLock

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import typingsSlinky.focusLock.anon.Node
import typingsSlinky.focusLock.focusablesMod.FocusableIn
import typingsSlinky.focusLock.siblingMod.FocusNextOptions
import typingsSlinky.focusLock.tabOrderMod.NodeIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("focus-lock", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def default(topNode: HTMLElement, lastNode: HTMLInputElement): Unit = js.native
  
  def focusInside(topNode: js.Array[HTMLElement]): Boolean = js.native
  def focusInside(topNode: HTMLElement): Boolean = js.native
  
  def focusIsHidden(): Boolean = js.native
  
  def focusMerge(topNode: js.Array[HTMLElement]): js.UndefOr[NodeIndex | Node] = js.native
  def focusMerge(topNode: js.Array[HTMLElement], lastNode: HTMLInputElement): js.UndefOr[NodeIndex | Node] = js.native
  def focusMerge(topNode: HTMLElement): js.UndefOr[NodeIndex | Node] = js.native
  def focusMerge(topNode: HTMLElement, lastNode: HTMLInputElement): js.UndefOr[NodeIndex | Node] = js.native
  
  def focusNextElement(baseElement: Element): Unit = js.native
  def focusNextElement(baseElement: Element, options: FocusNextOptions): Unit = js.native
  
  def focusPrevElement(baseElement: Element): Unit = js.native
  def focusPrevElement(baseElement: Element, options: FocusNextOptions): Unit = js.native
  
  def getAllAffectedNodes(node: js.Array[HTMLElement]): js.Array[HTMLInputElement] = js.native
  def getAllAffectedNodes(node: HTMLElement): js.Array[HTMLInputElement] = js.native
  
  def getFocusabledIn(topNode: HTMLElement): js.Array[FocusableIn] = js.native
  
  @js.native
  object constants extends js.Object {
    
    val FOCUS_ALLOW: /* "data-no-focus-lock" */ String = js.native
    
    val FOCUS_AUTO: /* "data-autofocus-inside" */ String = js.native
    
    val FOCUS_DISABLED: /* "data-focus-lock-disabled" */ String = js.native
    
    val FOCUS_GROUP: /* "data-focus-lock" */ String = js.native
  }
  
  @js.native
  object tabHook extends js.Object {
    
    def attach(): Unit = js.native
    
    def detach(): Unit = js.native
  }
}
