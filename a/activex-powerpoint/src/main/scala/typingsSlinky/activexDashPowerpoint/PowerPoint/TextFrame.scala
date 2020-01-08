package typingsSlinky.activexDashPowerpoint.PowerPoint

import typingsSlinky.activexDashOffice.Office.MsoHorizontalAnchor
import typingsSlinky.activexDashOffice.Office.MsoTextOrientation
import typingsSlinky.activexDashOffice.Office.MsoTriState
import typingsSlinky.activexDashOffice.Office.MsoVerticalAnchor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.TextFrame")
@js.native
class TextFrame protected () extends js.Object {
  val Application: js.Any = js.native
  var AutoSize: PpAutoSize = js.native
  val Creator: Double = js.native
  val HasText: MsoTriState = js.native
  var HorizontalAnchor: MsoHorizontalAnchor = js.native
  var MarginBottom: Double = js.native
  var MarginLeft: Double = js.native
  var MarginRight: Double = js.native
  var MarginTop: Double = js.native
  var Orientation: MsoTextOrientation = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.TextFrame_typekey")
  var PowerPointDotTextFrame_typekey: TextFrame = js.native
  val Ruler: typingsSlinky.activexDashPowerpoint.PowerPoint.Ruler = js.native
  val TextRange: typingsSlinky.activexDashPowerpoint.PowerPoint.TextRange = js.native
  var VerticalAnchor: MsoVerticalAnchor = js.native
  var WordWrap: MsoTriState = js.native
  def DeleteText(): Unit = js.native
}

