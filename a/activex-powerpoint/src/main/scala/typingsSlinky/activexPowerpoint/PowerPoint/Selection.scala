package typingsSlinky.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Selection")
@js.native
class Selection protected () extends js.Object {
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  val ChildShapeRange: typingsSlinky.activexPowerpoint.PowerPoint.ShapeRange = js.native
  val HasChildShapeRange: Boolean = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.Selection_typekey")
  var PowerPointDotSelection_typekey: Selection = js.native
  val ShapeRange: typingsSlinky.activexPowerpoint.PowerPoint.ShapeRange = js.native
  val SlideRange: typingsSlinky.activexPowerpoint.PowerPoint.SlideRange = js.native
  val TextRange: typingsSlinky.activexPowerpoint.PowerPoint.TextRange = js.native
  val TextRange2: typingsSlinky.activexOffice.Office.TextRange2 = js.native
  val Type: PpSelectionType = js.native
  def Copy(): Unit = js.native
  def Cut(): Unit = js.native
  def Delete(): Unit = js.native
  def Unselect(): Unit = js.native
}

