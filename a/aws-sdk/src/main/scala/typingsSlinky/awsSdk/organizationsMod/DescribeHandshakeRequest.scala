package typingsSlinky.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeHandshakeRequest extends js.Object {
  /**
    * The unique identifier (ID) of the handshake that you want information about. You can get the ID from the original call to InviteAccountToOrganization, or from a call to ListHandshakesForAccount or ListHandshakesForOrganization. The regex pattern for handshake ID string requires "h-" followed by from 8 to 32 lowercase letters or digits.
    */
  var HandshakeId: typingsSlinky.awsSdk.organizationsMod.HandshakeId = js.native
}

object DescribeHandshakeRequest {
  @scala.inline
  def apply(HandshakeId: HandshakeId): DescribeHandshakeRequest = {
    val __obj = js.Dynamic.literal(HandshakeId = HandshakeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeHandshakeRequest]
  }
  @scala.inline
  implicit class DescribeHandshakeRequestOps[Self <: DescribeHandshakeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandshakeId(value: HandshakeId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HandshakeId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

