package typingsSlinky.plottable.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("plottable/build/src/utils", "Array")
@js.native
object Array extends js.Object {
  
  def add(aList: js.Array[Double], bList: js.Array[Double]): js.Array[Double] = js.native
  
  def createFilledArray[T](value: T, count: Double): js.Array[T] = js.native
  def createFilledArray[T](value: js.Function1[/* index */ js.UndefOr[Double], T], count: Double): js.Array[T] = js.native
  
  def flatten[T](a: js.Array[js.Array[T]]): js.Array[T] = js.native
  
  def uniq[T](arr: js.Array[T]): js.Array[T] = js.native
}
