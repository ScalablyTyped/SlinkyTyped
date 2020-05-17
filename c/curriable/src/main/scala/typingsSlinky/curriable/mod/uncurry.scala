package typingsSlinky.curriable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("curriable", "uncurry")
@js.native
object uncurry extends js.Object {
  def apply[Fn /* <: Handler */](curried: Curried[Fn]): Fn = js.native
}

