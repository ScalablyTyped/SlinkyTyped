package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessLevelFilter extends js.Object {
  /**
    * The access level.    Account - Filter results based on the account.    Role - Filter results based on the federated role of the specified user.    User - Filter results based on the specified user.  
    */
  var Key: js.UndefOr[AccessLevelFilterKey] = js.native
  /**
    * The user to which the access level applies. The only supported value is Self.
    */
  var Value: js.UndefOr[AccessLevelFilterValue] = js.native
}

object AccessLevelFilter {
  @scala.inline
  def apply(): AccessLevelFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessLevelFilter]
  }
  @scala.inline
  implicit class AccessLevelFilterOps[Self <: AccessLevelFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: AccessLevelFilterKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Key")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: AccessLevelFilterValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(js.undefined)
        ret
    }
  }
  
}

