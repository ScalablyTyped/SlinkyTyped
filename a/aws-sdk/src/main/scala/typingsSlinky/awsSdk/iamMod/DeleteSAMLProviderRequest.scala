package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSAMLProviderRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the SAML provider to delete.
    */
  var SAMLProviderArn: arnType = js.native
}

object DeleteSAMLProviderRequest {
  @scala.inline
  def apply(SAMLProviderArn: arnType): DeleteSAMLProviderRequest = {
    val __obj = js.Dynamic.literal(SAMLProviderArn = SAMLProviderArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSAMLProviderRequest]
  }
  @scala.inline
  implicit class DeleteSAMLProviderRequestOps[Self <: DeleteSAMLProviderRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSAMLProviderArn(value: arnType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SAMLProviderArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

