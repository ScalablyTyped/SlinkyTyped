package typingsSlinky.jupyterlabServices.messagesMod.KernelMessage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The valid Jupyter channel names in a message to a frontend.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.shell
  - typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.control
  - typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.iopub
  - typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.stdin
*/
trait Channel extends js.Object

object Channel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def control: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.control = this.cast("control")
  @scala.inline
  def iopub: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.iopub = this.cast("iopub")
  @scala.inline
  def shell: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.shell = this.cast("shell")
  @scala.inline
  def stdin: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.stdin = this.cast("stdin")
}

