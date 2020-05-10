package typingsSlinky.reactSimpleMaps.mod

import org.scalajs.dom.raw.SVGGElement
import typingsSlinky.react.mod.SVGAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZoomableGroupProps extends SVGAttributes[SVGGElement] {
  /**
    * @default [0, 0]
    */
  var center: js.UndefOr[Point] = js.native
  /**
    * @default false
    */
  var disablePanning: js.UndefOr[Boolean] = js.native
  /**
    * @default false
    */
  var disableZooming: js.UndefOr[Boolean] = js.native
  /**
    * @default 5
    */
  var maxZoom: js.UndefOr[Double] = js.native
  /**
    * @default 1
    */
  var minZoom: js.UndefOr[Double] = js.native
  var onMoveEnd: js.UndefOr[js.Function2[/* event */ js.Any, /* position */ Position, Unit]] = js.native
  var onMoveStart: js.UndefOr[js.Function2[/* event */ js.Any, /* position */ Position, Unit]] = js.native
  var onZoomEnd: js.UndefOr[js.Function2[/* event */ js.Any, /* position */ Position, Unit]] = js.native
  var onZoomStart: js.UndefOr[js.Function2[/* event */ js.Any, /* position */ Position, Unit]] = js.native
  /**
    * @default 1
    */
  var zoom: js.UndefOr[Double] = js.native
  /**
    * @default 0.025
    */
  var zoomSensitivity: js.UndefOr[Double] = js.native
}

object ZoomableGroupProps {
  @scala.inline
  def apply(): ZoomableGroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoomableGroupProps]
  }
  @scala.inline
  implicit class ZoomableGroupPropsOps[Self <: ZoomableGroupProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCenter(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(js.undefined)
        ret
    }
    @scala.inline
    def withDisablePanning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disablePanning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisablePanning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disablePanning")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableZooming(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableZooming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableZooming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableZooming")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withMinZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMoveEnd(value: (/* event */ js.Any, /* position */ Position) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMoveEnd")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnMoveEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMoveEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMoveStart(value: (/* event */ js.Any, /* position */ Position) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMoveStart")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnMoveStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMoveStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnZoomEnd(value: (/* event */ js.Any, /* position */ Position) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onZoomEnd")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnZoomEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onZoomEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnZoomStart(value: (/* event */ js.Any, /* position */ Position) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onZoomStart")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnZoomStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onZoomStart")(js.undefined)
        ret
    }
    @scala.inline
    def withZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomSensitivity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomSensitivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomSensitivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomSensitivity")(js.undefined)
        ret
    }
  }
  
}

