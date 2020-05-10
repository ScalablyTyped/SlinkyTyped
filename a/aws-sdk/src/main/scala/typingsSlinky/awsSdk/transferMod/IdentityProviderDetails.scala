package typingsSlinky.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityProviderDetails extends js.Object {
  /**
    * The InvocationRole parameter provides the type of InvocationRole used to authenticate the user account.
    */
  var InvocationRole: js.UndefOr[Role] = js.native
  /**
    * The Url parameter provides contains the location of the service endpoint used to authenticate users.
    */
  var Url: js.UndefOr[typingsSlinky.awsSdk.transferMod.Url] = js.native
}

object IdentityProviderDetails {
  @scala.inline
  def apply(): IdentityProviderDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityProviderDetails]
  }
  @scala.inline
  implicit class IdentityProviderDetailsOps[Self <: IdentityProviderDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInvocationRole(value: Role): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InvocationRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvocationRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InvocationRole")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Url")(js.undefined)
        ret
    }
  }
  
}

