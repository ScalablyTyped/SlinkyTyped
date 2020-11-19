package typingsSlinky.immutable.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.immutable.Immutable.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderedSet[T] extends Set[T] {
  
  /**
    * Returns a new OrderedSet with only the values for which the `predicate`
    * function returns true.
    *
    * Note: `filter()` always returns a new instance, even if it results in
    * not filtering out any values.
    */
  @JSName("filter")
  def filter_F_T_OrderedSet[F /* <: T */](predicate: js.Function3[/* value */ T, /* key */ T, /* iter */ this.type, /* is F */ Boolean]): typingsSlinky.immutable.Immutable.OrderedSet[F] = js.native
  @JSName("filter")
  def filter_F_T_OrderedSet[F /* <: T */](
    predicate: js.Function3[/* value */ T, /* key */ T, /* iter */ this.type, /* is F */ Boolean],
    context: js.Any
  ): typingsSlinky.immutable.Immutable.OrderedSet[F] = js.native
  
  def zip(collections: (typingsSlinky.immutable.Immutable.Collection[_, _])*): typingsSlinky.immutable.Immutable.OrderedSet[_] = js.native
  /**
    * Returns an OrderedSet of the same type "zipped" with the provided
    * collections.
    *
    * Like `zipWith`, but using the default `zipper`: creating an `Array`.
    *
    * ```js
    * const a = OrderedSet([ 1, 2, 3 ])
    * const b = OrderedSet([ 4, 5, 6 ])
    * const c = a.zip(b)
    * // OrderedSet [ [ 1, 4 ], [ 2, 5 ], [ 3, 6 ] ]
    * ```
    */
  def zip[U](other: typingsSlinky.immutable.Immutable.Collection[_, U]): typingsSlinky.immutable.Immutable.OrderedSet[js.Tuple2[T, U]] = js.native
  def zip[U, V](
    other1: typingsSlinky.immutable.Immutable.Collection[_, U],
    other2: typingsSlinky.immutable.Immutable.Collection[_, V]
  ): typingsSlinky.immutable.Immutable.OrderedSet[js.Tuple3[T, U, V]] = js.native
  
  def zipAll(collections: (typingsSlinky.immutable.Immutable.Collection[_, _])*): typingsSlinky.immutable.Immutable.OrderedSet[_] = js.native
  /**
    * Returns a OrderedSet of the same type "zipped" with the provided
    * collections.
    *
    * Unlike `zip`, `zipAll` continues zipping until the longest collection is
    * exhausted. Missing values from shorter collections are filled with `undefined`.
    *
    * ```js
    * const a = OrderedSet([ 1, 2 ]);
    * const b = OrderedSet([ 3, 4, 5 ]);
    * const c = a.zipAll(b); // OrderedSet [ [ 1, 3 ], [ 2, 4 ], [ undefined, 5 ] ]
    * ```
    *
    * Note: Since zipAll will return a collection as large as the largest
    * input, some results may contain undefined values. TypeScript cannot
    * account for these without cases (as of v2.5).
    */
  def zipAll[U](other: typingsSlinky.immutable.Immutable.Collection[_, U]): typingsSlinky.immutable.Immutable.OrderedSet[js.Tuple2[T, U]] = js.native
  def zipAll[U, V](
    other1: typingsSlinky.immutable.Immutable.Collection[_, U],
    other2: typingsSlinky.immutable.Immutable.Collection[_, V]
  ): typingsSlinky.immutable.Immutable.OrderedSet[js.Tuple3[T, U, V]] = js.native
  
  def zipWith[Z](
    zipper: js.Function1[/* repeated */ js.Any, Z],
    collections: (typingsSlinky.immutable.Immutable.Collection[_, _])*
  ): typingsSlinky.immutable.Immutable.OrderedSet[Z] = js.native
  /**
    * Returns an OrderedSet of the same type "zipped" with the provided
    * collections by using a custom `zipper` function.
    *
    * @see Seq.Indexed.zipWith
    */
  def zipWith[U, Z](
    zipper: js.Function2[/* value */ T, /* otherValue */ U, Z],
    otherCollection: typingsSlinky.immutable.Immutable.Collection[_, U]
  ): typingsSlinky.immutable.Immutable.OrderedSet[Z] = js.native
  def zipWith[U, V, Z](
    zipper: js.Function3[/* value */ T, /* otherValue */ U, /* thirdValue */ V, Z],
    otherCollection: typingsSlinky.immutable.Immutable.Collection[_, U],
    thirdCollection: typingsSlinky.immutable.Immutable.Collection[_, V]
  ): typingsSlinky.immutable.Immutable.OrderedSet[Z] = js.native
}
@JSImport("immutable", "OrderedSet")
@js.native
object OrderedSet extends js.Object {
  
  def apply(): typingsSlinky.immutable.Immutable.OrderedSet[_] = js.native
  def apply[T](collection: js.Iterable[T]): typingsSlinky.immutable.Immutable.OrderedSet[T] = js.native
  
  def fromKeys(obj: StringDictionary[js.Any]): typingsSlinky.immutable.Immutable.OrderedSet[String] = js.native
  /**
    * `OrderedSet.fromKeys()` creates a new immutable OrderedSet containing
    * the keys from this Collection or JavaScript Object.
    */
  def fromKeys[T](iter: typingsSlinky.immutable.Immutable.Collection[T, _]): typingsSlinky.immutable.Immutable.OrderedSet[T] = js.native
  
  /**
    * True if the provided value is an OrderedSet.
    */
  def isOrderedSet(maybeOrderedSet: js.Any): Boolean = js.native
  
  /**
    * Creates a new OrderedSet containing `values`.
    */
  def of[T](values: T*): typingsSlinky.immutable.Immutable.OrderedSet[T] = js.native
}
