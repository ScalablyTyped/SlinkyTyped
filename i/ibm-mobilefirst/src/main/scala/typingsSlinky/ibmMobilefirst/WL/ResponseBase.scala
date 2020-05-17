package typingsSlinky.ibmMobilefirst.WL

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseBase extends js.Object {
  var errorCode: Double = js.native
  var errorMsg: String = js.native
  var headerJSON: StringDictionary[js.Any] = js.native
  var invocationContext: js.Any = js.native
   // JSON Object
  var readyState: Double = js.native
  var request: js.Any = js.native
  var responseJSON: StringDictionary[js.Any] = js.native
   // JSON Object
  var responseText: String = js.native
  var responseXML: String = js.native
  var status: Double = js.native
  var statusText: String = js.native
}

object ResponseBase {
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
  ): ResponseBase = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorMsg = errorMsg.asInstanceOf[js.Any], headerJSON = headerJSON.asInstanceOf[js.Any], invocationContext = invocationContext.asInstanceOf[js.Any], readyState = readyState.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], responseJSON = responseJSON.asInstanceOf[js.Any], responseText = responseText.asInstanceOf[js.Any], responseXML = responseXML.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseBase]
  }
  @scala.inline
  implicit class ResponseBaseOps[Self <: ResponseBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorMsg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMsg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderJSON(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerJSON")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvocationContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invocationContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadyState(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readyState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequest(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponseJSON(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseJSON")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponseText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponseXML(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseXML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusText")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

