package typingsSlinky.activexOffice

import typingsSlinky.activexOffice.Office.CustomXMLNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInUndoRedo extends js.Object {
  val InUndoRedo: Boolean = js.native
  val OldNextSibling: CustomXMLNode = js.native
  val OldNode: CustomXMLNode = js.native
  val OldParentNode: CustomXMLNode = js.native
}

object AnonInUndoRedo {
  @scala.inline
  def apply(
    InUndoRedo: Boolean,
    OldNextSibling: CustomXMLNode,
    OldNode: CustomXMLNode,
    OldParentNode: CustomXMLNode
  ): AnonInUndoRedo = {
    val __obj = js.Dynamic.literal(InUndoRedo = InUndoRedo.asInstanceOf[js.Any], OldNextSibling = OldNextSibling.asInstanceOf[js.Any], OldNode = OldNode.asInstanceOf[js.Any], OldParentNode = OldParentNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInUndoRedo]
  }
  @scala.inline
  implicit class AnonInUndoRedoOps[Self <: AnonInUndoRedo] (val x: Self) extends AnyVal {
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
    def withOldNextSibling(value: CustomXMLNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OldNextSibling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldNode(value: CustomXMLNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OldNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldParentNode(value: CustomXMLNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OldParentNode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

