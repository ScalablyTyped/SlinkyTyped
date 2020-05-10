package typingsSlinky.leafletDraw.mod.DrawOptions

import typingsSlinky.leaflet.mod.PathOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CircleOptions extends SimpleShapeOptions {
  /**
    * When not metric, use feet instead of yards for display
    *
    * @default true
    */
  var feet: js.UndefOr[Boolean] = js.native
  /**
    * Whether to use the metric measurement system or imperial
    *
    * @default true
    */
  var metric: js.UndefOr[Boolean] = js.native
  /**
    * When not metric, not feet use nautic mile for display
    *
    * @default false
    */
  var nautic: js.UndefOr[Boolean] = js.native
  /**
    * The options used when drawing the circle on the map.
    *
    * @default { stroke: true, color: '#3388ff', weight: 4, opacity: 0.5, fill: true, fillColor: null, fillOpacity: 0.2, clickable: true }
    */
  var shapeOptions: js.UndefOr[PathOptions] = js.native
  /**
    * Whether to show the radius in the tooltip
    *
    * @default true
    */
  var showRadius: js.UndefOr[Boolean] = js.native
}

object CircleOptions {
  @scala.inline
  def apply(): CircleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CircleOptions]
  }
  @scala.inline
  implicit class CircleOptionsOps[Self <: CircleOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feet")(js.undefined)
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
    def withNautic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nautic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNautic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nautic")(js.undefined)
        ret
    }
    @scala.inline
    def withShapeOptions(value: PathOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShapeOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withShowRadius(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRadius")(js.undefined)
        ret
    }
  }
  
}

