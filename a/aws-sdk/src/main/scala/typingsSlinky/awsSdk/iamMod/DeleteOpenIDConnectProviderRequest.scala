package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteOpenIDConnectProviderRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the IAM OpenID Connect provider resource object to delete. You can get a list of OpenID Connect provider resource ARNs by using the ListOpenIDConnectProviders operation.
    */
  var OpenIDConnectProviderArn: arnType = js.native
}

object DeleteOpenIDConnectProviderRequest {
  @scala.inline
  def apply(OpenIDConnectProviderArn: arnType): DeleteOpenIDConnectProviderRequest = {
    val __obj = js.Dynamic.literal(OpenIDConnectProviderArn = OpenIDConnectProviderArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteOpenIDConnectProviderRequest]
  }
  @scala.inline
  implicit class DeleteOpenIDConnectProviderRequestOps[Self <: DeleteOpenIDConnectProviderRequest] (val x: Self) extends AnyVal {
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

