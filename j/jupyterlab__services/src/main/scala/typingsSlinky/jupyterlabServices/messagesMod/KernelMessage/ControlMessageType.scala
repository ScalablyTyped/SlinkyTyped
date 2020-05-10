package typingsSlinky.jupyterlabServices.messagesMod.KernelMessage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Control message types.
  *
  * #### Notes
  * Debug messages are experimental messages that are not in the official
  * kernel message specification. As such, debug message types are *NOT*
  * considered part of the public API, and may change without notice.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.debug_request
  - typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.debug_reply
*/
trait ControlMessageType extends js.Object

object ControlMessageType {
  @scala.inline
  def debug_reply: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.debug_reply = "debug_reply".asInstanceOf[typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.debug_reply]
  @scala.inline
  def debug_request: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.debug_request = "debug_request".asInstanceOf[typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.debug_request]
}

