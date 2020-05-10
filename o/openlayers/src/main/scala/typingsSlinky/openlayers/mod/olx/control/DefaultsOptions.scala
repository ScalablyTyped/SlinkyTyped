package typingsSlinky.openlayers.mod.olx.control

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultsOptions extends js.Object {
  var attribution: js.UndefOr[Boolean] = js.native
  var attributionOptions: js.UndefOr[AttributionOptions] = js.native
  var rotate: js.UndefOr[Boolean] = js.native
  var rotateOptions: js.UndefOr[RotateOptions] = js.native
  var zoom: js.UndefOr[Boolean] = js.native
  var zoomOptions: js.UndefOr[ZoomOptions] = js.native
}

object DefaultsOptions {
  @scala.inline
  def apply(): DefaultsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultsOptions]
  }
  @scala.inline
  implicit class DefaultsOptionsOps[Self <: DefaultsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttribution(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attribution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttribution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attribution")(js.undefined)
        ret
    }
    @scala.inline
    def withAttributionOptions(value: AttributionOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributionOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributionOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributionOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withRotate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(js.undefined)
        ret
    }
    @scala.inline
    def withRotateOptions(value: RotateOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotateOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withZoom(value: Boolean): Self = {
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
    def withZoomOptions(value: ZoomOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomOptions")(js.undefined)
        ret
    }
  }
  
}

