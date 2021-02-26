package typingsSlinky.denque

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("denque", JSImport.Namespace)
  @js.native
  class ^[T] () extends Denque[T] {
    def this(array: js.Array[T]) = this()
  }
  
  @js.native
  trait Denque[T] extends StObject {
    
    def clear(): Unit = js.native
    
    def get(index: Double): js.UndefOr[T] = js.native
    
    def isEmpty(): Boolean = js.native
    
    var length: Double = js.native
    
    def peekAt(index: Double): js.UndefOr[T] = js.native
    
    def peekBack(): js.UndefOr[T] = js.native
    
    def peekFront(): js.UndefOr[T] = js.native
    
    def pop(): js.UndefOr[T] = js.native
    
    def push(item: T): Double = js.native
    
    def remove(index: Double, count: Double): js.Array[T] = js.native
    
    def removeBack(): js.UndefOr[T] = js.native
    
    def removeOne(index: Double): js.UndefOr[T] = js.native
    
    def shift(): js.UndefOr[T] = js.native
    
    def splice(index: Double, count: Double, item: T*): js.UndefOr[js.Array[T]] = js.native
    
    def toArray(): js.Array[T] = js.native
    
    def unshift(item: T): Double = js.native
  }
  object Denque {
    
    @scala.inline
    def apply[T](
      clear: () => Unit,
      get: Double => js.UndefOr[T],
      isEmpty: () => Boolean,
      length: Double,
      peekAt: Double => js.UndefOr[T],
      peekBack: () => js.UndefOr[T],
      peekFront: () => js.UndefOr[T],
      pop: () => js.UndefOr[T],
      push: T => Double,
      remove: (Double, Double) => js.Array[T],
      removeBack: () => js.UndefOr[T],
      removeOne: Double => js.UndefOr[T],
      shift: () => js.UndefOr[T],
      splice: (Double, Double, /* repeated */ T) => js.UndefOr[js.Array[T]],
      toArray: () => js.Array[T],
      unshift: T => Double
    ): Denque[T] = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), get = js.Any.fromFunction1(get), isEmpty = js.Any.fromFunction0(isEmpty), length = length.asInstanceOf[js.Any], peekAt = js.Any.fromFunction1(peekAt), peekBack = js.Any.fromFunction0(peekBack), peekFront = js.Any.fromFunction0(peekFront), pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction1(push), remove = js.Any.fromFunction2(remove), removeBack = js.Any.fromFunction0(removeBack), removeOne = js.Any.fromFunction1(removeOne), shift = js.Any.fromFunction0(shift), splice = js.Any.fromFunction3(splice), toArray = js.Any.fromFunction0(toArray), unshift = js.Any.fromFunction1(unshift))
      __obj.asInstanceOf[Denque[T]]
    }
    
    @scala.inline
    implicit class DenqueMutableBuilder[Self <: Denque[_], T] (val x: Self with Denque[T]) extends AnyVal {
      
      @scala.inline
      def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGet(value: Double => js.UndefOr[T]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeekAt(value: Double => js.UndefOr[T]): Self = StObject.set(x, "peekAt", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPeekBack(value: () => js.UndefOr[T]): Self = StObject.set(x, "peekBack", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPeekFront(value: () => js.UndefOr[T]): Self = StObject.set(x, "peekFront", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPop(value: () => js.UndefOr[T]): Self = StObject.set(x, "pop", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPush(value: T => Double): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemove(value: (Double, Double) => js.Array[T]): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemoveBack(value: () => js.UndefOr[T]): Self = StObject.set(x, "removeBack", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemoveOne(value: Double => js.UndefOr[T]): Self = StObject.set(x, "removeOne", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShift(value: () => js.UndefOr[T]): Self = StObject.set(x, "shift", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSplice(value: (Double, Double, /* repeated */ T) => js.UndefOr[js.Array[T]]): Self = StObject.set(x, "splice", js.Any.fromFunction3(value))
      
      @scala.inline
      def setToArray(value: () => js.Array[T]): Self = StObject.set(x, "toArray", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUnshift(value: T => Double): Self = StObject.set(x, "unshift", js.Any.fromFunction1(value))
    }
  }
}
