package typingsSlinky.gapiClientFusiontables.gapi.client.fusiontables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolygonStyle extends js.Object {
  /** Color of the interior of the polygon in #RRGGBB format. */
  var fillColor: js.UndefOr[String] = js.native
  /** Column-value, gradient, or bucket styler that is used to determine the interior color and opacity of the polygon. */
  var fillColorStyler: js.UndefOr[StyleFunction] = js.native
  /** Opacity of the interior of the polygon: 0.0 (transparent) to 1.0 (opaque). */
  var fillOpacity: js.UndefOr[Double] = js.native
  /** Color of the polygon border in #RRGGBB format. */
  var strokeColor: js.UndefOr[String] = js.native
  /** Column-value, gradient or buckets styler that is used to determine the border color and opacity. */
  var strokeColorStyler: js.UndefOr[StyleFunction] = js.native
  /** Opacity of the polygon border: 0.0 (transparent) to 1.0 (opaque). */
  var strokeOpacity: js.UndefOr[Double] = js.native
  /** Width of the polyon border in pixels. */
  var strokeWeight: js.UndefOr[Double] = js.native
  /** Column-value or bucket styler that is used to determine the width of the polygon border. */
  var strokeWeightStyler: js.UndefOr[StyleFunction] = js.native
}

object PolygonStyle {
  @scala.inline
  def apply(): PolygonStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolygonStyle]
  }
  @scala.inline
  implicit class PolygonStyleOps[Self <: PolygonStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withFillColorStyler(value: StyleFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillColorStyler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillColorStyler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillColorStyler")(js.undefined)
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
    def withStrokeColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeColor")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeColorStyler(value: StyleFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeColorStyler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeColorStyler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeColorStyler")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeWeightStyler(value: StyleFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWeightStyler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeWeightStyler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWeightStyler")(js.undefined)
        ret
    }
  }
  
}

