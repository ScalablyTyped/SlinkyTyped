package typingsSlinky.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BPMNDiagram extends TypeDerived {
  var labelStyle: BPMNLabelStyle = js.native
  var plane: BPMNPlane = js.native
}

object BPMNDiagram {
  @scala.inline
  def apply($parent: TypeDerived, $type: ElementType, labelStyle: BPMNLabelStyle, plane: BPMNPlane): BPMNDiagram = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], labelStyle = labelStyle.asInstanceOf[js.Any], plane = plane.asInstanceOf[js.Any])
    __obj.asInstanceOf[BPMNDiagram]
  }
  @scala.inline
  implicit class BPMNDiagramOps[Self <: BPMNDiagram] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabelStyle(value: BPMNLabelStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlane(value: BPMNPlane): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plane")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

