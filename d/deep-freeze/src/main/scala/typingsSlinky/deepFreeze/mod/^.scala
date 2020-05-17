package typingsSlinky.deepFreeze.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("deep-freeze", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[T](a: js.Array[T]): js.Array[DeepReadonly[T]] = js.native
  def apply[T](o: T): DeepReadonly[T] = js.native
}

