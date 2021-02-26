package typingsSlinky.luminoCollections

import typingsSlinky.luminoAlgorithm.iterMod.IIterable
import typingsSlinky.luminoAlgorithm.iterMod.IIterator
import typingsSlinky.luminoAlgorithm.iterMod.IterableOrArrayLike
import typingsSlinky.luminoAlgorithm.retroMod.IRetroable
import typingsSlinky.luminoCollections.linkedlistMod.LinkedList.INode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkedlistMod {
  
  @JSImport("@lumino/collections/types/linkedlist", "LinkedList")
  @js.native
  /**
    * Construct a new linked list.
    */
  class LinkedList[T] ()
    extends IIterable[T]
       with IRetroable[T] {
    
    var _first: js.Any = js.native
    
    var _last: js.Any = js.native
    
    var _size: js.Any = js.native
    
    /**
      * Add a value to the beginning of the list.
      *
      * @param value - The value to add to the beginning of the list.
      *
      * @returns The list node which holds the value.
      *
      * #### Complexity
      * Constant.
      */
    def addFirst(value: T): INode[T] = js.native
    
    /**
      * Add a value to the end of the list.
      *
      * @param value - The value to add to the end of the list.
      *
      * @returns The list node which holds the value.
      *
      * #### Complexity
      * Constant.
      */
    def addLast(value: T): INode[T] = js.native
    
    /**
      * Assign new values to the list, replacing all current values.
      *
      * @param values - The values to assign to the list.
      *
      * #### Complexity
      * Linear.
      */
    def assign(values: IterableOrArrayLike[T]): Unit = js.native
    
    /**
      * Remove all values from the list.
      *
      * #### Complexity
      * Linear.
      */
    def clear(): Unit = js.native
    
    /**
      * The first value in the list.
      *
      * This is `undefined` if the list is empty.
      *
      * #### Complexity
      * Constant.
      */
    val first: js.UndefOr[T] = js.native
    
    /**
      * The first node in the list.
      *
      * This is `null` if the list is empty.
      *
      * #### Complexity
      * Constant.
      */
    val firstNode: INode[T] | Null = js.native
    
    /**
      * Insert a value after a specific node in the list.
      *
      * @param value - The value to insert after the reference node.
      *
      * @param ref - The reference node of interest. If this is `null`,
      *   the value will be added to the end of the list.
      *
      * @returns The list node which holds the value.
      *
      * #### Notes
      * The reference node must be owned by the list.
      *
      * #### Complexity
      * Constant.
      */
    def insertAfter(value: T): INode[T] = js.native
    def insertAfter(value: T, ref: INode[T]): INode[T] = js.native
    
    /**
      * Insert a value before a specific node in the list.
      *
      * @param value - The value to insert before the reference node.
      *
      * @param ref - The reference node of interest. If this is `null`,
      *   the value will be added to the beginning of the list.
      *
      * @returns The list node which holds the value.
      *
      * #### Notes
      * The reference node must be owned by the list.
      *
      * #### Complexity
      * Constant.
      */
    def insertBefore(value: T): INode[T] = js.native
    def insertBefore(value: T, ref: INode[T]): INode[T] = js.native
    
    /**
      * Whether the list is empty.
      *
      * #### Complexity
      * Constant.
      */
    val isEmpty: Boolean = js.native
    
    /**
      * The last value in the list.
      *
      * This is `undefined` if the list is empty.
      *
      * #### Complexity
      * Constant.
      */
    val last: js.UndefOr[T] = js.native
    
    /**
      * The last node in the list.
      *
      * This is `null` if the list is empty.
      *
      * #### Complexity
      * Constant.
      */
    val lastNode: INode[T] | Null = js.native
    
    /**
      * The length of the list.
      *
      * #### Complexity
      * Constant.
      *
      * #### Notes
      * This is equivalent to `size`.
      *
      * This property is deprecated.
      */
    val length: Double = js.native
    
    /**
      * Create an iterator over the nodes in the list.
      *
      * @returns A new iterator starting with the first node.
      *
      * #### Complexity
      * Constant.
      */
    def nodes(): IIterator[INode[T]] = js.native
    
    /**
      * Remove and return the value at the end of the list.
      *
      * @returns The removed value, or `undefined` if the list is empty.
      *
      * #### Complexity
      * Constant.
      *
      * #### Notes
      * This is equivalent to `removeLast`.
      */
    def pop(): js.UndefOr[T] = js.native
    
    /**
      * Add a value to the end of the list.
      *
      * @param value - The value to add to the end of the list.
      *
      * #### Complexity
      * Constant.
      *
      * #### Notes
      * This is equivalent to `addLast`.
      */
    def push(value: T): Unit = js.native
    
    /**
      * Remove and return the value at the beginning of the list.
      *
      * @returns The removed value, or `undefined` if the list is empty.
      *
      * #### Complexity
      * Constant.
      */
    def removeFirst(): js.UndefOr[T] = js.native
    
    /**
      * Remove and return the value at the end of the list.
      *
      * @returns The removed value, or `undefined` if the list is empty.
      *
      * #### Complexity
      * Constant.
      */
    def removeLast(): js.UndefOr[T] = js.native
    
    /**
      * Remove a specific node from the list.
      *
      * @param node - The node to remove from the list.
      *
      * #### Complexity
      * Constant.
      *
      * #### Notes
      * The node must be owned by the list.
      */
    def removeNode(node: INode[T]): Unit = js.native
    
    /**
      * Create a reverse iterator over the nodes in the list.
      *
      * @returns A new iterator starting with the last node.
      *
      * #### Complexity
      * Constant.
      */
    def retroNodes(): IIterator[INode[T]] = js.native
    
    /**
      * Add a value to the beginning of the list.
      *
      * @param value - The value to add to the beginning of the list.
      *
      * #### Complexity
      * Constant.
      *
      * #### Notes
      * This is equivalent to `addFirst`.
      */
    def shift(value: T): Unit = js.native
    
    /**
      * The size of the list.
      *
      * #### Complexity
      * `O(1)`
      *
      * #### Notes
      * This is equivalent to `length`.
      */
    val size: Double = js.native
    
    /**
      * Remove and return the value at the beginning of the list.
      *
      * @returns The removed value, or `undefined` if the list is empty.
      *
      * #### Complexity
      * Constant.
      *
      * #### Notes
      * This is equivalent to `removeFirst`.
      */
    def unshift(): js.UndefOr[T] = js.native
  }
  object LinkedList {
    
    /**
      * A forward iterator for nodes in a linked list.
      */
    @JSImport("@lumino/collections/types/linkedlist", "LinkedList.ForwardNodeIterator")
    @js.native
    /**
      * Construct a forward node iterator.
      *
      * @param node - The first node in the list.
      */
    class ForwardNodeIterator[T] () extends IIterator[INode[T]] {
      def this(node: INode[T]) = this()
      
      var _node: js.Any = js.native
    }
    
    /**
      * A forward iterator for values in a linked list.
      */
    @JSImport("@lumino/collections/types/linkedlist", "LinkedList.ForwardValueIterator")
    @js.native
    /**
      * Construct a forward value iterator.
      *
      * @param node - The first node in the list.
      */
    class ForwardValueIterator[T] () extends IIterator[T] {
      def this(node: INode[T]) = this()
      
      var _node: js.Any = js.native
    }
    
    /**
      * A reverse iterator for nodes in a linked list.
      */
    @JSImport("@lumino/collections/types/linkedlist", "LinkedList.RetroNodeIterator")
    @js.native
    /**
      * Construct a retro node iterator.
      *
      * @param node - The last node in the list.
      */
    class RetroNodeIterator[T] () extends IIterator[INode[T]] {
      def this(node: INode[T]) = this()
      
      var _node: js.Any = js.native
    }
    
    /**
      * A reverse iterator for values in a linked list.
      */
    @JSImport("@lumino/collections/types/linkedlist", "LinkedList.RetroValueIterator")
    @js.native
    /**
      * Construct a retro value iterator.
      *
      * @param node - The last node in the list.
      */
    class RetroValueIterator[T] () extends IIterator[T] {
      def this(node: INode[T]) = this()
      
      var _node: js.Any = js.native
    }
    
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
    @JSImport("@lumino/collections/types/linkedlist", "LinkedList.from")
    @js.native
    def from[T](values: IterableOrArrayLike[T]): LinkedList[T] = js.native
    
    /**
      * An object which represents a node in a linked list.
      *
      * #### Notes
      * User code will not create linked list nodes directly. Nodes
      * are created automatically when values are added to a list.
      */
    @js.native
    trait INode[T] extends StObject {
      
      /**
        * The linked list which created and owns the node.
        *
        * This will be `null` when the node is removed from the list.
        */
      val list: LinkedList[T] | Null = js.native
      
      /**
        * The next node in the list.
        *
        * This will be `null` when the node is the last node in the list
        * or when the node is removed from the list.
        */
      val next: INode[T] | Null = js.native
      
      /**
        * The previous node in the list.
        *
        * This will be `null` when the node is the first node in the list
        * or when the node is removed from the list.
        */
      val prev: INode[T] | Null = js.native
      
      /**
        * The user value stored in the node.
        */
      val value: T = js.native
    }
    object INode {
      
      @scala.inline
      def apply[T](value: T): INode[T] = {
        val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[INode[T]]
      }
      
      @scala.inline
      implicit class INodeMutableBuilder[Self <: INode[_], T] (val x: Self with INode[T]) extends AnyVal {
        
        @scala.inline
        def setList(value: LinkedList[T]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setListNull: Self = StObject.set(x, "list", null)
        
        @scala.inline
        def setNext(value: INode[T]): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNextNull: Self = StObject.set(x, "next", null)
        
        @scala.inline
        def setPrev(value: INode[T]): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrevNull: Self = StObject.set(x, "prev", null)
        
        @scala.inline
        def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
  }
}
