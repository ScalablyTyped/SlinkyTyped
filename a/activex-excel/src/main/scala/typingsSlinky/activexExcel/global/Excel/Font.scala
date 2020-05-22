package typingsSlinky.activexExcel.global.Excel

import typingsSlinky.activexExcel.Excel.XlBackground
import typingsSlinky.activexExcel.Excel.XlColorIndex
import typingsSlinky.activexExcel.Excel.XlCreator
import typingsSlinky.activexExcel.Excel.XlRgbColor
import typingsSlinky.activexExcel.Excel.XlThemeColor
import typingsSlinky.activexExcel.Excel.XlThemeFont
import typingsSlinky.activexExcel.Excel.XlUnderlineStyle
import typingsSlinky.activexExcel.activexExcelStrings.Bold
import typingsSlinky.activexExcel.activexExcelStrings.Italic
import typingsSlinky.activexExcel.activexExcelStrings.Regular
import typingsSlinky.activexExcel.activexExcelStrings.`Bold Italic`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Font")
@js.native
class Font protected ()
  extends typingsSlinky.activexExcel.Excel.Font {
  /* CompleteClass */
  override val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  /* CompleteClass */
  override var Background: XlBackground = js.native
  /* CompleteClass */
  override var Bold: Boolean = js.native
  /* CompleteClass */
  override var Color: XlRgbColor | Double = js.native
  /* CompleteClass */
  override var ColorIndex: Double | XlColorIndex = js.native
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  /* CompleteClass */
  @JSName("Excel.Font_typekey")
  override var ExcelDotFont_typekey: typingsSlinky.activexExcel.Excel.Font = js.native
  /* CompleteClass */
  override var FontStyle: Regular | Italic | Bold | (`Bold Italic`) = js.native
  /* CompleteClass */
  override var Italic: Boolean = js.native
  /* CompleteClass */
  override var Name: String = js.native
  /* CompleteClass */
  override var OutlineFont: js.Any = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var Shadow: js.Any = js.native
  /* CompleteClass */
  override var Size: Double = js.native
  /* CompleteClass */
  override var Strikethrough: Boolean = js.native
  /* CompleteClass */
  override var Subscript: Boolean = js.native
  /* CompleteClass */
  override var Superscript: Boolean = js.native
  /* CompleteClass */
  override var ThemeColor: XlThemeColor = js.native
  /* CompleteClass */
  override var ThemeFont: XlThemeFont = js.native
  /* CompleteClass */
  override var TintAndShade: Double = js.native
  /* CompleteClass */
  override var Underline: XlUnderlineStyle = js.native
}

