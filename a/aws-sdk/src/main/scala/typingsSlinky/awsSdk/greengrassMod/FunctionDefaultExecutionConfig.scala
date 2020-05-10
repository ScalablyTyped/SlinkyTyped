package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionDefaultExecutionConfig extends js.Object {
  var IsolationMode: js.UndefOr[FunctionIsolationMode] = js.native
  var RunAs: js.UndefOr[FunctionRunAsConfig] = js.native
}

object FunctionDefaultExecutionConfig {
  @scala.inline
  def apply(): FunctionDefaultExecutionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionDefaultExecutionConfig]
  }
  @scala.inline
  implicit class FunctionDefaultExecutionConfigOps[Self <: FunctionDefaultExecutionConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsolationMode(value: FunctionIsolationMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsolationMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsolationMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsolationMode")(js.undefined)
        ret
    }
    @scala.inline
    def withRunAs(value: FunctionRunAsConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RunAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RunAs")(js.undefined)
        ret
    }
  }
  
}

