package typingsSlinky.googleapis.appsactivityV1Mod.appsactivityV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation of a user.
  */
@js.native
trait SchemaUser extends js.Object {
  /**
    * A boolean which indicates whether the specified User was deleted. If
    * true, name, photo and permission_id will be omitted.
    */
  var isDeleted: js.UndefOr[Boolean] = js.native
  /**
    * Whether the user is the authenticated user.
    */
  var isMe: js.UndefOr[Boolean] = js.native
  /**
    * The displayable name of the user.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The permission ID associated with this user. Equivalent to the Drive
    * API&#39;s permission ID for this user, returned as part of the Drive
    * Permissions resource.
    */
  var permissionId: js.UndefOr[String] = js.native
  /**
    * The profile photo of the user. Not present if the user has no profile
    * photo.
    */
  var photo: js.UndefOr[SchemaPhoto] = js.native
}

object SchemaUser {
  @scala.inline
  def apply(): SchemaUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUser]
  }
  @scala.inline
  implicit class SchemaUserOps[Self <: SchemaUser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsDeleted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDeleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDeleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDeleted")(js.undefined)
        ret
    }
    @scala.inline
    def withIsMe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsMe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMe")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
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
    def withPermissionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermissionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissionId")(js.undefined)
        ret
    }
    @scala.inline
    def withPhoto(value: SchemaPhoto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhoto: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photo")(js.undefined)
        ret
    }
  }
  
}

