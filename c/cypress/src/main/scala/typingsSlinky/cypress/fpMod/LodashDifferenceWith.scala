package typingsSlinky.cypress.fpMod

import typingsSlinky.cypress.lodashMod.Comparator2
import typingsSlinky.cypress.lodashMod.List
import typingsSlinky.cypress.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashDifferenceWith extends js.Object {
  def apply[T1](comparator: __): LodashDifferenceWith1x2[T1] = js.native
  def apply[T1](comparator: __, array: List[T1]): LodashDifferenceWith1x2[T1] = js.native
  def apply[T2](comparator: __, array: __, values: List[T2]): LodashDifferenceWith1x4[T2] = js.native
  def apply[T1, T2](comparator: Comparator2[T1, T2]): LodashDifferenceWith1x1[T1, T2] = js.native
  def apply[T1, T2](comparator: Comparator2[T1, T2], array: js.UndefOr[List[T1] | Null], values: List[T2]): js.Array[T1] = js.native
  def apply[T1, T2](comparator: Comparator2[T1, T2], array: List[T1]): LodashDifferenceWith1x3[T1, T2] = js.native
  def apply[T1, T2](comparator: Comparator2[T1, T2], array: __, values: List[T2]): LodashDifferenceWith1x5[T1] = js.native
  def apply[T1, T2](comparator: __, array: js.UndefOr[List[T1] | Null], values: List[T2]): LodashDifferenceWith1x6[T1, T2] = js.native
}

