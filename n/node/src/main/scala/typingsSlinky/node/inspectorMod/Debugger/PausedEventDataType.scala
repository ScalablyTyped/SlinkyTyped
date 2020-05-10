package typingsSlinky.node.inspectorMod.Debugger

import typingsSlinky.node.inspectorMod.Runtime.StackTrace
import typingsSlinky.node.inspectorMod.Runtime.StackTraceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PausedEventDataType extends js.Object {
  /**
    * Just scheduled async call will have this stack trace as parent stack during async execution. This field is available only after <code>Debugger.stepInto</code> call with <code>breakOnAsynCall</code> flag.
    * @experimental
    */
  var asyncCallStackTraceId: js.UndefOr[StackTraceId] = js.native
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
    * Call stack the virtual machine stopped on.
    */
  var callFrames: js.Array[CallFrame] = js.native
  /**
    * Object containing break-specific auxiliary properties.
    */
  var data: js.UndefOr[js.Object] = js.native
  /**
    * Hit breakpoints IDs
    */
  var hitBreakpoints: js.UndefOr[js.Array[String]] = js.native
  /**
    * Pause reason.
    */
  var reason: String = js.native
}

object PausedEventDataType {
  @scala.inline
  def apply(callFrames: js.Array[CallFrame], reason: String): PausedEventDataType = {
    val __obj = js.Dynamic.literal(callFrames = callFrames.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[PausedEventDataType]
  }
  @scala.inline
  implicit class PausedEventDataTypeOps[Self <: PausedEventDataType] (val x: Self) extends AnyVal {
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
    def withReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAsyncCallStackTraceId(value: StackTraceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncCallStackTraceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsyncCallStackTraceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncCallStackTraceId")(js.undefined)
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
    @scala.inline
    def withData(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withHitBreakpoints(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitBreakpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHitBreakpoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitBreakpoints")(js.undefined)
        ret
    }
  }
  
}

