package typingsSlinky.heatmapJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeatmapOverlayConfiguration[V /* <: String */, TLat /* <: String */, TLong /* <: String */] extends BaseHeatmapConfiguration[V] {
  /**
    * The property name of your latitude coordinate in a datapoint
    * Default value: 'x'
    */
  var latField: js.UndefOr[TLat] = js.native
  /**
    * The property name of your longitude coordinate in a datapoint
    * Default value: 'y'
    */
  var lngField: js.UndefOr[TLong] = js.native
}

object HeatmapOverlayConfiguration {
  @scala.inline
  def apply[V, TLat, TLong](): HeatmapOverlayConfiguration[V, TLat, TLong] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeatmapOverlayConfiguration[V, TLat, TLong]]
  }
  @scala.inline
  implicit class HeatmapOverlayConfigurationOps[Self[v, tlat, tlong] <: HeatmapOverlayConfiguration[v, tlat, tlong], V, TLat, TLong] (val x: Self[V, TLat, TLong]) extends AnyVal {
    @scala.inline
    def duplicate: Self[V, TLat, TLong] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[V, TLat, TLong]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[V, TLat, TLong]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[V, TLat, TLong]) with Other]
    @scala.inline
    def withLatField(value: TLat): Self[V, TLat, TLong] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatField: Self[V, TLat, TLong] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latField")(js.undefined)
        ret
    }
    @scala.inline
    def withLngField(value: TLong): Self[V, TLat, TLong] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lngField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLngField: Self[V, TLat, TLong] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lngField")(js.undefined)
        ret
    }
  }
  
}

