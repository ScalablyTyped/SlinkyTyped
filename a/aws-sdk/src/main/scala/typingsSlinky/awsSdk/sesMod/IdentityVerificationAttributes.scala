package typingsSlinky.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityVerificationAttributes extends js.Object {
  /**
    * The verification status of the identity: "Pending", "Success", "Failed", or "TemporaryFailure".
    */
  var VerificationStatus: typingsSlinky.awsSdk.sesMod.VerificationStatus = js.native
  /**
    * The verification token for a domain identity. Null for email address identities.
    */
  var VerificationToken: js.UndefOr[typingsSlinky.awsSdk.sesMod.VerificationToken] = js.native
}

object IdentityVerificationAttributes {
  @scala.inline
  def apply(VerificationStatus: VerificationStatus): IdentityVerificationAttributes = {
    val __obj = js.Dynamic.literal(VerificationStatus = VerificationStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityVerificationAttributes]
  }
  @scala.inline
  implicit class IdentityVerificationAttributesOps[Self <: IdentityVerificationAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVerificationStatus(value: VerificationStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VerificationStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerificationToken(value: VerificationToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VerificationToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerificationToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VerificationToken")(js.undefined)
        ret
    }
  }
  
}

