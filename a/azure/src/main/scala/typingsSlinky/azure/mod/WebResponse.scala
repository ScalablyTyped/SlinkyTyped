package typingsSlinky.azure.mod

import typingsSlinky.azure.anon.Entry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebResponse extends js.Object {
  var body: Entry = js.native
  var headers: js.Any = js.native
  var isSuccessful: Boolean = js.native
  var md5: js.Any = js.native
  var statusCode: Double = js.native
}

object WebResponse {
  @scala.inline
  def apply(body: Entry, headers: js.Any, isSuccessful: Boolean, md5: js.Any, statusCode: Double): WebResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], isSuccessful = isSuccessful.asInstanceOf[js.Any], md5 = md5.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebResponse]
  }
  @scala.inline
  implicit class WebResponseOps[Self <: WebResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: Entry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSuccessful(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSuccessful")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMd5(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("md5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

