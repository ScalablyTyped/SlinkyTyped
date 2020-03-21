package typingsSlinky.jupyterlabServices.messagesMod.KernelMessage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * IOPub message types.
  *
  * #### Notes
  * Debug messages are experimental messages that are not in the official
  * kernel message specification. As such, debug message types are *NOT*
  * considered part of the public API, and may change without notice.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.clear_output
  - typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.comm_close
  - typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.comm_msg
  - typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.comm_open
  - typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.display_data
  - typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.error
  - typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.execute_input
  - typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.execute_result
  - typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.status
  - typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.stream
  - typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.update_display_data
  - typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.debug_event
*/
trait IOPubMessageType extends js.Object

object IOPubMessageType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def clear_output: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.clear_output = this.cast("clear_output")
  @scala.inline
  def comm_close: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.comm_close = this.cast("comm_close")
  @scala.inline
  def comm_msg: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.comm_msg = this.cast("comm_msg")
  @scala.inline
  def comm_open: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.comm_open = this.cast("comm_open")
  @scala.inline
  def debug_event: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.debug_event = this.cast("debug_event")
  @scala.inline
  def display_data: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.display_data = this.cast("display_data")
  @scala.inline
  def error: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.error = this.cast("error")
  @scala.inline
  def execute_input: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.execute_input = this.cast("execute_input")
  @scala.inline
  def execute_result: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.execute_result = this.cast("execute_result")
  @scala.inline
  def status: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.status = this.cast("status")
  @scala.inline
  def stream: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.stream = this.cast("stream")
  @scala.inline
  def update_display_data: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.update_display_data = this.cast("update_display_data")
}

