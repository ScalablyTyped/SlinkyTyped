package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountWithRestoreAccess extends js.Object {
  /**
    * The identifier of an AWS support account authorized to restore a snapshot. For AWS support, the identifier is amazon-redshift-support. 
    */
  var AccountAlias: js.UndefOr[String] = js.native
  /**
    * The identifier of an AWS customer account authorized to restore a snapshot.
    */
  var AccountId: js.UndefOr[String] = js.native
}

object AccountWithRestoreAccess {
  @scala.inline
  def apply(): AccountWithRestoreAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountWithRestoreAccess]
  }
  @scala.inline
  implicit class AccountWithRestoreAccessOps[Self <: AccountWithRestoreAccess] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountAlias(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountAlias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountAlias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountAlias")(js.undefined)
        ret
    }
    @scala.inline
    def withAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountId")(js.undefined)
        ret
    }
  }
  
}

