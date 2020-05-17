package typingsSlinky.activexOffice.anon

import typingsSlinky.activexOffice.Office.CustomXMLNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OldNode extends js.Object {
  val InUndoRedo: Boolean = js.native
  val NewNode: CustomXMLNode = js.native
  val OldNode: CustomXMLNode = js.native
}

object OldNode {
  @scala.inline
  def apply(InUndoRedo: Boolean, NewNode: CustomXMLNode, OldNode: CustomXMLNode): OldNode = {
    val __obj = js.Dynamic.literal(InUndoRedo = InUndoRedo.asInstanceOf[js.Any], NewNode = NewNode.asInstanceOf[js.Any], OldNode = OldNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[OldNode]
  }
  @scala.inline
  implicit class OldNodeOps[Self <: OldNode] (val x: Self) extends AnyVal {
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
    def withNewNode(value: CustomXMLNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldNode(value: CustomXMLNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OldNode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

