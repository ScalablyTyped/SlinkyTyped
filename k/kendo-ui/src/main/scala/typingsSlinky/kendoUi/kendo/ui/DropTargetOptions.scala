package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropTargetOptions extends js.Object {
  var dragenter: js.UndefOr[js.Function1[/* e */ DropTargetDragenterEvent, Unit]] = js.native
  var dragleave: js.UndefOr[js.Function1[/* e */ DropTargetDragleaveEvent, Unit]] = js.native
  var drop: js.UndefOr[js.Function1[/* e */ DropTargetDropEvent, Unit]] = js.native
  var group: js.UndefOr[String] = js.native
}

object DropTargetOptions {
  @scala.inline
  def apply(): DropTargetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropTargetOptions]
  }
  @scala.inline
  implicit class DropTargetOptionsOps[Self <: DropTargetOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDragenter(value: /* e */ DropTargetDragenterEvent => Unit): Self = {
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
    def withDragleave(value: /* e */ DropTargetDragleaveEvent => Unit): Self = {
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
    def withDrop(value: /* e */ DropTargetDropEvent => Unit): Self = {
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

