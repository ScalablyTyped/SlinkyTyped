package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropTargetAreaOptions extends js.Object {
  var dragenter: js.UndefOr[js.Function1[/* e */ DropTargetAreaDragenterEvent, Unit]] = js.native
  var dragleave: js.UndefOr[js.Function1[/* e */ DropTargetAreaDragleaveEvent, Unit]] = js.native
  var drop: js.UndefOr[js.Function1[/* e */ DropTargetAreaDropEvent, Unit]] = js.native
  var filter: js.UndefOr[String] = js.native
  var group: js.UndefOr[String] = js.native
}

object DropTargetAreaOptions {
  @scala.inline
  def apply(): DropTargetAreaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropTargetAreaOptions]
  }
  @scala.inline
  implicit class DropTargetAreaOptionsOps[Self <: DropTargetAreaOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDragenter(value: /* e */ DropTargetAreaDragenterEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragenter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDragenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragenter")(js.undefined)
        ret
    }
    @scala.inline
    def withDragleave(value: /* e */ DropTargetAreaDragleaveEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragleave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDragleave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragleave")(js.undefined)
        ret
    }
    @scala.inline
    def withDrop(value: /* e */ DropTargetAreaDropEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
  }
  
}

