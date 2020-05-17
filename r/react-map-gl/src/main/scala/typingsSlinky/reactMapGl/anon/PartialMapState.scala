package typingsSlinky.reactMapGl.anon

import typingsSlinky.reactMapGl.mod.InteractiveState
import typingsSlinky.reactMapGl.mod.MapState
import typingsSlinky.reactMapGl.mod.MapStateProps
import typingsSlinky.reactMapGl.mod.PositionInput
import typingsSlinky.reactMapGl.mod.ViewportProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-map-gl.react-map-gl.MapState> */
@js.native
trait PartialMapState extends js.Object {
  var constructor: js.UndefOr[js.Function1[/* props */ MapStateProps, js.Any]] = js.native
  var getInteractiveState: js.UndefOr[js.Function0[InteractiveState]] = js.native
  var getViewportProps: js.UndefOr[js.Function0[ViewportProps]] = js.native
  var pan: js.UndefOr[js.Function1[/* input */ PositionInputstartPosnumb, MapState]] = js.native
  var panEnd: js.UndefOr[js.Function0[MapState]] = js.native
  var panStart: js.UndefOr[js.Function1[/* input */ PositionInput, MapState]] = js.native
  var rotate: js.UndefOr[js.Function1[/* input */ DeltaScaleX, MapState]] = js.native
  var rotateEnd: js.UndefOr[js.Function0[MapState]] = js.native
  var rotateStart: js.UndefOr[js.Function1[/* input */ PositionInput, MapState]] = js.native
  var zoom: js.UndefOr[js.Function1[/* input */ PositionInputscalenumbers, MapState]] = js.native
  var zoomEnd: js.UndefOr[js.Function0[MapState]] = js.native
  var zoomStart: js.UndefOr[js.Function1[/* input */ PositionInput, MapState]] = js.native
}

object PartialMapState {
  @scala.inline
  def apply(): PartialMapState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMapState]
  }
  @scala.inline
  implicit class PartialMapStateOps[Self <: PartialMapState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConstructor(value: /* props */ MapStateProps => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constructor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutConstructor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constructor")(js.undefined)
        ret
    }
    @scala.inline
    def withGetInteractiveState(value: () => InteractiveState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInteractiveState")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetInteractiveState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInteractiveState")(js.undefined)
        ret
    }
    @scala.inline
    def withGetViewportProps(value: () => ViewportProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getViewportProps")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetViewportProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getViewportProps")(js.undefined)
        ret
    }
    @scala.inline
    def withPan(value: /* input */ PositionInputstartPosnumb => MapState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pan")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pan")(js.undefined)
        ret
    }
    @scala.inline
    def withPanEnd(value: () => MapState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutPanEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withPanStart(value: /* input */ PositionInput => MapState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPanStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panStart")(js.undefined)
        ret
    }
    @scala.inline
    def withRotate(value: /* input */ DeltaScaleX => MapState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRotate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(js.undefined)
        ret
    }
    @scala.inline
    def withRotateEnd(value: () => MapState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRotateEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withRotateStart(value: /* input */ PositionInput => MapState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRotateStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateStart")(js.undefined)
        ret
    }
    @scala.inline
    def withZoom(value: /* input */ PositionInputscalenumbers => MapState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomEnd(value: () => MapState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutZoomEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomStart(value: /* input */ PositionInput => MapState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutZoomStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomStart")(js.undefined)
        ret
    }
  }
  
}

