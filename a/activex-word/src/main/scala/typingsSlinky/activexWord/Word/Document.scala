package typingsSlinky.activexWord.Word

import typingsSlinky.activexOffice.Office.CommandBar
import typingsSlinky.activexOffice.Office.CommandBars
import typingsSlinky.activexOffice.Office.CustomXMLNode
import typingsSlinky.activexOffice.Office.CustomXMLPart
import typingsSlinky.activexOffice.Office.CustomXMLParts
import typingsSlinky.activexOffice.Office.DocumentInspector
import typingsSlinky.activexOffice.Office.DocumentInspectors
import typingsSlinky.activexOffice.Office.DocumentLibraryVersion
import typingsSlinky.activexOffice.Office.DocumentLibraryVersions
import typingsSlinky.activexOffice.Office.DocumentProperties
import typingsSlinky.activexOffice.Office.DocumentProperty
import typingsSlinky.activexOffice.Office.MetaProperties
import typingsSlinky.activexOffice.Office.MetaProperty
import typingsSlinky.activexOffice.Office.MsoEncoding
import typingsSlinky.activexOffice.Office.MsoEnvelope
import typingsSlinky.activexOffice.Office.OfficeTheme
import typingsSlinky.activexOffice.Office.Permission
import typingsSlinky.activexOffice.Office.PolicyItem
import typingsSlinky.activexOffice.Office.Script
import typingsSlinky.activexOffice.Office.Scripts
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
trait Document extends StObject {
  
  def AcceptAllRevisions(): Unit = js.native
  
  def AcceptAllRevisionsShown(): Unit = js.native
  
  def Activate(): Unit = js.native
  
  val ActiveTheme: String = js.native
  
  val ActiveThemeDisplayName: String = js.native
  
  val ActiveWindow: Window = js.native
  
  def ActiveWritingStyle(LanguageID: js.Any): String = js.native
  
  def AddDocumentWorkspaceHeader(RichFormat: Boolean, Url: String, Title: String, Description: String, ID: String): Unit = js.native
  
  def AddMeetingWorkspaceHeader(SkipIfAbsent: Boolean, Url: String, Title: String, Description: String, ID: String): Unit = js.native
  
  def AddToFavorites(): Unit = js.native
  
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  
  def ApplyDocumentTheme(FileName: String): Unit = js.native
  
  def ApplyQuickStyleSet(Name: String): Unit = js.native
  
  def ApplyQuickStyleSet2(Style: js.Any): Unit = js.native
  
  def ApplyTheme(Name: String): Unit = js.native
  
  var AttachedTemplate: Template = js.native
  
  def AutoFormat(): Unit = js.native
  
  var AutoFormatOverride: Boolean = js.native
  
  var AutoHyphenation: Boolean = js.native
  
  def AutoSummarize(): Range = js.native
  def AutoSummarize(Length: js.UndefOr[scala.Nothing], Mode: js.UndefOr[scala.Nothing], UpdateProperties: js.Any): Range = js.native
  def AutoSummarize(Length: js.UndefOr[scala.Nothing], Mode: js.Any): Range = js.native
  def AutoSummarize(Length: js.UndefOr[scala.Nothing], Mode: js.Any, UpdateProperties: js.Any): Range = js.native
  def AutoSummarize(Length: js.Any): Range = js.native
  def AutoSummarize(Length: js.Any, Mode: js.UndefOr[scala.Nothing], UpdateProperties: js.Any): Range = js.native
  def AutoSummarize(Length: js.Any, Mode: js.Any): Range = js.native
  def AutoSummarize(Length: js.Any, Mode: js.Any, UpdateProperties: js.Any): Range = js.native
  
  var Background: Shape = js.native
  
  val Bibliography: typingsSlinky.activexWord.Word.Bibliography = js.native
  
  val Bookmarks: typingsSlinky.activexWord.Word.Bookmarks = js.native
  
  def BuiltInDocumentProperties(index: String): DocumentProperty[typingsSlinky.activexWord.Word.Application] = js.native
  def BuiltInDocumentProperties(index: Double): DocumentProperty[typingsSlinky.activexWord.Word.Application] = js.native
  @JSName("BuiltInDocumentProperties")
  val BuiltInDocumentProperties_Original: DocumentProperties[typingsSlinky.activexWord.Word.Application] = js.native
  
  def CanCheckin(): Boolean = js.native
  
  val Characters: typingsSlinky.activexWord.Word.Characters = js.native
  
  def CheckConsistency(): Unit = js.native
  
  def CheckGrammar(): Unit = js.native
  
  /**
    * @param boolean [SaveChanges=true]
    * @param boolean [MakePublic=false]
    */
  def CheckIn(): Unit = js.native
  def CheckIn(SaveChanges: js.UndefOr[scala.Nothing], Comments: js.UndefOr[scala.Nothing], MakePublic: Boolean): Unit = js.native
  def CheckIn(SaveChanges: js.UndefOr[scala.Nothing], Comments: js.Any): Unit = js.native
  def CheckIn(SaveChanges: js.UndefOr[scala.Nothing], Comments: js.Any, MakePublic: Boolean): Unit = js.native
  def CheckIn(SaveChanges: Boolean): Unit = js.native
  def CheckIn(SaveChanges: Boolean, Comments: js.UndefOr[scala.Nothing], MakePublic: Boolean): Unit = js.native
  def CheckIn(SaveChanges: Boolean, Comments: js.Any): Unit = js.native
  def CheckIn(SaveChanges: Boolean, Comments: js.Any, MakePublic: Boolean): Unit = js.native
  
  /**
    * @param boolean [SaveChanges=true]
    * @param boolean [MakePublic=false]
    */
  def CheckInWithVersion(): Unit = js.native
  def CheckInWithVersion(
    SaveChanges: js.UndefOr[scala.Nothing],
    Comments: js.UndefOr[scala.Nothing],
    MakePublic: js.UndefOr[scala.Nothing],
    VersionType: js.Any
  ): Unit = js.native
  def CheckInWithVersion(SaveChanges: js.UndefOr[scala.Nothing], Comments: js.UndefOr[scala.Nothing], MakePublic: Boolean): Unit = js.native
  def CheckInWithVersion(
    SaveChanges: js.UndefOr[scala.Nothing],
    Comments: js.UndefOr[scala.Nothing],
    MakePublic: Boolean,
    VersionType: js.Any
  ): Unit = js.native
  def CheckInWithVersion(SaveChanges: js.UndefOr[scala.Nothing], Comments: js.Any): Unit = js.native
  def CheckInWithVersion(
    SaveChanges: js.UndefOr[scala.Nothing],
    Comments: js.Any,
    MakePublic: js.UndefOr[scala.Nothing],
    VersionType: js.Any
  ): Unit = js.native
  def CheckInWithVersion(SaveChanges: js.UndefOr[scala.Nothing], Comments: js.Any, MakePublic: Boolean): Unit = js.native
  def CheckInWithVersion(SaveChanges: js.UndefOr[scala.Nothing], Comments: js.Any, MakePublic: Boolean, VersionType: js.Any): Unit = js.native
  def CheckInWithVersion(SaveChanges: Boolean): Unit = js.native
  def CheckInWithVersion(
    SaveChanges: Boolean,
    Comments: js.UndefOr[scala.Nothing],
    MakePublic: js.UndefOr[scala.Nothing],
    VersionType: js.Any
  ): Unit = js.native
  def CheckInWithVersion(SaveChanges: Boolean, Comments: js.UndefOr[scala.Nothing], MakePublic: Boolean): Unit = js.native
  def CheckInWithVersion(
    SaveChanges: Boolean,
    Comments: js.UndefOr[scala.Nothing],
    MakePublic: Boolean,
    VersionType: js.Any
  ): Unit = js.native
  def CheckInWithVersion(SaveChanges: Boolean, Comments: js.Any): Unit = js.native
  def CheckInWithVersion(SaveChanges: Boolean, Comments: js.Any, MakePublic: js.UndefOr[scala.Nothing], VersionType: js.Any): Unit = js.native
  def CheckInWithVersion(SaveChanges: Boolean, Comments: js.Any, MakePublic: Boolean): Unit = js.native
  def CheckInWithVersion(SaveChanges: Boolean, Comments: js.Any, MakePublic: Boolean, VersionType: js.Any): Unit = js.native
  
