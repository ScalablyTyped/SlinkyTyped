package typingsSlinky.gapiDrive.gapi.client.drive

import typingsSlinky.gapiDrive.AnonAdditionalRoles
import typingsSlinky.gapiDrive.gapiDriveStrings.driveNumbersignpermission
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PermissionResource extends js.Object {
  var additionalRoles: js.Array[String] = js.native
  var authKey: String = js.native
  var deleted: Boolean = js.native
  var domain: String = js.native
  var emailAddress: String = js.native
  var etag: String = js.native
  var expirationDate: js.Date = js.native
  var id: String = js.native
  var kind: driveNumbersignpermission = js.native
  var name: String = js.native
  var photoLink: String = js.native
  var role: String = js.native
  var selfLink: String = js.native
  var teamDrivePermissionDetails: js.Array[AnonAdditionalRoles] = js.native
  var `type`: String = js.native
  var value: String = js.native
  var withLink: Boolean = js.native
}

object PermissionResource {
  @scala.inline
  def apply(
    additionalRoles: js.Array[String],
    authKey: String,
    deleted: Boolean,
    domain: String,
    emailAddress: String,
    etag: String,
    expirationDate: js.Date,
    id: String,
    kind: driveNumbersignpermission,
    name: String,
    photoLink: String,
    role: String,
    selfLink: String,
    teamDrivePermissionDetails: js.Array[AnonAdditionalRoles],
    `type`: String,
    value: String,
    withLink: Boolean
  ): PermissionResource = {
    val __obj = js.Dynamic.literal(additionalRoles = additionalRoles.asInstanceOf[js.Any], authKey = authKey.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], emailAddress = emailAddress.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], expirationDate = expirationDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], photoLink = photoLink.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], selfLink = selfLink.asInstanceOf[js.Any], teamDrivePermissionDetails = teamDrivePermissionDetails.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], withLink = withLink.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionResource]
  }
  @scala.inline
  implicit class PermissionResourceOps[Self <: PermissionResource] (val x: Self) extends AnyVal {
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
    def withAuthKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmailAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpirationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: driveNumbersignpermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhotoLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photoLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelfLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeamDrivePermissionDetails(value: js.Array[AnonAdditionalRoles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamDrivePermissionDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWithLink(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withLink")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

