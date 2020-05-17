package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Accountid extends js.Object {
  var account_id: Required = js.native
}

object Accountid {
  @scala.inline
  def apply(account_id: Required): Accountid = {
    val __obj = js.Dynamic.literal(account_id = account_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accountid]
  }
  @scala.inline
  implicit class AccountidOps[Self <: Accountid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccount_id(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

