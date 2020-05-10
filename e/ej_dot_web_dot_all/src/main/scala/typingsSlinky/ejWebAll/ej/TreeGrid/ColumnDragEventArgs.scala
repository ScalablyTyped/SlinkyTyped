package typingsSlinky.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnDragEventArgs extends js.Object {
  /** Returns that we can drop over the column or not.
    */
  var canDrop: js.UndefOr[Boolean] = js.native
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** Returns the column data which is dragged
    */
  var draggedColumn: js.UndefOr[js.Any] = js.native
  /** Returns the index of the column being dragged
    */
  var draggedColumnIndex: js.UndefOr[Double] = js.native
  /** Returns the control model values.
    */
  var model: js.UndefOr[js.Any] = js.native
  /** Returns the target column data
    */
  var targetColumn: js.UndefOr[js.Any] = js.native
  /** Returns the index of the target column
    */
  var targetColumnIndex: js.UndefOr[Double] = js.native
  /** Returns the event Type.
    */
  var `type`: js.UndefOr[String] = js.native
}

object ColumnDragEventArgs {
  @scala.inline
  def apply(): ColumnDragEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnDragEventArgs]
  }
  @scala.inline
  implicit class ColumnDragEventArgsOps[Self <: ColumnDragEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanDrop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canDrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canDrop")(js.undefined)
        ret
    }
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
    def withDraggedColumn(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggedColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggedColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggedColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggedColumnIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggedColumnIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggedColumnIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggedColumnIndex")(js.undefined)
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
    @scala.inline
    def withTargetColumn(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetColumnIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetColumnIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetColumnIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetColumnIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

