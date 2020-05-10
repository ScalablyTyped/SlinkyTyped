package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountAttributeList extends js.Object {
  /**
    * A list of attributes assigned to an account.
    */
  var AccountAttributes: js.UndefOr[AttributeList] = js.native
}

object AccountAttributeList {
  @scala.inline
  def apply(): AccountAttributeList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountAttributeList]
  }
  @scala.inline
  implicit class AccountAttributeListOps[Self <: AccountAttributeList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountAttributes(value: AttributeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountAttributes")(js.undefined)
        ret
    }
  }
  
}

