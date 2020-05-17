package typingsSlinky.activexAccess.Access

import typingsSlinky.activexDao.DAO.Database
import typingsSlinky.activexDao.DAO.Workspace
import typingsSlinky.activexVbide.VBIDE.VBProject
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WizHook extends js.Object {
  @JSName("Access.WizHook_typekey")
  var AccessDotWizHook_typekey: WizHook = js.native
  val DbcVbProject: VBProject = js.native
  val Key: Double = js.native
  def AccessUserDataDir(): String = js.native
  def AccessWizFilePath(bstrWhich: String): String = js.native
  def AdpUIDPwd(pbstrUID: String, pbstrPwd: String): Boolean = js.native
  def AnalyzeQuery(Workspace: Workspace, Database: Database, Query: String, Results: String): Double = js.native
  def AnalyzeTable(Workspace: Workspace, Database: Database, Table: String, ReturnDebugInfo: Boolean, Results: String): Double = js.native
  def ArgsOfActid(Actid: Double): Double = js.native
  def BracketString(String: String, flags: Double): Boolean = js.native
  def CacheStatus(bstrStatus: String): Unit = js.native
  def CloseCurrentDatabase(): Boolean = js.native
  def CreateDataPageControl(
    DpName: String,
    CtlName: String,
    Typ: Double,
    Section: String,
    SectionType: Double,
    AppletCode: String,
    X: Double,
    Y: Double,
    dx: Double,
    dy: Double
  ): Unit = js.native
  def CurrentLangID(): Double = js.native
  def EmbedFileOnDataPage(DpName: String, FileToInsert: String): String = js.native
  def EnglishPictToLocal(In: String, Out: String): Boolean = js.native
  def ExecuteTempImexSpec(bstrSpecXML: String): Unit = js.native
  def FCacheStatus(): Boolean = js.native
  def FCreateNameMap(objtyp: Double, bstrObjName: String): Boolean = js.native
  def FGetMSDE(fBlockKeys: Boolean): Boolean = js.native
  def FIsFEWch(wch: Double): Boolean = js.native
  def FIsPublishedXasTable(bstrObjectName: String): Boolean = js.native
  def FIsValidXasObjectName(bstrObjectName: String, iobjtyp: AcObjectType): Boolean = js.native
  def FIsXasDb(): Boolean = js.native
  def FileExists(File: String): Boolean = js.native
  def FirstDbcDataObject(Name: String, ObjType: AcObjectType, Attribs: Double): Boolean = js.native
  def FullPath(RelativePath: String, FullPath: String): Double = js.native
  def GetAccWizRCPath(): String = js.native
  def GetAdeRegistryPath(): String = js.native
  def GetColumns(bstrBase: String): String = js.native
  def GetCurrentView(bstrTableName: String): Double = js.native
  def GetDisabledExtensions(): String = js.native
  def GetFileName(
    hwndOwner: Double,
    AppName: String,
    DlgTitle: String,
    OpenTitle: String,
    File: String,
    InitialDir: String,
    Filter: String,
    FilterIndex: Double,
    View: Double,
    flags: Double,
    fOpen: Boolean
  ): Double = js.native
  def GetFileName2(
    hwndOwner: Double,
    AppName: String,
    DlgTitle: String,
    OpenTitle: String,
    File: String,
    InitialDir: String,
    Filter: String,
    FilterIndex: Double,
    View: Double,
    flags: Double,
    fOpen: Boolean,
    fFileSystem: js.Any
  ): Double = js.native
  def GetFileOdso(bstrExt: String, bstrFilename: String): Double = js.native
  def GetImexTblName(): String = js.native
  def GetInfoForColumns(bstrBase: String): String = js.native
  def GetLinkedListProperty(bstrTableName: String, bstrPropertyName: String, fServer: Boolean): String = js.native
  def GetObjPubOption(bstrObjectName: String, iobjtyp: AcObjectType, fTablesAsClient: Boolean): Double = js.native
  def GetScriptString(HScr: Double, ScriptColumn: Double, Value: String): Boolean = js.native
  def GetWizGlob(lWhich: Double): js.Any = js.native
  def GlobalProcExists(Name: String): Boolean = js.native
  def HideDates(): Boolean = js.native
  def IsMatchToDbcConnectString(bstrConnectionString: String): Boolean = js.native
  def IsMemberSafe(dispid: Double): Boolean = js.native
  def IsValidIdent(Identifier: String): Boolean = js.native
  def KeyboardLangID(): Double = js.native
  def KnownWizLeaks(fStart: Boolean): Unit = js.native
  def LoadImexSpecSolution(bstrFilename: String): Unit = js.native
  def LocalFont(): String = js.native
  def NameFromActid(Actid: Double): String = js.native
  def ObjTypOfRecordSource(RecordSource: String): Double = js.native
  def OfficeAddInDir(): String = js.native
  def OpenEmScript(pProperty: AccessProperty, OpenMode: Double, Extra: Double, Version: Double): Double = js.native
  def OpenPictureFile(File: String, Cancelled: Boolean): Boolean = js.native
  def OpenScript(Script: String, Label: String, OpenMode: Double, Extra: Double, Version: Double): Double = js.native
  def ReportLeaksToFile(fRptToFile: Boolean, bstrFileOut: String): Unit = js.native
  def SaveObject(bstrName: String, objtyp: Double): Unit = js.native
  def SaveScriptString(HScr: Double, ScriptColumn: Double, Value: String): Boolean = js.native
  def SetDefaultSpecName(bstrSpecName: String): Unit = js.native
  def SetDpBlockKeyInput(fBlockKeys: Boolean): Unit = js.native
  def SetVbaPassword(bstrDbName: String, bstrConnect: String, bstrPasswd: String): Boolean = js.native
  def SetWizGlob(lWhich: Double, vValue: js.Any): Unit = js.native
  def SortStringArray(Array: SafeArray[String]): Unit = js.native
  def SplitPath(Path: String, Drive: String, Dir: String, File: String, Ext: String): Unit = js.native
  def TableFieldHasUniqueIndex(Table: String, Columns: String): Boolean = js.native
  def TranslateExpression(In: String, Out: String, ParseFlags: Double, TranslateFlags: Double): Boolean = js.native
  def TwipsFromFont(
    FontName: String,
    Size: Double,
    Weight: Double,
    Italic: Boolean,
    Underline: Boolean,
    Cch: Double,
    Caption: String,
    MaxWidthCch: Double,
    dx: Double,
    dy: Double
  ): Boolean = js.native
  def WizCopyCmdbars(bstrADPName: String): Unit = js.native
  def WizHelp(HelpFile: String, wCmd: Double, ContextID: Double): Boolean = js.native
  def WizMsgBox(bstrText: String, bstrCaption: String, wStyle: Double, idHelpID: Double, bstrHelpFileName: String): Double = js.native
}

