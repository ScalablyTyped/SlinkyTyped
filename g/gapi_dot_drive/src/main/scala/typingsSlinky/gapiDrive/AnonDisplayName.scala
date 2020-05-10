package typingsSlinky.gapiDrive

import typingsSlinky.gapiDrive.gapiDriveStrings.driveNumbersignuser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDisplayName extends js.Object {
  var displayName: String = js.native
  var emailAddress: String = js.native
  var isAuthenticatedUser: Boolean = js.native
  var kind: driveNumbersignuser = js.native
  var permissionId: String = js.native
  var picture: AnonUrl = js.native
}

object AnonDisplayName {
  @scala.inline
  def apply(
    displayName: String,
    emailAddress: String,
    isAuthenticatedUser: Boolean,
    kind: driveNumbersignuser,
    permissionId: String,
    picture: AnonUrl
  ): AnonDisplayName = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], emailAddress = emailAddress.asInstanceOf[js.Any], isAuthenticatedUser = isAuthenticatedUser.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], permissionId = permissionId.asInstanceOf[js.Any], picture = picture.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDisplayName]
  }
  @scala.inline
  implicit class AnonDisplayNameOps[Self <: AnonDisplayName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmailAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsAuthenticatedUser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAuthenticatedUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: driveNumbersignuser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermissionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPicture(value: AnonUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("picture")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

