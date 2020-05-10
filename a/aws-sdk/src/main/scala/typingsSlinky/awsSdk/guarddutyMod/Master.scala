package typingsSlinky.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Master extends js.Object {
  /**
    * The ID of the account used as the Master account.
    */
  var AccountId: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.AccountId] = js.native
  /**
    * This value is used to validate the master account to the member account.
    */
  var InvitationId: js.UndefOr[String] = js.native
  /**
    * Timestamp at which the invitation was sent.
    */
  var InvitedAt: js.UndefOr[String] = js.native
  /**
    * The status of the relationship between the master and member accounts.
    */
  var RelationshipStatus: js.UndefOr[String] = js.native
}

object Master {
  @scala.inline
  def apply(): Master = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Master]
  }
  @scala.inline
  implicit class MasterOps[Self <: Master] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: AccountId): Self = {
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
    @scala.inline
    def withInvitationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InvitationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvitationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InvitationId")(js.undefined)
        ret
    }
    @scala.inline
    def withInvitedAt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InvitedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvitedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InvitedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withRelationshipStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelationshipStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelationshipStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelationshipStatus")(js.undefined)
        ret
    }
  }
  
}

