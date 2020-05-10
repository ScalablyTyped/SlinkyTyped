package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CSVLayerCapabilitiesEditing extends Object {
  /**
    * Indicates if anonymous users can delete features created by others.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsDeleteByAnonymous: Boolean = js.native
  /**
    * Indicates if logged in users can delete features created by others.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsDeleteByOthers: Boolean = js.native
  /**
    * Indicates if the geometry of the features in the layer can be edited.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsGeometryUpdate: Boolean = js.native
  /**
    * Indicates if the `globalid` values provided by the client are used in [applyEdits](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#applyEdits).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsGlobalId: Boolean = js.native
  /**
    * Indicates if the `rollbackOnFailure` parameter can be set to `true` or `false` when running the synchronizeReplica operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsRollbackOnFailure: Boolean = js.native
  /**
    * Indicates if anonymous users can update features created by others.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsUpdateByAnonymous: Boolean = js.native
  /**
    * Indicates if logged in users can update features created by others.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsUpdateByOthers: Boolean = js.native
  /**
    * Indicates if `m-values` must be provided when updating features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsUpdateWithoutM: Boolean = js.native
  /**
    * Indicates if the layer supports uploading attachments by [UploadId](https://developers.arcgis.com/rest/services-reference/item.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsUploadWithItemId: Boolean = js.native
}

object CSVLayerCapabilitiesEditing {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    supportsDeleteByAnonymous: Boolean,
    supportsDeleteByOthers: Boolean,
    supportsGeometryUpdate: Boolean,
    supportsGlobalId: Boolean,
    supportsRollbackOnFailure: Boolean,
    supportsUpdateByAnonymous: Boolean,
    supportsUpdateByOthers: Boolean,
    supportsUpdateWithoutM: Boolean,
    supportsUploadWithItemId: Boolean
  ): CSVLayerCapabilitiesEditing = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), supportsDeleteByAnonymous = supportsDeleteByAnonymous.asInstanceOf[js.Any], supportsDeleteByOthers = supportsDeleteByOthers.asInstanceOf[js.Any], supportsGeometryUpdate = supportsGeometryUpdate.asInstanceOf[js.Any], supportsGlobalId = supportsGlobalId.asInstanceOf[js.Any], supportsRollbackOnFailure = supportsRollbackOnFailure.asInstanceOf[js.Any], supportsUpdateByAnonymous = supportsUpdateByAnonymous.asInstanceOf[js.Any], supportsUpdateByOthers = supportsUpdateByOthers.asInstanceOf[js.Any], supportsUpdateWithoutM = supportsUpdateWithoutM.asInstanceOf[js.Any], supportsUploadWithItemId = supportsUploadWithItemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSVLayerCapabilitiesEditing]
  }
  @scala.inline
  implicit class CSVLayerCapabilitiesEditingOps[Self <: CSVLayerCapabilitiesEditing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSupportsDeleteByAnonymous(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsDeleteByAnonymous")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportsDeleteByOthers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsDeleteByOthers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportsGeometryUpdate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsGeometryUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportsGlobalId(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsGlobalId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportsRollbackOnFailure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsRollbackOnFailure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportsUpdateByAnonymous(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsUpdateByAnonymous")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportsUpdateByOthers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsUpdateByOthers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportsUpdateWithoutM(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsUpdateWithoutM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportsUploadWithItemId(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsUploadWithItemId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