object WizHook {
  @scala.inline
  def apply(
    AccessDotWizHook_typekey: WizHook,
    AccessUserDataDir: () => String,
    AccessWizFilePath: String => String,
    AdpUIDPwd: (String, String) => Boolean,
    AnalyzeQuery: (Workspace, Database, String, String) => Double,
    AnalyzeTable: (Workspace, Database, String, Boolean, String) => Double,
    ArgsOfActid: Double => Double,
    BracketString: (String, Double) => Boolean,
    CacheStatus: String => Unit,
    CloseCurrentDatabase: () => Boolean,
    CreateDataPageControl: (String, String, Double, String, Double, String, Double, Double, Double, Double) => Unit,
    CurrentLangID: () => Double,
    DbcVbProject: VBProject,
    EmbedFileOnDataPage: (String, String) => String,
    EnglishPictToLocal: (String, String) => Boolean,
    ExecuteTempImexSpec: String => Unit,
    FCacheStatus: () => Boolean,
    FCreateNameMap: (Double, String) => Boolean,
    FGetMSDE: Boolean => Boolean,
    FIsFEWch: Double => Boolean,
    FIsPublishedXasTable: String => Boolean,
    FIsValidXasObjectName: (String, AcObjectType) => Boolean,
    FIsXasDb: () => Boolean,
    FileExists: String => Boolean,
    FirstDbcDataObject: (String, AcObjectType, Double) => Boolean,
    FullPath: (String, String) => Double,
    GetAccWizRCPath: () => String,
    GetAdeRegistryPath: () => String,
    GetColumns: String => String,
    GetCurrentView: String => Double,
    GetDisabledExtensions: () => String,
    GetFileName: (Double, String, String, String, String, String, String, Double, Double, Double, Boolean) => Double,
    GetFileName2: (Double, String, String, String, String, String, String, Double, Double, Double, Boolean, js.Any) => Double,
    GetFileOdso: (String, String) => Double,
    GetImexTblName: () => String,
    GetInfoForColumns: String => String,
    GetLinkedListProperty: (String, String, Boolean) => String,
    GetObjPubOption: (String, AcObjectType, Boolean) => Double,
    GetScriptString: (Double, Double, String) => Boolean,
    GetWizGlob: Double => js.Any,
    GlobalProcExists: String => Boolean,
    HideDates: () => Boolean,
    IsMatchToDbcConnectString: String => Boolean,
    IsMemberSafe: Double => Boolean,
    IsValidIdent: String => Boolean,
    Key: Double,
    KeyboardLangID: () => Double,
    KnownWizLeaks: Boolean => Unit,
    LoadImexSpecSolution: String => Unit,
    LocalFont: () => String,
    NameFromActid: Double => String,
    ObjTypOfRecordSource: String => Double,
    OfficeAddInDir: () => String,
    OpenEmScript: (AccessProperty, Double, Double, Double) => Double,
    OpenPictureFile: (String, Boolean) => Boolean,
    OpenScript: (String, String, Double, Double, Double) => Double,
    ReportLeaksToFile: (Boolean, String) => Unit,
    SaveObject: (String, Double) => Unit,
    SaveScriptString: (Double, Double, String) => Boolean,
    SetDefaultSpecName: String => Unit,
    SetDpBlockKeyInput: Boolean => Unit,
    SetVbaPassword: (String, String, String) => Boolean,
    SetWizGlob: (Double, js.Any) => Unit,
    SortStringArray: SafeArray[String] => Unit,
    SplitPath: (String, String, String, String, String) => Unit,
    TableFieldHasUniqueIndex: (String, String) => Boolean,
    TranslateExpression: (String, String, Double, Double) => Boolean,
    TwipsFromFont: (String, Double, Double, Boolean, Boolean, Double, String, Double, Double, Double) => Boolean,
    WizCopyCmdbars: String => Unit,
    WizHelp: (String, Double, Double) => Boolean,
    WizMsgBox: (String, String, Double, Double, String) => Double
  ): WizHook = {
    val __obj = js.Dynamic.literal(AccessUserDataDir = js.Any.fromFunction0(AccessUserDataDir), AccessWizFilePath = js.Any.fromFunction1(AccessWizFilePath), AdpUIDPwd = js.Any.fromFunction2(AdpUIDPwd), AnalyzeQuery = js.Any.fromFunction4(AnalyzeQuery), AnalyzeTable = js.Any.fromFunction5(AnalyzeTable), ArgsOfActid = js.Any.fromFunction1(ArgsOfActid), BracketString = js.Any.fromFunction2(BracketString), CacheStatus = js.Any.fromFunction1(CacheStatus), CloseCurrentDatabase = js.Any.fromFunction0(CloseCurrentDatabase), CreateDataPageControl = js.Any.fromFunction10(CreateDataPageControl), CurrentLangID = js.Any.fromFunction0(CurrentLangID), DbcVbProject = DbcVbProject.asInstanceOf[js.Any], EmbedFileOnDataPage = js.Any.fromFunction2(EmbedFileOnDataPage), EnglishPictToLocal = js.Any.fromFunction2(EnglishPictToLocal), ExecuteTempImexSpec = js.Any.fromFunction1(ExecuteTempImexSpec), FCacheStatus = js.Any.fromFunction0(FCacheStatus), FCreateNameMap = js.Any.fromFunction2(FCreateNameMap), FGetMSDE = js.Any.fromFunction1(FGetMSDE), FIsFEWch = js.Any.fromFunction1(FIsFEWch), FIsPublishedXasTable = js.Any.fromFunction1(FIsPublishedXasTable), FIsValidXasObjectName = js.Any.fromFunction2(FIsValidXasObjectName), FIsXasDb = js.Any.fromFunction0(FIsXasDb), FileExists = js.Any.fromFunction1(FileExists), FirstDbcDataObject = js.Any.fromFunction3(FirstDbcDataObject), FullPath = js.Any.fromFunction2(FullPath), GetAccWizRCPath = js.Any.fromFunction0(GetAccWizRCPath), GetAdeRegistryPath = js.Any.fromFunction0(GetAdeRegistryPath), GetColumns = js.Any.fromFunction1(GetColumns), GetCurrentView = js.Any.fromFunction1(GetCurrentView), GetDisabledExtensions = js.Any.fromFunction0(GetDisabledExtensions), GetFileName = js.Any.fromFunction11(GetFileName), GetFileName2 = js.Any.fromFunction12(GetFileName2), GetFileOdso = js.Any.fromFunction2(GetFileOdso), GetImexTblName = js.Any.fromFunction0(GetImexTblName), GetInfoForColumns = js.Any.fromFunction1(GetInfoForColumns), GetLinkedListProperty = js.Any.fromFunction3(GetLinkedListProperty), GetObjPubOption = js.Any.fromFunction3(GetObjPubOption), GetScriptString = js.Any.fromFunction3(GetScriptString), GetWizGlob = js.Any.fromFunction1(GetWizGlob), GlobalProcExists = js.Any.fromFunction1(GlobalProcExists), HideDates = js.Any.fromFunction0(HideDates), IsMatchToDbcConnectString = js.Any.fromFunction1(IsMatchToDbcConnectString), IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), IsValidIdent = js.Any.fromFunction1(IsValidIdent), Key = Key.asInstanceOf[js.Any], KeyboardLangID = js.Any.fromFunction0(KeyboardLangID), KnownWizLeaks = js.Any.fromFunction1(KnownWizLeaks), LoadImexSpecSolution = js.Any.fromFunction1(LoadImexSpecSolution), LocalFont = js.Any.fromFunction0(LocalFont), NameFromActid = js.Any.fromFunction1(NameFromActid), ObjTypOfRecordSource = js.Any.fromFunction1(ObjTypOfRecordSource), OfficeAddInDir = js.Any.fromFunction0(OfficeAddInDir), OpenEmScript = js.Any.fromFunction4(OpenEmScript), OpenPictureFile = js.Any.fromFunction2(OpenPictureFile), OpenScript = js.Any.fromFunction5(OpenScript), ReportLeaksToFile = js.Any.fromFunction2(ReportLeaksToFile), SaveObject = js.Any.fromFunction2(SaveObject), SaveScriptString = js.Any.fromFunction3(SaveScriptString), SetDefaultSpecName = js.Any.fromFunction1(SetDefaultSpecName), SetDpBlockKeyInput = js.Any.fromFunction1(SetDpBlockKeyInput), SetVbaPassword = js.Any.fromFunction3(SetVbaPassword), SetWizGlob = js.Any.fromFunction2(SetWizGlob), SortStringArray = js.Any.fromFunction1(SortStringArray), SplitPath = js.Any.fromFunction5(SplitPath), TableFieldHasUniqueIndex = js.Any.fromFunction2(TableFieldHasUniqueIndex), TranslateExpression = js.Any.fromFunction4(TranslateExpression), TwipsFromFont = js.Any.fromFunction10(TwipsFromFont), WizCopyCmdbars = js.Any.fromFunction1(WizCopyCmdbars), WizHelp = js.Any.fromFunction3(WizHelp), WizMsgBox = js.Any.fromFunction5(WizMsgBox))
    __obj.updateDynamic("Access.WizHook_typekey")(AccessDotWizHook_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[WizHook]
  }
  @scala.inline
  implicit class WizHookOps[Self <: WizHook] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessDotWizHook_typekey(value: WizHook): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Access.WizHook_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccessUserDataDir(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessUserDataDir")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAccessWizFilePath(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessWizFilePath")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAdpUIDPwd(value: (String, String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdpUIDPwd")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAnalyzeQuery(value: (Workspace, Database, String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnalyzeQuery")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withAnalyzeTable(value: (Workspace, Database, String, Boolean, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnalyzeTable")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withArgsOfActid(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArgsOfActid")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBracketString(value: (String, Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BracketString")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCacheStatus(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheStatus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCloseCurrentDatabase(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloseCurrentDatabase")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreateDataPageControl(value: (String, String, Double, String, Double, String, Double, Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateDataPageControl")(js.Any.fromFunction10(value))
        ret
    }
    @scala.inline
    def withCurrentLangID(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentLangID")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDbcVbProject(value: VBProject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DbcVbProject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmbedFileOnDataPage(value: (String, String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmbedFileOnDataPage")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEnglishPictToLocal(value: (String, String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnglishPictToLocal")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withExecuteTempImexSpec(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecuteTempImexSpec")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFCacheStatus(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FCacheStatus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFCreateNameMap(value: (Double, String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FCreateNameMap")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFGetMSDE(value: Boolean => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FGetMSDE")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFIsFEWch(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FIsFEWch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFIsPublishedXasTable(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FIsPublishedXasTable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFIsValidXasObjectName(value: (String, AcObjectType) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FIsValidXasObjectName")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFIsXasDb(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FIsXasDb")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFileExists(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileExists")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFirstDbcDataObject(value: (String, AcObjectType, Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FirstDbcDataObject")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withFullPath(value: (String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FullPath")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetAccWizRCPath(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetAccWizRCPath")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAdeRegistryPath(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetAdeRegistryPath")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetColumns(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetColumns")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetCurrentView(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetCurrentView")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetDisabledExtensions(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetDisabledExtensions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFileName(
      value: (Double, String, String, String, String, String, String, Double, Double, Double, Boolean) => Double
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetFileName")(js.Any.fromFunction11(value))
        ret
    }
    @scala.inline
    def withGetFileName2(
      value: (Double, String, String, String, String, String, String, Double, Double, Double, Boolean, js.Any) => Double
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetFileName2")(js.Any.fromFunction12(value))
        ret
    }
    @scala.inline
    def withGetFileOdso(value: (String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetFileOdso")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetImexTblName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetImexTblName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetInfoForColumns(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetInfoForColumns")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetLinkedListProperty(value: (String, String, Boolean) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetLinkedListProperty")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetObjPubOption(value: (String, AcObjectType, Boolean) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetObjPubOption")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetScriptString(value: (Double, Double, String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetScriptString")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetWizGlob(value: Double => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetWizGlob")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGlobalProcExists(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalProcExists")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHideDates(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HideDates")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsMatchToDbcConnectString(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsMatchToDbcConnectString")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsMemberSafe(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsMemberSafe")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsValidIdent(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsValidIdent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withKey(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyboardLangID(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyboardLangID")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withKnownWizLeaks(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KnownWizLeaks")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLoadImexSpecSolution(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadImexSpecSolution")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLocalFont(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalFont")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNameFromActid(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NameFromActid")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withObjTypOfRecordSource(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjTypOfRecordSource")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOfficeAddInDir(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OfficeAddInDir")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOpenEmScript(value: (AccessProperty, Double, Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OpenEmScript")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withOpenPictureFile(value: (String, Boolean) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OpenPictureFile")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOpenScript(value: (String, String, Double, Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OpenScript")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withReportLeaksToFile(value: (Boolean, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReportLeaksToFile")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSaveObject(value: (String, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SaveObject")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSaveScriptString(value: (Double, Double, String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SaveScriptString")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetDefaultSpecName(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetDefaultSpecName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetDpBlockKeyInput(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetDpBlockKeyInput")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetVbaPassword(value: (String, String, String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetVbaPassword")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetWizGlob(value: (Double, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetWizGlob")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSortStringArray(value: SafeArray[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SortStringArray")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSplitPath(value: (String, String, String, String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SplitPath")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withTableFieldHasUniqueIndex(value: (String, String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableFieldHasUniqueIndex")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTranslateExpression(value: (String, String, Double, Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TranslateExpression")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withTwipsFromFont(
      value: (String, Double, Double, Boolean, Boolean, Double, String, Double, Double, Double) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TwipsFromFont")(js.Any.fromFunction10(value))
        ret
    }
    @scala.inline
    def withWizCopyCmdbars(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WizCopyCmdbars")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWizHelp(value: (String, Double, Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WizHelp")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withWizMsgBox(value: (String, String, Double, Double, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WizMsgBox")(js.Any.fromFunction5(value))
        ret
    }
  }
  
}

