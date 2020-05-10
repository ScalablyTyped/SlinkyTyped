package typingsSlinky.ivViewer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Events extends js.Object {
  var hiResImageLoad: js.UndefOr[IVEvent] = js.native
  var imageLoad: js.UndefOr[IVEvent] = js.native
  var mouseEnterSnapView: js.UndefOr[IVEvent] = js.native
  var mouseLeaveSnapView: js.UndefOr[IVEvent] = js.native
  var onWindowResize: js.UndefOr[IVEvent] = js.native
  var pinchStart: js.UndefOr[IVEvent] = js.native
  var snapViewOnMouseMove: js.UndefOr[IVEvent] = js.native
}

object Events {
  @scala.inline
  def apply(): Events = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Events]
  }
  @scala.inline
  implicit class EventsOps[Self <: Events] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHiResImageLoad(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiResImageLoad")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutHiResImageLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiResImageLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withImageLoad(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageLoad")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutImageLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseEnterSnapView(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseEnterSnapView")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutMouseEnterSnapView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseEnterSnapView")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseLeaveSnapView(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseLeaveSnapView")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutMouseLeaveSnapView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseLeaveSnapView")(js.undefined)
        ret
    }
    @scala.inline
    def withOnWindowResize(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWindowResize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnWindowResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWindowResize")(js.undefined)
        ret
    }
    @scala.inline
    def withPinchStart(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinchStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutPinchStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinchStart")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapViewOnMouseMove(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapViewOnMouseMove")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSnapViewOnMouseMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapViewOnMouseMove")(js.undefined)
        ret
    }
  }
  
}

