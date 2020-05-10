package typingsSlinky.gapiClientScript.gapi.client.script

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecutionError extends js.Object {
  /**
    * The error message thrown by Apps Script, usually localized into the user's
    * language.
    */
  var errorMessage: js.UndefOr[String] = js.native
  /**
    * The error type, for example `TypeError` or `ReferenceError`. If the error
    * type is unavailable, this field is not included.
    */
  var errorType: js.UndefOr[String] = js.native
  /**
    * An array of objects that provide a stack trace through the script to show
    * where the execution failed, with the deepest call first.
    */
  var scriptStackTraceElements: js.UndefOr[js.Array[ScriptStackTraceElement]] = js.native
}

object ExecutionError {
  @scala.inline
  def apply(): ExecutionError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutionError]
  }
  @scala.inline
  implicit class ExecutionErrorOps[Self <: ExecutionError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorType")(js.undefined)
        ret
    }
    @scala.inline
    def withScriptStackTraceElements(value: js.Array[ScriptStackTraceElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptStackTraceElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScriptStackTraceElements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptStackTraceElements")(js.undefined)
        ret
    }
  }
  
}

