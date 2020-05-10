package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait typeRendererResult extends Object {
  /**
    * The ID of the basemap used to determine the optimal color scheme to represent the categorical variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-type.html#RendererResult)
    */
  var basemapId: String = js.native
  /**
    * Indicates whether the average color of the input view's basemap is `light` or `dark`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-type.html#RendererResult)
    */
  var basemapTheme: String = js.native
  /**
    * An array of objects describing the values or categories excluded from consideration in visualizing data from the given field. The specification of each object matches that of the objects specified in the `uniqueValueInfos` property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-type.html#RendererResult)
    */
  var excludedUniqueValueInfos: js.Array[_] = js.native
  /**
    * The renderer object configured to best match the given basemap. Set this on a layer's `renderer` property to update its visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-type.html#RendererResult)
    */
  var renderer: UniqueValueRenderer = js.native
  /**
    * The scheme used to represent each category within the `uniqueValueInfos`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-type.html#RendererResult)
    */
  var typeScheme: TypeScheme = js.native
  /**
    * An array of objects describing the value, symbol, and count of each unique type or category represented in the renderer. See the table below describing each property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-type.html#RendererResult)
    */
  var uniqueValueInfos: js.Array[typeUniqueValueInfo] = js.native
}

object typeRendererResult {
  @scala.inline
  def apply(
    basemapId: String,
    basemapTheme: String,
    constructor: js.Function,
    excludedUniqueValueInfos: js.Array[_],
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    renderer: UniqueValueRenderer,
    typeScheme: TypeScheme,
    uniqueValueInfos: js.Array[typeUniqueValueInfo]
  ): typeRendererResult = {
    val __obj = js.Dynamic.literal(basemapId = basemapId.asInstanceOf[js.Any], basemapTheme = basemapTheme.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], excludedUniqueValueInfos = excludedUniqueValueInfos.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), renderer = renderer.asInstanceOf[js.Any], typeScheme = typeScheme.asInstanceOf[js.Any], uniqueValueInfos = uniqueValueInfos.asInstanceOf[js.Any])
    __obj.asInstanceOf[typeRendererResult]
  }
  @scala.inline
  implicit class typeRendererResultOps[Self <: typeRendererResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBasemapId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basemapId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBasemapTheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basemapTheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcludedUniqueValueInfos(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedUniqueValueInfos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderer(value: UniqueValueRenderer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeScheme(value: TypeScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeScheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUniqueValueInfos(value: js.Array[typeUniqueValueInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueValueInfos")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

