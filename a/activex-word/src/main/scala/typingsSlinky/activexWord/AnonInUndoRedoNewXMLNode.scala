package typingsSlinky.activexWord

import typingsSlinky.activexWord.Word.XMLNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInUndoRedoNewXMLNode extends js.Object {
  val InUndoRedo: Boolean = js.native
  val NewXMLNode: XMLNode = js.native
}

object AnonInUndoRedoNewXMLNode {
  @scala.inline
  def apply(InUndoRedo: Boolean, NewXMLNode: XMLNode): AnonInUndoRedoNewXMLNode = {
    val __obj = js.Dynamic.literal(InUndoRedo = InUndoRedo.asInstanceOf[js.Any], NewXMLNode = NewXMLNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInUndoRedoNewXMLNode]
  }
  @scala.inline
  implicit class AnonInUndoRedoNewXMLNodeOps[Self <: AnonInUndoRedoNewXMLNode] (val x: Self) extends AnyVal {
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
    def withNewXMLNode(value: XMLNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewXMLNode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

