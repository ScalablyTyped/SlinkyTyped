package typingsSlinky.lodash.fpMod

import typingsSlinky.lodash.mod.List
import typingsSlinky.lodash.mod.Many
import typingsSlinky.lodash.mod.ValueIteratee
import typingsSlinky.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashSortBy extends js.Object {
  def apply[T](iteratees: Many[ValueIteratee[T]]): js.Array[T] = js.native
  def apply[T /* <: js.Object */](
    iteratees: Many[
      ValueIteratee[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
      ]
    ],
    collection: T
  ): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def apply[T](iteratees: Many[ValueIteratee[T]], collection: List[T]): js.Array[T] = js.native
  def apply[T /* <: js.Object */](iteratees: __): LodashSortBy2x2[T] = js.native
  def apply[T /* <: js.Object */](iteratees: __, collection: T): LodashSortBy2x2[T] = js.native
  def apply[T](iteratees: __, collection: List[T]): LodashSortBy1x2[T] = js.native
}

