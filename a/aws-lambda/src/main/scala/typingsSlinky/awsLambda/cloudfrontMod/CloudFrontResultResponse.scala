package typingsSlinky.awsLambda.cloudfrontMod

import typingsSlinky.awsLambda.awsLambdaStrings.base64
import typingsSlinky.awsLambda.awsLambdaStrings.text_
import typingsSlinky.awsLambda.cloudfrontRequestMod._CloudFrontRequestResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudFrontResultResponse extends _CloudFrontRequestResult {
  var body: js.UndefOr[String] = js.native
  var bodyEncoding: js.UndefOr[text_ | base64] = js.native
  var headers: js.UndefOr[CloudFrontHeaders] = js.native
  var status: String = js.native
  var statusDescription: js.UndefOr[String] = js.native
}

object CloudFrontResultResponse {
  @scala.inline
  def apply(status: String): CloudFrontResultResponse = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFrontResultResponse]
  }
  @scala.inline
  implicit class CloudFrontResultResponseOps[Self <: CloudFrontResultResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBody(value: String): Self = {
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
    def withBodyEncoding(value: text_ | base64): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyEncoding")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: CloudFrontHeaders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusDescription")(js.undefined)
        ret
    }
  }
  
}

