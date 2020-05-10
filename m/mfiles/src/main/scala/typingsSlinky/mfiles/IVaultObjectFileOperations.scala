package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFFileFormat
import typingsSlinky.mfiles.MFiles.MFFileOpenMethod
import typingsSlinky.mfiles.MFiles.MFLatestSpecificBehavior
import typingsSlinky.mfiles.MFiles.MFOCRZoneRecognitionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultObjectFileOperations extends js.Object {
  def AddEmptyFile(ObjVer: IObjVer, Title: String, Extension: String): IFileVer = js.native
  def AddFile(ObjVer: IObjVer, Title: String, Extension: String, SourcePath: String): IFileVer = js.native
  def CloseUploadSession(UploadID: Double): Unit = js.native
  def ConvertToPDF(
    ObjVer: IObjVer,
    FileID: Double,
    StoreAsSeparateFile: Boolean,
    OverwriteExistingFile: Boolean,
    PDFA1b: Boolean,
    FailOnUnsupportedSourceFiles: Boolean
  ): IObjectVersion = js.native
  def DownloadFile(File: Double, FileVersion: Double, FilePath: String): Unit = js.native
  def DownloadFileAsDataURI(ObjVer: IObjVer, File: Double, FileVersion: Double): String = js.native
  def DownloadFileEx(File: Double, FileVersion: Double, FilePath: String, FileFormat: MFFileFormat): Unit = js.native
  def DownloadFileInBlocks_Begin(File: Double, FileVersion: Double): IFileDownloadSession = js.native
  def DownloadFileInBlocks_BeginEx(File: Double, FileVersion: Double, FileFormat: MFFileFormat): IFileDownloadSession = js.native
  def DownloadFileInBlocks_BeginEx_32bit(File: Double, FileVersion: Double, FileFormat: MFFileFormat): IFileDownloadSession = js.native
  def DownloadFileInBlocks_Begin_32bit(File: Double, FileVersion: Double): IFileDownloadSession = js.native
  def DownloadFileInBlocks_ReadBlock(DownloadID: Double, BlockSize: Double, Offset: Double): js.Array[Double] = js.native
  def DownloadFileInBlocks_ReadBlock_32bit(DownloadID: Double, BlockSize: Double, Offset: Double): js.Array[Double] = js.native
  def GetFileSize(FileVer: IFileVer): Double = js.native
  def GetFileSize_32bit(FileVer: IFileVer): Double = js.native
  def GetFiles(ObjVer: IObjVer): IObjectFiles = js.native
  def GetFilesForModificationInEventHandler(ObjVer: IObjVer): IObjectFiles = js.native
  def GetLatestFileVersion(FileID: Double, AllowCheckedOut: Boolean): IFileVer = js.native
  def GetObjIDOfFile(FileID: Double): IObjID = js.native
  def GetPathInDefaultView(
    ObjID: IObjID,
    ObjectVersion: Double,
    FileID: Double,
    FileVersion: Double,
    LatestSpecificBehavior: MFLatestSpecificBehavior,
    UpdateFromServer: Boolean
  ): String = js.native
  def GetPathInDefaultViewEx(
    ObjID: IObjID,
    ObjectVersion: Double,
    FileID: Double,
    FileVersion: Double,
    LatestSpecificBehavior: MFLatestSpecificBehavior,
    PreferTraditionalFolderLocation: Boolean,
    UpdateFromServer: Boolean
  ): String = js.native
  def OpenFileInDefaultApplication(ParentWindow: Double, ObjVer: IObjVer, FileVer: IFileVer, FileOpenMethod: MFFileOpenMethod): Unit = js.native
  def PerformOCROperation(
    ObjVer: IObjVer,
    FileVer: IFileVer,
    OCROptions: IOCROptions,
    ZoneRecognitionMode: MFOCRZoneRecognitionMode,
    ZoneRecognitionPages: IOCRPages,
    ConvertToSearchablePDF: Boolean
  ): IOCRPageResults = js.native
  def RemoveFile(ObjVer: IObjVer, FileVer: IFileVer): IObjectVersion = js.native
  def RenameFile(
    ObjVer: IObjVer,
    FileVer: IFileVer,
    Title: String,
    Extension: String,
    UpdateSingleFileDocumentTitle: Boolean
  ): IObjectVersion = js.native
  def UpdateMetadataInFile(ObjVer: IObjVer, File: Double, FailOnUnsupportedFiles: Boolean): IObjectVersion = js.native
  def UploadFile(File: Double, FileVersion: Double, FilePath: String): Unit = js.native
  def UploadFileBlock(UploadID: Double, TotalSizeInBytes: Double, Offset: Double, Block: js.Array[Double]): Unit = js.native
  def UploadFileBlockBegin(): Double = js.native
  def UploadFileBlockBegin_32bit(): Double = js.native
  def UploadFileBlock_32bit(UploadID: Double, TotalSizeInBytes: Double, Offset: Double, Block: js.Array[Double]): Unit = js.native
  def UploadFileCommit(UploadID: Double, File: Double, FileVersion: Double, LogicalSize: Double): Unit = js.native
  def UploadFileCommit_32bit(UploadID: Double, File: Double, FileVersion: Double, LogicalSize: Double): Unit = js.native
  def UploadFromDataURI(ObjVer: IObjVer, File: Double, FileVersion: Double, DataURI: String): Unit = js.native
  def UploadTemporaryFile(FilePath: String): Double = js.native
  def UploadTemporaryFileBlock(UploadID: Double, TotalSizeInBytes: Double, Offset: Double, Block: js.Array[Double]): Unit = js.native
  def UploadTemporaryFileBlockBegin(FileExtension: String): Double = js.native
  def UploadTemporaryFileBlockBegin_32bit(FileExtension: String): Double = js.native
  def UploadTemporaryFileBlock_32bit(UploadID: Double, TotalSizeInBytes: Double, Offset: Double, Block: js.Array[Double]): Unit = js.native
  def UploadTemporaryFileCommit(UploadID: Double, LogicalSize: Double): Unit = js.native
  def UploadTemporaryFileCommit_32bit(UploadID: Double, LogicalSize: Double): Unit = js.native
}

