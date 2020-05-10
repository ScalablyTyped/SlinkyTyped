package typingsSlinky.awsSdk.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelSigningProfileRequest extends js.Object {
  /**
    * The name of the signing profile to be canceled.
    */
  var profileName: ProfileName = js.native
}

object CancelSigningProfileRequest {
  @scala.inline
  def apply(profileName: ProfileName): CancelSigningProfileRequest = {
    val __obj = js.Dynamic.literal(profileName = profileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelSigningProfileRequest]
  }
  @scala.inline
  implicit class CancelSigningProfileRequestOps[Self <: CancelSigningProfileRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProfileName(value: ProfileName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

