package typingsSlinky.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuspendedProcess extends js.Object {
  /**
    * The name of the suspended process.
    */
  var ProcessName: js.UndefOr[XmlStringMaxLen255] = js.native
  /**
    * The reason that the process was suspended.
    */
  var SuspensionReason: js.UndefOr[XmlStringMaxLen255] = js.native
}

object SuspendedProcess {
  @scala.inline
  def apply(): SuspendedProcess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuspendedProcess]
  }
  @scala.inline
  implicit class SuspendedProcessOps[Self <: SuspendedProcess] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProcessName(value: XmlStringMaxLen255): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProcessName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProcessName")(js.undefined)
        ret
    }
    @scala.inline
    def withSuspensionReason(value: XmlStringMaxLen255): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SuspensionReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuspensionReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SuspensionReason")(js.undefined)
        ret
    }
  }
  
}

