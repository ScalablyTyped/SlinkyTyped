package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountAttributesMessage extends js.Object {
  /**
    * A list of AccountQuota objects. Within this list, each quota has a name, a count of usage toward the quota maximum, and a maximum value for the quota.
    */
  var AccountQuotas: js.UndefOr[AccountQuotaList] = js.native
}

object AccountAttributesMessage {
  @scala.inline
  def apply(): AccountAttributesMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountAttributesMessage]
  }
  @scala.inline
  implicit class AccountAttributesMessageOps[Self <: AccountAttributesMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountQuotas(value: AccountQuotaList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountQuotas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountQuotas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountQuotas")(js.undefined)
        ret
    }
  }
  
}

