package typingsSlinky.lodash.fpMod

import typingsSlinky.lodash.lodashMod.List
import typingsSlinky.lodash.lodashMod.ValueIterateeCustom
import typingsSlinky.lodash.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashSome extends js.Object {
  def apply[T](predicate: ValueIterateeCustom[T, Boolean]): Boolean = js.native
  def apply[T /* <: js.Object */](
    predicate: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      Boolean
    ],
    collection: T
  ): Boolean = js.native
  def apply[T](predicate: ValueIterateeCustom[T, Boolean], collection: List[T]): Boolean = js.native
  def apply[T /* <: js.Object */](predicate: __): LodashSome2x2[T] = js.native
  def apply[T /* <: js.Object */](predicate: __, collection: T): LodashSome2x2[T] = js.native
  def apply[T](predicate: __, collection: List[T]): LodashSome1x2[T] = js.native
}

