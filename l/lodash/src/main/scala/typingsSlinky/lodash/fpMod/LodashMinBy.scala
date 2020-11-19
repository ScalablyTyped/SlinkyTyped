package typingsSlinky.lodash.fpMod

import typingsSlinky.lodash.mod.List
import typingsSlinky.lodash.mod.ValueIteratee
import typingsSlinky.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashMinBy extends LodashConvertible {
  
  def apply[T](iteratee: ValueIteratee[T]): js.UndefOr[T] = js.native
  def apply[T](iteratee: ValueIteratee[T], collection: List[T]): js.UndefOr[T] = js.native
  def apply[T](iteratee: __): LodashMinBy1x2[T] = js.native
  def apply[T](iteratee: __, collection: List[T]): LodashMinBy1x2[T] = js.native
}