  def CheckNewSmartTags(): Unit = js.native
  
  def CheckSpelling(
    CustomDictionary: js.UndefOr[js.Any],
    IgnoreUppercase: js.UndefOr[js.Any],
    AlwaysSuggest: js.UndefOr[js.Any],
    CustomDictionary2: js.UndefOr[js.Any],
    CustomDictionary3: js.UndefOr[js.Any],
    CustomDictionary4: js.UndefOr[js.Any],
    CustomDictionary5: js.UndefOr[js.Any],
    CustomDictionary6: js.UndefOr[js.Any],
    CustomDictionary7: js.UndefOr[js.Any],
    CustomDictionary8: js.UndefOr[js.Any],
    CustomDictionary9: js.UndefOr[js.Any],
    CustomDictionary10: js.UndefOr[js.Any]
  ): Unit = js.native
  
  val ChildNodeSuggestions: XMLChildNodeSuggestions = js.native
  
  var ClickAndTypeParagraphStyle: js.Any = js.native
  
  def Close(): Unit = js.native
  def Close(
    SaveChanges: js.UndefOr[scala.Nothing],
    OriginalFormat: js.UndefOr[scala.Nothing],
    RouteDocument: js.Any
  ): Unit = js.native
  def Close(SaveChanges: js.UndefOr[scala.Nothing], OriginalFormat: js.Any): Unit = js.native
  def Close(SaveChanges: js.UndefOr[scala.Nothing], OriginalFormat: js.Any, RouteDocument: js.Any): Unit = js.native
  def Close(SaveChanges: js.Any): Unit = js.native
  def Close(SaveChanges: js.Any, OriginalFormat: js.UndefOr[scala.Nothing], RouteDocument: js.Any): Unit = js.native
  def Close(SaveChanges: js.Any, OriginalFormat: js.Any): Unit = js.native
  def Close(SaveChanges: js.Any, OriginalFormat: js.Any, RouteDocument: js.Any): Unit = js.native
  
  def ClosePrintPreview(): Unit = js.native
  
  val CoAuthoring: typingsSlinky.activexWord.Word.CoAuthoring = js.native
  
  val CodeName: String = js.native
  
  def CommandBars(Index: String): CommandBar = js.native
  def CommandBars(Index: Double): CommandBar = js.native
  @JSName("CommandBars")
  val CommandBars_Original: CommandBars = js.native
  
  val Comments: typingsSlinky.activexWord.Word.Comments = js.native
  
  def Compare(
    Name: String,
    AuthorName: js.UndefOr[js.Any],
    CompareTarget: js.UndefOr[js.Any],
    DetectFormatChanges: js.UndefOr[js.Any],
    IgnoreAllComparisonWarnings: js.UndefOr[js.Any],
    AddToRecentFiles: js.UndefOr[js.Any],
    RemovePersonalInformation: js.UndefOr[js.Any],
    RemoveDateAndTime: js.UndefOr[js.Any]
  ): Unit = js.native
  
  def Compare2000(Name: String): Unit = js.native
  
  def Compare2002(Name: String): Unit = js.native
  def Compare2002(
    Name: String,
    AuthorName: js.UndefOr[scala.Nothing],
    CompareTarget: js.UndefOr[scala.Nothing],
    DetectFormatChanges: js.UndefOr[scala.Nothing],
    IgnoreAllComparisonWarnings: js.UndefOr[scala.Nothing],
    AddToRecentFiles: js.Any
  ): Unit = js.native
  def Compare2002(
    Name: String,
    AuthorName: js.UndefOr[scala.Nothing],
    CompareTarget: js.UndefOr[scala.Nothing],
    DetectFormatChanges: js.UndefOr[scala.Nothing],
    IgnoreAllComparisonWarnings: js.Any
  ): Unit = js.native
  def Compare2002(
    Name: String,
    AuthorName: js.UndefOr[scala.Nothing],
    CompareTarget: js.UndefOr[scala.Nothing],
    DetectFormatChanges: js.UndefOr[scala.Nothing],
    IgnoreAllComparisonWarnings: js.Any,
    AddToRecentFiles: js.Any
  ): Unit = js.native
  def Compare2002(
    Name: String,
    AuthorName: js.UndefOr[scala.Nothing],
    CompareTarget: js.UndefOr[scala.Nothing],
    DetectFormatChanges: js.Any
  ): Unit = js.native
  def Compare2002(
    Name: String,
    AuthorName: js.UndefOr[scala.Nothing],
    CompareTarget: js.UndefOr[scala.Nothing],
    DetectFormatChanges: js.Any,
    IgnoreAllComparisonWarnings: js.UndefOr[scala.Nothing],
    AddToRecentFiles: js.Any
  ): Unit = js.native
  def Compare2002(
    Name: String,
    AuthorName: js.UndefOr[scala.Nothing],
    CompareTarget: js.UndefOr[scala.Nothing],
    DetectFormatChanges: js.Any,
    IgnoreAllComparisonWarnings: js.Any
  ): Unit = js.native
  def Compare2002(
    Name: String,
    AuthorName: js.UndefOr[scala.Nothing],
    CompareTarget: js.UndefOr[scala.Nothing],
    DetectFormatChanges: js.Any,
    IgnoreAllComparisonWarnings: js.Any,
    AddToRecentFiles: js.Any
  ): Unit = js.native
  def Compare2002(Name: String, AuthorName: js.UndefOr[scala.Nothing], CompareTarget: js.Any): Unit = js.native
  def Compare2002(
    Name: String,
    AuthorName: js.UndefOr[scala.Nothing],
    CompareTarget: js.Any,
    DetectFormatChanges: js.UndefOr[scala.Nothing],
    IgnoreAllComparisonWarnings: js.UndefOr[scala.Nothing],
    AddToRecentFiles: js.Any
  ): Unit = js.native
  def Compare2002(
    Name: String,
    AuthorName: js.UndefOr[scala.Nothing],
    CompareTarget: js.Any,
    DetectFormatChanges: js.UndefOr[scala.Nothing],
    IgnoreAllComparisonWarnings: js.Any
  ): Unit = js.native
  def Compare2002(
    Name: String,
    AuthorName: js.UndefOr[scala.Nothing],
    CompareTarget: js.Any,
    DetectFormatChanges: js.UndefOr[scala.Nothing],
    IgnoreAllComparisonWarnings: js.Any,
    AddToRecentFiles: js.Any
  ): Unit = js.native
  def Compare2002(
    Name: String,
    AuthorName: js.UndefOr[scala.Nothing],
    CompareTarget: js.Any,
    DetectFormatChanges: js.Any
  ): Unit = js.native
  def Compare2002(
    Name: String,
    AuthorName: js.UndefOr[scala.Nothing],
    CompareTarget: js.Any,
    DetectFormatChanges: js.Any,
    IgnoreAllComparisonWarnings: js.UndefOr[scala.Nothing],
    AddToRecentFiles: js.Any
  ): Unit = js.native
  def Compare2002(
    Name: String,
    AuthorName: js.UndefOr[scala.Nothing],
    CompareTarget: js.Any,
    DetectFormatChanges: js.Any,
    IgnoreAllComparisonWarnings: js.Any
  ): Unit = js.native
  def Compare2002(
    Name: String,
    AuthorName: js.UndefOr[scala.Nothing],
    CompareTarget: js.Any,
    DetectFormatChanges: js.Any,
    IgnoreAllComparisonWarnings: js.Any,
    AddToRecentFiles: js.Any
  ): Unit = js.native
  def Compare2002(Name: String, AuthorName: js.Any): Unit = js.native
  def Compare2002(
    Name: String,
    AuthorName: js.Any,
    CompareTarget: js.UndefOr[scala.Nothing],
    DetectFormatChanges: js.UndefOr[scala.Nothing],
    IgnoreAllComparisonWarnings: js.UndefOr[scala.Nothing],
    AddToRecentFiles: js.Any
  ): Unit = js.native
  def Compare2002(
    Name: String,
    AuthorName: js.Any,
    CompareTarget: js.UndefOr[scala.Nothing],
    DetectFormatChanges: js.UndefOr[scala.Nothing],
    IgnoreAllComparisonWarnings: js.Any
  ): Unit = js.native
  def Compare2002(
    Name: String,
    AuthorName: js.Any,
    CompareTarget: js.UndefOr[scala.Nothing],
    DetectFormatChanges: js.UndefOr[scala.Nothing],
    IgnoreAllComparisonWarnings: js.Any,
    AddToRecentFiles: js.Any
  ): Unit = js.native
  def Compare2002(
    Name: String,
    AuthorName: js.Any,
    CompareTarget: js.UndefOr[scala.Nothing],
    DetectFormatChanges: js.Any
  ): Unit = js.native
  def Compare2002(
    Name: String,
    AuthorName: js.Any,
    CompareTarget: js.UndefOr[scala.Nothing],
    DetectFormatChanges: js.Any,
    IgnoreAllComparisonWarnings: js.UndefOr[scala.Nothing],
    AddToRecentFiles: js.Any
  ): Unit = js.native
  def Compare2002(
    Name: String,
    AuthorName: js.Any,
    CompareTarget: js.UndefOr[scala.Nothing],
    DetectFormatChanges: js.Any,
    IgnoreAllComparisonWarnings: js.Any
  ): Unit = js.native
  def Compare2002(
    Name: String,
    AuthorName: js.Any,
    CompareTarget: js.UndefOr[scala.Nothing],
    DetectFormatChanges: js.Any,
    IgnoreAllComparisonWarnings: js.Any,
    AddToRecentFiles: js.Any
  ): Unit = js.native
  def Compare2002(Name: String, AuthorName: js.Any, CompareTarget: js.Any): Unit = js.native
  def Compare2002(
    Name: String,
    AuthorName: js.Any,
    CompareTarget: js.Any,
    DetectFormatChanges: js.UndefOr[scala.Nothing],
    IgnoreAllComparisonWarnings: js.UndefOr[scala.Nothing],
    AddToRecentFiles: js.Any
  ): Unit = js.native
  def Compare2002(
    Name: String,
    AuthorName: js.Any,
    CompareTarget: js.Any,
    DetectFormatChanges: js.UndefOr[scala.Nothing],
    IgnoreAllComparisonWarnings: js.Any
  ): Unit = js.native
  def Compare2002(
    Name: String,
    AuthorName: js.Any,
    CompareTarget: js.Any,
    DetectFormatChanges: js.UndefOr[scala.Nothing],
    IgnoreAllComparisonWarnings: js.Any,
    AddToRecentFiles: js.Any
  ): Unit = js.native
  def Compare2002(Name: String, AuthorName: js.Any, CompareTarget: js.Any, DetectFormatChanges: js.Any): Unit = js.native
  def Compare2002(
    Name: String,
    AuthorName: js.Any,
    CompareTarget: js.Any,
    DetectFormatChanges: js.Any,
    IgnoreAllComparisonWarnings: js.UndefOr[scala.Nothing],
    AddToRecentFiles: js.Any
  ): Unit = js.native
  def Compare2002(
    Name: String,
    AuthorName: js.Any,
    CompareTarget: js.Any,
    DetectFormatChanges: js.Any,
    IgnoreAllComparisonWarnings: js.Any
  ): Unit = js.native
  def Compare2002(
    Name: String,
    AuthorName: js.Any,
    CompareTarget: js.Any,
    DetectFormatChanges: js.Any,
    IgnoreAllComparisonWarnings: js.Any,
    AddToRecentFiles: js.Any
  ): Unit = js.native
  
