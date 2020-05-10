package typingsSlinky.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecutionContextCreatedEventDataType extends js.Object {
  /**
    * A newly created execution context.
    */
  var context: ExecutionContextDescription = js.native
}

object ExecutionContextCreatedEventDataType {
  @scala.inline
  def apply(context: ExecutionContextDescription): ExecutionContextCreatedEventDataType = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionContextCreatedEventDataType]
  }
  @scala.inline
  implicit class ExecutionContextCreatedEventDataTypeOps[Self <: ExecutionContextCreatedEventDataType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: ExecutionContextDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

