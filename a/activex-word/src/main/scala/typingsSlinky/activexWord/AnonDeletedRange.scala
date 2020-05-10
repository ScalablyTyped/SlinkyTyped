package typingsSlinky.activexWord

import typingsSlinky.activexWord.Word.Range
import typingsSlinky.activexWord.Word.XMLNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDeletedRange extends js.Object {
  val DeletedRange: Range = js.native
  val InUndoRedo: Boolean = js.native
  val OldXMLNode: XMLNode = js.native
}

object AnonDeletedRange {
  @scala.inline
  def apply(DeletedRange: Range, InUndoRedo: Boolean, OldXMLNode: XMLNode): AnonDeletedRange = {
    val __obj = js.Dynamic.literal(DeletedRange = DeletedRange.asInstanceOf[js.Any], InUndoRedo = InUndoRedo.asInstanceOf[js.Any], OldXMLNode = OldXMLNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDeletedRange]
  }
  @scala.inline
  implicit class AnonDeletedRangeOps[Self <: AnonDeletedRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeletedRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeletedRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInUndoRedo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InUndoRedo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldXMLNode(value: XMLNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OldXMLNode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

