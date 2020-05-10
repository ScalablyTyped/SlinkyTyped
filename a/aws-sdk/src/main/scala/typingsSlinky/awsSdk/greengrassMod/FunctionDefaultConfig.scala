package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionDefaultConfig extends js.Object {
  var Execution: js.UndefOr[FunctionDefaultExecutionConfig] = js.native
}

object FunctionDefaultConfig {
  @scala.inline
  def apply(): FunctionDefaultConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionDefaultConfig]
  }
  @scala.inline
  implicit class FunctionDefaultConfigOps[Self <: FunctionDefaultConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExecution(value: FunctionDefaultExecutionConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Execution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Execution")(js.undefined)
        ret
    }
  }
  
}

