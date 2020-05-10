package typingsSlinky.googleapis.driveV3Mod.driveV3

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleapis.AnonBackgroundImageLink
import typingsSlinky.googleapis.AnonLimit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about the user, the user&#39;s Drive, and system capabilities.
  */
@js.native
trait SchemaAbout extends js.Object {
  /**
    * Whether the user has installed the requesting app.
    */
  var appInstalled: js.UndefOr[Boolean] = js.native
  /**
    * Whether the user can create Team Drives.
    */
  var canCreateTeamDrives: js.UndefOr[Boolean] = js.native
  /**
    * A map of source MIME type to possible targets for all supported exports.
    */
  var exportFormats: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
  /**
    * The currently supported folder colors as RGB hex strings.
    */
  var folderColorPalette: js.UndefOr[js.Array[String]] = js.native
  /**
    * A map of source MIME type to possible targets for all supported imports.
    */
  var importFormats: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;drive#about&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * A map of maximum import sizes by MIME type, in bytes.
    */
  var maxImportSizes: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The maximum upload size in bytes.
    */
  var maxUploadSize: js.UndefOr[String] = js.native
  /**
    * The user&#39;s storage quota limits and usage. All fields are measured in
    * bytes.
    */
  var storageQuota: js.UndefOr[AnonLimit] = js.native
  /**
    * A list of themes that are supported for Team Drives.
    */
  var teamDriveThemes: js.UndefOr[js.Array[AnonBackgroundImageLink]] = js.native
  /**
    * The authenticated user.
    */
  var user: js.UndefOr[SchemaUser] = js.native
}

object SchemaAbout {
  @scala.inline
  def apply(): SchemaAbout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAbout]
  }
  @scala.inline
  implicit class SchemaAboutOps[Self <: SchemaAbout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppInstalled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appInstalled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppInstalled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appInstalled")(js.undefined)
        ret
    }
    @scala.inline
    def withCanCreateTeamDrives(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canCreateTeamDrives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanCreateTeamDrives: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canCreateTeamDrives")(js.undefined)
        ret
    }
    @scala.inline
    def withExportFormats(value: StringDictionary[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportFormats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportFormats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportFormats")(js.undefined)
        ret
    }
    @scala.inline
    def withFolderColorPalette(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folderColorPalette")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFolderColorPalette: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folderColorPalette")(js.undefined)
        ret
    }
    @scala.inline
    def withImportFormats(value: StringDictionary[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importFormats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportFormats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importFormats")(js.undefined)
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
    def withMaxImportSizes(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxImportSizes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxImportSizes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxImportSizes")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxUploadSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxUploadSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxUploadSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxUploadSize")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageQuota(value: AnonLimit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageQuota")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageQuota: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageQuota")(js.undefined)
        ret
    }
    @scala.inline
    def withTeamDriveThemes(value: js.Array[AnonBackgroundImageLink]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamDriveThemes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeamDriveThemes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamDriveThemes")(js.undefined)
        ret
    }
    @scala.inline
    def withUser(value: SchemaUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(js.undefined)
        ret
    }
  }
  
}

