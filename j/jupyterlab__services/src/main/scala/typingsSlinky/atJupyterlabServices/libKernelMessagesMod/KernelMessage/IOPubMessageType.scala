package typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage

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
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.clear_output
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.comm_close
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.comm_msg
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.comm_open
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.display_data
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.error
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.execute_input
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.execute_result
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.status
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.stream
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.update_display_data
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.debug_event
*/
trait IOPubMessageType extends js.Object

object IOPubMessageType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def clear_output: typingsSlinky.atJupyterlabServices.atJupyterlabServicesStrings.clear_output = this.cast("clear_output")
  @scala.inline
  def comm_close: typingsSlinky.atJupyterlabServices.atJupyterlabServicesStrings.comm_close = this.cast("comm_close")
  @scala.inline
  def comm_msg: typingsSlinky.atJupyterlabServices.atJupyterlabServicesStrings.comm_msg = this.cast("comm_msg")
  @scala.inline
  def comm_open: typingsSlinky.atJupyterlabServices.atJupyterlabServicesStrings.comm_open = this.cast("comm_open")
  @scala.inline
  def debug_event: typingsSlinky.atJupyterlabServices.atJupyterlabServicesStrings.debug_event = this.cast("debug_event")
  @scala.inline
  def display_data: typingsSlinky.atJupyterlabServices.atJupyterlabServicesStrings.display_data = this.cast("display_data")
  @scala.inline
  def error: typingsSlinky.atJupyterlabServices.atJupyterlabServicesStrings.error = this.cast("error")
  @scala.inline
  def execute_input: typingsSlinky.atJupyterlabServices.atJupyterlabServicesStrings.execute_input = this.cast("execute_input")
  @scala.inline
  def execute_result: typingsSlinky.atJupyterlabServices.atJupyterlabServicesStrings.execute_result = this.cast("execute_result")
  @scala.inline
  def status: typingsSlinky.atJupyterlabServices.atJupyterlabServicesStrings.status = this.cast("status")
  @scala.inline
  def stream: typingsSlinky.atJupyterlabServices.atJupyterlabServicesStrings.stream = this.cast("stream")
  @scala.inline
  def update_display_data: typingsSlinky.atJupyterlabServices.atJupyterlabServicesStrings.update_display_data = this.cast("update_display_data")
}

