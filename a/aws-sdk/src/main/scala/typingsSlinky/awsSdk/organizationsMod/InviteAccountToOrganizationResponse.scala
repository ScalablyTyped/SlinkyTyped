package typingsSlinky.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InviteAccountToOrganizationResponse extends js.Object {
  /**
    * A structure that contains details about the handshake that is created to support this invitation request.
    */
  var Handshake: js.UndefOr[typingsSlinky.awsSdk.organizationsMod.Handshake] = js.native
}

object InviteAccountToOrganizationResponse {
  @scala.inline
  def apply(): InviteAccountToOrganizationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InviteAccountToOrganizationResponse]
  }
  @scala.inline
  implicit class InviteAccountToOrganizationResponseOps[Self <: InviteAccountToOrganizationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandshake(value: Handshake): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Handshake")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandshake: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Handshake")(js.undefined)
        ret
    }
  }
  
}

