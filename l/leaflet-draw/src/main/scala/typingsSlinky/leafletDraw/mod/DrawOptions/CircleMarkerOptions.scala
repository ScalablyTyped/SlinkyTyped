package typingsSlinky.leafletDraw.mod.DrawOptions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CircleMarkerOptions extends js.Object {
  /**
    * Whether you can click the circle marker.
    *
    * @default true
    */
  var clickable: js.UndefOr[Boolean] = js.native
  /**
    * The stroke color of the circle marker.
    *
    * @default '#3388ff'
    */
  var color: js.UndefOr[String] = js.native
  /**
    * Whether to fill the circle marker with color.
    *
    * @default true
    */
  var fill: js.UndefOr[Boolean] = js.native
  /**
    * The fill color of the circle marker. Defaults to the value of the color option.
    *
    * @default null
    */
  var fillColor: js.UndefOr[String] = js.native
  /**
    * The opacity of the circle marker.
    *
    * @default 0.2
    */
  var fillOpacity: js.UndefOr[Double] = js.native
  /**
    * The stroke opacity of the circle marker.
    *
    * @default 0.5
    */
  var opacity: js.UndefOr[Double] = js.native
  /**
    * Whether to draw stroke around the circle marker.
    *
    * @default true
    */
  var stroke: js.UndefOr[Boolean] = js.native
  /**
    * The stroke width in pixels of the circle marker.
    *
    * @default 4
    */
  var weight: js.UndefOr[Double] = js.native
  /**
    * This should be a high number to ensure that you can draw over all other layers on the map.
    *
    * @default 2000
    */
  var zIndexOffset: js.UndefOr[Double] = js.native
}

object CircleMarkerOptions {
  @scala.inline
  def apply(): CircleMarkerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CircleMarkerOptions]
  }
  @scala.inline
  implicit class CircleMarkerOptionsOps[Self <: CircleMarkerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClickable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickable")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withFill(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def withFillColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillColor")(js.undefined)
        ret
    }
    @scala.inline
    def withFillOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withStroke(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(js.undefined)
        ret
    }
    @scala.inline
    def withWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(js.undefined)
        ret
    }
    @scala.inline
    def withZIndexOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndexOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndexOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndexOffset")(js.undefined)
        ret
    }
  }
  
}

