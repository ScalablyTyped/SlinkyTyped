package typingsSlinky.popperjsCore

import org.scalajs.dom.raw.Element
import typingsSlinky.popperjsCore.typesMod.Rect
import typingsSlinky.popperjsCore.typesMod.VirtualElement
import typingsSlinky.popperjsCore.typesMod.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@popperjs/core/lib/dom-utils/getCompositeRect", JSImport.Namespace)
@js.native
object getCompositeRectMod extends js.Object {
  
  def default(elementOrVirtualElement: VirtualElement, offsetParent: Window): Rect = js.native
  def default(elementOrVirtualElement: VirtualElement, offsetParent: Window, isFixed: Boolean): Rect = js.native
  def default(elementOrVirtualElement: VirtualElement, offsetParent: Element): Rect = js.native
  def default(elementOrVirtualElement: VirtualElement, offsetParent: Element, isFixed: Boolean): Rect = js.native
  def default(elementOrVirtualElement: Element, offsetParent: Window): Rect = js.native
  def default(elementOrVirtualElement: Element, offsetParent: Window, isFixed: Boolean): Rect = js.native
  def default(elementOrVirtualElement: Element, offsetParent: Element): Rect = js.native
  def default(elementOrVirtualElement: Element, offsetParent: Element, isFixed: Boolean): Rect = js.native
}
