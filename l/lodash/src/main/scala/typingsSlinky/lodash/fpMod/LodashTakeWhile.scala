package typingsSlinky.lodash.fpMod

import typingsSlinky.lodash.mod.List
import typingsSlinky.lodash.mod.ValueIteratee
import typingsSlinky.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashTakeWhile extends LodashConvertible {
  def apply[T](predicate: ValueIteratee[T]): js.Array[T] = js.native
  def apply[T](predicate: ValueIteratee[T], array: List[T]): js.Array[T] = js.native
  def apply[T](predicate: __): LodashTakeWhile1x2[T] = js.native
  def apply[T](predicate: __, array: List[T]): LodashTakeWhile1x2[T] = js.native
}

