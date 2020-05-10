package typingsSlinky.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Member extends js.Object {
  /**
    * Member account ID.
    */
  var AccountId: typingsSlinky.awsSdk.guarddutyMod.AccountId = js.native
  /**
    * Member account's detector ID.
    */
  var DetectorId: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.DetectorId] = js.native
  /**
    * Member account's email address.
    */
  var Email: typingsSlinky.awsSdk.guarddutyMod.Email = js.native
  /**
    * Timestamp at which the invitation was sent
    */
  var InvitedAt: js.UndefOr[String] = js.native
  /**
    * Master account ID.
    */
  var MasterId: String = js.native
  /**
    * The status of the relationship between the member and the master.
    */
  var RelationshipStatus: String = js.native
  /**
    * Member last updated timestamp.
    */
  var UpdatedAt: String = js.native
}

object Member {
  @scala.inline
  def apply(
    AccountId: AccountId,
    Email: Email,
    MasterId: String,
    RelationshipStatus: String,
    UpdatedAt: String
  ): Member = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any], MasterId = MasterId.asInstanceOf[js.Any], RelationshipStatus = RelationshipStatus.asInstanceOf[js.Any], UpdatedAt = UpdatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Member]
  }
  @scala.inline
  implicit class MemberOps[Self <: Member] (val x: Self) extends AnyVal {
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
    def withEmail(value: Email): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMasterId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MasterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelationshipStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelationshipStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdatedAt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetectorId(value: DetectorId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DetectorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetectorId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DetectorId")(js.undefined)
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
  }
  
}

