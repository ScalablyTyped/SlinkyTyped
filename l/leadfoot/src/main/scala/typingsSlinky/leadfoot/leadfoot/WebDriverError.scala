package typingsSlinky.leadfoot.leadfoot

import typingsSlinky.leadfoot.AnonMethod
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * An error from the remote WebDriver server.
	 */
@js.native
trait WebDriverError extends Error {
  /**
  		 * The raw detail of the error returned by the WebDriver server.
  		 */
  var detail: js.Any = js.native
  /**
  		 * The parameters for the request.
  		 */
  var request: AnonMethod = js.native
  /**
  		 * The response object for the request.
  		 */
  //		response: request.IResponse;
  var response: js.Any = js.native
  /**
  		 * The stack trace for the request.
  		 */
  @JSName("stack")
  var stack_WebDriverError: String = js.native
  /**
  		 * The raw error status code returned by the WebDriver server.
  		 */
  var status: Double = js.native
}

object WebDriverError {
  @scala.inline
  def apply(
    detail: js.Any,
    message: String,
    name: String,
    request: AnonMethod,
    response: js.Any,
    stack: String,
    status: Double
  ): WebDriverError = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebDriverError]
  }
  @scala.inline
  implicit class WebDriverErrorOps[Self <: WebDriverError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetail(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequest(value: AnonMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponse(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStack(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

