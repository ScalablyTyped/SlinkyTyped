package typingsSlinky.ejWebAll.ej.PivotSchemaDesigner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragMoveEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** returns the HTML element of the dragged field from PivotSchemaDesigner.
    */
  var dragTarget: js.UndefOr[js.Any] = js.native
  /** return the JSON details of the dragged field.
    */
  var draggedElementData: js.UndefOr[js.Any] = js.native
  /** returns the PivotSchemaDesigner model
    */
  var model: js.UndefOr[js.Any] = js.native
}

object DragMoveEventArgs {
  @scala.inline
  def apply(): DragMoveEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragMoveEventArgs]
  }
  @scala.inline
  implicit class DragMoveEventArgsOps[Self <: DragMoveEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.undefined)
        ret
    }
    @scala.inline
    def withDragTarget(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggedElementData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggedElementData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggedElementData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggedElementData")(js.undefined)
        ret
    }
    @scala.inline
    def withModel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(js.undefined)
        ret
    }
  }
  
}

