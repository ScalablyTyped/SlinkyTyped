package typingsSlinky.googleCloudCommon.utilMod

import typingsSlinky.teenyRequest.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParsedHttpRespMessage extends js.Object {
  var err: js.UndefOr[ApiError] = js.native
  var resp: Response[_] = js.native
}

object ParsedHttpRespMessage {
  @scala.inline
  def apply(resp: Response[_]): ParsedHttpRespMessage = {
    val __obj = js.Dynamic.literal(resp = resp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedHttpRespMessage]
  }
  @scala.inline
  implicit class ParsedHttpRespMessageOps[Self <: ParsedHttpRespMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResp(value: Response[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErr(value: ApiError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("err")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("err")(js.undefined)
        ret
    }
  }
  
}

