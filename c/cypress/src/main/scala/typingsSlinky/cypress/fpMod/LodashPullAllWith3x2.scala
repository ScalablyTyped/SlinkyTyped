package typingsSlinky.cypress.fpMod

import typingsSlinky.cypress.lodashMod.Comparator2
import typingsSlinky.cypress.lodashMod.List
import typingsSlinky.cypress.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPullAllWith3x2[T2] extends js.Object {
  def apply[T1](comparator: Comparator2[T1, T2]): LodashPullAllWith3x3[T1] = js.native
  def apply[T1](comparator: Comparator2[T1, T2], array: js.Array[T1]): js.Array[T1] = js.native
  def apply[T1](comparator: Comparator2[T1, T2], array: List[T1]): List[T1] = js.native
  def apply[T1](comparator: __, array: js.Array[T1]): LodashPullAllWith3x6[T1, T2] = js.native
  def apply[T1](comparator: __, array: List[T1]): LodashPullAllWith4x6[T1, T2] = js.native
}

