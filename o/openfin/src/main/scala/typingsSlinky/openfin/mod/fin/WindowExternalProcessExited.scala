package typingsSlinky.openfin.mod.fin

import typingsSlinky.openfin.openfinStrings.`external-process-exited`
import typingsSlinky.openfin.openfinStrings.window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowExternalProcessExited extends WindowBaseEvent {
  /**
    * the process exit code
    */
  var exitCode: Double
  /**
    * the process handle uuid
    */
  var processUuid: String
  @JSName("type")
  var type_WindowExternalProcessExited: `external-process-exited`
}

object WindowExternalProcessExited {
  @scala.inline
  def apply(
    exitCode: Double,
    name: String,
    processUuid: String,
    topic: window,
    `type`: `external-process-exited`,
    uuid: String
  ): WindowExternalProcessExited = {
    val __obj = js.Dynamic.literal(exitCode = exitCode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], processUuid = processUuid.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowExternalProcessExited]
  }
}

