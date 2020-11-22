package typingsSlinky.lodash.fpMod

import typingsSlinky.lodash.mod.Dictionary
import typingsSlinky.lodash.mod.NumericDictionary
import typingsSlinky.lodash.mod.PartialObject
import typingsSlinky.lodash.mod.ValueKeyIteratee
import typingsSlinky.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashOmitBy extends js.Object {
  
  def apply[T](predicate: ValueKeyIteratee[T]): NumericDictionary[T] = js.native
  def apply[T /* <: js.Object */](
    predicate: ValueKeyIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ],
    `object`: T
  ): PartialObject[T] = js.native
  def apply[T](predicate: ValueKeyIteratee[T], `object`: Dictionary[T]): Dictionary[T] = js.native
  def apply[T](predicate: ValueKeyIteratee[T], `object`: NumericDictionary[T]): NumericDictionary[T] = js.native
  def apply[T /* <: js.Object */](predicate: __): LodashOmitBy3x2[T] = js.native
  def apply[T /* <: js.Object */](predicate: __, `object`: T): LodashOmitBy3x2[T] = js.native
  def apply[T](predicate: __, `object`: Dictionary[T]): LodashOmitBy1x2[T] = js.native
  def apply[T](predicate: __, `object`: NumericDictionary[T]): LodashOmitBy2x2[T] = js.native
}
