package typingsSlinky.activexExcel.global.Excel

import typingsSlinky.activexExcel.Excel.XlColorIndex
import typingsSlinky.activexExcel.Excel.XlCreator
import typingsSlinky.activexExcel.Excel.XlPattern
import typingsSlinky.activexExcel.Excel.XlRgbColor
import typingsSlinky.activexExcel.Excel.XlThemeColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Interior")
@js.native
class Interior protected ()
  extends typingsSlinky.activexExcel.Excel.Interior {
  /* CompleteClass */
  override val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  /* CompleteClass */
  override var Color: XlRgbColor | Double = js.native
  /* CompleteClass */
  override var ColorIndex: Double | XlColorIndex = js.native
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  /* CompleteClass */
  @JSName("Excel.Interior_typekey")
  override var ExcelDotInterior_typekey: typingsSlinky.activexExcel.Excel.Interior = js.native
  /* CompleteClass */
  override val Gradient: js.Any = js.native
  /* CompleteClass */
  override var InvertIfNegative: Boolean = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var Pattern: XlPattern = js.native
  /* CompleteClass */
  override var PatternColor: XlRgbColor | Double = js.native
  /* CompleteClass */
  override var PatternColorIndex: Double | XlColorIndex = js.native
  /* CompleteClass */
  override var PatternThemeColor: XlThemeColor = js.native
  /* CompleteClass */
  override var PatternTintAndShade: Double = js.native
  /* CompleteClass */
  override var ThemeColor: XlThemeColor = js.native
  /* CompleteClass */
  override var TintAndShade: Double = js.native
}

