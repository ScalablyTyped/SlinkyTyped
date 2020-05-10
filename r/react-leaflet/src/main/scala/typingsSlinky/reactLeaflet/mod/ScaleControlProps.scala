package typingsSlinky.reactLeaflet.mod

import typingsSlinky.leaflet.mod.ControlPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined leaflet.leaflet.Control.ScaleOptions & react-leaflet.react-leaflet.MapControlProps */
@js.native
trait ScaleControlProps extends js.Object {
  var imperial: js.UndefOr[Boolean] = js.native
  var leaflet: js.UndefOr[LeafletContext] = js.native
  var maxWidth: js.UndefOr[Double] = js.native
  var metric: js.UndefOr[Boolean] = js.native
  var position: js.UndefOr[ControlPosition] = js.native
  var updateWhenIdle: js.UndefOr[Boolean] = js.native
}

object ScaleControlProps {
  @scala.inline
  def apply(): ScaleControlProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScaleControlProps]
  }
  @scala.inline
  implicit class ScaleControlPropsOps[Self <: ScaleControlProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImperial(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imperial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImperial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imperial")(js.undefined)
        ret
    }
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
    def withMaxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMetric(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetric: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metric")(js.undefined)
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
    def withUpdateWhenIdle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateWhenIdle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateWhenIdle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateWhenIdle")(js.undefined)
        ret
    }
  }
  
}

