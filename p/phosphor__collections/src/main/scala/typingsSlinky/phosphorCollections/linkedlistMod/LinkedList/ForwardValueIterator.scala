package typingsSlinky.phosphorCollections.linkedlistMod.LinkedList

import typingsSlinky.phosphorAlgorithm.iterMod.IIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A forward iterator for values in a linked list.
  */
@JSImport("@phosphor/collections/lib/linkedlist", "LinkedList.ForwardValueIterator")
@js.native
class ForwardValueIterator[T] () extends IIterator[T] {
  /**
    * Construct a forward value iterator.
    *
    * @param node - The first node in the list.
    */
  def this(node: INode[T]) = this()
  var _node: js.Any = js.native
}

