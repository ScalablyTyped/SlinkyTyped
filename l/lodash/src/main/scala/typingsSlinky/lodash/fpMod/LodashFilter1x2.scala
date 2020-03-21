package typingsSlinky.lodash.fpMod

import typingsSlinky.lodash.mod.ValueIterateeCustom
import typingsSlinky.lodash.mod.ValueIteratorTypeGuard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashFilter1x2[T] extends js.Object {
  def apply(predicate: ValueIterateeCustom[T, Boolean]): js.Array[T] = js.native
  def apply[S /* <: T */](predicate: ValueIteratorTypeGuard[T, S]): js.Array[S] = js.native
}

