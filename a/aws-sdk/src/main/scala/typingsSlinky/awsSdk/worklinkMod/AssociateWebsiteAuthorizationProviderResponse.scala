package typingsSlinky.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateWebsiteAuthorizationProviderResponse extends js.Object {
  /**
    * A unique identifier for the authorization provider.
    */
  var AuthorizationProviderId: js.UndefOr[Id] = js.native
}

object AssociateWebsiteAuthorizationProviderResponse {
  @scala.inline
  def apply(): AssociateWebsiteAuthorizationProviderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateWebsiteAuthorizationProviderResponse]
  }
  @scala.inline
  implicit class AssociateWebsiteAuthorizationProviderResponseOps[Self <: AssociateWebsiteAuthorizationProviderResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorizationProviderId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthorizationProviderId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorizationProviderId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthorizationProviderId")(js.undefined)
        ret
    }
  }
  
}

