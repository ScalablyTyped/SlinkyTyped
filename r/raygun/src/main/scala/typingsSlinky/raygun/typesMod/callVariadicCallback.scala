package typingsSlinky.raygun.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("raygun/build/types", "callVariadicCallback")
@js.native
object callVariadicCallback extends js.Object {
  def apply[T](callback: Callback[T]): Unit = js.native
  def apply[T](callback: Callback[T], error: Null, result: T): Unit = js.native
  def apply[T](callback: Callback[T], error: js.Error): Unit = js.native
  def apply[T](callback: Callback[T], error: js.Error, result: T): Unit = js.native
}

