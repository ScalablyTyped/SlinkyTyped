package typingsSlinky.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait User extends js.Object {
  var FacebookID: String = js.native
  var FirstName: String = js.native
  var LastName: String = js.native
  var PersonID: String = js.native
  var UserFullName: String = js.native
  var UserID: Double = js.native
}

object User {
  @scala.inline
  def apply(
    FacebookID: String,
    FirstName: String,
    LastName: String,
    PersonID: String,
    UserFullName: String,
    UserID: Double
  ): User = {
    val __obj = js.Dynamic.literal(FacebookID = FacebookID.asInstanceOf[js.Any], FirstName = FirstName.asInstanceOf[js.Any], LastName = LastName.asInstanceOf[js.Any], PersonID = PersonID.asInstanceOf[js.Any], UserFullName = UserFullName.asInstanceOf[js.Any], UserID = UserID.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
  @scala.inline
  implicit class UserOps[Self <: User] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFacebookID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FacebookID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FirstName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPersonID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PersonID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserFullName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserFullName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserID")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

