package typingsSlinky.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessesType extends js.Object {
  /**
    * The names of the process types.
    */
  var Processes: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.Processes] = js.native
}

object ProcessesType {
  @scala.inline
  def apply(): ProcessesType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessesType]
  }
  @scala.inline
  implicit class ProcessesTypeOps[Self <: ProcessesType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProcesses(value: Processes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Processes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcesses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Processes")(js.undefined)
        ret
    }
  }
  
}

