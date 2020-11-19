package typingsSlinky.lodash.fpMod

import typingsSlinky.lodash.mod.List
import typingsSlinky.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashChunk extends LodashConvertible {
  
  def apply(size: Double): LodashChunk1x1 = js.native
  def apply[T](size: Double, array: List[T]): js.Array[js.Array[T]] = js.native
  def apply[T](size: __): LodashChunk1x2[T] = js.native
  def apply[T](size: __, array: List[T]): LodashChunk1x2[T] = js.native
}
