package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.COMAddIn
import typingsSlinky.activexOffice.Office.COMAddIns
import typingsSlinky.activexOffice.Office.CommandBar
import typingsSlinky.activexOffice.Office.CommandBars
import typingsSlinky.activexOffice.Office.IAssistance
import typingsSlinky.activexOffice.Office.IFind
import typingsSlinky.activexOffice.Office.MsoAutomationSecurity
import typingsSlinky.activexOffice.Office.MsoFeatureInstall
import typingsSlinky.activexOffice.Office.MsoFileDialogType
import typingsSlinky.activexOffice.Office.MsoFileValidationMode
import typingsSlinky.activexOffice.Office.MsoTriState
import typingsSlinky.activexOffice.Office.NewFile
import typingsSlinky.activexOffice.Office.SmartArtColor
import typingsSlinky.activexOffice.Office.SmartArtColors
import typingsSlinky.activexOffice.Office.SmartArtLayout
import typingsSlinky.activexOffice.Office.SmartArtLayouts
import typingsSlinky.activexOffice.Office.SmartArtQuickStyle
import typingsSlinky.activexOffice.Office.SmartArtQuickStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Application extends js.Object {
  
  def Activate(): Unit = js.native
  
  val Active: MsoTriState = js.native
  
  val ActiveEncryptionSession: Double = js.native
  
  val ActivePresentation: Presentation = js.native
  
  val ActivePrinter: String = js.native
  
  val ActiveProtectedViewWindow: ProtectedViewWindow = js.native
  
  val ActiveWindow: DocumentWindow = js.native
  
  val AddIns: typingsSlinky.activexPowerpoint.PowerPoint.AddIns = js.native
  
  val AnswerWizard: typingsSlinky.activexOffice.Office.AnswerWizard = js.native
  
  val Assistance: IAssistance = js.native
  
  val Assistant: typingsSlinky.activexOffice.Office.Assistant = js.native
  
  val AutoCorrect: typingsSlinky.activexPowerpoint.PowerPoint.AutoCorrect = js.native
  
  var AutomationSecurity: MsoAutomationSecurity = js.native
  
  val Build: String = js.native
  
  def COMAddIns(Index: String): COMAddIn = js.native
  def COMAddIns(Index: Double): COMAddIn = js.native
  @JSName("COMAddIns")
  val COMAddIns_Original: COMAddIns = js.native
  
  var Caption: String = js.native
  
  def CommandBars(Index: String): CommandBar = js.native
  def CommandBars(Index: Double): CommandBar = js.native
  @JSName("CommandBars")
  val CommandBars_Original: CommandBars = js.native
  
  val Creator: Double = js.native
  
  val DefaultWebOptions: typingsSlinky.activexPowerpoint.PowerPoint.DefaultWebOptions = js.native
  
  val Dialogs: js.Any = js.native
  
  var DisplayAlerts: PpAlertLevel = js.native
  
  var DisplayDocumentInformationPanel: Boolean = js.native
  
  var DisplayGridLines: MsoTriState = js.native
  
  var FeatureInstall: MsoFeatureInstall = js.native
  
  val FileConverters: typingsSlinky.activexPowerpoint.PowerPoint.FileConverters = js.native
  
  def FileDialog(Type: MsoFileDialogType): typingsSlinky.activexOffice.Office.FileDialog = js.native
  
  val FileFind: IFind = js.native
  
  val FileSearch: typingsSlinky.activexOffice.Office.FileSearch = js.native
  
  var FileValidation: MsoFileValidationMode = js.native
  
  /** @param boolean [Persist=false] */
  def GetOptionFlag(Option: Double): Boolean = js.native
  def GetOptionFlag(Option: Double, Persist: Boolean): Boolean = js.native
  
  var Height: Double = js.native
  
  /**
    * @param string [HelpFile='vbapp10.chm']
    * @param number [ContextID=0]
    */
  def Help(): Unit = js.native
  def Help(HelpFile: js.UndefOr[scala.Nothing], ContextID: Double): Unit = js.native
  def Help(HelpFile: String): Unit = js.native
  def Help(HelpFile: String, ContextID: Double): Unit = js.native
  
  val IsSandboxed: Boolean = js.native
  
  val LanguageSettings: typingsSlinky.activexOffice.Office.LanguageSettings = js.native
  
  def LaunchPublishSlidesDialog(SlideLibraryUrl: String): Unit = js.native
  
  def LaunchSendToPPTDialog(SlideUrls: js.Any): Unit = js.native
  
  var Left: Double = js.native
  
  val Marker: js.Any = js.native
  
  val MsoDebugOptions: typingsSlinky.activexOffice.Office.MsoDebugOptions = js.native
  
  val Name: String = js.native
  
  val NewPresentation: NewFile = js.native
  
  val OperatingSystem: String = js.native
  
  val Options: typingsSlinky.activexPowerpoint.PowerPoint.Options = js.native
  
  def PPFileDialog(Type: PpFileDialogType): js.Any = js.native
  
  val Path: String = js.native
  
  @JSName("PowerPoint.Application_typekey")
  var PowerPointDotApplication_typekey: Application = js.native
  
  val Presentations: typingsSlinky.activexPowerpoint.PowerPoint.Presentations = js.native
  
  val ProductCode: String = js.native
  
  val ProtectedViewWindows: typingsSlinky.activexPowerpoint.PowerPoint.ProtectedViewWindows = js.native
  
  def Quit(): Unit = js.native
  
  val ResampleMediaTasks: typingsSlinky.activexPowerpoint.PowerPoint.ResampleMediaTasks = js.native
  
  def Run(MacroName: String, safeArrayOfParams: js.Any*): js.Any = js.native
  
  /** @param boolean [Persist=false] */
  def SetOptionFlag(Option: Double, State: Boolean): Unit = js.native
  def SetOptionFlag(Option: Double, State: Boolean, Persist: Boolean): Unit = js.native
  
  def SetPerfMarker(Marker: Double): Unit = js.native
  
  var ShowStartupDialog: MsoTriState = js.native
  
  var ShowWindowsInTaskbar: MsoTriState = js.native
  
  val SlideShowWindows: typingsSlinky.activexPowerpoint.PowerPoint.SlideShowWindows = js.native
  
  def SmartArtColors(Index: String): SmartArtColor = js.native
  def SmartArtColors(Index: Double): SmartArtColor = js.native
  @JSName("SmartArtColors")
  val SmartArtColors_Original: SmartArtColors = js.native
  
  def SmartArtLayouts(Index: String): SmartArtLayout = js.native
  def SmartArtLayouts(Index: Double): SmartArtLayout = js.native
  @JSName("SmartArtLayouts")
  val SmartArtLayouts_Original: SmartArtLayouts = js.native
  
  def SmartArtQuickStyles(Index: String): SmartArtQuickStyle = js.native
  def SmartArtQuickStyles(Index: Double): SmartArtQuickStyle = js.native
  @JSName("SmartArtQuickStyles")
  val SmartArtQuickStyles_Original: SmartArtQuickStyles = js.native
  
  def StartNewUndoEntry(): Unit = js.native
  
  var Top: Double = js.native
  
  val VBE: typingsSlinky.activexVbide.VBIDE.VBE = js.native
  
  val Version: String = js.native
  
  var Visible: MsoTriState = js.native
  
  var Width: Double = js.native
  
  var WindowState: PpWindowState = js.native
  
  val Windows: DocumentWindows = js.native
}