  def Compatibility(Type: WdCompatibility): Boolean = js.native
  
  val CompatibilityMode: Double = js.native
  
  def ComputeStatistics(Statistic: WdStatistic): Double = js.native
  def ComputeStatistics(Statistic: WdStatistic, IncludeFootnotesAndEndnotes: js.Any): Double = js.native
  
  var ConsecutiveHyphensLimit: Double = js.native
  
  val Container: js.Any = js.native
  
  val Content: Range = js.native
  
  val ContentControls: typingsSlinky.activexWord.Word.ContentControls = js.native
  
  def ContentTypeProperties(Index: String): MetaProperty = js.native
  def ContentTypeProperties(Index: Double): MetaProperty = js.native
  @JSName("ContentTypeProperties")
  val ContentTypeProperties_Original: MetaProperties = js.native
  
  def Convert(): Unit = js.native
  
  def ConvertAutoHyphens(): Unit = js.native
  
  def ConvertNumbersToText(): Unit = js.native
  def ConvertNumbersToText(NumberType: js.Any): Unit = js.native
  
  def ConvertVietDoc(CodePageOrigin: Double): Unit = js.native
  
  def CopyStylesFromTemplate(Template: String): Unit = js.native
  
  def CountNumberedItems(): Double = js.native
  def CountNumberedItems(NumberType: js.UndefOr[scala.Nothing], Level: js.Any): Double = js.native
  def CountNumberedItems(NumberType: js.Any): Double = js.native
  def CountNumberedItems(NumberType: js.Any, Level: js.Any): Double = js.native
  
  def CreateLetterContent(
    DateFormat: String,
    IncludeHeaderFooter: Boolean,
    PageDesign: String,
    LetterStyle: WdLetterStyle,
    Letterhead: Boolean,
    LetterheadLocation: WdLetterheadLocation,
    LetterheadSize: Double,
    RecipientName: String,
    RecipientAddress: String,
    Salutation: String,
    SalutationType: WdSalutationType,
    RecipientReference: String,
    MailingInstructions: String,
    AttentionLine: String,
    Subject: String,
    CCList: String,
    ReturnAddress: String,
    SenderName: String,
    Closing: String,
    SenderCompany: String,
    SenderJobTitle: String,
    SenderInitials: String,
    EnclosureNumber: Double,
    InfoBlock: js.UndefOr[js.Any],
    RecipientCode: js.UndefOr[js.Any],
    RecipientGender: js.UndefOr[js.Any],
    ReturnAddressShortForm: js.UndefOr[js.Any],
    SenderCity: js.UndefOr[js.Any],
    SenderCode: js.UndefOr[js.Any],
    SenderGender: js.UndefOr[js.Any],
    SenderReference: js.UndefOr[js.Any]
  ): LetterContent = js.native
  
  val Creator: Double = js.native
  
  val CurrentRsid: Double = js.native
  
  def CustomDocumentProperties(index: String): DocumentProperty[typingsSlinky.activexWord.Word.Application] = js.native
  def CustomDocumentProperties(index: Double): DocumentProperty[typingsSlinky.activexWord.Word.Application] = js.native
  @JSName("CustomDocumentProperties")
  val CustomDocumentProperties_Original: DocumentProperties[typingsSlinky.activexWord.Word.Application] = js.native
  
  def CustomXMLParts(Index: String): CustomXMLPart = js.native
  def CustomXMLParts(Index: Double): CustomXMLPart = js.native
  @JSName("CustomXMLParts")
  val CustomXMLParts_Original: CustomXMLParts = js.native
  
  def DataForm(): Unit = js.native
  
  var DefaultTabStop: Double = js.native
  
  val DefaultTableStyle: js.Any = js.native
  
  var DefaultTargetFrame: String = js.native
  
  def DeleteAllComments(): Unit = js.native
  
  def DeleteAllCommentsShown(): Unit = js.native
  
  def DeleteAllEditableRanges(): Unit = js.native
  def DeleteAllEditableRanges(EditorID: js.Any): Unit = js.native
  
  def DeleteAllInkAnnotations(): Unit = js.native
  
  def DetectLanguage(): Unit = js.native
  
  var DisableFeatures: Boolean = js.native
  
