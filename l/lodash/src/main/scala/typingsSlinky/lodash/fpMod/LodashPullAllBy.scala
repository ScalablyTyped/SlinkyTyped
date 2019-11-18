package typingsSlinky.lodash.fpMod

import typingsSlinky.lodash.lodashMod.List
import typingsSlinky.lodash.lodashMod.ValueIteratee
import typingsSlinky.lodash.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPullAllBy extends js.Object {
  def apply[T](iteratee: ValueIteratee[T]): LodashPullAllBy1x1[T] = js.native
  def apply[T](iteratee: ValueIteratee[T], values: List[T]): LodashPullAllBy1x3[T] = js.native
  def apply[T](iteratee: ValueIteratee[T], values: List[T], array: js.Array[T]): js.Array[T] = js.native
  def apply[T](iteratee: ValueIteratee[T], values: List[T], array: List[T]): List[T] = js.native
  def apply[T](iteratee: ValueIteratee[T], values: __, array: js.Array[T]): LodashPullAllBy1x5[T] = js.native
  def apply[T](iteratee: ValueIteratee[T], values: __, array: List[T]): LodashPullAllBy2x5[T] = js.native
  def apply[T](iteratee: __, values: List[T]): LodashPullAllBy1x2[T] = js.native
  def apply[T](iteratee: __, values: List[T], array: js.Array[T]): LodashPullAllBy1x6[T] = js.native
  def apply[T](iteratee: __, values: List[T], array: List[T]): LodashPullAllBy2x6[T] = js.native
  def apply[T](iteratee: __, values: __, array: js.Array[T]): LodashPullAllBy1x4[T] = js.native
  def apply[T1](iteratee: __, values: __, array: List[T1]): LodashPullAllBy4x4[T1] = js.native
}

