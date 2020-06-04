package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnHeadersReceivedResponse extends js.Object {
  var cancel: js.UndefOr[Boolean] = js.undefined
  /**
    * When provided, the server is assumed to have responded with these headers.
    */
  var responseHeaders: js.UndefOr[ResponseHeaders] = js.undefined
  /**
    * Should be provided when overriding responseHeaders to change header status
    * otherwise original response header's status will be used.
    */
  var statusLine: js.UndefOr[String] = js.undefined
}

object OnHeadersReceivedResponse {
  @scala.inline
  def apply(): OnHeadersReceivedResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnHeadersReceivedResponse]
  }
  @scala.inline
  implicit class OnHeadersReceivedResponseOps[Self <: OnHeadersReceivedResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setResponseHeaders(value: ResponseHeaders): Self = this.set("responseHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseHeaders: Self = this.set("responseHeaders", js.undefined)
    @scala.inline
    def setStatusLine(value: String): Self = this.set("statusLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusLine: Self = this.set("statusLine", js.undefined)
  }
  
}

