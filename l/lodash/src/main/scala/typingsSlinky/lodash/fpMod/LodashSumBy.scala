package typingsSlinky.lodash.fpMod

import typingsSlinky.lodash.mod.List
import typingsSlinky.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashSumBy extends LodashConvertible {
  
  def apply[T](iteratee: String): LodashSumBy1x1[T] = js.native
  def apply[T](iteratee: String, collection: List[T]): Double = js.native
  def apply[T](iteratee: js.Function1[/* value */ T, Double]): LodashSumBy1x1[T] = js.native
  def apply[T](iteratee: js.Function1[/* value */ T, Double], collection: List[T]): Double = js.native
  def apply[T](iteratee: __): LodashSumBy1x2[T] = js.native
  def apply[T](iteratee: __, collection: List[T]): LodashSumBy1x2[T] = js.native
}
