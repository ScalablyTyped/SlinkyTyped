package typingsSlinky.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A known user.
  */
@js.native
trait SchemaKnownUser extends js.Object {
  /**
    * True if this is the user making the request.
    */
  var isCurrentUser: js.UndefOr[Boolean] = js.native
  /**
    * The identifier for this user that can be used with the People API to get
    * more information. The format is &quot;people/ACCOUNT_ID&quot;. See
    * https://developers.google.com/people/.
    */
  var personName: js.UndefOr[String] = js.native
}

object SchemaKnownUser {
  @scala.inline
  def apply(): SchemaKnownUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaKnownUser]
  }
  @scala.inline
  implicit class SchemaKnownUserOps[Self <: SchemaKnownUser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsCurrentUser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCurrentUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCurrentUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCurrentUser")(js.undefined)
        ret
    }
    @scala.inline
    def withPersonName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersonName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personName")(js.undefined)
        ret
    }
  }
  
}

