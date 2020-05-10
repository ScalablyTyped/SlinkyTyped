package typingsSlinky.phosphorCollections.linkedlistMod.LinkedList

import typingsSlinky.phosphorAlgorithm.iterMod.IIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A reverse iterator for values in a linked list.
  */
@JSImport("@phosphor/collections/lib/linkedlist", "LinkedList.RetroValueIterator")
@js.native
class RetroValueIterator[T] () extends IIterator[T] {
  /**
    * Construct a retro value iterator.
    *
    * @param node - The last node in the list.
    */
  def this(node: INode[T]) = this()
  var _node: js.Any = js.native
}

