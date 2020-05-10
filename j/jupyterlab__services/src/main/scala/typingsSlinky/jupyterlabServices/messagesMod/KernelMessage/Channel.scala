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
  def control: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.control = "control".asInstanceOf[typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.control]
  @scala.inline
  def iopub: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.iopub = "iopub".asInstanceOf[typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.iopub]
  @scala.inline
  def shell: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.shell = "shell".asInstanceOf[typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.shell]
  @scala.inline
  def stdin: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.stdin = "stdin".asInstanceOf[typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.stdin]
}

