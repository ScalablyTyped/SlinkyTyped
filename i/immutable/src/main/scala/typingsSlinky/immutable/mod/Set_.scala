package typingsSlinky.immutable.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.immutable.Immutable.Collection.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Set_[T] extends Set[T] {
  
  // Persistent changes
  /**
    * Returns a new Set which also includes this value.
    *
    * Note: `add` can be used in `withMutations`.
    */
  def add(value: T): this.type = js.native
  
  /**
    * @see `Map#asImmutable`
    */
  def asImmutable(): this.type = js.native
  
  /**
    * Note: Not all methods can be used on a mutable collection or within
    * `withMutations`! Check the documentation for each method to see if it
    * mentions being safe to use in `withMutations`.
    *
    * @see `Map#asMutable`
    */
  def asMutable(): this.type = js.native
  
  /**
    * Returns a new Set containing no values.
    *
    * Note: `clear` can be used in `withMutations`.
    */
  def clear(): this.type = js.native
  
  /**
    * Returns a new Set which excludes this value.
    *
    * Note: `delete` can be used in `withMutations`.
    *
    * Note: `delete` **cannot** be safely used in IE8, use `remove` if
    * supporting old browsers.
    *
    * @alias remove
    */
  def delete(value: T): this.type = js.native
  
  /**
    * Returns a Set which has removed any values not also contained
    * within `collections`.
    *
    * Note: `intersect` can be used in `withMutations`.
    */
  def intersect(collections: js.Iterable[T]*): this.type = js.native
  
  def merge[C](collections: js.Iterable[C]*): typingsSlinky.immutable.Immutable.Set[T | C] = js.native
  
  def remove(value: T): this.type = js.native
  
  /**
    * The number of items in this Set.
    */
  val size: Double = js.native
  
  /**
    * Returns a Set excluding any values contained within `collections`.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { OrderedSet } = require('immutable')
    * OrderedSet([ 1, 2, 3 ]).subtract([1, 3])
    * // OrderedSet [2]
    * ```
    *
    * Note: `subtract` can be used in `withMutations`.
    */
  def subtract(collections: js.Iterable[T]*): this.type = js.native
  
  /**
    * Returns a Set including any value from `collections` that does not already
    * exist in this Set.
    *
    * Note: `union` can be used in `withMutations`.
    * @alias merge
    * @alias concat
    */
  def union[C](collections: js.Iterable[C]*): typingsSlinky.immutable.Immutable.Set[T | C] = js.native
  
  /**
    * @see `Map#wasAltered`
    */
  def wasAltered(): Boolean = js.native
  
  // Transient changes
  /**
    * Note: Not all methods can be used on a mutable collection or within
    * `withMutations`! Check the documentation for each method to see if it
    * mentions being safe to use in `withMutations`.
    *
    * @see `Map#withMutations`
    */
  def withMutations(mutator: js.Function1[/* mutable */ this.type, _]): this.type = js.native
}
@JSImport("immutable", "Set")
@js.native
object Set_ extends js.Object {
  
  def apply(): typingsSlinky.immutable.Immutable.Set[_] = js.native
  def apply[T](collection: js.Iterable[T]): typingsSlinky.immutable.Immutable.Set[T] = js.native
  
  def fromKeys(obj: StringDictionary[js.Any]): typingsSlinky.immutable.Immutable.Set[String] = js.native
  /**
    * `Set.fromKeys()` creates a new immutable Set containing the keys from
    * this Collection or JavaScript Object.
    */
  def fromKeys[T](iter: typingsSlinky.immutable.Immutable.Collection[T, _]): typingsSlinky.immutable.Immutable.Set[T] = js.native
  
  /**
    * `Set.intersect()` creates a new immutable Set that is the intersection of
    * a collection of other sets.
    *
    * ```js
    * const { Set } = require('immutable')
    * const intersected = Set.intersect([
    *   Set([ 'a', 'b', 'c' ])
    *   Set([ 'c', 'a', 't' ])
    * ])
    * // Set [ "a", "c"" ]
    * ```
    */
  def intersect[T](sets: js.Iterable[js.Iterable[T]]): typingsSlinky.immutable.Immutable.Set[T] = js.native
  
  /**
    * True if the provided value is a Set
    */
  def isSet(maybeSet: js.Any): /* is immutable.Immutable.Set<any> */ Boolean = js.native
  
  /**
    * Creates a new Set containing `values`.
    */
  def of[T](values: T*): typingsSlinky.immutable.Immutable.Set[T] = js.native
  
  /**
    * `Set.union()` creates a new immutable Set that is the union of a
    * collection of other sets.
    *
    * ```js
    * const { Set } = require('immutable')
    * const unioned = Set.union([
    *   Set([ 'a', 'b', 'c' ])
    *   Set([ 'c', 'a', 't' ])
    * ])
    * // Set [ "a", "b", "c", "t"" ]
    * ```
    */
  def union[T](sets: js.Iterable[js.Iterable[T]]): typingsSlinky.immutable.Immutable.Set[T] = js.native
}
