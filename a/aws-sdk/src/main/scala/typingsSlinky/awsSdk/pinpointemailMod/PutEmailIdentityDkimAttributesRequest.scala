package typingsSlinky.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutEmailIdentityDkimAttributesRequest extends js.Object {
  /**
    * The email identity that you want to change the DKIM settings for.
    */
  var EmailIdentity: Identity = js.native
  /**
    * Sets the DKIM signing configuration for the identity. When you set this value true, then the messages that Amazon Pinpoint sends from the identity are DKIM-signed. When you set this value to false, then the messages that Amazon Pinpoint sends from the identity aren't DKIM-signed.
    */
  var SigningEnabled: js.UndefOr[Enabled] = js.native
}

object PutEmailIdentityDkimAttributesRequest {
  @scala.inline
  def apply(EmailIdentity: Identity): PutEmailIdentityDkimAttributesRequest = {
    val __obj = js.Dynamic.literal(EmailIdentity = EmailIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutEmailIdentityDkimAttributesRequest]
  }
  @scala.inline
  implicit class PutEmailIdentityDkimAttributesRequestOps[Self <: PutEmailIdentityDkimAttributesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmailIdentity(value: Identity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmailIdentity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSigningEnabled(value: Enabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SigningEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSigningEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SigningEnabled")(js.undefined)
        ret
    }
  }
  
}

