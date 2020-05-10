package typingsSlinky.awsSdk.ec2instanceconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendSSHPublicKeyResponse extends js.Object {
  /**
    * The request ID as logged by EC2 Connect. Please provide this when contacting AWS Support.
    */
  var RequestId: js.UndefOr[typingsSlinky.awsSdk.ec2instanceconnectMod.RequestId] = js.native
  /**
    * Indicates request success.
    */
  var Success: js.UndefOr[typingsSlinky.awsSdk.ec2instanceconnectMod.Success] = js.native
}

object SendSSHPublicKeyResponse {
  @scala.inline
  def apply(): SendSSHPublicKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendSSHPublicKeyResponse]
  }
  @scala.inline
  implicit class SendSSHPublicKeyResponseOps[Self <: SendSSHPublicKeyResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequestId(value: RequestId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestId")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: Success): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Success")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Success")(js.undefined)
        ret
    }
  }
  
}

