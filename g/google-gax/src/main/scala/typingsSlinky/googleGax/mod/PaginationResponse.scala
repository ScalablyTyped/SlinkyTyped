package typingsSlinky.googleGax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaginationResponse[RequestObject, ResponseObject, ResponseType] extends js.Object {
  var nextPageRequest: js.UndefOr[RequestObject] = js.native
  var rawResponse: js.UndefOr[ResponseObject] = js.native
  var values: js.UndefOr[js.Array[ResponseType]] = js.native
}

object PaginationResponse {
  @scala.inline
  def apply[RequestObject, ResponseObject, ResponseType](): PaginationResponse[RequestObject, ResponseObject, ResponseType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaginationResponse[RequestObject, ResponseObject, ResponseType]]
  }
  @scala.inline
  implicit class PaginationResponseOps[Self[requestobject, responseobject, responsetype] <: PaginationResponse[requestobject, responseobject, responsetype], RequestObject, ResponseObject, ResponseType] (val x: Self[RequestObject, ResponseObject, ResponseType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[RequestObject, ResponseObject, ResponseType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[RequestObject, ResponseObject, ResponseType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[RequestObject, ResponseObject, ResponseType]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[RequestObject, ResponseObject, ResponseType]) with Other]
    @scala.inline
    def withNextPageRequest(value: RequestObject): Self[RequestObject, ResponseObject, ResponseType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageRequest: Self[RequestObject, ResponseObject, ResponseType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withRawResponse(value: ResponseObject): Self[RequestObject, ResponseObject, ResponseType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRawResponse: Self[RequestObject, ResponseObject, ResponseType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: js.Array[ResponseType]): Self[RequestObject, ResponseObject, ResponseType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self[RequestObject, ResponseObject, ResponseType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
  }
  
}

