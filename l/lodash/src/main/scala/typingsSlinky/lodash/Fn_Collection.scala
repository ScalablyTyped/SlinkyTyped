package typingsSlinky.lodash

import typingsSlinky.lodash.lodashMod.ArrayIterator
import typingsSlinky.lodash.lodashMod.List
import typingsSlinky.lodash.lodashMod.ListIterator
import typingsSlinky.lodash.lodashMod.ObjectIterator
import typingsSlinky.lodash.lodashMod.StringIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Collection extends js.Object {
  def apply(): js.UndefOr[scala.Nothing] = js.native
  def apply(collection: js.UndefOr[scala.Nothing], iteratee: StringIterator[_]): js.UndefOr[scala.Nothing] = js.native
  def apply(collection: String): String = js.native
  def apply(collection: String, iteratee: StringIterator[_]): String = js.native
  def apply(collection: Null, iteratee: StringIterator[_]): Null = js.native
  def apply[T /* <: js.Object */](collection: T): js.UndefOr[T | Null] = js.native
  def apply[T /* <: js.Object */](collection: T, iteratee: ObjectIterator[T, _]): js.UndefOr[T | Null] = js.native
  def apply[T](collection: js.Array[T]): js.Array[T] = js.native
  def apply[T](collection: js.Array[T], iteratee: ArrayIterator[T, _]): js.Array[T] = js.native
  def apply[T](collection: List[T]): List[T] = js.native
  def apply[T](collection: List[T], iteratee: ListIterator[T, _]): List[T] = js.native
}