object IVaultObjectFileOperations {
  @scala.inline
  def apply(
    AddEmptyFile: (IObjVer, String, String) => IFileVer,
    AddFile: (IObjVer, String, String, String) => IFileVer,
    CloseUploadSession: Double => Unit,
    ConvertToPDF: (IObjVer, Double, Boolean, Boolean, Boolean, Boolean) => IObjectVersion,
    DownloadFile: (Double, Double, String) => Unit,
    DownloadFileAsDataURI: (IObjVer, Double, Double) => String,
    DownloadFileEx: (Double, Double, String, MFFileFormat) => Unit,
    DownloadFileInBlocks_Begin: (Double, Double) => IFileDownloadSession,
    DownloadFileInBlocks_BeginEx: (Double, Double, MFFileFormat) => IFileDownloadSession,
    DownloadFileInBlocks_BeginEx_32bit: (Double, Double, MFFileFormat) => IFileDownloadSession,
    DownloadFileInBlocks_Begin_32bit: (Double, Double) => IFileDownloadSession,
    DownloadFileInBlocks_ReadBlock: (Double, Double, Double) => js.Array[Double],
    DownloadFileInBlocks_ReadBlock_32bit: (Double, Double, Double) => js.Array[Double],
    GetFileSize: IFileVer => Double,
    GetFileSize_32bit: IFileVer => Double,
    GetFiles: IObjVer => IObjectFiles,
    GetFilesForModificationInEventHandler: IObjVer => IObjectFiles,
    GetLatestFileVersion: (Double, Boolean) => IFileVer,
    GetObjIDOfFile: Double => IObjID,
    GetPathInDefaultView: (IObjID, Double, Double, Double, MFLatestSpecificBehavior, Boolean) => String,
    GetPathInDefaultViewEx: (IObjID, Double, Double, Double, MFLatestSpecificBehavior, Boolean, Boolean) => String,
    OpenFileInDefaultApplication: (Double, IObjVer, IFileVer, MFFileOpenMethod) => Unit,
    PerformOCROperation: (IObjVer, IFileVer, IOCROptions, MFOCRZoneRecognitionMode, IOCRPages, Boolean) => IOCRPageResults,
    RemoveFile: (IObjVer, IFileVer) => IObjectVersion,
    RenameFile: (IObjVer, IFileVer, String, String, Boolean) => IObjectVersion,
    UpdateMetadataInFile: (IObjVer, Double, Boolean) => IObjectVersion,
    UploadFile: (Double, Double, String) => Unit,
    UploadFileBlock: (Double, Double, Double, js.Array[Double]) => Unit,
    UploadFileBlockBegin: () => Double,
    UploadFileBlockBegin_32bit: () => Double,
    UploadFileBlock_32bit: (Double, Double, Double, js.Array[Double]) => Unit,
    UploadFileCommit: (Double, Double, Double, Double) => Unit,
    UploadFileCommit_32bit: (Double, Double, Double, Double) => Unit,
    UploadFromDataURI: (IObjVer, Double, Double, String) => Unit,
    UploadTemporaryFile: String => Double,
    UploadTemporaryFileBlock: (Double, Double, Double, js.Array[Double]) => Unit,
    UploadTemporaryFileBlockBegin: String => Double,
    UploadTemporaryFileBlockBegin_32bit: String => Double,
    UploadTemporaryFileBlock_32bit: (Double, Double, Double, js.Array[Double]) => Unit,
    UploadTemporaryFileCommit: (Double, Double) => Unit,
    UploadTemporaryFileCommit_32bit: (Double, Double) => Unit
  ): IVaultObjectFileOperations = {
    val __obj = js.Dynamic.literal(AddEmptyFile = js.Any.fromFunction3(AddEmptyFile), AddFile = js.Any.fromFunction4(AddFile), CloseUploadSession = js.Any.fromFunction1(CloseUploadSession), ConvertToPDF = js.Any.fromFunction6(ConvertToPDF), DownloadFile = js.Any.fromFunction3(DownloadFile), DownloadFileAsDataURI = js.Any.fromFunction3(DownloadFileAsDataURI), DownloadFileEx = js.Any.fromFunction4(DownloadFileEx), DownloadFileInBlocks_Begin = js.Any.fromFunction2(DownloadFileInBlocks_Begin), DownloadFileInBlocks_BeginEx = js.Any.fromFunction3(DownloadFileInBlocks_BeginEx), DownloadFileInBlocks_BeginEx_32bit = js.Any.fromFunction3(DownloadFileInBlocks_BeginEx_32bit), DownloadFileInBlocks_Begin_32bit = js.Any.fromFunction2(DownloadFileInBlocks_Begin_32bit), DownloadFileInBlocks_ReadBlock = js.Any.fromFunction3(DownloadFileInBlocks_ReadBlock), DownloadFileInBlocks_ReadBlock_32bit = js.Any.fromFunction3(DownloadFileInBlocks_ReadBlock_32bit), GetFileSize = js.Any.fromFunction1(GetFileSize), GetFileSize_32bit = js.Any.fromFunction1(GetFileSize_32bit), GetFiles = js.Any.fromFunction1(GetFiles), GetFilesForModificationInEventHandler = js.Any.fromFunction1(GetFilesForModificationInEventHandler), GetLatestFileVersion = js.Any.fromFunction2(GetLatestFileVersion), GetObjIDOfFile = js.Any.fromFunction1(GetObjIDOfFile), GetPathInDefaultView = js.Any.fromFunction6(GetPathInDefaultView), GetPathInDefaultViewEx = js.Any.fromFunction7(GetPathInDefaultViewEx), OpenFileInDefaultApplication = js.Any.fromFunction4(OpenFileInDefaultApplication), PerformOCROperation = js.Any.fromFunction6(PerformOCROperation), RemoveFile = js.Any.fromFunction2(RemoveFile), RenameFile = js.Any.fromFunction5(RenameFile), UpdateMetadataInFile = js.Any.fromFunction3(UpdateMetadataInFile), UploadFile = js.Any.fromFunction3(UploadFile), UploadFileBlock = js.Any.fromFunction4(UploadFileBlock), UploadFileBlockBegin = js.Any.fromFunction0(UploadFileBlockBegin), UploadFileBlockBegin_32bit = js.Any.fromFunction0(UploadFileBlockBegin_32bit), UploadFileBlock_32bit = js.Any.fromFunction4(UploadFileBlock_32bit), UploadFileCommit = js.Any.fromFunction4(UploadFileCommit), UploadFileCommit_32bit = js.Any.fromFunction4(UploadFileCommit_32bit), UploadFromDataURI = js.Any.fromFunction4(UploadFromDataURI), UploadTemporaryFile = js.Any.fromFunction1(UploadTemporaryFile), UploadTemporaryFileBlock = js.Any.fromFunction4(UploadTemporaryFileBlock), UploadTemporaryFileBlockBegin = js.Any.fromFunction1(UploadTemporaryFileBlockBegin), UploadTemporaryFileBlockBegin_32bit = js.Any.fromFunction1(UploadTemporaryFileBlockBegin_32bit), UploadTemporaryFileBlock_32bit = js.Any.fromFunction4(UploadTemporaryFileBlock_32bit), UploadTemporaryFileCommit = js.Any.fromFunction2(UploadTemporaryFileCommit), UploadTemporaryFileCommit_32bit = js.Any.fromFunction2(UploadTemporaryFileCommit_32bit))
    __obj.asInstanceOf[IVaultObjectFileOperations]
  }
  @scala.inline
  implicit class IVaultObjectFileOperationsOps[Self <: IVaultObjectFileOperations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddEmptyFile(value: (IObjVer, String, String) => IFileVer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddEmptyFile")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withAddFile(value: (IObjVer, String, String, String) => IFileVer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddFile")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withCloseUploadSession(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloseUploadSession")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withConvertToPDF(value: (IObjVer, Double, Boolean, Boolean, Boolean, Boolean) => IObjectVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConvertToPDF")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withDownloadFile(value: (Double, Double, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DownloadFile")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDownloadFileAsDataURI(value: (IObjVer, Double, Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DownloadFileAsDataURI")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDownloadFileEx(value: (Double, Double, String, MFFileFormat) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DownloadFileEx")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withDownloadFileInBlocks_Begin(value: (Double, Double) => IFileDownloadSession): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DownloadFileInBlocks_Begin")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDownloadFileInBlocks_BeginEx(value: (Double, Double, MFFileFormat) => IFileDownloadSession): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DownloadFileInBlocks_BeginEx")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDownloadFileInBlocks_BeginEx_32bit(value: (Double, Double, MFFileFormat) => IFileDownloadSession): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DownloadFileInBlocks_BeginEx_32bit")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDownloadFileInBlocks_Begin_32bit(value: (Double, Double) => IFileDownloadSession): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DownloadFileInBlocks_Begin_32bit")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDownloadFileInBlocks_ReadBlock(value: (Double, Double, Double) => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DownloadFileInBlocks_ReadBlock")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDownloadFileInBlocks_ReadBlock_32bit(value: (Double, Double, Double) => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DownloadFileInBlocks_ReadBlock_32bit")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetFileSize(value: IFileVer => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetFileSize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetFileSize_32bit(value: IFileVer => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetFileSize_32bit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetFiles(value: IObjVer => IObjectFiles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetFiles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetFilesForModificationInEventHandler(value: IObjVer => IObjectFiles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetFilesForModificationInEventHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetLatestFileVersion(value: (Double, Boolean) => IFileVer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetLatestFileVersion")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetObjIDOfFile(value: Double => IObjID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetObjIDOfFile")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetPathInDefaultView(value: (IObjID, Double, Double, Double, MFLatestSpecificBehavior, Boolean) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetPathInDefaultView")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withGetPathInDefaultViewEx(value: (IObjID, Double, Double, Double, MFLatestSpecificBehavior, Boolean, Boolean) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetPathInDefaultViewEx")(js.Any.fromFunction7(value))
        ret
    }
    @scala.inline
    def withOpenFileInDefaultApplication(value: (Double, IObjVer, IFileVer, MFFileOpenMethod) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OpenFileInDefaultApplication")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withPerformOCROperation(
      value: (IObjVer, IFileVer, IOCROptions, MFOCRZoneRecognitionMode, IOCRPages, Boolean) => IOCRPageResults
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PerformOCROperation")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withRemoveFile(value: (IObjVer, IFileVer) => IObjectVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveFile")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRenameFile(value: (IObjVer, IFileVer, String, String, Boolean) => IObjectVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RenameFile")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withUpdateMetadataInFile(value: (IObjVer, Double, Boolean) => IObjectVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateMetadataInFile")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withUploadFile(value: (Double, Double, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UploadFile")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withUploadFileBlock(value: (Double, Double, Double, js.Array[Double]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UploadFileBlock")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withUploadFileBlockBegin(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UploadFileBlockBegin")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUploadFileBlockBegin_32bit(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UploadFileBlockBegin_32bit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUploadFileBlock_32bit(value: (Double, Double, Double, js.Array[Double]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UploadFileBlock_32bit")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withUploadFileCommit(value: (Double, Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UploadFileCommit")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withUploadFileCommit_32bit(value: (Double, Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UploadFileCommit_32bit")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withUploadFromDataURI(value: (IObjVer, Double, Double, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UploadFromDataURI")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withUploadTemporaryFile(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UploadTemporaryFile")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUploadTemporaryFileBlock(value: (Double, Double, Double, js.Array[Double]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UploadTemporaryFileBlock")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withUploadTemporaryFileBlockBegin(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UploadTemporaryFileBlockBegin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUploadTemporaryFileBlockBegin_32bit(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UploadTemporaryFileBlockBegin_32bit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUploadTemporaryFileBlock_32bit(value: (Double, Double, Double, js.Array[Double]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UploadTemporaryFileBlock_32bit")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withUploadTemporaryFileCommit(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UploadTemporaryFileCommit")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUploadTemporaryFileCommit_32bit(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UploadTemporaryFileCommit_32bit")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

