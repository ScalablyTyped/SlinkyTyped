package typingsSlinky.activexWord.Word

import typingsSlinky.activexOffice.Office.CommandBar
import typingsSlinky.activexOffice.Office.CommandBars
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Global extends StObject {
  
  val ActiveDocument: Document = js.native
  
  var ActivePrinter: String = js.native
  
  val ActiveProtectedViewWindow: ProtectedViewWindow = js.native
  
  val ActiveWindow: Window = js.native
  
  val AddIns: typingsSlinky.activexWord.Word.AddIns = js.native
  
  val AnswerWizard: typingsSlinky.activexOffice.Office.AnswerWizard = js.native
  
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  
  val Assistant: typingsSlinky.activexOffice.Office.Assistant = js.native
  
  val AutoCaptions: typingsSlinky.activexWord.Word.AutoCaptions = js.native
  
  val AutoCorrect: typingsSlinky.activexWord.Word.AutoCorrect = js.native
  
  val AutoCorrectEmail: typingsSlinky.activexWord.Word.AutoCorrect = js.native
  
  def BuildKeyCode(Arg1: WdKey): Double = js.native
  def BuildKeyCode(Arg1: WdKey, Arg2: js.UndefOr[scala.Nothing], Arg3: js.UndefOr[scala.Nothing], Arg4: js.Any): Double = js.native
  def BuildKeyCode(Arg1: WdKey, Arg2: js.UndefOr[scala.Nothing], Arg3: js.Any): Double = js.native
  def BuildKeyCode(Arg1: WdKey, Arg2: js.UndefOr[scala.Nothing], Arg3: js.Any, Arg4: js.Any): Double = js.native
  def BuildKeyCode(Arg1: WdKey, Arg2: js.Any): Double = js.native
  def BuildKeyCode(Arg1: WdKey, Arg2: js.Any, Arg3: js.UndefOr[scala.Nothing], Arg4: js.Any): Double = js.native
  def BuildKeyCode(Arg1: WdKey, Arg2: js.Any, Arg3: js.Any): Double = js.native
  def BuildKeyCode(Arg1: WdKey, Arg2: js.Any, Arg3: js.Any, Arg4: js.Any): Double = js.native
  
  val CaptionLabels: typingsSlinky.activexWord.Word.CaptionLabels = js.native
  
  def CentimetersToPoints(Centimeters: Double): Double = js.native
  
  def ChangeFileOpenDirectory(Path: String): Unit = js.native
  
  def CheckSpelling(
    Word: String,
    CustomDictionary: js.UndefOr[js.Any],
    IgnoreUppercase: js.UndefOr[js.Any],
    MainDictionary: js.UndefOr[js.Any],
    CustomDictionary2: js.UndefOr[js.Any],
    CustomDictionary3: js.UndefOr[js.Any],
    CustomDictionary4: js.UndefOr[js.Any],
    CustomDictionary5: js.UndefOr[js.Any],
    CustomDictionary6: js.UndefOr[js.Any],
    CustomDictionary7: js.UndefOr[js.Any],
    CustomDictionary8: js.UndefOr[js.Any],
    CustomDictionary9: js.UndefOr[js.Any],
    CustomDictionary10: js.UndefOr[js.Any]
  ): Boolean = js.native
  
  def CleanString(String: String): String = js.native
  
  def CommandBars(Index: String): CommandBar = js.native
  def CommandBars(Index: Double): CommandBar = js.native
  @JSName("CommandBars")
  val CommandBars_Original: CommandBars = js.native
  
  val Creator: Double = js.native
  
  val CustomDictionaries: Dictionaries = js.native
  
  var CustomizationContext: js.Any = js.native
  
  def DDEExecute(Channel: Double, Command: String): Unit = js.native
  
  def DDEInitiate(App: String, Topic: String): Double = js.native
  
  def DDEPoke(Channel: Double, Item: String, Data: String): Unit = js.native
  
  def DDERequest(Channel: Double, Item: String): String = js.native
  
  def DDETerminate(Channel: Double): Unit = js.native
  
  def DDETerminateAll(): Unit = js.native
  
  val Dialogs: typingsSlinky.activexWord.Word.Dialogs = js.native
  
  val Documents: typingsSlinky.activexWord.Word.Documents = js.native
  
  val FileConverters: typingsSlinky.activexWord.Word.FileConverters = js.native
  
  def FindKey(KeyCode: Double): KeyBinding = js.native
  def FindKey(KeyCode: Double, KeyCode2: js.Any): KeyBinding = js.native
  
  val FontNames: typingsSlinky.activexWord.Word.FontNames = js.native
  
  def GetSpellingSuggestions(
    Word: String,
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
  
  val HangulHanjaDictionaries: HangulHanjaConversionDictionaries = js.native
  
  def Help(HelpType: js.Any): Unit = js.native
  
  def InchesToPoints(Inches: Double): Double = js.native
  
  def IsObjectValid(Object: js.Any): Boolean = js.native
  
  val IsSandboxed: Boolean = js.native
  
  val KeyBindings: typingsSlinky.activexWord.Word.KeyBindings = js.native
  
  def KeyString(KeyCode: Double): String = js.native
  def KeyString(KeyCode: Double, KeyCode2: js.Any): String = js.native
  
  def KeysBoundTo(KeyCategory: WdKeyCategory, Command: String): typingsSlinky.activexWord.Word.KeysBoundTo = js.native
  def KeysBoundTo(KeyCategory: WdKeyCategory, Command: String, CommandParameter: js.Any): typingsSlinky.activexWord.Word.KeysBoundTo = js.native
  
  val LandscapeFontNames: typingsSlinky.activexWord.Word.FontNames = js.native
  
  val LanguageSettings: typingsSlinky.activexOffice.Office.LanguageSettings = js.native
  
  val Languages: typingsSlinky.activexWord.Word.Languages = js.native
  
  def LinesToPoints(Lines: Double): Double = js.native
  
  val ListGalleries: typingsSlinky.activexWord.Word.ListGalleries = js.native
  
  val MacroContainer: js.Any = js.native
  
  def MillimetersToPoints(Millimeters: Double): Double = js.native
  
  val Name: String = js.native
  
  def NewWindow(): Window = js.native
  
  val NormalTemplate: Template = js.native
  
  val Options: typingsSlinky.activexWord.Word.Options = js.native
  
  val Parent: js.Any = js.native
  
  def PicasToPoints(Picas: Double): Double = js.native
  
  def PixelsToPoints(Pixels: Double): Double = js.native
  def PixelsToPoints(Pixels: Double, fVertical: js.Any): Double = js.native
  
  def PointsToCentimeters(Points: Double): Double = js.native
  
  def PointsToInches(Points: Double): Double = js.native
  
  def PointsToLines(Points: Double): Double = js.native
  
  def PointsToMillimeters(Points: Double): Double = js.native
  
  def PointsToPicas(Points: Double): Double = js.native
  
  def PointsToPixels(Points: Double): Double = js.native
  def PointsToPixels(Points: Double, fVertical: js.Any): Double = js.native
  
  val PortraitFontNames: typingsSlinky.activexWord.Word.FontNames = js.native
  
  var PrintPreview: Boolean = js.native
  
  val ProtectedViewWindows: typingsSlinky.activexWord.Word.ProtectedViewWindows = js.native
  
  val RecentFiles: typingsSlinky.activexWord.Word.RecentFiles = js.native
  
  def Repeat(): Boolean = js.native
  def Repeat(Times: js.Any): Boolean = js.native
  
  val Selection: typingsSlinky.activexWord.Word.Selection = js.native
  
  var ShowVisualBasicEditor: Boolean = js.native
  
  val StatusBar: String = js.native
  
  def SynonymInfo(Word: String): typingsSlinky.activexWord.Word.SynonymInfo = js.native
  def SynonymInfo(Word: String, LanguageID: js.Any): typingsSlinky.activexWord.Word.SynonymInfo = js.native
  
  val System: typingsSlinky.activexWord.Word.System = js.native
  
  val Tasks: typingsSlinky.activexWord.Word.Tasks = js.native
  
  val Templates: typingsSlinky.activexWord.Word.Templates = js.native
  
  val VBE: typingsSlinky.activexVbide.VBIDE.VBE = js.native
  
  val Windows: typingsSlinky.activexWord.Word.Windows = js.native
  
  val WordBasic: js.Any = js.native
  
  @JSName("Word.Global_typekey")
  var WordDotGlobal_typekey: Global = js.native
}
