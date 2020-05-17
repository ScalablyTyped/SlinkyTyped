package typingsSlinky.activexWord.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InUndoRedoNewXMLNode extends js.Object {
  val InUndoRedo: Boolean = js.native
  val NewXMLNode: typingsSlinky.activexWord.Word.XMLNode = js.native
}

object InUndoRedoNewXMLNode {
  @scala.inline
  def apply(InUndoRedo: Boolean, NewXMLNode: typingsSlinky.activexWord.Word.XMLNode): InUndoRedoNewXMLNode = {
    val __obj = js.Dynamic.literal(InUndoRedo = InUndoRedo.asInstanceOf[js.Any], NewXMLNode = NewXMLNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[InUndoRedoNewXMLNode]
  }
  @scala.inline
  implicit class InUndoRedoNewXMLNodeOps[Self <: InUndoRedoNewXMLNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInUndoRedo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InUndoRedo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewXMLNode(value: typingsSlinky.activexWord.Word.XMLNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewXMLNode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

