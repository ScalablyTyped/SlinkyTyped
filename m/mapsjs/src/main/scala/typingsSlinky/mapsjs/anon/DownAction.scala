package typingsSlinky.mapsjs.anon

import typingsSlinky.mapsjs.mod.point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownAction extends js.Object {
  var downAction: js.UndefOr[js.Function1[/* downPoint */ point, _]] = js.native
  var dragEnabled: Boolean = js.native
  var moveAction: js.UndefOr[js.Function1[/* movePoint */ point, Unit]] = js.native
  var upAction: js.UndefOr[js.Function1[/* upPoint */ point, Unit]] = js.native
  var useElementInsteadOfNewGestureOverlay: Boolean = js.native
  var wheelAction: js.UndefOr[js.Function1[/* delta */ Double, Unit]] = js.native
}

object DownAction {
  @scala.inline
  def apply(dragEnabled: Boolean, useElementInsteadOfNewGestureOverlay: Boolean): DownAction = {
    val __obj = js.Dynamic.literal(dragEnabled = dragEnabled.asInstanceOf[js.Any], useElementInsteadOfNewGestureOverlay = useElementInsteadOfNewGestureOverlay.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownAction]
  }
  @scala.inline
  implicit class DownActionOps[Self <: DownAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDragEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseElementInsteadOfNewGestureOverlay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useElementInsteadOfNewGestureOverlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDownAction(value: /* downPoint */ point => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downAction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDownAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downAction")(js.undefined)
        ret
    }
    @scala.inline
    def withMoveAction(value: /* movePoint */ point => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveAction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMoveAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveAction")(js.undefined)
        ret
    }
    @scala.inline
    def withUpAction(value: /* upPoint */ point => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upAction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUpAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upAction")(js.undefined)
        ret
    }
    @scala.inline
    def withWheelAction(value: /* delta */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheelAction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutWheelAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheelAction")(js.undefined)
        ret
    }
  }
  
}

