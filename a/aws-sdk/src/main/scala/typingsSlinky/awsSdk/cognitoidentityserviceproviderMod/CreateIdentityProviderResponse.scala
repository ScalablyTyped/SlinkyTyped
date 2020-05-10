package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateIdentityProviderResponse extends js.Object {
  /**
    * The newly created identity provider object.
    */
  var IdentityProvider: IdentityProviderType = js.native
}

object CreateIdentityProviderResponse {
  @scala.inline
  def apply(IdentityProvider: IdentityProviderType): CreateIdentityProviderResponse = {
    val __obj = js.Dynamic.literal(IdentityProvider = IdentityProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIdentityProviderResponse]
  }
  @scala.inline
  implicit class CreateIdentityProviderResponseOps[Self <: CreateIdentityProviderResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdentityProvider(value: IdentityProviderType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityProvider")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

