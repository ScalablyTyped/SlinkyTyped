package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateMyUserProfileRequest extends js.Object {
  /**
    * The user's SSH public key.
    */
  var SshPublicKey: js.UndefOr[String] = js.native
}

object UpdateMyUserProfileRequest {
  @scala.inline
  def apply(): UpdateMyUserProfileRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateMyUserProfileRequest]
  }
  @scala.inline
  implicit class UpdateMyUserProfileRequestOps[Self <: UpdateMyUserProfileRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSshPublicKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SshPublicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSshPublicKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SshPublicKey")(js.undefined)
        ret
    }
  }
  
}

