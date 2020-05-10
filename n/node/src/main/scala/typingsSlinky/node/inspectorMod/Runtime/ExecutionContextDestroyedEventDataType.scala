package typingsSlinky.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecutionContextDestroyedEventDataType extends js.Object {
  /**
    * Id of the destroyed context
    */
  var executionContextId: ExecutionContextId = js.native
}

object ExecutionContextDestroyedEventDataType {
  @scala.inline
  def apply(executionContextId: ExecutionContextId): ExecutionContextDestroyedEventDataType = {
    val __obj = js.Dynamic.literal(executionContextId = executionContextId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionContextDestroyedEventDataType]
  }
  @scala.inline
  implicit class ExecutionContextDestroyedEventDataTypeOps[Self <: ExecutionContextDestroyedEventDataType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExecutionContextId(value: ExecutionContextId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionContextId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

