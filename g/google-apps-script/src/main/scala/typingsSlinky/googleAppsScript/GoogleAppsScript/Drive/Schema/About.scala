package typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait About extends js.Object {
  var additionalRoleInfo: js.UndefOr[js.Array[AboutAdditionalRoleInfo]] = js.native
  var canCreateDrives: js.UndefOr[Boolean] = js.native
  var canCreateTeamDrives: js.UndefOr[Boolean] = js.native
  var domainSharingPolicy: js.UndefOr[String] = js.native
  var driveThemes: js.UndefOr[js.Array[AboutDriveThemes]] = js.native
  var etag: js.UndefOr[String] = js.native
  var exportFormats: js.UndefOr[js.Array[AboutExportFormats]] = js.native
  var features: js.UndefOr[js.Array[AboutFeatures]] = js.native
  var folderColorPalette: js.UndefOr[js.Array[String]] = js.native
  var importFormats: js.UndefOr[js.Array[AboutImportFormats]] = js.native
  var isCurrentAppInstalled: js.UndefOr[Boolean] = js.native
  var kind: js.UndefOr[String] = js.native
  var languageCode: js.UndefOr[String] = js.native
  var largestChangeId: js.UndefOr[String] = js.native
  var maxUploadSizes: js.UndefOr[js.Array[AboutMaxUploadSizes]] = js.native
  var name: js.UndefOr[String] = js.native
  var permissionId: js.UndefOr[String] = js.native
  var quotaBytesByService: js.UndefOr[js.Array[AboutQuotaBytesByService]] = js.native
  var quotaBytesTotal: js.UndefOr[String] = js.native
  var quotaBytesUsed: js.UndefOr[String] = js.native
  var quotaBytesUsedAggregate: js.UndefOr[String] = js.native
  var quotaBytesUsedInTrash: js.UndefOr[String] = js.native
  var quotaType: js.UndefOr[String] = js.native
  var remainingChangeIds: js.UndefOr[String] = js.native
  var rootFolderId: js.UndefOr[String] = js.native
  var selfLink: js.UndefOr[String] = js.native
  var teamDriveThemes: js.UndefOr[js.Array[AboutTeamDriveThemes]] = js.native
  var user: js.UndefOr[User] = js.native
}

object About {
  @scala.inline
  def apply(): About = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[About]
  }
  @scala.inline
  implicit class AboutOps[Self <: About] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalRoleInfo(value: js.Array[AboutAdditionalRoleInfo]): Self = {
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
    def withCanCreateDrives(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canCreateDrives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanCreateDrives: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canCreateDrives")(js.undefined)
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
    def withDriveThemes(value: js.Array[AboutDriveThemes]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driveThemes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDriveThemes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driveThemes")(js.undefined)
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
    def withExportFormats(value: js.Array[AboutExportFormats]): Self = {
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
    def withFeatures(value: js.Array[AboutFeatures]): Self = {
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
    def withImportFormats(value: js.Array[AboutImportFormats]): Self = {
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
    def withMaxUploadSizes(value: js.Array[AboutMaxUploadSizes]): Self = {
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
    def withQuotaBytesByService(value: js.Array[AboutQuotaBytesByService]): Self = {
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
    def withTeamDriveThemes(value: js.Array[AboutTeamDriveThemes]): Self = {
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
    def withUser(value: User): Self = {
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

