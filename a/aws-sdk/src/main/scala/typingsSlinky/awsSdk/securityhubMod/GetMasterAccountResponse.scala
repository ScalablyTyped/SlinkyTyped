package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMasterAccountResponse extends js.Object {
  /**
    * A list of details about the Security Hub master account for the current member account. 
    */
  var Master: js.UndefOr[Invitation] = js.native
}

object GetMasterAccountResponse {
  @scala.inline
  def apply(): GetMasterAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMasterAccountResponse]
  }
  @scala.inline
  implicit class GetMasterAccountResponseOps[Self <: GetMasterAccountResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaster(value: Invitation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Master")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaster: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Master")(js.undefined)
        ret
    }
  }
  
}

