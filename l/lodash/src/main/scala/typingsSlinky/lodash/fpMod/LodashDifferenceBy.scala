package typingsSlinky.lodash.fpMod

import typingsSlinky.lodash.mod.List
import typingsSlinky.lodash.mod.ValueIteratee
import typingsSlinky.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashDifferenceBy extends LodashConvertible {
  def apply[T1](iteratee: __): LodashDifferenceBy1x2[T1] = js.native
  def apply[T1](iteratee: __, array: List[T1]): LodashDifferenceBy1x2[T1] = js.native
  def apply[T2](iteratee: __, array: __, values: List[T2]): LodashDifferenceBy1x4[T2] = js.native
  def apply[T1, T2](iteratee: ValueIteratee[T1 | T2]): LodashDifferenceBy1x1[T1, T2] = js.native
  def apply[T1, T2](iteratee: ValueIteratee[T1 | T2], array: js.UndefOr[List[T1] | Null], values: List[T2]): js.Array[T1] = js.native
  def apply[T1, T2](iteratee: ValueIteratee[T1 | T2], array: List[T1]): LodashDifferenceBy1x3[T1, T2] = js.native
  def apply[T1, T2](iteratee: ValueIteratee[T1 | T2], array: __, values: List[T2]): LodashDifferenceBy1x5[T1] = js.native
  def apply[T1, T2](iteratee: __, array: js.UndefOr[List[T1] | Null], values: List[T2]): LodashDifferenceBy1x6[T1, T2] = js.native
}

