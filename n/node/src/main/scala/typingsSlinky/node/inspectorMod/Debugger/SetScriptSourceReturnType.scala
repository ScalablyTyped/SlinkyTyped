package typingsSlinky.node.inspectorMod.Debugger

import typingsSlinky.node.inspectorMod.Runtime.ExceptionDetails
import typingsSlinky.node.inspectorMod.Runtime.StackTrace
import typingsSlinky.node.inspectorMod.Runtime.StackTraceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetScriptSourceReturnType extends js.Object {
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
    * New stack trace in case editing has happened while VM was stopped.
    */
  var callFrames: js.UndefOr[js.Array[CallFrame]] = js.native
  /**
    * Exception details if any.
    */
  var exceptionDetails: js.UndefOr[ExceptionDetails] = js.native
  /**
    * Whether current call stack  was modified after applying the changes.
    */
  var stackChanged: js.UndefOr[Boolean] = js.native
}

object SetScriptSourceReturnType {
  @scala.inline
  def apply(): SetScriptSourceReturnType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetScriptSourceReturnType]
  }
  @scala.inline
  implicit class SetScriptSourceReturnTypeOps[Self <: SetScriptSourceReturnType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withCallFrames(value: js.Array[CallFrame]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callFrames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallFrames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callFrames")(js.undefined)
        ret
    }
    @scala.inline
    def withExceptionDetails(value: ExceptionDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exceptionDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExceptionDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exceptionDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withStackChanged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackChanged")(js.undefined)
        ret
    }
  }
  
}

