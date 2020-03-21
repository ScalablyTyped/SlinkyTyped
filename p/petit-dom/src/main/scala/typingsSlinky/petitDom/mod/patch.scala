package typingsSlinky.petitDom.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.petitDom.mod.PetitDom.VNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "patch")
@js.native
object patch extends js.Object {
  def apply(newVNode: VNode, oldVNode: VNode): Element = js.native
  def apply(newVNode: VNode, oldVNode: VNode, parent: Element): Element = js.native
}

