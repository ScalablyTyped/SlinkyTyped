package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFBuiltInDocumentClass
import typingsSlinky.mfiles.MFiles.MFBuiltInObjectClass
import typingsSlinky.mfiles.MFiles.MFObjectVersionFlag
import typingsSlinky.mfiles.MFiles.MFSpecialObjectFlag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObjectVersion extends js.Object {
  val AccessedByMeUtc: js.Date = js.native
  val CheckedOutAtUtc: js.Date = js.native
  val CheckedOutTo: Double = js.native
  val CheckedOutToHostName: String = js.native
  val CheckedOutToUserName: String = js.native
  val CheckedOutVersion: Double = js.native
  val Class: MFBuiltInDocumentClass | MFBuiltInObjectClass | Double = js.native
  val CreatedUtc: js.Date = js.native
  val Deleted: Boolean = js.native
  val DisplayID: String = js.native
  val DisplayIDAvailable: Boolean = js.native
  val Files: IObjectFiles = js.native
  val FilesCount: Double = js.native
  val HasAssignments: Boolean = js.native
  val HasSharedFiles: Boolean = js.native
  val IsAccessedByMeValid: Boolean = js.native
  val IsObjectConflict: Boolean = js.native
  val IsObjectShortcut: Boolean = js.native
  val LastModifiedUtc: js.Date = js.native
  val LatestCheckedInVersion: Double = js.native
  val LatestCheckedInVersionOrCheckedOutVersion: Boolean = js.native
  val ObjVer: IObjVer = js.native
  val ObjectCheckedOut: Boolean = js.native
  val ObjectCheckedOutToThisUserOnAnyComputer: Boolean = js.native
  val ObjectCheckedOutToThisUserOnThisComputer: Boolean = js.native
  val ObjectFlags: MFSpecialObjectFlag = js.native
  val ObjectGUID: String = js.native
  val ObjectVersionFlags: MFObjectVersionFlag = js.native
  val OriginalObjID: IObjID = js.native
  val OriginalVaultGUID: String = js.native
  val SingleFile: Boolean = js.native
  val ThisVersionCheckedOut: Boolean = js.native
  val ThisVersionLatestToThisUser: Boolean = js.native
  val Title: String = js.native
  val VersionGUID: String = js.native
  val VisibleAfterOperation: Boolean = js.native
  def Clone(): IObjectVersion = js.native
  def GetNameForFileSystem(IncludeID: Boolean): String = js.native
  def GetNameForFileSystemEx(IncludeID: Boolean, UseOriginalID: Boolean): String = js.native
}

