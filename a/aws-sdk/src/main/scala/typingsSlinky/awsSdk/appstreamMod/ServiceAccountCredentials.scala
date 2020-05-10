package typingsSlinky.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceAccountCredentials extends js.Object {
  /**
    * The user name of the account. This account must have the following privileges: create computer objects, join computers to the domain, and change/reset the password on descendant computer objects for the organizational units specified.
    */
  var AccountName: typingsSlinky.awsSdk.appstreamMod.AccountName = js.native
  /**
    * The password for the account.
    */
  var AccountPassword: typingsSlinky.awsSdk.appstreamMod.AccountPassword = js.native
}

object ServiceAccountCredentials {
  @scala.inline
  def apply(AccountName: AccountName, AccountPassword: AccountPassword): ServiceAccountCredentials = {
    val __obj = js.Dynamic.literal(AccountName = AccountName.asInstanceOf[js.Any], AccountPassword = AccountPassword.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceAccountCredentials]
  }
  @scala.inline
  implicit class ServiceAccountCredentialsOps[Self <: ServiceAccountCredentials] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountName(value: AccountName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccountPassword(value: AccountPassword): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountPassword")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

