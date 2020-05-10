package typingsSlinky.jupyterlabServices.terminalTerminalMod.TerminalSession

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Valid message types for the terminal.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.stdout
  - typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.disconnect
  - typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.set_size
  - typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.stdin
*/
trait MessageType extends js.Object

object MessageType {
  @scala.inline
  def disconnect: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.disconnect = "disconnect".asInstanceOf[typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.disconnect]
  @scala.inline
  def set_size: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.set_size = "set_size".asInstanceOf[typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.set_size]
  @scala.inline
  def stdin: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.stdin = "stdin".asInstanceOf[typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.stdin]
  @scala.inline
  def stdout: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.stdout = "stdout".asInstanceOf[typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.stdout]
}

