package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Member extends js.Object {
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The member email address.
    */
  var Email: js.UndefOr[SensitiveString] = js.native
  /**
    * The member name.
    */
  var FullName: js.UndefOr[SensitiveString] = js.native
  /**
    * The member ID (user ID or bot ID).
    */
  var MemberId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The member type.
    */
  var MemberType: js.UndefOr[typingsSlinky.awsSdk.chimeMod.MemberType] = js.native
}

object Member {
  @scala.inline
  def apply(): Member = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Member]
  }
  @scala.inline
  implicit class MemberOps[Self <: Member] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: NonEmptyString): Self = {
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
    def withEmail(value: SensitiveString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Email")(js.undefined)
        ret
    }
    @scala.inline
    def withFullName(value: SensitiveString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FullName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FullName")(js.undefined)
        ret
    }
    @scala.inline
    def withMemberId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemberId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemberId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemberId")(js.undefined)
        ret
    }
    @scala.inline
    def withMemberType(value: MemberType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemberType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemberType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemberType")(js.undefined)
        ret
    }
  }
  
}

