package typingsSlinky.phosphorCollections.linkedlistMod.LinkedList

import typingsSlinky.phosphorAlgorithm.iterMod.IIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A reverse iterator for nodes in a linked list.
  */
@JSImport("@phosphor/collections/lib/linkedlist", "LinkedList.RetroNodeIterator")
@js.native
class RetroNodeIterator[T] () extends IIterator[INode[T]] {
  /**
    * Construct a retro node iterator.
    *
    * @param node - The last node in the list.
    */
  def this(node: INode[T]) = this()
  var _node: js.Any = js.native
}

