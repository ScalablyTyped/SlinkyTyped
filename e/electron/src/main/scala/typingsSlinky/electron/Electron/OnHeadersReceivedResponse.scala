package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnHeadersReceivedResponse extends js.Object {
  var cancel: js.UndefOr[Boolean] = js.native
  /**
    * When provided, the server is assumed to have responded with these headers.
    */
  var responseHeaders: js.UndefOr[ResponseHeaders] = js.native
  /**
    * Should be provided when overriding responseHeaders to change header status
    * otherwise original response header's status will be used.
    */
  var statusLine: js.UndefOr[String] = js.native
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
    def withResponseHeaders(value: ResponseHeaders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusLine(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusLine")(js.undefined)
        ret
    }
  }
  
}

