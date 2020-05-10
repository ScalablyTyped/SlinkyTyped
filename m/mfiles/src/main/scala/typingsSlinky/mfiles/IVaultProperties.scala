package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFFileDataStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultProperties extends js.Object {
  var DisplayName: String = js.native
  var EncryptionOfFileDataAtRest: Boolean = js.native
  var ExtendedMetadataDrivenPermissions: Boolean = js.native
  var FileDataConnectionString: String = js.native
  var FileDataStorageType: MFFileDataStorage = js.native
  var FullTextSearchLanguage: String = js.native
  var Icon: js.Array[Double] = js.native
  var MainDataFolder: String = js.native
  var SQLDatabase: ISQLDatabase = js.native
  var SeparateLocationForFileData: IAdditionalFolders = js.native
  var VaultGUID: String = js.native
  def Clone(): IVaultProperties = js.native
}

object IVaultProperties {
  @scala.inline
  def apply(
    Clone: () => IVaultProperties,
    DisplayName: String,
    EncryptionOfFileDataAtRest: Boolean,
    ExtendedMetadataDrivenPermissions: Boolean,
    FileDataConnectionString: String,
    FileDataStorageType: MFFileDataStorage,
    FullTextSearchLanguage: String,
    Icon: js.Array[Double],
    MainDataFolder: String,
    SQLDatabase: ISQLDatabase,
    SeparateLocationForFileData: IAdditionalFolders,
    VaultGUID: String
  ): IVaultProperties = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), DisplayName = DisplayName.asInstanceOf[js.Any], EncryptionOfFileDataAtRest = EncryptionOfFileDataAtRest.asInstanceOf[js.Any], ExtendedMetadataDrivenPermissions = ExtendedMetadataDrivenPermissions.asInstanceOf[js.Any], FileDataConnectionString = FileDataConnectionString.asInstanceOf[js.Any], FileDataStorageType = FileDataStorageType.asInstanceOf[js.Any], FullTextSearchLanguage = FullTextSearchLanguage.asInstanceOf[js.Any], Icon = Icon.asInstanceOf[js.Any], MainDataFolder = MainDataFolder.asInstanceOf[js.Any], SQLDatabase = SQLDatabase.asInstanceOf[js.Any], SeparateLocationForFileData = SeparateLocationForFileData.asInstanceOf[js.Any], VaultGUID = VaultGUID.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVaultProperties]
  }
  @scala.inline
  implicit class IVaultPropertiesOps[Self <: IVaultProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: () => IVaultProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncryptionOfFileDataAtRest(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionOfFileDataAtRest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtendedMetadataDrivenPermissions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExtendedMetadataDrivenPermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileDataConnectionString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileDataConnectionString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileDataStorageType(value: MFFileDataStorage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileDataStorageType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullTextSearchLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FullTextSearchLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcon(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMainDataFolder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MainDataFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSQLDatabase(value: ISQLDatabase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SQLDatabase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeparateLocationForFileData(value: IAdditionalFolders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SeparateLocationForFileData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVaultGUID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VaultGUID")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

