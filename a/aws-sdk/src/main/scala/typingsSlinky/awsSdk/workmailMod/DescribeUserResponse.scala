package typingsSlinky.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeUserResponse extends js.Object {
  /**
    * The date and time at which the user was disabled for Amazon WorkMail usage, in UNIX epoch time format.
    */
  var DisabledDate: js.UndefOr[js.Date] = js.native
  /**
    * The display name of the user.
    */
  var DisplayName: js.UndefOr[String] = js.native
  /**
    * The email of the user.
    */
  var Email: js.UndefOr[EmailAddress] = js.native
  /**
    * The date and time at which the user was enabled for Amazon WorkMail usage, in UNIX epoch time format.
    */
  var EnabledDate: js.UndefOr[js.Date] = js.native
  /**
    * The name for the user.
    */
  var Name: js.UndefOr[UserName] = js.native
  /**
    * The state of a user: enabled (registered to Amazon WorkMail) or disabled (deregistered or never registered to WorkMail).
    */
  var State: js.UndefOr[EntityState] = js.native
  /**
    * The identifier for the described user.
    */
  var UserId: js.UndefOr[WorkMailIdentifier] = js.native
  /**
    * In certain cases, other entities are modeled as users. If interoperability is enabled, resources are imported into Amazon WorkMail as users. Because different WorkMail organizations rely on different directory types, administrators can distinguish between an unregistered user (account is disabled and has a user role) and the directory administrators. The values are USER, RESOURCE, and SYSTEM_USER.
    */
  var UserRole: js.UndefOr[typingsSlinky.awsSdk.workmailMod.UserRole] = js.native
}

object DescribeUserResponse {
  @scala.inline
  def apply(): DescribeUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUserResponse]
  }
  @scala.inline
  implicit class DescribeUserResponseOps[Self <: DescribeUserResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisabledDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisabledDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisabledDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayName")(js.undefined)
        ret
    }
    @scala.inline
    def withEmail(value: EmailAddress): Self = {
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
    def withEnabledDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnabledDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabledDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnabledDate")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: UserName): Self = {
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
    def withState(value: EntityState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
    @scala.inline
    def withUserId(value: WorkMailIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserId")(js.undefined)
        ret
    }
    @scala.inline
    def withUserRole(value: UserRole): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserRole")(js.undefined)
        ret
    }
  }
  
}

