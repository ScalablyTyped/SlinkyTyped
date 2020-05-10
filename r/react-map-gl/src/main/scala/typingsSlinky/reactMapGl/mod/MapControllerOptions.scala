package typingsSlinky.reactMapGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapControllerOptions extends js.Object {
  var doubleClickZoom: js.UndefOr[Boolean] = js.native
  var dragPan: js.UndefOr[Boolean] = js.native
  var dragRotate: js.UndefOr[Boolean] = js.native
  var eventManager: js.UndefOr[js.Any] = js.native
  var isInteractive: Boolean = js.native
  var keyboard: js.UndefOr[Boolean] = js.native
  var onStateChange: js.UndefOr[js.Function1[/* state */ MapState, Unit]] = js.native
  var onViewportChange: js.UndefOr[ContextViewportChangeHandler] = js.native
  var scrollZoom: js.UndefOr[Boolean] = js.native
  var touchRotate: js.UndefOr[Boolean] = js.native
  var touchZoom: js.UndefOr[Boolean] = js.native
}

object MapControllerOptions {
  @scala.inline
  def apply(isInteractive: Boolean): MapControllerOptions = {
    val __obj = js.Dynamic.literal(isInteractive = isInteractive.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapControllerOptions]
  }
  @scala.inline
  implicit class MapControllerOptionsOps[Self <: MapControllerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsInteractive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInteractive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDoubleClickZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleClickZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoubleClickZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleClickZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withDragPan(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragPan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragPan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragPan")(js.undefined)
        ret
    }
    @scala.inline
    def withDragRotate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragRotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragRotate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragRotate")(js.undefined)
        ret
    }
    @scala.inline
    def withEventManager(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventManager: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventManager")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboard")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStateChange(value: /* state */ MapState => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStateChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnStateChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStateChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnViewportChange(
      value: (/* viewState */ ViewportProps, /* interactionState */ ExtraState, /* oldViewState */ ViewportProps) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onViewportChange")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnViewportChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onViewportChange")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchRotate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchRotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchRotate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchRotate")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchZoom")(js.undefined)
        ret
    }
  }
  
}

