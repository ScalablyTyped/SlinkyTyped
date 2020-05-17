package typingsSlinky.jestTypes.circusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jestTypes.circusMod.Exception
  - js.Array[
js.Tuple2[
  js.UndefOr[typingsSlinky.jestTypes.circusMod.Exception], 
  typingsSlinky.jestTypes.circusMod.Exception
]]
*/
trait TestError extends js.Object

object TestError {
  @scala.inline
  implicit def apply(value: js.Array[js.Tuple2[js.UndefOr[Exception], Exception]]): TestError = value.asInstanceOf[TestError]
  @scala.inline
  implicit def apply(value: Exception): TestError = value.asInstanceOf[TestError]
}

