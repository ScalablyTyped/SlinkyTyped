package typingsSlinky.googleapis.scriptV1Mod.scriptV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object that provides information about the nature of an error resulting
  * from an attempted execution of a script function using the Apps Script API.
  * If a run call succeeds but the script function (or Apps Script itself)
  * throws an exception, the response body&#39;s error field contains a Status
  * object. The `Status` object&#39;s `details` field contains an array with a
  * single one of these `ExecutionError` objects.
  */
@js.native
trait SchemaExecutionError extends js.Object {
  /**
    * The error message thrown by Apps Script, usually localized into the
    * user&#39;s language.
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
  var scriptStackTraceElements: js.UndefOr[js.Array[SchemaScriptStackTraceElement]] = js.native
}

object SchemaExecutionError {
  @scala.inline
  def apply(): SchemaExecutionError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExecutionError]
  }
  @scala.inline
  implicit class SchemaExecutionErrorOps[Self <: SchemaExecutionError] (val x: Self) extends AnyVal {
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
    def withScriptStackTraceElements(value: js.Array[SchemaScriptStackTraceElement]): Self = {
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

