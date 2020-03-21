package typingsSlinky.cypress.fpMod

import typingsSlinky.cypress.lodashMod.Dictionary
import typingsSlinky.cypress.lodashMod.List
import typingsSlinky.cypress.lodashMod.PropertyName
import typingsSlinky.cypress.lodashMod.ValueIterateeCustom
import typingsSlinky.cypress.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashKeyBy extends js.Object {
  def apply[T](iteratee: ValueIterateeCustom[T, PropertyName]): LodashKeyBy1x1[T] = js.native
  def apply[T /* <: js.Object */](
    iteratee: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      PropertyName
    ],
    collection: T
  ): Dictionary[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def apply[T](iteratee: ValueIterateeCustom[T, PropertyName], collection: List[T]): Dictionary[T] = js.native
  def apply[T /* <: js.Object */](iteratee: __): LodashKeyBy2x2[T] = js.native
  def apply[T /* <: js.Object */](iteratee: __, collection: T): LodashKeyBy2x2[T] = js.native
  def apply[T](iteratee: __, collection: List[T]): LodashKeyBy1x2[T] = js.native
}

