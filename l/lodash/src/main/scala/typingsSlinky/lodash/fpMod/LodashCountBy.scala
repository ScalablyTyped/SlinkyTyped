package typingsSlinky.lodash.fpMod

import typingsSlinky.lodash.mod.Dictionary
import typingsSlinky.lodash.mod.List
import typingsSlinky.lodash.mod.ValueIteratee
import typingsSlinky.lodash.mod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashCountBy extends StObject {
  
  def apply[T](iteratee: ValueIteratee[T]): Dictionary[Double] = js.native
  def apply[T /* <: js.Object */](
    iteratee: ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ],
    collection: T
  ): Dictionary[Double] = js.native
  def apply[T](iteratee: ValueIteratee[T], collection: List[T]): Dictionary[Double] = js.native
  def apply[T](iteratee: __): LodashCountBy1x2[T] = js.native
  def apply[T /* <: js.Object */](iteratee: __, collection: T): LodashCountBy2x2[T] = js.native
  def apply[T](iteratee: __, collection: List[T]): LodashCountBy1x2[T] = js.native
}
