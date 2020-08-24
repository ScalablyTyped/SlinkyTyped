package typingsSlinky.knockout.mod.utils

import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("knockout", "utils.setDomNodeChildrenFromArrayMapping")
@js.native
object setDomNodeChildrenFromArrayMapping extends js.Object {
  def apply[T](domNode: Node, array: js.Array[T], mapping: MappingFunction[T]): Unit = js.native
  def apply[T](
    domNode: Node,
    array: js.Array[T],
    mapping: MappingFunction[T],
    options: js.UndefOr[scala.Nothing],
    callbackAfterAddingNodes: MappingAfterAddFunction[T]
  ): Unit = js.native
  def apply[T](domNode: Node, array: js.Array[T], mapping: MappingFunction[T], options: MappingOptions[T]): Unit = js.native
  def apply[T](
    domNode: Node,
    array: js.Array[T],
    mapping: MappingFunction[T],
    options: MappingOptions[T],
    callbackAfterAddingNodes: MappingAfterAddFunction[T]
  ): Unit = js.native
}

