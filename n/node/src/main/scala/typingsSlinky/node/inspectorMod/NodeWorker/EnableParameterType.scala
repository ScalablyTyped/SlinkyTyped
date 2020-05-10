package typingsSlinky.node.inspectorMod.NodeWorker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableParameterType extends js.Object {
  /**
    * Whether to new workers should be paused until the frontend sends `Runtime.runIfWaitingForDebugger`
    * message to run them.
    */
  var waitForDebuggerOnStart: Boolean = js.native
}

object EnableParameterType {
  @scala.inline
  def apply(waitForDebuggerOnStart: Boolean): EnableParameterType = {
    val __obj = js.Dynamic.literal(waitForDebuggerOnStart = waitForDebuggerOnStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableParameterType]
  }
  @scala.inline
  implicit class EnableParameterTypeOps[Self <: EnableParameterType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWaitForDebuggerOnStart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForDebuggerOnStart")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

