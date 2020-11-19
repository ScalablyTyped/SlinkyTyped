package typingsSlinky.luminoCollections.linkedlistMod.LinkedList

import typingsSlinky.luminoAlgorithm.iterMod.IterableOrArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/collections/types/linkedlist", "LinkedList.from")
@js.native
object from extends js.Object {
  
  /**
    * Create a linked list from an iterable of values.
    *
    * @param values - The iterable or array-like object of interest.
    *
    * @returns A new linked list initialized with the given values.
    *
    * #### Complexity
    * Linear.
    */
  def apply[T](values: IterableOrArrayLike[T]): typingsSlinky.luminoCollections.linkedlistMod.LinkedList[T] = js.native
}
