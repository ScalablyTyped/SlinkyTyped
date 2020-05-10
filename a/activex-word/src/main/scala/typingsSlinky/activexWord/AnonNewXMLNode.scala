package typingsSlinky.activexWord

import typingsSlinky.activexWord.Word.Selection
import typingsSlinky.activexWord.Word.XMLNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNewXMLNode extends js.Object {
  val NewXMLNode: XMLNode = js.native
  val OldXMLNode: XMLNode = js.native
  val Reason: Double = js.native
  val Sel: Selection = js.native
}

object AnonNewXMLNode {
  @scala.inline
  def apply(NewXMLNode: XMLNode, OldXMLNode: XMLNode, Reason: Double, Sel: Selection): AnonNewXMLNode = {
    val __obj = js.Dynamic.literal(NewXMLNode = NewXMLNode.asInstanceOf[js.Any], OldXMLNode = OldXMLNode.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any], Sel = Sel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNewXMLNode]
  }
  @scala.inline
  implicit class AnonNewXMLNodeOps[Self <: AnonNewXMLNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewXMLNode(value: XMLNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewXMLNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldXMLNode(value: XMLNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OldXMLNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReason(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSel(value: Selection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

