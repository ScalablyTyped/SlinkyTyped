package typingsSlinky.phosphorCollections.linkedlistMod.LinkedList

import typingsSlinky.phosphorAlgorithm.iterMod.IIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A forward iterator for nodes in a linked list.
  */
@JSImport("@phosphor/collections/lib/linkedlist", "LinkedList.ForwardNodeIterator")
@js.native
class ForwardNodeIterator[T] () extends IIterator[INode[T]] {
  /**
    * Construct a forward node iterator.
    *
    * @param node - The first node in the list.
    */
  def this(node: INode[T]) = this()
  var _node: js.Any = js.native
}