  var DisableFeaturesIntroducedAfter: WdDisableFeaturesIntroducedAfter = js.native
  
  var DoNotEmbedSystemFonts: Boolean = js.native
  
  val DocID: Double = js.native
  
  def DocumentInspectors(Index: Double): DocumentInspector = js.native
  @JSName("DocumentInspectors")
  val DocumentInspectors_Original: DocumentInspectors = js.native
  
  def DocumentLibraryVersions(lIndex: Double): DocumentLibraryVersion = js.native
  @JSName("DocumentLibraryVersions")
  val DocumentLibraryVersions_Original: DocumentLibraryVersions = js.native
  
  val DocumentTheme: OfficeTheme = js.native
  
  def DowngradeDocument(): Unit = js.native
  
  val Dummy1: js.UndefOr[scala.Nothing] = js.native
  
  def Dummy2(): Unit = js.native
  
  val Dummy3: js.UndefOr[scala.Nothing] = js.native
  
  def Dummy4(): Unit = js.native
  
  def EditionOptions(Type: WdEditionType, Option: WdEditionOption, Name: String): Unit = js.native
  def EditionOptions(Type: WdEditionType, Option: WdEditionOption, Name: String, Format: js.Any): Unit = js.native
  
  val Email: typingsSlinky.activexWord.Word.Email = js.native
  
  var EmbedLinguisticData: Boolean = js.native
  
  var EmbedSmartTags: Boolean = js.native
  
  var EmbedTrueTypeFonts: Boolean = js.native
  
  var EncryptionProvider: String = js.native
  
  def EndReview(): Unit = js.native
  
  val Endnotes: typingsSlinky.activexWord.Word.Endnotes = js.native
  
  var EnforceStyle: Boolean = js.native
  
  val Envelope: typingsSlinky.activexWord.Word.Envelope = js.native
  
  /**
    * @param boolean [OpenAfterExport=false]
    * @param Word.WdExportOptimizeFor [OptimizeFor=0]
    * @param Word.WdExportRange [Range=0]
    * @param number [From=1]
    * @param number [To=1]
    * @param Word.WdExportItem [Item=0]
    * @param boolean [IncludeDocProps=false]
    * @param boolean [KeepIRM=true]
    * @param Word.WdExportCreateBookmarks [CreateBookmarks=0]
    * @param boolean [DocStructureTags=true]
    * @param boolean [BitmapMissingFonts=true]
    * @param boolean [UseISO19005_1=false]
    */
  def ExportAsFixedFormat(
    OutputFileName: String,
    ExportFormat: WdExportFormat,
    OpenAfterExport: js.UndefOr[Boolean],
    OptimizeFor: js.UndefOr[WdExportOptimizeFor],
    Range: js.UndefOr[WdExportRange],
    From: js.UndefOr[Double],
    To: js.UndefOr[Double],
    Item: js.UndefOr[WdExportItem],
    IncludeDocProps: js.UndefOr[Boolean],
    KeepIRM: js.UndefOr[Boolean],
    CreateBookmarks: js.UndefOr[WdExportCreateBookmarks],
    DocStructureTags: js.UndefOr[Boolean],
    BitmapMissingFonts: js.UndefOr[Boolean],
    UseISO19005_1: js.UndefOr[Boolean],
    FixedFormatExtClassPtr: js.UndefOr[js.Any]
  ): Unit = js.native
  
  var FarEastLineBreakLanguage: WdFarEastLineBreakLanguageID = js.native
  
  var FarEastLineBreakLevel: WdFarEastLineBreakLevel = js.native
  
  val Fields: typingsSlinky.activexWord.Word.Fields = js.native
  
  var Final: Boolean = js.native
  
  def FitToPages(): Unit = js.native
  
  def FollowHyperlink(
    Address: js.UndefOr[js.Any],
    SubAddress: js.UndefOr[js.Any],
    NewWindow: js.UndefOr[js.Any],
    AddHistory: js.UndefOr[js.Any],
    ExtraInfo: js.UndefOr[js.Any],
    Method: js.UndefOr[js.Any],
    HeaderInfo: js.UndefOr[js.Any]
  ): Unit = js.native
  
  val Footnotes: typingsSlinky.activexWord.Word.Footnotes = js.native
  
  val FormFields: typingsSlinky.activexWord.Word.FormFields = js.native
  
  var FormattingShowClear: Boolean = js.native
  
  var FormattingShowFilter: WdShowFilter = js.native
  
  var FormattingShowFont: Boolean = js.native
  
  var FormattingShowNextLevel: Boolean = js.native
  
  var FormattingShowNumbering: Boolean = js.native
  
  var FormattingShowParagraph: Boolean = js.native
  
  var FormattingShowUserStyleName: Boolean = js.native
  
  val FormsDesign: Boolean = js.native
  
  def ForwardMailer(): Unit = js.native
  
  val Frames: typingsSlinky.activexWord.Word.Frames = js.native
  
  val Frameset: typingsSlinky.activexWord.Word.Frameset = js.native
  
  def FreezeLayout(): Unit = js.native
  
  val FullName: String = js.native
  
  def GetCrossReferenceItems(ReferenceType: js.Any): js.Any = js.native
  
  def GetLetterContent(): LetterContent = js.native
  
  def GetWorkflowTasks(): WorkflowTasks = js.native
  
  def GetWorkflowTemplates(): WorkflowTemplates = js.native
  
  def GoTo(): Range = js.native
  def GoTo(
    What: js.UndefOr[scala.Nothing],
    Which: js.UndefOr[scala.Nothing],
    Count: js.UndefOr[scala.Nothing],
    Name: js.Any
  ): Range = js.native
  def GoTo(What: js.UndefOr[scala.Nothing], Which: js.UndefOr[scala.Nothing], Count: js.Any): Range = js.native
  def GoTo(What: js.UndefOr[scala.Nothing], Which: js.UndefOr[scala.Nothing], Count: js.Any, Name: js.Any): Range = js.native
  def GoTo(What: js.UndefOr[scala.Nothing], Which: js.Any): Range = js.native
  def GoTo(What: js.UndefOr[scala.Nothing], Which: js.Any, Count: js.UndefOr[scala.Nothing], Name: js.Any): Range = js.native
  def GoTo(What: js.UndefOr[scala.Nothing], Which: js.Any, Count: js.Any): Range = js.native
  def GoTo(What: js.UndefOr[scala.Nothing], Which: js.Any, Count: js.Any, Name: js.Any): Range = js.native
  def GoTo(What: js.Any): Range = js.native
  def GoTo(What: js.Any, Which: js.UndefOr[scala.Nothing], Count: js.UndefOr[scala.Nothing], Name: js.Any): Range = js.native
  def GoTo(What: js.Any, Which: js.UndefOr[scala.Nothing], Count: js.Any): Range = js.native
  def GoTo(What: js.Any, Which: js.UndefOr[scala.Nothing], Count: js.Any, Name: js.Any): Range = js.native
  def GoTo(What: js.Any, Which: js.Any): Range = js.native
  def GoTo(What: js.Any, Which: js.Any, Count: js.UndefOr[scala.Nothing], Name: js.Any): Range = js.native
  def GoTo(What: js.Any, Which: js.Any, Count: js.Any): Range = js.native
  def GoTo(What: js.Any, Which: js.Any, Count: js.Any, Name: js.Any): Range = js.native
  
  var GrammarChecked: Boolean = js.native
  
  val GrammaticalErrors: ProofreadingErrors = js.native
  
  var GridDistanceHorizontal: Double = js.native
  
  var GridDistanceVertical: Double = js.native
  
  var GridOriginFromMargin: Boolean = js.native
  
  var GridOriginHorizontal: Double = js.native
  
  var GridOriginVertical: Double = js.native
  
  var GridSpaceBetweenHorizontalLines: Double = js.native
  
  var GridSpaceBetweenVerticalLines: Double = js.native
  
  val HTMLDivisions: typingsSlinky.activexWord.Word.HTMLDivisions = js.native
  
  val HTMLProject: typingsSlinky.activexOffice.Office.HTMLProject = js.native
  
