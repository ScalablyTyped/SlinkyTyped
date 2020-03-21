package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.MsoBackgroundStyleIndex
import typingsSlinky.activexOffice.Office.OfficeTheme
import typingsSlinky.activexOffice.Office.Script
import typingsSlinky.activexOffice.Office.Scripts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Master")
@js.native
class Master protected () extends js.Object {
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  val Background: ShapeRange = js.native
  var BackgroundStyle: MsoBackgroundStyleIndex = js.native
  var ColorScheme: typingsSlinky.activexPowerpoint.PowerPoint.ColorScheme = js.native
  val CustomLayouts: typingsSlinky.activexPowerpoint.PowerPoint.CustomLayouts = js.native
  val CustomerData: typingsSlinky.activexPowerpoint.PowerPoint.CustomerData = js.native
  val Design: typingsSlinky.activexPowerpoint.PowerPoint.Design = js.native
  val HeadersFooters: typingsSlinky.activexPowerpoint.PowerPoint.HeadersFooters = js.native
  val Height: Double = js.native
  val Hyperlinks: typingsSlinky.activexPowerpoint.PowerPoint.Hyperlinks = js.native
  var Name: String = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.Master_typekey")
  var PowerPointDotMaster_typekey: Master = js.native
  @JSName("Scripts")
  val Scripts_Original: Scripts = js.native
  val Shapes: typingsSlinky.activexPowerpoint.PowerPoint.Shapes = js.native
  val SlideShowTransition: typingsSlinky.activexPowerpoint.PowerPoint.SlideShowTransition = js.native
  val TextStyles: typingsSlinky.activexPowerpoint.PowerPoint.TextStyles = js.native
  val Theme: OfficeTheme = js.native
  val TimeLine: typingsSlinky.activexPowerpoint.PowerPoint.TimeLine = js.native
  val Width: Double = js.native
  def ApplyTheme(themeName: String): Unit = js.native
  def Delete(): Unit = js.native
  def Scripts(Index: js.Any): Script = js.native
}

