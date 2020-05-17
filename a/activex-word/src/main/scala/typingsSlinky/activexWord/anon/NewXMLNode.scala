package typingsSlinky.activexWord.anon

import typingsSlinky.activexWord.Word.Selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewXMLNode extends js.Object {
  val NewXMLNode: typingsSlinky.activexWord.Word.XMLNode = js.native
  val OldXMLNode: typingsSlinky.activexWord.Word.XMLNode = js.native
  val Reason: Double = js.native
  val Sel: Selection = js.native
}

object NewXMLNode {
  @scala.inline
  def apply(
    NewXMLNode: typingsSlinky.activexWord.Word.XMLNode,
    OldXMLNode: typingsSlinky.activexWord.Word.XMLNode,
    Reason: Double,
    Sel: Selection
  ): NewXMLNode = {
    val __obj = js.Dynamic.literal(NewXMLNode = NewXMLNode.asInstanceOf[js.Any], OldXMLNode = OldXMLNode.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any], Sel = Sel.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewXMLNode]
  }
  @scala.inline
  implicit class NewXMLNodeOps[Self <: NewXMLNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewXMLNode(value: typingsSlinky.activexWord.Word.XMLNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewXMLNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldXMLNode(value: typingsSlinky.activexWord.Word.XMLNode): Self = {
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

