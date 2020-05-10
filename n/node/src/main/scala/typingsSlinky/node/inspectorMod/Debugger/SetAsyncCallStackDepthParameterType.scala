package typingsSlinky.node.inspectorMod.Debugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetAsyncCallStackDepthParameterType extends js.Object {
  /**
    * Maximum depth of async call stacks. Setting to <code>0</code> will effectively disable collecting async call stacks (default).
    */
  var maxDepth: Double = js.native
}

object SetAsyncCallStackDepthParameterType {
  @scala.inline
  def apply(maxDepth: Double): SetAsyncCallStackDepthParameterType = {
    val __obj = js.Dynamic.literal(maxDepth = maxDepth.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetAsyncCallStackDepthParameterType]
  }
  @scala.inline
  implicit class SetAsyncCallStackDepthParameterTypeOps[Self <: SetAsyncCallStackDepthParameterType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDepth")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

