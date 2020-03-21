package typingsSlinky.azdata.mod.nb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.azdata.azdataStrings.shell
  - typingsSlinky.azdata.azdataStrings.iopub
  - typingsSlinky.azdata.azdataStrings.stdin
  - typingsSlinky.azdata.azdataStrings.execute_reply
*/
trait Channel extends js.Object

object Channel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def execute_reply: typingsSlinky.azdata.azdataStrings.execute_reply = this.cast("execute_reply")
  @scala.inline
  def iopub: typingsSlinky.azdata.azdataStrings.iopub = this.cast("iopub")
  @scala.inline
  def shell: typingsSlinky.azdata.azdataStrings.shell = this.cast("shell")
  @scala.inline
  def stdin: typingsSlinky.azdata.azdataStrings.stdin = this.cast("stdin")
}

