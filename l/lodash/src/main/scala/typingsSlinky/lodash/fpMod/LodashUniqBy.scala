package typingsSlinky.lodash.fpMod

import typingsSlinky.lodash.mod.List
import typingsSlinky.lodash.mod.ValueIteratee
import typingsSlinky.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashUniqBy extends LodashConvertible {
  
  def apply[T](iteratee: ValueIteratee[T]): LodashUniqBy1x1[T] = js.native
  def apply[T](iteratee: ValueIteratee[T], array: List[T]): js.Array[T] = js.native
  def apply[T](iteratee: __): LodashUniqBy1x2[T] = js.native
  def apply[T](iteratee: __, array: List[T]): LodashUniqBy1x2[T] = js.native
}
