package typingsSlinky.luminoCollections

import typingsSlinky.luminoAlgorithm.iterMod.IterableOrArrayLike
import typingsSlinky.luminoCollections.linkedlistMod.LinkedList.INode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/collections", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class BPlusTree[T] protected ()
    extends typingsSlinky.luminoCollections.bplustreeMod.BPlusTree[T] {
    /**
      * Construct a new B+ tree.
      *
      * @param cmp - The item comparison function for the tree.
      */
    def this(cmp: js.Function2[/* a */ T, /* b */ T, Double]) = this()
  }
  @js.native
  object BPlusTree extends js.Object {
    
    /**
      * Create a new B+ tree populated with the given items.
      *
      * @param items - The items to add to the tree.
      *
      * @param cmp - The item comparison function for the tree.
      *
      * @returns A new B+ tree populated with the given items.
      *
      * #### Complexity
      * `O(n log32 n)`
      */
    def from[T](items: IterableOrArrayLike[T], cmp: js.Function2[/* a */ T, /* b */ T, Double]): typingsSlinky.luminoCollections.bplustreeMod.BPlusTree[T] = js.native
  }
  
  @js.native
  /**
    * Construct a new linked list.
    */
  class LinkedList[T] ()
    extends typingsSlinky.luminoCollections.linkedlistMod.LinkedList[T]
  @js.native
  object LinkedList extends js.Object {
    
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
    def from[T](values: IterableOrArrayLike[T]): typingsSlinky.luminoCollections.linkedlistMod.LinkedList[T] = js.native
    
    /**
      * A forward iterator for nodes in a linked list.
      */
    @js.native
    /**
      * Construct a forward node iterator.
      *
      * @param node - The first node in the list.
      */
    class ForwardNodeIterator[T] ()
      extends typingsSlinky.luminoCollections.linkedlistMod.LinkedList.ForwardNodeIterator[T] {
      def this(node: INode[T]) = this()
    }
    
    /**
      * A forward iterator for values in a linked list.
      */
    @js.native
    /**
      * Construct a forward value iterator.
      *
      * @param node - The first node in the list.
      */
    class ForwardValueIterator[T] ()
      extends typingsSlinky.luminoCollections.linkedlistMod.LinkedList.ForwardValueIterator[T] {
      def this(node: INode[T]) = this()
    }
    
    /**
      * A reverse iterator for nodes in a linked list.
      */
    @js.native
    /**
      * Construct a retro node iterator.
      *
      * @param node - The last node in the list.
      */
    class RetroNodeIterator[T] ()
      extends typingsSlinky.luminoCollections.linkedlistMod.LinkedList.RetroNodeIterator[T] {
      def this(node: INode[T]) = this()
    }
    
    /**
      * A reverse iterator for values in a linked list.
      */
    @js.native
    /**
      * Construct a retro value iterator.
      *
      * @param node - The last node in the list.
      */
    class RetroValueIterator[T] ()
      extends typingsSlinky.luminoCollections.linkedlistMod.LinkedList.RetroValueIterator[T] {
      def this(node: INode[T]) = this()
    }
  }
}
