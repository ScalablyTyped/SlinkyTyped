package typingsSlinky.openlayers.mod.olx.interaction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MouseWheelZoomOptions extends js.Object {
  var constrainResolution: js.UndefOr[Boolean] = js.native
  var duration: js.UndefOr[Double] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var useAnchor: js.UndefOr[Boolean] = js.native
}

object MouseWheelZoomOptions {
  @scala.inline
  def apply(): MouseWheelZoomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MouseWheelZoomOptions]
  }
  @scala.inline
  implicit class MouseWheelZoomOptionsOps[Self <: MouseWheelZoomOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConstrainResolution(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrainResolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstrainResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrainResolution")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withUseAnchor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useAnchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useAnchor")(js.undefined)
        ret
    }
  }
  
}

