package typingsSlinky.primereact.gmapMod

import org.scalajs.dom.raw.Event
import typingsSlinky.primereact.anon.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GMapProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var onMapClick: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onMapDragEnd: js.UndefOr[js.Function0[Unit]] = js.native
  var onMapReady: js.UndefOr[js.Function1[/* map */ js.Any, Unit]] = js.native
  var onOverlayClick: js.UndefOr[js.Function1[/* e */ Map, Unit]] = js.native
  var onOverlayDrag: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onOverlayDragEnd: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onOverlayDragStart: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onZoomChanged: js.UndefOr[js.Function0[Unit]] = js.native
  var options: js.UndefOr[js.Object] = js.native
  var overlays: js.UndefOr[js.Array[_]] = js.native
  var style: js.UndefOr[js.Object] = js.native
}

object GMapProps {
  @scala.inline
  def apply(): GMapProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GMapProps]
  }
  @scala.inline
  implicit class GMapPropsOps[Self <: GMapProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMapClick(value: /* event */ Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMapClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMapClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMapClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMapDragEnd(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMapDragEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnMapDragEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMapDragEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMapReady(value: /* map */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMapReady")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMapReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMapReady")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOverlayClick(value: /* e */ Map => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOverlayClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnOverlayClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOverlayClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOverlayDrag(value: /* event */ Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOverlayDrag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnOverlayDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOverlayDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOverlayDragEnd(value: /* event */ Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOverlayDragEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnOverlayDragEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOverlayDragEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOverlayDragStart(value: /* event */ Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOverlayDragStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnOverlayDragStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOverlayDragStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnZoomChanged(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onZoomChanged")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnZoomChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onZoomChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlays(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlays")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

