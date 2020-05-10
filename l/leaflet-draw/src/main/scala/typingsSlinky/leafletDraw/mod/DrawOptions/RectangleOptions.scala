package typingsSlinky.leafletDraw.mod.DrawOptions

import typingsSlinky.leaflet.mod.PathOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RectangleOptions extends SimpleShapeOptions {
  /**
    * Whether to use the metric measurement system or imperial
    *
    * @default true
    */
  var metric: js.UndefOr[Boolean] = js.native
  /**
    * The options used when drawing the rectangle on the map.
    *
    * @default {stroke: true, weight: 4, opacity: 0.5, fill: true, fillColor: null, fillOpacity: 0.2, showArea: true, clickable: true }
    */
  var shapeOptions: js.UndefOr[PathOptions] = js.native
}

object RectangleOptions {
  @scala.inline
  def apply(): RectangleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RectangleOptions]
  }
  @scala.inline
  implicit class RectangleOptionsOps[Self <: RectangleOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

