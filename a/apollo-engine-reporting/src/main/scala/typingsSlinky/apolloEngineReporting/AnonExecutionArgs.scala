package typingsSlinky.apolloEngineReporting

import typingsSlinky.graphql.executeMod.ExecutionArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExecutionArgs extends js.Object {
  var executionArgs: ExecutionArgs = js.native
}

object AnonExecutionArgs {
  @scala.inline
  def apply(executionArgs: ExecutionArgs): AnonExecutionArgs = {
    val __obj = js.Dynamic.literal(executionArgs = executionArgs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExecutionArgs]
  }
  @scala.inline
  implicit class AnonExecutionArgsOps[Self <: AnonExecutionArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExecutionArgs(value: ExecutionArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionArgs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

