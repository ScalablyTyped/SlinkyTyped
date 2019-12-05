package typingsSlinky.activexDashPowerpoint.PowerPoint

import typingsSlinky.activexDashOffice.Office.MsoThemeColorSchemeIndex
import typingsSlinky.activexDashOffice.Office.MsoTriState
import typingsSlinky.activexDashOffice.Office.ThemeColor
import typingsSlinky.activexDashOffice.Office.ThemeColorScheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.CustomLayout")
@js.native
class CustomLayout protected () extends js.Object {
  val Application: typingsSlinky.activexDashPowerpoint.PowerPoint.Application = js.native
  val Background: ShapeRange = js.native
  val CustomerData: typingsSlinky.activexDashPowerpoint.PowerPoint.CustomerData = js.native
  val Design: typingsSlinky.activexDashPowerpoint.PowerPoint.Design = js.native
  var DisplayMasterShapes: MsoTriState = js.native
  var FollowMasterBackground: MsoTriState = js.native
  val HeadersFooters: typingsSlinky.activexDashPowerpoint.PowerPoint.HeadersFooters = js.native
  val Height: Double = js.native
  val Hyperlinks: typingsSlinky.activexDashPowerpoint.PowerPoint.Hyperlinks = js.native
  val Index: Double = js.native
  var MatchingName: String = js.native
  var Name: String = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.CustomLayout_typekey`: CustomLayout = js.native
  var Preserved: MsoTriState = js.native
  val Shapes: typingsSlinky.activexDashPowerpoint.PowerPoint.Shapes = js.native
  val SlideShowTransition: typingsSlinky.activexDashPowerpoint.PowerPoint.SlideShowTransition = js.native
  @JSName("ThemeColorScheme")
  val ThemeColorScheme_Original: ThemeColorScheme = js.native
  val TimeLine: typingsSlinky.activexDashPowerpoint.PowerPoint.TimeLine = js.native
  val Width: Double = js.native
  def Copy(): Unit = js.native
  def Cut(): Unit = js.native
  def Delete(): Unit = js.native
  def Duplicate(): CustomLayout = js.native
  def MoveTo(toPos: Double): Unit = js.native
  def Select(): Unit = js.native
  def ThemeColorScheme(Index: MsoThemeColorSchemeIndex): ThemeColor = js.native
}

