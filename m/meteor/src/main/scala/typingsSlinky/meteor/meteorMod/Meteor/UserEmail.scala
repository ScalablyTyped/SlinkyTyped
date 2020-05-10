package typingsSlinky.meteor.meteorMod.Meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Settings **/
/** User **/
@js.native
trait UserEmail extends js.Object {
  var address: String = js.native
  var verified: Boolean = js.native
}

object UserEmail {
  @scala.inline
  def apply(address: String, verified: Boolean): UserEmail = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserEmail]
  }
  @scala.inline
  implicit class UserEmailOps[Self <: UserEmail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerified(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verified")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

