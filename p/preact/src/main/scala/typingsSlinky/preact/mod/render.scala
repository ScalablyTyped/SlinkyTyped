package typingsSlinky.preact.mod

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.DocumentFragment
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Text
import typingsSlinky.std.ShadowRoot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("preact", "render")
@js.native
object render extends js.Object {
  
  def apply(vnode: ComponentChild, parent: Document): Unit = js.native
  def apply(vnode: ComponentChild, parent: DocumentFragment): Unit = js.native
  def apply(vnode: ComponentChild, parent: DocumentFragment, replaceNode: Element): Unit = js.native
  def apply(vnode: ComponentChild, parent: DocumentFragment, replaceNode: Text): Unit = js.native
  def apply(vnode: ComponentChild, parent: Document, replaceNode: Element): Unit = js.native
  def apply(vnode: ComponentChild, parent: Document, replaceNode: Text): Unit = js.native
  //
  // Preact render
  // -----------------------------------
  def apply(vnode: ComponentChild, parent: Element): Unit = js.native
  def apply(vnode: ComponentChild, parent: Element, replaceNode: Element): Unit = js.native
  def apply(vnode: ComponentChild, parent: Element, replaceNode: Text): Unit = js.native
  def apply(vnode: ComponentChild, parent: ShadowRoot): Unit = js.native
  def apply(vnode: ComponentChild, parent: ShadowRoot, replaceNode: Element): Unit = js.native
  def apply(vnode: ComponentChild, parent: ShadowRoot, replaceNode: Text): Unit = js.native
}
