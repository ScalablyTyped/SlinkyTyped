package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.MsoDiagramType
import typingsSlinky.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Diagram extends js.Object {
  val Application: js.Any = js.native
  var AutoFormat: MsoTriState = js.native
  var AutoLayout: MsoTriState = js.native
  val Creator: Double = js.native
  val Nodes: DiagramNodes = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.Diagram_typekey")
  var PowerPointDotDiagram_typekey: Diagram = js.native
  var Reverse: MsoTriState = js.native
  val Type: MsoDiagramType = js.native
  def Convert(Type: MsoDiagramType): Unit = js.native
  def FitText(): Unit = js.native
}

object Diagram {
  @scala.inline
  def apply(
    Application: js.Any,
    AutoFormat: MsoTriState,
    AutoLayout: MsoTriState,
    Convert: MsoDiagramType => Unit,
    Creator: Double,
    FitText: () => Unit,
    Nodes: DiagramNodes,
    Parent: js.Any,
    PowerPointDotDiagram_typekey: Diagram,
    Reverse: MsoTriState,
    Type: MsoDiagramType
  ): Diagram = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoFormat = AutoFormat.asInstanceOf[js.Any], AutoLayout = AutoLayout.asInstanceOf[js.Any], Convert = js.Any.fromFunction1(Convert), Creator = Creator.asInstanceOf[js.Any], FitText = js.Any.fromFunction0(FitText), Nodes = Nodes.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Reverse = Reverse.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Diagram_typekey")(PowerPointDotDiagram_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Diagram]
  }
  @scala.inline
  implicit class DiagramOps[Self <: Diagram] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoFormat(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoLayout(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConvert(value: MsoDiagramType => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Convert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFitText(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FitText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNodes(value: DiagramNodes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Nodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerPointDotDiagram_typekey(value: Diagram): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.Diagram_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReverse(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reverse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: MsoDiagramType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