object IObjectVersion {
  @scala.inline
  def apply(
    AccessedByMeUtc: js.Date,
    CheckedOutAtUtc: js.Date,
    CheckedOutTo: Double,
    CheckedOutToHostName: String,
    CheckedOutToUserName: String,
    CheckedOutVersion: Double,
    Class: MFBuiltInDocumentClass | MFBuiltInObjectClass | Double,
    Clone: () => IObjectVersion,
    CreatedUtc: js.Date,
    Deleted: Boolean,
    DisplayID: String,
    DisplayIDAvailable: Boolean,
    Files: IObjectFiles,
    FilesCount: Double,
    GetNameForFileSystem: Boolean => String,
    GetNameForFileSystemEx: (Boolean, Boolean) => String,
    HasAssignments: Boolean,
    HasSharedFiles: Boolean,
    IsAccessedByMeValid: Boolean,
    IsObjectConflict: Boolean,
    IsObjectShortcut: Boolean,
    LastModifiedUtc: js.Date,
    LatestCheckedInVersion: Double,
    LatestCheckedInVersionOrCheckedOutVersion: Boolean,
    ObjVer: IObjVer,
    ObjectCheckedOut: Boolean,
    ObjectCheckedOutToThisUserOnAnyComputer: Boolean,
    ObjectCheckedOutToThisUserOnThisComputer: Boolean,
    ObjectFlags: MFSpecialObjectFlag,
    ObjectGUID: String,
    ObjectVersionFlags: MFObjectVersionFlag,
    OriginalObjID: IObjID,
    OriginalVaultGUID: String,
    SingleFile: Boolean,
    ThisVersionCheckedOut: Boolean,
    ThisVersionLatestToThisUser: Boolean,
    Title: String,
    VersionGUID: String,
    VisibleAfterOperation: Boolean
  ): IObjectVersion = {
    val __obj = js.Dynamic.literal(AccessedByMeUtc = AccessedByMeUtc.asInstanceOf[js.Any], CheckedOutAtUtc = CheckedOutAtUtc.asInstanceOf[js.Any], CheckedOutTo = CheckedOutTo.asInstanceOf[js.Any], CheckedOutToHostName = CheckedOutToHostName.asInstanceOf[js.Any], CheckedOutToUserName = CheckedOutToUserName.asInstanceOf[js.Any], CheckedOutVersion = CheckedOutVersion.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), CreatedUtc = CreatedUtc.asInstanceOf[js.Any], Deleted = Deleted.asInstanceOf[js.Any], DisplayID = DisplayID.asInstanceOf[js.Any], DisplayIDAvailable = DisplayIDAvailable.asInstanceOf[js.Any], Files = Files.asInstanceOf[js.Any], FilesCount = FilesCount.asInstanceOf[js.Any], GetNameForFileSystem = js.Any.fromFunction1(GetNameForFileSystem), GetNameForFileSystemEx = js.Any.fromFunction2(GetNameForFileSystemEx), HasAssignments = HasAssignments.asInstanceOf[js.Any], HasSharedFiles = HasSharedFiles.asInstanceOf[js.Any], IsAccessedByMeValid = IsAccessedByMeValid.asInstanceOf[js.Any], IsObjectConflict = IsObjectConflict.asInstanceOf[js.Any], IsObjectShortcut = IsObjectShortcut.asInstanceOf[js.Any], LastModifiedUtc = LastModifiedUtc.asInstanceOf[js.Any], LatestCheckedInVersion = LatestCheckedInVersion.asInstanceOf[js.Any], LatestCheckedInVersionOrCheckedOutVersion = LatestCheckedInVersionOrCheckedOutVersion.asInstanceOf[js.Any], ObjVer = ObjVer.asInstanceOf[js.Any], ObjectCheckedOut = ObjectCheckedOut.asInstanceOf[js.Any], ObjectCheckedOutToThisUserOnAnyComputer = ObjectCheckedOutToThisUserOnAnyComputer.asInstanceOf[js.Any], ObjectCheckedOutToThisUserOnThisComputer = ObjectCheckedOutToThisUserOnThisComputer.asInstanceOf[js.Any], ObjectFlags = ObjectFlags.asInstanceOf[js.Any], ObjectGUID = ObjectGUID.asInstanceOf[js.Any], ObjectVersionFlags = ObjectVersionFlags.asInstanceOf[js.Any], OriginalObjID = OriginalObjID.asInstanceOf[js.Any], OriginalVaultGUID = OriginalVaultGUID.asInstanceOf[js.Any], SingleFile = SingleFile.asInstanceOf[js.Any], ThisVersionCheckedOut = ThisVersionCheckedOut.asInstanceOf[js.Any], ThisVersionLatestToThisUser = ThisVersionLatestToThisUser.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], VersionGUID = VersionGUID.asInstanceOf[js.Any], VisibleAfterOperation = VisibleAfterOperation.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectVersion]
  }
  @scala.inline
  implicit class IObjectVersionOps[Self <: IObjectVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessedByMeUtc(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessedByMeUtc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckedOutAtUtc(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CheckedOutAtUtc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckedOutTo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CheckedOutTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckedOutToHostName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CheckedOutToHostName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckedOutToUserName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CheckedOutToUserName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckedOutVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CheckedOutVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClass(value: MFBuiltInDocumentClass | MFBuiltInObjectClass | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClone(value: () => IObjectVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreatedUtc(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedUtc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Deleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayIDAvailable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayIDAvailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFiles(value: IObjectFiles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilesCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilesCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetNameForFileSystem(value: Boolean => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetNameForFileSystem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetNameForFileSystemEx(value: (Boolean, Boolean) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetNameForFileSystemEx")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHasAssignments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasAssignments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasSharedFiles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasSharedFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsAccessedByMeValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsAccessedByMeValid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsObjectConflict(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsObjectConflict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsObjectShortcut(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsObjectShortcut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastModifiedUtc(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedUtc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatestCheckedInVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LatestCheckedInVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatestCheckedInVersionOrCheckedOutVersion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LatestCheckedInVersionOrCheckedOutVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjVer(value: IObjVer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjVer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectCheckedOut(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectCheckedOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectCheckedOutToThisUserOnAnyComputer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectCheckedOutToThisUserOnAnyComputer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectCheckedOutToThisUserOnThisComputer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectCheckedOutToThisUserOnThisComputer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectFlags(value: MFSpecialObjectFlag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectFlags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectGUID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectGUID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectVersionFlags(value: MFObjectVersionFlag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectVersionFlags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalObjID(value: IObjID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OriginalObjID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalVaultGUID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OriginalVaultGUID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSingleFile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SingleFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThisVersionCheckedOut(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThisVersionCheckedOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThisVersionLatestToThisUser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThisVersionLatestToThisUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersionGUID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionGUID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisibleAfterOperation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VisibleAfterOperation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

