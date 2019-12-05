package typingsSlinky.preact.preactMod

import typingsSlinky.std.Document
import typingsSlinky.std.DocumentFragment
import typingsSlinky.std.Element
import typingsSlinky.std.ShadowRoot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("preact", "hydrate")
@js.native
object hydrate extends js.Object {
  def apply(vnode: ComponentChild, parent: Document): Unit = js.native
  def apply(vnode: ComponentChild, parent: DocumentFragment): Unit = js.native
  def apply(vnode: ComponentChild, parent: Element): Unit = js.native
  def apply(vnode: ComponentChild, parent: ShadowRoot): Unit = js.native
}

