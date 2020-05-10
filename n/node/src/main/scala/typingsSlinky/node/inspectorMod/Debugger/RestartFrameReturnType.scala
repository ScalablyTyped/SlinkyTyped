package typingsSlinky.node.inspectorMod.Debugger

import typingsSlinky.node.inspectorMod.Runtime.StackTrace
import typingsSlinky.node.inspectorMod.Runtime.StackTraceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestartFrameReturnType extends js.Object {
  /**
    * Async stack trace, if any.
    */
  var asyncStackTrace: js.UndefOr[StackTrace] = js.native
  /**
    * Async stack trace, if any.
    * @experimental
    */
  var asyncStackTraceId: js.UndefOr[StackTraceId] = js.native
  /**
    * New stack trace.
    */
  var callFrames: js.Array[CallFrame] = js.native
}

object RestartFrameReturnType {
  @scala.inline
  def apply(callFrames: js.Array[CallFrame]): RestartFrameReturnType = {
    val __obj = js.Dynamic.literal(callFrames = callFrames.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestartFrameReturnType]
  }
  @scala.inline
  implicit class RestartFrameReturnTypeOps[Self <: RestartFrameReturnType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallFrames(value: js.Array[CallFrame]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callFrames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAsyncStackTrace(value: StackTrace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncStackTrace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsyncStackTrace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncStackTrace")(js.undefined)
        ret
    }
    @scala.inline
    def withAsyncStackTraceId(value: StackTraceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncStackTraceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsyncStackTraceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncStackTraceId")(js.undefined)
        ret
    }
  }
  
}

