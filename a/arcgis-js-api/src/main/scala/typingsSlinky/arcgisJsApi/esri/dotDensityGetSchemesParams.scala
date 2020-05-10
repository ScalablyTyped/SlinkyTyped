package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dotDensityGetSchemesParams extends Object {
  /**
    * The Esri basemap to pair with the visualization. This value indicates the best symbol colors for visualizing features against the given basemap. If you have a non-Esri basemap (e.g. a VectorTileLayer basemap with a custom style) or no basemap at all, then use the `basemapTheme` parameter instead of this parameter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-dotDensity.html#getSchemes)
    */
  var basemap: js.UndefOr[String | Basemap] = js.native
  /**
    * If you have a non-Esri basemap (e.g. a VectorTileLayer basemap with a custom style) or no basemap at all, use this parameter to indicate whether the background of the visualization is `light` or `dark`.  **Possible Values:** light | dark
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-dotDensity.html#getSchemes)
    */
  var basemapTheme: js.UndefOr[String] = js.native
  /**
    * The number of colors to visualize.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-dotDensity.html#getSchemes)
    */
  var numColors: Double = js.native
}

object dotDensityGetSchemesParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    numColors: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): dotDensityGetSchemesParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), numColors = numColors.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[dotDensityGetSchemesParams]
  }
  @scala.inline
  implicit class dotDensityGetSchemesParamsOps[Self <: dotDensityGetSchemesParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNumColors(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBasemap(value: String | Basemap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basemap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBasemap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basemap")(js.undefined)
        ret
    }
    @scala.inline
    def withBasemapTheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basemapTheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBasemapTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basemapTheme")(js.undefined)
        ret
    }
  }
  
}

