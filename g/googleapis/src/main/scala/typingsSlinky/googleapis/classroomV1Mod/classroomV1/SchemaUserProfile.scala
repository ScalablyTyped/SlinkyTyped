package typingsSlinky.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Global information for a user.
  */
@js.native
trait SchemaUserProfile extends js.Object {
  /**
    * Email address of the user.  Read-only.
    */
  var emailAddress: js.UndefOr[String] = js.native
  /**
    * Identifier of the user.  Read-only.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Name of the user.  Read-only.
    */
  var name: js.UndefOr[SchemaName] = js.native
  /**
    * Global permissions of the user.  Read-only.
    */
  var permissions: js.UndefOr[js.Array[SchemaGlobalPermission]] = js.native
  /**
    * URL of user&#39;s profile photo.  Read-only.
    */
  var photoUrl: js.UndefOr[String] = js.native
  /**
    * Represents whether a G Suite for Education user&#39;s domain
    * administrator has explicitly verified them as being a teacher. If the
    * user is not a member of a G Suite for Education domain, than this field
    * will always be false.  Read-only
    */
  var verifiedTeacher: js.UndefOr[Boolean] = js.native
}

object SchemaUserProfile {
  @scala.inline
  def apply(): SchemaUserProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserProfile]
  }
  @scala.inline
  implicit class SchemaUserProfileOps[Self <: SchemaUserProfile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmailAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
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
    def withName(value: SchemaName): Self = {
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
    def withPermissions(value: js.Array[SchemaGlobalPermission]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(js.undefined)
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
    def withVerifiedTeacher(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifiedTeacher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerifiedTeacher: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifiedTeacher")(js.undefined)
        ret
    }
  }
  
}

