package typingsSlinky.lodash.fpMod

import typingsSlinky.lodash.lodashMod.NumericDictionary
import typingsSlinky.lodash.lodashMod.ValueKeyIteratee
import typingsSlinky.lodash.lodashMod.ValueKeyIterateeTypeGuard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPickBy2x2[T] extends js.Object {
  def apply(predicate: ValueKeyIteratee[T]): NumericDictionary[T] = js.native
  def apply[S /* <: T */](predicate: ValueKeyIterateeTypeGuard[T, S]): NumericDictionary[S] = js.native
}

