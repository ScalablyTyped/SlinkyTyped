package typingsSlinky.react

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonResult[T /* <: ReactComponentClass[_] */] extends js.Object {
  val _result: T
}

object AnonResult {
  @scala.inline
  def apply[T /* <: ReactComponentClass[_] */](_result: T): AnonResult[T] = {
    val __obj = js.Dynamic.literal(_result = _result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonResult[T]]
  }
}

