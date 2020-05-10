package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionExecutionConfig extends js.Object {
  var IsolationMode: js.UndefOr[FunctionIsolationMode] = js.native
  var RunAs: js.UndefOr[FunctionRunAsConfig] = js.native
}

object FunctionExecutionConfig {
  @scala.inline
  def apply(): FunctionExecutionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionExecutionConfig]
  }
  @scala.inline
  implicit class FunctionExecutionConfigOps[Self <: FunctionExecutionConfig] (val x: Self) extends AnyVal {
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

