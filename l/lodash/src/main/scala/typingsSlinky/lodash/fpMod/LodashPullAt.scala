package typingsSlinky.lodash.fpMod

import typingsSlinky.lodash.mod.List
import typingsSlinky.lodash.mod.Many
import typingsSlinky.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashPullAt extends js.Object {
  
  def apply(indexes: Many[Double]): LodashPullAt1x1 = js.native
  def apply[T](indexes: Many[Double], array: js.Array[T]): js.Array[T] = js.native
  def apply[T](indexes: Many[Double], array: List[T]): List[T] = js.native
  def apply[T](indexes: __, array: js.Array[T]): LodashPullAt1x2[T] = js.native
  def apply[T](indexes: __, array: List[T]): LodashPullAt2x2[T] = js.native
}
