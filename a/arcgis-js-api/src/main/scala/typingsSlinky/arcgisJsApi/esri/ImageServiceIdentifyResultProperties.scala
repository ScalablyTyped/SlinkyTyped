package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageServiceIdentifyResultProperties extends js.Object {
  /**
    * The set of visible areas for the identified catalog items. `CatalogItemVisibilities` are returned only when the image service source is a mosaic dataset. Each element in the array corresponds to the percentage contribution (to final mosaic in given extent) of the item in `catalogItems`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyResult.html#catalogItemVisibilities)
    */
  var catalogItemVisibilities: js.UndefOr[js.Array[Double]] = js.native
  /**
    * The set of catalog items that overlap the input geometry. Catalog Items are returned only when the image service source is a mosaic dataset.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyResult.html#catalogItems)
    */
  var catalogItems: js.UndefOr[FeatureSetProperties] = js.native
  /**
    * The identified location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyResult.html#location)
    */
  var location: js.UndefOr[PointProperties] = js.native
  /**
    * The identify property name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyResult.html#name)
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The identify property id.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyResult.html#objectId)
    */
  var objectId: js.UndefOr[Double] = js.native
  /**
    * The attributes of the identified object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyResult.html#properties)
    */
  var properties: js.UndefOr[js.Any] = js.native
  /**
    * The identify image service pixel value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyResult.html#value)
    */
  var value: js.UndefOr[String] = js.native
}

object ImageServiceIdentifyResultProperties {
  @scala.inline
  def apply(): ImageServiceIdentifyResultProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageServiceIdentifyResultProperties]
  }
  @scala.inline
  implicit class ImageServiceIdentifyResultPropertiesOps[Self <: ImageServiceIdentifyResultProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCatalogItemVisibilities(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("catalogItemVisibilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCatalogItemVisibilities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("catalogItemVisibilities")(js.undefined)
        ret
    }
    @scala.inline
    def withCatalogItems(value: FeatureSetProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("catalogItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCatalogItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("catalogItems")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: PointProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectId")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

