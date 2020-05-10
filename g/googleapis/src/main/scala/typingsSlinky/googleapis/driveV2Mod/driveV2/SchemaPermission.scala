package typingsSlinky.googleapis.driveV2Mod.driveV2

import typingsSlinky.googleapis.AnonInherited
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A permission for a file.
  */
@js.native
trait SchemaPermission extends js.Object {
  /**
    * Additional roles for this user. Only commenter is currently allowed,
    * though more may be supported in the future.
    */
  var additionalRoles: js.UndefOr[js.Array[String]] = js.native
  /**
    * Deprecated.
    */
  var authKey: js.UndefOr[String] = js.native
  /**
    * Whether the account associated with this permission has been deleted.
    * This field only pertains to user and group permissions.
    */
  var deleted: js.UndefOr[Boolean] = js.native
  /**
    * The domain name of the entity this permission refers to. This is an
    * output-only field which is present when the permission type is user,
    * group or domain.
    */
  var domain: js.UndefOr[String] = js.native
  /**
    * The email address of the user or group this permission refers to. This is
    * an output-only field which is present when the permission type is user or
    * group.
    */
  var emailAddress: js.UndefOr[String] = js.native
  /**
    * The ETag of the permission.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The time at which this permission will expire (RFC 3339 date-time).
    * Expiration dates have the following restrictions:   - They can only be
    * set on user and group permissions  - The date must be in the future  -
    * The date cannot be more than a year in the future  - The date can only be
    * set on drive.permissions.update or drive.permissions.patch requests
    */
  var expirationDate: js.UndefOr[String] = js.native
  /**
    * The ID of the user this permission refers to, and identical to the
    * permissionId in the About and Files resources. When making a
    * drive.permissions.insert request, exactly one of the id or value fields
    * must be specified unless the permission type is anyone, in which case
    * both id and value are ignored.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * This is always drive#permission.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The name for this permission.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * A link to the profile photo, if available.
    */
  var photoLink: js.UndefOr[String] = js.native
  /**
    * The primary role for this user. While new values may be supported in the
    * future, the following are currently allowed:   - owner  - organizer  -
    * fileOrganizer  - writer  - reader
    */
  var role: js.UndefOr[String] = js.native
  /**
    * A link back to this permission.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * Details of whether the permissions on this Team Drive item are inherited
    * or directly on this item. This is an output-only field which is present
    * only for Team Drive items.
    */
  var teamDrivePermissionDetails: js.UndefOr[js.Array[AnonInherited]] = js.native
  /**
    * The account type. Allowed values are:   - user  - group  - domain  -
    * anyone
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The email address or domain name for the entity. This is used during
    * inserts and is not populated in responses. When making a
    * drive.permissions.insert request, exactly one of the id or value fields
    * must be specified unless the permission type is anyone, in which case
    * both id and value are ignored.
    */
  var value: js.UndefOr[String] = js.native
  /**
    * Whether the link is required for this permission.
    */
  var withLink: js.UndefOr[Boolean] = js.native
}

object SchemaPermission {
  @scala.inline
  def apply(): SchemaPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPermission]
  }
  @scala.inline
  implicit class SchemaPermissionOps[Self <: SchemaPermission] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalRoles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalRoles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalRoles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalRoles")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authKey")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleted")(js.undefined)
        ret
    }
    @scala.inline
    def withDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(js.undefined)
        ret
    }
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
    def withEtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(js.undefined)
        ret
    }
    @scala.inline
    def withExpirationDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpirationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationDate")(js.undefined)
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
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
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
    def withPhotoLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photoLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhotoLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photoLink")(js.undefined)
        ret
    }
    @scala.inline
    def withRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(js.undefined)
        ret
    }
    @scala.inline
    def withSelfLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelfLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(js.undefined)
        ret
    }
    @scala.inline
    def withTeamDrivePermissionDetails(value: js.Array[AnonInherited]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamDrivePermissionDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeamDrivePermissionDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamDrivePermissionDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withWithLink(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withLink")(js.undefined)
        ret
    }
  }
  
}

