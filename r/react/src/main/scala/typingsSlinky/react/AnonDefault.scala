package typingsSlinky.react

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefault[T /* <: ReactComponentClass[_] */] extends js.Object {
  var default: T
}

object AnonDefault {
  @scala.inline
  def apply[T /* <: ReactComponentClass[_] */](default: T): AnonDefault[T] = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDefault[T]]
  }
}

