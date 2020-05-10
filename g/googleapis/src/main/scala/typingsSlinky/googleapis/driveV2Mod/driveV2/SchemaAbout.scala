package typingsSlinky.googleapis.driveV2Mod.driveV2

import typingsSlinky.googleapis.AnonBackgroundImageLink
import typingsSlinky.googleapis.AnonBytesUsed
import typingsSlinky.googleapis.AnonFeatureName
import typingsSlinky.googleapis.AnonRoleSets
import typingsSlinky.googleapis.AnonSizeType
import typingsSlinky.googleapis.AnonTargets
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An item with user information and settings.
  */
@js.native
trait SchemaAbout extends js.Object {
  /**
    * Information about supported additional roles per file type. The most
    * specific type takes precedence.
    */
  var additionalRoleInfo: js.UndefOr[js.Array[AnonRoleSets]] = js.native
  /**
    * Whether the user can create Team Drives.
    */
  var canCreateTeamDrives: js.UndefOr[Boolean] = js.native
  /**
    * The domain sharing policy for the current user. Possible values are:   -
    * allowed  - allowedWithWarning  - incomingOnly  - disallowed
    */
  var domainSharingPolicy: js.UndefOr[String] = js.native
  /**
    * The ETag of the item.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The allowable export formats.
    */
  var exportFormats: js.UndefOr[js.Array[AnonTargets]] = js.native
  /**
    * List of additional features enabled on this account.
    */
  var features: js.UndefOr[js.Array[AnonFeatureName]] = js.native
  /**
    * The palette of allowable folder colors as RGB hex strings.
    */
  var folderColorPalette: js.UndefOr[js.Array[String]] = js.native
  /**
    * The allowable import formats.
    */
  var importFormats: js.UndefOr[js.Array[AnonTargets]] = js.native
  /**
    * A boolean indicating whether the authenticated app is installed by the
    * authenticated user.
    */
  var isCurrentAppInstalled: js.UndefOr[Boolean] = js.native
  /**
    * This is always drive#about.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The user&#39;s language or locale code, as defined by BCP 47, with some
    * extensions from Unicode&#39;s LDML format
    * (http://www.unicode.org/reports/tr35/).
    */
  var languageCode: js.UndefOr[String] = js.native
  /**
    * The largest change id.
    */
  var largestChangeId: js.UndefOr[String] = js.native
  /**
    * List of max upload sizes for each file type. The most specific type takes
    * precedence.
    */
  var maxUploadSizes: js.UndefOr[js.Array[AnonSizeType]] = js.native
  /**
    * The name of the current user.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The current user&#39;s ID as visible in the permissions collection.
    */
  var permissionId: js.UndefOr[String] = js.native
  /**
    * The amount of storage quota used by different Google services.
    */
  var quotaBytesByService: js.UndefOr[js.Array[AnonBytesUsed]] = js.native
  /**
    * The total number of quota bytes.
    */
  var quotaBytesTotal: js.UndefOr[String] = js.native
  /**
    * The number of quota bytes used by Google Drive.
    */
  var quotaBytesUsed: js.UndefOr[String] = js.native
  /**
    * The number of quota bytes used by all Google apps (Drive, Picasa, etc.).
    */
  var quotaBytesUsedAggregate: js.UndefOr[String] = js.native
  /**
    * The number of quota bytes used by trashed items.
    */
  var quotaBytesUsedInTrash: js.UndefOr[String] = js.native
  /**
    * The type of the user&#39;s storage quota. Possible values are:   -
    * LIMITED  - UNLIMITED
    */
  var quotaType: js.UndefOr[String] = js.native
  /**
    * The number of remaining change ids, limited to no more than 2500.
    */
  var remainingChangeIds: js.UndefOr[String] = js.native
  /**
    * The id of the root folder.
    */
  var rootFolderId: js.UndefOr[String] = js.native
  /**
    * A link back to this item.
    */
  var selfLink: js.UndefOr[String] = js.native
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
    def withAdditionalRoleInfo(value: js.Array[AnonRoleSets]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalRoleInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalRoleInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalRoleInfo")(js.undefined)
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
    def withDomainSharingPolicy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainSharingPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainSharingPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainSharingPolicy")(js.undefined)
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
    def withExportFormats(value: js.Array[AnonTargets]): Self = {
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
    def withFeatures(value: js.Array[AnonFeatureName]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(js.undefined)
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
    def withImportFormats(value: js.Array[AnonTargets]): Self = {
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
    def withIsCurrentAppInstalled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCurrentAppInstalled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCurrentAppInstalled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCurrentAppInstalled")(js.undefined)
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
    def withLanguageCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguageCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageCode")(js.undefined)
        ret
    }
    @scala.inline
    def withLargestChangeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("largestChangeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLargestChangeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("largestChangeId")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxUploadSizes(value: js.Array[AnonSizeType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxUploadSizes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxUploadSizes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxUploadSizes")(js.undefined)
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
    def withQuotaBytesByService(value: js.Array[AnonBytesUsed]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaBytesByService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuotaBytesByService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaBytesByService")(js.undefined)
        ret
    }
    @scala.inline
    def withQuotaBytesTotal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaBytesTotal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuotaBytesTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaBytesTotal")(js.undefined)
        ret
    }
    @scala.inline
    def withQuotaBytesUsed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaBytesUsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuotaBytesUsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaBytesUsed")(js.undefined)
        ret
    }
    @scala.inline
    def withQuotaBytesUsedAggregate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaBytesUsedAggregate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuotaBytesUsedAggregate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaBytesUsedAggregate")(js.undefined)
        ret
    }
    @scala.inline
    def withQuotaBytesUsedInTrash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaBytesUsedInTrash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuotaBytesUsedInTrash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaBytesUsedInTrash")(js.undefined)
        ret
    }
    @scala.inline
    def withQuotaType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuotaType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaType")(js.undefined)
        ret
    }
    @scala.inline
    def withRemainingChangeIds(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remainingChangeIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemainingChangeIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remainingChangeIds")(js.undefined)
        ret
    }
    @scala.inline
    def withRootFolderId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootFolderId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootFolderId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootFolderId")(js.undefined)
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

