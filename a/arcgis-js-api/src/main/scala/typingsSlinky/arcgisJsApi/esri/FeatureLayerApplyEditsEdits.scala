package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureLayerApplyEditsEdits extends Object {
  /**
    * An array of attachments to be added. Applies only when the `options.globalIdUsed` parameter is set to `true`. User must provide [globalId](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#AttachmentEdit)s for all attachments to be added.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#applyEdits)
    */
  var addAttachments: js.UndefOr[js.Array[AttachmentEdit]] = js.native
  /**
    * An array or a [collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of features to be added. Values of non nullable fields must be provided when adding new features. Date fields must have [numeric](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getTime) values representing universal time.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#applyEdits)
    */
  var addFeatures: js.UndefOr[js.Array[Graphic] | Collection[Graphic]] = js.native
  /**
    * An array of [globalId](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#AttachmentEdit)s for attachments to be deleted. Applies only when the `options.globalIdUsed` parameter is set to `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#applyEdits)
    */
  var deleteAttachments: js.UndefOr[js.Array[String]] = js.native
  /**
    * An array or a [collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of features, or an array of objects with `objectId` or `globalId` of each feature to be deleted. When an array or collection of features is passed, each feature must have a valid [objectId](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#objectIdField). When an array of objects is used, each object must have a valid value set for `objectId` or `globalId` property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#applyEdits)
    */
  var deleteFeatures: js.UndefOr[(js.Array[_ | Graphic]) | Collection[Graphic]] = js.native
  /**
    * An array of attachments to be updated. Applies only when the `options.globalIdUsed` parameter is set to `true`. User must provide [globalId](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#AttachmentEdit)s for all attachments to be updated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#applyEdits)
    */
  var updateAttachments: js.UndefOr[js.Array[AttachmentEdit]] = js.native
  /**
    * An array or a [collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of features to be updated. Each feature must have valid [objectId](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#objectIdField). Values of non nullable fields must be provided when updating features. Date fields must have [numeric](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getTime) values representing universal time.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#applyEdits)
    */
  var updateFeatures: js.UndefOr[js.Array[Graphic] | Collection[Graphic]] = js.native
}

object FeatureLayerApplyEditsEdits {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): FeatureLayerApplyEditsEdits = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[FeatureLayerApplyEditsEdits]
  }
  @scala.inline
  implicit class FeatureLayerApplyEditsEditsOps[Self <: FeatureLayerApplyEditsEdits] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddAttachments(value: js.Array[AttachmentEdit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addAttachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddAttachments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addAttachments")(js.undefined)
        ret
    }
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
    def withDeleteAttachments(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteAttachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteAttachments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteAttachments")(js.undefined)
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
    def withUpdateAttachments(value: js.Array[AttachmentEdit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateAttachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateAttachments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateAttachments")(js.undefined)
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

