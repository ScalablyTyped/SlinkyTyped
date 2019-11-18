package typingsSlinky.lodash.fpMod

import typingsSlinky.lodash.lodashMod.List
import typingsSlinky.lodash.lodashMod.Many
import typingsSlinky.lodash.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPullAt extends js.Object {
  def apply(indexes: Many[Double]): LodashPullAt1x1 = js.native
  def apply[T](indexes: Many[Double], array: js.Array[T]): js.Array[T] = js.native
  def apply[T](indexes: Many[Double], array: List[T]): List[T] = js.native
  def apply[T](indexes: __, array: js.Array[T]): LodashPullAt1x2[T] = js.native
  def apply[T](indexes: __, array: List[T]): LodashPullAt2x2[T] = js.native
}

