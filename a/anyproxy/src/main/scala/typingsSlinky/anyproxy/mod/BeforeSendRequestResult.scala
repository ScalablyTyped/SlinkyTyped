package typingsSlinky.anyproxy.mod

import typingsSlinky.anyproxy.anon.PartialResponse
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<anyproxy.anyproxy.RequestDetail> */
@js.native
trait BeforeSendRequestResult extends js.Object {
  var _req: js.UndefOr[IncomingMessage] = js.native
  var protocol: js.UndefOr[String] = js.native
  var requestData: js.UndefOr[js.Any] = js.native
  var requestOptions: js.UndefOr[RequestOptions] = js.native
  var response: js.UndefOr[PartialResponse] = js.native
  var url: js.UndefOr[String] = js.native
}

object BeforeSendRequestResult {
  @scala.inline
  def apply(): BeforeSendRequestResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeforeSendRequestResult]
  }
  @scala.inline
  implicit class BeforeSendRequestResultOps[Self <: BeforeSendRequestResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_req(value: IncomingMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_req")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_req: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_req")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestData")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestOptions(value: RequestOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withResponse(value: PartialResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

