package typingsSlinky.activexDashPowerpoint.PowerPoint

import typingsSlinky.activexDashOffice.Office.MsoBackgroundStyleIndex
import typingsSlinky.activexDashOffice.Office.OfficeTheme
import typingsSlinky.activexDashOffice.Office.Script
import typingsSlinky.activexDashOffice.Office.Scripts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Master")
@js.native
class Master protected () extends js.Object {
  val Application: typingsSlinky.activexDashPowerpoint.PowerPoint.Application = js.native
  val Background: ShapeRange = js.native
  var BackgroundStyle: MsoBackgroundStyleIndex = js.native
  var ColorScheme: typingsSlinky.activexDashPowerpoint.PowerPoint.ColorScheme = js.native
  val CustomLayouts: typingsSlinky.activexDashPowerpoint.PowerPoint.CustomLayouts = js.native
  val CustomerData: typingsSlinky.activexDashPowerpoint.PowerPoint.CustomerData = js.native
  val Design: typingsSlinky.activexDashPowerpoint.PowerPoint.Design = js.native
  val HeadersFooters: typingsSlinky.activexDashPowerpoint.PowerPoint.HeadersFooters = js.native
  val Height: Double = js.native
  val Hyperlinks: typingsSlinky.activexDashPowerpoint.PowerPoint.Hyperlinks = js.native
  var Name: String = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.Master_typekey`: Master = js.native
  @JSName("Scripts")
  val Scripts_Original: Scripts = js.native
  val Shapes: typingsSlinky.activexDashPowerpoint.PowerPoint.Shapes = js.native
  val SlideShowTransition: typingsSlinky.activexDashPowerpoint.PowerPoint.SlideShowTransition = js.native
  val TextStyles: typingsSlinky.activexDashPowerpoint.PowerPoint.TextStyles = js.native
  val Theme: OfficeTheme = js.native
  val TimeLine: typingsSlinky.activexDashPowerpoint.PowerPoint.TimeLine = js.native
  val Width: Double = js.native
  def ApplyTheme(themeName: String): Unit = js.native
  def Delete(): Unit = js.native
  def Scripts(Index: js.Any): Script = js.native
}

