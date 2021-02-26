package typingsSlinky.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogFrame extends StObject {
  
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  
  var Caption: String = js.native
  
  def Characters(): typingsSlinky.activexExcel.Excel.Characters = js.native
  def Characters(Start: js.UndefOr[scala.Nothing], Length: js.Any): typingsSlinky.activexExcel.Excel.Characters = js.native
  def Characters(Start: js.Any): typingsSlinky.activexExcel.Excel.Characters = js.native
  def Characters(Start: js.Any, Length: js.Any): typingsSlinky.activexExcel.Excel.Characters = js.native
  
  def CheckSpelling(): js.Any = js.native
  def CheckSpelling(
    CustomDictionary: js.UndefOr[scala.Nothing],
    IgnoreUppercase: js.UndefOr[scala.Nothing],
    AlwaysSuggest: js.UndefOr[scala.Nothing],
    SpellLang: js.Any
  ): js.Any = js.native
  def CheckSpelling(
    CustomDictionary: js.UndefOr[scala.Nothing],
    IgnoreUppercase: js.UndefOr[scala.Nothing],
    AlwaysSuggest: js.Any
  ): js.Any = js.native
  def CheckSpelling(
    CustomDictionary: js.UndefOr[scala.Nothing],
    IgnoreUppercase: js.UndefOr[scala.Nothing],
    AlwaysSuggest: js.Any,
    SpellLang: js.Any
  ): js.Any = js.native
  def CheckSpelling(CustomDictionary: js.UndefOr[scala.Nothing], IgnoreUppercase: js.Any): js.Any = js.native
  def CheckSpelling(
    CustomDictionary: js.UndefOr[scala.Nothing],
    IgnoreUppercase: js.Any,
    AlwaysSuggest: js.UndefOr[scala.Nothing],
    SpellLang: js.Any
  ): js.Any = js.native
  def CheckSpelling(CustomDictionary: js.UndefOr[scala.Nothing], IgnoreUppercase: js.Any, AlwaysSuggest: js.Any): js.Any = js.native
  def CheckSpelling(
    CustomDictionary: js.UndefOr[scala.Nothing],
    IgnoreUppercase: js.Any,
    AlwaysSuggest: js.Any,
    SpellLang: js.Any
  ): js.Any = js.native
  def CheckSpelling(CustomDictionary: js.Any): js.Any = js.native
  def CheckSpelling(
    CustomDictionary: js.Any,
    IgnoreUppercase: js.UndefOr[scala.Nothing],
    AlwaysSuggest: js.UndefOr[scala.Nothing],
    SpellLang: js.Any
  ): js.Any = js.native
  def CheckSpelling(CustomDictionary: js.Any, IgnoreUppercase: js.UndefOr[scala.Nothing], AlwaysSuggest: js.Any): js.Any = js.native
  def CheckSpelling(
    CustomDictionary: js.Any,
    IgnoreUppercase: js.UndefOr[scala.Nothing],
    AlwaysSuggest: js.Any,
    SpellLang: js.Any
  ): js.Any = js.native
  def CheckSpelling(CustomDictionary: js.Any, IgnoreUppercase: js.Any): js.Any = js.native
  def CheckSpelling(
    CustomDictionary: js.Any,
    IgnoreUppercase: js.Any,
    AlwaysSuggest: js.UndefOr[scala.Nothing],
    SpellLang: js.Any
  ): js.Any = js.native
  def CheckSpelling(CustomDictionary: js.Any, IgnoreUppercase: js.Any, AlwaysSuggest: js.Any): js.Any = js.native
  def CheckSpelling(CustomDictionary: js.Any, IgnoreUppercase: js.Any, AlwaysSuggest: js.Any, SpellLang: js.Any): js.Any = js.native
  
  /**
    * @param Appearance [Appearance=2]
    * @param Format [Format=-4147]
    */
  def CopyPicture(): js.Any = js.native
  def CopyPicture(Appearance: js.UndefOr[scala.Nothing], Format: XlCopyPictureFormat): js.Any = js.native
  def CopyPicture(Appearance: XlPictureAppearance): js.Any = js.native
  def CopyPicture(Appearance: XlPictureAppearance, Format: XlCopyPictureFormat): js.Any = js.native
  
  val Creator: XlCreator = js.native
  
  @JSName("Excel.DialogFrame_typekey")
  var ExcelDotDialogFrame_typekey: DialogFrame = js.native
  
  var Height: Double = js.native
  
  var Left: Double = js.native
  
  var Locked: Boolean = js.native
  
  var LockedText: Boolean = js.native
  
  var Name: String = js.native
  
  var OnAction: String = js.native
  
  val Parent: js.Any = js.native
  
  def Select(): js.Any = js.native
  def Select(Replace: js.Any): js.Any = js.native
  
  def ShapeRange(Index: String): Shape = js.native
  def ShapeRange(Index: Double): Shape = js.native
  @JSName("ShapeRange")
  val ShapeRange_Original: ShapeRange = js.native
  
  var Text: String = js.native
  
  var Top: Double = js.native
  
  var Width: Double = js.native
}
