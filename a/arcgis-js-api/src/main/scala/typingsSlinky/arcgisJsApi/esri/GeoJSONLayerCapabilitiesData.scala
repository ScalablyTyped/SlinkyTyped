package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoJSONLayerCapabilitiesData extends Object {
  /**
    * Indicates if the attachment is enabled on the layer. At this current time, the GeoJSONLayer doesn’t support attachments.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var supportsAttachment: Boolean = js.native
  /**
    * Indicates if the features in the layer support m-values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var supportsM: Boolean = js.native
  /**
    * Indicates if the features in the layer support z-values. See [elevationInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#elevationInfo) for details regarding placement and rendering of features with z-values in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var supportsZ: Boolean = js.native
}

object GeoJSONLayerCapabilitiesData {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    supportsAttachment: Boolean,
    supportsM: Boolean,
    supportsZ: Boolean
  ): GeoJSONLayerCapabilitiesData = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), supportsAttachment = supportsAttachment.asInstanceOf[js.Any], supportsM = supportsM.asInstanceOf[js.Any], supportsZ = supportsZ.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoJSONLayerCapabilitiesData]
  }
  @scala.inline
  implicit class GeoJSONLayerCapabilitiesDataOps[Self <: GeoJSONLayerCapabilitiesData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSupportsAttachment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsAttachment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportsM(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportsZ(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsZ")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

