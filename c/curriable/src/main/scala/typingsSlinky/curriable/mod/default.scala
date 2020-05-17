package typingsSlinky.curriable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("curriable", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[Fn /* <: Handler */](fn: Fn): Curried[Fn] = js.native
  def apply[Fn /* <: Handler */](fn: Fn, arityOverride: Double): Handler = js.native
}

