package typingsSlinky.activexDashPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Selection")
@js.native
class Selection protected () extends js.Object {
  val Application: typingsSlinky.activexDashPowerpoint.PowerPoint.Application = js.native
  val ChildShapeRange: typingsSlinky.activexDashPowerpoint.PowerPoint.ShapeRange = js.native
  val HasChildShapeRange: Boolean = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.Selection_typekey")
  var PowerPointDotSelection_typekey: Selection = js.native
  val ShapeRange: typingsSlinky.activexDashPowerpoint.PowerPoint.ShapeRange = js.native
  val SlideRange: typingsSlinky.activexDashPowerpoint.PowerPoint.SlideRange = js.native
  val TextRange: typingsSlinky.activexDashPowerpoint.PowerPoint.TextRange = js.native
  val TextRange2: typingsSlinky.activexDashOffice.Office.TextRange2 = js.native
  val Type: PpSelectionType = js.native
  def Copy(): Unit = js.native
  def Cut(): Unit = js.native
  def Delete(): Unit = js.native
  def Unselect(): Unit = js.native
}

