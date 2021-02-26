package typingsSlinky.priorityqueuejs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("priorityqueuejs", JSImport.Namespace)
  @js.native
  /**
    * Initializes a new empty PriorityQueue wich uses .DEFAULT_COMPARATOR() as the comparator function for its elements.
    */
  class ^[T] () extends PriorityQueue[T] {
    /**
      * Initializes a new empty PriorityQueue with uses the given comparator(a, b) function as the comparator for its elements.
      * The comparator function must return a positive number when a > b, 0 when a == b and a negative number when a < b.
      */
    def this(comparator: Comparator[T]) = this()
  }
  @JSImport("priorityqueuejs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Compares two Number or String objects.
    */
  /* static member */
  @JSImport("priorityqueuejs", "DEFAULT_COMPARATOR")
  @js.native
  def DEFAULT_COMPARATOR: Comparator[Double | String] = js.native
  @scala.inline
  def DEFAULT_COMPARATOR_=(x: Comparator[Double | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_COMPARATOR")(x.asInstanceOf[js.Any])
  
  type Comparator[T] = js.Function2[/* a */ T, /* b */ T, Double]
  
  @js.native
  trait PriorityQueue[T] extends StObject {
    
    /**
      * Dequeues the top element of the priority queue.
      * Throws an Error when the queue is empty.
      */
    def deq(): T = js.native
    
    /**
      * Enqueues the element at the priority queue and returns its new size.
      * @param element The element to add
      */
    def enq(element: T): Double = js.native
    
    /**
      * Executes fn on each element.
      * Just be careful to not modify the priorities, since the queue won't reorder itself.
      * @param fn The value to pass to an Array.forEach call
      */
    def forEach(fn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Unit]): Unit = js.native
    
    /**
      * Returns whether the priority queue is empty or not.
      */
    def isEmpty(): Boolean = js.native
    
    /**
      * Peeks at the top element of the priority queue.
      * Throws an Error when the queue is empty.
      */
    def peek(): T = js.native
    
    /**
      * Returns the size of the priority queue.
      */
    def size(): Double = js.native
  }
  object PriorityQueue {
    
    @scala.inline
    def apply[T](
      deq: () => T,
      enq: T => Double,
      forEach: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Unit] => Unit,
      isEmpty: () => Boolean,
      peek: () => T,
      size: () => Double
    ): PriorityQueue[T] = {
      val __obj = js.Dynamic.literal(deq = js.Any.fromFunction0(deq), enq = js.Any.fromFunction1(enq), forEach = js.Any.fromFunction1(forEach), isEmpty = js.Any.fromFunction0(isEmpty), peek = js.Any.fromFunction0(peek), size = js.Any.fromFunction0(size))
      __obj.asInstanceOf[PriorityQueue[T]]
    }
    
    @scala.inline
    implicit class PriorityQueueMutableBuilder[Self <: PriorityQueue[_], T] (val x: Self with PriorityQueue[T]) extends AnyVal {
      
      @scala.inline
      def setDeq(value: () => T): Self = StObject.set(x, "deq", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEnq(value: T => Double): Self = StObject.set(x, "enq", js.Any.fromFunction1(value))
      
      @scala.inline
      def setForEach(value: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Unit] => Unit): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPeek(value: () => T): Self = StObject.set(x, "peek", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSize(value: () => Double): Self = StObject.set(x, "size", js.Any.fromFunction0(value))
    }
  }
}
