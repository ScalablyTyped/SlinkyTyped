package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureLayerCapabilitiesMetadata extends Object {
  /**
    * Indicates whether to provide a user-defined field description. See [Describe attribute fields](https://doc.arcgis.com/en/arcgis-online/manage-data/describe-fields.htm) for additional information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsAdvancedFieldProperties: Boolean = js.native
}

object FeatureLayerCapabilitiesMetadata {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    supportsAdvancedFieldProperties: Boolean
  ): FeatureLayerCapabilitiesMetadata = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), supportsAdvancedFieldProperties = supportsAdvancedFieldProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureLayerCapabilitiesMetadata]
  }
  @scala.inline
  implicit class FeatureLayerCapabilitiesMetadataOps[Self <: FeatureLayerCapabilitiesMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSupportsAdvancedFieldProperties(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsAdvancedFieldProperties")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

