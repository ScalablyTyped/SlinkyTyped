package typingsSlinky.adalAngular.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestInfo extends js.Object {
  /**
    * Object comprising of fields such as id_token/error, session_state, state, e.t.c.
    */
  var parameters: js.Any = js.native
  /**
    * Request type.
    */
  var requestType: RequestType = js.native
  /**
    * Whether state is valid.
    */
  var stateMatch: Boolean = js.native
  /**
    * Unique guid used to match the response with the request.
    */
  var stateResponse: String = js.native
  /**
    * Whether `requestType` contains `id_token`, `access_token` or error.
    */
  var valid: Boolean = js.native
}

object RequestInfo {
  @scala.inline
  def apply(
    parameters: js.Any,
    requestType: RequestType,
    stateMatch: Boolean,
    stateResponse: String,
    valid: Boolean
  ): RequestInfo = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestType = requestType.asInstanceOf[js.Any], stateMatch = stateMatch.asInstanceOf[js.Any], stateResponse = stateResponse.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestInfo]
  }
  @scala.inline
  implicit class RequestInfoOps[Self <: RequestInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParameters(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestType(value: RequestType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStateMatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStateResponse(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

