package typingsSlinky.awsLambda.cloudfrontMod

import typingsSlinky.awsLambda.anon.Action
import typingsSlinky.awsLambda.cloudfrontRequestMod.CloudFrontRequestResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudFrontRequest extends CloudFrontRequestResult {
  var body: js.UndefOr[Action] = js.native
  val clientIp: String = js.native
  var headers: CloudFrontHeaders = js.native
  val method: String = js.native
  var origin: js.UndefOr[CloudFrontOrigin] = js.native
  var querystring: String = js.native
  var uri: String = js.native
}

object CloudFrontRequest {
  @scala.inline
  def apply(clientIp: String, headers: CloudFrontHeaders, method: String, querystring: String, uri: String): CloudFrontRequest = {
    val __obj = js.Dynamic.literal(clientIp = clientIp.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], querystring = querystring.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFrontRequest]
  }
  @scala.inline
  implicit class CloudFrontRequestOps[Self <: CloudFrontRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: CloudFrontHeaders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuerystring(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("querystring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBody(value: Action): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withOrigin(value: CloudFrontOrigin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(js.undefined)
        ret
    }
  }
  
}

