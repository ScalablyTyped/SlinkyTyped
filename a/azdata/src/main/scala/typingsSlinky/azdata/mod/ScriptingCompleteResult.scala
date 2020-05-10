package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScriptingCompleteResult extends js.Object {
  var canceled: Boolean = js.native
  var errorDetails: String = js.native
  var errorMessage: String = js.native
  var hasError: Boolean = js.native
  var operationId: String = js.native
  var success: Boolean = js.native
}

object ScriptingCompleteResult {
  @scala.inline
  def apply(
    canceled: Boolean,
    errorDetails: String,
    errorMessage: String,
    hasError: Boolean,
    operationId: String,
    success: Boolean
  ): ScriptingCompleteResult = {
    val __obj = js.Dynamic.literal(canceled = canceled.asInstanceOf[js.Any], errorDetails = errorDetails.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], hasError = hasError.asInstanceOf[js.Any], operationId = operationId.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptingCompleteResult]
  }
  @scala.inline
  implicit class ScriptingCompleteResultOps[Self <: ScriptingCompleteResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanceled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canceled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorDetails(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

