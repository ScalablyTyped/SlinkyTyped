package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapViewHighlightOptionsProperties extends Object {
  /**
    * The color of the highlight fill.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#highlightOptions)
    *
    * @default #00ffff
    */
  var color: js.UndefOr[Color_ | js.Array[Double] | String] = js.native
  /**
    * The opacity of the fill (area within the halo). This will be multiplied with the opacity specified in `color`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#highlightOptions)
    *
    * @default 0.25
    */
  var fillOpacity: js.UndefOr[Double] = js.native
  /**
    * The color of the halo surrounding the highlight. If no `haloColor` is provided, then the halo will be colored with the specified `color`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#highlightOptions)
    */
  var haloColor: js.UndefOr[Color_ | js.Array[Double] | String] = js.native
  /**
    * The opacity of the highlight halo. This will be multiplied with any opacity specified in `color`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#highlightOptions)
    *
    * @default 1
    */
  var haloOpacity: js.UndefOr[Double] = js.native
}

object MapViewHighlightOptionsProperties {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): MapViewHighlightOptionsProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[MapViewHighlightOptionsProperties]
  }
  @scala.inline
  implicit class MapViewHighlightOptionsPropertiesOps[Self <: MapViewHighlightOptionsProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: Color_ | js.Array[Double] | String): Self = {
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
    def withHaloColor(value: Color_ | js.Array[Double] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("haloColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHaloColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("haloColor")(js.undefined)
        ret
    }
    @scala.inline
    def withHaloOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("haloOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHaloOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("haloOpacity")(js.undefined)
        ret
    }
  }
  
}