  var HasMailer: Boolean = js.native
  
  val HasPassword: Boolean = js.native
  
  var HasRoutingSlip: Boolean = js.native
  
  val HasVBProject: Boolean = js.native
  
  val Hyperlinks: typingsSlinky.activexWord.Word.Hyperlinks = js.native
  
  var HyphenateCaps: Boolean = js.native
  
  var HyphenationZone: Double = js.native
  
  val Indexes: typingsSlinky.activexWord.Word.Indexes = js.native
  
  val InlineShapes: typingsSlinky.activexWord.Word.InlineShapes = js.native
  
  val IsMasterDocument: Boolean = js.native
  
  val IsSubdocument: Boolean = js.native
  
  var JustificationMode: WdJustificationMode = js.native
  
  var KerningByAlgorithm: Boolean = js.native
  
  var Kind: WdDocumentKind = js.native
  
  var LanguageDetected: Boolean = js.native
  
  val ListParagraphs: typingsSlinky.activexWord.Word.ListParagraphs = js.native
  
  val ListTemplates: typingsSlinky.activexWord.Word.ListTemplates = js.native
  
  val Lists: typingsSlinky.activexWord.Word.Lists = js.native
  
  var LockQuickStyleSet: Boolean = js.native
  
  def LockServerFile(): Unit = js.native
  
  var LockTheme: Boolean = js.native
  
  val MailEnvelope: MsoEnvelope = js.native
  
  val MailMerge: typingsSlinky.activexWord.Word.MailMerge = js.native
  
  val Mailer: typingsSlinky.activexWord.Word.Mailer = js.native
  
  def MakeCompatibilityDefault(): Unit = js.native
  
  def ManualHyphenation(): Unit = js.native
  
  def Merge(FileName: String): Unit = js.native
  def Merge(
    FileName: String,
    MergeTarget: js.UndefOr[scala.Nothing],
    DetectFormatChanges: js.UndefOr[scala.Nothing],
    UseFormattingFrom: js.UndefOr[scala.Nothing],
    AddToRecentFiles: js.Any
  ): Unit = js.native
  def Merge(
    FileName: String,
    MergeTarget: js.UndefOr[scala.Nothing],
    DetectFormatChanges: js.UndefOr[scala.Nothing],
    UseFormattingFrom: js.Any
  ): Unit = js.native
  def Merge(
    FileName: String,
    MergeTarget: js.UndefOr[scala.Nothing],
    DetectFormatChanges: js.UndefOr[scala.Nothing],
    UseFormattingFrom: js.Any,
    AddToRecentFiles: js.Any
  ): Unit = js.native
  def Merge(FileName: String, MergeTarget: js.UndefOr[scala.Nothing], DetectFormatChanges: js.Any): Unit = js.native
  def Merge(
    FileName: String,
    MergeTarget: js.UndefOr[scala.Nothing],
    DetectFormatChanges: js.Any,
    UseFormattingFrom: js.UndefOr[scala.Nothing],
    AddToRecentFiles: js.Any
  ): Unit = js.native
  def Merge(
    FileName: String,
    MergeTarget: js.UndefOr[scala.Nothing],
    DetectFormatChanges: js.Any,
    UseFormattingFrom: js.Any
  ): Unit = js.native
  def Merge(
    FileName: String,
    MergeTarget: js.UndefOr[scala.Nothing],
    DetectFormatChanges: js.Any,
    UseFormattingFrom: js.Any,
    AddToRecentFiles: js.Any
  ): Unit = js.native
  def Merge(FileName: String, MergeTarget: js.Any): Unit = js.native
  def Merge(
    FileName: String,
    MergeTarget: js.Any,
    DetectFormatChanges: js.UndefOr[scala.Nothing],
    UseFormattingFrom: js.UndefOr[scala.Nothing],
    AddToRecentFiles: js.Any
  ): Unit = js.native
  def Merge(
    FileName: String,
    MergeTarget: js.Any,
    DetectFormatChanges: js.UndefOr[scala.Nothing],
    UseFormattingFrom: js.Any
  ): Unit = js.native
  def Merge(
    FileName: String,
    MergeTarget: js.Any,
    DetectFormatChanges: js.UndefOr[scala.Nothing],
    UseFormattingFrom: js.Any,
    AddToRecentFiles: js.Any
  ): Unit = js.native
  def Merge(FileName: String, MergeTarget: js.Any, DetectFormatChanges: js.Any): Unit = js.native
  def Merge(
    FileName: String,
    MergeTarget: js.Any,
    DetectFormatChanges: js.Any,
    UseFormattingFrom: js.UndefOr[scala.Nothing],
    AddToRecentFiles: js.Any
  ): Unit = js.native
  def Merge(FileName: String, MergeTarget: js.Any, DetectFormatChanges: js.Any, UseFormattingFrom: js.Any): Unit = js.native
  def Merge(
    FileName: String,
    MergeTarget: js.Any,
    DetectFormatChanges: js.Any,
    UseFormattingFrom: js.Any,
    AddToRecentFiles: js.Any
  ): Unit = js.native
  
  def Merge2000(FileName: String): Unit = js.native
  
  val Name: String = js.native
  
  var NoLineBreakAfter: String = js.native
  
  var NoLineBreakBefore: String = js.native
  
  var OMathBreakBin: WdOMathBreakBin = js.native
  
  var OMathBreakSub: WdOMathBreakSub = js.native
  
  var OMathFontName: String = js.native
  
  var OMathIntSubSupLim: Boolean = js.native
  
  var OMathJc: WdOMathJc = js.native
  
  var OMathLeftMargin: Double = js.native
  
  var OMathNarySupSubLim: Boolean = js.native
  
  var OMathRightMargin: Double = js.native
  
  var OMathSmallFrac: Boolean = js.native
  
  var OMathWrap: Double = js.native
  
  val OMaths: typingsSlinky.activexWord.Word.OMaths = js.native
  
  val OpenEncoding: MsoEncoding = js.native
  
  var OptimizeForWord97: Boolean = js.native
  
  val OriginalDocumentTitle: String = js.native
  
  var PageSetup: typingsSlinky.activexWord.Word.PageSetup = js.native
  
  val Paragraphs: typingsSlinky.activexWord.Word.Paragraphs = js.native
  
  val Parent: js.Any = js.native
  
  val Password: String = js.native
  
  val PasswordEncryptionAlgorithm: String = js.native
  
  val PasswordEncryptionFileProperties: Boolean = js.native
  
  val PasswordEncryptionKeyLength: Double = js.native
  
  val PasswordEncryptionProvider: String = js.native
  
  val Path: String = js.native
  
  def Permission(Index: js.Any): UserPermission = js.native
  @JSName("Permission")
  val Permission_Original: Permission = js.native
  
  def Post(): Unit = js.native
  
  def PresentIt(): Unit = js.native
  
  var PrintFormsData: Boolean = js.native
  
  var PrintFractionalWidths: Boolean = js.native
  
  def PrintOut(
    Background: js.UndefOr[js.Any],
    Append: js.UndefOr[js.Any],
    Range: js.UndefOr[js.Any],
    OutputFileName: js.UndefOr[js.Any],
    From: js.UndefOr[js.Any],
    To: js.UndefOr[js.Any],
    Item: js.UndefOr[js.Any],
    Copies: js.UndefOr[js.Any],
    Pages: js.UndefOr[js.Any],
    PageType: js.UndefOr[js.Any],
    PrintToFile: js.UndefOr[js.Any],
    Collate: js.UndefOr[js.Any],
    ActivePrinterMacGX: js.UndefOr[js.Any],
    ManualDuplexPrint: js.UndefOr[js.Any],
    PrintZoomColumn: js.UndefOr[js.Any],
    PrintZoomRow: js.UndefOr[js.Any],
    PrintZoomPaperWidth: js.UndefOr[js.Any],
    PrintZoomPaperHeight: js.UndefOr[js.Any]
  ): Unit = js.native
  
