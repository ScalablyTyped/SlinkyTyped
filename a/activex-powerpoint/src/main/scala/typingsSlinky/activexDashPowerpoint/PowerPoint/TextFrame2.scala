package typingsSlinky.activexDashPowerpoint.PowerPoint

import typingsSlinky.activexDashOffice.Office.MsoAutoSize
import typingsSlinky.activexDashOffice.Office.MsoHorizontalAnchor
import typingsSlinky.activexDashOffice.Office.MsoPathFormat
import typingsSlinky.activexDashOffice.Office.MsoPresetTextEffect
import typingsSlinky.activexDashOffice.Office.MsoTextOrientation
import typingsSlinky.activexDashOffice.Office.MsoTriState
import typingsSlinky.activexDashOffice.Office.MsoVerticalAnchor
import typingsSlinky.activexDashOffice.Office.MsoWarpFormat
import typingsSlinky.activexDashOffice.Office.Ruler2
import typingsSlinky.activexDashOffice.Office.TextColumn2
import typingsSlinky.activexDashOffice.Office.TextRange2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.TextFrame2")
@js.native
class TextFrame2 protected () extends js.Object {
  val Application: js.Any = js.native
  var AutoSize: MsoAutoSize = js.native
  val Column: TextColumn2 = js.native
  val Creator: Double = js.native
  val HasText: MsoTriState = js.native
  var HorizontalAnchor: MsoHorizontalAnchor = js.native
  var MarginBottom: Double = js.native
  var MarginLeft: Double = js.native
  var MarginRight: Double = js.native
  var MarginTop: Double = js.native
  var NoTextRotation: MsoTriState = js.native
  var Orientation: MsoTextOrientation = js.native
  val Parent: js.Any = js.native
  var PathFormat: MsoPathFormat = js.native
  @JSName("PowerPoint.TextFrame2_typekey")
  var PowerPointDotTextFrame2_typekey: TextFrame2 = js.native
  val Ruler: Ruler2 = js.native
  val TextRange: TextRange2 = js.native
  val ThreeD: ThreeDFormat = js.native
  var VerticalAnchor: MsoVerticalAnchor = js.native
  var WarpFormat: MsoWarpFormat = js.native
  var WordArtFormat: MsoPresetTextEffect = js.native
  var WordWrap: MsoTriState = js.native
  def DeleteText(): Unit = js.native
}

