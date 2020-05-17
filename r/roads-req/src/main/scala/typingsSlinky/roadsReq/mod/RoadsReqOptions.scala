package typingsSlinky.roadsReq.mod

import typingsSlinky.node.httpMod.RequestOptions
import typingsSlinky.roadsReq.anon.Encoding
import typingsSlinky.roadsReq.anon.Pw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoadsReqOptions extends js.Object {
  var basicAuth: js.UndefOr[Pw] = js.native
  var followRedirects: js.UndefOr[Boolean] = js.native
  var request: RequestOptions | typingsSlinky.node.httpsMod.RequestOptions = js.native
  var requestBody: js.UndefOr[String] = js.native
  var response: js.UndefOr[Encoding] = js.native
}

object RoadsReqOptions {
  @scala.inline
  def apply(request: RequestOptions | typingsSlinky.node.httpsMod.RequestOptions): RoadsReqOptions = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoadsReqOptions]
  }
  @scala.inline
  implicit class RoadsReqOptionsOps[Self <: RoadsReqOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequest(value: RequestOptions | typingsSlinky.node.httpsMod.RequestOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBasicAuth(value: Pw): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basicAuth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBasicAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basicAuth")(js.undefined)
        ret
    }
    @scala.inline
    def withFollowRedirects(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followRedirects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollowRedirects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followRedirects")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestBody")(js.undefined)
        ret
    }
    @scala.inline
    def withResponse(value: Encoding): Self = {
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
  }
  
}

