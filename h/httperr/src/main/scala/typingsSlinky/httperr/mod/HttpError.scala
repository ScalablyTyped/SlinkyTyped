package typingsSlinky.httperr.mod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An instance of the HttpError class. */
@js.native
trait HttpError extends Error {
  var code: String = js.native
  /** The HTTP response status code for the HTTP error. */
  var statusCode: Double = js.native
  /** A human-readable title for the HTTP error. */
  var title: String = js.native
  def toObject(skip: (String | js.RegExp)*): js.Any = js.native
}

object HttpError {
  @scala.inline
  def apply(
    code: String,
    message: String,
    name: String,
    statusCode: Double,
    title: String,
    toObject: /* repeated */ String | js.RegExp => js.Any
  ): HttpError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], toObject = js.Any.fromFunction1(toObject))
    __obj.asInstanceOf[HttpError]
  }
  @scala.inline
  implicit class HttpErrorOps[Self <: HttpError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToObject(value: /* repeated */ String | js.RegExp => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toObject")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

