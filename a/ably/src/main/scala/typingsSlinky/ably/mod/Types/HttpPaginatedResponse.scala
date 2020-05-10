package typingsSlinky.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpPaginatedResponse
  extends PaginatedResult[js.Any] {
  var errorCode: Double = js.native
  var errorMessage: String = js.native
  var headers: js.Any = js.native
  @JSName("items")
  var items_HttpPaginatedResponse: js.Array[String] = js.native
  var statusCode: Double = js.native
  var success: Boolean = js.native
}

object HttpPaginatedResponse {
  @scala.inline
  def apply(
    current: paginatedResultCallback[js.Any] => Unit,
    errorCode: Double,
    errorMessage: String,
    first: paginatedResultCallback[js.Any] => Unit,
    hasNext: () => Boolean,
    headers: js.Any,
    isLast: () => Boolean,
    items: js.Array[String],
    next: paginatedResultCallback[js.Any] => Unit,
    statusCode: Double,
    success: Boolean
  ): HttpPaginatedResponse = {
    val __obj = js.Dynamic.literal(current = js.Any.fromFunction1(current), errorCode = errorCode.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], first = js.Any.fromFunction1(first), hasNext = js.Any.fromFunction0(hasNext), headers = headers.asInstanceOf[js.Any], isLast = js.Any.fromFunction0(isLast), items = items.asInstanceOf[js.Any], next = js.Any.fromFunction1(next), statusCode = statusCode.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpPaginatedResponse]
  }
  @scala.inline
  implicit class HttpPaginatedResponseOps[Self <: HttpPaginatedResponse] (val x: Self) extends AnyVal {
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
    def withErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(value.asInstanceOf[js.Any])
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

