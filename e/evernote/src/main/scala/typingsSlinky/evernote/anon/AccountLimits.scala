package typingsSlinky.evernote.anon

import typingsSlinky.evernote.mod.Types.Accounting
import typingsSlinky.evernote.mod.Types.BusinessUserInfo
import typingsSlinky.evernote.mod.Types.PrivilegeLevel
import typingsSlinky.evernote.mod.Types.ServiceLevel
import typingsSlinky.evernote.mod.Types.Timestamp
import typingsSlinky.evernote.mod.Types.UserAttributes
import typingsSlinky.evernote.mod.Types.UserID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountLimits extends js.Object {
  var accountLimits: js.UndefOr[typingsSlinky.evernote.mod.Types.AccountLimits] = js.native
  var accounting: js.UndefOr[Accounting] = js.native
  var active: js.UndefOr[Boolean] = js.native
  var attributes: js.UndefOr[UserAttributes] = js.native
  var businessUserInfo: js.UndefOr[BusinessUserInfo] = js.native
  var created: js.UndefOr[Timestamp] = js.native
  var deleted: js.UndefOr[Timestamp] = js.native
  var email: js.UndefOr[String] = js.native
  var id: js.UndefOr[UserID] = js.native
  var name: js.UndefOr[String] = js.native
  var photoLastUpdated: js.UndefOr[Timestamp] = js.native
  var photoUrl: js.UndefOr[String] = js.native
  var privilege: js.UndefOr[PrivilegeLevel] = js.native
  var serviceLevel: js.UndefOr[ServiceLevel] = js.native
  var shardId: js.UndefOr[String] = js.native
  var timezone: js.UndefOr[String] = js.native
  var updated: js.UndefOr[Timestamp] = js.native
  var username: js.UndefOr[String] = js.native
}

object AccountLimits {
  @scala.inline
  def apply(): AccountLimits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountLimits]
  }
  @scala.inline
  implicit class AccountLimitsOps[Self <: AccountLimits] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountLimits(value: typingsSlinky.evernote.mod.Types.AccountLimits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountLimits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountLimits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountLimits")(js.undefined)
        ret
    }
    @scala.inline
    def withAccounting(value: Accounting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accounting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccounting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accounting")(js.undefined)
        ret
    }
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
    @scala.inline
    def withAttributes(value: UserAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withBusinessUserInfo(value: BusinessUserInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("businessUserInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBusinessUserInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("businessUserInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withCreated(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleted(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleted")(js.undefined)
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: UserID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPhotoLastUpdated(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photoLastUpdated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhotoLastUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photoLastUpdated")(js.undefined)
        ret
    }
    @scala.inline
    def withPhotoUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photoUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhotoUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photoUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivilege(value: PrivilegeLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privilege")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivilege: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privilege")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceLevel(value: ServiceLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withShardId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shardId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShardId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shardId")(js.undefined)
        ret
    }
    @scala.inline
    def withTimezone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimezone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdated(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(js.undefined)
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(js.undefined)
        ret
    }
  }
  
}

