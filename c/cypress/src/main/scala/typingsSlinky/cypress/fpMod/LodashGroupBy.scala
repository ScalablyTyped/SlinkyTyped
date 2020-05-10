package typingsSlinky.cypress.fpMod

import typingsSlinky.cypress.lodashMod.Dictionary
import typingsSlinky.cypress.lodashMod.List
import typingsSlinky.cypress.lodashMod.ValueIteratee
import typingsSlinky.cypress.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashGroupBy extends js.Object {
  def apply[T](iteratee: ValueIteratee[T]): Dictionary[js.Array[T]] = js.native
  def apply[T /* <: js.Object */](
    iteratee: ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ],
    collection: T
  ): Dictionary[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  def apply[T](iteratee: ValueIteratee[T], collection: List[T]): Dictionary[js.Array[T]] = js.native
  def apply[T /* <: js.Object */](iteratee: __): LodashGroupBy2x2[T] = js.native
  def apply[T /* <: js.Object */](iteratee: __, collection: T): LodashGroupBy2x2[T] = js.native
  def apply[T](iteratee: __, collection: List[T]): LodashGroupBy1x2[T] = js.native
}

