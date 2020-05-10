package typingsSlinky.officeUiFabricReact.detailsListTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColumnDragDropDetails extends js.Object {
  /**
    * Specifies the source column index
    * @defaultvalue -1
    */
  var draggedIndex: Double = js.native
  /**
    * Specifies the target column index
    * @defaultvalue -1
    */
  var targetIndex: Double = js.native
}

object IColumnDragDropDetails {
  @scala.inline
  def apply(draggedIndex: Double, targetIndex: Double): IColumnDragDropDetails = {
    val __obj = js.Dynamic.literal(draggedIndex = draggedIndex.asInstanceOf[js.Any], targetIndex = targetIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColumnDragDropDetails]
  }
  @scala.inline
  implicit class IColumnDragDropDetailsOps[Self <: IColumnDragDropDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDraggedIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggedIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

