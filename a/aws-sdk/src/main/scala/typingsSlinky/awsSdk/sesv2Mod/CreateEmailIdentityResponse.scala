package typingsSlinky.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateEmailIdentityResponse extends js.Object {
  /**
    * An object that contains information about the DKIM attributes for the identity.
    */
  var DkimAttributes: js.UndefOr[typingsSlinky.awsSdk.sesv2Mod.DkimAttributes] = js.native
  /**
    * The email identity type.
    */
  var IdentityType: js.UndefOr[typingsSlinky.awsSdk.sesv2Mod.IdentityType] = js.native
  /**
    * Specifies whether or not the identity is verified. You can only send email from verified email addresses or domains. For more information about verifying identities, see the Amazon Pinpoint User Guide.
    */
  var VerifiedForSendingStatus: js.UndefOr[Enabled] = js.native
}

object CreateEmailIdentityResponse {
  @scala.inline
  def apply(): CreateEmailIdentityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateEmailIdentityResponse]
  }
  @scala.inline
  implicit class CreateEmailIdentityResponseOps[Self <: CreateEmailIdentityResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDkimAttributes(value: DkimAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DkimAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDkimAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DkimAttributes")(js.undefined)
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
    def withVerifiedForSendingStatus(value: Enabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VerifiedForSendingStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerifiedForSendingStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VerifiedForSendingStatus")(js.undefined)
        ret
    }
  }
  
}

