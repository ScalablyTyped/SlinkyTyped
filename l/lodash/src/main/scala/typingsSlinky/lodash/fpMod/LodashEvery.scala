package typingsSlinky.lodash.fpMod

import typingsSlinky.lodash.mod.List
import typingsSlinky.lodash.mod.ValueIterateeCustom
import typingsSlinky.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashEvery extends js.Object {
  
  def apply[T](predicate: ValueIterateeCustom[T, Boolean]): LodashEvery1x1[T] = js.native
  def apply[T /* <: js.Object */](
    predicate: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      Boolean
    ],
    collection: T
  ): Boolean = js.native
  def apply[T](predicate: ValueIterateeCustom[T, Boolean], collection: List[T]): Boolean = js.native
  def apply[T /* <: js.Object */](predicate: __): LodashEvery2x2[T] = js.native
  def apply[T /* <: js.Object */](predicate: __, collection: T): LodashEvery2x2[T] = js.native
  def apply[T](predicate: __, collection: List[T]): LodashEvery1x2[T] = js.native
}
