package typingsSlinky.documentdbServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Will contain error information if an error occurs, undefined otherwise. */
@js.native
trait IRequestCallbackError extends js.Object {
  /** A string containing the error information. */
  var body: String = js.native
  /** The HTTP response code corresponding to the error. */
  var number: Double = js.native
}

object IRequestCallbackError {
  @scala.inline
  def apply(body: String, number: Double): IRequestCallbackError = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRequestCallbackError]
  }
  @scala.inline
  implicit class IRequestCallbackErrorOps[Self <: IRequestCallbackError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

