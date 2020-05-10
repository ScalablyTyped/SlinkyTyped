package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateIdentityProviderResponse extends js.Object {
  /**
    * The identity provider object.
    */
  var IdentityProvider: IdentityProviderType = js.native
}

object UpdateIdentityProviderResponse {
  @scala.inline
  def apply(IdentityProvider: IdentityProviderType): UpdateIdentityProviderResponse = {
    val __obj = js.Dynamic.literal(IdentityProvider = IdentityProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateIdentityProviderResponse]
  }
  @scala.inline
  implicit class UpdateIdentityProviderResponseOps[Self <: UpdateIdentityProviderResponse] (val x: Self) extends AnyVal {
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

