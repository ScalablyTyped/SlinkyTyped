package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateServiceRoleFromAccountResponse extends js.Object {
  /**
    * The time when the service role was disassociated from the account.
    */
  var DisassociatedAt: js.UndefOr[string] = js.native
}

object DisassociateServiceRoleFromAccountResponse {
  @scala.inline
  def apply(): DisassociateServiceRoleFromAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateServiceRoleFromAccountResponse]
  }
  @scala.inline
  implicit class DisassociateServiceRoleFromAccountResponseOps[Self <: DisassociateServiceRoleFromAccountResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisassociatedAt(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisassociatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisassociatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisassociatedAt")(js.undefined)
        ret
    }
  }
  
}

