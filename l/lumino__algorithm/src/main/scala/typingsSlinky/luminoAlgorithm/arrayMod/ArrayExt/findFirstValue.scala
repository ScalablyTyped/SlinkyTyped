package typingsSlinky.luminoAlgorithm.arrayMod.ArrayExt

import typingsSlinky.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/algorithm/types/array", "ArrayExt.findFirstValue")
@js.native
object findFirstValue extends js.Object {
  
  /**
    * Find the first value which matches a predicate.
    *
    * @param array - The array-like object to search.
    *
    * @param fn - The predicate function to apply to the values.
    *
    * @param start - The index of the first element in the range to be
    *   searched, inclusive. The default value is `0`. Negative values
    *   are taken as an offset from the end of the array.
    *
    * @param stop - The index of the last element in the range to be
    *   searched, inclusive. The default value is `-1`. Negative values
    *   are taken as an offset from the end of the array.
    *
    * @returns The first matching value, or `undefined` if no matching
    *   value is found.
    *
    * #### Notes
    * If `stop < start` the search will wrap at the end of the array.
    *
    * #### Complexity
    * Linear.
    *
    * #### Undefined Behavior
    * A `start` or `stop` which is non-integral.
    *
    * Modifying the length of the array while searching.
    *
    * #### Example
    * ```typescript
    * import { ArrayExt } from '@lumino/algorithm';
    *
    * function isEven(value: number): boolean {
    *   return value % 2 === 0;
    * }
    *
    * let data = [1, 2, 3, 4, 3, 2, 1];
    * ArrayExt.findFirstValue(data, isEven);       // 2
    * ArrayExt.findFirstValue(data, isEven, 2);    // 4
    * ArrayExt.findFirstValue(data, isEven, 6);    // undefined
    * ArrayExt.findFirstValue(data, isEven, 6, 5); // 2
    * ```
    */
  def apply[T](array: ArrayLike[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean]): js.UndefOr[T] = js.native
  def apply[T](
    array: ArrayLike[T],
    fn: js.Function2[/* value */ T, /* index */ Double, Boolean],
    start: js.UndefOr[scala.Nothing],
    stop: Double
  ): js.UndefOr[T] = js.native
  def apply[T](array: ArrayLike[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean], start: Double): js.UndefOr[T] = js.native
  def apply[T](
    array: ArrayLike[T],
    fn: js.Function2[/* value */ T, /* index */ Double, Boolean],
    start: Double,
    stop: Double
  ): js.UndefOr[T] = js.native
}