  def PrintOut2000(
    Background: js.UndefOr[js.Any],
    Append: js.UndefOr[js.Any],
    Range: js.UndefOr[js.Any],
    OutputFileName: js.UndefOr[js.Any],
    From: js.UndefOr[js.Any],
    To: js.UndefOr[js.Any],
    Item: js.UndefOr[js.Any],
    Copies: js.UndefOr[js.Any],
    Pages: js.UndefOr[js.Any],
    PageType: js.UndefOr[js.Any],
    PrintToFile: js.UndefOr[js.Any],
    Collate: js.UndefOr[js.Any],
    ActivePrinterMacGX: js.UndefOr[js.Any],
    ManualDuplexPrint: js.UndefOr[js.Any],
    PrintZoomColumn: js.UndefOr[js.Any],
    PrintZoomRow: js.UndefOr[js.Any],
    PrintZoomPaperWidth: js.UndefOr[js.Any],
    PrintZoomPaperHeight: js.UndefOr[js.Any]
  ): Unit = js.native
  
  def PrintOutOld(
    Background: js.UndefOr[js.Any],
    Append: js.UndefOr[js.Any],
    Range: js.UndefOr[js.Any],
    OutputFileName: js.UndefOr[js.Any],
    From: js.UndefOr[js.Any],
    To: js.UndefOr[js.Any],
    Item: js.UndefOr[js.Any],
    Copies: js.UndefOr[js.Any],
    Pages: js.UndefOr[js.Any],
    PageType: js.UndefOr[js.Any],
    PrintToFile: js.UndefOr[js.Any],
    Collate: js.UndefOr[js.Any],
    ActivePrinterMacGX: js.UndefOr[js.Any],
    ManualDuplexPrint: js.UndefOr[js.Any]
  ): Unit = js.native
  
  var PrintPostScriptOverText: Boolean = js.native
  
  def PrintPreview(): Unit = js.native
  
  var PrintRevisions: Boolean = js.native
  
  def Protect(Type: WdProtectionType): Unit = js.native
  def Protect(
    Type: WdProtectionType,
    NoReset: js.UndefOr[scala.Nothing],
    Password: js.UndefOr[scala.Nothing],
    UseIRM: js.UndefOr[scala.Nothing],
    EnforceStyleLock: js.Any
  ): Unit = js.native
  def Protect(
    Type: WdProtectionType,
    NoReset: js.UndefOr[scala.Nothing],
    Password: js.UndefOr[scala.Nothing],
    UseIRM: js.Any
  ): Unit = js.native
  def Protect(
    Type: WdProtectionType,
    NoReset: js.UndefOr[scala.Nothing],
    Password: js.UndefOr[scala.Nothing],
    UseIRM: js.Any,
    EnforceStyleLock: js.Any
  ): Unit = js.native
  def Protect(Type: WdProtectionType, NoReset: js.UndefOr[scala.Nothing], Password: js.Any): Unit = js.native
  def Protect(
    Type: WdProtectionType,
    NoReset: js.UndefOr[scala.Nothing],
    Password: js.Any,
    UseIRM: js.UndefOr[scala.Nothing],
    EnforceStyleLock: js.Any
  ): Unit = js.native
  def Protect(Type: WdProtectionType, NoReset: js.UndefOr[scala.Nothing], Password: js.Any, UseIRM: js.Any): Unit = js.native
  def Protect(
    Type: WdProtectionType,
    NoReset: js.UndefOr[scala.Nothing],
    Password: js.Any,
    UseIRM: js.Any,
    EnforceStyleLock: js.Any
  ): Unit = js.native
  def Protect(Type: WdProtectionType, NoReset: js.Any): Unit = js.native
  def Protect(
    Type: WdProtectionType,
    NoReset: js.Any,
    Password: js.UndefOr[scala.Nothing],
    UseIRM: js.UndefOr[scala.Nothing],
    EnforceStyleLock: js.Any
  ): Unit = js.native
  def Protect(Type: WdProtectionType, NoReset: js.Any, Password: js.UndefOr[scala.Nothing], UseIRM: js.Any): Unit = js.native
  def Protect(
    Type: WdProtectionType,
    NoReset: js.Any,
    Password: js.UndefOr[scala.Nothing],
    UseIRM: js.Any,
    EnforceStyleLock: js.Any
  ): Unit = js.native
  def Protect(Type: WdProtectionType, NoReset: js.Any, Password: js.Any): Unit = js.native
  def Protect(
    Type: WdProtectionType,
    NoReset: js.Any,
    Password: js.Any,
    UseIRM: js.UndefOr[scala.Nothing],
    EnforceStyleLock: js.Any
  ): Unit = js.native
  def Protect(Type: WdProtectionType, NoReset: js.Any, Password: js.Any, UseIRM: js.Any): Unit = js.native
  def Protect(
    Type: WdProtectionType,
    NoReset: js.Any,
    Password: js.Any,
    UseIRM: js.Any,
    EnforceStyleLock: js.Any
  ): Unit = js.native
  
  def Protect2002(Type: WdProtectionType): Unit = js.native
  def Protect2002(Type: WdProtectionType, NoReset: js.UndefOr[scala.Nothing], Password: js.Any): Unit = js.native
  def Protect2002(Type: WdProtectionType, NoReset: js.Any): Unit = js.native
  def Protect2002(Type: WdProtectionType, NoReset: js.Any, Password: js.Any): Unit = js.native
  
  val ProtectionType: WdProtectionType = js.native
  
  def Range(): typingsSlinky.activexWord.Word.Range = js.native
  def Range(Start: js.UndefOr[scala.Nothing], End: Double): typingsSlinky.activexWord.Word.Range = js.native
  def Range(Start: Double): typingsSlinky.activexWord.Word.Range = js.native
  def Range(Start: Double, End: Double): typingsSlinky.activexWord.Word.Range = js.native
  
  val ReadOnly: Boolean = js.native
  
  var ReadOnlyRecommended: Boolean = js.native
  
  val ReadabilityStatistics: typingsSlinky.activexWord.Word.ReadabilityStatistics = js.native
  
  var ReadingLayoutSizeX: Double = js.native
  
  var ReadingLayoutSizeY: Double = js.native
  
  var ReadingModeLayoutFrozen: Boolean = js.native
  
  def RecheckSmartTags(): Unit = js.native
  
  def Redo(): Boolean = js.native
  def Redo(Times: js.Any): Boolean = js.native
  
  def RejectAllRevisions(): Unit = js.native
  
  def RejectAllRevisionsShown(): Unit = js.native
  
  def Reload(): Unit = js.native
  
  def ReloadAs(Encoding: MsoEncoding): Unit = js.native
  
  var RemoveDateAndTime: Boolean = js.native
  
  def RemoveDocumentInformation(RemoveDocInfoType: WdRemoveDocInfoType): Unit = js.native
  
  def RemoveDocumentWorkspaceHeader(ID: String): Unit = js.native
  
  def RemoveLockedStyles(): Unit = js.native
  
  def RemoveNumbers(): Unit = js.native
  def RemoveNumbers(NumberType: js.Any): Unit = js.native
  
  var RemovePersonalInformation: Boolean = js.native
  
  def RemoveSmartTags(): Unit = js.native
  
  def RemoveTheme(): Unit = js.native
  
  def Repaginate(): Unit = js.native
  
  def Reply(): Unit = js.native
  
  def ReplyAll(): Unit = js.native
  
  def ReplyWithChanges(): Unit = js.native
  def ReplyWithChanges(ShowMessage: js.Any): Unit = js.native
  
  val Research: typingsSlinky.activexWord.Word.Research = js.native
  
  def ResetFormFields(): Unit = js.native
  
  val RevisedDocumentTitle: String = js.native
  
  val Revisions: typingsSlinky.activexWord.Word.Revisions = js.native
  
  def Route(): Unit = js.native
  
  val Routed: Boolean = js.native
  
  val RoutingSlip: typingsSlinky.activexWord.Word.RoutingSlip = js.native
  
  def RunAutoMacro(Which: WdAutoMacros): Unit = js.native
  
