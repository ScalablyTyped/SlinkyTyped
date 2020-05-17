package typingsSlinky.androiduix.global.java_

import typingsSlinky.androiduix.java_.util.Comparator
import typingsSlinky.androiduix.java_.util.List
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("java.util")
@js.native
object util extends js.Object {
  @js.native
  class ArrayDeque[E] ()
    extends typingsSlinky.androiduix.java_.util.ArrayDeque[E]
  
  @js.native
  class ArrayList[T] ()
    extends typingsSlinky.androiduix.java_.util.ArrayList[T] {
    def this(initialCapacity: Double) = this()
  }
  
  @js.native
  class Arrays ()
    extends typingsSlinky.androiduix.java_.util.Arrays
  
  @js.native
  class Collections ()
    extends typingsSlinky.androiduix.java_.util.Collections
  
  /* static members */
  @js.native
  object Arrays extends js.Object {
    def asList[T](array: js.Array[T]): List[T] = js.native
    def equals(a: js.Array[_], a2: js.Array[_]): Boolean = js.native
    /* private */ def rangeCheck(arrayLength: js.Any, fromIndex: js.Any, toIndex: js.Any): js.Any = js.native
    def sort(a: js.Array[Double], fromIndex: Double, toIndex: Double): Unit = js.native
  }
  
  /* static members */
  @js.native
  object Collections extends js.Object {
    var EMPTY_LIST: js.Any = js.native
    def emptyList(): List[_] = js.native
    def sort[T](list: List[T]): Unit = js.native
    def sort[T](list: List[T], c: Comparator[T]): Unit = js.native
  }
  
}

