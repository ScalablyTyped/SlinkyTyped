package typingsSlinky.lodash.fpMod

import typingsSlinky.lodash.mod.Dictionary
import typingsSlinky.lodash.mod.List
import typingsSlinky.lodash.mod.NumericDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashToArray extends LodashConvertible {
  
  def apply(): js.Array[_] = js.native
  def apply[T](value: T): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def apply[T](value: Dictionary[T]): js.Array[T] = js.native
  def apply[T](value: List[T]): js.Array[T] = js.native
  def apply[T](value: NumericDictionary[T]): js.Array[T] = js.native
}
