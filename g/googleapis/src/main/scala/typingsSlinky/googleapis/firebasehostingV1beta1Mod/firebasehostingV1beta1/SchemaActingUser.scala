package typingsSlinky.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains metadata about the user who performed an action, such as creating
  * a release or finalizing a version.
  */
@js.native
trait SchemaActingUser extends js.Object {
  /**
    * The email address of the user when the user performed the action.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * A profile image URL for the user. May not be present if the user has
    * changed their email address or deleted their account.
    */
  var imageUrl: js.UndefOr[String] = js.native
}

object SchemaActingUser {
  @scala.inline
  def apply(): SchemaActingUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActingUser]
  }
  @scala.inline
  implicit class SchemaActingUserOps[Self <: SchemaActingUser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrl")(js.undefined)
        ret
    }
  }
  
}

