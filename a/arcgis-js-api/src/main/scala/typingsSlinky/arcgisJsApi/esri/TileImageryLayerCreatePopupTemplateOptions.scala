package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileImageryLayerCreatePopupTemplateOptions extends Object {
  /**
    * field types to ignore when creating the popup. By default the `geometry`, `blob`, `raster`, `guid` and `xml` field types are ignored.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileImageryLayer.html#createPopupTemplate)
    */
  var ignoreFieldTypes: js.UndefOr[js.Array[String]] = js.native
}

object TileImageryLayerCreatePopupTemplateOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): TileImageryLayerCreatePopupTemplateOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[TileImageryLayerCreatePopupTemplateOptions]
  }
  @scala.inline
  implicit class TileImageryLayerCreatePopupTemplateOptionsOps[Self <: TileImageryLayerCreatePopupTemplateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgnoreFieldTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreFieldTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreFieldTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreFieldTypes")(js.undefined)
        ret
    }
  }
  
}

