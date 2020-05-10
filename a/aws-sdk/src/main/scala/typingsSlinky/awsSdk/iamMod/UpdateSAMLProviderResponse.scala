package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateSAMLProviderResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the SAML provider that was updated.
    */
  var SAMLProviderArn: js.UndefOr[arnType] = js.native
}

object UpdateSAMLProviderResponse {
  @scala.inline
  def apply(): UpdateSAMLProviderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSAMLProviderResponse]
  }
  @scala.inline
  implicit class UpdateSAMLProviderResponseOps[Self <: UpdateSAMLProviderResponse] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withoutSAMLProviderArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SAMLProviderArn")(js.undefined)
        ret
    }
  }
  
}

