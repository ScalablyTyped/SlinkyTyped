package typingsSlinky.awsLambda.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudFrontResponse extends js.Object {
  var headers: CloudFrontHeaders = js.native
  var status: String = js.native
  var statusDescription: String = js.native
}

object CloudFrontResponse {
  @scala.inline
  def apply(headers: CloudFrontHeaders, status: String, statusDescription: String): CloudFrontResponse = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusDescription = statusDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFrontResponse]
  }
  @scala.inline
  implicit class CloudFrontResponseOps[Self <: CloudFrontResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeaders(value: CloudFrontHeaders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusDescription")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

