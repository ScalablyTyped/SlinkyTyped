package typingsSlinky.react

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Default[T /* <: ReactComponentClass[_] */] extends js.Object {
  var default: T
}

object Anon_Default {
  @scala.inline
  def apply[T /* <: ReactComponentClass[_] */](default: T): Anon_Default[T] = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Default[T]]
  }
}

