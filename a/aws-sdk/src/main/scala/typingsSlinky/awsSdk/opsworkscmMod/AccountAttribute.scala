package typingsSlinky.awsSdk.opsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountAttribute extends js.Object {
  /**
    *  The maximum allowed value. 
    */
  var Maximum: js.UndefOr[Integer] = js.native
  /**
    *  The attribute name. The following are supported attribute names.     ServerLimit: The number of current servers/maximum number of servers allowed. By default, you can have a maximum of 10 servers.     ManualBackupLimit: The number of current manual backups/maximum number of backups allowed. By default, you can have a maximum of 50 manual backups saved.   
    */
  var Name: js.UndefOr[String] = js.native
  /**
    *  The current usage, such as the current number of servers that are associated with the account. 
    */
  var Used: js.UndefOr[Integer] = js.native
}

object AccountAttribute {
  @scala.inline
  def apply(): AccountAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountAttribute]
  }
  @scala.inline
  implicit class AccountAttributeOps[Self <: AccountAttribute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaximum(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Maximum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Maximum")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withUsed(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Used")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Used")(js.undefined)
        ret
    }
  }
  
}

