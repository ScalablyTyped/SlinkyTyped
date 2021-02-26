package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.CommandBar
import typingsSlinky.activexOffice.Office.CommandBars
import typingsSlinky.activexOffice.Office.CustomXMLPart
import typingsSlinky.activexOffice.Office.CustomXMLParts
import typingsSlinky.activexOffice.Office.DocumentInspector
import typingsSlinky.activexOffice.Office.DocumentInspectors
import typingsSlinky.activexOffice.Office.DocumentLibraryVersion
import typingsSlinky.activexOffice.Office.DocumentLibraryVersions
import typingsSlinky.activexOffice.Office.MetaProperties
import typingsSlinky.activexOffice.Office.MetaProperty
import typingsSlinky.activexOffice.Office.MsoEncoding
import typingsSlinky.activexOffice.Office.MsoExtraInfoMethod
import typingsSlinky.activexOffice.Office.MsoFarEastLineBreakLanguageID
import typingsSlinky.activexOffice.Office.MsoLanguageID
import typingsSlinky.activexOffice.Office.MsoTriState
import typingsSlinky.activexOffice.Office.Permission
import typingsSlinky.activexOffice.Office.PolicyItem
import typingsSlinky.activexOffice.Office.ServerPolicy
import typingsSlinky.activexOffice.Office.Signature
import typingsSlinky.activexOffice.Office.SignatureSet
import typingsSlinky.activexOffice.Office.UserPermission
import typingsSlinky.activexOffice.Office.WorkflowTasks
import typingsSlinky.activexOffice.Office.WorkflowTemplates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Presentation extends StObject {
  
  def AcceptAll(): Unit = js.native
  
  /** @param string [FileName=''] */
  def AddBaseline(): Unit = js.native
  def AddBaseline(FileName: String): Unit = js.native
  
  def AddTitleMaster(): Master = js.native
  
  def AddToFavorites(): Unit = js.native
  
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  
  def ApplyTemplate(FileName: String): Unit = js.native
  
  def ApplyTheme(themeName: String): Unit = js.native
  
  val Broadcast: typingsSlinky.activexPowerpoint.PowerPoint.Broadcast = js.native
  
  val BuiltInDocumentProperties: js.Any = js.native
  
  def CanCheckIn(): Boolean = js.native
  
  /** @param boolean [SaveChanges=true] */
  def CheckIn(): Unit = js.native
  def CheckIn(SaveChanges: js.UndefOr[scala.Nothing], Comments: js.UndefOr[scala.Nothing], MakePublic: js.Any): Unit = js.native
  def CheckIn(SaveChanges: js.UndefOr[scala.Nothing], Comments: js.Any): Unit = js.native
  def CheckIn(SaveChanges: js.UndefOr[scala.Nothing], Comments: js.Any, MakePublic: js.Any): Unit = js.native
  def CheckIn(SaveChanges: Boolean): Unit = js.native
  def CheckIn(SaveChanges: Boolean, Comments: js.UndefOr[scala.Nothing], MakePublic: js.Any): Unit = js.native
  def CheckIn(SaveChanges: Boolean, Comments: js.Any): Unit = js.native
  def CheckIn(SaveChanges: Boolean, Comments: js.Any, MakePublic: js.Any): Unit = js.native
  
  /** @param boolean [SaveChanges=true] */
  def CheckInWithVersion(): Unit = js.native
  def CheckInWithVersion(
    SaveChanges: js.UndefOr[scala.Nothing],
    Comments: js.UndefOr[scala.Nothing],
    MakePublic: js.UndefOr[scala.Nothing],
    VersionType: js.Any
  ): Unit = js.native
  def CheckInWithVersion(SaveChanges: js.UndefOr[scala.Nothing], Comments: js.UndefOr[scala.Nothing], MakePublic: js.Any): Unit = js.native
  def CheckInWithVersion(
    SaveChanges: js.UndefOr[scala.Nothing],
    Comments: js.UndefOr[scala.Nothing],
    MakePublic: js.Any,
    VersionType: js.Any
  ): Unit = js.native
  def CheckInWithVersion(SaveChanges: js.UndefOr[scala.Nothing], Comments: js.Any): Unit = js.native
  def CheckInWithVersion(
    SaveChanges: js.UndefOr[scala.Nothing],
    Comments: js.Any,
    MakePublic: js.UndefOr[scala.Nothing],
    VersionType: js.Any
  ): Unit = js.native
  def CheckInWithVersion(SaveChanges: js.UndefOr[scala.Nothing], Comments: js.Any, MakePublic: js.Any): Unit = js.native
  def CheckInWithVersion(SaveChanges: js.UndefOr[scala.Nothing], Comments: js.Any, MakePublic: js.Any, VersionType: js.Any): Unit = js.native
  def CheckInWithVersion(SaveChanges: Boolean): Unit = js.native
  def CheckInWithVersion(
    SaveChanges: Boolean,
    Comments: js.UndefOr[scala.Nothing],
    MakePublic: js.UndefOr[scala.Nothing],
    VersionType: js.Any
  ): Unit = js.native
  def CheckInWithVersion(SaveChanges: Boolean, Comments: js.UndefOr[scala.Nothing], MakePublic: js.Any): Unit = js.native
  def CheckInWithVersion(SaveChanges: Boolean, Comments: js.UndefOr[scala.Nothing], MakePublic: js.Any, VersionType: js.Any): Unit = js.native
  def CheckInWithVersion(SaveChanges: Boolean, Comments: js.Any): Unit = js.native
  def CheckInWithVersion(SaveChanges: Boolean, Comments: js.Any, MakePublic: js.UndefOr[scala.Nothing], VersionType: js.Any): Unit = js.native
  def CheckInWithVersion(SaveChanges: Boolean, Comments: js.Any, MakePublic: js.Any): Unit = js.native
  def CheckInWithVersion(SaveChanges: Boolean, Comments: js.Any, MakePublic: js.Any, VersionType: js.Any): Unit = js.native
  
  def Close(): Unit = js.native
  
  val Coauthoring: typingsSlinky.activexPowerpoint.PowerPoint.Coauthoring = js.native
  
  val ColorSchemes: typingsSlinky.activexPowerpoint.PowerPoint.ColorSchemes = js.native
  
  def CommandBars(Index: String): CommandBar = js.native
  def CommandBars(Index: Double): CommandBar = js.native
  @JSName("CommandBars")
  val CommandBars_Original: CommandBars = js.native
  
  val Container: js.Any = js.native
  
  def ContentTypeProperties(Index: String): MetaProperty = js.native
  def ContentTypeProperties(Index: Double): MetaProperty = js.native
  @JSName("ContentTypeProperties")
  val ContentTypeProperties_Original: MetaProperties = js.native
  
  def Convert(): Unit = js.native
  
  def Convert2(FileName: String): Unit = js.native
  
  /**
    * @param boolean [UseTimingsAndNarrations=true]
    * @param number [DefaultSlideDuration=5]
    * @param number [VertResolution=720]
    * @param number [FramesPerSecond=30]
    * @param number [Quality=85]
    */
  def CreateVideo(FileName: String): Unit = js.native
  def CreateVideo(
    FileName: String,
    UseTimingsAndNarrations: js.UndefOr[scala.Nothing],
    DefaultSlideDuration: js.UndefOr[scala.Nothing],
    VertResolution: js.UndefOr[scala.Nothing],
    FramesPerSecond: js.UndefOr[scala.Nothing],
    Quality: Double
  ): Unit = js.native
  def CreateVideo(
    FileName: String,
    UseTimingsAndNarrations: js.UndefOr[scala.Nothing],
    DefaultSlideDuration: js.UndefOr[scala.Nothing],
    VertResolution: js.UndefOr[scala.Nothing],
    FramesPerSecond: Double
  ): Unit = js.native
  def CreateVideo(
    FileName: String,
    UseTimingsAndNarrations: js.UndefOr[scala.Nothing],
    DefaultSlideDuration: js.UndefOr[scala.Nothing],
    VertResolution: js.UndefOr[scala.Nothing],
    FramesPerSecond: Double,
    Quality: Double
  ): Unit = js.native
  def CreateVideo(
    FileName: String,
    UseTimingsAndNarrations: js.UndefOr[scala.Nothing],
    DefaultSlideDuration: js.UndefOr[scala.Nothing],
    VertResolution: Double
  ): Unit = js.native
  def CreateVideo(
    FileName: String,
    UseTimingsAndNarrations: js.UndefOr[scala.Nothing],
    DefaultSlideDuration: js.UndefOr[scala.Nothing],
    VertResolution: Double,
    FramesPerSecond: js.UndefOr[scala.Nothing],
    Quality: Double
  ): Unit = js.native
  def CreateVideo(
    FileName: String,
    UseTimingsAndNarrations: js.UndefOr[scala.Nothing],
    DefaultSlideDuration: js.UndefOr[scala.Nothing],
    VertResolution: Double,
    FramesPerSecond: Double
  ): Unit = js.native
  def CreateVideo(
    FileName: String,
    UseTimingsAndNarrations: js.UndefOr[scala.Nothing],
    DefaultSlideDuration: js.UndefOr[scala.Nothing],
    VertResolution: Double,
    FramesPerSecond: Double,
    Quality: Double
  ): Unit = js.native
  def CreateVideo(FileName: String, UseTimingsAndNarrations: js.UndefOr[scala.Nothing], DefaultSlideDuration: Double): Unit = js.native
  def CreateVideo(
    FileName: String,
    UseTimingsAndNarrations: js.UndefOr[scala.Nothing],
    DefaultSlideDuration: Double,
    VertResolution: js.UndefOr[scala.Nothing],
    FramesPerSecond: js.UndefOr[scala.Nothing],
    Quality: Double
  ): Unit = js.native
  def CreateVideo(
    FileName: String,
    UseTimingsAndNarrations: js.UndefOr[scala.Nothing],
    DefaultSlideDuration: Double,
    VertResolution: js.UndefOr[scala.Nothing],
    FramesPerSecond: Double
  ): Unit = js.native
  def CreateVideo(
    FileName: String,
    UseTimingsAndNarrations: js.UndefOr[scala.Nothing],
    DefaultSlideDuration: Double,
    VertResolution: js.UndefOr[scala.Nothing],
    FramesPerSecond: Double,
    Quality: Double
  ): Unit = js.native
  def CreateVideo(
    FileName: String,
    UseTimingsAndNarrations: js.UndefOr[scala.Nothing],
    DefaultSlideDuration: Double,
    VertResolution: Double
  ): Unit = js.native
  def CreateVideo(
    FileName: String,
    UseTimingsAndNarrations: js.UndefOr[scala.Nothing],
    DefaultSlideDuration: Double,
    VertResolution: Double,
    FramesPerSecond: js.UndefOr[scala.Nothing],
    Quality: Double
  ): Unit = js.native
  def CreateVideo(
    FileName: String,
    UseTimingsAndNarrations: js.UndefOr[scala.Nothing],
    DefaultSlideDuration: Double,
    VertResolution: Double,
    FramesPerSecond: Double
  ): Unit = js.native
  def CreateVideo(
    FileName: String,
    UseTimingsAndNarrations: js.UndefOr[scala.Nothing],
    DefaultSlideDuration: Double,
    VertResolution: Double,
    FramesPerSecond: Double,
    Quality: Double
  ): Unit = js.native
  def CreateVideo(FileName: String, UseTimingsAndNarrations: Boolean): Unit = js.native
  def CreateVideo(
    FileName: String,
    UseTimingsAndNarrations: Boolean,
    DefaultSlideDuration: js.UndefOr[scala.Nothing],
    VertResolution: js.UndefOr[scala.Nothing],
    FramesPerSecond: js.UndefOr[scala.Nothing],
    Quality: Double
  ): Unit = js.native
  def CreateVideo(
    FileName: String,
    UseTimingsAndNarrations: Boolean,
    DefaultSlideDuration: js.UndefOr[scala.Nothing],
    VertResolution: js.UndefOr[scala.Nothing],
    FramesPerSecond: Double
  ): Unit = js.native
  def CreateVideo(
    FileName: String,
    UseTimingsAndNarrations: Boolean,
    DefaultSlideDuration: js.UndefOr[scala.Nothing],
    VertResolution: js.UndefOr[scala.Nothing],
    FramesPerSecond: Double,
    Quality: Double
  ): Unit = js.native
  def CreateVideo(
    FileName: String,
    UseTimingsAndNarrations: Boolean,
    DefaultSlideDuration: js.UndefOr[scala.Nothing],
    VertResolution: Double
  ): Unit = js.native
  def CreateVideo(
    FileName: String,
    UseTimingsAndNarrations: Boolean,
    DefaultSlideDuration: js.UndefOr[scala.Nothing],
    VertResolution: Double,
    FramesPerSecond: js.UndefOr[scala.Nothing],
    Quality: Double
  ): Unit = js.native
  def CreateVideo(
    FileName: String,
    UseTimingsAndNarrations: Boolean,
    DefaultSlideDuration: js.UndefOr[scala.Nothing],
    VertResolution: Double,
    FramesPerSecond: Double
  ): Unit = js.native
  def CreateVideo(
    FileName: String,
    UseTimingsAndNarrations: Boolean,
    DefaultSlideDuration: js.UndefOr[scala.Nothing],
    VertResolution: Double,
    FramesPerSecond: Double,
    Quality: Double
  ): Unit = js.native
  def CreateVideo(FileName: String, UseTimingsAndNarrations: Boolean, DefaultSlideDuration: Double): Unit = js.native
  def CreateVideo(
    FileName: String,
    UseTimingsAndNarrations: Boolean,
    DefaultSlideDuration: Double,
    VertResolution: js.UndefOr[scala.Nothing],
    FramesPerSecond: js.UndefOr[scala.Nothing],
    Quality: Double
  ): Unit = js.native
  def CreateVideo(
    FileName: String,
    UseTimingsAndNarrations: Boolean,
    DefaultSlideDuration: Double,
    VertResolution: js.UndefOr[scala.Nothing],
    FramesPerSecond: Double
  ): Unit = js.native
  def CreateVideo(
    FileName: String,
    UseTimingsAndNarrations: Boolean,
    DefaultSlideDuration: Double,
    VertResolution: js.UndefOr[scala.Nothing],
    FramesPerSecond: Double,
    Quality: Double
  ): Unit = js.native
  def CreateVideo(
    FileName: String,
    UseTimingsAndNarrations: Boolean,
    DefaultSlideDuration: Double,
    VertResolution: Double
  ): Unit = js.native
  def CreateVideo(
    FileName: String,
    UseTimingsAndNarrations: Boolean,
    DefaultSlideDuration: Double,
    VertResolution: Double,
    FramesPerSecond: js.UndefOr[scala.Nothing],
    Quality: Double
  ): Unit = js.native
  def CreateVideo(
    FileName: String,
    UseTimingsAndNarrations: Boolean,
    DefaultSlideDuration: Double,
    VertResolution: Double,
    FramesPerSecond: Double
  ): Unit = js.native
  def CreateVideo(
    FileName: String,
    UseTimingsAndNarrations: Boolean,
    DefaultSlideDuration: Double,
    VertResolution: Double,
    FramesPerSecond: Double,
    Quality: Double
  ): Unit = js.native
  
  val CreateVideoStatus: PpMediaTaskStatus = js.native
  
  val CustomDocumentProperties: js.Any = js.native
  
  def CustomXMLParts(Index: String): CustomXMLPart = js.native
  def CustomXMLParts(Index: Double): CustomXMLPart = js.native
  @JSName("CustomXMLParts")
  val CustomXMLParts_Original: CustomXMLParts = js.native
  
  val CustomerData: typingsSlinky.activexPowerpoint.PowerPoint.CustomerData = js.native
  
  var DefaultLanguageID: MsoLanguageID = js.native
  
  val DefaultShape: Shape = js.native
  
  def DeleteSection(Index: Double): Unit = js.native
  
  val Designs: typingsSlinky.activexPowerpoint.PowerPoint.Designs = js.native
  
  def DisableSections(): Unit = js.native
  
  var DisplayComments: MsoTriState = js.native
  
  def DocumentInspectors(Index: Double): DocumentInspector = js.native
  @JSName("DocumentInspectors")
  val DocumentInspectors_Original: DocumentInspectors = js.native
  
  def DocumentLibraryVersions(lIndex: Double): DocumentLibraryVersion = js.native
  @JSName("DocumentLibraryVersions")
  val DocumentLibraryVersions_Original: DocumentLibraryVersions = js.native
  
  var EncryptionProvider: String = js.native
  
  def EndReview(): Unit = js.native
  
  def EnsureAllMediaUpgraded(): Unit = js.native
  
  var EnvelopeVisible: MsoTriState = js.native
  
  /**
    * @param number [ScaleWidth=0]
    * @param number [ScaleHeight=0]
    */
  def Export(Path: String, FilterName: String): Unit = js.native
  def Export(Path: String, FilterName: String, ScaleWidth: js.UndefOr[scala.Nothing], ScaleHeight: Double): Unit = js.native
  def Export(Path: String, FilterName: String, ScaleWidth: Double): Unit = js.native
  def Export(Path: String, FilterName: String, ScaleWidth: Double, ScaleHeight: Double): Unit = js.native
  
  /**
    * @param PowerPoint.PpFixedFormatIntent [Intent=1]
    * @param Office.MsoTriState [FrameSlides=0]
    * @param PowerPoint.PpPrintHandoutOrder [HandoutOrder=1]
    * @param PowerPoint.PpPrintOutputType [OutputType=1]
    * @param Office.MsoTriState [PrintHiddenSlides=0]
    * @param PowerPoint.PrintRange [PrintRange=0]
    * @param PowerPoint.PpPrintRangeType [RangeType=1]
    * @param string [SlideShowName='']
    * @param boolean [IncludeDocProperties=false]
    * @param boolean [KeepIRMSettings=true]
    * @param boolean [DocStructureTags=true]
    * @param boolean [BitmapMissingFonts=true]
    * @param boolean [UseISO19005_1=false]
    */
  def ExportAsFixedFormat(
    Path: String,
    FixedFormatType: PpFixedFormatType,
    Intent: js.UndefOr[PpFixedFormatIntent],
    FrameSlides: js.UndefOr[MsoTriState],
    HandoutOrder: js.UndefOr[PpPrintHandoutOrder],
    OutputType: js.UndefOr[PpPrintOutputType],
    PrintHiddenSlides: js.UndefOr[MsoTriState],
    PrintRange: js.UndefOr[PrintRange],
    RangeType: js.UndefOr[PpPrintRangeType],
    SlideShowName: js.UndefOr[String],
    IncludeDocProperties: js.UndefOr[Boolean],
    KeepIRMSettings: js.UndefOr[Boolean],
    DocStructureTags: js.UndefOr[Boolean],
    BitmapMissingFonts: js.UndefOr[Boolean],
    UseISO19005_1: js.UndefOr[Boolean],
    ExternalExporter: js.UndefOr[js.Any]
  ): Unit = js.native
  
  val ExtraColors: typingsSlinky.activexPowerpoint.PowerPoint.ExtraColors = js.native
  
  var FarEastLineBreakLanguage: MsoFarEastLineBreakLanguageID = js.native
  
  var FarEastLineBreakLevel: PpFarEastLineBreakLevel = js.native
  
  var Final: Boolean = js.native
  
  /**
    * @param string [SubAddress='']
    * @param boolean [NewWindow=false]
    * @param boolean [AddHistory=true]
    * @param string [ExtraInfo='']
    * @param Office.MsoExtraInfoMethod [Method=0]
    * @param string [HeaderInfo='']
    */
  def FollowHyperlink(
    Address: String,
    SubAddress: js.UndefOr[String],
    NewWindow: js.UndefOr[Boolean],
    AddHistory: js.UndefOr[Boolean],
    ExtraInfo: js.UndefOr[String],
    Method: js.UndefOr[MsoExtraInfoMethod],
    HeaderInfo: js.UndefOr[String]
  ): Unit = js.native
  
  val Fonts: typingsSlinky.activexPowerpoint.PowerPoint.Fonts = js.native
  
  val FullName: String = js.native
  
  def GetWorkflowTasks(): WorkflowTasks = js.native
  
  def GetWorkflowTemplates(): WorkflowTemplates = js.native
  
  var GridDistance: Double = js.native
  
  val HTMLProject: typingsSlinky.activexOffice.Office.HTMLProject = js.native
  
  val HandoutMaster: Master = js.native
  
  val HasHandoutMaster: Boolean = js.native
  
  val HasNotesMaster: Boolean = js.native
  
  val HasRevisionInfo: PpRevisionInfo = js.native
  
  val HasSections: Boolean = js.native
  
  val HasTitleMaster: MsoTriState = js.native
  
  val HasVBProject: Boolean = js.native
  
  val InMergeMode: Boolean = js.native
  
  var LayoutDirection: PpDirection = js.native
  
  def LockServerFile(): Unit = js.native
  
  def MakeIntoTemplate(IsDesignTemplate: MsoTriState): Unit = js.native
  
  def Merge(Path: String): Unit = js.native
  
  def MergeWithBaseline(withPresentation: String, baselinePresentation: String): Unit = js.native
  
  val Name: String = js.native
  
  def NewSectionAfter(Index: Double, AfterSlide: Boolean, sectionTitle: String, newSectionIndex: Double): Unit = js.native
  
  def NewWindow(): DocumentWindow = js.native
  
  var NoLineBreakAfter: String = js.native
  
  var NoLineBreakBefore: String = js.native
  
  val NotesMaster: Master = js.native
  
  val PageSetup: typingsSlinky.activexPowerpoint.PowerPoint.PageSetup = js.native
  
  val Parent: js.Any = js.native
  
  var Password: String = js.native
  
  val PasswordEncryptionAlgorithm: String = js.native
  
  val PasswordEncryptionFileProperties: Boolean = js.native
  
  val PasswordEncryptionKeyLength: Double = js.native
  
  val PasswordEncryptionProvider: String = js.native
  
  val Path: String = js.native
  
  def Permission(Index: js.Any): UserPermission = js.native
  @JSName("Permission")
  val Permission_Original: Permission = js.native
  
  @JSName("PowerPoint.Presentation_typekey")
  var PowerPointDotPresentation_typekey: Presentation = js.native
  
  val PrintOptions: typingsSlinky.activexPowerpoint.PowerPoint.PrintOptions = js.native
  
  /**
    * @param number [From=-1]
    * @param number [To=-1]
    * @param string [PrintToFile='']
    * @param number [Copies=0]
    * @param Office.MsoTriState [Collate=-99]
    */
  def PrintOut(): Unit = js.native
  def PrintOut(
    From: js.UndefOr[scala.Nothing],
    To: js.UndefOr[scala.Nothing],
    PrintToFile: js.UndefOr[scala.Nothing],
    Copies: js.UndefOr[scala.Nothing],
    Collate: MsoTriState
  ): Unit = js.native
  def PrintOut(
    From: js.UndefOr[scala.Nothing],
    To: js.UndefOr[scala.Nothing],
    PrintToFile: js.UndefOr[scala.Nothing],
    Copies: Double
  ): Unit = js.native
  def PrintOut(
    From: js.UndefOr[scala.Nothing],
    To: js.UndefOr[scala.Nothing],
    PrintToFile: js.UndefOr[scala.Nothing],
    Copies: Double,
    Collate: MsoTriState
  ): Unit = js.native
  def PrintOut(From: js.UndefOr[scala.Nothing], To: js.UndefOr[scala.Nothing], PrintToFile: String): Unit = js.native
  def PrintOut(
    From: js.UndefOr[scala.Nothing],
    To: js.UndefOr[scala.Nothing],
    PrintToFile: String,
    Copies: js.UndefOr[scala.Nothing],
    Collate: MsoTriState
  ): Unit = js.native
  def PrintOut(
    From: js.UndefOr[scala.Nothing],
    To: js.UndefOr[scala.Nothing],
    PrintToFile: String,
    Copies: Double
  ): Unit = js.native
  def PrintOut(
    From: js.UndefOr[scala.Nothing],
    To: js.UndefOr[scala.Nothing],
    PrintToFile: String,
    Copies: Double,
    Collate: MsoTriState
  ): Unit = js.native
  def PrintOut(From: js.UndefOr[scala.Nothing], To: Double): Unit = js.native
  def PrintOut(
    From: js.UndefOr[scala.Nothing],
    To: Double,
    PrintToFile: js.UndefOr[scala.Nothing],
    Copies: js.UndefOr[scala.Nothing],
    Collate: MsoTriState
  ): Unit = js.native
  def PrintOut(
    From: js.UndefOr[scala.Nothing],
    To: Double,
    PrintToFile: js.UndefOr[scala.Nothing],
    Copies: Double
  ): Unit = js.native
  def PrintOut(
    From: js.UndefOr[scala.Nothing],
    To: Double,
    PrintToFile: js.UndefOr[scala.Nothing],
    Copies: Double,
    Collate: MsoTriState
  ): Unit = js.native
  def PrintOut(From: js.UndefOr[scala.Nothing], To: Double, PrintToFile: String): Unit = js.native
  def PrintOut(
    From: js.UndefOr[scala.Nothing],
    To: Double,
    PrintToFile: String,
    Copies: js.UndefOr[scala.Nothing],
    Collate: MsoTriState
  ): Unit = js.native
  def PrintOut(From: js.UndefOr[scala.Nothing], To: Double, PrintToFile: String, Copies: Double): Unit = js.native
  def PrintOut(
    From: js.UndefOr[scala.Nothing],
    To: Double,
    PrintToFile: String,
    Copies: Double,
    Collate: MsoTriState
  ): Unit = js.native
  def PrintOut(From: Double): Unit = js.native
  def PrintOut(
    From: Double,
    To: js.UndefOr[scala.Nothing],
    PrintToFile: js.UndefOr[scala.Nothing],
    Copies: js.UndefOr[scala.Nothing],
    Collate: MsoTriState
  ): Unit = js.native
  def PrintOut(
    From: Double,
    To: js.UndefOr[scala.Nothing],
    PrintToFile: js.UndefOr[scala.Nothing],
    Copies: Double
  ): Unit = js.native
  def PrintOut(
    From: Double,
    To: js.UndefOr[scala.Nothing],
    PrintToFile: js.UndefOr[scala.Nothing],
    Copies: Double,
    Collate: MsoTriState
  ): Unit = js.native
  def PrintOut(From: Double, To: js.UndefOr[scala.Nothing], PrintToFile: String): Unit = js.native
  def PrintOut(
    From: Double,
    To: js.UndefOr[scala.Nothing],
    PrintToFile: String,
    Copies: js.UndefOr[scala.Nothing],
    Collate: MsoTriState
  ): Unit = js.native
  def PrintOut(From: Double, To: js.UndefOr[scala.Nothing], PrintToFile: String, Copies: Double): Unit = js.native
  def PrintOut(
    From: Double,
    To: js.UndefOr[scala.Nothing],
    PrintToFile: String,
    Copies: Double,
    Collate: MsoTriState
  ): Unit = js.native
  def PrintOut(From: Double, To: Double): Unit = js.native
  def PrintOut(
    From: Double,
    To: Double,
    PrintToFile: js.UndefOr[scala.Nothing],
    Copies: js.UndefOr[scala.Nothing],
    Collate: MsoTriState
  ): Unit = js.native
  def PrintOut(From: Double, To: Double, PrintToFile: js.UndefOr[scala.Nothing], Copies: Double): Unit = js.native
  def PrintOut(
    From: Double,
    To: Double,
    PrintToFile: js.UndefOr[scala.Nothing],
    Copies: Double,
    Collate: MsoTriState
  ): Unit = js.native
  def PrintOut(From: Double, To: Double, PrintToFile: String): Unit = js.native
  def PrintOut(
    From: Double,
    To: Double,
    PrintToFile: String,
    Copies: js.UndefOr[scala.Nothing],
    Collate: MsoTriState
  ): Unit = js.native
  def PrintOut(From: Double, To: Double, PrintToFile: String, Copies: Double): Unit = js.native
  def PrintOut(From: Double, To: Double, PrintToFile: String, Copies: Double, Collate: MsoTriState): Unit = js.native
  
  val PublishObjects: typingsSlinky.activexPowerpoint.PowerPoint.PublishObjects = js.native
  
  /**
    * @param boolean [Overwrite=false]
    * @param boolean [UseSlideOrder=false]
    */
  def PublishSlides(SlideLibraryUrl: String): Unit = js.native
  def PublishSlides(SlideLibraryUrl: String, Overwrite: js.UndefOr[scala.Nothing], UseSlideOrder: Boolean): Unit = js.native
  def PublishSlides(SlideLibraryUrl: String, Overwrite: Boolean): Unit = js.native
  def PublishSlides(SlideLibraryUrl: String, Overwrite: Boolean, UseSlideOrder: Boolean): Unit = js.native
  
  val ReadOnly: MsoTriState = js.native
  
  def RejectAll(): Unit = js.native
  
  def ReloadAs(cp: MsoEncoding): Unit = js.native
  
  def RemoveBaseline(): Unit = js.native
  
  def RemoveDocumentInformation(Type: PpRemoveDocInfoType): Unit = js.native
  
  var RemovePersonalInformation: MsoTriState = js.native
  
  /** @param boolean [ShowMessage=true] */
  def ReplyWithChanges(): Unit = js.native
  def ReplyWithChanges(ShowMessage: Boolean): Unit = js.native
  
  val Research: typingsSlinky.activexPowerpoint.PowerPoint.Research = js.native
  
  def Save(): Unit = js.native
  
  /**
    * @param PowerPoint.PpSaveAsFileType [FileFormat=11]
    * @param Office.MsoTriState [EmbedTrueTypeFonts=-2]
    */
  def SaveAs(FileName: String): Unit = js.native
  def SaveAs(FileName: String, FileFormat: js.UndefOr[scala.Nothing], EmbedTrueTypeFonts: MsoTriState): Unit = js.native
  def SaveAs(FileName: String, FileFormat: PpSaveAsFileType): Unit = js.native
  def SaveAs(FileName: String, FileFormat: PpSaveAsFileType, EmbedTrueTypeFonts: MsoTriState): Unit = js.native
  
  /**
    * @param PowerPoint.PpSaveAsFileType [FileFormat=11]
    * @param Office.MsoTriState [EmbedTrueTypeFonts=-2]
    */
  def SaveCopyAs(FileName: String): Unit = js.native
  def SaveCopyAs(FileName: String, FileFormat: js.UndefOr[scala.Nothing], EmbedTrueTypeFonts: MsoTriState): Unit = js.native
  def SaveCopyAs(FileName: String, FileFormat: PpSaveAsFileType): Unit = js.native
  def SaveCopyAs(FileName: String, FileFormat: PpSaveAsFileType, EmbedTrueTypeFonts: MsoTriState): Unit = js.native
  
  var Saved: MsoTriState = js.native
  
  val SectionCount: Double = js.native
  
  val SectionProperties: typingsSlinky.activexPowerpoint.PowerPoint.SectionProperties = js.native
  
  /**
    * @param string [Recipients='']
    * @param string [Subject='']
    * @param boolean [ShowMessage=false]
    */
  def SendFaxOverInternet(): Unit = js.native
  def SendFaxOverInternet(Recipients: js.UndefOr[scala.Nothing], Subject: js.UndefOr[scala.Nothing], ShowMessage: Boolean): Unit = js.native
  def SendFaxOverInternet(Recipients: js.UndefOr[scala.Nothing], Subject: String): Unit = js.native
  def SendFaxOverInternet(Recipients: js.UndefOr[scala.Nothing], Subject: String, ShowMessage: Boolean): Unit = js.native
  def SendFaxOverInternet(Recipients: String): Unit = js.native
  def SendFaxOverInternet(Recipients: String, Subject: js.UndefOr[scala.Nothing], ShowMessage: Boolean): Unit = js.native
  def SendFaxOverInternet(Recipients: String, Subject: String): Unit = js.native
  def SendFaxOverInternet(Recipients: String, Subject: String, ShowMessage: Boolean): Unit = js.native
  
  /**
    * @param string [Recipients='']
    * @param string [Subject='']
    * @param boolean [ShowMessage=true]
    */
  def SendForReview(): Unit = js.native
  def SendForReview(
    Recipients: js.UndefOr[scala.Nothing],
    Subject: js.UndefOr[scala.Nothing],
    ShowMessage: js.UndefOr[scala.Nothing],
    IncludeAttachment: js.Any
  ): Unit = js.native
  def SendForReview(Recipients: js.UndefOr[scala.Nothing], Subject: js.UndefOr[scala.Nothing], ShowMessage: Boolean): Unit = js.native
  def SendForReview(
    Recipients: js.UndefOr[scala.Nothing],
    Subject: js.UndefOr[scala.Nothing],
    ShowMessage: Boolean,
    IncludeAttachment: js.Any
  ): Unit = js.native
  def SendForReview(Recipients: js.UndefOr[scala.Nothing], Subject: String): Unit = js.native
  def SendForReview(
    Recipients: js.UndefOr[scala.Nothing],
    Subject: String,
    ShowMessage: js.UndefOr[scala.Nothing],
    IncludeAttachment: js.Any
  ): Unit = js.native
  def SendForReview(Recipients: js.UndefOr[scala.Nothing], Subject: String, ShowMessage: Boolean): Unit = js.native
  def SendForReview(
    Recipients: js.UndefOr[scala.Nothing],
    Subject: String,
    ShowMessage: Boolean,
    IncludeAttachment: js.Any
  ): Unit = js.native
  def SendForReview(Recipients: String): Unit = js.native
  def SendForReview(
    Recipients: String,
    Subject: js.UndefOr[scala.Nothing],
    ShowMessage: js.UndefOr[scala.Nothing],
    IncludeAttachment: js.Any
  ): Unit = js.native
  def SendForReview(Recipients: String, Subject: js.UndefOr[scala.Nothing], ShowMessage: Boolean): Unit = js.native
  def SendForReview(
    Recipients: String,
    Subject: js.UndefOr[scala.Nothing],
    ShowMessage: Boolean,
    IncludeAttachment: js.Any
  ): Unit = js.native
  def SendForReview(Recipients: String, Subject: String): Unit = js.native
  def SendForReview(
    Recipients: String,
    Subject: String,
    ShowMessage: js.UndefOr[scala.Nothing],
    IncludeAttachment: js.Any
  ): Unit = js.native
  def SendForReview(Recipients: String, Subject: String, ShowMessage: Boolean): Unit = js.native
  def SendForReview(Recipients: String, Subject: String, ShowMessage: Boolean, IncludeAttachment: js.Any): Unit = js.native
  
  def ServerPolicy(Index: String): PolicyItem = js.native
  def ServerPolicy(Index: Double): PolicyItem = js.native
  @JSName("ServerPolicy")
  val ServerPolicy_Original: ServerPolicy = js.native
  
  def SetPasswordEncryptionOptions(
    PasswordEncryptionProvider: String,
    PasswordEncryptionAlgorithm: String,
    PasswordEncryptionKeyLength: Double,
    PasswordEncryptionFileProperties: Boolean
  ): Unit = js.native
  
  def SetUndoText(Text: String): Unit = js.native
  
  val SharedWorkspace: typingsSlinky.activexOffice.Office.SharedWorkspace = js.native
  
  def Signatures(iSig: Double): Signature = js.native
  @JSName("Signatures")
  val Signatures_Original: SignatureSet = js.native
  
  val SlideMaster: Master = js.native
  
  val SlideShowSettings: typingsSlinky.activexPowerpoint.PowerPoint.SlideShowSettings = js.native
  
  val SlideShowWindow: typingsSlinky.activexPowerpoint.PowerPoint.SlideShowWindow = js.native
  
  val Slides: typingsSlinky.activexPowerpoint.PowerPoint.Slides = js.native
  
  var SnapToGrid: MsoTriState = js.native
  
  val Sync: typingsSlinky.activexOffice.Office.Sync = js.native
  
  val Tags: typingsSlinky.activexPowerpoint.PowerPoint.Tags = js.native
  
  val TemplateName: String = js.native
  
  val TitleMaster: Master = js.native
  
  def UpdateLinks(): Unit = js.native
  
  val VBASigned: MsoTriState = js.native
  
  val VBProject: typingsSlinky.activexVbide.VBIDE.VBProject = js.native
  
  val WebOptions: typingsSlinky.activexPowerpoint.PowerPoint.WebOptions = js.native
  
  def WebPagePreview(): Unit = js.native
  
  val Windows: DocumentWindows = js.native
  
  var WritePassword: String = js.native
  
  def sblt(s: String): Unit = js.native
  
  def sectionTitle(Index: Double): String = js.native
}
