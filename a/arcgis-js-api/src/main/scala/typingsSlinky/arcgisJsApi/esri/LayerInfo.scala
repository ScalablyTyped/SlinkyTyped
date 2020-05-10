package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayerInfo extends Object {
  /**
    * Indicates whether to enable `Add feature` functionality. Defaults to `true` if service supports it.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#LayerInfo)
    */
  var addEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether to display the attachments widget in the Editor's UI. By default, this is `true`, if the service [supportsAttachment](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#LayerInfo)
    */
  var allowAttachments: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether to enable the ability to delete features. Defaults to `true` if service supports it.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#LayerInfo)
    */
  var deleteEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether to enable editing on the layer. Defaults to `true` if service supports it.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#LayerInfo)
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * The configuration options for displaying an array of fields within the widget. Take note that all fields except for `editor`, `globalID`, `objectID`, and system maintained area and length fields will be included. Otherwise, it is up to the developer to set the right field(s) to override and display.
    * > If this is set, in addition to overrides in the [supportingWidgetDefaults](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#supportingWidgetDefaults), the overrides specified in the [supportingWidgetDefaults](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#supportingWidgetDefaults) property take precedence.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#LayerInfo)
    */
  var fieldConfig: js.UndefOr[js.Array[FieldConfig]] = js.native
  /**
    * The associated feature layer containing the editable fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#LayerInfo)
    */
  var layer: FeatureLayer = js.native
  /**
    * Indicates whether to enable `Update feature` functionality. Defaults to `true` if service supports it.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#LayerInfo)
    */
  var updateEnabled: js.UndefOr[Boolean] = js.native
}

object LayerInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    layer: FeatureLayer,
    propertyIsEnumerable: PropertyKey => Boolean
  ): LayerInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[LayerInfo]
  }
  @scala.inline
  implicit class LayerInfoOps[Self <: LayerInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLayer(value: FeatureLayer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowAttachments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAttachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowAttachments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAttachments")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldConfig(value: js.Array[FieldConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateEnabled")(js.undefined)
        ret
    }
  }
  
}

