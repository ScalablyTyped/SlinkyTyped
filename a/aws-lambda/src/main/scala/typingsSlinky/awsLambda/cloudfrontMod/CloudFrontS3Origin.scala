package typingsSlinky.awsLambda.cloudfrontMod

import typingsSlinky.awsLambda.awsLambdaStrings.`origin-access-identity`
import typingsSlinky.awsLambda.awsLambdaStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudFrontS3Origin extends js.Object {
  var authMethod: `origin-access-identity` | none_ = js.native
  var customHeaders: CloudFrontHeaders = js.native
  var domainName: String = js.native
  var path: String = js.native
  var region: String = js.native
}

object CloudFrontS3Origin {
  @scala.inline
  def apply(
    authMethod: `origin-access-identity` | none_,
    customHeaders: CloudFrontHeaders,
    domainName: String,
    path: String,
    region: String
  ): CloudFrontS3Origin = {
    val __obj = js.Dynamic.literal(authMethod = authMethod.asInstanceOf[js.Any], customHeaders = customHeaders.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFrontS3Origin]
  }
  @scala.inline
  implicit class CloudFrontS3OriginOps[Self <: CloudFrontS3Origin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthMethod(value: `origin-access-identity` | none_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomHeaders(value: CloudFrontHeaders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomainName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

