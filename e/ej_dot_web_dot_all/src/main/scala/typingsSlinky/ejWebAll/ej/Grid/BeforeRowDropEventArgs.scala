package typingsSlinky.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeforeRowDropEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** Returns the dragged record details
    */
  var draggedRecords: js.UndefOr[js.Any] = js.native
  /** Returns the drop details
    */
  var dropDetails: js.UndefOr[js.Any] = js.native
  /** Returns the targeted row.
    */
  var target: js.UndefOr[js.Any] = js.native
  /** Returns the targeted row index.
    */
  var targetIndex: js.UndefOr[js.Any] = js.native
}

object BeforeRowDropEventArgs {
  @scala.inline
  def apply(): BeforeRowDropEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeforeRowDropEventArgs]
  }
  @scala.inline
  implicit class BeforeRowDropEventArgsOps[Self <: BeforeRowDropEventArgs] (val x: Self) extends AnyVal {
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
    def withDraggedRecords(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggedRecords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggedRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggedRecords")(js.undefined)
        ret
    }
    @scala.inline
    def withDropDetails(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetIndex(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetIndex")(js.undefined)
        ret
    }
  }
  
}

