package typingsSlinky.react.anon

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result[T /* <: ReactComponentClass[_] */] extends js.Object {
  val _result: T
}

object Result {
  @scala.inline
  def apply[T](_result: T): Result[T] = {
    val __obj = js.Dynamic.literal(_result = _result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result[T]]
  }
}

