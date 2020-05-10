package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VectorTileLayerCurrentStyleInfo extends Object {
  /**
    * Absolute template URL for font sets included in a style. The URL includes `{fontstack}` and `{range}` tokens.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#currentStyleInfo)
    */
  var glyphsUrl: String = js.native
  /**
    * Vector tile service information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#currentStyleInfo)
    */
  var layerDefinition: js.Any = js.native
  /**
    * Absolute URL for a vector tile service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#currentStyleInfo)
    */
  var serviceUrl: String = js.native
  /**
    * Absolute URL for sprites included in a style.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#currentStyleInfo)
    */
  var spriteUrl: String = js.native
  /**
    * Style JSON object for vector tiles. Style object includes `version` of the style specification, `sprite` and `glyphs` properties. It adheres to [version 8 of the Mapbox GL style specification](https://www.mapbox.com/mapbox-gl-js/style-spec/).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#currentStyleInfo)
    */
  var style: js.Any = js.native
  /**
    * Absolute URL for vector tile service style.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#currentStyleInfo)
    */
  var styleUrl: String = js.native
}

object VectorTileLayerCurrentStyleInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    glyphsUrl: String,
    hasOwnProperty: PropertyKey => Boolean,
    layerDefinition: js.Any,
    propertyIsEnumerable: PropertyKey => Boolean,
    serviceUrl: String,
    spriteUrl: String,
    style: js.Any,
    styleUrl: String
  ): VectorTileLayerCurrentStyleInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], glyphsUrl = glyphsUrl.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layerDefinition = layerDefinition.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), serviceUrl = serviceUrl.asInstanceOf[js.Any], spriteUrl = spriteUrl.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], styleUrl = styleUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[VectorTileLayerCurrentStyleInfo]
  }
  @scala.inline
  implicit class VectorTileLayerCurrentStyleInfoOps[Self <: VectorTileLayerCurrentStyleInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGlyphsUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyphsUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayerDefinition(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpriteUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spriteUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyleUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleUrl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

