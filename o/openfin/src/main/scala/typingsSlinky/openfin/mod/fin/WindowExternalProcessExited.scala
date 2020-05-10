package typingsSlinky.openfin.mod.fin

import typingsSlinky.openfin.openfinStrings.`external-process-exited`
import typingsSlinky.openfin.openfinStrings.window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowExternalProcessExited extends WindowBaseEvent {
  /**
    * the process exit code
    */
  var exitCode: Double = js.native
  /**
    * the process handle uuid
    */
  var processUuid: String = js.native
  @JSName("type")
  var type_WindowExternalProcessExited: `external-process-exited` = js.native
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
  @scala.inline
  implicit class WindowExternalProcessExitedOps[Self <: WindowExternalProcessExited] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExitCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcessUuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processUuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: `external-process-exited`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

