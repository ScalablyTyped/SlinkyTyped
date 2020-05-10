package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnBeforeSendHeadersResponse extends js.Object {
  var cancel: js.UndefOr[Boolean] = js.native
  /**
    * When provided, request will be made with these headers.
    */
  var requestHeaders: js.UndefOr[RequestHeaders] = js.native
}

object OnBeforeSendHeadersResponse {
  @scala.inline
  def apply(): OnBeforeSendHeadersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnBeforeSendHeadersResponse]
  }
  @scala.inline
  implicit class OnBeforeSendHeadersResponseOps[Self <: OnBeforeSendHeadersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestHeaders(value: RequestHeaders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestHeaders")(js.undefined)
        ret
    }
  }
  
}

