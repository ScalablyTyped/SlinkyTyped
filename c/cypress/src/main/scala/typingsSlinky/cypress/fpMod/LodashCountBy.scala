package typingsSlinky.cypress.fpMod

import typingsSlinky.cypress.lodashMod.Dictionary
import typingsSlinky.cypress.lodashMod.List
import typingsSlinky.cypress.lodashMod.ValueIteratee
import typingsSlinky.cypress.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashCountBy extends js.Object {
  def apply[T](iteratee: ValueIteratee[T]): Dictionary[Double] = js.native
  def apply[T /* <: js.Object */](
    iteratee: ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ],
    collection: T
  ): Dictionary[Double] = js.native
  def apply[T](iteratee: ValueIteratee[T], collection: List[T]): Dictionary[Double] = js.native
  def apply[T /* <: js.Object */](iteratee: __): LodashCountBy2x2[T] = js.native
  def apply[T /* <: js.Object */](iteratee: __, collection: T): LodashCountBy2x2[T] = js.native
  def apply[T](iteratee: __, collection: List[T]): LodashCountBy1x2[T] = js.native
}

