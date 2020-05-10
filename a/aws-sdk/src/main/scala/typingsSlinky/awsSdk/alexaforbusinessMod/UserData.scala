package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserData extends js.Object {
  /**
    * The email of a user.
    */
  var Email: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.Email] = js.native
  /**
    * The enrollment ARN of a user.
    */
  var EnrollmentId: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.EnrollmentId] = js.native
  /**
    * The enrollment status of a user.
    */
  var EnrollmentStatus: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.EnrollmentStatus] = js.native
  /**
    * The first name of a user.
    */
  var FirstName: js.UndefOr[userFirstName] = js.native
  /**
    * The last name of a user.
    */
  var LastName: js.UndefOr[userLastName] = js.native
  /**
    * The ARN of a user.
    */
  var UserArn: js.UndefOr[Arn] = js.native
}

object UserData {
  @scala.inline
  def apply(): UserData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserData]
  }
  @scala.inline
  implicit class UserDataOps[Self <: UserData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmail(value: Email): Self = {
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
    def withEnrollmentId(value: EnrollmentId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnrollmentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnrollmentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnrollmentId")(js.undefined)
        ret
    }
    @scala.inline
    def withEnrollmentStatus(value: EnrollmentStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnrollmentStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnrollmentStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnrollmentStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstName(value: userFirstName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FirstName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FirstName")(js.undefined)
        ret
    }
    @scala.inline
    def withLastName(value: userLastName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastName")(js.undefined)
        ret
    }
    @scala.inline
    def withUserArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserArn")(js.undefined)
        ret
    }
  }
  
}

