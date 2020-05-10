package typingsSlinky.leaflet.mod.Control_

import typingsSlinky.leaflet.mod.ControlOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZoomOptions extends ControlOptions {
  var zoomInText: js.UndefOr[String] = js.native
  var zoomInTitle: js.UndefOr[String] = js.native
  var zoomOutText: js.UndefOr[String] = js.native
  var zoomOutTitle: js.UndefOr[String] = js.native
}

object ZoomOptions {
  @scala.inline
  def apply(): ZoomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoomOptions]
  }
  @scala.inline
  implicit class ZoomOptionsOps[Self <: ZoomOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

