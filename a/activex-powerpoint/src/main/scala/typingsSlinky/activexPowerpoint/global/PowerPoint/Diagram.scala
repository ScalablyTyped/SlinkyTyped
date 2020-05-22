package typingsSlinky.activexPowerpoint.global.PowerPoint

import typingsSlinky.activexOffice.Office.MsoDiagramType
import typingsSlinky.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Diagram")
@js.native
class Diagram protected ()
  extends typingsSlinky.activexPowerpoint.PowerPoint.Diagram {
  /* CompleteClass */
  override val Application: js.Any = js.native
  /* CompleteClass */
  override var AutoFormat: MsoTriState = js.native
  /* CompleteClass */
  override var AutoLayout: MsoTriState = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override val Nodes: typingsSlinky.activexPowerpoint.PowerPoint.DiagramNodes = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  @JSName("PowerPoint.Diagram_typekey")
  override var PowerPointDotDiagram_typekey: typingsSlinky.activexPowerpoint.PowerPoint.Diagram = js.native
  /* CompleteClass */
  override var Reverse: MsoTriState = js.native
  /* CompleteClass */
  override val Type: MsoDiagramType = js.native
  /* CompleteClass */
  override def Convert(Type: MsoDiagramType): Unit = js.native
  /* CompleteClass */
  override def FitText(): Unit = js.native
}

