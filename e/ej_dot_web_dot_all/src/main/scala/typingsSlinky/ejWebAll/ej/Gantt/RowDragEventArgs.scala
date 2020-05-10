package typingsSlinky.ejWebAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowDragEventArgs extends js.Object {
  /** Returns that we can drop over that record or not.
    */
  var canDrop: js.UndefOr[Boolean] = js.native
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** Returns the row which we start to drag.
    */
  var draggedRow: js.UndefOr[js.Any] = js.native
  /** Returns the row index which we start to drag.
    */
  var draggedRowIndex: js.UndefOr[Double] = js.native
  /** Returns the drop position value on current target row.
    */
  var dropPosition: js.UndefOr[String] = js.native
  /** Returns the Gantt model.
    */
  var model: js.UndefOr[js.Any] = js.native
  /** Returns request type.
    */
  var requestType: js.UndefOr[String] = js.native
  /** Duration is rounded off when it is set true.
    */
  var roundOffDuration: js.UndefOr[Boolean] = js.native
  /** Returns the row on which we are dragging.
    */
  var targetRow: js.UndefOr[js.Any] = js.native
  /** Returns the row index on which we are dragging.
    */
  var targetRowIndex: js.UndefOr[Double] = js.native
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}

object RowDragEventArgs {
  @scala.inline
  def apply(): RowDragEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowDragEventArgs]
  }
  @scala.inline
  implicit class RowDragEventArgsOps[Self <: RowDragEventArgs] (val x: Self) extends AnyVal {
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
    def withDraggedRow(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggedRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggedRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggedRow")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggedRowIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggedRowIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggedRowIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggedRowIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withDropPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropPosition")(js.undefined)
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
    def withRequestType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestType")(js.undefined)
        ret
    }
    @scala.inline
    def withRoundOffDuration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundOffDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoundOffDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundOffDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetRow(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetRow")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetRowIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetRowIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetRowIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetRowIndex")(js.undefined)
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

