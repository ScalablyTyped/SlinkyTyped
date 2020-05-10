package typingsSlinky.googleapis.driveV2Mod.driveV2

import typingsSlinky.googleapis.AnonAdminManagedRestrictions
import typingsSlinky.googleapis.AnonCanChangeCopyRequiresWriterPermissionRestriction
import typingsSlinky.googleapis.AnonXCoordinate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Representation of a Team Drive.
  */
@js.native
trait SchemaTeamDrive extends js.Object {
  /**
    * An image file and cropping parameters from which a background image for
    * this Team Drive is set. This is a write only field; it can only be set on
    * drive.teamdrives.update requests that don&#39;t set themeId. When
    * specified, all fields of the backgroundImageFile must be set.
    */
  var backgroundImageFile: js.UndefOr[AnonXCoordinate] = js.native
  /**
    * A short-lived link to this Team Drive&#39;s background image.
    */
  var backgroundImageLink: js.UndefOr[String] = js.native
  /**
    * Capabilities the current user has on this Team Drive.
    */
  var capabilities: js.UndefOr[AnonCanChangeCopyRequiresWriterPermissionRestriction] = js.native
  /**
    * The color of this Team Drive as an RGB hex string. It can only be set on
    * a drive.teamdrives.update request that does not set themeId.
    */
  var colorRgb: js.UndefOr[String] = js.native
  /**
    * The time at which the Team Drive was created (RFC 3339 date-time).
    */
  var createdDate: js.UndefOr[String] = js.native
  /**
    * The ID of this Team Drive which is also the ID of the top level folder of
    * this Team Drive.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * This is always drive#teamDrive
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The name of this Team Drive.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * A set of restrictions that apply to this Team Drive or items inside this
    * Team Drive.
    */
  var restrictions: js.UndefOr[AnonAdminManagedRestrictions] = js.native
  /**
    * The ID of the theme from which the background image and color will be
    * set. The set of possible teamDriveThemes can be retrieved from a
    * drive.about.get response. When not specified on a drive.teamdrives.insert
    * request, a random theme is chosen from which the background image and
    * color are set. This is a write-only field; it can only be set on requests
    * that don&#39;t set colorRgb or backgroundImageFile.
    */
  var themeId: js.UndefOr[String] = js.native
}

object SchemaTeamDrive {
  @scala.inline
  def apply(): SchemaTeamDrive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTeamDrive]
  }
  @scala.inline
  implicit class SchemaTeamDriveOps[Self <: SchemaTeamDrive] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundImageFile(value: AnonXCoordinate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundImageFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundImageFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundImageFile")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundImageLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundImageLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundImageLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundImageLink")(js.undefined)
        ret
    }
    @scala.inline
    def withCapabilities(value: AnonCanChangeCopyRequiresWriterPermissionRestriction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapabilities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capabilities")(js.undefined)
        ret
    }
    @scala.inline
    def withColorRgb(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorRgb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorRgb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorRgb")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdDate")(js.undefined)
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
    def withRestrictions(value: AnonAdminManagedRestrictions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestrictions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictions")(js.undefined)
        ret
    }
    @scala.inline
    def withThemeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThemeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themeId")(js.undefined)
        ret
    }
  }
  
}

