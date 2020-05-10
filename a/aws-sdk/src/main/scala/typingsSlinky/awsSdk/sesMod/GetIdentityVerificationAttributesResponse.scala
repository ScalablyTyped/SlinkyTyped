package typingsSlinky.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIdentityVerificationAttributesResponse extends js.Object {
  /**
    * A map of Identities to IdentityVerificationAttributes objects.
    */
  var VerificationAttributes: typingsSlinky.awsSdk.sesMod.VerificationAttributes = js.native
}

object GetIdentityVerificationAttributesResponse {
  @scala.inline
  def apply(VerificationAttributes: VerificationAttributes): GetIdentityVerificationAttributesResponse = {
    val __obj = js.Dynamic.literal(VerificationAttributes = VerificationAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIdentityVerificationAttributesResponse]
  }
  @scala.inline
  implicit class GetIdentityVerificationAttributesResponseOps[Self <: GetIdentityVerificationAttributesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVerificationAttributes(value: VerificationAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VerificationAttributes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