  def RunLetterWizard(): Unit = js.native
  def RunLetterWizard(LetterContent: js.UndefOr[scala.Nothing], WizardMode: js.Any): Unit = js.native
  def RunLetterWizard(LetterContent: js.Any): Unit = js.native
  def RunLetterWizard(LetterContent: js.Any, WizardMode: js.Any): Unit = js.native
  
  def Save(): Unit = js.native
  
  def SaveAs(
    FileName: js.UndefOr[js.Any],
    FileFormat: js.UndefOr[js.Any],
    LockComments: js.UndefOr[js.Any],
    Password: js.UndefOr[js.Any],
    AddToRecentFiles: js.UndefOr[js.Any],
    WritePassword: js.UndefOr[js.Any],
    ReadOnlyRecommended: js.UndefOr[js.Any],
    EmbedTrueTypeFonts: js.UndefOr[js.Any],
    SaveNativePictureFormat: js.UndefOr[js.Any],
    SaveFormsData: js.UndefOr[js.Any],
    SaveAsAOCELetter: js.UndefOr[js.Any],
    Encoding: js.UndefOr[js.Any],
    InsertLineBreaks: js.UndefOr[js.Any],
    AllowSubstitutions: js.UndefOr[js.Any],
    LineEnding: js.UndefOr[js.Any],
    AddBiDiMarks: js.UndefOr[js.Any]
  ): Unit = js.native
  
  def SaveAs2(
    FileName: js.UndefOr[js.Any],
    FileFormat: js.UndefOr[js.Any],
    LockComments: js.UndefOr[js.Any],
    Password: js.UndefOr[js.Any],
    AddToRecentFiles: js.UndefOr[js.Any],
    WritePassword: js.UndefOr[js.Any],
    ReadOnlyRecommended: js.UndefOr[js.Any],
    EmbedTrueTypeFonts: js.UndefOr[js.Any],
    SaveNativePictureFormat: js.UndefOr[js.Any],
    SaveFormsData: js.UndefOr[js.Any],
    SaveAsAOCELetter: js.UndefOr[js.Any],
    Encoding: js.UndefOr[js.Any],
    InsertLineBreaks: js.UndefOr[js.Any],
    AllowSubstitutions: js.UndefOr[js.Any],
    LineEnding: js.UndefOr[js.Any],
    AddBiDiMarks: js.UndefOr[js.Any],
    CompatibilityMode: js.UndefOr[js.Any]
  ): Unit = js.native
  
  def SaveAs2000(
    FileName: js.UndefOr[js.Any],
    FileFormat: js.UndefOr[js.Any],
    LockComments: js.UndefOr[js.Any],
    Password: js.UndefOr[js.Any],
    AddToRecentFiles: js.UndefOr[js.Any],
    WritePassword: js.UndefOr[js.Any],
    ReadOnlyRecommended: js.UndefOr[js.Any],
    EmbedTrueTypeFonts: js.UndefOr[js.Any],
    SaveNativePictureFormat: js.UndefOr[js.Any],
    SaveFormsData: js.UndefOr[js.Any],
    SaveAsAOCELetter: js.UndefOr[js.Any]
  ): Unit = js.native
  
  def SaveAsQuickStyleSet(FileName: String): Unit = js.native
  
  var SaveEncoding: MsoEncoding = js.native
  
  val SaveFormat: Double = js.native
  
  var SaveFormsData: Boolean = js.native
  
  var SaveSubsetFonts: Boolean = js.native
  
  var Saved: Boolean = js.native
  
  def Scripts(Index: js.Any): Script = js.native
  @JSName("Scripts")
  val Scripts_Original: Scripts = js.native
  
  val Sections: typingsSlinky.activexWord.Word.Sections = js.native
  
  def Select(): Unit = js.native
  
  def SelectAllEditableRanges(): Unit = js.native
  def SelectAllEditableRanges(EditorID: js.Any): Unit = js.native
  
  def SelectContentControlsByTag(Tag: String): typingsSlinky.activexWord.Word.ContentControls = js.native
  
  def SelectContentControlsByTitle(Title: String): typingsSlinky.activexWord.Word.ContentControls = js.native
  
  def SelectLinkedControls(Node: CustomXMLNode): typingsSlinky.activexWord.Word.ContentControls = js.native
  
  /**
    * @param string [PrefixMapping='']
    * @param boolean [FastSearchSkippingTextNodes=true]
    */
  def SelectNodes(XPath: String): typingsSlinky.activexWord.Word.XMLNodes = js.native
  def SelectNodes(XPath: String, PrefixMapping: js.UndefOr[scala.Nothing], FastSearchSkippingTextNodes: Boolean): typingsSlinky.activexWord.Word.XMLNodes = js.native
  def SelectNodes(XPath: String, PrefixMapping: String): typingsSlinky.activexWord.Word.XMLNodes = js.native
  def SelectNodes(XPath: String, PrefixMapping: String, FastSearchSkippingTextNodes: Boolean): typingsSlinky.activexWord.Word.XMLNodes = js.native
  
  /**
    * @param string [PrefixMapping='']
    * @param boolean [FastSearchSkippingTextNodes=true]
    */
  def SelectSingleNode(XPath: String): XMLNode = js.native
  def SelectSingleNode(XPath: String, PrefixMapping: js.UndefOr[scala.Nothing], FastSearchSkippingTextNodes: Boolean): XMLNode = js.native
  def SelectSingleNode(XPath: String, PrefixMapping: String): XMLNode = js.native
  def SelectSingleNode(XPath: String, PrefixMapping: String, FastSearchSkippingTextNodes: Boolean): XMLNode = js.native
  
  /** @param Office.CustomXMLPart [Stream=0] */
  def SelectUnlinkedControls(): typingsSlinky.activexWord.Word.ContentControls = js.native
  def SelectUnlinkedControls(Stream: CustomXMLPart): typingsSlinky.activexWord.Word.ContentControls = js.native
  
  def SendFax(Address: String): Unit = js.native
  def SendFax(Address: String, Subject: js.Any): Unit = js.native
  
  def SendFaxOverInternet(): Unit = js.native
  def SendFaxOverInternet(Recipients: js.UndefOr[scala.Nothing], Subject: js.UndefOr[scala.Nothing], ShowMessage: js.Any): Unit = js.native
  def SendFaxOverInternet(Recipients: js.UndefOr[scala.Nothing], Subject: js.Any): Unit = js.native
  def SendFaxOverInternet(Recipients: js.UndefOr[scala.Nothing], Subject: js.Any, ShowMessage: js.Any): Unit = js.native
  def SendFaxOverInternet(Recipients: js.Any): Unit = js.native
  def SendFaxOverInternet(Recipients: js.Any, Subject: js.UndefOr[scala.Nothing], ShowMessage: js.Any): Unit = js.native
  def SendFaxOverInternet(Recipients: js.Any, Subject: js.Any): Unit = js.native
  def SendFaxOverInternet(Recipients: js.Any, Subject: js.Any, ShowMessage: js.Any): Unit = js.native
  
