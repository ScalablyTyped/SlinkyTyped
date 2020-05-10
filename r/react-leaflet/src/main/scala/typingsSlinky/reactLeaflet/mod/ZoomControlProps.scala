package typingsSlinky.reactLeaflet.mod

import typingsSlinky.leaflet.mod.ControlPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined leaflet.leaflet.Control.ZoomOptions & react-leaflet.react-leaflet.MapControlProps */
@js.native
trait ZoomControlProps extends js.Object {
  var leaflet: js.UndefOr[LeafletContext] = js.native
  var position: js.UndefOr[ControlPosition] = js.native
  var zoomInText: js.UndefOr[String] = js.native
  var zoomInTitle: js.UndefOr[String] = js.native
  var zoomOutText: js.UndefOr[String] = js.native
  var zoomOutTitle: js.UndefOr[String] = js.native
}

object ZoomControlProps {
  @scala.inline
  def apply(): ZoomControlProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoomControlProps]
  }
  @scala.inline
  implicit class ZoomControlPropsOps[Self <: ZoomControlProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLeaflet(value: LeafletContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaflet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeaflet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaflet")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: ControlPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomInText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomInText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomInText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomInText")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomInTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomInTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomInTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomInTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomOutText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomOutText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomOutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomOutText")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomOutTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomOutTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomOutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomOutTitle")(js.undefined)
        ret
    }
  }
  
}

