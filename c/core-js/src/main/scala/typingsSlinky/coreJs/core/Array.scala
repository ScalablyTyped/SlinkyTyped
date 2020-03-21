package typingsSlinky.coreJs.core

import typingsSlinky.std.ArrayLike
import typingsSlinky.std.Iterable
import typingsSlinky.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("core.Array")
@js.native
object Array extends js.Object {
  def concat[T](array: ArrayLike[T], items: (typingsSlinky.coreJs.Array[T] | T)*): typingsSlinky.coreJs.Array[T] = js.native
  def copyWithin[T](array: ArrayLike[T], target: Double, start: Double): typingsSlinky.coreJs.Array[T] = js.native
  def copyWithin[T](array: ArrayLike[T], target: Double, start: Double, end: Double): typingsSlinky.coreJs.Array[T] = js.native
  def entries[T](array: ArrayLike[T]): IterableIterator[js.Tuple2[Double, T]] = js.native
  def every[T](
    array: ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typingsSlinky.coreJs.Array[T], Boolean]
  ): Boolean = js.native
  def every[T](
    array: ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typingsSlinky.coreJs.Array[T], Boolean],
    thisArg: js.Any
  ): Boolean = js.native
  def fill[T](array: ArrayLike[T], value: T): typingsSlinky.coreJs.Array[T] = js.native
  def fill[T](array: ArrayLike[T], value: T, start: Double): typingsSlinky.coreJs.Array[T] = js.native
  def fill[T](array: ArrayLike[T], value: T, start: Double, end: Double): typingsSlinky.coreJs.Array[T] = js.native
  def filter[T](
    array: ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typingsSlinky.coreJs.Array[T], Boolean]
  ): typingsSlinky.coreJs.Array[T] = js.native
  def filter[T](
    array: ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typingsSlinky.coreJs.Array[T], Boolean],
    thisArg: js.Any
  ): typingsSlinky.coreJs.Array[T] = js.native
  def find[T](
    array: ArrayLike[T],
    predicate: js.Function3[/* value */ T, /* index */ Double, /* obj */ typingsSlinky.coreJs.Array[T], Boolean]
  ): T = js.native
  def find[T](
    array: ArrayLike[T],
    predicate: js.Function3[/* value */ T, /* index */ Double, /* obj */ typingsSlinky.coreJs.Array[T], Boolean],
    thisArg: js.Any
  ): T = js.native
  def findIndex[T](array: ArrayLike[T], predicate: js.Function1[/* value */ T, Boolean]): Double = js.native
  def findIndex[T](array: ArrayLike[T], predicate: js.Function1[/* value */ T, Boolean], thisArg: js.Any): Double = js.native
  def forEach[T](
    array: ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typingsSlinky.coreJs.Array[T], Unit]
  ): Unit = js.native
  def forEach[T](
    array: ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typingsSlinky.coreJs.Array[T], Unit],
    thisArg: js.Any
  ): Unit = js.native
  def from[T](arrayLike: ArrayLike[T]): typingsSlinky.coreJs.Array[T] = js.native
  def from[T](arrayLike: Iterable[T]): typingsSlinky.coreJs.Array[T] = js.native
  def from[T, U](arrayLike: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U]): typingsSlinky.coreJs.Array[U] = js.native
  def from[T, U](arrayLike: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U], thisArg: js.Any): typingsSlinky.coreJs.Array[U] = js.native
  def from[T, U](arrayLike: Iterable[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U]): typingsSlinky.coreJs.Array[U] = js.native
  def from[T, U](arrayLike: Iterable[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U], thisArg: js.Any): typingsSlinky.coreJs.Array[U] = js.native
  def includes[T](array: ArrayLike[T], value: T): Boolean = js.native
  def includes[T](array: ArrayLike[T], value: T, fromIndex: Double): Boolean = js.native
  def indexOf[T](array: ArrayLike[T], searchElement: T): Double = js.native
  def indexOf[T](array: ArrayLike[T], searchElement: T, fromIndex: Double): Double = js.native
  def isArray(arg: js.Any): /* is core-js.Array<any> */ Boolean = js.native
  def join[T](array: ArrayLike[T]): java.lang.String = js.native
  def join[T](array: ArrayLike[T], separator: java.lang.String): java.lang.String = js.native
  def keys[T](array: ArrayLike[T]): IterableIterator[Double] = js.native
  def lastIndexOf[T](array: ArrayLike[T], earchElement: T): Double = js.native
  def lastIndexOf[T](array: ArrayLike[T], earchElement: T, fromIndex: Double): Double = js.native
  def map[T, U](
    array: ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typingsSlinky.coreJs.Array[T], U]
  ): typingsSlinky.coreJs.Array[U] = js.native
  def map[T, U](
    array: ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typingsSlinky.coreJs.Array[T], U],
    thisArg: js.Any
  ): typingsSlinky.coreJs.Array[U] = js.native
  def of[T](items: T*): typingsSlinky.coreJs.Array[T] = js.native
  def pop[T](array: ArrayLike[T]): T = js.native
  def push[T](array: ArrayLike[T], items: T*): Double = js.native
  def reduce[T](
    array: ArrayLike[T],
    callbackfn: js.Function4[
      /* previousValue */ T, 
      /* currentValue */ T, 
      /* currentIndex */ Double, 
      /* array */ typingsSlinky.coreJs.Array[T], 
      T
    ]
  ): T = js.native
  def reduce[T](
    array: ArrayLike[T],
    callbackfn: js.Function4[
      /* previousValue */ T, 
      /* currentValue */ T, 
      /* currentIndex */ Double, 
      /* array */ typingsSlinky.coreJs.Array[T], 
      T
    ],
    initialValue: T
  ): T = js.native
  def reduceRight[T](
    array: ArrayLike[T],
    callbackfn: js.Function4[
      /* previousValue */ T, 
      /* currentValue */ T, 
      /* currentIndex */ Double, 
      /* array */ typingsSlinky.coreJs.Array[T], 
      T
    ]
  ): T = js.native
  def reduceRight[T](
    array: ArrayLike[T],
    callbackfn: js.Function4[
      /* previousValue */ T, 
      /* currentValue */ T, 
      /* currentIndex */ Double, 
      /* array */ typingsSlinky.coreJs.Array[T], 
      T
    ],
    initialValue: T
  ): T = js.native
  @JSName("reduceRight")
  def reduceRight_TU_U[T, U](
    array: ArrayLike[T],
    callbackfn: js.Function4[
      /* previousValue */ U, 
      /* currentValue */ T, 
      /* currentIndex */ Double, 
      /* array */ typingsSlinky.coreJs.Array[T], 
      U
    ],
    initialValue: U
  ): U = js.native
  @JSName("reduce")
  def reduce_TU_U[T, U](
    array: ArrayLike[T],
    callbackfn: js.Function4[
      /* previousValue */ U, 
      /* currentValue */ T, 
      /* currentIndex */ Double, 
      /* array */ typingsSlinky.coreJs.Array[T], 
      U
    ],
    initialValue: U
  ): U = js.native
  def reverse[T](array: ArrayLike[T]): typingsSlinky.coreJs.Array[T] = js.native
  def shift[T](array: ArrayLike[T]): T = js.native
  def slice[T](array: ArrayLike[T]): typingsSlinky.coreJs.Array[T] = js.native
  def slice[T](array: ArrayLike[T], start: Double): typingsSlinky.coreJs.Array[T] = js.native
  def slice[T](array: ArrayLike[T], start: Double, end: Double): typingsSlinky.coreJs.Array[T] = js.native
  def some[T](
    array: ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typingsSlinky.coreJs.Array[T], Boolean]
  ): Boolean = js.native
  def some[T](
    array: ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typingsSlinky.coreJs.Array[T], Boolean],
    thisArg: js.Any
  ): Boolean = js.native
  def sort[T](array: ArrayLike[T]): typingsSlinky.coreJs.Array[T] = js.native
  def sort[T](array: ArrayLike[T], compareFn: js.Function2[/* a */ T, /* b */ T, Double]): typingsSlinky.coreJs.Array[T] = js.native
  def splice[T](array: ArrayLike[T], start: Double): typingsSlinky.coreJs.Array[T] = js.native
  def splice[T](array: ArrayLike[T], start: Double, deleteCount: Double, items: T*): typingsSlinky.coreJs.Array[T] = js.native
  def turn[T](
    array: ArrayLike[T],
    callbackfn: js.Function4[
      /* memo */ typingsSlinky.coreJs.Array[T], 
      /* value */ T, 
      /* index */ Double, 
      /* array */ typingsSlinky.coreJs.Array[T], 
      Unit
    ]
  ): typingsSlinky.coreJs.Array[T] = js.native
  def turn[T](
    array: ArrayLike[T],
    callbackfn: js.Function4[
      /* memo */ typingsSlinky.coreJs.Array[T], 
      /* value */ T, 
      /* index */ Double, 
      /* array */ typingsSlinky.coreJs.Array[T], 
      Unit
    ],
    memo: typingsSlinky.coreJs.Array[T]
  ): typingsSlinky.coreJs.Array[T] = js.native
  def turn[T, U](
    array: ArrayLike[T],
    callbackfn: js.Function4[
      /* memo */ U, 
      /* value */ T, 
      /* index */ Double, 
      /* array */ typingsSlinky.coreJs.Array[T], 
      Unit
    ],
    memo: U
  ): U = js.native
  @JSName("turn")
  def turn_TU_U[T, U](
    array: ArrayLike[T],
    callbackfn: js.Function4[
      /* memo */ U, 
      /* value */ T, 
      /* index */ Double, 
      /* array */ typingsSlinky.coreJs.Array[T], 
      Unit
    ]
  ): U = js.native
  def unshift[T](array: ArrayLike[T], items: T*): Double = js.native
  def values[T](array: ArrayLike[T]): IterableIterator[T] = js.native
}