  def SendForReview(): Unit = js.native
  def SendForReview(
    Recipients: js.UndefOr[scala.Nothing],
    Subject: js.UndefOr[scala.Nothing],
    ShowMessage: js.UndefOr[scala.Nothing],
    IncludeAttachment: js.Any
  ): Unit = js.native
  def SendForReview(Recipients: js.UndefOr[scala.Nothing], Subject: js.UndefOr[scala.Nothing], ShowMessage: js.Any): Unit = js.native
  def SendForReview(
    Recipients: js.UndefOr[scala.Nothing],
    Subject: js.UndefOr[scala.Nothing],
    ShowMessage: js.Any,
    IncludeAttachment: js.Any
  ): Unit = js.native
  def SendForReview(Recipients: js.UndefOr[scala.Nothing], Subject: js.Any): Unit = js.native
  def SendForReview(
    Recipients: js.UndefOr[scala.Nothing],
    Subject: js.Any,
    ShowMessage: js.UndefOr[scala.Nothing],
    IncludeAttachment: js.Any
  ): Unit = js.native
  def SendForReview(Recipients: js.UndefOr[scala.Nothing], Subject: js.Any, ShowMessage: js.Any): Unit = js.native
  def SendForReview(
    Recipients: js.UndefOr[scala.Nothing],
    Subject: js.Any,
    ShowMessage: js.Any,
    IncludeAttachment: js.Any
  ): Unit = js.native
  def SendForReview(Recipients: js.Any): Unit = js.native
  def SendForReview(
    Recipients: js.Any,
    Subject: js.UndefOr[scala.Nothing],
    ShowMessage: js.UndefOr[scala.Nothing],
    IncludeAttachment: js.Any
  ): Unit = js.native
  def SendForReview(Recipients: js.Any, Subject: js.UndefOr[scala.Nothing], ShowMessage: js.Any): Unit = js.native
  def SendForReview(
    Recipients: js.Any,
    Subject: js.UndefOr[scala.Nothing],
    ShowMessage: js.Any,
    IncludeAttachment: js.Any
  ): Unit = js.native
  def SendForReview(Recipients: js.Any, Subject: js.Any): Unit = js.native
  def SendForReview(
    Recipients: js.Any,
    Subject: js.Any,
    ShowMessage: js.UndefOr[scala.Nothing],
    IncludeAttachment: js.Any
  ): Unit = js.native
  def SendForReview(Recipients: js.Any, Subject: js.Any, ShowMessage: js.Any): Unit = js.native
  def SendForReview(Recipients: js.Any, Subject: js.Any, ShowMessage: js.Any, IncludeAttachment: js.Any): Unit = js.native
  
  def SendMail(): Unit = js.native
  
  def SendMailer(): Unit = js.native
  def SendMailer(FileFormat: js.UndefOr[scala.Nothing], Priority: js.Any): Unit = js.native
  def SendMailer(FileFormat: js.Any): Unit = js.native
  def SendMailer(FileFormat: js.Any, Priority: js.Any): Unit = js.native
  
  val Sentences: typingsSlinky.activexWord.Word.Sentences = js.native
  
  def ServerPolicy(Index: String): PolicyItem = js.native
  def ServerPolicy(Index: Double): PolicyItem = js.native
  @JSName("ServerPolicy")
  val ServerPolicy_Original: ServerPolicy = js.native
  
  def SetCompatibilityMode(Mode: Double): Unit = js.native
  
  def SetDefaultTableStyle(Style: js.Any, SetInTemplate: Boolean): Unit = js.native
  
  def SetLetterContent(LetterContent: js.Any): Unit = js.native
  
  def SetPasswordEncryptionOptions(
    PasswordEncryptionProvider: String,
    PasswordEncryptionAlgorithm: String,
    PasswordEncryptionKeyLength: Double
  ): Unit = js.native
  def SetPasswordEncryptionOptions(
    PasswordEncryptionProvider: String,
    PasswordEncryptionAlgorithm: String,
    PasswordEncryptionKeyLength: Double,
    PasswordEncryptionFileProperties: js.Any
  ): Unit = js.native
  
  val Shapes: typingsSlinky.activexWord.Word.Shapes = js.native
  
  val SharedWorkspace: typingsSlinky.activexOffice.Office.SharedWorkspace = js.native
  
  var ShowGrammaticalErrors: Boolean = js.native
  
  var ShowRevisions: Boolean = js.native
  
  var ShowSpellingErrors: Boolean = js.native
  
  var ShowSummary: Boolean = js.native
  
  def Signatures(iSig: Double): Signature = js.native
  @JSName("Signatures")
  val Signatures_Original: SignatureSet = js.native
  
  val SmartDocument: typingsSlinky.activexOffice.Office.SmartDocument = js.native
  
  val SmartTags: typingsSlinky.activexWord.Word.SmartTags = js.native
  
  var SmartTagsAsXMLProps: Boolean = js.native
  
  var SnapToGrid: Boolean = js.native
  
  var SnapToShapes: Boolean = js.native
  
  var SpellingChecked: Boolean = js.native
  
  val SpellingErrors: ProofreadingErrors = js.native
  
  val StoryRanges: typingsSlinky.activexWord.Word.StoryRanges = js.native
  
  val StyleSheets: typingsSlinky.activexWord.Word.StyleSheets = js.native
  
  var StyleSortMethod: WdStyleSort = js.native
  
  val Styles: typingsSlinky.activexWord.Word.Styles = js.native
  
  val Subdocuments: typingsSlinky.activexWord.Word.Subdocuments = js.native
  
  var SummaryLength: Double = js.native
  
  var SummaryViewMode: WdSummaryMode = js.native
  
  val Sync: typingsSlinky.activexOffice.Office.Sync = js.native
  
  val Tables: typingsSlinky.activexWord.Word.Tables = js.native
  
  val TablesOfAuthorities: typingsSlinky.activexWord.Word.TablesOfAuthorities = js.native
  
  val TablesOfAuthoritiesCategories: typingsSlinky.activexWord.Word.TablesOfAuthoritiesCategories = js.native
  
  val TablesOfContents: typingsSlinky.activexWord.Word.TablesOfContents = js.native
  
  val TablesOfFigures: typingsSlinky.activexWord.Word.TablesOfFigures = js.native
  
  var TextEncoding: MsoEncoding = js.native
  
  var TextLineEnding: WdLineEndingType = js.native
  
  def ToggleFormsDesign(): Unit = js.native
  
  var TrackFormatting: Boolean = js.native
  
  var TrackMoves: Boolean = js.native
  
  var TrackRevisions: Boolean = js.native
  
  /** @param boolean [DataOnly=true] */
  def TransformDocument(Path: String): Unit = js.native
  def TransformDocument(Path: String, DataOnly: Boolean): Unit = js.native
  
  val Type: WdDocumentType = js.native
  
  def Undo(): Boolean = js.native
  def Undo(Times: js.Any): Boolean = js.native
  
  def UndoClear(): Unit = js.native
  
  def UnfreezeLayout(): Unit = js.native
  
  def Unprotect(): Unit = js.native
  def Unprotect(Password: js.Any): Unit = js.native
  
  def UpdateStyles(): Unit = js.native
  
  var UpdateStylesOnOpen: Boolean = js.native
  
  def UpdateSummaryProperties(): Unit = js.native
  
  var UseMathDefaults: Boolean = js.native
  
  var UserControl: Boolean = js.native
  
  val VBASigned: Boolean = js.native
  
  val VBProject: typingsSlinky.activexVbide.VBIDE.VBProject = js.native
  
  val Variables: typingsSlinky.activexWord.Word.Variables = js.native
  
  val Versions: typingsSlinky.activexWord.Word.Versions = js.native
  
  def ViewCode(): Unit = js.native
  
  def ViewPropertyBrowser(): Unit = js.native
  
  val WebOptions: typingsSlinky.activexWord.Word.WebOptions = js.native
  
  def WebPagePreview(): Unit = js.native
  
  val Windows: typingsSlinky.activexWord.Word.Windows = js.native
  
  @JSName("Word.Document_typekey")
  var WordDotDocument_typekey: Document = js.native
  
  val WordOpenXML: String = js.native
  
  val Words: typingsSlinky.activexWord.Word.Words = js.native
  
  val WritePassword: String = js.native
  
  val WriteReserved: Boolean = js.native
  
  var XMLHideNamespaces: Boolean = js.native
  
  val XMLNodes: typingsSlinky.activexWord.Word.XMLNodes = js.native
  
  var XMLSaveDataOnly: Boolean = js.native
  
  var XMLSaveThroughXSLT: String = js.native
  
  val XMLSchemaReferences: typingsSlinky.activexWord.Word.XMLSchemaReferences = js.native
  
  val XMLSchemaViolations: typingsSlinky.activexWord.Word.XMLNodes = js.native
  
  var XMLShowAdvancedErrors: Boolean = js.native
  
  var XMLUseXSLTWhenSaving: Boolean = js.native
  
  var _CodeName: String = js.native
  
  def sblt(s: String): Unit = js.native
}
