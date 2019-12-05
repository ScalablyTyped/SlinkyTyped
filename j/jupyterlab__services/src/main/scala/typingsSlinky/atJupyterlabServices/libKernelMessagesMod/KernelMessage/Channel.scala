package typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The valid Jupyter channel names in a message to a frontend.
  */
/* Rewritten from type alias, can be one of: 
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.shell
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.control
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.iopub
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.stdin
*/
trait Channel extends js.Object

object Channel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def control: typingsSlinky.atJupyterlabServices.atJupyterlabServicesStrings.control = this.cast("control")
  @scala.inline
  def iopub: typingsSlinky.atJupyterlabServices.atJupyterlabServicesStrings.iopub = this.cast("iopub")
  @scala.inline
  def shell: typingsSlinky.atJupyterlabServices.atJupyterlabServicesStrings.shell = this.cast("shell")
  @scala.inline
  def stdin: typingsSlinky.atJupyterlabServices.atJupyterlabServicesStrings.stdin = this.cast("stdin")
}

