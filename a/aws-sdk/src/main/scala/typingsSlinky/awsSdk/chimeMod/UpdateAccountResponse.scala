package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAccountResponse extends js.Object {
  /**
    * The updated Amazon Chime account details.
    */
  var Account: js.UndefOr[typingsSlinky.awsSdk.chimeMod.Account] = js.native
}

object UpdateAccountResponse {
  @scala.inline
  def apply(): UpdateAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAccountResponse]
  }
  @scala.inline
  implicit class UpdateAccountResponseOps[Self <: UpdateAccountResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccount(value: Account): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Account")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Account")(js.undefined)
        ret
    }
  }
  
}

