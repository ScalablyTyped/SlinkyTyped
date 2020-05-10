package typingsSlinky.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetChangeTokenStatusResponse extends js.Object {
  /**
    * The status of the change token.
    */
  var ChangeTokenStatus: js.UndefOr[typingsSlinky.awsSdk.wafMod.ChangeTokenStatus] = js.native
}

object GetChangeTokenStatusResponse {
  @scala.inline
  def apply(): GetChangeTokenStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetChangeTokenStatusResponse]
  }
  @scala.inline
  implicit class GetChangeTokenStatusResponseOps[Self <: GetChangeTokenStatusResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeTokenStatus(value: ChangeTokenStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangeTokenStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangeTokenStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangeTokenStatus")(js.undefined)
        ret
    }
  }
  
}

