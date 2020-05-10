package typingsSlinky.awsLambda

import typingsSlinky.awsLambda.cloudfrontMod.CloudFrontRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-lambda.aws-lambda/common/cloudfront.CloudFrontEvent & {  request  :aws-lambda.aws-lambda/common/cloudfront.CloudFrontRequest} */
@js.native
trait CloudFrontEventrequestClo extends js.Object {
  var config: AnonDistributionDomainName = js.native
  var request: CloudFrontRequest = js.native
}

object CloudFrontEventrequestClo {
  @scala.inline
  def apply(config: AnonDistributionDomainName, request: CloudFrontRequest): CloudFrontEventrequestClo = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFrontEventrequestClo]
  }
  @scala.inline
  implicit class CloudFrontEventrequestCloOps[Self <: CloudFrontEventrequestClo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfig(value: AnonDistributionDomainName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequest(value: CloudFrontRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

