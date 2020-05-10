package typingsSlinky.preact.mod

import org.scalajs.dom.raw.DocumentFragment
import org.scalajs.dom.raw.Element
import typingsSlinky.std.Document_
import typingsSlinky.std.ShadowRoot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("preact", "hydrate")
@js.native
object hydrate extends js.Object {
  def apply(vnode: ComponentChild, parent: DocumentFragment): Unit = js.native
  def apply(vnode: ComponentChild, parent: Document_): Unit = js.native
  def apply(vnode: ComponentChild, parent: Element): Unit = js.native
  def apply(vnode: ComponentChild, parent: ShadowRoot): Unit = js.native
}

