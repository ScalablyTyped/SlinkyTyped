package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOpenIDConnectProviderRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the OIDC provider resource object in IAM to get information for. You can get a list of OIDC provider resource ARNs by using the ListOpenIDConnectProviders operation. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var OpenIDConnectProviderArn: arnType = js.native
}

object GetOpenIDConnectProviderRequest {
  @scala.inline
  def apply(OpenIDConnectProviderArn: arnType): GetOpenIDConnectProviderRequest = {
    val __obj = js.Dynamic.literal(OpenIDConnectProviderArn = OpenIDConnectProviderArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOpenIDConnectProviderRequest]
  }
  @scala.inline
  implicit class GetOpenIDConnectProviderRequestOps[Self <: GetOpenIDConnectProviderRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOpenIDConnectProviderArn(value: arnType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OpenIDConnectProviderArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

