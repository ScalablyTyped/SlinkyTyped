package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fridaGum.WindowsSystemFunctionResult
  - typingsSlinky.fridaGum.UnixSystemFunctionResult
*/
trait SystemFunctionResult extends js.Object

object SystemFunctionResult {
  @scala.inline
  implicit def apply(value: UnixSystemFunctionResult): SystemFunctionResult = value.asInstanceOf[SystemFunctionResult]
  @scala.inline
  implicit def apply(value: WindowsSystemFunctionResult): SystemFunctionResult = value.asInstanceOf[SystemFunctionResult]
}

