package typingsSlinky.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetChangeTokenStatusRequest extends js.Object {
  /**
    * The change token for which you want to get the status. This change token was previously returned in the GetChangeToken response.
    */
  var ChangeToken: typingsSlinky.awsSdk.wafMod.ChangeToken = js.native
}

object GetChangeTokenStatusRequest {
  @scala.inline
  def apply(ChangeToken: ChangeToken): GetChangeTokenStatusRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetChangeTokenStatusRequest]
  }
  @scala.inline
  implicit class GetChangeTokenStatusRequestOps[Self <: GetChangeTokenStatusRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeToken(value: ChangeToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangeToken")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

