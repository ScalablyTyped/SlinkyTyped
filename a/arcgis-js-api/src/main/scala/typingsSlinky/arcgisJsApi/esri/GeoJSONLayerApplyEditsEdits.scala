package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoJSONLayerApplyEditsEdits extends Object {
  /**
    * An array or a [collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of features to be added. Values of non nullable fields must be provided when adding new features. Date fields must have [numeric](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getTime) values representing universal time.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#applyEdits)
    */
  var addFeatures: js.UndefOr[js.Array[Graphic] | Collection[Graphic]] = js.native
  /**
    * An array or a [collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of features, or objects to be deleted. When an array or collection of features is passed, each feature must have a valid [objectId](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#objectIdField). When an array of objects is used, each object must have a valid `objectId` property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#applyEdits)
    */
  var deleteFeatures: js.UndefOr[(js.Array[_ | Graphic]) | Collection[Graphic]] = js.native
  /**
    * An array or a [collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of features to be updated. Each feature must have valid [objectId](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#objectIdField). Values of non nullable fields must be provided when updating features. Date fields must have [numeric](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getTime) values representing universal time.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#applyEdits)
    */
  var updateFeatures: js.UndefOr[js.Array[Graphic] | Collection[Graphic]] = js.native
}

object GeoJSONLayerApplyEditsEdits {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): GeoJSONLayerApplyEditsEdits = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[GeoJSONLayerApplyEditsEdits]
  }
  @scala.inline
  implicit class GeoJSONLayerApplyEditsEditsOps[Self <: GeoJSONLayerApplyEditsEdits] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddFeatures(value: js.Array[Graphic] | Collection[Graphic]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addFeatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addFeatures")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteFeatures(value: (js.Array[_ | Graphic]) | Collection[Graphic]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteFeatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteFeatures")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateFeatures(value: js.Array[Graphic] | Collection[Graphic]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateFeatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateFeatures")(js.undefined)
        ret
    }
  }
  
}

