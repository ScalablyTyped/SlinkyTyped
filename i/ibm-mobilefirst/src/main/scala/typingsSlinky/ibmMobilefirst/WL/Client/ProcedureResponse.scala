package typingsSlinky.ibmMobilefirst.WL.Client

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ibmMobilefirst.WL.ResponseBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcedureResponse extends ResponseBase {
  var invocationResult: js.UndefOr[ProcedureInvocationResult] = js.native
  var parameters: js.UndefOr[js.Array[_]] = js.native
}

object ProcedureResponse {
  @scala.inline
  def apply(
    errorCode: Double,
    errorMsg: String,
    headerJSON: StringDictionary[js.Any],
    invocationContext: js.Any,
    readyState: Double,
    request: js.Any,
    responseJSON: StringDictionary[js.Any],
    responseText: String,
    responseXML: String,
    status: Double,
    statusText: String
  ): ProcedureResponse = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorMsg = errorMsg.asInstanceOf[js.Any], headerJSON = headerJSON.asInstanceOf[js.Any], invocationContext = invocationContext.asInstanceOf[js.Any], readyState = readyState.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], responseJSON = responseJSON.asInstanceOf[js.Any], responseText = responseText.asInstanceOf[js.Any], responseXML = responseXML.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcedureResponse]
  }
  @scala.inline
  implicit class ProcedureResponseOps[Self <: ProcedureResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInvocationResult(value: ProcedureInvocationResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invocationResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvocationResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invocationResult")(js.undefined)
        ret
    }
    @scala.inline
    def withParameters(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(js.undefined)
        ret
    }
  }
  
}

