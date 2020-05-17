package typingsSlinky.phosphorVirtualdom.mod

import typingsSlinky.phosphorVirtualdom.mod.h.Child
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.phosphorVirtualdom.mod.VirtualElement
  - typingsSlinky.phosphorVirtualdom.mod.VirtualText
*/
trait VirtualNode extends Child

object VirtualNode {
  @scala.inline
  implicit def apply(value: VirtualElement): VirtualNode = value.asInstanceOf[VirtualNode]
  @scala.inline
  implicit def apply(value: VirtualText): VirtualNode = value.asInstanceOf[VirtualNode]
}

