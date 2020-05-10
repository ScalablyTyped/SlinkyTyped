package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecutionControls extends js.Object {
  /**
    * A SsmControls object.
    */
  var SsmControls: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.SsmControls] = js.native
}

object ExecutionControls {
  @scala.inline
  def apply(): ExecutionControls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutionControls]
  }
  @scala.inline
  implicit class ExecutionControlsOps[Self <: ExecutionControls] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSsmControls(value: SsmControls): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SsmControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSsmControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SsmControls")(js.undefined)
        ret
    }
  }
  
}

