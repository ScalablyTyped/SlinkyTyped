package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditorProperties extends WidgetProperties {
  /**
    * An array of string values which specifies what end users are allowed to edit. For example, a feature layer with full editing privileges may be available. But you may only want the end user to have the ability to update existing features. Set the `allowedWorkflows` to only `update`.
    *
    * Possible Value | Description | Example
    * ---------------|------------|----------
    * create | Indicated in the widget via the `Add feature` option. This allows the end user to create new features in the feature service. | ![combinedcreate](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/editor_combined_create.png)
    * update | Indicated in the widget via the `Edit feature` option. This allows the end user to update and/or delete features in the feature service. | ![combinedupdate](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/editor_combined_update.png)
    *
    * > These workflows are only enabled if the feature service allows these operations. For example, if a feature service is only enabled to allow updates, `Add features` is not enabled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#allowedWorkflows)
    */
  var allowedWorkflows: js.UndefOr[js.Array[String]] = js.native
  /**
    * An array of editing configurations for individual layers.  If you have an editable feature layer but do not want the end user to do any type of editing, you can limit this by setting the `enabled` property to `false`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#layerInfos)
    */
  var layerInfos: js.UndefOr[js.Array[LayerInfo]] = js.native
  /**
    * This property allows customization of supporting Editor widgets and their default behavior. These widgets include [FeatureForm](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html), [FeatureTemplates](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html), and [Sketch](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html).
    * > This property is useful for basic overrides of the default widgets. There may be some limitations to what the Editor can do with these overridden properties. For example, the Editor will always disable the `multipleSelectionEnabled` property in [Sketch.defaultUpdateOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#defaultUpdateOptions) no matter what is set within this property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#supportingWidgetDefaults)
    */
  var supportingWidgetDefaults: js.UndefOr[SupportingWidgetDefaults] = js.native
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). This view provides the editable layers for the Editor widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#view)
    */
  var view: js.UndefOr[MapViewProperties] = js.native
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [EditorViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#viewModel)
    */
  var viewModel: js.UndefOr[EditorViewModelProperties] = js.native
}

object EditorProperties {
  @scala.inline
  def apply(): EditorProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorProperties]
  }
  @scala.inline
  implicit class EditorPropertiesOps[Self <: EditorProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedWorkflows(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedWorkflows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedWorkflows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedWorkflows")(js.undefined)
        ret
    }
    @scala.inline
    def withLayerInfos(value: js.Array[LayerInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerInfos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayerInfos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerInfos")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportingWidgetDefaults(value: SupportingWidgetDefaults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportingWidgetDefaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportingWidgetDefaults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportingWidgetDefaults")(js.undefined)
        ret
    }
    @scala.inline
    def withView(value: MapViewProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(js.undefined)
        ret
    }
    @scala.inline
    def withViewModel(value: EditorViewModelProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewModel")(js.undefined)
        ret
    }
  }
  
}

