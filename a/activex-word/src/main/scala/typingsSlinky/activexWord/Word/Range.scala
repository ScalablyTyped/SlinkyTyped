package typingsSlinky.activexWord.Word

import typingsSlinky.activexOffice.Office.Script
import typingsSlinky.activexOffice.Office.Scripts
import typingsSlinky.activexWord.activexWordNumbers.`9999998`
import typingsSlinky.activexWord.activexWordNumbers.`9999999`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Range extends js.Object {
  
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  
  def AutoFormat(): Unit = js.native
  
  var Bold: Boolean | `9999999` | `9999998` = js.native
  
  var BoldBi: Boolean | `9999999` | `9999998` = js.native
  
  val BookmarkID: Double = js.native
  
  val Bookmarks: typingsSlinky.activexWord.Word.Bookmarks = js.native
  
  var Borders: typingsSlinky.activexWord.Word.Borders = js.native
  
  def Calculate(): Double = js.native
  
  val CanEdit: Double = js.native
  
  val CanPaste: Double = js.native
  
  var Case: WdCharacterCase = js.native
  
  val Cells: typingsSlinky.activexWord.Word.Cells = js.native
  
  val CharacterStyle: js.Any = js.native
  
  var CharacterWidth: WdCharacterWidth = js.native
  
  val Characters: typingsSlinky.activexWord.Word.Characters = js.native
  
  def CheckGrammar(): Unit = js.native
  
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
  
  def CheckSynonyms(): Unit = js.native
  
  /** @param WdCollapseDirection [Direction=wdCollapseStart] */
  def Collapse(): Unit = js.native
  def Collapse(Direction: WdCollapseDirection): Unit = js.native
  
  val Columns: typingsSlinky.activexWord.Word.Columns = js.native
  
  var CombineCharacters: Boolean = js.native
  
  val Comments: typingsSlinky.activexWord.Word.Comments = js.native
  
  def ComputeStatistics(Statistic: WdStatistic): Double = js.native
  
  val Conflicts: typingsSlinky.activexWord.Word.Conflicts = js.native
  
  val ContentControls: typingsSlinky.activexWord.Word.ContentControls = js.native
  
  def ConvertHangulAndHanja(): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: js.UndefOr[scala.Nothing],
    FastConversion: js.UndefOr[scala.Nothing],
    CheckHangulEnding: js.UndefOr[scala.Nothing],
    EnableRecentOrdering: js.UndefOr[scala.Nothing],
    CustomDictionary: js.Any
  ): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: js.UndefOr[scala.Nothing],
    FastConversion: js.UndefOr[scala.Nothing],
    CheckHangulEnding: js.UndefOr[scala.Nothing],
    EnableRecentOrdering: js.Any
  ): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: js.UndefOr[scala.Nothing],
    FastConversion: js.UndefOr[scala.Nothing],
    CheckHangulEnding: js.UndefOr[scala.Nothing],
    EnableRecentOrdering: js.Any,
    CustomDictionary: js.Any
  ): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: js.UndefOr[scala.Nothing],
    FastConversion: js.UndefOr[scala.Nothing],
    CheckHangulEnding: js.Any
  ): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: js.UndefOr[scala.Nothing],
    FastConversion: js.UndefOr[scala.Nothing],
    CheckHangulEnding: js.Any,
    EnableRecentOrdering: js.UndefOr[scala.Nothing],
    CustomDictionary: js.Any
  ): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: js.UndefOr[scala.Nothing],
    FastConversion: js.UndefOr[scala.Nothing],
    CheckHangulEnding: js.Any,
    EnableRecentOrdering: js.Any
  ): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: js.UndefOr[scala.Nothing],
    FastConversion: js.UndefOr[scala.Nothing],
    CheckHangulEnding: js.Any,
    EnableRecentOrdering: js.Any,
    CustomDictionary: js.Any
  ): Unit = js.native
  def ConvertHangulAndHanja(ConversionsMode: js.UndefOr[scala.Nothing], FastConversion: js.Any): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: js.UndefOr[scala.Nothing],
    FastConversion: js.Any,
    CheckHangulEnding: js.UndefOr[scala.Nothing],
    EnableRecentOrdering: js.UndefOr[scala.Nothing],
    CustomDictionary: js.Any
  ): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: js.UndefOr[scala.Nothing],
    FastConversion: js.Any,
    CheckHangulEnding: js.UndefOr[scala.Nothing],
    EnableRecentOrdering: js.Any
  ): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: js.UndefOr[scala.Nothing],
    FastConversion: js.Any,
    CheckHangulEnding: js.UndefOr[scala.Nothing],
    EnableRecentOrdering: js.Any,
    CustomDictionary: js.Any
  ): Unit = js.native
  def ConvertHangulAndHanja(ConversionsMode: js.UndefOr[scala.Nothing], FastConversion: js.Any, CheckHangulEnding: js.Any): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: js.UndefOr[scala.Nothing],
    FastConversion: js.Any,
    CheckHangulEnding: js.Any,
    EnableRecentOrdering: js.UndefOr[scala.Nothing],
    CustomDictionary: js.Any
  ): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: js.UndefOr[scala.Nothing],
    FastConversion: js.Any,
    CheckHangulEnding: js.Any,
    EnableRecentOrdering: js.Any
  ): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: js.UndefOr[scala.Nothing],
    FastConversion: js.Any,
    CheckHangulEnding: js.Any,
    EnableRecentOrdering: js.Any,
    CustomDictionary: js.Any
  ): Unit = js.native
  def ConvertHangulAndHanja(ConversionsMode: js.Any): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: js.Any,
    FastConversion: js.UndefOr[scala.Nothing],
    CheckHangulEnding: js.UndefOr[scala.Nothing],
    EnableRecentOrdering: js.UndefOr[scala.Nothing],
    CustomDictionary: js.Any
  ): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: js.Any,
    FastConversion: js.UndefOr[scala.Nothing],
    CheckHangulEnding: js.UndefOr[scala.Nothing],
    EnableRecentOrdering: js.Any
  ): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: js.Any,
    FastConversion: js.UndefOr[scala.Nothing],
    CheckHangulEnding: js.UndefOr[scala.Nothing],
    EnableRecentOrdering: js.Any,
    CustomDictionary: js.Any
  ): Unit = js.native
  def ConvertHangulAndHanja(ConversionsMode: js.Any, FastConversion: js.UndefOr[scala.Nothing], CheckHangulEnding: js.Any): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: js.Any,
    FastConversion: js.UndefOr[scala.Nothing],
    CheckHangulEnding: js.Any,
    EnableRecentOrdering: js.UndefOr[scala.Nothing],
    CustomDictionary: js.Any
  ): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: js.Any,
    FastConversion: js.UndefOr[scala.Nothing],
    CheckHangulEnding: js.Any,
    EnableRecentOrdering: js.Any
  ): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: js.Any,
    FastConversion: js.UndefOr[scala.Nothing],
    CheckHangulEnding: js.Any,
    EnableRecentOrdering: js.Any,
    CustomDictionary: js.Any
  ): Unit = js.native
  def ConvertHangulAndHanja(ConversionsMode: js.Any, FastConversion: js.Any): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: js.Any,
    FastConversion: js.Any,
    CheckHangulEnding: js.UndefOr[scala.Nothing],
    EnableRecentOrdering: js.UndefOr[scala.Nothing],
    CustomDictionary: js.Any
  ): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: js.Any,
    FastConversion: js.Any,
    CheckHangulEnding: js.UndefOr[scala.Nothing],
    EnableRecentOrdering: js.Any
  ): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: js.Any,
    FastConversion: js.Any,
    CheckHangulEnding: js.UndefOr[scala.Nothing],
    EnableRecentOrdering: js.Any,
    CustomDictionary: js.Any
  ): Unit = js.native
  def ConvertHangulAndHanja(ConversionsMode: js.Any, FastConversion: js.Any, CheckHangulEnding: js.Any): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: js.Any,
    FastConversion: js.Any,
    CheckHangulEnding: js.Any,
    EnableRecentOrdering: js.UndefOr[scala.Nothing],
    CustomDictionary: js.Any
  ): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: js.Any,
    FastConversion: js.Any,
    CheckHangulEnding: js.Any,
    EnableRecentOrdering: js.Any
  ): Unit = js.native
  def ConvertHangulAndHanja(
    ConversionsMode: js.Any,
    FastConversion: js.Any,
    CheckHangulEnding: js.Any,
    EnableRecentOrdering: js.Any,
    CustomDictionary: js.Any
  ): Unit = js.native
  
  def ConvertToTable(
    Separator: js.UndefOr[js.Any],
    NumRows: js.UndefOr[js.Any],
    NumColumns: js.UndefOr[js.Any],
    InitialColumnWidth: js.UndefOr[js.Any],
    Format: js.UndefOr[js.Any],
    ApplyBorders: js.UndefOr[js.Any],
    ApplyShading: js.UndefOr[js.Any],
    ApplyFont: js.UndefOr[js.Any],
    ApplyColor: js.UndefOr[js.Any],
    ApplyHeadingRows: js.UndefOr[js.Any],
    ApplyLastRow: js.UndefOr[js.Any],
    ApplyFirstColumn: js.UndefOr[js.Any],
    ApplyLastColumn: js.UndefOr[js.Any],
    AutoFit: js.UndefOr[js.Any],
    AutoFitBehavior: js.UndefOr[js.Any],
    DefaultTableBehavior: js.UndefOr[js.Any]
  ): Table = js.native
  
  def ConvertToTableOld(
    Separator: js.UndefOr[js.Any],
    NumRows: js.UndefOr[js.Any],
    NumColumns: js.UndefOr[js.Any],
    InitialColumnWidth: js.UndefOr[js.Any],
    Format: js.UndefOr[js.Any],
    ApplyBorders: js.UndefOr[js.Any],
    ApplyShading: js.UndefOr[js.Any],
    ApplyFont: js.UndefOr[js.Any],
    ApplyColor: js.UndefOr[js.Any],
    ApplyHeadingRows: js.UndefOr[js.Any],
    ApplyLastRow: js.UndefOr[js.Any],
    ApplyFirstColumn: js.UndefOr[js.Any],
    ApplyLastColumn: js.UndefOr[js.Any],
    AutoFit: js.UndefOr[js.Any]
  ): Table = js.native
  
  def Copy(): Unit = js.native
  
  def CopyAsPicture(): Unit = js.native
  
  def CreatePublisher(): Unit = js.native
  def CreatePublisher(
    Edition: js.UndefOr[scala.Nothing],
    ContainsPICT: js.UndefOr[scala.Nothing],
    ContainsRTF: js.UndefOr[scala.Nothing],
    ContainsText: js.Any
  ): Unit = js.native
  def CreatePublisher(Edition: js.UndefOr[scala.Nothing], ContainsPICT: js.UndefOr[scala.Nothing], ContainsRTF: js.Any): Unit = js.native
  def CreatePublisher(
    Edition: js.UndefOr[scala.Nothing],
    ContainsPICT: js.UndefOr[scala.Nothing],
    ContainsRTF: js.Any,
    ContainsText: js.Any
  ): Unit = js.native
  def CreatePublisher(Edition: js.UndefOr[scala.Nothing], ContainsPICT: js.Any): Unit = js.native
  def CreatePublisher(
    Edition: js.UndefOr[scala.Nothing],
    ContainsPICT: js.Any,
    ContainsRTF: js.UndefOr[scala.Nothing],
    ContainsText: js.Any
  ): Unit = js.native
  def CreatePublisher(Edition: js.UndefOr[scala.Nothing], ContainsPICT: js.Any, ContainsRTF: js.Any): Unit = js.native
  def CreatePublisher(
    Edition: js.UndefOr[scala.Nothing],
    ContainsPICT: js.Any,
    ContainsRTF: js.Any,
    ContainsText: js.Any
  ): Unit = js.native
  def CreatePublisher(Edition: js.Any): Unit = js.native
  def CreatePublisher(
    Edition: js.Any,
    ContainsPICT: js.UndefOr[scala.Nothing],
    ContainsRTF: js.UndefOr[scala.Nothing],
    ContainsText: js.Any
  ): Unit = js.native
  def CreatePublisher(Edition: js.Any, ContainsPICT: js.UndefOr[scala.Nothing], ContainsRTF: js.Any): Unit = js.native
  def CreatePublisher(
    Edition: js.Any,
    ContainsPICT: js.UndefOr[scala.Nothing],
    ContainsRTF: js.Any,
    ContainsText: js.Any
  ): Unit = js.native
  def CreatePublisher(Edition: js.Any, ContainsPICT: js.Any): Unit = js.native
  def CreatePublisher(
    Edition: js.Any,
    ContainsPICT: js.Any,
    ContainsRTF: js.UndefOr[scala.Nothing],
    ContainsText: js.Any
  ): Unit = js.native
  def CreatePublisher(Edition: js.Any, ContainsPICT: js.Any, ContainsRTF: js.Any): Unit = js.native
  def CreatePublisher(Edition: js.Any, ContainsPICT: js.Any, ContainsRTF: js.Any, ContainsText: js.Any): Unit = js.native
  
  val Creator: Double = js.native
  
  def Cut(): Unit = js.native
  
  def Delete(): Double = js.native
  def Delete(Unit: js.UndefOr[scala.Nothing], Count: Double): Double = js.native
  def Delete(Unit: WdUnits): Double = js.native
  def Delete(Unit: WdUnits, Count: Double): Double = js.native
  
  def DetectLanguage(): Unit = js.native
  
  var DisableCharacterSpaceGrid: Boolean = js.native
  
  val Document: typingsSlinky.activexWord.Word.Document = js.native
  
  val Duplicate: Range = js.native
  
  val Editors: typingsSlinky.activexWord.Word.Editors = js.native
  
  var EmphasisMark: WdEmphasisMark = js.native
  
  var End: Double = js.native
  
  def EndOf(): Double = js.native
  def EndOf(Unit: js.UndefOr[scala.Nothing], Extend: js.Any): Double = js.native
  def EndOf(Unit: js.Any): Double = js.native
  def EndOf(Unit: js.Any, Extend: js.Any): Double = js.native
  
  val EndnoteOptions: typingsSlinky.activexWord.Word.EndnoteOptions = js.native
  
  val Endnotes: typingsSlinky.activexWord.Word.Endnotes = js.native
  
  val EnhMetaFileBits: js.Any = js.native
  
  def Expand(): Double = js.native
  def Expand(Unit: js.Any): Double = js.native
  
  /**
    * @param boolean [OpenAfterExport=false]
    * @param Word.WdExportOptimizeFor [OptimizeFor=0]
    * @param boolean [ExportCurrentPage=false]
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
    ExportCurrentPage: js.UndefOr[Boolean],
    Item: js.UndefOr[WdExportItem],
    IncludeDocProps: js.UndefOr[Boolean],
    KeepIRM: js.UndefOr[Boolean],
    CreateBookmarks: js.UndefOr[WdExportCreateBookmarks],
    DocStructureTags: js.UndefOr[Boolean],
    BitmapMissingFonts: js.UndefOr[Boolean],
    UseISO19005_1: js.UndefOr[Boolean],
    FixedFormatExtClassPtr: js.UndefOr[js.Any]
  ): Unit = js.native
  
  def ExportFragment(FileName: String, Format: WdSaveFormat): Unit = js.native
  
  val Fields: typingsSlinky.activexWord.Word.Fields = js.native
  
  val Find: typingsSlinky.activexWord.Word.Find[Range] = js.native
  
  var FitTextWidth: Double = js.native
  
  var Font: typingsSlinky.activexWord.Word.Font = js.native
  
  val FootnoteOptions: typingsSlinky.activexWord.Word.FootnoteOptions = js.native
  
  val Footnotes: typingsSlinky.activexWord.Word.Footnotes = js.native
  
  val FormFields: typingsSlinky.activexWord.Word.FormFields = js.native
  
  var FormattedText: Range = js.native
  
  val Frames: typingsSlinky.activexWord.Word.Frames = js.native
  
  def GetSpellingSuggestions(
    CustomDictionary: js.UndefOr[js.Any],
    IgnoreUppercase: js.UndefOr[js.Any],
    MainDictionary: js.UndefOr[js.Any],
    SuggestionMode: js.UndefOr[js.Any],
    CustomDictionary2: js.UndefOr[js.Any],
    CustomDictionary3: js.UndefOr[js.Any],
    CustomDictionary4: js.UndefOr[js.Any],
    CustomDictionary5: js.UndefOr[js.Any],
    CustomDictionary6: js.UndefOr[js.Any],
    CustomDictionary7: js.UndefOr[js.Any],
    CustomDictionary8: js.UndefOr[js.Any],
    CustomDictionary9: js.UndefOr[js.Any],
    CustomDictionary10: js.UndefOr[js.Any]
  ): SpellingSuggestions = js.native
  
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
  
  def GoToEditableRange(): Range = js.native
  def GoToEditableRange(EditorID: js.Any): Range = js.native
  
  def GoToNext(What: WdGoToItem): Range = js.native
  
  def GoToPrevious(What: WdGoToItem): Range = js.native
  
  var GrammarChecked: Boolean = js.native
  
  val GrammaticalErrors: ProofreadingErrors = js.native
  
  val HTMLDivisions: typingsSlinky.activexWord.Word.HTMLDivisions = js.native
  
  var HighlightColorIndex: WdColorIndex = js.native
  
  var HorizontalInVertical: WdHorizontalInVerticalType = js.native
  
  val Hyperlinks: typingsSlinky.activexWord.Word.Hyperlinks = js.native
  
  var ID: String = js.native
  
  /** @param boolean [MatchDestination=false] */
  def ImportFragment(FileName: String): Unit = js.native
  def ImportFragment(FileName: String, MatchDestination: Boolean): Unit = js.native
  
  def InRange(Range: Range): Boolean = js.native
  
  def InStory(Range: Range): Boolean = js.native
  
  def Information(Type: WdInformation): js.Any = js.native
  
  val InlineShapes: typingsSlinky.activexWord.Word.InlineShapes = js.native
  
  def InsertAfter(Text: String): Unit = js.native
  
  /** @param number [RelativeTo=0] */
  def InsertAlignmentTab(Alignment: Double): Unit = js.native
  def InsertAlignmentTab(Alignment: Double, RelativeTo: Double): Unit = js.native
  
  def InsertAutoText(): Unit = js.native
  
  def InsertBefore(Text: String): Unit = js.native
  
  def InsertBreak(): Unit = js.native
  def InsertBreak(Type: js.Any): Unit = js.native
  
  def InsertCaption(Label: js.Any): Unit = js.native
  def InsertCaption(
    Label: js.Any,
    Title: js.UndefOr[scala.Nothing],
    TitleAutoText: js.UndefOr[scala.Nothing],
    Position: js.UndefOr[scala.Nothing],
    ExcludeLabel: js.Any
  ): Unit = js.native
  def InsertCaption(
    Label: js.Any,
    Title: js.UndefOr[scala.Nothing],
    TitleAutoText: js.UndefOr[scala.Nothing],
    Position: js.Any
  ): Unit = js.native
  def InsertCaption(
    Label: js.Any,
    Title: js.UndefOr[scala.Nothing],
    TitleAutoText: js.UndefOr[scala.Nothing],
    Position: js.Any,
    ExcludeLabel: js.Any
  ): Unit = js.native
  def InsertCaption(Label: js.Any, Title: js.UndefOr[scala.Nothing], TitleAutoText: js.Any): Unit = js.native
  def InsertCaption(
    Label: js.Any,
    Title: js.UndefOr[scala.Nothing],
    TitleAutoText: js.Any,
    Position: js.UndefOr[scala.Nothing],
    ExcludeLabel: js.Any
  ): Unit = js.native
  def InsertCaption(Label: js.Any, Title: js.UndefOr[scala.Nothing], TitleAutoText: js.Any, Position: js.Any): Unit = js.native
  def InsertCaption(
    Label: js.Any,
    Title: js.UndefOr[scala.Nothing],
    TitleAutoText: js.Any,
    Position: js.Any,
    ExcludeLabel: js.Any
  ): Unit = js.native
  def InsertCaption(Label: js.Any, Title: js.Any): Unit = js.native
  def InsertCaption(
    Label: js.Any,
    Title: js.Any,
    TitleAutoText: js.UndefOr[scala.Nothing],
    Position: js.UndefOr[scala.Nothing],
    ExcludeLabel: js.Any
  ): Unit = js.native
  def InsertCaption(Label: js.Any, Title: js.Any, TitleAutoText: js.UndefOr[scala.Nothing], Position: js.Any): Unit = js.native
  def InsertCaption(
    Label: js.Any,
    Title: js.Any,
    TitleAutoText: js.UndefOr[scala.Nothing],
    Position: js.Any,
    ExcludeLabel: js.Any
  ): Unit = js.native
  def InsertCaption(Label: js.Any, Title: js.Any, TitleAutoText: js.Any): Unit = js.native
  def InsertCaption(
    Label: js.Any,
    Title: js.Any,
    TitleAutoText: js.Any,
    Position: js.UndefOr[scala.Nothing],
    ExcludeLabel: js.Any
  ): Unit = js.native
  def InsertCaption(Label: js.Any, Title: js.Any, TitleAutoText: js.Any, Position: js.Any): Unit = js.native
  def InsertCaption(Label: js.Any, Title: js.Any, TitleAutoText: js.Any, Position: js.Any, ExcludeLabel: js.Any): Unit = js.native
  
  def InsertCaptionXP(Label: js.Any): Unit = js.native
  def InsertCaptionXP(
    Label: js.Any,
    Title: js.UndefOr[scala.Nothing],
    TitleAutoText: js.UndefOr[scala.Nothing],
    Position: js.Any
  ): Unit = js.native
  def InsertCaptionXP(Label: js.Any, Title: js.UndefOr[scala.Nothing], TitleAutoText: js.Any): Unit = js.native
  def InsertCaptionXP(Label: js.Any, Title: js.UndefOr[scala.Nothing], TitleAutoText: js.Any, Position: js.Any): Unit = js.native
  def InsertCaptionXP(Label: js.Any, Title: js.Any): Unit = js.native
  def InsertCaptionXP(Label: js.Any, Title: js.Any, TitleAutoText: js.UndefOr[scala.Nothing], Position: js.Any): Unit = js.native
  def InsertCaptionXP(Label: js.Any, Title: js.Any, TitleAutoText: js.Any): Unit = js.native
  def InsertCaptionXP(Label: js.Any, Title: js.Any, TitleAutoText: js.Any, Position: js.Any): Unit = js.native
  
  def InsertCrossReference(ReferenceType: js.Any, ReferenceKind: WdReferenceKind, ReferenceItem: js.Any): Unit = js.native
  def InsertCrossReference(
    ReferenceType: js.Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: js.Any,
    InsertAsHyperlink: js.UndefOr[scala.Nothing],
    IncludePosition: js.UndefOr[scala.Nothing],
    SeparateNumbers: js.UndefOr[scala.Nothing],
    SeparatorString: js.Any
  ): Unit = js.native
  def InsertCrossReference(
    ReferenceType: js.Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: js.Any,
    InsertAsHyperlink: js.UndefOr[scala.Nothing],
    IncludePosition: js.UndefOr[scala.Nothing],
    SeparateNumbers: js.Any
  ): Unit = js.native
  def InsertCrossReference(
    ReferenceType: js.Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: js.Any,
    InsertAsHyperlink: js.UndefOr[scala.Nothing],
    IncludePosition: js.UndefOr[scala.Nothing],
    SeparateNumbers: js.Any,
    SeparatorString: js.Any
  ): Unit = js.native
  def InsertCrossReference(
    ReferenceType: js.Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: js.Any,
    InsertAsHyperlink: js.UndefOr[scala.Nothing],
    IncludePosition: js.Any
  ): Unit = js.native
  def InsertCrossReference(
    ReferenceType: js.Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: js.Any,
    InsertAsHyperlink: js.UndefOr[scala.Nothing],
    IncludePosition: js.Any,
    SeparateNumbers: js.UndefOr[scala.Nothing],
    SeparatorString: js.Any
  ): Unit = js.native
  def InsertCrossReference(
    ReferenceType: js.Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: js.Any,
    InsertAsHyperlink: js.UndefOr[scala.Nothing],
    IncludePosition: js.Any,
    SeparateNumbers: js.Any
  ): Unit = js.native
  def InsertCrossReference(
    ReferenceType: js.Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: js.Any,
    InsertAsHyperlink: js.UndefOr[scala.Nothing],
    IncludePosition: js.Any,
    SeparateNumbers: js.Any,
    SeparatorString: js.Any
  ): Unit = js.native
  def InsertCrossReference(
    ReferenceType: js.Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: js.Any,
    InsertAsHyperlink: js.Any
  ): Unit = js.native
  def InsertCrossReference(
    ReferenceType: js.Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: js.Any,
    InsertAsHyperlink: js.Any,
    IncludePosition: js.UndefOr[scala.Nothing],
    SeparateNumbers: js.UndefOr[scala.Nothing],
    SeparatorString: js.Any
  ): Unit = js.native
  def InsertCrossReference(
    ReferenceType: js.Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: js.Any,
    InsertAsHyperlink: js.Any,
    IncludePosition: js.UndefOr[scala.Nothing],
    SeparateNumbers: js.Any
  ): Unit = js.native
  def InsertCrossReference(
    ReferenceType: js.Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: js.Any,
    InsertAsHyperlink: js.Any,
    IncludePosition: js.UndefOr[scala.Nothing],
    SeparateNumbers: js.Any,
    SeparatorString: js.Any
  ): Unit = js.native
  def InsertCrossReference(
    ReferenceType: js.Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: js.Any,
    InsertAsHyperlink: js.Any,
    IncludePosition: js.Any
  ): Unit = js.native
  def InsertCrossReference(
    ReferenceType: js.Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: js.Any,
    InsertAsHyperlink: js.Any,
    IncludePosition: js.Any,
    SeparateNumbers: js.UndefOr[scala.Nothing],
    SeparatorString: js.Any
  ): Unit = js.native
  def InsertCrossReference(
    ReferenceType: js.Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: js.Any,
    InsertAsHyperlink: js.Any,
    IncludePosition: js.Any,
    SeparateNumbers: js.Any
  ): Unit = js.native
  def InsertCrossReference(
    ReferenceType: js.Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: js.Any,
    InsertAsHyperlink: js.Any,
    IncludePosition: js.Any,
    SeparateNumbers: js.Any,
    SeparatorString: js.Any
  ): Unit = js.native
  
  def InsertCrossReference_2002(ReferenceType: js.Any, ReferenceKind: WdReferenceKind, ReferenceItem: js.Any): Unit = js.native
  def InsertCrossReference_2002(
    ReferenceType: js.Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: js.Any,
    InsertAsHyperlink: js.UndefOr[scala.Nothing],
    IncludePosition: js.Any
  ): Unit = js.native
  def InsertCrossReference_2002(
    ReferenceType: js.Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: js.Any,
    InsertAsHyperlink: js.Any
  ): Unit = js.native
  def InsertCrossReference_2002(
    ReferenceType: js.Any,
    ReferenceKind: WdReferenceKind,
    ReferenceItem: js.Any,
    InsertAsHyperlink: js.Any,
    IncludePosition: js.Any
  ): Unit = js.native
  
  def InsertDatabase(
    Format: js.UndefOr[js.Any],
    Style: js.UndefOr[js.Any],
    LinkToSource: js.UndefOr[js.Any],
    Connection: js.UndefOr[js.Any],
    SQLStatement: js.UndefOr[js.Any],
    SQLStatement1: js.UndefOr[js.Any],
    PasswordDocument: js.UndefOr[js.Any],
    PasswordTemplate: js.UndefOr[js.Any],
    WritePasswordDocument: js.UndefOr[js.Any],
    WritePasswordTemplate: js.UndefOr[js.Any],
    DataSource: js.UndefOr[js.Any],
    From: js.UndefOr[js.Any],
    To: js.UndefOr[js.Any],
    IncludeFields: js.UndefOr[js.Any]
  ): Unit = js.native
  
  def InsertDateTime(): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: js.UndefOr[scala.Nothing],
    InsertAsField: js.UndefOr[scala.Nothing],
    InsertAsFullWidth: js.UndefOr[scala.Nothing],
    DateLanguage: js.UndefOr[scala.Nothing],
    CalendarType: js.Any
  ): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: js.UndefOr[scala.Nothing],
    InsertAsField: js.UndefOr[scala.Nothing],
    InsertAsFullWidth: js.UndefOr[scala.Nothing],
    DateLanguage: js.Any
  ): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: js.UndefOr[scala.Nothing],
    InsertAsField: js.UndefOr[scala.Nothing],
    InsertAsFullWidth: js.UndefOr[scala.Nothing],
    DateLanguage: js.Any,
    CalendarType: js.Any
  ): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: js.UndefOr[scala.Nothing],
    InsertAsField: js.UndefOr[scala.Nothing],
    InsertAsFullWidth: js.Any
  ): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: js.UndefOr[scala.Nothing],
    InsertAsField: js.UndefOr[scala.Nothing],
    InsertAsFullWidth: js.Any,
    DateLanguage: js.UndefOr[scala.Nothing],
    CalendarType: js.Any
  ): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: js.UndefOr[scala.Nothing],
    InsertAsField: js.UndefOr[scala.Nothing],
    InsertAsFullWidth: js.Any,
    DateLanguage: js.Any
  ): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: js.UndefOr[scala.Nothing],
    InsertAsField: js.UndefOr[scala.Nothing],
    InsertAsFullWidth: js.Any,
    DateLanguage: js.Any,
    CalendarType: js.Any
  ): Unit = js.native
  def InsertDateTime(DateTimeFormat: js.UndefOr[scala.Nothing], InsertAsField: js.Any): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: js.UndefOr[scala.Nothing],
    InsertAsField: js.Any,
    InsertAsFullWidth: js.UndefOr[scala.Nothing],
    DateLanguage: js.UndefOr[scala.Nothing],
    CalendarType: js.Any
  ): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: js.UndefOr[scala.Nothing],
    InsertAsField: js.Any,
    InsertAsFullWidth: js.UndefOr[scala.Nothing],
    DateLanguage: js.Any
  ): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: js.UndefOr[scala.Nothing],
    InsertAsField: js.Any,
    InsertAsFullWidth: js.UndefOr[scala.Nothing],
    DateLanguage: js.Any,
    CalendarType: js.Any
  ): Unit = js.native
  def InsertDateTime(DateTimeFormat: js.UndefOr[scala.Nothing], InsertAsField: js.Any, InsertAsFullWidth: js.Any): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: js.UndefOr[scala.Nothing],
    InsertAsField: js.Any,
    InsertAsFullWidth: js.Any,
    DateLanguage: js.UndefOr[scala.Nothing],
    CalendarType: js.Any
  ): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: js.UndefOr[scala.Nothing],
    InsertAsField: js.Any,
    InsertAsFullWidth: js.Any,
    DateLanguage: js.Any
  ): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: js.UndefOr[scala.Nothing],
    InsertAsField: js.Any,
    InsertAsFullWidth: js.Any,
    DateLanguage: js.Any,
    CalendarType: js.Any
  ): Unit = js.native
  def InsertDateTime(DateTimeFormat: js.Any): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: js.Any,
    InsertAsField: js.UndefOr[scala.Nothing],
    InsertAsFullWidth: js.UndefOr[scala.Nothing],
    DateLanguage: js.UndefOr[scala.Nothing],
    CalendarType: js.Any
  ): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: js.Any,
    InsertAsField: js.UndefOr[scala.Nothing],
    InsertAsFullWidth: js.UndefOr[scala.Nothing],
    DateLanguage: js.Any
  ): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: js.Any,
    InsertAsField: js.UndefOr[scala.Nothing],
    InsertAsFullWidth: js.UndefOr[scala.Nothing],
    DateLanguage: js.Any,
    CalendarType: js.Any
  ): Unit = js.native
  def InsertDateTime(DateTimeFormat: js.Any, InsertAsField: js.UndefOr[scala.Nothing], InsertAsFullWidth: js.Any): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: js.Any,
    InsertAsField: js.UndefOr[scala.Nothing],
    InsertAsFullWidth: js.Any,
    DateLanguage: js.UndefOr[scala.Nothing],
    CalendarType: js.Any
  ): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: js.Any,
    InsertAsField: js.UndefOr[scala.Nothing],
    InsertAsFullWidth: js.Any,
    DateLanguage: js.Any
  ): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: js.Any,
    InsertAsField: js.UndefOr[scala.Nothing],
    InsertAsFullWidth: js.Any,
    DateLanguage: js.Any,
    CalendarType: js.Any
  ): Unit = js.native
  def InsertDateTime(DateTimeFormat: js.Any, InsertAsField: js.Any): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: js.Any,
    InsertAsField: js.Any,
    InsertAsFullWidth: js.UndefOr[scala.Nothing],
    DateLanguage: js.UndefOr[scala.Nothing],
    CalendarType: js.Any
  ): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: js.Any,
    InsertAsField: js.Any,
    InsertAsFullWidth: js.UndefOr[scala.Nothing],
    DateLanguage: js.Any
  ): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: js.Any,
    InsertAsField: js.Any,
    InsertAsFullWidth: js.UndefOr[scala.Nothing],
    DateLanguage: js.Any,
    CalendarType: js.Any
  ): Unit = js.native
  def InsertDateTime(DateTimeFormat: js.Any, InsertAsField: js.Any, InsertAsFullWidth: js.Any): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: js.Any,
    InsertAsField: js.Any,
    InsertAsFullWidth: js.Any,
    DateLanguage: js.UndefOr[scala.Nothing],
    CalendarType: js.Any
  ): Unit = js.native
  def InsertDateTime(DateTimeFormat: js.Any, InsertAsField: js.Any, InsertAsFullWidth: js.Any, DateLanguage: js.Any): Unit = js.native
  def InsertDateTime(
    DateTimeFormat: js.Any,
    InsertAsField: js.Any,
    InsertAsFullWidth: js.Any,
    DateLanguage: js.Any,
    CalendarType: js.Any
  ): Unit = js.native
  
  def InsertDateTimeOld(): Unit = js.native
  def InsertDateTimeOld(
    DateTimeFormat: js.UndefOr[scala.Nothing],
    InsertAsField: js.UndefOr[scala.Nothing],
    InsertAsFullWidth: js.Any
  ): Unit = js.native
  def InsertDateTimeOld(DateTimeFormat: js.UndefOr[scala.Nothing], InsertAsField: js.Any): Unit = js.native
  def InsertDateTimeOld(DateTimeFormat: js.UndefOr[scala.Nothing], InsertAsField: js.Any, InsertAsFullWidth: js.Any): Unit = js.native
  def InsertDateTimeOld(DateTimeFormat: js.Any): Unit = js.native
  def InsertDateTimeOld(DateTimeFormat: js.Any, InsertAsField: js.UndefOr[scala.Nothing], InsertAsFullWidth: js.Any): Unit = js.native
  def InsertDateTimeOld(DateTimeFormat: js.Any, InsertAsField: js.Any): Unit = js.native
  def InsertDateTimeOld(DateTimeFormat: js.Any, InsertAsField: js.Any, InsertAsFullWidth: js.Any): Unit = js.native
  
  def InsertFile(FileName: String): Unit = js.native
  def InsertFile(
    FileName: String,
    Range: js.UndefOr[scala.Nothing],
    ConfirmConversions: js.UndefOr[scala.Nothing],
    Link: js.UndefOr[scala.Nothing],
    Attachment: js.Any
  ): Unit = js.native
  def InsertFile(
    FileName: String,
    Range: js.UndefOr[scala.Nothing],
    ConfirmConversions: js.UndefOr[scala.Nothing],
    Link: js.Any
  ): Unit = js.native
  def InsertFile(
    FileName: String,
    Range: js.UndefOr[scala.Nothing],
    ConfirmConversions: js.UndefOr[scala.Nothing],
    Link: js.Any,
    Attachment: js.Any
  ): Unit = js.native
  def InsertFile(FileName: String, Range: js.UndefOr[scala.Nothing], ConfirmConversions: js.Any): Unit = js.native
  def InsertFile(
    FileName: String,
    Range: js.UndefOr[scala.Nothing],
    ConfirmConversions: js.Any,
    Link: js.UndefOr[scala.Nothing],
    Attachment: js.Any
  ): Unit = js.native
  def InsertFile(FileName: String, Range: js.UndefOr[scala.Nothing], ConfirmConversions: js.Any, Link: js.Any): Unit = js.native
  def InsertFile(
    FileName: String,
    Range: js.UndefOr[scala.Nothing],
    ConfirmConversions: js.Any,
    Link: js.Any,
    Attachment: js.Any
  ): Unit = js.native
  def InsertFile(FileName: String, Range: js.Any): Unit = js.native
  def InsertFile(
    FileName: String,
    Range: js.Any,
    ConfirmConversions: js.UndefOr[scala.Nothing],
    Link: js.UndefOr[scala.Nothing],
    Attachment: js.Any
  ): Unit = js.native
  def InsertFile(FileName: String, Range: js.Any, ConfirmConversions: js.UndefOr[scala.Nothing], Link: js.Any): Unit = js.native
  def InsertFile(
    FileName: String,
    Range: js.Any,
    ConfirmConversions: js.UndefOr[scala.Nothing],
    Link: js.Any,
    Attachment: js.Any
  ): Unit = js.native
  def InsertFile(FileName: String, Range: js.Any, ConfirmConversions: js.Any): Unit = js.native
  def InsertFile(
    FileName: String,
    Range: js.Any,
    ConfirmConversions: js.Any,
    Link: js.UndefOr[scala.Nothing],
    Attachment: js.Any
  ): Unit = js.native
  def InsertFile(FileName: String, Range: js.Any, ConfirmConversions: js.Any, Link: js.Any): Unit = js.native
  def InsertFile(FileName: String, Range: js.Any, ConfirmConversions: js.Any, Link: js.Any, Attachment: js.Any): Unit = js.native
  
  def InsertParagraph(): Unit = js.native
  
  def InsertParagraphAfter(): Unit = js.native
  
  def InsertParagraphBefore(): Unit = js.native
  
  def InsertSymbol(CharacterNumber: Double): Unit = js.native
  def InsertSymbol(
    CharacterNumber: Double,
    Font: js.UndefOr[scala.Nothing],
    Unicode: js.UndefOr[scala.Nothing],
    Bias: js.Any
  ): Unit = js.native
  def InsertSymbol(CharacterNumber: Double, Font: js.UndefOr[scala.Nothing], Unicode: js.Any): Unit = js.native
  def InsertSymbol(CharacterNumber: Double, Font: js.UndefOr[scala.Nothing], Unicode: js.Any, Bias: js.Any): Unit = js.native
  def InsertSymbol(CharacterNumber: Double, Font: js.Any): Unit = js.native
  def InsertSymbol(CharacterNumber: Double, Font: js.Any, Unicode: js.UndefOr[scala.Nothing], Bias: js.Any): Unit = js.native
  def InsertSymbol(CharacterNumber: Double, Font: js.Any, Unicode: js.Any): Unit = js.native
  def InsertSymbol(CharacterNumber: Double, Font: js.Any, Unicode: js.Any, Bias: js.Any): Unit = js.native
  
  def InsertXML(XML: String): Unit = js.native
  def InsertXML(XML: String, Transform: js.Any): Unit = js.native
  
  val IsEndOfRowMark: Boolean = js.native
  
  def IsEqual(Range: Range): Boolean = js.native
  
  var Italic: Boolean | `9999999` | `9999998` = js.native
  
  var ItalicBi: Boolean | `9999999` | `9999998` = js.native
  
  var Kana: WdKana = js.native
  
  var LanguageDetected: Boolean = js.native
  
  var LanguageID: WdLanguageID = js.native
  
  var LanguageIDFarEast: WdLanguageID = js.native
  
  var LanguageIDOther: WdLanguageID = js.native
  
  val ListFormat: typingsSlinky.activexWord.Word.ListFormat = js.native
  
  val ListParagraphs: typingsSlinky.activexWord.Word.ListParagraphs = js.native
  
  val ListStyle: js.Any = js.native
  
  val Locks: CoAuthLocks = js.native
  
  def LookupNameProperties(): Unit = js.native
  
  def ModifyEnclosure(Style: js.Any): Unit = js.native
  def ModifyEnclosure(Style: js.Any, Symbol: js.UndefOr[scala.Nothing], EnclosedText: js.Any): Unit = js.native
  def ModifyEnclosure(Style: js.Any, Symbol: js.Any): Unit = js.native
  def ModifyEnclosure(Style: js.Any, Symbol: js.Any, EnclosedText: js.Any): Unit = js.native
  
  def Move(): Double = js.native
  def Move(Unit: js.UndefOr[scala.Nothing], Count: Double): Double = js.native
  def Move(Unit: WdUnits): Double = js.native
  def Move(Unit: WdUnits, Count: Double): Double = js.native
  
  def MoveEnd(): Double = js.native
  def MoveEnd(Unit: js.UndefOr[scala.Nothing], Count: Double): Double = js.native
  def MoveEnd(Unit: WdUnits): Double = js.native
  def MoveEnd(Unit: WdUnits, Count: Double): Double = js.native
  
  def MoveEndUntil(Cset: js.Any): Double = js.native
  def MoveEndUntil(Cset: js.Any, Count: js.Any): Double = js.native
  
  def MoveEndWhile(Cset: js.Any): Double = js.native
  def MoveEndWhile(Cset: js.Any, Count: js.Any): Double = js.native
  
  def MoveStart(): Double = js.native
  def MoveStart(Unit: js.UndefOr[scala.Nothing], Count: Double): Double = js.native
  def MoveStart(Unit: WdUnits): Double = js.native
  def MoveStart(Unit: WdUnits, Count: Double): Double = js.native
  
  def MoveStartUntil(Cset: js.Any): Double = js.native
  def MoveStartUntil(Cset: js.Any, Count: js.Any): Double = js.native
  
  def MoveStartWhile(Cset: js.Any): Double = js.native
  def MoveStartWhile(Cset: js.Any, Count: js.Any): Double = js.native
  
  def MoveUntil(Cset: js.Any): Double = js.native
  def MoveUntil(Cset: js.Any, Count: js.Any): Double = js.native
  
  def MoveWhile(Cset: js.Any): Double = js.native
  def MoveWhile(Cset: js.Any, Count: js.Any): Double = js.native
  
  def Next(): Range = js.native
  def Next(Unit: js.UndefOr[scala.Nothing], Count: js.Any): Range = js.native
  def Next(Unit: js.Any): Range = js.native
  def Next(Unit: js.Any, Count: js.Any): Range = js.native
  
  val NextStoryRange: Range = js.native
  
  def NextSubdocument(): Unit = js.native
  
  var NoProofing: Double = js.native
  
  val OMaths: typingsSlinky.activexWord.Word.OMaths = js.native
  
  var Orientation: WdTextOrientation = js.native
  
  var PageSetup: typingsSlinky.activexWord.Word.PageSetup = js.native
  
  var ParagraphFormat: typingsSlinky.activexWord.Word.ParagraphFormat = js.native
  
  val ParagraphStyle: js.Any = js.native
  
  val Paragraphs: typingsSlinky.activexWord.Word.Paragraphs = js.native
  
  val Parent: js.Any = js.native
  
  val ParentContentControl: ContentControl = js.native
  
  def Paste(): Unit = js.native
  
  def PasteAndFormat(Type: WdRecoveryType): Unit = js.native
  
  def PasteAppendTable(): Unit = js.native
  
  def PasteAsNestedTable(): Unit = js.native
  
  def PasteExcelTable(LinkedToExcel: Boolean, WordFormatting: Boolean, RTF: Boolean): Unit = js.native
  
  def PasteSpecial(
    IconIndex: js.UndefOr[js.Any],
    Link: js.UndefOr[js.Any],
    Placement: js.UndefOr[js.Any],
    DisplayAsIcon: js.UndefOr[js.Any],
    DataType: js.UndefOr[js.Any],
    IconFileName: js.UndefOr[js.Any],
    IconLabel: js.UndefOr[js.Any]
  ): Unit = js.native
  
  /**
    * @param Word.WdPhoneticGuideAlignmentType [Alignment=-1]
    * @param number [Raise=0]
    * @param number [FontSize=0]
    * @param string [FontName='']
    */
  def PhoneticGuide(Text: String): Unit = js.native
  def PhoneticGuide(
    Text: String,
    Alignment: js.UndefOr[scala.Nothing],
    Raise: js.UndefOr[scala.Nothing],
    FontSize: js.UndefOr[scala.Nothing],
    FontName: String
  ): Unit = js.native
  def PhoneticGuide(
    Text: String,
    Alignment: js.UndefOr[scala.Nothing],
    Raise: js.UndefOr[scala.Nothing],
    FontSize: Double
  ): Unit = js.native
  def PhoneticGuide(
    Text: String,
    Alignment: js.UndefOr[scala.Nothing],
    Raise: js.UndefOr[scala.Nothing],
    FontSize: Double,
    FontName: String
  ): Unit = js.native
  def PhoneticGuide(Text: String, Alignment: js.UndefOr[scala.Nothing], Raise: Double): Unit = js.native
  def PhoneticGuide(
    Text: String,
    Alignment: js.UndefOr[scala.Nothing],
    Raise: Double,
    FontSize: js.UndefOr[scala.Nothing],
    FontName: String
  ): Unit = js.native
  def PhoneticGuide(Text: String, Alignment: js.UndefOr[scala.Nothing], Raise: Double, FontSize: Double): Unit = js.native
  def PhoneticGuide(
    Text: String,
    Alignment: js.UndefOr[scala.Nothing],
    Raise: Double,
    FontSize: Double,
    FontName: String
  ): Unit = js.native
  def PhoneticGuide(Text: String, Alignment: WdPhoneticGuideAlignmentType): Unit = js.native
  def PhoneticGuide(
    Text: String,
    Alignment: WdPhoneticGuideAlignmentType,
    Raise: js.UndefOr[scala.Nothing],
    FontSize: js.UndefOr[scala.Nothing],
    FontName: String
  ): Unit = js.native
  def PhoneticGuide(
    Text: String,
    Alignment: WdPhoneticGuideAlignmentType,
    Raise: js.UndefOr[scala.Nothing],
    FontSize: Double
  ): Unit = js.native
  def PhoneticGuide(
    Text: String,
    Alignment: WdPhoneticGuideAlignmentType,
    Raise: js.UndefOr[scala.Nothing],
    FontSize: Double,
    FontName: String
  ): Unit = js.native
  def PhoneticGuide(Text: String, Alignment: WdPhoneticGuideAlignmentType, Raise: Double): Unit = js.native
  def PhoneticGuide(
    Text: String,
    Alignment: WdPhoneticGuideAlignmentType,
    Raise: Double,
    FontSize: js.UndefOr[scala.Nothing],
    FontName: String
  ): Unit = js.native
  def PhoneticGuide(Text: String, Alignment: WdPhoneticGuideAlignmentType, Raise: Double, FontSize: Double): Unit = js.native
  def PhoneticGuide(
    Text: String,
    Alignment: WdPhoneticGuideAlignmentType,
    Raise: Double,
    FontSize: Double,
    FontName: String
  ): Unit = js.native
  
  def Previous(): Range = js.native
  def Previous(Unit: js.UndefOr[scala.Nothing], Count: js.Any): Range = js.native
  def Previous(Unit: js.Any): Range = js.native
  def Previous(Unit: js.Any, Count: js.Any): Range = js.native
  
  val PreviousBookmarkID: Double = js.native
  
  def PreviousSubdocument(): Unit = js.native
  
  val ReadabilityStatistics: typingsSlinky.activexWord.Word.ReadabilityStatistics = js.native
  
  def Relocate(Direction: Double): Unit = js.native
  
  val Revisions: typingsSlinky.activexWord.Word.Revisions = js.native
  
  val Rows: typingsSlinky.activexWord.Word.Rows = js.native
  
  def Scripts(Index: js.Any): Script = js.native
  @JSName("Scripts")
  val Scripts_Original: Scripts = js.native
  
  val Sections: typingsSlinky.activexWord.Word.Sections = js.native
  
  def Select(): Unit = js.native
  
  val Sentences: typingsSlinky.activexWord.Word.Sentences = js.native
  
  def SetListLevel(Level: Double): Unit = js.native
  
  def SetRange(Start: Double, End: Double): Unit = js.native
  
  val Shading: typingsSlinky.activexWord.Word.Shading = js.native
  
  val ShapeRange: typingsSlinky.activexWord.Word.ShapeRange = js.native
  
  var ShowAll: Boolean = js.native
  
  val SmartTags: typingsSlinky.activexWord.Word.SmartTags = js.native
  
  def Sort(
    ExcludeHeader: js.UndefOr[js.Any],
    FieldNumber: js.UndefOr[js.Any],
    SortFieldType: js.UndefOr[js.Any],
    SortOrder: js.UndefOr[js.Any],
    FieldNumber2: js.UndefOr[js.Any],
    SortFieldType2: js.UndefOr[js.Any],
    SortOrder2: js.UndefOr[js.Any],
    FieldNumber3: js.UndefOr[js.Any],
    SortFieldType3: js.UndefOr[js.Any],
    SortOrder3: js.UndefOr[js.Any],
    SortColumn: js.UndefOr[js.Any],
    Separator: js.UndefOr[js.Any],
    CaseSensitive: js.UndefOr[js.Any],
    BidiSort: js.UndefOr[js.Any],
    IgnoreThe: js.UndefOr[js.Any],
    IgnoreKashida: js.UndefOr[js.Any],
    IgnoreDiacritics: js.UndefOr[js.Any],
    IgnoreHe: js.UndefOr[js.Any],
    LanguageID: js.UndefOr[js.Any]
  ): Unit = js.native
  
  def SortAscending(): Unit = js.native
  
  def SortDescending(): Unit = js.native
  
  def SortOld(
    ExcludeHeader: js.UndefOr[js.Any],
    FieldNumber: js.UndefOr[js.Any],
    SortFieldType: js.UndefOr[js.Any],
    SortOrder: js.UndefOr[js.Any],
    FieldNumber2: js.UndefOr[js.Any],
    SortFieldType2: js.UndefOr[js.Any],
    SortOrder2: js.UndefOr[js.Any],
    FieldNumber3: js.UndefOr[js.Any],
    SortFieldType3: js.UndefOr[js.Any],
    SortOrder3: js.UndefOr[js.Any],
    SortColumn: js.UndefOr[js.Any],
    Separator: js.UndefOr[js.Any],
    CaseSensitive: js.UndefOr[js.Any],
    LanguageID: js.UndefOr[js.Any]
  ): Unit = js.native
  
  var SpellingChecked: Boolean = js.native
  
  val SpellingErrors: ProofreadingErrors = js.native
  
  var Start: Double = js.native
  
  def StartOf(): Double = js.native
  def StartOf(Unit: js.UndefOr[scala.Nothing], Extend: js.Any): Double = js.native
  def StartOf(Unit: js.Any): Double = js.native
  def StartOf(Unit: js.Any, Extend: js.Any): Double = js.native
  
  val StoryLength: Double = js.native
  
  val StoryType: WdStoryType = js.native
  
  var Style: js.Any = js.native
  
  val Subdocuments: typingsSlinky.activexWord.Word.Subdocuments = js.native
  
  def SubscribeTo(Edition: String): Unit = js.native
  def SubscribeTo(Edition: String, Format: js.Any): Unit = js.native
  
  val SynonymInfo: typingsSlinky.activexWord.Word.SynonymInfo = js.native
  
  /**
    * @param Word.WdTCSCConverterDirection [WdTCSCConverterDirection=2]
    * @param boolean [CommonTerms=false]
    * @param boolean [UseVariants=false]
    */
  def TCSCConverter(): Unit = js.native
  def TCSCConverter(
    WdTCSCConverterDirection: js.UndefOr[scala.Nothing],
    CommonTerms: js.UndefOr[scala.Nothing],
    UseVariants: Boolean
  ): Unit = js.native
  def TCSCConverter(WdTCSCConverterDirection: js.UndefOr[scala.Nothing], CommonTerms: Boolean): Unit = js.native
  def TCSCConverter(WdTCSCConverterDirection: js.UndefOr[scala.Nothing], CommonTerms: Boolean, UseVariants: Boolean): Unit = js.native
  def TCSCConverter(WdTCSCConverterDirection: WdTCSCConverterDirection): Unit = js.native
  def TCSCConverter(
    WdTCSCConverterDirection: WdTCSCConverterDirection,
    CommonTerms: js.UndefOr[scala.Nothing],
    UseVariants: Boolean
  ): Unit = js.native
  def TCSCConverter(WdTCSCConverterDirection: WdTCSCConverterDirection, CommonTerms: Boolean): Unit = js.native
  def TCSCConverter(WdTCSCConverterDirection: WdTCSCConverterDirection, CommonTerms: Boolean, UseVariants: Boolean): Unit = js.native
  
  val TableStyle: js.Any = js.native
  
  val Tables: typingsSlinky.activexWord.Word.Tables = js.native
  
  var Text: String = js.native
  
  var TextRetrievalMode: typingsSlinky.activexWord.Word.TextRetrievalMode = js.native
  
  val TopLevelTables: typingsSlinky.activexWord.Word.Tables = js.native
  
  var TwoLinesInOne: WdTwoLinesInOneType = js.native
  
  var Underline: WdUnderline = js.native
  
  val Updates: CoAuthUpdates = js.native
  
  def WholeStory(): Unit = js.native
  
  @JSName("Word.Range_typekey")
  var WordDotRange_typekey: Range = js.native
  
  val WordOpenXML: String = js.native
  
  val Words: typingsSlinky.activexWord.Word.Words = js.native
  
  /** @param boolean [DataOnly=false] */
  def XML(): String = js.native
  def XML(DataOnly: Boolean): String = js.native
  
  val XMLNodes: typingsSlinky.activexWord.Word.XMLNodes = js.native
  
  val XMLParentNode: XMLNode = js.native
}
