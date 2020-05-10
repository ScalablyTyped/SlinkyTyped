package typingsSlinky.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityInfo extends js.Object {
  /**
    * The address or domain of the identity.
    */
  var IdentityName: js.UndefOr[Identity] = js.native
  /**
    * The email identity type. The identity type can be one of the following:    EMAIL_ADDRESS – The identity is an email address.    DOMAIN – The identity is a domain.    MANAGED_DOMAIN – The identity is a domain that is managed by AWS.  
    */
  var IdentityType: js.UndefOr[typingsSlinky.awsSdk.sesv2Mod.IdentityType] = js.native
  /**
    * Indicates whether or not you can send email from the identity. An identity is an email address or domain that you send email from. Before you can send email from an identity, you have to demostrate that you own the identity, and that you authorize Amazon SES to send email from that identity.
    */
  var SendingEnabled: js.UndefOr[Enabled] = js.native
}

object IdentityInfo {
  @scala.inline
  def apply(): IdentityInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityInfo]
  }
  @scala.inline
  implicit class IdentityInfoOps[Self <: IdentityInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdentityName(value: Identity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentityName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityName")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentityType(value: IdentityType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentityType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityType")(js.undefined)
        ret
    }
    @scala.inline
    def withSendingEnabled(value: Enabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SendingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendingEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SendingEnabled")(js.undefined)
        ret
    }
  }
  
}

