package typingsSlinky.maximMazurokGapiClientDrive.gapi.client.drive

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.maximMazurokGapiClientDrive.anon.BackgroundImageLink
import typingsSlinky.maximMazurokGapiClientDrive.anon.Limit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait About extends StObject {
  
  /** Whether the user has installed the requesting app. */
  var appInstalled: js.UndefOr[Boolean] = js.native
  
  /** Whether the user can create shared drives. */
  var canCreateDrives: js.UndefOr[Boolean] = js.native
  
  /** Deprecated - use canCreateDrives instead. */
  var canCreateTeamDrives: js.UndefOr[Boolean] = js.native
  
  /** A list of themes that are supported for shared drives. */
  var driveThemes: js.UndefOr[js.Array[BackgroundImageLink]] = js.native
  
  /** A map of source MIME type to possible targets for all supported exports. */
  var exportFormats: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: std.Array<string>}
    */ typingsSlinky.maximMazurokGapiClientDrive.maximMazurokGapiClientDriveStrings.About with TopLevel[js.Any]
  ] = js.native
  
  /** The currently supported folder colors as RGB hex strings. */
  var folderColorPalette: js.UndefOr[js.Array[String]] = js.native
  
  /** A map of source MIME type to possible targets for all supported imports. */
  var importFormats: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: std.Array<string>}
    */ typingsSlinky.maximMazurokGapiClientDrive.maximMazurokGapiClientDriveStrings.About with TopLevel[js.Any]
  ] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "drive#about". */
  var kind: js.UndefOr[String] = js.native
  
  /** A map of maximum import sizes by MIME type, in bytes. */
  var maxImportSizes: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typingsSlinky.maximMazurokGapiClientDrive.maximMazurokGapiClientDriveStrings.About with TopLevel[js.Any]
  ] = js.native
  
  /** The maximum upload size in bytes. */
  var maxUploadSize: js.UndefOr[String] = js.native
  
  /** The user's storage quota limits and usage. All fields are measured in bytes. */
  var storageQuota: js.UndefOr[Limit] = js.native
  
  /** Deprecated - use driveThemes instead. */
  var teamDriveThemes: js.UndefOr[js.Array[BackgroundImageLink]] = js.native
  
  /** The authenticated user. */
  var user: js.UndefOr[User] = js.native
}
object About {
  
  @scala.inline
  def apply(): About = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[About]
  }
  
  @scala.inline
  implicit class AboutMutableBuilder[Self <: About] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppInstalled(value: Boolean): Self = StObject.set(x, "appInstalled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppInstalledUndefined: Self = StObject.set(x, "appInstalled", js.undefined)
    
    @scala.inline
    def setCanCreateDrives(value: Boolean): Self = StObject.set(x, "canCreateDrives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanCreateDrivesUndefined: Self = StObject.set(x, "canCreateDrives", js.undefined)
    
    @scala.inline
    def setCanCreateTeamDrives(value: Boolean): Self = StObject.set(x, "canCreateTeamDrives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanCreateTeamDrivesUndefined: Self = StObject.set(x, "canCreateTeamDrives", js.undefined)
    
    @scala.inline
    def setDriveThemes(value: js.Array[BackgroundImageLink]): Self = StObject.set(x, "driveThemes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriveThemesUndefined: Self = StObject.set(x, "driveThemes", js.undefined)
    
    @scala.inline
    def setDriveThemesVarargs(value: BackgroundImageLink*): Self = StObject.set(x, "driveThemes", js.Array(value :_*))
    
    @scala.inline
    def setExportFormats(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: std.Array<string>}
      */ typingsSlinky.maximMazurokGapiClientDrive.maximMazurokGapiClientDriveStrings.About with TopLevel[js.Any]
    ): Self = StObject.set(x, "exportFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportFormatsUndefined: Self = StObject.set(x, "exportFormats", js.undefined)
    
    @scala.inline
    def setFolderColorPalette(value: js.Array[String]): Self = StObject.set(x, "folderColorPalette", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolderColorPaletteUndefined: Self = StObject.set(x, "folderColorPalette", js.undefined)
    
    @scala.inline
    def setFolderColorPaletteVarargs(value: String*): Self = StObject.set(x, "folderColorPalette", js.Array(value :_*))
    
    @scala.inline
    def setImportFormats(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: std.Array<string>}
      */ typingsSlinky.maximMazurokGapiClientDrive.maximMazurokGapiClientDriveStrings.About with TopLevel[js.Any]
    ): Self = StObject.set(x, "importFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportFormatsUndefined: Self = StObject.set(x, "importFormats", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMaxImportSizes(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typingsSlinky.maximMazurokGapiClientDrive.maximMazurokGapiClientDriveStrings.About with TopLevel[js.Any]
    ): Self = StObject.set(x, "maxImportSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxImportSizesUndefined: Self = StObject.set(x, "maxImportSizes", js.undefined)
    
    @scala.inline
    def setMaxUploadSize(value: String): Self = StObject.set(x, "maxUploadSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUploadSizeUndefined: Self = StObject.set(x, "maxUploadSize", js.undefined)
    
    @scala.inline
    def setStorageQuota(value: Limit): Self = StObject.set(x, "storageQuota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageQuotaUndefined: Self = StObject.set(x, "storageQuota", js.undefined)
    
    @scala.inline
    def setTeamDriveThemes(value: js.Array[BackgroundImageLink]): Self = StObject.set(x, "teamDriveThemes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamDriveThemesUndefined: Self = StObject.set(x, "teamDriveThemes", js.undefined)
    
    @scala.inline
    def setTeamDriveThemesVarargs(value: BackgroundImageLink*): Self = StObject.set(x, "teamDriveThemes", js.Array(value :_*))
    
    @scala.inline
    def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
