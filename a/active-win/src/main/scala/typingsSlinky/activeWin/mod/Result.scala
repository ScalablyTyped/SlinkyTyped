package typingsSlinky.activeWin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.activeWin.mod.MacOSResult
  - typingsSlinky.activeWin.mod.LinuxResult
  - typingsSlinky.activeWin.mod.WindowsResult
*/
trait Result extends js.Object

object Result {
  @scala.inline
  implicit def apply(value: LinuxResult): Result = value.asInstanceOf[Result]
  @scala.inline
  implicit def apply(value: MacOSResult): Result = value.asInstanceOf[Result]
  @scala.inline
  implicit def apply(value: WindowsResult): Result = value.asInstanceOf[Result]
}

