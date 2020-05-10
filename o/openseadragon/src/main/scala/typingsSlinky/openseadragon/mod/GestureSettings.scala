package typingsSlinky.openseadragon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GestureSettings extends js.Object {
  var clickToZoom: js.UndefOr[Boolean] = js.native
  var dblClickToZoom: js.UndefOr[Boolean] = js.native
  var flickEnabled: js.UndefOr[Boolean] = js.native
  var flickMinSpeed: js.UndefOr[Double] = js.native
  var flickMomentum: js.UndefOr[Double] = js.native
  var pinchToZoom: js.UndefOr[Boolean] = js.native
  var scrollToZoom: js.UndefOr[Boolean] = js.native
}

object GestureSettings {
  @scala.inline
  def apply(): GestureSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GestureSettings]
  }
  @scala.inline
  implicit class GestureSettingsOps[Self <: GestureSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClickToZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickToZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickToZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickToZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withDblClickToZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblClickToZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDblClickToZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblClickToZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withFlickEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flickEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlickEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flickEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withFlickMinSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flickMinSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlickMinSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flickMinSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withFlickMomentum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flickMomentum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlickMomentum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flickMomentum")(js.undefined)
        ret
    }
    @scala.inline
    def withPinchToZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinchToZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinchToZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinchToZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollToZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollToZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToZoom")(js.undefined)
        ret
    }
  }
  
}

